package net.ibizsys.central.cloud.ai.core.addin;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.cloudutil.ICloudAIUtilRuntime;
import net.ibizsys.central.cloud.core.util.ConfigEntityEx;
import net.ibizsys.central.cloud.core.util.domain.AIAccess;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatFunction;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.ChatMessageRole;
import net.ibizsys.central.cloud.core.util.domain.ChatTool;
import net.ibizsys.central.cloud.core.util.domain.CompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.CompletionResult;
import net.ibizsys.central.cloud.core.util.domain.Embedding;
import net.ibizsys.central.cloud.core.util.domain.EmbeddingRequest;
import net.ibizsys.central.cloud.core.util.domain.EmbeddingResult;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.DateUtils;
import net.ibizsys.runtime.util.JsonUtils;

public abstract class OpenAIAccessAgentBase extends AIAccessAgentBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(OpenAIAccessAgentBase.class);

	public final static String MODEL_DEFAULT = "Qwen/Qwen2.5-32B-Instruct";
	// public final static String MODEL_DEFAULT = "deepseek-ai/DeepSeek-V3";

	public final static String EMBEDDINGMODEL_DEFAULT = "BAAI/bge-large-zh-v1.5";

	public final static String TOOL_CALL_BEGIN = "<tool_call>";

	public final static String TOOL_CALL_END = "</tool_call>";

	public final static String UX_TOOL_CALL_BEGIN = "```tool_call";

	public final static String THINK_BEGIN = "<think>";

	public final static String THINK_END = "</think>";

	protected final static Pattern thinkPattern = Pattern.compile("(?m)^</think>\\s*");

	protected final static Pattern toolCallPattern = Pattern.compile("(?m)^```tool_call");
	protected final static Pattern toolCallBodyPattern = Pattern.compile("(?m)^```tool_call\\s*\\n([\\s\\S]*?)\\s*\\n```");



	private Deque<String> tokenDeque = new ArrayDeque<String>();
	
	@Override
	protected void onInit() throws Exception {
		
		if(!ObjectUtils.isEmpty(this.getAgentData().getAccessToken())) {
			List list = Arrays.asList(this.getAgentData().getAccessToken().toString().split("[,]"));
			tokenDeque.addAll(list);
		}
		
		super.onInit();

	}

	@Override
	protected void runAuthTimer() {
		// super.runAuthTimer();
	}

	@Override
	public String getName() {
		return ICloudAIUtilRuntime.AIPLATFORM_OPENAI;
	}
	

	
	protected String getAccessToken() {
		String strAccessToken = null;
		synchronized (this.tokenDeque) {
			strAccessToken = this.tokenDeque.pollFirst();
			if(StringUtils.hasLength(strAccessToken)) {
				this.tokenDeque.addLast(strAccessToken);
			}	
		}
		return strAccessToken;
	}

	@Override
	protected EmbeddingResult onEmbedding(EmbeddingRequest completionRequest) throws Throwable {

		String strServiceUrl = getEmbeddingServiceUrl();
		try (CloseableHttpClient httpClient = HttpClients.createDefault()) {

			HttpPost request = new HttpPost(strServiceUrl);
			request.addHeader(new BasicHeader("Authorization", String.format("Bearer %1$s", this.getAccessToken())));

			Map<String, Object> body = new LinkedHashMap<String, Object>();
			body.put("model", StringUtils.hasLength(this.getAgentData().getEmbeddingModel()) ? this.getAgentData().getEmbeddingModel() : EMBEDDINGMODEL_DEFAULT);
			body.put("prompt", completionRequest.getContent());
			String strBody = JsonUtils.toString(body);

			StringEntity entity = new StringEntity(strBody, ContentType.create(ContentType.APPLICATION_JSON.getMimeType(), "UTF-8"));
			request.setEntity(entity);
			//
			HttpResponse response = httpClient.execute(request);
			int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode == 200) {

				HttpEntity responseEntity = response.getEntity();
				String responseBody = EntityUtils.toString(responseEntity);

				EmbeddingResult embeddingResult = new EmbeddingResult();

				List<Embedding> embeddingList = new ArrayList<Embedding>();

				if (!ObjectUtils.isEmpty(responseBody)) {
					Embedding embedding = JsonUtils.as(responseBody, Embedding.class);
					embeddingList.add(embedding);
				}

				embeddingResult.setData(embeddingList);

				return embeddingResult;
			} else {
				throw new Exception(String.format("请求发生异常，%1$s", response.getStatusLine().getStatusCode()));
			}
		}
	}
	
	protected String getEmbeddingServiceUrl() {
		return String.format("%1$s/v1/embeddings", this.getAgentData().getServiceUrl());
	}
	
	protected String getCompletionsServiceUrl() {
		return String.format("%1$s/v1/chat/completions", this.getAgentData().getServiceUrl());
	}

	protected String getChatCompletionDataPrefix() {
		return "data:";
	}

	@Override
	protected ChatCompletionResult onChatCompletion(ChatCompletionRequest chatCompletionRequest) throws Throwable {
		
		boolean bEnableTools = DataTypeUtils.asBoolean(this.getAgentData().getTools(), false);
		boolean bToolExceed = false;
		if(!testLoopCall(this.getToolMaxCalls())) {
			if(bEnableTools) {
				bToolExceed = true;
			}
			else {
				ChatMessage chatMessage = new ChatMessage();
				chatMessage.setRole(ChatMessageRole.ASSISTANT.getValue());
				chatMessage.setContent(this.getToolExceedMessage());
				ChatCompletionResult chatCompletionResult = new ChatCompletionResult();
				chatCompletionResult.setChoices(Arrays.asList(chatMessage));
				return chatCompletionResult;
			}
		}

		
		final String strRemoveThink = this.getAgentData().getRemoveThink();
		final String strStream = this.getAgentData().getStream();
		boolean bRemoveInputThink = "all".equalsIgnoreCase(strRemoveThink) || "input".equalsIgnoreCase(strRemoveThink);
		boolean bRemoveOutputThink = "all".equalsIgnoreCase(strRemoveThink) || "output".equalsIgnoreCase(strRemoveThink);
		
		List<Map> historyList = new ArrayList<Map>();
		if (!ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
			for (int i = 0; i < chatCompletionRequest.getMessages().size(); i++) {
				ChatMessage message = chatCompletionRequest.getMessages().get(i);
				if (!StringUtils.hasLength(message.getRole())) {
					continue;
				}
				
				Map<String, Object> history = new LinkedHashMap<String, Object>();
				history.put("role", message.getRole().toLowerCase());
				
				Object tool_calls = message.get("tool_calls");
				if(tool_calls != null) {
					history.put("tool_calls", tool_calls);
					if(StringUtils.hasLength(message.getContent())) {
						history.put("content", message.getContent());
					}
				}
				else {
					if(bRemoveInputThink) {
						history.put("content", extractRealContent(message.getContent()));
					}
					else {
						history.put("content", message.getContent());
					}
					
					if (message.getRole().equals(ChatMessageRole.TOOL.getValue())) {
						if (!bEnableTools) {
							continue;
						}
						if (StringUtils.hasLength(message.getToolCallId())) {
							history.put("tool_call_id", message.getToolCallId());
						} else if (StringUtils.hasLength(message.getToolName())) {
							history.put("tool_call_id", message.getToolName());
						}
					}
				}
				
				historyList.add(history);
			}
		}

		if (ObjectUtils.isEmpty(historyList)) {
			throw new Exception("未传入查询内容");
		}

		boolean bStream = DataTypeUtils.asBoolean(chatCompletionRequest.getStreaming(), true);
		if(StringUtils.hasLength(strStream)) {
			if("true".equalsIgnoreCase(strStream)) {
				if(!bStream) {
					//默认非流模式，设置移除输出思考内容
					bRemoveOutputThink = true;
				}
				bStream = true;
			}
			else
				if("false".equalsIgnoreCase(strStream)) {
					bStream = false;
				}
		}

//		if(bToolExceed) {
//			//临时关闭ToolCall
//			bEnableTools = false;
//		}
		
		String strServiceUrl = this.getCompletionsServiceUrl();
		try (CloseableHttpClient httpClient = HttpClients.createDefault()) {

			ActionSession actionSession = ActionSessionManager.getCurrentSession();

			HttpPost request = new HttpPost(strServiceUrl);
			request.addHeader(new BasicHeader("Authorization", String.format("Bearer %1$s", this.getAccessToken())));

			Map<String, Object> body = new LinkedHashMap<String, Object>();
			body.put("messages", historyList);
			body.put("model", StringUtils.hasLength(this.getAgentData().getModel()) ? this.getAgentData().getModel() : MODEL_DEFAULT);
			body.put("stream", bStream);
			if (bEnableTools) {
				List<ChatTool> tools = null;
				if (!ObjectUtils.isEmpty(chatCompletionRequest.getTools())) {
					String strTools = JsonUtils.toString(chatCompletionRequest.getTools());
					tools = JsonUtils.as(strTools, ChatToolListType);
					for (ChatTool chatTool : tools) {
						chatTool.getFunction().resetService();
					}
				}
				
				List<String> mcpServers = chatCompletionRequest.getMcpServers();
				if(!ObjectUtils.isEmpty(mcpServers)) {
					if(tools == null) {
						tools = new ArrayList<ChatTool>();
					}
					for(String strMcpServerId : mcpServers) {
						try {
							if(strMcpServerId.indexOf("@") != -1) {
								String[] items = strMcpServerId.split("[@]");
								strMcpServerId = items[1];
							}
							IMcpServerAgent iMcpServerAgent = this.getContext().getMcpServerAgent(strMcpServerId);
							List<ChatTool> mcpServerToolList = iMcpServerAgent.getTools();
							if(!ObjectUtils.isEmpty(mcpServerToolList)) {
								tools.addAll(mcpServerToolList);
							}
						}
						catch (Throwable ex) {
							log.error(ex);
						}
					}
				}
				
				mcpServers = this.getMcpServers();
				if(!ObjectUtils.isEmpty(mcpServers)) {
					if(tools == null) {
						tools = new ArrayList<ChatTool>();
					}
					for(String strMcpServerId : mcpServers) {
						try {
							if(strMcpServerId.indexOf("@") != -1) {
								String[] items = strMcpServerId.split("[@]");
								strMcpServerId = items[1];
							}
							IMcpServerAgent iMcpServerAgent = this.getContext().getMcpServerAgent(strMcpServerId);
							List<ChatTool> mcpServerToolList = iMcpServerAgent.getTools();
							if(!ObjectUtils.isEmpty(mcpServerToolList)) {
								tools.addAll(mcpServerToolList);
							}
						}
						catch (Throwable ex) {
							log.error(ex);
						}
					}
				}
				if(!ObjectUtils.isEmpty(tools)) {
					body.put("tools", tools);
				}
			}

			Map<String, Object> options = new LinkedHashMap<String, Object>();

			if (chatCompletionRequest.getTemperature() != null) {
				options.put("temperature", chatCompletionRequest.getTemperature());
			} else if (this.getAgentData().getTemperature() != null) {
				options.put("temperature", this.getAgentData().getTemperature());
			}

			if (chatCompletionRequest.getMaxTokens() != null) {
				options.put("max_tokens", chatCompletionRequest.getMaxTokens());
			} else if (this.getAgentData().getMaxTokens() != null) {
				options.put("max_tokens", this.getAgentData().getMaxTokens());
			}

			if (options.size() > 0) {
				body.put("options", options);
			}
			
			this.onFillChatCompletionBody(chatCompletionRequest, body);
			

			String strBody = JsonUtils.toString(body);

			StringEntity entity = new StringEntity(strBody, ContentType.create(ContentType.APPLICATION_JSON.getMimeType(), "UTF-8"));
			request.setEntity(entity);

			//
			HttpResponse response = httpClient.execute(request);
			int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode == 200) {

				final List<ChatMessage> retMessageList = new ArrayList<>();

				HttpEntity responseEntity = response.getEntity();
				if (bStream) {
					// 读取响应实体内容
					try (BufferedReader reader = new BufferedReader(new InputStreamReader(responseEntity.getContent()))) {
						// 读取每行事件数据
						StringBuilder sb = new StringBuilder();
						StringBuilder thinkSb = new StringBuilder();
						String strRole = null;
						//Map<String, Object> functionMap = null;
						Map<Integer, Map> functionMap = null;
						Map<String, Object> toolCalls = null;
						Map<String, String> toolCallIdMap = null;
						String line;
						// boolean first = true;
						boolean tool_call = false;
						boolean think = false;
						boolean hasThinkContent = false;
						while ((line = reader.readLine()) != null) {
							if (!StringUtils.hasLength(line)) {
								continue;
							}
							log.debug(line);
							if (line.indexOf(getChatCompletionDataPrefix()) == 0) {
								line = line.substring(getChatCompletionDataPrefix().length()).trim();
								if (line.equals("[DONE]")) {
									break;
								}
							} else {
								throw new Exception("返回内容格式不正确");
							}

							// 处理事件数据
							Map ret = JsonUtils.asMap(line);
							Object done = ret.get("done");

							if (!DataTypeUtils.asBoolean(done, false)) {
								Object choices = ret.get("choices");
								Object message = null;
								if (choices instanceof List) {
									List choiceList = (List) choices;
									if (choiceList.size() > 0) {
										message = choiceList.get(0);
									}
								}

								if (message instanceof Map) {
									Map map = (Map) message;
									Map deltaMap = map;
									if (map.get("delta") != null) {
										deltaMap = (Map) map.get("delta");
									}

									if (deltaMap.containsKey("role")) {
										strRole = (String) deltaMap.get("role");
									}
									String strFinishReason = (String) map.get("finish_reason");
									if("stop".equals(strFinishReason)) {
										break;
									}
									Object tool_calls = deltaMap.get("tool_calls");
									// if(tool_call) {
									if (!ObjectUtils.isEmpty(tool_calls) || "tool_calls".equals(strFinishReason)) {
										if ("tool_calls".equals(strFinishReason) && functionMap != null) {

										} else {
											if(functionMap == null) {
												functionMap = new HashMap<Integer, Map>();
											}
											
											if (tool_calls instanceof List) {
												List toolCallList = (List) tool_calls;
												if (toolCallList.size() > 0) {
													for(Object item : toolCallList) {
														if(!(item instanceof Map)) {
															continue;
														}
														
														Map toolCallMap = (Map) item;
														int nIndex = DataTypeUtils.asInteger(toolCallMap.get("index"), -1);
														if(nIndex == -1) {
															continue;
														}
														
														Map function = (Map)toolCallMap.get("function");
														if(function == null) {
															continue;
														}
														
														String strId = DataTypeUtils.asString(toolCallMap.get("id"), null);
														String strType = DataTypeUtils.asString(toolCallMap.get("type"), null);
														
														Map lastFunction = functionMap.get(nIndex);
														if(lastFunction == null) {
															functionMap.put(nIndex, function);
															lastFunction = function;
														}
														else {
															//进行合并
															String arguments = (String) function.get("arguments");
															if (StringUtils.hasLength(arguments)) {
																String strLast = (String) lastFunction.get("arguments");
																if (!StringUtils.hasLength(strLast)) {
																	strLast = "";
																}
																if (arguments.equals("}")) {
																	try {
																		if (StringUtils.hasLength(strLast)) {
																			lastFunction.put("arguments", JsonUtils.toObjectNode(strLast));
																		} else {
																			lastFunction.put("arguments", null);
																		}
																		functionMap = null;
																	}
																	catch (Throwable ex) {
																		log.error(String.format("解析内容发生异常，执行兼容处理，%1$s", ex.getMessage()));
																		strLast += arguments;
																		lastFunction.put("arguments", strLast);
																	}
																} else {
																	strLast += arguments;
																	lastFunction.put("arguments", strLast);
																}
															}
														}
														
														if(StringUtils.hasLength(strId)) {
															lastFunction.put("id", strId);
														}
														
														if (toolCalls == null) {
															toolCalls = new LinkedHashMap<String, Object>();
															toolCallIdMap = new LinkedHashMap<String, String>();
														}
														toolCalls.put((String) lastFunction.get("name"), lastFunction.get("arguments"));
														toolCallIdMap.put((String) lastFunction.get("name"), (String) lastFunction.get("id"));
													}
												}
											}
										}

									} else {
										String strContent = (String) deltaMap.get("content");
										if (StringUtils.hasLength(strContent)) {
											if (think) {
												think = false;
												strContent = "\n</think>\n" + strContent;
												if(strContent.indexOf("\n</think>\n</think>") == 0) {
													//截取第一个结束符号
													strContent = strContent.substring(9);
												}
												
											} else if (!tool_call) {
												tool_call = strContent.indexOf("<tool_call>") == 0;
											}
										} else {
											String strThink = (String) deltaMap.get("reasoning_content");
											if (StringUtils.hasLength(strThink)) {
												thinkSb.append(strThink);
												if (!think) {
													think = true;
													hasThinkContent = true;
													strContent = "\n<think>\n";
												}
												if (strContent == null) {
													strContent = strThink;
												} else {
													strContent += strThink;
												}
												
											}
										}
										if (!ObjectUtils.isEmpty(strRole) && !ObjectUtils.isEmpty(strContent)) {
											if (!tool_call) {
												sb.append(strContent);
											}
											if (actionSession != null) {
												if (tool_call) {

												} else {
													actionSession.updateActionStep(strContent, sb.toString());
												}
											}
										} else {
											log.error(String.format("返回内容无效"));
										}
									}
								}

							} else {
								break;
							}
						}

						if (think && hasThinkContent) {
							think = false;
							if(sb.toString().indexOf("</think>") == -1) {
								String strContent = "\n</think>\n";
								sb.append(strContent);
								if (actionSession != null) {
									actionSession.updateActionStep(strContent, sb.toString());
								}
							}
						}

						String strContent = sb.toString();
						if (!ObjectUtils.isEmpty(strRole) && (!ObjectUtils.isEmpty(strContent) || toolCalls != null)) {
							if (!bEnableTools) {
								// 判断是否有自定义调用指令
								if (toolCallPattern.matcher(strContent).find()) {
									String strRealContent = hasThinkContent? extractRealContent(strContent):strContent;
									List<String> toolCallList = extractToolCallContent(strRealContent);
									if(!ObjectUtils.isEmpty(toolCallList)) {
										return this.doChatCompletionToolCall(actionSession, chatCompletionRequest, strContent, strRealContent, toolCallList);
									}
								}
							}
							if (toolCalls != null) {
								List<Map> functionList = new ArrayList<Map>();
								for(java.util.Map.Entry<Integer, Map> entry : functionMap.entrySet()) {
									Map<String, Object> item = new LinkedHashMap<String, Object>();
									item.put("index", entry.getKey());
									item.put("type", "function");
									item.put("id", entry.getValue().get("id"));
									item.put("function", entry.getValue());
									functionList.add(item);
								}
								
								return this.doChatCompletionToolCall(actionSession, chatCompletionRequest, thinkSb.toString(), toolCalls, toolCallIdMap, functionList);
							} else {
								ChatMessage chatMessage = new ChatMessage();
								chatMessage.setRole(strRole.toUpperCase());
								if(bRemoveOutputThink) {
									chatMessage.setContent(hasThinkContent? extractRealContent(strContent):strContent);
								}
								else {
									chatMessage.setContent(strContent);
								}
								
								retMessageList.add(chatMessage);
							}

						} else {
							log.error(String.format("返回内容无效"));
						}
					}

				} else {
					String responseBody = EntityUtils.toString(responseEntity);

					// 解析
					Map ret = JsonUtils.asMap(responseBody);
					Object choices = ret.get("choices");
					Object message = null;
					if (choices instanceof List) {
						List choiceList = (List) choices;
						if (choiceList.size() > 0) {
							Object choice = choiceList.get(0);
							if (choice instanceof Map) {
								message = ((Map) choice).get("message");
							}
						}
					}

					if (message instanceof Map) {
						Map map = (Map) message;
						String strRole = (String) map.get("role");
						String strContent = (String) map.get("content");
						Object tool_calls = map.get("tool_calls");
						if (ObjectUtils.isEmpty(strRole) || (ObjectUtils.isEmpty(strContent) && ObjectUtils.isEmpty(tool_calls))) {
							log.error(String.format("返回内容无效"));
						} else {
							if (tool_calls != null) {
								List list = (List) tool_calls;
								Map<String, Object> toolCalls = new LinkedHashMap<String, Object>();
								Map<String, String> toolCallIdMap = new LinkedHashMap<String, String>();
								for (Object item : list) {
									Map toolCallMap = (Map) item;
									Map<String, Object> functionMap2 = (Map) toolCallMap.get("function");
									if (functionMap2 != null) {
										String func_name = (String) functionMap2.get("name");
										Object arguments = functionMap2.get("arguments");
										toolCalls.put(func_name, arguments);
										toolCallIdMap.put(func_name, (String) toolCallMap.get("id"));
									}
								}
								strContent = extractRealContent(strContent);
								return this.doChatCompletionToolCall(null, chatCompletionRequest, strContent, toolCalls, toolCallIdMap, (List)list);

							} else {
								boolean tool_call = strContent.indexOf("<tool_call>") != -1;
								if (tool_call) {
									return this.doChatCompletionToolCall(null, chatCompletionRequest, strContent);
								} else {
									ChatMessage chatMessage = new ChatMessage();
									chatMessage.setRole(strRole.toUpperCase());
									chatMessage.setContent(extractRealContent(strContent));
									retMessageList.add(chatMessage);
								}
							}
						}
					}

					if (ObjectUtils.isEmpty(retMessageList)) {
						log.error(String.format("无法解析消息内容，返回内容：\r\n%1$s", responseBody));
						throw new Exception(String.format("无法解析消息内容，返回内容：\r\n%1$s", responseBody));
					}
				}

				if (ObjectUtils.isEmpty(retMessageList)) {
					throw new Exception(String.format("未返回任何内容"));
				}

				ChatCompletionResult chatCompletionResult = new ChatCompletionResult();
				chatCompletionResult.setChoices(retMessageList);
				return chatCompletionResult;

			} else {
				throw new Exception(String.format("请求发生异常，%1$s", response.getStatusLine().getStatusCode()));
			}

		}
	}
	
	/**
	 * 填充聊天交互请求Body
	 * @param chatCompletionRequest
	 * @param body
	 * @throws Exception
	 */
	protected void onFillChatCompletionBody(ChatCompletionRequest chatCompletionRequest, Map<String, Object> body) throws Exception{
		
	}
	

	protected ChatCompletionResult doChatCompletionToolCall(ActionSession actionSession, ChatCompletionRequest chatCompletionRequest, String strContent) throws Throwable {
		Map<String, Object> toolCalls = this.getToolCalls(strContent);
		Map<String, String> toolCallIdMap = new LinkedHashMap<String, String>();
		// strContent = getRealContent(strContent);
		return this.doChatCompletionToolCall(actionSession, chatCompletionRequest, strContent, toolCalls, toolCallIdMap, null);
	}

	protected ChatCompletionResult doChatCompletionToolCall(ActionSession actionSession, ChatCompletionRequest chatCompletionRequest, String strContent, Map<String, Object> toolCalls, Map<String, String> toolCallIdMap, List<Map> functionList) throws Throwable {
		// 分解
		List<ChatMessage> list = new ArrayList<ChatMessage>();
		if (chatCompletionRequest.getMessages() != null) {
			list.addAll(chatCompletionRequest.getMessages());
		}

		//重新分析工具调用数据，调整
		if(!ObjectUtils.isEmpty(toolCalls)) {
			for(String strFunction : toolCalls.keySet()) {
				Object value = toolCalls.get(strFunction);
				if(ObjectUtils.isEmpty(value)) {
					continue;
				}
				
				if(value instanceof String) {
					//调整为Json
					String strValue = (String)value;
					strValue = strValue.trim();
					if(strValue.indexOf("{") == 0) {
						try {
							ObjectNode node = JsonUtils.toObjectNode(strValue);
							toolCalls.put(strFunction, node);
							continue;
						}
						catch (Throwable ex) {
							log.error(String.format("尝试将工具调用数据[%1$s]调整为JsonObject发生异常，%2$s", strValue, ex.getMessage()));
						}
						
						strValue += "}";
						try {
							ObjectNode node = JsonUtils.toObjectNode(strValue);
							toolCalls.put(strFunction, node);
							continue;
						}
						catch (Throwable ex) {
							log.error(String.format("尝试将工具调用数据[%1$s]调整为JsonObject发生异常，%2$s", strValue, ex.getMessage()));
						}
					}
				}
			}
		}
		
		//
		if (!ObjectUtils.isEmpty(toolCalls)) {
			if (functionList != null) {
				ChatMessage chatMessage = new ChatMessage();
				chatMessage.setRole(ChatMessageRole.ASSISTANT.getValue());
				chatMessage.setContent(strContent);
				chatMessage.set("tool_calls", functionList);
				list.add(chatMessage);
				
				log.debug(String.format("tool_calls\r\n%1$s", JsonUtils.toString(functionList)));
				
			}
			else {
				String strRealContent = extractRealContent(strContent);
				if(strRealContent != null) {
					strRealContent = strRealContent.trim();
				}
				if(StringUtils.hasLength(strRealContent)) {
					ChatMessage chatMessage = new ChatMessage();
					chatMessage.setRole(ChatMessageRole.ASSISTANT.getValue());
					chatMessage.setContent(strRealContent);
					list.add(chatMessage);
				}
			}

			Map<String, ChatFunction> chatFunctionMap = new HashMap<String, ChatFunction>();
			if (!ObjectUtils.isEmpty(chatCompletionRequest.getTools())) {
				for (ChatTool chatTool : chatCompletionRequest.getTools()) {
					if (chatTool.getFunction() == null) {
						continue;
					}
					chatFunctionMap.put(chatTool.getFunction().getName(), chatTool.getFunction());
				}
			}

			boolean bFirst = true;

			for (java.util.Map.Entry<String, Object> call : toolCalls.entrySet()) {
				if (actionSession != null) {
					if(this.getToolCallStep()>=AIAccess.TOOLCALLSTEP_ENABLED) {
						String strStep = String.format("%1$s\n", TOOL_CALL_BEGIN);
						if (bFirst) {
							bFirst = false;
							strStep = "\n" + strStep;
						}
						strContent += strStep;
						actionSession.updateActionStep(strStep, strContent);
					}
				}

				String strErrorInfo = "";
				ObjectNode toolCallStepNode = JsonUtils.createObjectNode();
				toolCallStepNode.put("name", call.getKey());
				if(call.getValue() == null) {
					toolCallStepNode.putNull("parameters");
				}
				else
					{
						toolCallStepNode.set("parameters", JsonUtils.toJsonNode(call.getValue()));
					}
				
				
				try {
					
					if(getLoopCallCount() > this.getToolMaxCalls()) {
						throw new Exception(this.getToolExceedMessage());
					}
					
					
					ChatFunction chatFunction = chatFunctionMap.get(call.getKey());
					String strResult = null;
					if (chatFunction != null) {
						strResult = this.doToolCall(chatFunction, call.getValue());
					} else {
						strResult = this.doToolCall(call.getKey(), call.getValue(), chatCompletionRequest);
					}

					if (actionSession != null) {
						//String strStep = String.format("%1$s(%2$s)\n", call.getKey(), call.getValue());
						if(this.getToolCallStep()>=AIAccess.TOOLCALLSTEP_ENABLED) {
							toolCallStepNode.put("error", false);
							if(this.getToolCallStep()==AIAccess.TOOLCALLSTEP_RESULT) {
								toolCallStepNode.put("result", strResult);
							}
							String strStep = toolCallStepNode.toPrettyString();
							strContent += strStep;
							actionSession.updateActionStep(strStep, strContent);
						}
						
					}

					log.debug(String.format("工具[%1$s]调用返回：%2$s", call.getKey(), strResult));

					ChatMessage chatMessage = new ChatMessage();
					chatMessage.setRole(ChatMessageRole.TOOL.getValue());
					chatMessage.setContent(strResult);
					chatMessage.setToolName(call.getKey());
					chatMessage.setToolCallId(toolCallIdMap.get(call.getKey()));
					list.add(chatMessage);

				} catch (Throwable ex) {
					log.error(ex);
					ChatMessage chatMessage = new ChatMessage();
					chatMessage.setRole(ChatMessageRole.TOOL.getValue());
					chatMessage.setContent(String.format("工具调用异常：%1$s", ex.getMessage()));
					chatMessage.setToolCallId(toolCallIdMap.get(call.getKey()));
					list.add(chatMessage);
					strErrorInfo = ex.getMessage();
				}

				if (actionSession != null) {
					if(this.getToolCallStep()>=AIAccess.TOOLCALLSTEP_ENABLED) {
						if (StringUtils.hasLength(strErrorInfo)) {
							//String strStep = String.format("工具调用异常：%1$s\n", call.getKey(), call.getValue());
							toolCallStepNode.put("error", true);
							toolCallStepNode.put("result", strErrorInfo);
							String strStep = toolCallStepNode.toPrettyString();
							strContent += strStep;
							actionSession.updateActionStep(strStep, strContent);
						}
						String strStep = String.format("\n%1$s\n", TOOL_CALL_END);
						strContent += strStep;
						actionSession.updateActionStep(strStep, strContent);
					}
				}
			}
		}

		chatCompletionRequest.setMessages(list);
		return this.onChatCompletion(chatCompletionRequest);
	}

	protected ChatCompletionResult doChatCompletionToolCall(ActionSession actionSession, ChatCompletionRequest chatCompletionRequest, String strContent, String strRealContent, List<String> toolCallList) throws Throwable {
		// 分解
		List<ChatMessage> list = new ArrayList<ChatMessage>();
		if (chatCompletionRequest.getMessages() != null) {
			list.addAll(chatCompletionRequest.getMessages());
		}
		
		if (true) {
			ChatMessage chatMessage = new ChatMessage();
			chatMessage.setRole(ChatMessageRole.ASSISTANT.getValue());
			chatMessage.setContent(strRealContent);
			list.add(chatMessage);
		}
		
		for(String strToolCallContent : toolCallList) {
			
			StringBuilder sb = new StringBuilder();
			
			ConfigEntityEx configEntityEx = new ConfigEntityEx(strToolCallContent, true);
			Map<String, Object> map = configEntityEx.any();
			String strMethodName = (String)map.remove("method");
			String strDesc = (String)map.remove("desc");
//			if(!StringUtils.hasLength(strDesc)) {
//				strDesc = strMethodName;
//			}


			Map<String, ChatFunction> chatFunctionMap = new HashMap<String, ChatFunction>();
			if (!ObjectUtils.isEmpty(chatCompletionRequest.getTools())) {
				for (ChatTool chatTool : chatCompletionRequest.getTools()) {
					if (chatTool.getFunction() == null) {
						continue;
					}
					chatFunctionMap.put(chatTool.getFunction().getName(), chatTool.getFunction());
				}
			}

			try {
				ChatFunction chatFunction = chatFunctionMap.get(strMethodName);
				String strResult = null;
				if (chatFunction != null) {
					strResult = this.doToolCall(chatFunction, map);
				} else {
					strResult = this.doToolCall(strMethodName, map, chatCompletionRequest);
				}
				log.debug(String.format("---------------------------------------------------------------------------------------------------------------"));
				log.debug(String.format("工具[%1$s]调用返回：%2$s", strMethodName, strResult));
				if(StringUtils.hasLength(strDesc)) {
					sb.append(String.format("tool_call[%1$s][%2$s]返回以下信息：\n%3$s\n", strMethodName, strDesc, strResult));
				}
				else {
					sb.append(String.format("tool_call[%1$s]返回以下信息：\n%2$s\n", strMethodName, strResult));
				}
//				if(toolCallList.size() == 1) {
//					sb.append(strResult);
//				}
//				else {
//					//sb.append(String.format("tool_call[%1$s]调用返回：\n%2$s\n", strMethodName, strResult));
//					sb.append(strResult);
//				}
			} catch (Throwable ex) {
				log.error(ex);
//				if(toolCallList.size() == 1) {
//					sb.append(String.format("工具调用异常：%1$s", ex.getMessage()));
//				}
//				else {
//					//sb.append(String.format("tool_call[%1$s]调用异常：%2$s\n", strMethodName, ex.getMessage()));
//					sb.append(String.format("工具调用异常：%1$s", ex.getMessage()));
//				}
				sb.append(String.format("tool_call[%1$s]发生异常：%2$s\n请停止输出并与管理员联系", strMethodName, ex.getMessage()));
			}
			
			ChatMessage chatMessage = new ChatMessage();
			chatMessage.setRole(ChatMessageRole.ASSISTANT.getValue());
			chatMessage.setContent(sb.toString());
			list.add(chatMessage);
		}
		
		

		chatCompletionRequest.setMessages(list);
		return this.onChatCompletion(chatCompletionRequest);
	}
	
	protected String doToolCall(String strName, Object arg, ChatCompletionRequest chatCompletionRequest) throws Throwable {
		
		List<String> mcpServers = chatCompletionRequest.getMcpServers();
		if(!ObjectUtils.isEmpty(mcpServers)) {
			for(String strMcpServerId : mcpServers) {
				String strAppContextData = null;
				if(strMcpServerId.indexOf("@") != -1) {
					String[] items = strMcpServerId.split("[@]");
					strMcpServerId = items[1];
					strAppContextData = items[0];
				}
				IMcpServerAgent iMcpServerAgent = this.getContext().getMcpServerAgent(strMcpServerId);
				if(iMcpServerAgent.containsTool(strName)) {
					return iMcpServerAgent.callTool(strName, arg, strAppContextData);
				}
			}
		}
		
		mcpServers = this.getMcpServers();
		if(!ObjectUtils.isEmpty(mcpServers)) {
			for(String strMcpServerId : mcpServers) {
				String strAppContextData = null;
				if(strMcpServerId.indexOf("@") != -1) {
					String[] items = strMcpServerId.split("[@]");
					strMcpServerId = items[1];
					strAppContextData = items[0];
				}
				IMcpServerAgent iMcpServerAgent = this.getContext().getMcpServerAgent(strMcpServerId);
				if(iMcpServerAgent.containsTool(strName)) {
					return iMcpServerAgent.callTool(strName, arg, strAppContextData);
				}
			}
		}
		
		
		if (strName.equalsIgnoreCase("get_current_date")) {
			return DateUtils.getCurTimeString();
		}

		if (strName.equalsIgnoreCase("get_current_temperature")) {
			Map<String, Object> ret = new LinkedHashMap<String, Object>();
			ret.put("temperature", 26.1);
			ret.put("unit", "celsius");
			ret.put("location", "北京，中国");
			return JsonUtils.toString(ret);
		}

		if (strName.equalsIgnoreCase("get_temperature_date")) {
			Map<String, Object> ret = new LinkedHashMap<String, Object>();
			ret.put("temperature", 26.1);
			ret.put("unit", "celsius");
			ret.put("location", "北京，中国");
			// ret.put("date", "2024-11-15");
			return JsonUtils.toString(ret);
		}

		throw new Exception(String.format("无法识别的函数[%1$s]", strName));
	}

	protected Map<String, Object> getToolCalls(String strContent) throws Exception {
		Map<String, Object> ret = new LinkedHashMap<String, Object>();
		try (BufferedReader reader = new BufferedReader(new StringReader(strContent))) {
			// 读取每行事件数据
			StringBuilder sb = null;

			String line;
			while ((line = reader.readLine()) != null) {
				if (!StringUtils.hasLength(line)) {
					continue;
				}

				if (TOOL_CALL_BEGIN.equalsIgnoreCase(line)) {
					sb = new StringBuilder();
					continue;
				}

				if (sb == null) {
					// throw new Exception("工具调用标记无效");
					continue;
				}
				if (TOOL_CALL_END.equalsIgnoreCase(line)) {
					String strFunctionCall = sb.toString();
					Map map = JsonUtils.asMap(strFunctionCall);
					Object name = map.get("name");
					Object arguments = map.get("arguments");
					if (name != null) {
						ret.put(name.toString(), arguments);
					}
					continue;
				}

				sb.append(line);
			}
		}
		return ret;
	}

	protected static String extractRealContent(String strContent) throws Exception {
		if (!StringUtils.hasLength(strContent) || !thinkPattern.matcher(strContent).find()) {
			return strContent;
		}

		List<String> list = null;
		try (BufferedReader reader = new BufferedReader(new StringReader(strContent))) {
			// 读取每行事件数据
			String line;
			while ((line = reader.readLine()) != null) {
				// 多次思考也是最后的内容
				if (StringUtils.hasLength(line)) {
					if (line.indexOf(THINK_END) == 0) {
						if (THINK_END.equalsIgnoreCase(line.trim())) {
							list = new ArrayList<String>();
							continue;
						}
					}
				}

				if (list == null) {
					continue;
				}

				if (!StringUtils.hasLength(line)) {
					if (list.size() == 0) {
						continue;
					}
				}

				list.add(line);
			}
		}

		if (ObjectUtils.isEmpty(list)) {
			return "";
		}

		return StringUtils.collectionToDelimitedString(list, "\n");
	}

	protected static List<String> extractToolCallContent(String text) {
		List<String> toolCallList = new ArrayList<String>();
		Matcher matcher = toolCallBodyPattern.matcher(text);
		while(matcher.find()) {
			toolCallList.add(matcher.group(1)); // 返回第一个捕获组（即<内容>）
		}
		return toolCallList;
	}

	@Override
	protected CompletionResult onCompletion(CompletionRequest completionRequest) throws Throwable {

		//
		// int nMaxTokens = 4096;
		// if(completionRequest.containsMaxTokens()) {
		// nMaxTokens = completionRequest.getMaxTokens();
		// }
		// else {
		// if(StringUtils.hasLength(completionRequest.getPrompt())) {
		// nMaxTokens = nMaxTokens - completionRequest.getPrompt().length();
		// }
		// }
		//
		//
		// if(nMaxTokens <= 0) {
		// throw new Exception("最大词数异常");
		// }
		//
		// com.theokanning.openai.completion.CompletionRequest request =
		// com.theokanning.openai.completion.CompletionRequest
		// .builder()
		// .model("text-davinci-003")
		// .prompt(completionRequest.getPrompt())
		// .n(1)
		// .user(completionRequest.getSessionId())
		// .maxTokens(nMaxTokens)
		// // .logitBias(new HashMap<>())
		// .build();
		//
		// final StringBuilder sb = new StringBuilder();
		//
		// ActionSession actionSession =
		// ActionSessionManager.getCurrentSession();
		// // service.
		// getAIService().streamCompletion(request).blockingForEach(it -> {
		// String strContent = it.getChoices().get(0).getText();
		// if (StringUtils.hasLength(strContent)) {
		// sb.append(strContent);
		// if(actionSession!=null) {
		// String strStep = sb.toString();
		// actionSession.updateActionStep(strStep, 0, false);
		// }
		// }
		// });
		//
		// Completion completion = new Completion();
		// completion.setContent(sb.toString());
		//
		// final List<Completion> completionList = new ArrayList<>();
		// completionList.add(completion);
		//
		// CompletionResult completionResult = new CompletionResult();
		// completionResult.setChoices(completionList);
		// return completionResult;
		return null;
	}

}

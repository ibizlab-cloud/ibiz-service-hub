package net.ibizsys.central.cloud.ai.ollama.addin;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.ai.core.addin.AIAccessAgentBase;
import net.ibizsys.central.cloud.core.cloudutil.ICloudAIUtilRuntime;
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

public class OllamaAccessAgent extends AIAccessAgentBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(OllamaAccessAgent.class);
	
	public final static String MODEL_DEFAULT = "wangshenzhi/llama3-8b-chinese-chat-ollama-fp16";
	
	
	
	
//	public final static String FUNCTIONS = "[\r\n" + 
//			"  {\r\n" + 
//			"    \"type\": \"function\",\r\n" + 
//			"    \"function\": {\r\n" + 
//			"      \"name\": \"get_current_date\",\r\n" + 
//			"      \"description\": \"获取当前日期，当计算与日期相关的功能时需要先调用此函数获取当前时间\",\r\n" + 
//			"      \"parameters\": {\r\n" + 
//			"        \"type\": \"null\"\r\n" + 
//			"      }\r\n" + 
//			"    }\r\n" + 
//			"  },\r\n" + 
//			"  {\r\n" + 
//			"    \"type\": \"function\",\r\n" + 
//			"    \"function\": {\r\n" + 
//			"      \"name\": \"get_current_temperature\",\r\n" + 
//			"      \"description\": \"获取传入地方的当前温度.\",\r\n" + 
//			"      \"parameters\": {\r\n" + 
//			"        \"type\": \"object\",\r\n" + 
//			"        \"properties\": {\r\n" + 
//			"          \"location\": {\r\n" + 
//			"            \"type\": \"string\",\r\n" + 
//			"            \"description\": \"The location to get the temperature for, in the format \\\"City, State, Country\\\".\"\r\n" + 
//			"          },\r\n" + 
//			"          \"unit\": {\r\n" + 
//			"            \"type\": \"string\",\r\n" + 
//			"            \"enum\": [\r\n" + 
//			"              \"celsius\",\r\n" + 
//			"              \"fahrenheit\"\r\n" + 
//			"            ],\r\n" + 
//			"            \"description\": \"The unit to return the temperature in. Defaults to \\\"celsius\\\".\"\r\n" + 
//			"          }\r\n" + 
//			"        },\r\n" + 
//			"        \"required\": [\r\n" + 
//			"          \"location\"\r\n" + 
//			"        ]\r\n" + 
//			"      }\r\n" + 
//			"    }\r\n" + 
//			"  },\r\n" + 
//			"  {\r\n" + 
//			"    \"type\": \"function\",\r\n" + 
//			"    \"function\": {\r\n" + 
//			"      \"name\": \"get_temperature_date\",\r\n" + 
//			"      \"description\": \"获取传入地方及时间的温度\",\r\n" + 
//			"      \"parameters\": {\r\n" + 
//			"        \"type\": \"object\",\r\n" + 
//			"        \"properties\": {\r\n" + 
//			"          \"location\": {\r\n" + 
//			"            \"type\": \"string\",\r\n" + 
//			"            \"description\": \"The location to get the temperature for, in the format \\\"City, State, Country\\\".\"\r\n" + 
//			"          },\r\n" + 
//			"          \"date\": {\r\n" + 
//			"            \"type\": \"string\",\r\n" + 
//			"            \"description\": \"The date to get the temperature for, in the format \\\"Year-Month-Day\\\".\"\r\n" + 
//			"          },\r\n" + 
//			"          \"unit\": {\r\n" + 
//			"            \"type\": \"string\",\r\n" + 
//			"            \"enum\": [\r\n" + 
//			"              \"celsius\",\r\n" + 
//			"              \"fahrenheit\"\r\n" + 
//			"            ],\r\n" + 
//			"            \"description\": \"The unit to return the temperature in. Defaults to \\\"celsius\\\".\"\r\n" + 
//			"          }\r\n" + 
//			"        },\r\n" + 
//			"        \"required\": [\r\n" + 
//			"          \"location\",\r\n" + 
//			"          \"date\"\r\n" + 
//			"        ]\r\n" + 
//			"      }\r\n" + 
//			"    }\r\n" + 
//			"  }\r\n" + 
//			"]";
	
	public final static String TOOL_CALL_BEGIN = "<tool_call>";
	
	public final static String TOOL_CALL_END = "</tool_call>";

	@Override
	protected void onInit() throws Exception {
		super.onInit();

	}

	@Override
	protected void runAuthTimer() {
		// super.runAuthTimer();
	}

	@Override
	public String getName() {
		return ICloudAIUtilRuntime.AIPLATFORM_OLLAMA;
	}
	

	
	@Override
	protected EmbeddingResult onEmbedding(EmbeddingRequest completionRequest) throws Throwable {
		
		String strServiceUrl = String.format("%1$s/api/embeddings", this.getAgentData().getServiceUrl());
		try (CloseableHttpClient httpClient = HttpClients.createDefault()) {

			HttpPost request = new HttpPost(strServiceUrl);
			
			Map<String, Object> body = new LinkedHashMap<String, Object>();
			body.put("model", StringUtils.hasLength(this.getAgentData().getModel())? this.getAgentData().getModel(): MODEL_DEFAULT);
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
			}
			else {
				throw new Exception(String.format("请求发生异常，%1$s", response.getStatusLine().getStatusCode()));
			}
		}
	}
	

	@Override
	protected ChatCompletionResult onChatCompletion(ChatCompletionRequest chatCompletionRequest) throws Throwable {

		List<Map> historyList = new ArrayList<Map>();
		if (!ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
			for (int i = 0; i < chatCompletionRequest.getMessages().size(); i++) {
				ChatMessage message = chatCompletionRequest.getMessages().get(i);
				if (!StringUtils.hasLength(message.getRole())) {
					continue;
				}
				Map<String, String> history = new LinkedHashMap<String, String>();
				history.put("role", message.getRole().toLowerCase());
				history.put("content", message.getContent());
				if(message.getRole().equals(ChatMessageRole.TOOL.getValue())) {
					if(StringUtils.hasLength(message.getToolName())) {
						history.put("name", message.getToolName());
					}
				}
				historyList.add(history);
			}
		}

		if (ObjectUtils.isEmpty(historyList)) {
			throw new Exception("未传入查询内容");
		}

		boolean bStream = DataTypeUtils.asBoolean(chatCompletionRequest.getStreaming(), true);

		String strServiceUrl = String.format("%1$s/api/chat", this.getAgentData().getServiceUrl());
		try (CloseableHttpClient httpClient = HttpClients.createDefault()) {

			ActionSession actionSession = ActionSessionManager.getCurrentSession();
			
			HttpPost request = new HttpPost(strServiceUrl);
			
			Map<String, Object> body = new LinkedHashMap<String, Object>();
			body.put("messages", historyList);
			body.put("model", StringUtils.hasLength(this.getAgentData().getModel())? this.getAgentData().getModel(): MODEL_DEFAULT);
			body.put("stream", bStream);
			if(!ObjectUtils.isEmpty(chatCompletionRequest.getTools())) {
				String strTools = JsonUtils.toString(chatCompletionRequest.getTools());
				List<ChatTool> tools = JsonUtils.as(strTools, ChatToolListType);
				for(ChatTool chatTool : tools) {
					chatTool.getFunction().resetService();
				}
				body.put("tools", tools);
			}		
			
			Map<String, Object> options = new LinkedHashMap<String, Object>();
			
			if(chatCompletionRequest.getTemperature()!=null) {
				options.put("temperature", chatCompletionRequest.getTemperature());
			}
			
			if(options.size()>0) {
				body.put("options", options);
			}

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
						String strRole = null;
						
						String line;
						//boolean first = true;
						boolean tool_call = false;
						while ((line = reader.readLine()) != null) {
							if (!StringUtils.hasLength(line)) {
								continue;
							}
							
							// 处理事件数据
							Map ret = JsonUtils.asMap(line);
							Object done = ret.get("done");
							if (!DataTypeUtils.asBoolean(done, false)) {
								Object message = ret.get("message");
								if (message instanceof Map) {
									Map map = (Map) message;
									strRole = (String) map.get("role");
									String strContent = (String) map.get("content");
									
									if(StringUtils.hasLength(strContent)) {
										if(!tool_call) {
											tool_call = strContent.indexOf("<tool_call>") == 0;
										}
									}
											
									if (!ObjectUtils.isEmpty(strRole) && !ObjectUtils.isEmpty(strContent)) {
										sb.append(strContent);
										if(actionSession!=null) {
											if(tool_call) {
												
											}
											else {
												actionSession.updateActionStep(strContent, sb.toString());
											}
										}
									}
									else {
										log.error(String.format("返回内容无效"));
									}
								}
								
							} else {
								break;
							}
						}

						String strContent = sb.toString();
						if (!ObjectUtils.isEmpty(strRole) && !ObjectUtils.isEmpty(strContent)) {
							if(tool_call) {
								return this.doChatCompletionToolCall(chatCompletionRequest, strContent);
							}
							else {
								ChatMessage chatMessage = new ChatMessage();
								chatMessage.setRole(strRole.toUpperCase());
								chatMessage.setContent(sb.toString());
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
					Object done = ret.get("done");
					if (DataTypeUtils.asBoolean(done, false)) {
						Object message = ret.get("message");
						if (message instanceof Map) {
							Map map = (Map) message;
							String strRole = (String) map.get("role");
							String strContent = (String) map.get("content");
							if (ObjectUtils.isEmpty(strRole) || ObjectUtils.isEmpty(strContent)) {
								log.error(String.format("返回内容无效"));
							}
							else {
								boolean tool_call = strContent.indexOf("<tool_call>") != -1;
								if(tool_call) {
									return this.doChatCompletionToolCall(chatCompletionRequest, strContent);
								}
								else {
									ChatMessage chatMessage = new ChatMessage();
									chatMessage.setRole(strRole.toUpperCase());
									chatMessage.setContent(strContent);
									retMessageList.add(chatMessage);
								}
							}
						}
					} else {
						throw new Exception(String.format("请求发生错误，%1$s", "未返回完成标记"));
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
	
	protected ChatCompletionResult doChatCompletionToolCall(ChatCompletionRequest chatCompletionRequest, String strContent) throws Throwable {
		//分解
		List<ChatMessage> list = new ArrayList<ChatMessage>();
		if(chatCompletionRequest.getMessages()!=null) {
			list.addAll(chatCompletionRequest.getMessages());
		}
		
		Map<String, Object> toolCalls = this.getToolCalls(strContent);
		if(!ObjectUtils.isEmpty(toolCalls)) {
			if(true) {
				ChatMessage chatMessage = new ChatMessage();
				chatMessage.setRole(ChatMessageRole.ASSISTANT.getValue());
				chatMessage.setContent(strContent);
				list.add(chatMessage);
			}
			
			Map<String, ChatFunction> chatFunctionMap = new HashMap<String, ChatFunction>();
			if(!ObjectUtils.isEmpty(chatCompletionRequest.getTools())) {
				for(ChatTool chatTool : chatCompletionRequest.getTools()){
					if(chatTool.getFunction() == null) {
						continue;
					}
					chatFunctionMap.put(chatTool.getFunction().getName(), chatTool.getFunction());
				}
			}
			
			
			for(java.util.Map.Entry<String, Object> call : toolCalls.entrySet()) {
				try {
					ChatFunction chatFunction = chatFunctionMap.get(call.getKey());
					String strResult = null;
					if(chatFunction != null) {
						strResult = this.doToolCall(chatFunction, call.getValue());
					}
					else {
						strResult = this.doToolCall(call.getKey(), call.getValue());
					}
					
					log.debug(String.format("工具[%1$s]调用返回：%2$s", call.getKey(), strResult));
					
					ChatMessage chatMessage = new ChatMessage();
					chatMessage.setRole(ChatMessageRole.TOOL.getValue());
					chatMessage.setContent(strResult);
					chatMessage.setToolName(call.getKey());
					list.add(chatMessage);
					
				}
				catch (Throwable ex) {
					log.error(ex);
					ChatMessage chatMessage = new ChatMessage();
					chatMessage.setRole(ChatMessageRole.TOOL.getValue());
					chatMessage.setContent(String.format("工具调用发生异常，%1$s", ex.getMessage()));
					chatMessage.setToolName(call.getKey());
					list.add(chatMessage);
				}
			}
		}
		
		chatCompletionRequest.setMessages(list);
		return this.onChatCompletion(chatCompletionRequest);
	}
	
	protected String doToolCall(String strName, Object arg) throws Throwable {
		if(strName.equalsIgnoreCase("get_current_date")) {
			return DateUtils.getCurTimeString();
		}
		
		
		if(strName.equalsIgnoreCase("get_current_temperature")) {
			Map<String, Object> ret = new LinkedHashMap<String, Object>();
			ret.put("temperature", 26.1);
			ret.put("unit", "celsius");
			ret.put("location", "北京，中国");
			return JsonUtils.toString(ret);
		}
		
		if(strName.equalsIgnoreCase("get_temperature_date")) {
			Map<String, Object> ret = new LinkedHashMap<String, Object>();
			ret.put("temperature", 26.1);
			ret.put("unit", "celsius");
			ret.put("location", "北京，中国");
			//ret.put("date", "2024-11-15");
			return JsonUtils.toString(ret);
		}
		
		throw new Exception(String.format("无法识别的函数[%1$s]", strName));
	}
	
	protected Map<String, Object> getToolCalls(String strContent) throws Throwable {
		Map<String, Object> ret = new LinkedHashMap<String, Object>();
		try (BufferedReader reader = new BufferedReader(new StringReader(strContent))) {
			// 读取每行事件数据
			StringBuilder sb = null;
			
			String line;
			while ((line = reader.readLine()) != null) {
				if (!StringUtils.hasLength(line)) {
					continue;
				}
				
				if(TOOL_CALL_BEGIN.equalsIgnoreCase(line)) {
					sb = new StringBuilder();
					continue;
				}
				
				if(sb == null) {
					//throw new Exception("工具调用标记无效");
					continue;
				}
				if(TOOL_CALL_END.equalsIgnoreCase(line)) {
					String strFunctionCall = sb.toString();
					Map map = JsonUtils.asMap(strFunctionCall);
					Object name = map.get("name");
					Object arguments = map.get("arguments");
					if(name!=null && arguments!=null) {
						ret.put(name.toString(), arguments);
					}
					continue;
				}
				
				sb.append(line);
			}
		}
		return ret;
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

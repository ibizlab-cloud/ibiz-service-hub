package net.ibizsys.central.cloud.ai.core.addin;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.vladsch.flexmark.ast.Image;
import com.vladsch.flexmark.ast.Text;
import com.vladsch.flexmark.formatter.Formatter;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.ast.NodeVisitor;
import com.vladsch.flexmark.util.ast.VisitHandler;
import com.vladsch.flexmark.util.data.MutableDataSet;

import net.ibizsys.central.cloud.core.ai.util.AIChatUtils;
import net.ibizsys.central.cloud.core.cloudutil.ICloudAIUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudKBClient;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudOSSClient;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysPortalUtilRuntime;
import net.ibizsys.central.cloud.core.util.ChatMessagesBuilder;
import net.ibizsys.central.cloud.core.util.ChunkSearchContext;
import net.ibizsys.central.cloud.core.util.ConfigEntityEx;
import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.UserCancelException;
import net.ibizsys.central.cloud.core.util.domain.AIAccess;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionUsage;
import net.ibizsys.central.cloud.core.util.domain.ChatFunction;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.ChatMessageRole;
import net.ibizsys.central.cloud.core.util.domain.ChatTool;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.ChunkType;
import net.ibizsys.central.cloud.core.util.domain.CompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.CompletionResult;
import net.ibizsys.central.cloud.core.util.domain.Credential;
import net.ibizsys.central.cloud.core.util.domain.Embedding;
import net.ibizsys.central.cloud.core.util.domain.EmbeddingRequest;
import net.ibizsys.central.cloud.core.util.domain.EmbeddingResult;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncActionState;
import net.ibizsys.central.cloud.core.util.domain.TextReRankDocument;
import net.ibizsys.central.cloud.core.util.domain.TextReRankRequest;
import net.ibizsys.central.cloud.core.util.domain.TextReRankResult;
import net.ibizsys.central.util.IPage;
import net.ibizsys.central.util.WebResponseException;
import net.ibizsys.model.PSModelEnums.DELogicSysAIChatAgentType;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.DateUtils;
import net.ibizsys.runtime.util.EntityBase;
import net.ibizsys.runtime.util.ISearchContext;
import net.ibizsys.runtime.util.JsonUtils;

public abstract class OpenAIAccessAgentBase extends AIAccessAgentBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(OpenAIAccessAgentBase.class);

	public static final TypeReference<List<Embedding>> EmbeddingListType = new TypeReference<List<Embedding>>() {
	};

	public final static String MODEL_DEFAULT = "Qwen/Qwen2.5-32B-Instruct";
	// public final static String MODEL_DEFAULT = "deepseek-ai/DeepSeek-V3";

	public final static String EMBEDDINGMODEL_DEFAULT = "BAAI/bge-large-zh-v1.5";

	public final static String TOOL_CALL_BEGIN = "<tool_call>";

	public final static String TOOL_CALL_END = "</tool_call>";

	public final static String UX_TOOL_CALL_BEGIN = "```tool_call";

	public final static String THINK_BEGIN = "<think>";

	public final static String THINK_END = "</think>";

	public final static String TOOL_CALL_EXECUTE_CHAT = "execute_chat";

	protected final static Pattern thinkPattern = Pattern.compile("(?m)^</think>\\s*");

	protected final static Pattern toolCallPattern = Pattern.compile("(?m)^```tool_call");
	protected final static Pattern toolCallBodyPattern = Pattern.compile("(?m)^```tool_call\\s*\\n([\\s\\S]*?)\\s*\\n```");

	public final static String SIMULATE_TOOL_CALL_BEGIN = "<tool_use>";

	public final static String SIMULATE_TOOL_CALL_END = "</tool_use>";
	protected final static Pattern simulateToolCallPattern = Pattern.compile("(?m)^<tool_use>");
	protected final static Pattern simulateToolCallBodyPattern = Pattern.compile("(?m)^<tool_use>\\s*\\n([\\s\\S]*?)\\s*\\n</tool_use>");
	protected final static Pattern simulateToolCallNamePattern = Pattern.compile("<name>(.*?)</name>", Pattern.DOTALL);
	protected final static Pattern simulateToolCallArgumentsPattern = Pattern.compile("<arguments>(.*?)</arguments>", Pattern.DOTALL);

	private static final Pattern chunkViewPattern = Pattern.compile("::\\[.*?\\]\\(chunkview://.*?\\)");
	private static final Pattern chunkViewPattern2 = Pattern.compile("\\[.*?\\]\\(chunkview://.*?\\)");

	public static final String APPDOWNLOADURL = "/ibizutil/download/";

	/**
	 * 思维内容
	 */
	public final static String FIELD_REASONING_CONTENT = "reasoning_content";

	/**
	 * 工具调用
	 */
	public final static String FIELD_TOOL_CALLS = "tool_calls";

	private ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = null;

	private Deque<String> tokenDeque = new ArrayDeque<String>();
	private Deque<String> embeddingTokenDeque = new ArrayDeque<String>();
	private String strEmbeddingServiceUrl = null;
	private String strChatCompletionServiceUrl = null;

	private String strCredentialId = null;
	private boolean bDescOSSImage = false;
	private int nMaxOSSImages = 10;
	private String strOSSImageVLPrompt = null;

	private Deque<String> textReRankTokenDeque = new ArrayDeque<String>();
	private String strTextReRankServiceUrl = null;
	private String strTextReRankModel = null;

	@Override
	protected void onInit() throws Exception {
		this.strCredentialId = this.getAgentData().getCredentialId();
		this.getCredential();

		String strDescOSSImage = this.getAgentData().getDescOSSImage();
		if (StringUtils.hasLength(strDescOSSImage)) {
			bDescOSSImage = DataTypeUtils.asBoolean(strDescOSSImage, false);
		}
		if (this.isEnableDescOSSImage()) {
			int nMaxOSSImages = DataTypeUtils.asInteger(this.getAgentData().getMaxOSSImages(), 0);
			if (nMaxOSSImages > 0) {
				this.nMaxOSSImages = nMaxOSSImages;
			}
			this.strOSSImageVLPrompt = this.getAgentData().getOSSImageVLPrompt();
		}

		if (!ObjectUtils.isEmpty(this.getAgentData().getAccessToken())) {
			List list = Arrays.asList(this.getAgentData().getAccessToken().toString().split("[,]"));
			tokenDeque.addAll(list);
		}

		if (!ObjectUtils.isEmpty(this.getAgentData().getEmbeddingToken())) {
			List list = Arrays.asList(this.getAgentData().getEmbeddingToken().toString().split("[,]"));
			embeddingTokenDeque.addAll(list);
		} else {
			embeddingTokenDeque.addAll(tokenDeque);
		}

		this.strChatCompletionServiceUrl = this.getAgentData().getChatCompletionUrl();
		if (!StringUtils.hasLength(this.strChatCompletionServiceUrl)) {
			this.strChatCompletionServiceUrl = String.format("%1$s/v1/chat/completions", this.getAgentData().getServiceUrl());
		}
		this.strEmbeddingServiceUrl = this.getAgentData().getEmbeddingUrl();
		if (!StringUtils.hasLength(this.strEmbeddingServiceUrl)) {
			this.strEmbeddingServiceUrl = String.format("%1$s/v1/embeddings", this.getAgentData().getServiceUrl());
		}

		if (!ObjectUtils.isEmpty(this.getAgentData().getTextReRankToken())) {
			List list = Arrays.asList(this.getAgentData().getTextReRankToken().toString().split("[,]"));
			this.textReRankTokenDeque.addAll(list);
		} else if (!ObjectUtils.isEmpty(this.getAgentData().getAccessToken())) {
			List list = Arrays.asList(this.getAgentData().getAccessToken().toString().split("[,]"));
			this.textReRankTokenDeque.addAll(list);
		}

		if (!StringUtils.hasLength(this.getTextReRankServiceUrl())) {
			this.strTextReRankServiceUrl = this.getAgentData().getTextReRankUrl();
			if (!StringUtils.hasLength(this.strTextReRankServiceUrl)) {
				this.strTextReRankServiceUrl = String.format("%1$s/v1/rerank", this.getAgentData().getServiceUrl());
			}
		}

		if (!StringUtils.hasLength(this.getTextReRankModel())) {
			this.strTextReRankModel = this.getAgentData().getTextReRankModel();
			if (!StringUtils.hasLength(this.strTextReRankModel)) {
				this.strTextReRankModel = this.getDefaultTextReRankModel();
			}
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

	protected Credential getCredential() {
		if (ObjectUtils.isEmpty(this.strCredentialId)) {
			return null;
		}
		return this.getSystemRuntime().getCredentialRepo().getCredential(this.strCredentialId, false);
	}

	protected String getAccessToken() {
		String strAccessToken = null;
		final Credential credential = this.getCredential();
		if (credential != null) {
			strAccessToken = credential.getAccessToken();
			if (StringUtils.hasLength(strAccessToken)) {
				if (strAccessToken.indexOf("Bearer ") == 0) {
					strAccessToken = strAccessToken.substring(7);
				}
				return strAccessToken;
			}
		}

		synchronized (this.tokenDeque) {
			strAccessToken = this.tokenDeque.pollFirst();
			if (StringUtils.hasLength(strAccessToken)) {
				this.tokenDeque.addLast(strAccessToken);
			}
		}
		return strAccessToken;
	}

	protected String getEmbeddingToken() {
		String strAccessToken = null;
		final Credential credential = this.getCredential();
		if (credential != null) {
			strAccessToken = credential.getAccessToken();
			if (StringUtils.hasLength(strAccessToken)) {
				if (strAccessToken.indexOf("Bearer ") == 0) {
					strAccessToken = strAccessToken.substring(7);
				}
				return strAccessToken;
			}
		}

		synchronized (this.embeddingTokenDeque) {
			strAccessToken = this.embeddingTokenDeque.pollFirst();
			if (StringUtils.hasLength(strAccessToken)) {
				this.embeddingTokenDeque.addLast(strAccessToken);
			}
		}
		return strAccessToken;
	}

	@Override
	protected EmbeddingResult onEmbedding(EmbeddingRequest embeddingRequest) throws Throwable {

		String strServiceUrl = getEmbeddingServiceUrl();
		try (CloseableHttpClient httpClient = HttpClients.createDefault()) {

			HttpPost request = new HttpPost(strServiceUrl);
			request.addHeader(new BasicHeader("Authorization", String.format("Bearer %1$s", this.getEmbeddingToken())));
			this.onFillEmbeddingRequest(embeddingRequest, request);

			Map<String, Object> body = new LinkedHashMap<String, Object>();
			body.put("model", StringUtils.hasLength(this.getAgentData().getEmbeddingModel()) ? this.getAgentData().getEmbeddingModel() : EMBEDDINGMODEL_DEFAULT);
			// body.put("prompt", completionRequest.getContent());
			body.put("input", embeddingRequest.getContent());

			Integer dimensions = embeddingRequest.getDimensions();
			if (dimensions == null) {
				dimensions = this.getAgentData().getEmbeddingDimensions();
			}

			if (dimensions != null && dimensions.intValue() > 0) {
				body.put("dimensions", dimensions.intValue());
			}

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

				if (!ObjectUtils.isEmpty(responseBody)) {
					Map<String, Object> map = JsonUtils.asMap(responseBody);
					List<Embedding> embeddingList = JsonUtils.as(map.get("data"), EmbeddingListType);
					embeddingResult.setData(embeddingList);
				}
				return embeddingResult;
			} else {
				throw new Exception(String.format("请求发生异常，%1$s", response.getStatusLine().getStatusCode()));
			}
		}
	}

	protected void onFillEmbeddingRequest(EmbeddingRequest embeddingRequest, HttpPost request) throws Throwable {

	}

	protected String getEmbeddingServiceUrl() {
		return this.strEmbeddingServiceUrl;
	}

	protected String getChatCompletionServiceUrl() {
		return getCompletionsServiceUrl();
	}

	@Deprecated
	protected String getCompletionsServiceUrl() {
		return this.strChatCompletionServiceUrl;
	}

	protected String getChatCompletionDataPrefix() {
		return "data:";
	}

	/**
	 * 测试是否为聊天补全控制信号
	 * 
	 * @param strData
	 * @return
	 */
	protected boolean testChatCompletionControlData(String strData) {
		return ": keep-alive".equalsIgnoreCase(strData);
	}

	@Override
	protected ChatCompletionResult onChatCompletion(ChatCompletionRequest chatCompletionRequest) throws Throwable {
		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		if (actionSession != null) {
			// 置空当前会话内容
			if (this.getLoopCallCount() != 0) {
				Thread.sleep(200);
				String strActionResult = actionSession.getActionResult();
				if (StringUtils.hasLength(strActionResult)) {
					String strContent = AIChatUtils.removeThinkingContent(strActionResult);
					ObjectNode jsonNode = JsonUtils.createObjectNode();
					if (StringUtils.hasLength(strContent)) {
						jsonNode.put("title", strContent);
					}
					jsonNode.put("content", strActionResult);
					String strStepContent = String.format("\r\n<%1$s>\r\n%2$s\r\n</%1$s>\r\n", DELogicSysAIChatAgentType.CHATSTEP.name().toLowerCase(), jsonNode.toPrettyString());
					actionSession.updateActionStep(strStepContent, 0.0, strStepContent);
					Thread.sleep(200);
				}
			}
			actionSession.updateActionStep("", 0.0, "");
		}

		if (this.getLoopCallCount() == 0 && !ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
			// 转化请求内容
			if (!ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
				for (int i = 0; i < chatCompletionRequest.getMessages().size(); i++) {
					ChatMessage message = chatCompletionRequest.getMessages().get(i);
					if (!StringUtils.hasLength(message.getRole())) {
						continue;
					}

					Object content = getMessageContent(message, chatCompletionRequest);
					if (content != null && content instanceof String) {
						// 判断内容是否一致
						if (!content.equals(message.getContent())) {
							message.setContent(content);
						}
					}
				}
			}

			if (!ObjectUtils.isEmpty(chatCompletionRequest.getChunks()) || !ObjectUtils.isEmpty(chatCompletionRequest.getKnowledgeBases())) {
				this.onFillChatCompletionChunks(chatCompletionRequest);
			}
		}

		boolean bEnableTools = DataTypeUtils.asBoolean(this.getAgentData().getTools(), false);
		boolean bSimulateToolCall = "simulate".equalsIgnoreCase(this.getAgentData().getTools());
		boolean bToolExceed = false;
		if (!testLoopCall(this.getToolMaxCalls())) {
			if (bEnableTools || bSimulateToolCall) {
				bToolExceed = true;
			} else {
				ChatMessage chatMessage = new ChatMessage();
				chatMessage.setRole(ChatMessageRole.ASSISTANT.getValue());
				chatMessage.setContent(this.getToolExceedMessage());
				ChatCompletionResult chatCompletionResult = new ChatCompletionResult();
				chatCompletionResult.setChoices(Arrays.asList(chatMessage));
				
				ChatCompletionUsage chatCompletionUsage = new ChatCompletionUsage();
				chatCompletionUsage.setPromptTokens(this.getTotalPromptTokens());
				chatCompletionUsage.setCompletionTokens(this.getTotalCompletionTokens());
				chatCompletionUsage.setTotalTokens(this.getTotalPromptTokens() + this.getTotalCompletionTokens());
				chatCompletionUsage.setToolCalls(getLoopCallCount() - 1 + this.getTotalToolCalls());
				chatCompletionResult.setUsage(chatCompletionUsage);
				
				return chatCompletionResult;
			}
		}

		final String strRemoveThink = this.getAgentData().getRemoveThink();
		final String strStream = this.getAgentData().getStream();
		boolean bRemoveInputThink = "all".equalsIgnoreCase(strRemoveThink) || "input".equalsIgnoreCase(strRemoveThink);
		boolean bRemoveOutputThink = "all".equalsIgnoreCase(strRemoveThink) || "output".equalsIgnoreCase(strRemoveThink);

		List<Map> historyList = new ArrayList<Map>();
		if (!ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
			
			int nToolCallHistories = DataTypeUtils.asInteger(this.getAgentData().getToolCallHistories(), 0);
			if(nToolCallHistories>0) {
				//进行预处理
				int nCount = 0;
				for (int i = 0; i < chatCompletionRequest.getMessages().size(); i++) {
					ChatMessage message = chatCompletionRequest.getMessages().get(i);
					if (!StringUtils.hasLength(message.getRole())) {
						continue;
					}

					Object tool_calls = message.get("tool_calls");
					if (tool_calls != null) {
						nCount ++;
					}
				}
				
				if(nCount > nToolCallHistories) {
					
					log.debug(String.format("tool_call历史[%1$s]超过最大限制数[%2$s]，执行移除操作", nCount, nToolCallHistories));
					
					//计算移除数量
					nCount -= nToolCallHistories;
					
					List<ChatMessage> list = new ArrayList<ChatMessage>();
					List<ChatMessage> total = new ArrayList<ChatMessage>();
					
					for (int i = 0; i < chatCompletionRequest.getMessages().size(); i++) {
						ChatMessage message = chatCompletionRequest.getMessages().get(i);
						if (!StringUtils.hasLength(message.getRole())) {
							continue;
						}

						Object tool_calls = message.get("tool_calls");
						if (tool_calls != null) {
							if(nCount>0) {
								//移除上一条消息
								if(list.size()>0) {
									list.remove(list.size()-1);
									total.addAll(list);
									list.clear();
								}
								nCount --;
								continue;
							}
						}
						
						list.add(message);
					}
					
					total.addAll(list);
					chatCompletionRequest.setMessages(total);
					
				}
			}
			
			for (int i = 0; i < chatCompletionRequest.getMessages().size(); i++) {
				ChatMessage message = chatCompletionRequest.getMessages().get(i);
				if (!StringUtils.hasLength(message.getRole())) {
					continue;
				}

				Map<String, Object> history = new LinkedHashMap<String, Object>();
				history.put("role", message.getRole().toLowerCase());

				Object tool_calls = message.get("tool_calls");
				if (tool_calls != null) {
					history.put("tool_calls", tool_calls);
					Object content = getMessageContent(message, chatCompletionRequest);
					if (content != null) {
						history.put("content", content);
					} else {
						history.put("content", message.getRawContent());
					}
				} else {
					if (bRemoveInputThink && message.getRawContent() instanceof String) {
						history.put("content", extractRealContent(message.getContent()));
					} else {
						Object content = getMessageContent(message, chatCompletionRequest);
						if (content != null) {
							history.put("content", content);
						} else {
							history.put("content", message.getRawContent());
						}
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

				this.onFillChatMessageBody(message, history);
				historyList.add(history);
			}
		}

		if (ObjectUtils.isEmpty(historyList)) {
			throw new Exception("未传入查询内容");
		}

		boolean bStream = DataTypeUtils.asBoolean(chatCompletionRequest.getStreaming(), true);
		if (StringUtils.hasLength(strStream)) {
			if ("true".equalsIgnoreCase(strStream)) {
				if (!bStream) {
					// 默认非流模式，设置移除输出思考内容
					bRemoveOutputThink = true;
				}
				bStream = true;
			} else if ("false".equalsIgnoreCase(strStream)) {
				bStream = false;
			}
		}

		// if(bToolExceed) {
		// //临时关闭ToolCall
		// bEnableTools = false;
		// }

		String strServiceUrl = this.getChatCompletionServiceUrl();
		try (CloseableHttpClient httpClient = HttpClients.createDefault()) {

			HttpPost request = new HttpPost(strServiceUrl);
			request.addHeader(new BasicHeader("Authorization", String.format("Bearer %1$s", this.getAccessToken())));
			this.onFillChatCompletionRequest(chatCompletionRequest, request);

			Map<String, Object> body = new LinkedHashMap<String, Object>();
			body.put("messages", historyList);
			body.put("model", StringUtils.hasLength(this.getAgentData().getModel()) ? this.getAgentData().getModel() : MODEL_DEFAULT);
			body.put("stream", bStream);
			if (bEnableTools || bSimulateToolCall) {
				List<ChatTool> tools = null;
				if (!ObjectUtils.isEmpty(chatCompletionRequest.getTools())) {
					String strTools = JsonUtils.toString(chatCompletionRequest.getTools());
					tools = JsonUtils.as(strTools, ChatToolListType);
					for (ChatTool chatTool : tools) {
						chatTool.getFunction().resetService();
					}
				}

				List<String> mcpServers = chatCompletionRequest.getMcpServers();
				if (!ObjectUtils.isEmpty(mcpServers)) {
					if (tools == null) {
						tools = new ArrayList<ChatTool>();
					}
					for (String strMcpServerId : mcpServers) {
						try {
							if (strMcpServerId.indexOf("@") != -1) {
								String[] items = strMcpServerId.split("[@]");
								strMcpServerId = items[1];
							}
							IMcpServerAgent iMcpServerAgent = this.getContext().getMcpServerAgent(strMcpServerId);
							List<ChatTool> mcpServerToolList = iMcpServerAgent.getTools();
							if (!ObjectUtils.isEmpty(mcpServerToolList)) {
								tools.addAll(mcpServerToolList);
							}
						} catch (Throwable ex) {
							log.error(ex);
						}
					}
				}

				mcpServers = this.getMcpServers();
				if (!ObjectUtils.isEmpty(mcpServers)) {
					if (tools == null) {
						tools = new ArrayList<ChatTool>();
					}
					for (String strMcpServerId : mcpServers) {
						try {
							if (strMcpServerId.indexOf("@") != -1) {
								String[] items = strMcpServerId.split("[@]");
								strMcpServerId = items[1];
							}
							IMcpServerAgent iMcpServerAgent = this.getContext().getMcpServerAgent(strMcpServerId);
							List<ChatTool> mcpServerToolList = iMcpServerAgent.getTools();
							if (!ObjectUtils.isEmpty(mcpServerToolList)) {
								tools.addAll(mcpServerToolList);
							}
						} catch (Throwable ex) {
							log.error(ex);
						}
					}
				}
				if (!ObjectUtils.isEmpty(tools)) {
					if (bEnableTools) {
						body.put("tools", tools);
					} else if (bSimulateToolCall) {
						Map<String, Object> firstMessage = historyList.get(0);
						String strRoleType = (String) firstMessage.get("role");
						String strPrompt = this.getSimulateToolCallSystemPrompt(tools);
						if ("system".equals(strRoleType)) {
							// 附加
							String strLastContent = (String) firstMessage.get("content");
							if (StringUtils.hasLength(strLastContent)) {
								strLastContent += "\r\n\r\n";
							} else
								strLastContent = "";
							strLastContent += strPrompt;
							firstMessage.put("content", strLastContent);
						} else {
							// 补充系统消息，直接插入第一项
							firstMessage = new LinkedHashMap<String, Object>();
							firstMessage.put("role", "system");
							firstMessage.put("content", strPrompt);
							historyList.add(0, firstMessage);
						}
					}
				}
			}

			Map<String, Object> options = new LinkedHashMap<String, Object>();

			if (chatCompletionRequest.getTemperature() != null) {
				options.put("temperature", chatCompletionRequest.getTemperature());
				body.put("temperature", chatCompletionRequest.getTemperature());
			} else if (this.getAgentData().getTemperature() != null) {
				options.put("temperature", this.getAgentData().getTemperature());
				body.put("temperature", this.getAgentData().getTemperature());
			}

			if (chatCompletionRequest.getMaxTokens() != null) {
				options.put("max_tokens", chatCompletionRequest.getMaxTokens());
				body.put("max_tokens", chatCompletionRequest.getMaxTokens());
			} else if (this.getAgentData().getMaxTokens() != null) {
				options.put("max_tokens", this.getAgentData().getMaxTokens());
				body.put("max_tokens", this.getAgentData().getMaxTokens());
			}

			if (options.size() > 0) {
				body.put("options", options);
			}

			this.onFillChatCompletionBody(chatCompletionRequest, body);

			String strBody = JsonUtils.toString(body);

			int nThinkThreshold = DataTypeUtils.asInteger(this.getAgentData().getThinkThreshold(), -1);

			int nRetryCount = 6;
			for (int i = 0; i < nRetryCount; i++) {
				StringEntity entity = new StringEntity(strBody, ContentType.create(ContentType.APPLICATION_JSON.getMimeType(), "UTF-8"));
				request.setEntity(entity);
				HttpResponse response = httpClient.execute(request);
				// log.debug(response.getEntity());
				int statusCode = response.getStatusLine().getStatusCode();
				if (statusCode == 200) {

					final List<ChatMessage> retMessageList = new ArrayList<>();

					HttpEntity responseEntity = response.getEntity();
					if (bStream) {
						String strLastContent = "";
						if (actionSession != null) {
							if (StringUtils.hasLength(actionSession.getActionResult())) {
								strLastContent = actionSession.getActionResult();
								strLastContent += "\n";
							}
						}
						// 读取响应实体内容
						try (BufferedReader reader = new BufferedReader(new InputStreamReader(responseEntity.getContent()))) {
							// 读取每行事件数据
							StringBuilder sb = new StringBuilder();
							if (StringUtils.hasLength(strLastContent)) {
								sb.append(strLastContent);
							}

							StringBuilder thinkSb = new StringBuilder();
							String strRole = ChatMessageRole.ASSISTANT.getValue().toLowerCase();
							// Map<String, Object> functionMap = null;
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

								if (actionSession != null && this.getContext().isCancelChatCompletion(actionSession)) {
									throw new UserCancelException("用户中断");
								}

								//log.debug(line);
								if (line.indexOf(getChatCompletionDataPrefix()) == 0) {
									line = line.substring(getChatCompletionDataPrefix().length()).trim();
									if (line.equals("[DONE]")) {
										break;
									}
								} else {
									// 判断内容是否为线路维持信号
									if (this.testChatCompletionControlData(line)) {
										continue;
									}
									throw new Exception(String.format("返回内容[%1$s]格式不正确", line));
								}

								// 处理事件数据
								Map ret = JsonUtils.asMap(line);
								Object done = ret.get("done");
								
								// 登记用量
								this.logUsage(ret);

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
											String role = (String) deltaMap.get("role");
											if (StringUtils.hasLength(role)) {
												strRole = role;
											}
										}
										String strFinishReason = (String) map.get("finish_reason");
										if ("stop".equals(strFinishReason)) {
											break;
										} else if ("length".equals(strFinishReason)) {
											log.error(String.format("完成原因为[%1$s]，后续功能将异常", strFinishReason));
										}
										Object tool_calls = deltaMap.get("tool_calls");
										// if(tool_call) {
										if (!ObjectUtils.isEmpty(tool_calls) || "tool_calls".equals(strFinishReason)) {
											if ("tool_calls".equals(strFinishReason) && functionMap != null) {

											} else {
												if (functionMap == null) {
													functionMap = new HashMap<Integer, Map>();
												}

												if (tool_calls instanceof List) {
													List toolCallList = (List) tool_calls;
													if (toolCallList.size() > 0) {
														for (Object item : toolCallList) {
															if (!(item instanceof Map)) {
																continue;
															}

															Map toolCallMap = (Map) item;
															int nIndex = DataTypeUtils.asInteger(toolCallMap.get("index"), -1);
															if (nIndex == -1) {
																continue;
															}

															Map function = (Map) toolCallMap.get("function");
															if (function == null) {
																continue;
															}

															String strId = DataTypeUtils.asString(toolCallMap.get("id"), null);
															String strType = DataTypeUtils.asString(toolCallMap.get("type"), null);

															Map lastFunction = functionMap.get(nIndex);
															if (lastFunction == null) {
																functionMap.put(nIndex, function);
																lastFunction = function;
															} else {
																// 进行合并
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
																		} catch (Throwable ex) {
																			//log.error(String.format("解析内容发生异常，执行兼容处理，%1$s", ex.getMessage()));
																			strLast += arguments;
																			lastFunction.put("arguments", strLast);
																		}
																	} else {
																		strLast += arguments;
																		lastFunction.put("arguments", strLast);
																	}
																}
															}

															if (StringUtils.hasLength(strId)) {
																lastFunction.put("id", strId);
															}

															if (toolCalls == null) {
																toolCalls = new LinkedHashMap<String, Object>();
																toolCallIdMap = new LinkedHashMap<String, String>();
															}
															//toolCalls.put((String) lastFunction.get("name"), lastFunction.get("arguments"));
															//toolCallIdMap.put((String) lastFunction.get("name"), (String) lastFunction.get("id"));
															toolCalls.put((String) lastFunction.get("id"), lastFunction.get("arguments"));
															toolCallIdMap.put((String) lastFunction.get("id"), (String) lastFunction.get("name"));
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
													if (strContent.indexOf("\n</think>\n</think>") == 0) {
														// 截取第一个结束符号
														strContent = strContent.substring(9);
													}

												} else if (!tool_call) {
													tool_call = strContent.indexOf("<tool_call>") == 0;
												}
											} else {
												String strThink = (String) deltaMap.get("reasoning_content");
												if (StringUtils.hasLength(strThink)) {
													thinkSb.append(strThink);
													if (nThinkThreshold > 0) {
														if (thinkSb.length() > nThinkThreshold) {
															throw new Exception(String.format("思考内容超过阈值限制"));
														}
													}
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
								if (sb.toString().indexOf("</think>") == -1) {
									String strContent = "\n</think>\n";
									sb.append(strContent);
									if (actionSession != null) {
										actionSession.updateActionStep(strContent, sb.toString());
									}
								}
							}

							String strContent = sb.toString();
							// 去除前部内容
							if (StringUtils.hasLength(strLastContent)) {
								strContent = strContent.substring(strLastContent.length());
							}
							if (!ObjectUtils.isEmpty(strRole) && (!ObjectUtils.isEmpty(strContent) || toolCalls != null)) {
								if (!bEnableTools) {
									if (bSimulateToolCall) {
										if (simulateToolCallPattern.matcher(strContent).find()) {
											String strRealContent = hasThinkContent ? extractRealContent(strContent) : strContent;
											List<String> toolCallList = extractSimulateToolCallContent(strRealContent);
											if (!ObjectUtils.isEmpty(toolCallList)) {
												return this.doChatCompletionSimulateToolCall(actionSession, chatCompletionRequest, strContent, strRealContent, toolCallList);
											}
										}
									} else {
										// 判断是否有自定义调用指令
										if (toolCallPattern.matcher(strContent).find()) {
											String strRealContent = hasThinkContent ? extractRealContent(strContent) : strContent;
											List<String> toolCallList = extractToolCallContent(strRealContent);
											if (!ObjectUtils.isEmpty(toolCallList)) {
												return this.doChatCompletionToolCall(actionSession, chatCompletionRequest, strContent, strRealContent, toolCallList);
											}
										}
									}

								}
								if (toolCalls != null) {
									List<Map> functionList = new ArrayList<Map>();
									for (java.util.Map.Entry<Integer, Map> entry : functionMap.entrySet()) {
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
									if (bRemoveOutputThink) {
										chatMessage.setContent(hasThinkContent ? extractRealContent(strContent) : strContent);
									} else {
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
						
						this.logUsage(ret);
						
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
							String strReasoningContent = (String) map.get(FIELD_REASONING_CONTENT);
							if (ObjectUtils.isEmpty(strContent) && StringUtils.hasLength(strReasoningContent)) {
								strContent = strReasoningContent;
							}
							Object tool_calls = map.get("tool_calls");
							if ((ObjectUtils.isEmpty(strRole) || (ObjectUtils.isEmpty(strContent)) && ObjectUtils.isEmpty(tool_calls))) {
								log.error(String.format("返回内容无效"));
							} else {
								if (!ObjectUtils.isEmpty(tool_calls)) {
									List list = (List) tool_calls;
									Map<String, Object> toolCalls = new LinkedHashMap<String, Object>();
									Map<String, String> toolCallIdMap = new LinkedHashMap<String, String>();
									for (Object item : list) {
										Map toolCallMap = (Map) item;
										Map<String, Object> functionMap2 = (Map) toolCallMap.get("function");
										if (functionMap2 != null) {
											String func_name = (String) functionMap2.get("name");
											Object arguments = functionMap2.get("arguments");
											toolCalls.put((String) toolCallMap.get("id"), arguments);
											toolCallIdMap.put((String) toolCallMap.get("id"), func_name);
										}
									}
									strContent = extractRealContent(strContent);
									return this.doChatCompletionToolCall(null, chatCompletionRequest, strContent, toolCalls, toolCallIdMap, (List) list);

								} else {
									// 以下代码有问题
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
							if (i + 1 < nRetryCount) {
								log.debug(String.format("未返回有效内容，尝试再次调用[%1$s]", i));
								Thread.sleep(200);
								continue;
							}

							log.error(String.format("无法解析消息内容，返回内容：\r\n%1$s", responseBody));
							throw new Exception(String.format("无法解析消息内容，返回内容：\r\n%1$s", responseBody));
						}
					}

					if (ObjectUtils.isEmpty(retMessageList)) {
						if (i + 1 < nRetryCount) {
							log.debug(String.format("未返回有效内容，尝试再次调用[%1$s]", i));
							Thread.sleep(250);
							continue;
						}

						throw new Exception(String.format("未返回任何内容"));
					}

					ChatCompletionResult chatCompletionResult = new ChatCompletionResult();
					chatCompletionResult.setChoices(retMessageList);
					
					ChatCompletionUsage chatCompletionUsage = new ChatCompletionUsage();
					chatCompletionUsage.setPromptTokens(this.getTotalPromptTokens());
					chatCompletionUsage.setCompletionTokens(this.getTotalCompletionTokens());
					chatCompletionUsage.setTotalTokens(this.getTotalPromptTokens() + this.getTotalCompletionTokens());
					chatCompletionUsage.setToolCalls(getLoopCallCount() - 1 + this.getTotalToolCalls());
					chatCompletionResult.setUsage(chatCompletionUsage);
					
					return chatCompletionResult;

				} else {
					//返回返回代码，如果是429，则重试
					String errorInfo = String.format("请求发生异常[%1$s]", response.getStatusLine().getStatusCode());
					String strResponseBody = null;
					try {
						strResponseBody = EntityUtils.toString(response.getEntity());
						errorInfo += ("：" + strResponseBody);
					} catch (Exception ex) {
					}
					
					if(response.getStatusLine().getStatusCode() == HttpStatus.TOO_MANY_REQUESTS.value()) {
						if (i + 1 < nRetryCount) {
							log.debug(String.format("返回429[%2$s]，尝试再次调用[%1$s]", i, errorInfo));
							Thread.sleep(250);
							continue;
						}
					}
					
					
					throw new WebResponseException(response.getStatusLine().getStatusCode(), errorInfo, strResponseBody);
				}
			}
		}

		throw new Exception(String.format("循环跳出"));
	}
	
	protected void logUsage(Map<String, Object> ret) {
		// 登记用量
		Object usage = ret.get("usage");
		if(usage instanceof Map) {
			Map usageMap = (Map)usage;
			int nPromptTokens = DataTypeUtils.asInteger(usageMap.get("prompt_tokens"), 0);
			int nCompletionTokens = DataTypeUtils.asInteger(usageMap.get("completion_tokens"), 0);
			if(nPromptTokens >0) {
				this.increasePromptTokens(nPromptTokens);
			}
			if(nCompletionTokens >0) {
				this.increaseCompletionTokens(nCompletionTokens);
			}
		}
	}
	

	protected void onFillChatCompletionRequest(ChatCompletionRequest chatCompletionRequest, HttpPost request) throws Exception {

	}

	/**
	 * 填充聊天资料
	 * 
	 * @param chatCompletionRequest
	 * @throws Exception
	 */
	protected void onFillChatCompletionChunks(ChatCompletionRequest chatCompletionRequest) throws Exception {

		String strChunkSection = chatCompletionRequest.getChunkSection();
		if (ObjectUtils.isEmpty(strChunkSection)) {
			strChunkSection = this.getAgentData().getChunkSection();
			if (ObjectUtils.isEmpty(strChunkSection)) {
				strChunkSection = AIAccess.CHUNKSECTION_REMOTE;
			}
		}

		List<Chunk> totalChunkList = new ArrayList<Chunk>();

		if (!ObjectUtils.isEmpty(chatCompletionRequest.getChunks())) {
			totalChunkList.addAll(chatCompletionRequest.getChunks());
		}

		if (!ObjectUtils.isEmpty(chatCompletionRequest.getKnowledgeBases())) {
			ICloudKBClient iCloudKBClient = this.getSysCloudClientUtilRuntime().getServiceClient(ICloudUtilRuntime.CLOUDCONFIGID_KB, ICloudKBClient.class, false);
			ActionSession actionSession = ActionSessionManager.getCurrentSession();
			List<String> kbids = chatCompletionRequest.getKnowledgeBases();

			String strChunkViewUrl = chatCompletionRequest.getChunkViewUrl();
			if (ObjectUtils.isEmpty(strChunkViewUrl)) {
				strChunkViewUrl = this.getAgentData().getChunkViewUrl();
			}

			if (StringUtils.hasLength(strChunkViewUrl)) {
				if (strChunkViewUrl.equalsIgnoreCase("no") || strChunkViewUrl.equalsIgnoreCase("false")) {
					strChunkViewUrl = "";
					strChunkSection = AIAccess.CHUNKSECTION_NO;
				}
			} else {
				strChunkViewUrl = "chunkview://{id}";
			}

			// boolean bAppendChunkViewUrl = false;

			float fThreshold = 0.3f;
			if (chatCompletionRequest.getChunkThreshold() != null) {
				fThreshold = chatCompletionRequest.getChunkThreshold();
			} else if (this.getAgentData().getChunkThreshold() != null) {
				fThreshold = this.getAgentData().getChunkThreshold();
			}

			if (fThreshold <= 0.0 || fThreshold > 1.0) {
				log.debug(String.format("相似度阈值[%1$s]无效，调整为默认", fThreshold));
				fThreshold = 0.3f;
			}

			boolean bSetReRank = false;
			int nReRank = IChunkSearchContext.TEXTRERANK_AUTO;
			if (chatCompletionRequest.getChunkReRank() != null) {
				nReRank = chatCompletionRequest.getChunkReRank();
				bSetReRank = true;
			} else if (this.getAgentData().getChunkReRank() != null) {
				nReRank = this.getAgentData().getChunkReRank();
				bSetReRank = true;
			}

			if (nReRank < IChunkSearchContext.TEXTRERANK_DISABLED || nReRank > IChunkSearchContext.TEXTRERANK_AUTO) {
				log.debug(String.format("重排序[%1$s]无效，调整为默认", nReRank));
				nReRank = IChunkSearchContext.TEXTRERANK_AUTO;
			}

			boolean bSetPageIndex = false;
			int nPageIndex = IChunkSearchContext.PAGEINDEX_DISABLED;
			if (chatCompletionRequest.getChunkPageIndex() != null) {
				nPageIndex = chatCompletionRequest.getChunkPageIndex();
				bSetPageIndex = true;
			} else if (this.getAgentData().getChunkPageIndex() != null) {
				nPageIndex = this.getAgentData().getChunkPageIndex();
				bSetPageIndex = true;
			}

			if (nPageIndex < IChunkSearchContext.PAGEINDEX_DISABLED || nPageIndex > IChunkSearchContext.PAGEINDEX_AUTO) {
				log.debug(String.format("目录索引[%1$s]无效，调整为默认", nPageIndex));
				nPageIndex = IChunkSearchContext.PAGEINDEX_DISABLED;
			}

			List<String> queries = chatCompletionRequest.getChunkQueries();
			String strQuery = null;
			Map<String, Object> metadata = null;

			List<Chunk> chunkList = new ArrayList<Chunk>();

			StringBuilder sb = new StringBuilder();
			if (actionSession != null) {
				String strLastResult = actionSession.getActionResult();
				if (StringUtils.hasLength(strLastResult)) {
					sb.append(strLastResult + "\n");
				}
			}

			for (int i = 0; i < kbids.size(); i++) {
				if (actionSession != null) {
					String strStep = String.format("%1$s\n", TOOL_CALL_BEGIN);
					if (i == 0) {
						strStep = "\n" + strStep;
					}

					sb.append(strStep);
					actionSession.updateActionStep(strStep, sb.toString());
				}

				ObjectNode toolCallStepNode = JsonUtils.createObjectNode();
				toolCallStepNode.put("name", String.format("知识库查询[%1$s]", kbids.get(i)));
				toolCallStepNode.put("type", "fetch_chunks");

				String strErrorInfo = null;
				try {
					ChunkSearchContext chunkSearchContext = new ChunkSearchContext();
					chunkSearchContext.setTextReRank(nReRank);
					chunkSearchContext.setSimilarityThreshold(fThreshold);
					chunkSearchContext.setKBGuidance(EntityBase.BOOLEAN_TRUE);
					if (bSetPageIndex) {
						chunkSearchContext.setPageIndex(nPageIndex);
					}
					chunkSearchContext.setPageable(ISearchContext.STARTPAGE, DataTypeUtils.asInteger(chatCompletionRequest.getMaxChunks(), 10), 0);
					// chunkSearchContext.setGraphRAG(IChunkSearchContext.GRAPHRAG_ENABLED);
					if (AIAccess.CHUNKSECTION_REMOTE.equalsIgnoreCase(strChunkSection)) {
						String letter = String.valueOf((char) ('a' + i));
						chunkSearchContext.setChunkSNPrefix(String.format("资料%1$s", letter));
						chunkSearchContext.setChunkViewUrl(strChunkViewUrl);
					}

					Page<Chunk> chunks = null;
					if (ObjectUtils.isEmpty(strQuery) && ObjectUtils.isEmpty(queries)) {
						chunkSearchContext.set(IChunkSearchContext.PARAM_HISTORIES, chatCompletionRequest.getMessages());
						chunks = iCloudKBClient.fetchChunksByHistories(kbids.get(i), chunkSearchContext);
					} else {
						// 如果已经换算Query，则后续查询直接使用Query
						chunkSearchContext.setQuery(strQuery);
						if (!ObjectUtils.isEmpty(queries)) {
							chunkSearchContext.setQueries(queries);
						}
						// 进一步放入
						if (metadata != null) {
							if (ObjectUtils.isEmpty(queries)) {
								chunkSearchContext.set(IChunkSearchContext.PARAM_QUERIES, metadata.get(IChunkSearchContext.PARAM_QUERIES));
							}
							chunkSearchContext.set(IChunkSearchContext.PARAM_TRIPLET, metadata.get(IChunkSearchContext.PARAM_TRIPLET));
							chunkSearchContext.set(IChunkSearchContext.PARAM_TRIPLETS, metadata.get(IChunkSearchContext.PARAM_TRIPLETS));
						}
						chunks = iCloudKBClient.fetchChunks(kbids.get(i), chunkSearchContext);
					}

					toolCallStepNode.set("parameters", JsonUtils.toJsonNode(chunkSearchContext));

					chunkList.addAll(chunks.getContent());

					Map<String, Object> ret = new LinkedHashMap<String, Object>();
					if (chunks instanceof IPage) {
						IPage iPage = (IPage) chunks;
						if (iPage.getMetadata() != null) {
							ret.putAll(iPage.getMetadata());
							if (metadata == null) {
								metadata = new HashMap<String, Object>(iPage.getMetadata());
							}
						}
					}
					ret.put("chunks", chunks.getContent());
					// metadata 里面传递了query及original属性
					if (ObjectUtils.isEmpty(strQuery)) {
						strQuery = DataTypeUtils.asString(ret.get("query"));
					} else {
						// 仿真写回
						ret.put("query", strQuery);
					}
					if (!ObjectUtils.isEmpty(queries)) {
						ret.put("queries", queries);
					}

					if (actionSession != null) {
						toolCallStepNode.put("error", false);
						toolCallStepNode.put("result", JsonUtils.toString(ret));
						String strStep = toolCallStepNode.toPrettyString();
						sb.append(strStep);
						actionSession.updateActionStep(strStep, sb.toString());
					}
				} catch (Throwable ex) {
					strErrorInfo = ex.getMessage();
				}
				if (actionSession != null) {
					if (StringUtils.hasLength(strErrorInfo)) {
						toolCallStepNode.put("error", true);
						toolCallStepNode.put("result", strErrorInfo);
						String strStep = toolCallStepNode.toPrettyString();
						sb.append(strStep);
						actionSession.updateActionStep(strStep, sb.toString());
					}
					String strStep = String.format("\n%1$s\n", TOOL_CALL_END);
					sb.append(strStep);
					actionSession.updateActionStep(strStep, sb.toString());
				}
			}

			if (!ObjectUtils.isEmpty(chunkList)) {
				// doFillChatCompletionChunks(chatCompletionRequest, chunkList,
				// AIAccess.CHUNKSECTION_LOCAL.equalsIgnoreCase(strChunkSection));
				totalChunkList.addAll(chunkList);
			}
		}

		if (!ObjectUtils.isEmpty(totalChunkList)) {
			doFillChatCompletionChunks(chatCompletionRequest, totalChunkList, AIAccess.CHUNKSECTION_LOCAL.equalsIgnoreCase(strChunkSection));
		}
	}

	protected void doFillChatCompletionChunks(ChatCompletionRequest chatCompletionRequest, List<Chunk> chunkList, boolean bAppendChunkSection) throws Exception {

		// 提取资料库介绍
		List<Chunk> chunkList2 = new ArrayList<Chunk>();
		List<Chunk> kbGuidanceList = new ArrayList<Chunk>();

		for (Chunk chunk : chunkList) {
			if (!StringUtils.hasLength(chunk.getContent())) {
				continue;
			}

			if (ChunkType.SOURCE.getValue().equals(chunk.getType())) {
				// 抛弃
				continue;
			}

			if (ChunkType.KBGUIDANCE.getValue().equals(chunk.getType())) {
				kbGuidanceList.add(chunk);
				continue;
			}

			if (ChunkType.GRAPH.getValue().equals(chunk.getType())) {
				kbGuidanceList.add(chunk);
				continue;
			}

			chunkList2.add(chunk);
		}

		chunkList.clear();
		chunkList.addAll(chunkList2);

		// 片段排序
		Collections.sort(chunkList, new Comparator<Chunk>() {
			@Override
			public int compare(Chunk o1, Chunk o2) {
				Double f1 = DataTypeUtils.asDouble(o1.getSimilarity(), new Double(0.0f));
				Double f2 = DataTypeUtils.asDouble(o2.getSimilarity(), new Double(0.0f));
				return f2.compareTo(f1);
			}
		});

		int nInsertPos = 0;
		if (ChatMessageRole.SYSTEM.getValue().equalsIgnoreCase(chatCompletionRequest.getMessages().get(0).getRole())) {
			nInsertPos = 1;
		}

		StringBuilder sb = new StringBuilder();

		String strChunkPrompt = chatCompletionRequest.getChunkPrompt();
		if (ObjectUtils.isEmpty(strChunkPrompt)) {
			strChunkPrompt = this.getAgentData().getChunkPrompt();
		}

		if (StringUtils.hasLength(strChunkPrompt)) {
			if (!strChunkPrompt.equalsIgnoreCase("no") && !strChunkPrompt.equalsIgnoreCase("false")) {
				sb.append(strChunkPrompt);
			}
		} else {
			sb.append("下面将输出根据会话从资料库中检索的内容，供你在后续的交谈中使用。如你的回答涉及引用资料，则必须精准、客观 。杜绝信息幻觉：严禁编造、夸大或组合片段信息来生成片段中不存在的答案。对于片段信息不足的问题，必须如实告知。\n" + "**注意**：输出内容如引用资料片段，需要显式声明及提供资料片段的访问链接`url`，如::[资料a1](chunkview://{chunkid})");

			// sb.append("下面将输出根据会话从资料库中检索的内容，需要你基于提供的“资料片段”来回答问题。你的回答必须精准、客观，且每一句陈述都有来自片段的依据
			// 。\r\n" +
			// "### 基本原则与规则\r\n" +
			// "- 为确保回答的准确性与可靠性，你必须严格遵守以下规则：\r\n" +
			// "- 严格基于片段：你的所有回答必须完全基于当次提问所附的“资料库资料片段”。严禁使用片段之外的内外部知识或主观臆断 。\r\n"
			// +
			// "- 杜绝信息幻觉：严禁编造、夸大或组合片段信息来生成片段中不存在的答案。对于片段信息不足的问题，必须如实告知。");
		}

		if (!ObjectUtils.isEmpty(kbGuidanceList)) {
			sb.append("\r\n\r\n");
			for (Chunk chunk : kbGuidanceList) {
				if (bAppendChunkSection) {
					if (ChunkType.GRAPH.getValue().equals(chunk.getType())) {
						if (StringUtils.hasLength(chunk.getKBName())) {
							sb.append(String.format("# 资料库`%1$s`知识图谱\r\n", chunk.getKBName()));
						} else {
							sb.append(String.format("# 资料库知识图谱\r\n"));
						}
						sb.append("---\r\n");
					} else {
						if (StringUtils.hasLength(chunk.getKBName())) {
							sb.append(String.format("# 资料库简介`%1$s`\r\n", chunk.getKBName()));
						} else {
							sb.append(String.format("# 资料库简介\r\n"));
						}
						sb.append("---\r\n");
					}
				}

				sb.append(chunk.getContent());
				sb.append("\r\n");
			}
		}

		sb.append("\r\n\r\n");
		int nSize = Math.min(DataTypeUtils.asInteger(chatCompletionRequest.getMaxChunks(), 10), chunkList.size());
		int nIndex = 1;
		for (int i = 0; i < nSize; i++) {
			Chunk chunk = chunkList.get(i);
			if (!StringUtils.hasLength(chunk.getContent())) {
				continue;
			}

			if (ChunkType.SOURCE.getValue().equals(chunk.getType())) {
				continue;
			}
			if (bAppendChunkSection) {
				if (StringUtils.hasLength(chunk.getDocName())) {
					sb.append(String.format("# 资料`%1$s`，url`chunkview://%2$s`，来自文档`%3$s`\r\n", nIndex, chunk.getId(), chunk.getDocName()));
				} else {
					sb.append(String.format("# 资料`%1$s`，url`chunkview://%2$s`\r\n", nIndex, chunk.getId()));
				}
				sb.append("---\r\n");
			}

			sb.append(chunk.getContent());
			sb.append("\r\n");
			nIndex++;
		}

		log.debug(String.format("资料清单\r\n%1$s", sb.toString()));

		chatCompletionRequest.getMessages().addAll(nInsertPos, ChatMessagesBuilder.create().user(sb.toString()).assistant("明白").build());
	}

	/**
	 * 填充聊天交互请求Body
	 * 
	 * @param chatCompletionRequest
	 * @param body
	 * @throws Exception
	 */
	protected void onFillChatCompletionBody(ChatCompletionRequest chatCompletionRequest, Map<String, Object> body) throws Exception {
		if (!ObjectUtils.isEmpty(this.getAgentData().getExtraParams())) {
			body.putAll(this.getAgentData().getExtraParams());
		}

	}

	protected void onFillChatMessageBody(ChatMessage chatMessage, Map<String, Object> body) throws Exception {

	}

	protected Object getMessageContent(ChatMessage message, ChatCompletionRequest chatCompletionRequest) {
		if (message.getRawContent() instanceof String && StringUtils.hasLength(message.getContent())) {
			String strContent = message.getContent();
			// 判断角色
			if (ChatMessageRole.ASSISTANT.getValue().equalsIgnoreCase(message.getRole())) {
				// 去除上行中的资料链接
				strContent = chunkViewPattern.matcher(strContent).replaceAll("");
				strContent = chunkViewPattern2.matcher(strContent).replaceAll("");
			}

			if (this.isEnableDescOSSImage()) {
				return this.replaceImagesWithText(strContent, chatCompletionRequest);
			}
			return strContent;
		}
		return null;
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

		// 重新分析工具调用数据，调整
		if (!ObjectUtils.isEmpty(toolCalls)) {
			for (String strFunction : toolCalls.keySet()) {
				Object value = toolCalls.get(strFunction);
				if (ObjectUtils.isEmpty(value)) {
					continue;
				}

				if (value instanceof String) {
					// 调整为Json
					String strValue = (String) value;
					strValue = strValue.trim();
					if (strValue.indexOf("{") == 0) {
						try {
							ObjectNode node = JsonUtils.toObjectNode(strValue);
							toolCalls.put(strFunction, node);
							continue;
						} catch (Throwable ex) {
							log.error(String.format("尝试将工具调用数据[%1$s]调整为JsonObject发生异常，%2$s", strValue, ex.getMessage()));
						}

						try {
							JsonNode node = AIChatUtils.getJsonNode(strValue, true);
							if (node != null) {
								toolCalls.put(strFunction, node);
								continue;
							}
						} catch (Throwable ex) {
							log.error(String.format("尝试将工具调用数据[%1$s]调整为JsonObject发生异常，%2$s", strValue, ex.getMessage()));
						}

						strValue += "}";
						try {
							ObjectNode node = JsonUtils.toObjectNode(strValue);
							toolCalls.put(strFunction, node);
							continue;
						} catch (Throwable ex) {
							log.error(String.format("尝试将工具调用数据[%1$s]调整为JsonObject发生异常，%2$s", strValue, ex.getMessage()));
						}
					}
				}
			}
		}

		if (!ObjectUtils.isEmpty(toolCalls)) {
			if (functionList != null) {
				ChatMessage chatMessage = new ChatMessage();
				chatMessage.setRole(ChatMessageRole.ASSISTANT.getValue());
				chatMessage.setContent(strContent);
				chatMessage.set("tool_calls", functionList);
				list.add(chatMessage);

				log.debug(String.format("tool_calls\r\n%1$s", JsonUtils.toString(functionList)));

			} else {
				String strRealContent = extractRealContent(strContent);
				if (strRealContent != null) {
					strRealContent = strRealContent.trim();
				}
				if (StringUtils.hasLength(strRealContent)) {
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
					if (this.getToolCallStep() >= AIAccess.TOOLCALLSTEP_ENABLED) {
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
				
				String strFunctionName = toolCallIdMap.get(call.getKey());
				
				toolCallStepNode.put("name", strFunctionName);
				if (call.getValue() == null) {
					toolCallStepNode.putNull("parameters");
				} else {
					if(call.getValue() instanceof JsonNode) {
						toolCallStepNode.set("parameters",(JsonNode) call.getValue());
					}
					else {
						toolCallStepNode.set("parameters", JsonUtils.toJsonNode(call.getValue()));
					}
					
				}

				try {

					if (getLoopCallCount() > this.getToolMaxCalls()) {
						throw new Exception(this.getToolExceedMessage());
					}

					ChatFunction chatFunction = chatFunctionMap.get(strFunctionName);
					String strResult = null;
					if (chatFunction != null) {
						strResult = this.doToolCall(chatFunction, call.getValue());
					} else {
						strResult = this.doToolCall(strFunctionName, call.getValue(), chatCompletionRequest);
					}

					
					if (actionSession != null) {
						// String strStep = String.format("%1$s(%2$s)\n",
						// call.getKey(), call.getValue());
						if (this.getToolCallStep() >= AIAccess.TOOLCALLSTEP_ENABLED) {
							toolCallStepNode.put("error", false);
							if (this.getToolCallStep() == AIAccess.TOOLCALLSTEP_RESULT) {
								toolCallStepNode.put("result", strResult);
							}
							String strStep = toolCallStepNode.toPrettyString();
							strContent += strStep;
							actionSession.updateActionStep(strStep, strContent);
						}

					}

					log.debug(String.format("工具[%1$s]调用返回：%2$s", call.getKey(), strResult));

					if (chatFunction != null && TOOL_CALL_EXECUTE_CHAT.equalsIgnoreCase(chatFunction.getName())) {
						// 判断是否返回PortalAction
						if (!ObjectUtils.isEmpty(strResult)) {
							String strActionResult = actionSession.getActionResult();
							if (StringUtils.hasLength(strActionResult)) {
								Thread.sleep(200);
								String strLastContent = AIChatUtils.removeThinkingContent(strActionResult);
								ObjectNode jsonNode = JsonUtils.createObjectNode();
								if (StringUtils.hasLength(strLastContent)) {
									jsonNode.put("title", strLastContent);
								}
								jsonNode.put("content", strActionResult);
								String strStepContent = String.format("\r\n<%1$s>\r\n%2$s\r\n</%1$s>\r\n", DELogicSysAIChatAgentType.CHATSTEP.name().toLowerCase(), jsonNode.toPrettyString());
								actionSession.updateActionStep(strStepContent, 0.0, strStepContent);
								Thread.sleep(200);
								actionSession.updateActionStep("", 0.0, "");
							}

							// 尝试转化
							PortalAsyncAction portalAsyncAction = null;
							try {
								// 关闭ToolCall
								Thread.sleep(200);
								portalAsyncAction = JsonUtils.as(strResult, PortalAsyncAction.class);
							} catch (Throwable ex) {
								log.error(String.format("无法处理execute_chat返回:\n%1$s", strResult));
							}

							if (portalAsyncAction != null && StringUtils.hasLength(portalAsyncAction.getAsyncAcitonId())) {
								try {
									ChatCompletionResult result = this.doExecuteChatPortalAsyncActionOutput(portalAsyncAction);
									if(result.getUsage() != null) {
										//登记用量
										this.increasePromptTokens(DataTypeUtils.asInteger(result.getUsage().getPromptTokens(), 0));
										this.increaseCompletionTokens(DataTypeUtils.asInteger(result.getUsage().getCompletionTokens(), 0));
										this.increaseToolCalls(DataTypeUtils.asInteger(result.getUsage().getToolCalls(), 0));
									}
									strActionResult = result.getChoices().get(0).getContent();
									String strChatResult = AIChatUtils.removeToolCallContent(strActionResult);
									strChatResult = AIChatUtils.removeThinkingContent(strChatResult);
									strResult = strChatResult;

									String output_mode = "chat";
									if (call.getValue() != null) {
										try {
											Map map = JsonUtils.asMap(call.getValue());
											if (map != null) {
												output_mode = DataTypeUtils.asString(map.get("output_mode"), output_mode);
											}
										} catch (Throwable ex) {
											log.error(ex);
										}
									}

									if ("chat".equalsIgnoreCase(output_mode)) {
										result.getChoices().get(0).setContent(strResult);
										return result;
									}
									if (StringUtils.hasLength(strActionResult)) {
										Thread.sleep(200);
										ObjectNode jsonNode = JsonUtils.createObjectNode();
										if (StringUtils.hasLength(strResult)) {
											jsonNode.put("title", strResult);
										}
										jsonNode.put("content", strActionResult);
										String strStepContent = String.format("\r\n<%1$s>\r\n%2$s\r\n</%1$s>\r\n", DELogicSysAIChatAgentType.CHATSTEP.name().toLowerCase(), jsonNode.toPrettyString());
										actionSession.updateActionStep(strStepContent, 0.0, strStepContent);
										Thread.sleep(200);
										actionSession.updateActionStep("", 0.0, "");
									}
								} catch (Throwable ex) {
									strResult = String.format("工具调用异常：%1$s", ex.getMessage());
								}
							}
						}
					}
					
					ChatMessage chatMessage = new ChatMessage();
					chatMessage.setRole(ChatMessageRole.TOOL.getValue());
					if(StringUtils.hasLength(strResult)) {
						chatMessage.setContent(strResult);
					}
					else {
						if(call.getValue() instanceof String) {
							chatMessage.setContent(String.format("工具调用没有返回任何内容，可能是工具调用数据有误或被截断，调用参数如下：\n%1$s", call.getValue()));
						}
						else {
							chatMessage.setContent(String.format("工具调用没有返回任何内容"));
						}
					}
					
					chatMessage.setToolName(strFunctionName);
					chatMessage.setToolCallId(call.getKey());
					list.add(chatMessage);

				} catch (Throwable ex) {
					log.error(ex);
					ChatMessage chatMessage = new ChatMessage();
					chatMessage.setRole(ChatMessageRole.TOOL.getValue());
					chatMessage.setContent(String.format("工具调用异常：%1$s", ex.getMessage()));
					chatMessage.setToolCallId(call.getKey());
					list.add(chatMessage);
					strErrorInfo = ex.getMessage();
				}

				if (actionSession != null) {
					if (this.getToolCallStep() >= AIAccess.TOOLCALLSTEP_ENABLED) {
						if (StringUtils.hasLength(strErrorInfo)) {
							// String strStep = String.format("工具调用异常：%1$s\n",
							// call.getKey(), call.getValue());
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
			
			chatCompletionRequest.setMessages(list);
			return this.onChatCompletion(chatCompletionRequest);
		}
		else {
			throw new Exception(String.format("无效的工具调用数据，可能因为内容过长导致截断等"));
		}
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

		for (String strToolCallContent : toolCallList) {

			StringBuilder sb = new StringBuilder();

			ConfigEntityEx configEntityEx = new ConfigEntityEx(strToolCallContent, true);
			Map<String, Object> map = configEntityEx.any();
			String strMethodName = (String) map.remove("method");
			String strDesc = (String) map.remove("desc");
			// if(!StringUtils.hasLength(strDesc)) {
			// strDesc = strMethodName;
			// }

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
				if (StringUtils.hasLength(strDesc)) {
					sb.append(String.format("tool_call[%1$s][%2$s]返回以下信息：\n%3$s\n", strMethodName, strDesc, strResult));
				} else {
					sb.append(String.format("tool_call[%1$s]返回以下信息：\n%2$s\n", strMethodName, strResult));
				}
				// if(toolCallList.size() == 1) {
				// sb.append(strResult);
				// }
				// else {
				// //sb.append(String.format("tool_call[%1$s]调用返回：\n%2$s\n",
				// strMethodName, strResult));
				// sb.append(strResult);
				// }
			} catch (Throwable ex) {
				log.error(ex);
				// if(toolCallList.size() == 1) {
				// sb.append(String.format("工具调用异常：%1$s", ex.getMessage()));
				// }
				// else {
				// //sb.append(String.format("tool_call[%1$s]调用异常：%2$s\n",
				// strMethodName, ex.getMessage()));
				// sb.append(String.format("工具调用异常：%1$s", ex.getMessage()));
				// }
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

	protected ChatCompletionResult doChatCompletionSimulateToolCall(ActionSession actionSession, ChatCompletionRequest chatCompletionRequest, String strContent, String strRealContent, List<String> toolCallList) throws Throwable {
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

		boolean bFirst = true;

		for (String strToolCallContent : toolCallList) {

			StringBuilder sb = new StringBuilder();

			String strMethodName = extractSimulateToolCallName(strToolCallContent);
			String strArguments = extractSimulateToolCallArguments(strToolCallContent);
			Map<String, Object> map = null;
			if (StringUtils.hasLength(strArguments)) {
				map = JsonUtils.asMap(strArguments);
			} else {
				map = new LinkedHashMap<String, Object>();
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

			if (actionSession != null) {
				if (this.getToolCallStep() >= AIAccess.TOOLCALLSTEP_ENABLED) {
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
			toolCallStepNode.put("name", strMethodName);
			toolCallStepNode.set("parameters", JsonUtils.toJsonNode(map));

			try {

				if (getLoopCallCount() > this.getToolMaxCalls()) {
					throw new Exception(this.getToolExceedMessage());
				}
				ChatFunction chatFunction = chatFunctionMap.get(strMethodName);
				String strResult = null;
				if (chatFunction != null) {
					strResult = this.doToolCall(chatFunction, map);
				} else {
					strResult = this.doToolCall(strMethodName, map, chatCompletionRequest);
				}

				if (actionSession != null) {
					// String strStep = String.format("%1$s(%2$s)\n",
					// call.getKey(), call.getValue());
					if (this.getToolCallStep() >= AIAccess.TOOLCALLSTEP_ENABLED) {
						toolCallStepNode.put("error", false);
						if (this.getToolCallStep() == AIAccess.TOOLCALLSTEP_RESULT) {
							toolCallStepNode.put("result", strResult);
						}
						String strStep = toolCallStepNode.toPrettyString();
						strContent += strStep;
						actionSession.updateActionStep(strStep, strContent);
					}

				}

				log.debug(String.format("---------------------------------------------------------------------------------------------------------------"));
				log.debug(String.format("工具[%1$s]调用返回：%2$s", strMethodName, strResult));
				sb.append(String.format("\r\n<tool_use_result>\r\n" + "				  <name>%1$s</name>\r\n" + "				  <result>%2$s</result>\r\n" + "				</tool_use_result>", strMethodName, strResult));

				// if(toolCallList.size() == 1) {
				// sb.append(strResult);
				// }
				// else {
				// //sb.append(String.format("tool_call[%1$s]调用返回：\n%2$s\n",
				// strMethodName, strResult));
				// sb.append(strResult);
				// }
			} catch (Throwable ex) {
				log.error(ex);
				// if(toolCallList.size() == 1) {
				// sb.append(String.format("工具调用异常：%1$s", ex.getMessage()));
				// }
				// else {
				// //sb.append(String.format("tool_call[%1$s]调用异常：%2$s\n",
				// strMethodName, ex.getMessage()));
				// sb.append(String.format("工具调用异常：%1$s", ex.getMessage()));
				// }
				// sb.append(String.format("tool_call[%1$s]发生异常：%2$s\n请停止输出并与管理员联系",
				// strMethodName, ex.getMessage()));
				sb.append(String.format("\r\n<tool_use_result>\r\n" + "				  <name>%1$s</name>\r\n" + "				  <result>调用发生异常：%2$s\r\n请停止输出并与管理员联系</result>\r\n" + "				</tool_use_result>", strMethodName, ex.getMessage()));

				// ChatMessage chatMessage = new ChatMessage();
				// chatMessage.setRole(ChatMessageRole.TOOL.getValue());
				// chatMessage.setContent(String.format("工具调用异常：%1$s",
				// ex.getMessage()));
				// chatMessage.setToolCallId(toolCallIdMap.get(call.getKey()));
				// list.add(chatMessage);
				strErrorInfo = ex.getMessage();
			}

			if (actionSession != null) {
				if (this.getToolCallStep() >= AIAccess.TOOLCALLSTEP_ENABLED) {
					if (StringUtils.hasLength(strErrorInfo)) {
						// String strStep = String.format("工具调用异常：%1$s\n",
						// call.getKey(), call.getValue());
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

			ChatMessage chatMessage = new ChatMessage();
			chatMessage.setRole(ChatMessageRole.USER.getValue());
			chatMessage.setContent(sb.toString());
			list.add(chatMessage);
		}

		chatCompletionRequest.setMessages(list);
		return this.onChatCompletion(chatCompletionRequest);
	}

	@Override
	protected String doToolCall(ChatFunction chatFunction, Object arg) throws Throwable {
		String ret = super.doToolCall(chatFunction, arg);
		return ret;
	}

	protected ChatCompletionResult doExecuteChatPortalAsyncActionOutput(PortalAsyncAction portalAsyncAction) throws Throwable {
		long nCurrentTime = System.currentTimeMillis();
		long nTimeout = 3000000;

		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();

		ISysPortalUtilRuntime iSysPortalUtilRuntime = this.getSystemRuntime().getSysPortalUtilRuntime(false);
		ChatCompletionResult chatCompletionResult = null;
		while (true) {

			if (this.isCancelChatCompletion(actionSession)) {
				// 外侧用户已经取消，取消实际聊天
				throw new UserCancelException("用户取消");
			}

			PortalAsyncAction last = iSysPortalUtilRuntime.getAsyncAction(portalAsyncAction.getAsyncAcitonId());

			double fCompletionRate = 0.0f;
			if (last.getCompletionRate() != null) {
				fCompletionRate = last.getCompletionRate().doubleValue();
			}

			if (DataTypeUtils.compare(actionSession.getActionStep(), last.getStepInfo(), false) != 0) {
				nCurrentTime = System.currentTimeMillis();
			}

			int nActionState = DataTypeUtils.getIntegerValue(last.getActionState(), PortalAsyncActionState.EXECUTING.getValue());
			if (nActionState == PortalAsyncActionState.EXECUTING.getValue()) {
				actionSession.updateActionStep(last.getStepInfo(), fCompletionRate, last.getActionResult());
			}

			if (nActionState == PortalAsyncActionState.FINISHED.getValue()) {
				chatCompletionResult = JsonUtils.as(last.getActionResult(), ChatCompletionResult.class);
				break;
			}
			if (nActionState == PortalAsyncActionState.CANCELED.getValue()) {
				throw new UserCancelException(last.getActionResult());
			}

			if (nActionState == PortalAsyncActionState.FAILED.getValue()) {
				throw new Exception(last.getActionResult());
			}

			if (System.currentTimeMillis() - nCurrentTime >= nTimeout) {
				throw new Exception("反馈超时");
			}

			try {
				Thread.sleep(200);
			} catch (InterruptedException ex) {
				log.error(ex);
			}
		}

		return chatCompletionResult;
	}

	protected boolean isCancelChatCompletion(ActionSession actionSession) {
		if (actionSession != null && this.getContext().isCancelChatCompletion(actionSession)) {
			return true;
		}
		return false;
	}

	protected String doToolCall(String strName, Object arg, ChatCompletionRequest chatCompletionRequest) throws Throwable {

		List<String> mcpServers = chatCompletionRequest.getMcpServers();
		if (!ObjectUtils.isEmpty(mcpServers)) {
			for (String strMcpServerId : mcpServers) {
				String strAppContextData = null;
				if (strMcpServerId.indexOf("@") != -1) {
					String[] items = strMcpServerId.split("[@]");
					strMcpServerId = items[1];
					strAppContextData = items[0];
				}
				IMcpServerAgent iMcpServerAgent = this.getContext().getMcpServerAgent(strMcpServerId);
				if (iMcpServerAgent.containsTool(strName)) {
					return iMcpServerAgent.callTool(strName, arg, strAppContextData);
				}
			}
		}

		mcpServers = this.getMcpServers();
		if (!ObjectUtils.isEmpty(mcpServers)) {
			for (String strMcpServerId : mcpServers) {
				String strAppContextData = null;
				if (strMcpServerId.indexOf("@") != -1) {
					String[] items = strMcpServerId.split("[@]");
					strMcpServerId = items[1];
					strAppContextData = items[0];
				}
				IMcpServerAgent iMcpServerAgent = this.getContext().getMcpServerAgent(strMcpServerId);
				if (iMcpServerAgent.containsTool(strName)) {
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
		while (matcher.find()) {
			toolCallList.add(matcher.group(1)); // 返回第一个捕获组（即<内容>）
		}
		return toolCallList;
	}

	protected static List<String> extractSimulateToolCallContent(String text) {
		List<String> toolCallList = new ArrayList<String>();
		Matcher matcher = simulateToolCallBodyPattern.matcher(text);
		while (matcher.find()) {
			toolCallList.add(matcher.group(1)); // 返回第一个捕获组（即<内容>）
		}
		return toolCallList;
	}

	protected static String extractSimulateToolCallName(String text) {
		Matcher matcher = simulateToolCallNamePattern.matcher(text);
		while (matcher.find()) {
			return matcher.group(1);
		}
		return null;
	}

	protected static String extractSimulateToolCallArguments(String text) {
		Matcher matcher = simulateToolCallArgumentsPattern.matcher(text);
		while (matcher.find()) {
			return matcher.group(1);
		}
		return null;
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

	protected String replaceImagesWithText(String markdownContent, ChatCompletionRequest chatCompletionRequest) {

		if (ObjectUtils.isEmpty(markdownContent)) {
			return markdownContent;
		}

		int nPos = markdownContent.indexOf(APPDOWNLOADURL);
		if (nPos == -1) {
			return markdownContent;
		}

		try {
			ActionSession actionSession = ActionSessionManager.getCurrentSession();
			StringBuilder sb = new StringBuilder();
			if (actionSession != null) {
				String strLastResult = actionSession.getActionResult();
				if (StringUtils.hasLength(strLastResult)) {
					sb.append(strLastResult + "\n");
				}
			}
			Parser parser = Parser.builder().build();
			Document document = parser.parse(markdownContent);

			// 第一阶段：收集所有图片节点
			List<Image> imagesToReplace = new ArrayList<>();
			NodeVisitor collector = new NodeVisitor(new VisitHandler<>(Image.class, imagesToReplace::add));
			collector.visit(document);

			// 第二阶段：逆向遍历并替换，避免位置索引问题
			int nIndex = 0;
			for (int i = imagesToReplace.size() - 1; i >= 0; i--) {
				Image image = imagesToReplace.get(i);
				replaceSingleImage(image, i, actionSession, sb, nIndex, chatCompletionRequest);
				nIndex++;
			}

			return renderMarkdown(document);
		} catch (Throwable ex) {
			log.error(String.format("进行图片描述发生异常，%1$s", ex.getMessage()), ex);
		}
		return markdownContent;
	}

	protected void replaceSingleImage(Image image, int nImagePos, ActionSession actionSession, StringBuilder sb, int nIndex, ChatCompletionRequest chatCompletionRequest) {
		String altText = image.getText().toString();
		String imageUrl = image.getUrl().toString();

		int nPos = imageUrl.indexOf(APPDOWNLOADURL);
		if (nPos == -1) {
			return;
		}

		String strOriginImageUrl = imageUrl;

		imageUrl = imageUrl.substring(nPos + APPDOWNLOADURL.length());
		String[] items = imageUrl.split("[/]");

		if (actionSession != null) {
			String strStep = String.format("%1$s\n", TOOL_CALL_BEGIN);
			if (nIndex == 0) {
				strStep = "\n" + strStep;
			}
			sb.append(strStep);
			actionSession.updateActionStep(strStep, sb.toString());
		}

		ObjectNode toolCallStepNode = JsonUtils.createObjectNode();
		toolCallStepNode.put("name", String.format("识别图片[%1$s]", imageUrl));
		toolCallStepNode.put("type", "desc_oss_image");
		toolCallStepNode.putNull("parameters");

		String strErrorInfo = null;
		try {
			if (nIndex >= this.getMaxOSSImages()) {
				throw new Exception("超过最大图像识别限制");
			}
			Map<String, Object> requestParams = new HashMap<String, Object>();
			if (StringUtils.hasLength(chatCompletionRequest.getOSSImageVLPrompt())) {
				requestParams.put(ICloudOSSClient.DOWNLOAD_TEXT_PARAM_PROMPT, chatCompletionRequest.getOSSImageVLPrompt());
			} else if (StringUtils.hasLength(this.getOSSImageVLPrompt())) {
				requestParams.put(ICloudOSSClient.DOWNLOAD_TEXT_PARAM_PROMPT, this.getOSSImageVLPrompt());
			}

			String strImageText = "";
			ICloudOSSClient iCloudOSSClient = this.getSysCloudClientUtilRuntime().getServiceClient(ICloudUtilRuntime.CLOUDCONFIGID_OSS, ICloudOSSClient.class, true);
			if (ObjectUtils.isEmpty(requestParams)) {
				if (items.length == 2) {
					strImageText = iCloudOSSClient.downloadText(items[0], items[1]);
				} else {
					strImageText = iCloudOSSClient.downloadText(items[0]);
				}
			} else {
				if (items.length == 2) {
					strImageText = iCloudOSSClient.downloadText(items[0], items[1], requestParams);
				} else {
					strImageText = iCloudOSSClient.downloadText(items[0], requestParams);
				}
			}

			if (actionSession != null) {
				Map<String, Object> ret = new LinkedHashMap<String, Object>();
				ret.put("image_url", strOriginImageUrl);
				ret.put("content", strImageText);
				toolCallStepNode.put("error", false);
				toolCallStepNode.put("result", JsonUtils.toString(ret));
				String strStep = toolCallStepNode.toPrettyString();
				sb.append(strStep);
				actionSession.updateActionStep(strStep, sb.toString());
			}

			// 生成描述文本
			String description = String.format("```markdown\n下面为多模态图片识别内容：\n%s\n```",
					// altText.isEmpty() ? "无描述" : altText,
					strImageText);

			// 创建文本节点
			Text textNode = new Text(description);

			// 在图片节点前插入文本节点
			image.insertBefore(textNode);
			// 从AST中移除图片节点
			image.unlink();
		} catch (Exception ex) {
			strErrorInfo = ex.getMessage();
		}
		if (actionSession != null) {
			if (StringUtils.hasLength(strErrorInfo)) {
				// String strStep = String.format("工具调用异常：%1$s\n",
				// call.getKey(), call.getValue());
				toolCallStepNode.put("error", true);
				toolCallStepNode.put("result", strErrorInfo);
				String strStep = toolCallStepNode.toPrettyString();
				sb.append(strStep);
				actionSession.updateActionStep(strStep, sb.toString());
			}
			String strStep = String.format("\n%1$s\n", TOOL_CALL_END);
			sb.append(strStep);
			actionSession.updateActionStep(strStep, sb.toString());
		}
	}

	protected String renderMarkdown(Document document) {
		MutableDataSet options = new MutableDataSet();
		Formatter renderer = Formatter.builder(options).build();
		return renderer.render(document);
	}

	protected boolean isEnableDescOSSImage() {
		return this.bDescOSSImage;
	}

	protected int getMaxOSSImages() {
		return this.nMaxOSSImages;
	}

	protected String getOSSImageVLPrompt() {
		return this.strOSSImageVLPrompt;
	}

	protected String getSimulateToolCallSystemPrompt(List<ChatTool> tools) {
		StringBuilder sb = new StringBuilder();
		for (ChatTool tool : tools) {
			sb.append("<tool>\r\n");
			sb.append(String.format("<name>%1$s</name>\r\n", tool.getFunction().getName()));
			sb.append(String.format("<description>%1$s</description>\r\n", tool.getFunction().getDescription()));
			sb.append(String.format("<arguments>\r\n%1$s\r\n</arguments>\r\n", JsonUtils.toString(tool.getFunction().getParameters())));
			sb.append("</tool>\r\n");
		}

		return "In this environment you have access to a set of tools you can use to answer the user's question. You can use one or more tools per message, and will receive the result of that tool use in the user's response. You use tools step-by-step to accomplish a given task, with each tool use informed by the result of the previous tool use.\r\n" + "\r\n" + "## Tool Use Formatting\r\n" + "\r\n" + "Tool use is formatted using XML-style tags. The tool name is enclosed in opening and closing tags, and each parameter is similarly enclosed within its own set of tags. Here's the structure:\r\n" + "\r\n" + "<tool_use>\r\n" + "  <name>{tool_name}</name>\r\n" + "  <arguments>{json_arguments}</arguments>\r\n" + "</tool_use>\r\n" + "\r\n" + "The tool name should be the exact name of the tool you are using, and the arguments should be a JSON object containing the parameters required by that tool. For example:\r\n" + "<tool_use>\r\n" + "  <name>python_interpreter</name>\r\n" + "  <arguments>{\"code\": \"5 + 3 + 1294.678\"}</arguments>\r\n" + "</tool_use>\r\n" + "\r\n" + "The user will respond with the result of the tool use, which should be formatted as follows:\r\n" + "\r\n" + "<tool_use_result>\r\n" + "  <name>{tool_name}</name>\r\n" + "  <result>{result}</result>\r\n" + "</tool_use_result>\r\n" + "\r\n" + "The result should be a string, which can represent a file or any other output type. You can use this result as input for the next action.\r\n" + "For example, if the result of the tool use is an image file, you can use it in the next action like this:\r\n" + "\r\n" + "<tool_use>\r\n" + "  <name>image_transformer</name>\r\n" + "  <arguments>{\"image\": \"image_1.jpg\"}</arguments>\r\n" + "</tool_use>\r\n" + "\r\n" + "Always adhere to this format for the tool use to ensure proper parsing and execution.\r\n" + "\r\n" + "## Tool Use Examples\r\n" + "\r\n" + "Here are a few examples using notional tools:\r\n" + "---\r\n" + "User: Generate an image of the oldest person in this document.\r\n" + "\r\n" + "Assistant: I can use the document_qa tool to find out who the oldest person is in the document.\r\n" + "<tool_use>\r\n" + "  <name>document_qa</name>\r\n" + "  <arguments>{\"document\": \"document.pdf\", \"question\": \"Who is the oldest person mentioned?\"}</arguments>\r\n" + "</tool_use>\r\n" + "\r\n" + "User: <tool_use_result>\r\n" + "  <name>document_qa</name>\r\n" + "  <result>John Doe, a 55 year old lumberjack living in Newfoundland.</result>\r\n" + "</tool_use_result>\r\n" + "\r\n" + "Assistant: I can use the image_generator tool to create a portrait of John Doe.\r\n" + "<tool_use>\r\n" + "  <name>image_generator</name>\r\n" + "  <arguments>{\"prompt\": \"A portrait of John Doe, a 55-year-old man living in Canada.\"}</arguments>\r\n" + "</tool_use>\r\n" + "\r\n" + "User: <tool_use_result>\r\n" + "  <name>image_generator</name>\r\n" + "  <result>image.png</result>\r\n" + "</tool_use_result>\r\n" + "\r\n" + "Assistant: the image is generated as image.png\r\n" + "\r\n" + "---\r\n" + "User: \"What is the result of the following operation: 5 + 3 + 1294.678?\"\r\n" + "\r\n" + "Assistant: I can use the python_interpreter tool to calculate the result of the operation.\r\n" + "<tool_use>\r\n" + "  <name>python_interpreter</name>\r\n" + "  <arguments>{\"code\": \"5 + 3 + 1294.678\"}</arguments>\r\n" + "</tool_use>\r\n" + "\r\n" + "User: <tool_use_result>\r\n" + "  <name>python_interpreter</name>\r\n" + "  <result>1302.678</result>\r\n" + "</tool_use_result>\r\n" + "\r\n" + "Assistant: The result of the operation is 1302.678.\r\n" + "\r\n" + "---\r\n" + "User: \"Which city has the highest population , Guangzhou or Shanghai?\"\r\n" + "\r\n" + "Assistant: I can use the search tool to find the population of Guangzhou.\r\n" + "<tool_use>\r\n" + "  <name>search</name>\r\n" + "  <arguments>{\"query\": \"Population Guangzhou\"}</arguments>\r\n" + "</tool_use>\r\n" + "\r\n" + "User: <tool_use_result>\r\n" + "  <name>search</name>\r\n" + "  <result>Guangzhou has a population of 15 million inhabitants as of 2021.</result>\r\n" + "</tool_use_result>\r\n" + "\r\n" + "Assistant: I can use the search tool to find the population of Shanghai.\r\n" + "<tool_use>\r\n" + "  <name>search</name>\r\n" + "  <arguments>{\"query\": \"Population Shanghai\"}</arguments>\r\n" + "</tool_use>\r\n" + "\r\n" + "User: <tool_use_result>\r\n" + "  <name>search</name>\r\n" + "  <result>26 million (2019)</result>\r\n" + "</tool_use_result>\r\n" + "Assistant: The population of Shanghai is 26 million, while Guangzhou has a population of 15 million. Therefore, Shanghai has the highest population.\r\n" + "\r\n" + "\r\n" + "## Tool Use Available Tools\r\n" + "Above example were using notional tools that might not exist for you. You only have access to these tools:\r\n" + "<tools>\r\n" + "\r\n" + sb.toString() + "</tools>\r\n" + "\r\n" + "## Tool Use Rules\r\n" + "Here are the rules you should always follow to solve your task:\r\n" + "1. Always use the right arguments for the tools. Never use variable names as the action arguments, use the value instead.\r\n" + "2. Call a tool only when needed: do not call the search agent if you do not need information, try to solve the task yourself.\r\n" + "3. If no tool call is needed, just answer the question directly.\r\n" + "4. Never re-do a tool call that you previously did with the exact same parameters.\r\n" + "5. For tool use, MARK SURE use XML tag format as shown in the examples above. Do not use any other format.\r\n" + "\r\n" + "# User Instructions\r\n" + "\r\n" + "Response in user query language.\r\n" + "Now Begin! If you solve the task correctly, you will receive a reward of $1,000,000.";
	}

	protected String getDefaultTextReRankModel() {
		return "Qwen/Qwen3-Reranker-8B";
	}

	protected String getTextReRankServiceUrl() {
		return this.strTextReRankServiceUrl;
	}

	protected void setTextReRankServiceUrl(String strTextReRankServiceUrl) {
		this.strTextReRankServiceUrl = strTextReRankServiceUrl;
	}

	protected String getTextReRankModel() {
		return this.strTextReRankModel;
	}

	protected void setTextReRankModel(String strTextReRankModel) {
		this.strTextReRankModel = strTextReRankModel;
	}

	protected String getTextReRankToken() {
		String strAccessToken = null;
		final Credential credential = this.getCredential();
		if (credential != null) {
			strAccessToken = credential.getAccessToken();
			if (StringUtils.hasLength(strAccessToken)) {
				if (strAccessToken.indexOf("Bearer ") == 0) {
					strAccessToken = strAccessToken.substring(7);
				}
				return strAccessToken;
			}
		}

		synchronized (this.textReRankTokenDeque) {
			strAccessToken = this.textReRankTokenDeque.pollFirst();
			if (StringUtils.hasLength(strAccessToken)) {
				this.textReRankTokenDeque.addLast(strAccessToken);
			}
		}
		return strAccessToken;
	}

	@Override
	protected TextReRankResult onTextReRank(TextReRankRequest textReRankRequest) throws Throwable {
		String strServiceUrl = getTextReRankServiceUrl();
		try (CloseableHttpClient httpClient = HttpClients.createDefault()) {

			HttpPost request = new HttpPost(strServiceUrl);
			request.addHeader(new BasicHeader("Authorization", String.format("Bearer %1$s", this.getTextReRankToken())));

			Map<String, Object> body = new LinkedHashMap<String, Object>();
			body.put("model", this.getTextReRankModel());

			// "model": "BAAI/bge-reranker-v2-m3",
			// "query": "Apple",
			// "documents": [
			// "apple",
			// "banana",
			// "fruit",
			// "vegetable"
			// ],
			// "instruction": "Please rerank the documents based on the query.",
			// "top_n": 4,
			// "return_documents": true,
			// "max_chunks_per_doc": 123,
			// "overlap_tokens": 79

			body.put("query", textReRankRequest.getQuery());
			List<String> documentList = new ArrayList<String>();
			Map<Integer, net.ibizsys.central.cloud.core.util.domain.Document> documentMap = new HashMap<Integer, net.ibizsys.central.cloud.core.util.domain.Document>();
			for (int i = 0; i < textReRankRequest.getDocuments().size(); i++) {
				net.ibizsys.central.cloud.core.util.domain.Document document = textReRankRequest.getDocuments().get(i);
				document.setId(Integer.toString(i));
				documentList.add(document.getContent());
				documentMap.put(i, document);
			}

			body.put("documents", documentList);
			int nTopN = DataTypeUtils.asInteger(textReRankRequest.getTopN(), 0);
			if (nTopN > 0) {
				body.put("top_n", nTopN);
			}
			body.put("return_documents", false);
			if (StringUtils.hasLength(textReRankRequest.getInstruct())) {
				body.put("instruction", textReRankRequest.getInstruct());
			}
			String strBody = JsonUtils.toString(body);

			StringEntity entity = new StringEntity(strBody, ContentType.create(ContentType.APPLICATION_JSON.getMimeType(), "UTF-8"));
			request.setEntity(entity);
			//
			HttpResponse response = httpClient.execute(request);
			int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode == 200) {

				TextReRankResult textReRankResult = new TextReRankResult();
				List<TextReRankDocument> textReRankDocumentList = new ArrayList<TextReRankDocument>();
				textReRankResult.setDocuments(textReRankDocumentList);

				HttpEntity responseEntity = response.getEntity();
				String responseBody = EntityUtils.toString(responseEntity);
				Map ret = JsonUtils.asMap(responseBody);
				List results = (List) ret.get("results");
				if (!ObjectUtils.isEmpty(results)) {
					for (Object item : results) {
						Map result = (Map) item;
						int nIndex = DataTypeUtils.asInteger(result.get("index"), -1);
						if (nIndex >= 0) {
							net.ibizsys.central.cloud.core.util.domain.Document document = documentMap.get(nIndex);
							BigDecimal fRelevanceScore = DataTypeUtils.asBigDecimal(result.get("relevance_score"), null);
							TextReRankDocument textReRankDocument = new TextReRankDocument();
							textReRankDocument.setIndex(nIndex);
							textReRankDocument.setDocument(document);
							textReRankDocument.setRelevanceScore(fRelevanceScore);
							textReRankDocumentList.add(textReRankDocument);
						}
					}
				}

				return textReRankResult;
			} else {
				String errorInfo = String.format("请求发生异常，%1$s.", response.getStatusLine().getStatusCode());
				try {
					errorInfo += EntityUtils.toString(response.getEntity());
					throw new Exception(errorInfo);
				} catch (Exception ex) {
				}
				throw new Exception(errorInfo);
			}
		}
	}

	public ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime() {
		if (this.iSysCloudClientUtilRuntime == null) {
			this.iSysCloudClientUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
		}
		return this.iSysCloudClientUtilRuntime;
	}

}

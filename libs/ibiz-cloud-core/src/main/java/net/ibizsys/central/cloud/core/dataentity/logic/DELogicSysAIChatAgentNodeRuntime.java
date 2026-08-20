package net.ibizsys.central.cloud.core.dataentity.logic;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.knuddels.jtokkit.api.Encoding;
import com.knuddels.jtokkit.api.EncodingType;
import com.knuddels.jtokkit.api.IntArrayList;

import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.ai.IAIAgentRuntimeBase;
import net.ibizsys.central.cloud.core.ai.ISysAIAgentRuntime;
import net.ibizsys.central.cloud.core.ai.ISysAIChatAgentRuntime;
import net.ibizsys.central.cloud.core.ai.ISysAIFactoryRuntime;
import net.ibizsys.central.cloud.core.ai.util.AIChatUtils;
import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime;
import net.ibizsys.central.cloud.core.dataentity.logic.freemarker.TemplateDELogicParam;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.sysutil.ISysAIUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysKBUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysPortalUtilRuntime;
import net.ibizsys.central.cloud.core.util.ChatMessagesBuilder;
import net.ibizsys.central.cloud.core.util.ChunkSearchContext;
import net.ibizsys.central.cloud.core.util.CloudCacheTagUtils;
import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.JTokenKitUtils;
import net.ibizsys.central.cloud.core.util.UserCancelException;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.ChatMessageRole;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.cloud.core.util.domain.Document;
import net.ibizsys.central.cloud.core.util.domain.KnowledgeBase;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncActionState;
import net.ibizsys.central.cloud.core.util.domain.TextReRankDocument;
import net.ibizsys.central.cloud.core.util.domain.TextReRankRequest;
import net.ibizsys.central.cloud.core.util.domain.TextReRankResult;
import net.ibizsys.central.cloud.core.util.freemarker.ITemplateEntity;
import net.ibizsys.central.cloud.core.util.freemarker.TemplateEntity;
import net.ibizsys.central.dataentity.logic.DELogicNodeRuntimeBase;
import net.ibizsys.central.dataentity.logic.DELogicParamRuntime;
import net.ibizsys.central.dataentity.logic.IDELogicParamRuntime;
import net.ibizsys.central.dataentity.logic.IDELogicRuntimeContext;
import net.ibizsys.central.dataentity.logic.IDELogicSession;
import net.ibizsys.central.dataentity.service.DEMethodUtils;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.IPage;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.PageImpl;
import net.ibizsys.central.util.script.IScriptEntity;
import net.ibizsys.model.PSModelEnums.DELogicSysAIChatAgentType;
import net.ibizsys.model.PSModelEnums.DELogicSysAIChatCategoryMode;
import net.ibizsys.model.PSModelEnums.DELogicSysAIChatRequestAppendMode;
import net.ibizsys.model.PSModelEnums.MsgTemplEngine;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.logic.IPSDELogicLink;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDELogicParam;
import net.ibizsys.model.dataentity.logic.IPSDESysAIChatAgentLogic;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.ReentryLimitExceededException;

/**
 * 实体调用AI交互代理节点运行时对象
 *
 * @author lionlau
 *
 */
public class DELogicSysAIChatAgentNodeRuntime extends DELogicNodeRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DELogicSysAIChatAgentNodeRuntime.class);
	public final static String JSON_AGENT_ID = "agent_id";
	public final static String JSON_NAME = "name";
	private final static Random random = new Random();

	public final static ObjectNode CHAT_CATEGORY_OUTPUT_FORMAT_JSON = JsonUtils.toObjectNode("{\r\n" + "    \"type\": \"object\",\r\n" + "    \"properties\": {\r\n" + "      \"agent_id\": {\r\n" + "        \"type\": \"string\",\r\n" + "        \"description\": \"选择的 Agent 标识（如 agent_weather）\"\r\n" + "      },\r\n" + "      \"reason\": {\r\n" + "        \"type\": \"string\",\r\n" + "        \"description\": \"选择该 Agent 的具体原因（需结合上下文和 Agent 功能）\"\r\n" + "      }\r\n" + "    },\r\n" + "    \"required\": [\"agent_id\", \"reason\"]\r\n" + "  }");
	public final static ObjectNode CHAT_KNOWLEDGEBASES_OUTPUT_FORMAT_JSON = JsonUtils.toObjectNode("{\r\n" + "    \"type\": \"object\",\r\n" + "    \"properties\": {\r\n" + "      \"name\": {\r\n" + "        \"type\": \"string\",\r\n" + "        \"description\": \"选择的知识库名称\"\r\n" + "      },\r\n" + "      \"reason\": {\r\n" + "        \"type\": \"string\",\r\n" + "        \"description\": \"选择该知识库的具体原因（需结合上下文和知识库功能）\"\r\n" + "      }\r\n" + "    },\r\n" + "    \"required\": [\"name\", \"reason\"]\r\n" + "  }");

	public final static String PROMPT = "# 任务说明\r\n" + "```json\r\n" + "${prompt_text}\r\n" + "```";

	public final static String CHAT_TRIMMING_SUMMARIZEOLDEST_PROMPT = "请为下面json代码块的定义的`对话历史`生成一个简洁、准确的摘要。\r\n" + "```json\r\n" + "${prompt_text}\r\n" + "```\r\n" + "**摘要要求**：\r\n" + "1.  **焦点**：摘要应聚焦于对话中出现的**核心事实、关键决策、用户表达的明确偏好和对话的主要目标**。\r\n" + "2.  **风格**：使用客观、中立的第三人称口吻（例如，“用户表示...”，“双方确认了...”），语言应简洁，避免直接引用原句。\r\n" + "3.  **排除**：忽略寒暄、重复尝试、未完成的句子以及其他非实质性内容。";

	public final static String[] INTENT_FIELDS = new String[] {"intent", "question", "query", "content"};
	
	/**
	 * 模板上下文参数：代理上下文对象
	 */
	public final static String TEMPLATE_PARAM_AGENT = "agent";
	
	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {

		if (!(iPSDELogicNode instanceof IPSDESysAIChatAgentLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}

		IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic = (IPSDESysAIChatAgentLogic) iPSDELogicNode;
		int nReentryCount = DataTypeUtils.asInteger(iPSDESysAIChatAgentLogic.getReentryLimit(), 0);
		if(nReentryCount > 0) {
			//需要判断重入次数
			String strParamName = String.format("_%1$s__ReentryCount_",  iPSDESysAIChatAgentLogic.getCodeName()).toUpperCase();
			int nLastReentryCount = DataTypeUtils.asInteger(iDELogicSession.getParamObject(strParamName, true), 0);
			nLastReentryCount ++;
			if(nLastReentryCount > nReentryCount) {
				throw new ReentryLimitExceededException(String.format("超过最大重入次数[%1$s]", nReentryCount), nReentryCount);
			}
			iDELogicSession.setParamObject(strParamName, nLastReentryCount);
		}

		Map<String, Object> params = new HashMap<String, Object>();
		
		if("CHATEXECUTECODE_DOCUMENTS".equals(iPSDESysAIChatAgentLogic.getSubType())) {
			this.onExecuteChatAnalyzeDocuments(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, params);
			return;
		}
		
		DELogicSysAIChatAgentType type = DELogicSysAIChatAgentType.from(iPSDESysAIChatAgentLogic.getSubType());
		switch (type) {
			case CHATCATEGORY:
				this.onExecuteChatCategory(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, params);
				break;
			case CHATAGGREGATION:
				this.onExecuteChatAggregation(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, params, false);
				break;
			case CHATAGGREGATIONOUTPUT:
				this.onExecuteChatAggregation(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, params, true);
				break;
			case CHATINPUT:
				this.onExecuteChatInput(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, params);
				break;
			case CHATOUTPUT:
				this.onExecuteChatOutput(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, params);
				break;
			case CHATSTEP:
				this.onExecuteChatStep(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, params);
				break;
			case CHATUIACTION:
				this.onExecuteChatUIAction(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, params);
				break;
			case FETCHCHUNKS:
				this.onExecuteFetchChunks(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, params);
				break;
			case APPENDCHATREQUEST:
				this.onAppendChatRequest(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, params);
				break;
			case APPENDCHATRESULT:
				this.onAppendChatResult(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, params);
				break;
			case CHATKNOWLEDGEBASES:
				this.onExecuteChatKnowledgeBases(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, params);
				break;
			case CHATRAW:
				this.onExecuteChatRaw(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, params);
				break;
			case CHATDECISION:
				this.onExecuteChatDecision(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, params);
				break;
			case CHATEXECUTEACTION:
				this.onExecuteChatExecuteAction(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, params);
				break;
			case CHATEXECUTESKILL:
				this.onExecuteChatExecuteSkill(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, params);
				break;
			case CHATINTENTS:
				this.onExecuteChatIntents(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, params);
				break;
			
			case FETCHCHUNKSBYHISTORIES:
			case CHATTRIMMING_SUMMARIZEOLDEST:
				throw new Exception("没有实现");
			case DEFAULT:
			default:
				this.onExecuteChatDefault(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, params);
				break;
		}
	}

	protected void onExecuteChatDefault(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, Map<String, Object> params) throws Throwable {

		IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime) iDELogicRuntimeContext.getSystemRuntime();
		ISysAIFactoryRuntime iSysAIFactoryRuntime = iServiceSystemRuntime.getSysAIFactoryRuntime(iPSDESysAIChatAgentLogic.getPSSysAIFactoryMust().getId(), false);
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime = iSysAIFactoryRuntime.getAIChatAgentRuntime(iPSDESysAIChatAgentLogic.getPSSysAIChatAgentMust().getCodeName(), false);
		IDELogicParamRuntime iDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getDstPSDELogicParamMust().getCodeName(), false);

		ChatCompletionResult chatCompletionResult = null;
		ChatCompletionRequest chatCompletionRequest = null;
		Object objParam = iDELogicParamRuntime.getParamObject(iDELogicSession);
		if (objParam instanceof ChatCompletionRequest || objParam instanceof String) {
			chatCompletionRequest = new ChatCompletionRequest();
			if (objParam instanceof ChatCompletionRequest) {
				ChatCompletionRequest chatCompletionRequest2 = (ChatCompletionRequest) objParam;
				// 放入历史消息
				if (iPSDESysAIChatAgentLogic.getHistoryCount() > 0 && !ObjectUtils.isEmpty(chatCompletionRequest2.getMessages()) && chatCompletionRequest2.getMessages().size() > iPSDESysAIChatAgentLogic.getHistoryCount()) {
					List<ChatMessage> list = chatCompletionRequest2.getMessages().subList(chatCompletionRequest2.getMessages().size() - iPSDESysAIChatAgentLogic.getHistoryCount(), chatCompletionRequest2.getMessages().size());
					chatCompletionRequest.setMessages(list);
				} else {
					chatCompletionRequest.setMessages(chatCompletionRequest2.getMessages());
				}
			} else if (objParam instanceof String) {
				chatCompletionRequest.setMessages(new ChatMessagesBuilder().user(objParam.toString()).build());
			}
			boolean bAppendSystem = true;
			if(!ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
				//判断第一个消息是否为系统消息
				bAppendSystem = !ChatMessageRole.SYSTEM.getValue().equalsIgnoreCase(chatCompletionRequest.getMessages().get(0).getRole());
			}
			chatCompletionResult = iSysAIChatAgentRuntime.chatCompletion(new Entity(), chatCompletionRequest, new LinkedHashMap<String, Object>(), bAppendSystem, false);
		} else {
			chatCompletionRequest = new ChatCompletionRequest();
			chatCompletionResult = iSysAIChatAgentRuntime.chatCompletion(objParam, chatCompletionRequest, new LinkedHashMap<String, Object>(), true, true);
		}

		Object objRet = this.getRealResult(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, chatCompletionResult, chatCompletionRequest, objParam);

		iDELogicSession.setLastReturn(objRet);

		if (iPSDESysAIChatAgentLogic.getRetPSDELogicParam() != null) {
			IDELogicParamRuntime retDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getRetPSDELogicParam().getCodeName(), false);
			retDELogicParamRuntime.bind(iDELogicSession, objRet);
		}
	}

	protected void onExecuteChatCategory(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, Map<String, Object> params) throws Throwable {
		// 获取逻辑节点的后续连接
		List<IPSDELogicLink> psDELogicLinks = iPSDESysAIChatAgentLogic.getPSDELogicLinks();
		if (ObjectUtils.isEmpty(psDELogicLinks)) {
			throw new Exception("未定义后续处理节点");
		}

		IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime) iDELogicRuntimeContext.getSystemRuntime();
		ISysAIFactoryRuntime iSysAIFactoryRuntime = null;
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime =null;

		if(iPSDESysAIChatAgentLogic.getPSSysAIFactory() != null && iPSDESysAIChatAgentLogic.getPSSysAIChatAgent() != null) {
			iSysAIFactoryRuntime = iServiceSystemRuntime.getSysAIFactoryRuntime(iPSDESysAIChatAgentLogic.getPSSysAIFactoryMust().getId(), false);
			iSysAIChatAgentRuntime = iSysAIFactoryRuntime.getAIChatAgentRuntime(iPSDESysAIChatAgentLogic.getPSSysAIChatAgentMust().getCodeName(), false);
		}

		IDELogicParamRuntime iDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getDstPSDELogicParamMust().getCodeName(), false);

		ChatCompletionRequest data = new ChatCompletionRequest();
		Object objParam = iDELogicParamRuntime.getParamObject(iDELogicSession);
		if (objParam instanceof ChatCompletionRequest) {
			ChatCompletionRequest chatCompletionRequest2 = (ChatCompletionRequest) objParam;
			// 放入历史消息
			if (iPSDESysAIChatAgentLogic.getHistoryCount() > 0 && !ObjectUtils.isEmpty(chatCompletionRequest2.getMessages()) && chatCompletionRequest2.getMessages().size() > iPSDESysAIChatAgentLogic.getHistoryCount()) {
				List<ChatMessage> list = chatCompletionRequest2.getMessages().subList(chatCompletionRequest2.getMessages().size() - iPSDESysAIChatAgentLogic.getHistoryCount(), chatCompletionRequest2.getMessages().size());
				data.setMessages(list);
			} else {
				data.setMessages(chatCompletionRequest2.getMessages());
			}
		} else if (objParam instanceof String) {
			data.setMessages(new ChatMessagesBuilder().user(objParam.toString()).build());
		} else
			throw new Exception(String.format("未识别的数据[%1$s]", objParam));

		// 判断模式
		String strAgentId = null;
		String strCategoryMode = DataTypeUtils.asString(iPSDESysAIChatAgentLogic.getCategoryMode(), DELogicSysAIChatCategoryMode.RERANK.value);
		if (DELogicSysAIChatCategoryMode.RERANK.value.equals(strCategoryMode) || DELogicSysAIChatCategoryMode.MIXED.value.equals(strCategoryMode)) {
			TextReRankRequest textReRankRequest = new TextReRankRequest();
			textReRankRequest.setQuery(data.getMessages().get(data.getMessages().size() - 1).getContent());

			Map<String, String> documentMap = new LinkedHashMap<String, String>();
			List<Document> documentList = new ArrayList<Document>();
			IPSDELogicLink defaultPSDELogicLink = null;
			for (IPSDELogicLink iPSDELogicLink : iPSDESysAIChatAgentLogic.getPSDELogicLinks()) {
				if(iPSDELogicLink.isDefaultLink()) {
					defaultPSDELogicLink = iPSDELogicLink;
					continue;
				}
				if (StringUtils.hasLength(iPSDELogicLink.getMemo())) {
					documentMap.put(iPSDELogicLink.getMemo(), iPSDELogicLink.getName());
					Document document = new Document();
					document.setContent(iPSDELogicLink.getMemo());
					documentList.add(document);
				} else if (StringUtils.hasLength(iPSDELogicLink.getDstPSDELogicNodeMust().getMemo())) {
					documentMap.put(iPSDELogicLink.getDstPSDELogicNodeMust().getMemo(), iPSDELogicLink.getName());
					Document document = new Document();
					document.setContent(iPSDELogicLink.getDstPSDELogicNodeMust().getMemo());
					documentList.add(document);
				} else {
					documentMap.put(iPSDELogicLink.getDstPSDELogicNodeMust().getName(), iPSDELogicLink.getName());
					Document document = new Document();
					document.setContent(iPSDELogicLink.getDstPSDELogicNodeMust().getName());
					documentList.add(document);
				}
			}

			if(ObjectUtils.isEmpty(documentList)) {
				throw new Exception("未指定重排序项");
			}

			textReRankRequest.setDocuments(documentList);

			Double fReRankThreshold = iPSDESysAIChatAgentLogic.getCategoryReRankThreshold();
			if(fReRankThreshold == null) {
				fReRankThreshold = new Double(0.15f);
			}

			TextReRankResult textReRankResult = null;
			if(iSysAIChatAgentRuntime != null) {
				textReRankResult = iServiceSystemRuntime.getSysAIUtilRuntime(false).textReRank(iSysAIChatAgentRuntime.getAIPlatformType(), textReRankRequest);
			}
			else {
				textReRankResult = iServiceSystemRuntime.getSysAIUtilRuntime(false).textReRank(textReRankRequest);
			}

			if (!ObjectUtils.isEmpty(textReRankResult.getDocuments())) {
				for (TextReRankDocument textReRankDocument : textReRankResult.getDocuments()) {
					if (textReRankDocument.getDocument() == null) {
						continue;
					}
					log.debug(String.format("rerank score[%1$s]: %2$s", textReRankDocument.getRelevanceScore().doubleValue(), textReRankDocument.getDocument().getContent()));
					strAgentId = documentMap.get(textReRankDocument.getDocument().getContent());
					if (StringUtils.hasLength(strAgentId)) {
						if(textReRankDocument.getRelevanceScore().doubleValue() >= fReRankThreshold.doubleValue()) {
							break;
						}
						else {
							strAgentId = null;
						}
					}
				}
			}

			if (!StringUtils.hasLength(strAgentId) && defaultPSDELogicLink != null && DELogicSysAIChatCategoryMode.RERANK.value.equals(strCategoryMode)) {
				strAgentId = defaultPSDELogicLink.getName();
			}
		}

		if (!StringUtils.hasLength(strAgentId) && (DELogicSysAIChatCategoryMode.LLM.value.equals(strCategoryMode) || DELogicSysAIChatCategoryMode.MIXED.value.equals(strCategoryMode))) {
			// strJSCode += "sys,logic,entity,data,param";
			Map<String, Object> templParams = new HashMap<String, Object>();
			if (params != null) {
				Object value = params.get(IAIAgentRuntimeBase.PARAM_TEMPLPARAMS);
				if(value instanceof Map) {
					templParams.putAll((Map)value);
				}
			}

			templParams.put("data", data);
			ObjectNode promptNode = getChatCategoryPromptNode(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, data);
			templParams.put("prompt_text", getChatCategoryPromptText(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, promptNode));
			
			if(iSysAIChatAgentRuntime != null) {
				templParams.put(TEMPLATE_PARAM_AGENT, iSysAIChatAgentRuntime.getTemplateContext(MsgTemplEngine.FREEMARKER));
			}

			String strMessage = iPSDESysAIChatAgentLogic.getMessage();
			if (!StringUtils.hasLength(strMessage) && iPSDESysAIChatAgentLogic.getPSSysMsgTempl() != null) {
				strMessage = iPSDESysAIChatAgentLogic.getPSSysMsgTempl().getContent();
			}
			if (!StringUtils.hasLength(strMessage)) {
				strMessage = PROMPT;
			}
			// 获取实际内容
			if (StringUtils.hasLength(strMessage)) {
				strMessage = this.getTemplateContent(iDELogicRuntimeContext, iDELogicSession, strMessage, templParams);
			}

			ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();
			// chatCompletionRequest.setStreaming(EntityBase.BOOLEAN_FALSE);
			chatCompletionRequest.setMessages(ChatMessagesBuilder.create().user(strMessage).build());

			ChatCompletionResult chatCompletionResult = null;
			if(iSysAIChatAgentRuntime != null) {
				chatCompletionResult = iSysAIChatAgentRuntime.chatCompletion(new Entity(), chatCompletionRequest, null, true, false);
			}
			else {
				chatCompletionResult = iServiceSystemRuntime.getSysAIUtilRuntime(false).chatCompletion(chatCompletionRequest);
			}

			Object result = this.getRealResult(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, chatCompletionResult, chatCompletionRequest, objParam);
			Map map = null;
			if (result instanceof String) {
				String strJsonContent = getJsonContent((String) result);
				map = JsonUtils.asMap(strJsonContent);
			} else if (result instanceof Map) {
				map = (Map) result;
			} else
				throw new Exception(String.format("无法识别的返回数据[%1$s]", result));

			strAgentId = (String) map.get(JSON_AGENT_ID);
			if (ObjectUtils.isEmpty(strAgentId)) {
				throw new Exception(String.format("返回数据[%1$s]未指定代理标识", result));
			}
		}

		for (IPSDELogicLink iPSDELogicLink : psDELogicLinks) {
			if (strAgentId.equals(iPSDELogicLink.getName())) {
				iDELogicSession.setNext(iPSDELogicLink.getDstPSDELogicNodeMust().getCodeName());
				return;
			}
		}

		throw new Exception(String.format("无法识别的代理标识[%1$s]", strAgentId));
	}

	protected ObjectNode getChatCategoryPromptNode(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, ChatCompletionRequest request) {
		ObjectNode promptNode = JsonUtils.createObjectNode();
		
		promptNode.put("task", iPSDESysAIChatAgentLogic.getName());
		if (StringUtils.hasLength(iPSDESysAIChatAgentLogic.getMemo())) {
			promptNode.put("description", iPSDESysAIChatAgentLogic.getMemo());
		}
		
		promptNode.put("prompt", String.format("请根据以下最近%1$s条对话消息，从可选 Agent列表中选择最适合处理当前用户请求的 Agent，并说明选择原因。要求输出为 JSON 格式，包含 agent_id'（选择的 Agent 标识）和 'reason'（选择原因）字段", request.getMessages().size()));
		ArrayNode messagesNode = promptNode.putArray("messages");
		for (ChatMessage message : request.getMessages()) {
			ObjectNode messageNode = messagesNode.addObject();
			messageNode.put(ChatMessage.FIELD_ROLE, message.getRole());
			messageNode.put(ChatMessage.FIELD_CONTENT, message.getContent());
		}
		ArrayNode agentsNode = promptNode.putArray("agents");
		for (IPSDELogicLink iPSDELogicLink : iPSDESysAIChatAgentLogic.getPSDELogicLinks()) {
			if(iPSDELogicLink.isCatchLink() || iPSDELogicLink.isSubCallLink()) {
				continue;
			}
			
			ObjectNode agentNode = agentsNode.addObject();
			agentNode.put("id", iPSDELogicLink.getName());
			if (StringUtils.hasLength(iPSDELogicLink.getMemo())) {
				agentNode.put("description", iPSDELogicLink.getMemo());
			}
			else
				if (StringUtils.hasLength(iPSDELogicLink.getDstPSDELogicNodeMust().getMemo())) {
					agentNode.put("description", iPSDELogicLink.getDstPSDELogicNodeMust().getMemo());
				}
				else
					agentNode.put("description", iPSDELogicLink.getDstPSDELogicNodeMust().getName());
			
		}
		promptNode.set("output_format", CHAT_CATEGORY_OUTPUT_FORMAT_JSON);

		return promptNode;
	}
	
	protected String getChatCategoryPromptText(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, ObjectNode promptNode) {
		return promptNode.toPrettyString();
	}
	protected void onExecuteChatRaw(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, Map<String, Object> params) throws Throwable {

		IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime) iDELogicRuntimeContext.getSystemRuntime();
		ISysAIFactoryRuntime iSysAIFactoryRuntime = iServiceSystemRuntime.getSysAIFactoryRuntime(iPSDESysAIChatAgentLogic.getPSSysAIFactoryMust().getId(), false);
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime = iSysAIFactoryRuntime.getAIChatAgentRuntime(iPSDESysAIChatAgentLogic.getPSSysAIChatAgentMust().getCodeName(), false);

		Object objParam = null;
		if (iPSDESysAIChatAgentLogic.getDstPSDELogicParam() != null) {
			IDELogicParamRuntime iDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getDstPSDELogicParamMust().getCodeName(), false);
			objParam = iDELogicParamRuntime.getParamObject(iDELogicSession);
		}
		
		Object dataOrKeys = null;
		if (iPSDESysAIChatAgentLogic.getSrcPSDELogicParam() != null) {
			IDELogicParamRuntime iDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getSrcPSDELogicParamMust().getCodeName(), false);
			dataOrKeys = iDELogicParamRuntime.getParamObject(iDELogicSession);
		}
		

		String strMessage = iPSDESysAIChatAgentLogic.getMessage();
		if (!StringUtils.hasLength(strMessage) && iPSDESysAIChatAgentLogic.getPSSysMsgTempl() != null) {
			strMessage = iPSDESysAIChatAgentLogic.getPSSysMsgTempl().getContent();
		} else if (objParam instanceof String) {
			strMessage = (String) objParam;
		}

		// 获取实际内容
		if (StringUtils.hasLength(strMessage)) {
			Map<String, Object> templParams = new HashMap<String, Object>();
			if(iSysAIChatAgentRuntime != null) {
				templParams.put(TEMPLATE_PARAM_AGENT, iSysAIChatAgentRuntime.getTemplateContext(MsgTemplEngine.FREEMARKER));
			}
			strMessage = this.getTemplateContent(iDELogicRuntimeContext, iDELogicSession, strMessage, templParams);
		}

		ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();
		if (StringUtils.hasLength(strMessage)) {
			List<ChatMessage> list = null;
			try {
				list = ChatMessagesBuilder.create().xml(strMessage).build();
			} catch (Throwable ex) {
				log.error(ex);
			}
			if (ObjectUtils.isEmpty(list)) {
				list = ChatMessagesBuilder.create().user(strMessage).build();
			}
			chatCompletionRequest.setMessages(list);
		} else if (objParam instanceof ChatCompletionRequest) {
			ChatCompletionRequest chatCompletionRequest2 = (ChatCompletionRequest) objParam;
			chatCompletionRequest2.copyTo(chatCompletionRequest);
			// 放入历史消息
			if (iPSDESysAIChatAgentLogic.getHistoryCount() > 0 && !ObjectUtils.isEmpty(chatCompletionRequest2.getMessages()) && chatCompletionRequest2.getMessages().size() > iPSDESysAIChatAgentLogic.getHistoryCount()) {
				List<ChatMessage> list = chatCompletionRequest2.getMessages().subList(chatCompletionRequest2.getMessages().size() - iPSDESysAIChatAgentLogic.getHistoryCount(), chatCompletionRequest2.getMessages().size());
				chatCompletionRequest.setMessages(list);
			} else {
				chatCompletionRequest.setMessages(chatCompletionRequest2.getMessages());
			}
		} else
			throw new Exception(String.format("未识别的数据[%1$s]", objParam));

		boolean bAppendSystem = true;
		if(!ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
			//判断第一个消息是否为系统消息
			bAppendSystem = !ChatMessageRole.SYSTEM.getValue().equalsIgnoreCase(chatCompletionRequest.getMessages().get(0).getRole());
		}
		
		ChatCompletionResult chatCompletionResult = iSysAIChatAgentRuntime.chatCompletion((dataOrKeys == null)?new Entity():dataOrKeys, chatCompletionRequest, null, bAppendSystem, false);
		
		iDELogicSession.setLastReturn(chatCompletionResult);

		if (iPSDESysAIChatAgentLogic.getRetPSDELogicParam() != null) {
			IDELogicParamRuntime retDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getRetPSDELogicParam().getCodeName(), false);
			retDELogicParamRuntime.bind(iDELogicSession, chatCompletionResult);
		}
	}
	

	protected void onExecuteChatOutput(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, Map<String, Object> params) throws Throwable {

		IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime) iDELogicRuntimeContext.getSystemRuntime();
		ISysAIFactoryRuntime iSysAIFactoryRuntime = iServiceSystemRuntime.getSysAIFactoryRuntime(iPSDESysAIChatAgentLogic.getPSSysAIFactoryMust().getId(), false);
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime = iSysAIFactoryRuntime.getAIChatAgentRuntime(iPSDESysAIChatAgentLogic.getPSSysAIChatAgentMust().getCodeName(), false);

		ChatCompletionRequest chatCompletionRequest = this.getChatCompletionRequest(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, null, params);
		
		Object dataOrKeys = null;
		if (iPSDESysAIChatAgentLogic.getSrcPSDELogicParam() != null) {
			IDELogicParamRuntime iDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getSrcPSDELogicParamMust().getCodeName(), false);
			dataOrKeys = iDELogicParamRuntime.getParamObject(iDELogicSession);
		}
		
		
		ChatCompletionResult chatCompletionResult = this.doExecuteChatOutput(iDELogicRuntimeContext, iDELogicSession, iSysAIChatAgentRuntime, dataOrKeys, chatCompletionRequest, true);
		
		iDELogicSession.setLastReturn(chatCompletionResult);

		if (iPSDESysAIChatAgentLogic.getRetPSDELogicParam() != null) {
			IDELogicParamRuntime retDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getRetPSDELogicParam().getCodeName(), false);
			retDELogicParamRuntime.bind(iDELogicSession, chatCompletionResult);
		}
	}
	
	protected void onExecuteChatExecuteAction(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, Map<String, Object> params) throws Throwable {

		IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime) iDELogicRuntimeContext.getSystemRuntime();
		ISysAIFactoryRuntime iSysAIFactoryRuntime = iServiceSystemRuntime.getSysAIFactoryRuntime(iPSDESysAIChatAgentLogic.getPSSysAIFactoryMust().getId(), false);
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime = iSysAIFactoryRuntime.getAIChatAgentRuntime(iPSDESysAIChatAgentLogic.getPSSysAIChatAgentMust().getCodeName(), false);
		
		IDataEntityRuntime dstDataEntityRuntime = (IDataEntityRuntime) iServiceSystemRuntime.getDataEntityRuntime(iPSDESysAIChatAgentLogic.getDstPSDataEntityMust().getId());
		IPSDEAction dstPSDEAction = iPSDESysAIChatAgentLogic.getDstPSDEActionMust();
		
		String strActionPrompt = dstDataEntityRuntime.getDEChatPromptUtil(false).getPSDEActionPrompt(dstDataEntityRuntime, dstPSDEAction);
		if(log.isDebugEnabled()) {
			log.debug(String.format("实体行为[%1$s]提示词\n```json\n%2$s\n```", dstPSDEAction.getId(), strActionPrompt));
		}
		ChatCompletionRequest chatCompletionRequest = null;
		if (iPSDESysAIChatAgentLogic.getDstPSDELogicParam() != null) {
			IDELogicParamRuntime iDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getDstPSDELogicParamMust().getCodeName(), false);
			Object objParam = iDELogicParamRuntime.getParamObject(iDELogicSession);
			if(objParam instanceof ChatCompletionRequest) {
				chatCompletionRequest = (ChatCompletionRequest)objParam;
			}
			else {
				throw new Exception(String.format("逻辑参数[%1$s]值类型不正确，必须为`交谈补全请求`类型", iPSDESysAIChatAgentLogic.getDstPSDELogicParamMust().getCodeName()));
			}
		}
		else {
			chatCompletionRequest = this.getChatLogicRequest(iDELogicRuntimeContext, iDELogicSession);
		}
		
		if(chatCompletionRequest == null) {
			throw new Exception(String.format("未指定`交谈补全请求`参数"));
		}
		
		if(ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
			throw new Exception(String.format("`交谈补全请求`未携带消息"));
		}
		
		Object draftObject = null;
		if (iPSDESysAIChatAgentLogic.getSrcPSDELogicParam() != null) {
			IDELogicParamRuntime iDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getSrcPSDELogicParam().getCodeName(), false);
			draftObject = iDELogicParamRuntime.getParamObject(iDELogicSession);
		}
		
		int nHistoryCount = iPSDESysAIChatAgentLogic.getHistoryCount();
		
		List<ChatMessage> chatMessageList = (nHistoryCount == -1)?new ArrayList<ChatMessage>(chatCompletionRequest.getMessages()):AIChatUtils.getLastChatMessages(chatCompletionRequest, nHistoryCount);
		List<ChatMessage> realChatMessageList = new ArrayList<ChatMessage>();
		for(ChatMessage chatMessage : chatMessageList) {
			realChatMessageList.addAll(iSysAIFactoryRuntime.getChatResourceUtils().convert(chatMessage, true));
		}
		
		String strHistoriesText = JsonUtils.toString(realChatMessageList);
		
		String strDefaultPrompt = "请根据以下提供的行为定义jsonschema和对话历史，提取调用行为所需的参数对象。首先，分析jsonschema以了解参数的结构、类型、必填项及其他约束。然后，从对话历史中解析出与jsonschema参数对应的值，确保符合schema规范。如果参数缺失或无效，请根据schema的默认值或要求进行适当处理。最后，将提取出的参数对象以纯JSON格式返回，不包含任何额外文本或解释。\n"
				+ "## 行为定义\n```json\n${prompt_text}\n```\n"
				+ "## 对话历史\n```json\n${histories_text}\n```\n"
				+ "## 注意事项\n"
				+ "- 不能创造外键值\n"
				+ "- 不能创造未声明的枚举值\n"
				+ "- 仅输出行为调用入参的JSON内容\n";
		
		Map<String, Object> templParams = this.getTemplParamsIf(params);
		templParams.put("prompt_text", strActionPrompt);
		templParams.put("histories_text", strHistoriesText);
		
		
		List<ChatMessage> requestMessageList = this.getChatMessages(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, strDefaultPrompt, params);
		if(ObjectUtils.isEmpty(requestMessageList)) {
			throw new Exception(String.format("请求消息无效"));
		}

		
		ChatCompletionRequest chatCompletionRequest2 = JsonUtils.as(JsonUtils.toString(chatCompletionRequest), ChatCompletionRequest.class);
		
		String strAction = this.getChatLogicAction(iDELogicRuntimeContext, iDELogicSession);
		boolean bAsync = IDEAIChatLogicRuntimeBase.DELOGIC_AICHAT_ACTION_ASYNCCHATCOMPLETION.equalsIgnoreCase(strAction);
		
		
		int nRetryCount = DataTypeUtils.asInteger(iPSDESysAIChatAgentLogic.getMaxSmartAttempts(),3);
		if(nRetryCount<=0) {
			nRetryCount = 3;
		}
		
		Object ret = null;
		
		while(nRetryCount>0) {
			ChatCompletionResult chatCompletionResult = null;
			try {
				chatCompletionRequest2.setMessages(requestMessageList);
				chatCompletionResult = this.doExecuteChatOutput(iDELogicRuntimeContext, iDELogicSession, iSysAIChatAgentRuntime, new Entity(), chatCompletionRequest2, bAsync);
				JsonNode jsonNode = AIChatUtils.getJsonNode(chatCompletionResult);
				Object input = null;
				String key = null;
				if(jsonNode != null) {
					if(jsonNode.isArray()) {
						input = JsonUtils.asList(jsonNode);		
					}
					else
						if(jsonNode.isObject()) {
							input = JsonUtils.asMap(jsonNode);
						}
						else
							key = jsonNode.asText();
				}
				
				if(input == null && key == null) {
					throw new Exception(String.format("无法从返回内容中提取行为入参"));
				}
				
				Object[] args = this.getActionArgs(dstDataEntityRuntime, dstPSDEAction, input, key, draftObject);
				try {
					ret = dstDataEntityRuntime.executeAction(dstPSDEAction.getName(), dstPSDEAction, args);
					if(ret == null) {
						if(dstPSDEAction.getPSDEActionInputMust().isOutput()) {
							ret = args[0];
						}
					}
					break;
				}
				catch (Throwable ex) {
					throw new Exception(String.format("执行行为发生异常，%1$s", ex.getMessage()), ex);
				}
			}
			catch (Throwable ex) {
				nRetryCount --;
				if(nRetryCount == 0) {
					throw ex;
				}
				
				log.debug(String.format("处理发生异常，%1$s，重试智能修复", ex.getMessage()), ex);
				
				StringBuilder sw = new StringBuilder();
				
				if(ex.getCause() != null) {
					//sw.append("\nCAUSE:\n");
					sw.append(ex.getCause().getMessage());
				}
				else {
					sw.append(ex.getMessage());
				}
				
//	            PrintWriter pw = new PrintWriter(sw);
//				ex.printStackTrace(pw);
				
				if(chatCompletionResult!=null) {
					requestMessageList.add(ChatMessage.create(ChatMessageRole.ASSISTANT, chatCompletionResult.getChoices().get(0).getContent()));
				}
				
				requestMessageList.add(ChatMessage.create(ChatMessageRole.USER, String.format("处理发生以下异常，请修正并重新完整输出行为入参\n## 异常信息\n---\n%1$s\n", sw.toString())));
			}
		}
		
		
		iDELogicSession.setLastReturn(ret);

		if (iPSDESysAIChatAgentLogic.getRetPSDELogicParam() != null) {
			IDELogicParamRuntime retDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getRetPSDELogicParam().getCodeName(), false);
			retDELogicParamRuntime.bind(iDELogicSession, ret);
		}
	}
	
	protected Object[] getActionArgs(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, Object objBody, String strKey, Object draft) throws Exception {
		return DEMethodUtils.getActionArgs(iDataEntityRuntime, iPSDEAction, objBody, strKey, draft);
	}

	protected void onExecuteChatExecuteSkill(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, Map<String, Object> params) throws Throwable {

		IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime) iDELogicRuntimeContext.getSystemRuntime();
		ISysAIFactoryRuntime iSysAIFactoryRuntime = null; 
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime = null;
		if(iPSDESysAIChatAgentLogic.getPSSysAIFactory() != null) {
			iSysAIFactoryRuntime = iServiceSystemRuntime.getSysAIFactoryRuntime(iPSDESysAIChatAgentLogic.getPSSysAIFactoryMust().getId(), false);
			if(iPSDESysAIChatAgentLogic.getPSSysAIChatAgent() != null) {
				iSysAIChatAgentRuntime = iSysAIFactoryRuntime.getAIChatAgentRuntime(iPSDESysAIChatAgentLogic.getPSSysAIChatAgentMust().getCodeName(), false);
			}
		}
		
		ChatCompletionRequest chatCompletionRequest = null;
		if (iPSDESysAIChatAgentLogic.getDstPSDELogicParam() != null) {
			IDELogicParamRuntime iDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getDstPSDELogicParamMust().getCodeName(), false);
			Object objParam = iDELogicParamRuntime.getParamObject(iDELogicSession);
			if(objParam instanceof ChatCompletionRequest) {
				chatCompletionRequest = (ChatCompletionRequest)objParam;
			}
			else {
				throw new Exception(String.format("逻辑参数[%1$s]值类型不正确，必须为`交谈补全请求`类型", iPSDESysAIChatAgentLogic.getDstPSDELogicParamMust().getCodeName()));
			}
		}
		else {
			chatCompletionRequest = this.getChatLogicRequest(iDELogicRuntimeContext, iDELogicSession);
		}
		
		if(chatCompletionRequest == null) {
			throw new Exception(String.format("未指定`交谈补全请求`参数"));
		}
		
		if(ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
			throw new Exception(String.format("`交谈补全请求`未携带消息"));
		}
		
		List<ChatMessage> realChatMessageList = new ArrayList<ChatMessage>();
		
		int nHistoryCount = iPSDESysAIChatAgentLogic.getHistoryCount();
		List<ChatMessage> chatMessageList = (nHistoryCount == -1)?new ArrayList<ChatMessage>(chatCompletionRequest.getMessages()):AIChatUtils.getLastChatMessages(chatCompletionRequest, nHistoryCount);
		for(ChatMessage chatMessage : chatMessageList) {
			if(iSysAIFactoryRuntime != null) {
				realChatMessageList.addAll(iSysAIFactoryRuntime.getChatResourceUtils().convert(chatMessage, true));
			}
			else {
				realChatMessageList.add(chatMessage);
			}
		}
		
		String strServiceUrlBase = (String)chatCompletionRequest.get("srfskillserviceurl");
		boolean bAsync = true;
		if(ObjectUtils.isEmpty(strServiceUrlBase)) {
			List<String> intentList = null;
			if(iPSDESysAIChatAgentLogic.getSrcPSDELogicParam() != null) {
				IDELogicParamRuntime iDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getSrcPSDELogicParamMust().getCodeName(), false);
				Object objParam = iDELogicParamRuntime.getParamObject(iDELogicSession);
				if(objParam != null) {
					intentList = getIntentList(objParam);
				}
			}
			
			if(ObjectUtils.isEmpty(intentList)) {
				if(intentList == null) {
					intentList = new ArrayList<String>();
				}
				String strIntent = AIChatUtils.getLastChatMessage(chatCompletionRequest).getContent();
				intentList.add(strIntent);
			}
			
			//向Cloud请求
			ChunkSearchContext chunkSearchContext = new ChunkSearchContext();
			chunkSearchContext.setQueries(intentList);
			chunkSearchContext.setTextReRank(IChunkSearchContext.TEXTRERANK_DISABLED);
			chunkSearchContext.setPageable(0, 10, 0);
			
			
			Page<Chunk> chunkPage =	iServiceSystemRuntime.getSysKBUtilRuntime(false).fetchChunks(ISysKBUtilRuntime.KBPLATFORM_SKILLS, chunkSearchContext);
			if(ObjectUtils.isEmpty(chunkPage.getContent())) {
				throw new Exception("没有获取提供对应的技能的代理");
			}
			
			List<Chunk> selectedAgentList = null;
			
			Map<String, Chunk> chunkMap = new LinkedHashMap<String, Chunk>();
			
			//整理agent
			ArrayNode agentArrayNode = JsonUtils.createArrayNode();
			for(Chunk chunk : chunkPage.getContent()) {
				chunkMap.put(chunk.getId(), chunk);
				
				ObjectNode agentNode = agentArrayNode.addObject();
				agentNode.put("agent_id", chunk.getId());
				agentNode.put("agent_name", chunk.getName());
				agentNode.put("skills", chunk.getContent());
				
			}
			
			String strHistoriesText = JsonUtils.toString(realChatMessageList);
			
			Map<String, Object> templParams = this.getTemplParamsIf(params);
			templParams.put("prompt_text", agentArrayNode.toPrettyString());
			templParams.put("histories_text", strHistoriesText);
			
			String strDefaultPrompt = "请根据以下提供的agent技能和对话历史，推理满足要求的agent及所需仅能。首先，仔细分析“对话历史”，特别是用户的最新发言，提炼出用户明确表达及可能隐含的核心需求与任务目标。然后，将解析出的需求点，与agent技能进行比对。评估每个代理能覆盖哪些需求点，以及其proficiency水平。最后，将最终排序的代理名单、匹配技能及推荐理由以纯JSON对象数组数据格式返回，不包含任何额外文本或解释。\n"
					+ "## agent技能\n```json\n${prompt_text}\n```\n"
					+ "## 对话历史\n```json\n${histories_text}\n```\n"
					+ "## 输出格式\n```json\n[\r\n"
					+ " {\r\n"
					+ "    \"agent_id\": \"123123\",\r\n"
					+ "    \"matched_skills\": [\"Python编程\", \"SQL查询\", \"数据可视化\"],\r\n"
					+ "    \"recommendation_reason\": \"核心技能完全匹配'处理销售数据并生成图表'的主要需求\"\r\n"
					+ "  },\r\n"
					+ "  {\r\n"
					+ "    \"agent_id\": \"345356\",\r\n"
					+ "    \"matched_skills\": [\"Java\", \"Spring Boot\", \"API设计\"],\r\n"
					+ "    \"recommendation_reason\": \"熟练的Java技能可支持任务中提到的'与现有后端系统集成'的辅助需求。\"\r\n"
					+ "  }\r\n"
					+ "]\n```\n"
					+ "## 注意事项\n"
					+ "- 如果agent技能无法满足要求，则直接返回空数组`[]`\n"
					+ "- 仅输出JSON对象数组\n";
			
			List<ChatMessage> requestMessageList = this.getChatMessages(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, strDefaultPrompt, params);
			if(ObjectUtils.isEmpty(requestMessageList)) {
				throw new Exception(String.format("请求消息无效"));
			}

			ChatCompletionRequest chatCompletionRequest2 = JsonUtils.as(JsonUtils.toString(chatCompletionRequest), ChatCompletionRequest.class);
			chatCompletionRequest2.setMessages(requestMessageList);
			
			String strAction = this.getChatLogicAction(iDELogicRuntimeContext, iDELogicSession);
			bAsync = IDEAIChatLogicRuntimeBase.DELOGIC_AICHAT_ACTION_ASYNCCHATCOMPLETION.equalsIgnoreCase(strAction);
			
			ChatCompletionResult chatCompletionResult = null;
			if(iSysAIChatAgentRuntime != null) {
				chatCompletionResult = this.doExecuteChatOutput(iDELogicRuntimeContext, iDELogicSession, iSysAIChatAgentRuntime, new Entity(), chatCompletionRequest2, bAsync);
			}
			else {
				chatCompletionResult = iServiceSystemRuntime.getSysAIUtilRuntime(false).chatCompletion(ISysAIUtilRuntime.AIPLATFORM_ANALYSIS, chatCompletionRequest2);
			}
			
			JsonNode jsonNode = AIChatUtils.getJsonNode(chatCompletionResult);
			if(jsonNode instanceof ArrayNode) {
				ArrayNode selectedArrayNode = (ArrayNode)jsonNode;
				selectedAgentList = new ArrayList<Chunk>();
				for(int i = 0;i<selectedArrayNode.size();i++) {
					ObjectNode item = (ObjectNode)selectedArrayNode.get(i);
					JsonNode idNode = item.path("agent_id");
					if(!idNode.isMissingNode() && idNode.isTextual()) {
						String strAgentId = idNode.asText();
						Chunk chunk = chunkMap.get(strAgentId);
						if(chunk == null) {
							log.debug(String.format("无法获取agent_id[%1$s]对应的片段数据", strAgentId));
							continue;
						}
						selectedAgentList.add(chunk);
					}
				}
			}
			
			if(selectedAgentList == null) {
				selectedAgentList = chunkPage.getContent();
			}
			
			if(selectedAgentList.size() == 0) {
				throw new Exception("无法从代理清单中匹配对应技能的代理");
			}
			
			Chunk selectedChunk = selectedAgentList.get(0);
			String strAgentUrl = selectedChunk.getDocName();
			int nPos = strAgentUrl.lastIndexOf("/");
			if(nPos == -1) {
				throw new Exception(String.format("无法从文档名称[%1$s]提取代理服务路径", strAgentUrl));
			}
			
			strAgentUrl = strAgentUrl.substring(0, nPos) + "/" + selectedChunk.getName();
			
			String[] items = strAgentUrl.split("/");
			strServiceUrlBase = String.format("lb://servicehub-%1$s/%2$s", items[0], strAgentUrl);
		}
	
		ChatCompletionRequest chatCompletionRequest2 = JsonUtils.as(JsonUtils.toString(chatCompletionRequest), ChatCompletionRequest.class);
		chatCompletionRequest2.setMessages(realChatMessageList);
		//移除标记
		chatCompletionRequest2.reset(ISysAIAgentRuntime.AIAGENTTAG);
		chatCompletionRequest2.reset("srfskillserviceurl");
		IWebClient iWebClient = iServiceSystemRuntime.getSysCloudClientUtilRuntime(false).getServiceClient(strServiceUrlBase);
		IWebClientRep<String> webClientRep = iWebClient.post(bAsync?strServiceUrlBase+"/asyncchatcompletion":strServiceUrlBase+"/chatcompletion", chatCompletionRequest2);
		ChatCompletionResult chatCompletionResult = null;
		if(bAsync) {
			PortalAsyncAction portalAsyncAction = JsonUtils.as(webClientRep.getBody(), PortalAsyncAction.class);
			try {
				chatCompletionResult = this.doExecuteChatPortalAsyncActionOutput(iDELogicRuntimeContext, iDELogicSession, chatCompletionRequest2, portalAsyncAction);
			}
			catch (Throwable ex) {
				if(ex instanceof UserCancelException) {
					try {
						Map<String, Object> body = new HashMap<String, Object>();
						body.putAll(chatCompletionRequest2.any());
						body.put("asyncacitonid", portalAsyncAction.getAsyncAcitonId());
						iWebClient.post(strServiceUrlBase+"/cancelchatcompletion", body);
					} catch (Throwable ex2) {
						log.error(ex2);
					}
				}
				throw ex;				
			}
			
			String strStopReason = DataTypeUtils.asString(chatCompletionResult.get("srfstopreason"));
			if (DELogicSysAIChatAgentType.CHATINPUT.value.equals(strStopReason)) {
				chatCompletionResult.set("srfskillserviceurl", strServiceUrlBase);
			}
		}
		else {
			chatCompletionResult = JsonUtils.as(webClientRep.getBody(), ChatCompletionResult.class);
		}
		
		iDELogicSession.setLastReturn(chatCompletionResult);

		if (iPSDESysAIChatAgentLogic.getRetPSDELogicParam() != null) {
			IDELogicParamRuntime retDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getRetPSDELogicParam().getCodeName(), false);
			retDELogicParamRuntime.bind(iDELogicSession, chatCompletionResult);
		}
		
	}
	
	protected void onExecuteChatAnalyzeDocuments(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, Map<String, Object> params) throws Throwable {

		IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime) iDELogicRuntimeContext.getSystemRuntime();
		ISysAIFactoryRuntime iSysAIFactoryRuntime = iServiceSystemRuntime.getSysAIFactoryRuntime(iPSDESysAIChatAgentLogic.getPSSysAIFactoryMust().getId(), false);; 
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime =  iSysAIFactoryRuntime.getAIChatAgentRuntime(iPSDESysAIChatAgentLogic.getPSSysAIChatAgentMust().getCodeName(), false);;
		
		
		ChatCompletionRequest chatCompletionRequest = null;
		if (iPSDESysAIChatAgentLogic.getDstPSDELogicParam() != null) {
			IDELogicParamRuntime iDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getDstPSDELogicParamMust().getCodeName(), false);
			Object objParam = iDELogicParamRuntime.getParamObject(iDELogicSession);
			if(objParam instanceof ChatCompletionRequest) {
				chatCompletionRequest = (ChatCompletionRequest)objParam;
			}
			else {
				throw new Exception(String.format("逻辑参数[%1$s]值类型不正确，必须为`交谈补全请求`类型", iPSDESysAIChatAgentLogic.getDstPSDELogicParamMust().getCodeName()));
			}
		}
		else {
			chatCompletionRequest = this.getChatLogicRequest(iDELogicRuntimeContext, iDELogicSession);
		}
		
		if(chatCompletionRequest == null) {
			throw new Exception(String.format("未指定`交谈补全请求`参数"));
		}
		
		if(ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
			throw new Exception(String.format("`交谈补全请求`未携带消息"));
		}
		
		List<ChatMessage> realChatMessageList = new ArrayList<ChatMessage>();
		
		int nHistoryCount = iPSDESysAIChatAgentLogic.getHistoryCount();
		List<ChatMessage> chatMessageList = (nHistoryCount == -1)?new ArrayList<ChatMessage>(chatCompletionRequest.getMessages()):AIChatUtils.getLastChatMessages(chatCompletionRequest, nHistoryCount);
		for(ChatMessage chatMessage : chatMessageList) {
			if(iSysAIFactoryRuntime != null) {
				realChatMessageList.addAll(iSysAIFactoryRuntime.getChatResourceUtils().convert(chatMessage, true));
			}
			else {
				realChatMessageList.add(chatMessage);
			}
		}
		
		IChunkSearchContext iChunkSearchContext = null;
		List<String> intentList = null;
		if(iPSDESysAIChatAgentLogic.getSrcPSDELogicParam() != null) {
			IDELogicParamRuntime iDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getSrcPSDELogicParamMust().getCodeName(), false);
			Object objParam = iDELogicParamRuntime.getParamObject(iDELogicSession);
			if(objParam != null) {
				if(objParam instanceof IChunkSearchContext) {
					iChunkSearchContext = (IChunkSearchContext)objParam;
				}
				else {
					intentList = getIntentList(objParam);
				}
			}
		}
		
		if(iChunkSearchContext == null) {
			if(ObjectUtils.isEmpty(intentList)) {
				if(intentList == null) {
					intentList = new ArrayList<String>();
				}
				String strIntent = AIChatUtils.getLastChatMessage(chatCompletionRequest).getContent();
				intentList.add(strIntent);
			}
			
			ChunkSearchContext chunkSearchContext = new ChunkSearchContext();
			chunkSearchContext.setQueries(intentList);
			if(chatCompletionRequest.getChunkThreshold() != null) {
				chunkSearchContext.setSimilarityThreshold(chatCompletionRequest.getChunkThreshold());
			}
			if(chatCompletionRequest.getChunkReRank() != null) {
				chunkSearchContext.setTextReRank(chatCompletionRequest.getChunkReRank());
			}
			
			if(chatCompletionRequest.getChunkPageIndex() != null) {
				chunkSearchContext.setPageIndex(chatCompletionRequest.getChunkPageIndex());
			}
			
			if(chatCompletionRequest.getMaxChunks() != null) {
				chunkSearchContext.setPageable(0, chatCompletionRequest.getMaxChunks(), 0);
			}
			if(!ObjectUtils.isEmpty(chatCompletionRequest.getKnowledgeBases())) {
				chunkSearchContext.set("n_kbid_eq", chatCompletionRequest.getKnowledgeBases().get(0));
			}
			
			
			iChunkSearchContext = chunkSearchContext;
		}
		
		List<Document> documentList = iSysAIChatAgentRuntime.listDocumentsByChunks(iChunkSearchContext);
		
		//判断文档类型
		
		
		
		
		iDELogicSession.setLastReturn(documentList);
//
//		if (iPSDESysAIChatAgentLogic.getRetPSDELogicParam() != null) {
//			IDELogicParamRuntime retDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getRetPSDELogicParam().getCodeName(), false);
//			retDELogicParamRuntime.bind(iDELogicSession, chatCompletionResult);
//		}
		
	}
	
	
	protected List<String> getIntentList(Object objParam) throws Exception {
		List<String> intentList = new ArrayList<String>();
		if(objParam == null) {
			return intentList;
		}
		//判断类型
		if(objParam instanceof List) {
			List list = (List)objParam;
			for(Object item : list) {
				if(item instanceof IEntity) {
					IEntity iEntity = (IEntity)item;
					for(String field : INTENT_FIELDS) {
						Object value = iEntity.get(field);
						if(value instanceof String) {
							String strIntent = (String)value;
							if(StringUtils.hasLength(strIntent)) {
								intentList.add(strIntent);
							}
							break;
						}
					}
				}
				else
					if(item instanceof String) {
						String strIntent = (String)item;
						if(StringUtils.hasLength(strIntent)) {
							intentList.add(strIntent);
						}
					}
					else
						throw new Exception(String.format("无法从数据项类型[%1$s]提取用户意图", item.getClass()));
			}
		}
		else 
			if(objParam instanceof IEntity) {
				IEntity iEntity = (IEntity)objParam;
				for(String field : INTENT_FIELDS) {
					Object value = iEntity.get(field);
					if(value instanceof String) {
						String strIntent = (String)value;
						if(StringUtils.hasLength(strIntent)) {
							intentList.add(strIntent);
						}
						break;
					}
				}
			}
			else
				if(objParam instanceof String) {
					String strIntent = (String)objParam;
					if(StringUtils.hasLength(strIntent)) {
						intentList.add(strIntent);
					}
				}
				else
					throw new Exception(String.format("无法从参数类型[%1$s]提取用户意图", objParam.getClass()));
		
		return intentList;
	}
	
	
	
	protected void onExecuteChatIntents(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, Map<String, Object> params) throws Throwable {

		IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime) iDELogicRuntimeContext.getSystemRuntime();
		ISysAIFactoryRuntime iSysAIFactoryRuntime = null; 
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime = null;
		if(iPSDESysAIChatAgentLogic.getPSSysAIFactory() != null) {
			iSysAIFactoryRuntime = iServiceSystemRuntime.getSysAIFactoryRuntime(iPSDESysAIChatAgentLogic.getPSSysAIFactoryMust().getId(), false);
			if(iPSDESysAIChatAgentLogic.getPSSysAIChatAgent() != null) {
				iSysAIChatAgentRuntime = iSysAIFactoryRuntime.getAIChatAgentRuntime(iPSDESysAIChatAgentLogic.getPSSysAIChatAgentMust().getCodeName(), false);
			}
		}
		
		ChatCompletionRequest chatCompletionRequest = null;
		if (iPSDESysAIChatAgentLogic.getDstPSDELogicParam() != null) {
			IDELogicParamRuntime iDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getDstPSDELogicParamMust().getCodeName(), false);
			Object objParam = iDELogicParamRuntime.getParamObject(iDELogicSession);
			if(objParam instanceof ChatCompletionRequest) {
				chatCompletionRequest = (ChatCompletionRequest)objParam;
			}
			else {
				throw new Exception(String.format("逻辑参数[%1$s]值类型不正确，必须为`交谈补全请求`类型", iPSDESysAIChatAgentLogic.getDstPSDELogicParamMust().getCodeName()));
			}
		}
		else {
			chatCompletionRequest = this.getChatLogicRequest(iDELogicRuntimeContext, iDELogicSession);
		}
		
		if(chatCompletionRequest == null) {
			throw new Exception(String.format("未指定`交谈补全请求`参数"));
		}
		
		if(ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
			throw new Exception(String.format("`交谈补全请求`未携带消息"));
		}
		
		int nHistoryCount = iPSDESysAIChatAgentLogic.getHistoryCount();
		
		List<ChatMessage> chatMessageList = (nHistoryCount == -1)?new ArrayList<ChatMessage>(chatCompletionRequest.getMessages()):AIChatUtils.getLastChatMessages(chatCompletionRequest, nHistoryCount);
		List<ChatMessage> realChatMessageList = new ArrayList<ChatMessage>();
		for(ChatMessage chatMessage : chatMessageList) {
			realChatMessageList.addAll(iSysAIFactoryRuntime.getChatResourceUtils().convert(chatMessage, true));
		}
		
		String strHistoriesText = JsonUtils.toString(realChatMessageList);
		
		String strDefaultPrompt = "请根据以下提供的对话历史，推理出用户的一个或多个意图。首先，仔细分析“对话历史”，特别是用户的最新发言，提炼出用户明确表达及可能隐含的核心需求与任务目标，然后将推理出的用户意图按照置信度从高最后以纯JSON字符串数组数据格式返回，不包含任何额外文本或解释。\n"
				+ "## 对话历史\n```json\n${histories_text}\n```\n"
				+ "## 输出格式\n```json\n[\r\n"
				+ "  \"意图1\",\r\n"
				+ "  \"意图2\"\r\n"
				+ "]\n```\n"
				+ "## 注意事项\n"
				+ "- 如果无法推理用户意图，则直接返回空数组`[]`\n"
				+ "- 仅输出JSON字符串数组\n";
		
		Map<String, Object> templParams = this.getTemplParamsIf(params);
		templParams.put("histories_text", strHistoriesText);
		
		List<ChatMessage> requestMessageList = this.getChatMessages(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, strDefaultPrompt, params);
		if(ObjectUtils.isEmpty(requestMessageList)) {
			throw new Exception(String.format("请求消息无效"));
		}
		
		ChatCompletionRequest chatCompletionRequest2 = JsonUtils.as(JsonUtils.toString(chatCompletionRequest), ChatCompletionRequest.class);
		chatCompletionRequest2.setMessages(requestMessageList);
		
		ChatCompletionResult chatCompletionResult = null;
		if(iSysAIChatAgentRuntime != null) {
			chatCompletionResult = iSysAIChatAgentRuntime.chatCompletion(new Entity(), chatCompletionRequest2, null, true, false);
		}
		else {
			chatCompletionResult = iServiceSystemRuntime.getSysAIUtilRuntime(false).chatCompletion(ISysAIUtilRuntime.AIPLATFORM_ANALYSIS, chatCompletionRequest2);
		}
		
		String strJsonContent = AIChatUtils.getJsonContent(chatCompletionResult);
		
		iDELogicSession.setLastReturn(strJsonContent);

		if (iPSDESysAIChatAgentLogic.getRetPSDELogicParam() != null) {
			IDELogicParamRuntime retDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getRetPSDELogicParam().getCodeName(), false);
			retDELogicParamRuntime.bind(iDELogicSession, strJsonContent);
		}
	}
	
	
	protected ChatCompletionRequest getChatCompletionRequest(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, String strDefaultMessage, Map<String, Object> params) throws Throwable {
		
		IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime) iDELogicRuntimeContext.getSystemRuntime();
		ISysAIFactoryRuntime iSysAIFactoryRuntime = null;
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime =null;

		if(iPSDESysAIChatAgentLogic.getPSSysAIFactory() != null && iPSDESysAIChatAgentLogic.getPSSysAIChatAgent() != null) {
			iSysAIFactoryRuntime = iServiceSystemRuntime.getSysAIFactoryRuntime(iPSDESysAIChatAgentLogic.getPSSysAIFactoryMust().getId(), false);
			iSysAIChatAgentRuntime = iSysAIFactoryRuntime.getAIChatAgentRuntime(iPSDESysAIChatAgentLogic.getPSSysAIChatAgentMust().getCodeName(), false);
		}
		
		Object objParam = null;
		IDELogicParamRuntime iDELogicParamRuntime = null;
		if (iPSDESysAIChatAgentLogic.getDstPSDELogicParam() != null) {
			iDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getDstPSDELogicParamMust().getCodeName(), false);
			objParam = iDELogicParamRuntime.getParamObject(iDELogicSession);
		}

		String strMessage = iPSDESysAIChatAgentLogic.getMessage();
		if (!StringUtils.hasLength(strMessage) && iPSDESysAIChatAgentLogic.getPSSysMsgTempl() != null) {
			strMessage = iPSDESysAIChatAgentLogic.getPSSysMsgTempl().getContent();
		} else if (objParam instanceof String) {
			strMessage = (String) objParam;
		}
		
		Map<String, Object> templParams = new HashMap<String, Object>();
		if (params != null) {
			Object value = params.get(IAIAgentRuntimeBase.PARAM_TEMPLPARAMS);
			if(value instanceof Map) {
				templParams.putAll((Map)value);
			}
		}
		
		if(iSysAIChatAgentRuntime != null) {
			templParams.put(TEMPLATE_PARAM_AGENT, iSysAIChatAgentRuntime.getTemplateContext(MsgTemplEngine.FREEMARKER));
		}
		
		if (!StringUtils.hasLength(strMessage)) {
			strMessage = strDefaultMessage;
		}

		// 获取实际内容
		if (StringUtils.hasLength(strMessage)) {
			strMessage = this.getTemplateContent(iDELogicRuntimeContext, iDELogicSession, strMessage, templParams);
		}

		ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();
		if (StringUtils.hasLength(strMessage)) {
			List<ChatMessage> list = null;
			try {
				list = ChatMessagesBuilder.create().xml(strMessage).build();
			} catch (Throwable ex) {
				log.error(ex);
			}
			if (ObjectUtils.isEmpty(list)) {
				list = ChatMessagesBuilder.create().user(strMessage).build();
			}
			chatCompletionRequest.setMessages(list);
		} else if (objParam instanceof ChatCompletionRequest) {
			ChatCompletionRequest chatCompletionRequest2 = (ChatCompletionRequest) objParam;
			chatCompletionRequest2.copyTo(chatCompletionRequest);
			// 放入历史消息
			if (iPSDESysAIChatAgentLogic.getHistoryCount() > 0 && !ObjectUtils.isEmpty(chatCompletionRequest2.getMessages()) && chatCompletionRequest2.getMessages().size() > iPSDESysAIChatAgentLogic.getHistoryCount()) {
				List<ChatMessage> list = chatCompletionRequest2.getMessages().subList(chatCompletionRequest2.getMessages().size() - iPSDESysAIChatAgentLogic.getHistoryCount(), chatCompletionRequest2.getMessages().size());
				chatCompletionRequest.setMessages(list);
			} else {
				chatCompletionRequest.setMessages(chatCompletionRequest2.getMessages());
			}
		} else
			throw new Exception(String.format("未识别的数据[%1$s]", objParam));
		
		return chatCompletionRequest;
	}
	
	protected List<ChatMessage> getChatMessages(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, String strDefaultMessage, Map<String, Object> params) throws Throwable {
		
		IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime) iDELogicRuntimeContext.getSystemRuntime();
		ISysAIFactoryRuntime iSysAIFactoryRuntime = null;
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime =null;

		if(iPSDESysAIChatAgentLogic.getPSSysAIFactory() != null && iPSDESysAIChatAgentLogic.getPSSysAIChatAgent() != null) {
			iSysAIFactoryRuntime = iServiceSystemRuntime.getSysAIFactoryRuntime(iPSDESysAIChatAgentLogic.getPSSysAIFactoryMust().getId(), false);
			iSysAIChatAgentRuntime = iSysAIFactoryRuntime.getAIChatAgentRuntime(iPSDESysAIChatAgentLogic.getPSSysAIChatAgentMust().getCodeName(), false);
		}
		
		
		String strMessage = iPSDESysAIChatAgentLogic.getMessage();
		if (!StringUtils.hasLength(strMessage) && iPSDESysAIChatAgentLogic.getPSSysMsgTempl() != null) {
			strMessage = iPSDESysAIChatAgentLogic.getPSSysMsgTempl().getContent();
		} 
		
		Map<String, Object> templParams = new HashMap<String, Object>();
		if (params != null) {
			Object value = params.get(IAIAgentRuntimeBase.PARAM_TEMPLPARAMS);
			if(value instanceof Map) {
				templParams.putAll((Map)value);
			}
		}
		
		if(iSysAIChatAgentRuntime != null) {
			templParams.put(TEMPLATE_PARAM_AGENT, iSysAIChatAgentRuntime.getTemplateContext(MsgTemplEngine.FREEMARKER));
		}
		
		if (!StringUtils.hasLength(strMessage)) {
			strMessage = strDefaultMessage;
		}

		// 获取实际内容
		if (StringUtils.hasLength(strMessage)) {
			strMessage = this.getTemplateContent(iDELogicRuntimeContext, iDELogicSession, strMessage, templParams);
		}

		if (StringUtils.hasLength(strMessage)) {
			List<ChatMessage> list = null;
			try {
				list = ChatMessagesBuilder.create().xml(strMessage).build();
			} catch (Throwable ex) {
				log.error(ex);
			}
			if (ObjectUtils.isEmpty(list)) {
				list = ChatMessagesBuilder.create().user(strMessage).build();
			}
			return list;
		}
		
		return Collections.EMPTY_LIST;
	}
	

	protected ChatCompletionResult doExecuteChatOutput(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, ISysAIChatAgentRuntime iSysAIChatAgentRuntime, Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, boolean async) throws Throwable {
		
		boolean bAppendSystem = true;
		if(!ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
			//判断第一个消息是否为系统消息
			bAppendSystem = !ChatMessageRole.SYSTEM.getValue().equalsIgnoreCase(chatCompletionRequest.getMessages().get(0).getRole());
		}
		if(async) {
			PortalAsyncAction portalAsyncAction = iSysAIChatAgentRuntime.asyncChatCompletion((dataOrKeys == null)? new Entity() :dataOrKeys, chatCompletionRequest, null, bAppendSystem, false);
			try {
				return this.doExecuteChatPortalAsyncActionOutput(iDELogicRuntimeContext, iDELogicSession, chatCompletionRequest, portalAsyncAction);
			}
			catch (Throwable ex) {
				if(ex instanceof UserCancelException) {
					try {
						Map<String, Object> body = new HashMap<String, Object>();
						body.putAll(chatCompletionRequest.any());
						iSysAIChatAgentRuntime.cancelChatCompletion(new Entity(), portalAsyncAction.getAsyncAcitonId(), body);
					} catch (Throwable ex2) {
						log.error(ex2);
					}
				}
				throw ex;				
			}
		}
		else {
			return iSysAIChatAgentRuntime.chatCompletion((dataOrKeys == null)? new Entity() :dataOrKeys, chatCompletionRequest, null, bAppendSystem, false);
		}
	}
	
	protected ChatCompletionResult doExecuteChatPortalAsyncActionOutput(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, ChatCompletionRequest chatCompletionRequest, PortalAsyncAction portalAsyncAction) throws Throwable {
		long nCurrentTime = System.currentTimeMillis();
		long nTimeout = 3000000;
	
		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
		ISysPortalUtilRuntime iSysPortalUtilRuntime = iDELogicRuntimeContext.getSystemRuntime().getSysUtilRuntime(ISysPortalUtilRuntime.class, false);
		ChatCompletionResult chatCompletionResult = null;
		while (true) {
	
			if (this.isCancelChatCompletion(iDELogicRuntimeContext, iDELogicSession, actionSession)) {
				// 外侧用户已经取消，取消实际聊天
				throw new UserCancelException("用户取消");
			}
			
			boolean bDisabled = EmployeeContext.isCurrentDisabled();
        	PortalAsyncAction last = null;
			try {
				EmployeeContext.setCurrentDisabled(true);
				last = iSysPortalUtilRuntime.getAsyncAction(portalAsyncAction.getAsyncAcitonId());
			}
			finally {
				EmployeeContext.setCurrentDisabled(bDisabled);
			}
	
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


	protected void onExecuteChatInput(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, Map<String, Object> params) throws Throwable {
		
		IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime) iDELogicRuntimeContext.getSystemRuntime();
		ISysAIFactoryRuntime iSysAIFactoryRuntime = null;
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime =null;

		if(iPSDESysAIChatAgentLogic.getPSSysAIFactory() != null && iPSDESysAIChatAgentLogic.getPSSysAIChatAgent() != null) {
			iSysAIFactoryRuntime = iServiceSystemRuntime.getSysAIFactoryRuntime(iPSDESysAIChatAgentLogic.getPSSysAIFactoryMust().getId(), false);
			iSysAIChatAgentRuntime = iSysAIFactoryRuntime.getAIChatAgentRuntime(iPSDESysAIChatAgentLogic.getPSSysAIChatAgentMust().getCodeName(), false);
		}
		
		
		Object objParam = null;
		IDELogicParamRuntime iDELogicParamRuntime = null;
		if (iPSDESysAIChatAgentLogic.getDstPSDELogicParam() != null) {
			iDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getDstPSDELogicParamMust().getCodeName(), false);
			objParam = iDELogicParamRuntime.getParamObject(iDELogicSession);
		}

		String strMessage = iPSDESysAIChatAgentLogic.getMessage();
		if (!StringUtils.hasLength(strMessage) && iPSDESysAIChatAgentLogic.getPSSysMsgTempl() != null) {
			strMessage = iPSDESysAIChatAgentLogic.getPSSysMsgTempl().getContent();
		}

		// 获取实际内容
		if (StringUtils.hasLength(strMessage)) {
			Map<String, Object> templParams = new HashMap<String, Object>();
			if(iSysAIChatAgentRuntime != null) {
				templParams.put(TEMPLATE_PARAM_AGENT, iSysAIChatAgentRuntime.getTemplateContext(MsgTemplEngine.FREEMARKER));
			}
			strMessage = this.getTemplateContent(iDELogicRuntimeContext, iDELogicSession, strMessage, templParams);
		}

		if (objParam instanceof ChatCompletionResult) {
			// 结果对象
			ChatCompletionResult chatCompletionResult = (ChatCompletionResult) objParam;
			if (StringUtils.hasLength(strMessage)) {
				if (!ObjectUtils.isEmpty(chatCompletionResult.getChoices())) {
					// 附加到最后面
					String strOriginContent = chatCompletionResult.getChoices().get(0).getContent();
					if(StringUtils.hasLength(strOriginContent)) {
						strOriginContent += "\r\n";
					}
					strOriginContent += strMessage;
					chatCompletionResult.getChoices().get(0).setContent(strOriginContent);
					iDELogicSession.setResult(chatCompletionResult);
					iDELogicSession.setNext(IDELogicSession.NEXT_END);
					return;
				}
			}
			log.warn(String.format("聊天结果未包含任何选项，忽略附加至结果"));
		}

		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
		this.doAssistantOutput(actionSession, strMessage);

		ChatCompletionResult chatCompletionResult = new ChatCompletionResult();
		chatCompletionResult.setChoices(ChatMessagesBuilder.create().assistant(strMessage).build());
		iDELogicSession.setResult(chatCompletionResult);
		iDELogicSession.setNext(IDELogicSession.NEXT_END);
	}
	
	protected void onExecuteChatDecision(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, Map<String, Object> params) throws Throwable {
		
		IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime) iDELogicRuntimeContext.getSystemRuntime();
		ISysAIFactoryRuntime iSysAIFactoryRuntime = null;
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime =null;

		if(iPSDESysAIChatAgentLogic.getPSSysAIFactory() != null && iPSDESysAIChatAgentLogic.getPSSysAIChatAgent() != null) {
			iSysAIFactoryRuntime = iServiceSystemRuntime.getSysAIFactoryRuntime(iPSDESysAIChatAgentLogic.getPSSysAIFactoryMust().getId(), false);
			iSysAIChatAgentRuntime = iSysAIFactoryRuntime.getAIChatAgentRuntime(iPSDESysAIChatAgentLogic.getPSSysAIChatAgentMust().getCodeName(), false);
		}
		
		
		Object objParam = null;
		IDELogicParamRuntime iDELogicParamRuntime = null;
		if (iPSDESysAIChatAgentLogic.getDstPSDELogicParam() != null) {
			iDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getDstPSDELogicParamMust().getCodeName(), false);
			objParam = iDELogicParamRuntime.getParamObject(iDELogicSession);
		}

		String strMessage = iPSDESysAIChatAgentLogic.getMessage();
		if (!StringUtils.hasLength(strMessage) && iPSDESysAIChatAgentLogic.getPSSysMsgTempl() != null) {
			strMessage = iPSDESysAIChatAgentLogic.getPSSysMsgTempl().getContent();
		}
		
		Map<String, Object> templParams = new HashMap<String, Object>();
		if (params != null) {
			Object value = params.get(IAIAgentRuntimeBase.PARAM_TEMPLPARAMS);
			if(value instanceof Map) {
				templParams.putAll((Map)value);
			}
		}

		ObjectNode promptNode = getChatDecisionPromptNode(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic);
		String strPromptText = getChatDecisionPromptText(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, promptNode);
		Map prompt = JsonUtils.asMap(promptNode);
		templParams.put("prompt", prompt);
		templParams.put("prompt_text", strPromptText);
		
		if(iSysAIChatAgentRuntime != null) {
			templParams.put(TEMPLATE_PARAM_AGENT, iSysAIChatAgentRuntime.getTemplateContext(MsgTemplEngine.FREEMARKER));
		}

		// 获取实际内容
		if (!StringUtils.hasLength(strMessage)) {
			strMessage = "<BR>**请选择以下操作**：<BR>\r\n${prompt_text}";
		}
		strMessage = this.getTemplateContent(iDELogicRuntimeContext, iDELogicSession, strMessage, templParams);
		
		if (objParam instanceof ChatCompletionResult) {
			// 结果对象
			ChatCompletionResult chatCompletionResult = (ChatCompletionResult) objParam;
			if (StringUtils.hasLength(strMessage)) {
				if (!ObjectUtils.isEmpty(chatCompletionResult.getChoices())) {
					// 附加到最后面
					String strOriginContent = chatCompletionResult.getChoices().get(0).getContent();
					if(StringUtils.hasLength(strOriginContent)) {
						strOriginContent += "\r\n";
					}
					strOriginContent += strMessage;
					chatCompletionResult.getChoices().get(0).setContent(strOriginContent);
					iDELogicSession.setLastReturn(prompt);
					iDELogicSession.setResult(chatCompletionResult);
					iDELogicSession.setNext(IDELogicSession.NEXT_END);
					return;
				}
			}
			log.warn(String.format("聊天结果未包含任何选项，忽略附加至结果"));
		}

		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
		this.doAssistantOutput(actionSession, strMessage);

		ChatCompletionResult chatCompletionResult = new ChatCompletionResult();
		chatCompletionResult.setChoices(ChatMessagesBuilder.create().assistant(strMessage).build());
		iDELogicSession.setLastReturn(prompt);
		iDELogicSession.setResult(chatCompletionResult);
		iDELogicSession.setNext(IDELogicSession.NEXT_END);
	}
	
	protected ObjectNode getChatDecisionPromptNode(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic) {
		ObjectNode promptNode = JsonUtils.createObjectNode();
		//放入当前任务标识
		promptNode.put("id", iPSDESysAIChatAgentLogic.getCodeName());
		ArrayNode choicesNode = promptNode.putArray("links");
		IPSDELogicLink defaultPSDELogicLink = null;
		int nIndex = 1;
		for (IPSDELogicLink iPSDELogicLink : iPSDESysAIChatAgentLogic.getPSDELogicLinks()) {
			if(iPSDELogicLink.isCatchLink() || iPSDELogicLink.isSubCallLink()) {
				continue;
			}
			
			if(iPSDELogicLink.isDefaultLink()) {
				defaultPSDELogicLink = iPSDELogicLink;
				continue;
			}
			
			ObjectNode agentNode = choicesNode.addObject();
			agentNode.put("id", iPSDELogicLink.getDstPSDELogicNodeMust().getCodeName());
			agentNode.put("name", iPSDELogicLink.getName());
			agentNode.put("index", String.valueOf(nIndex));
			if (StringUtils.hasLength(iPSDELogicLink.getMemo())) {
				agentNode.put("description", iPSDELogicLink.getMemo());
			}
//			else
//				if (StringUtils.hasLength(iPSDELogicLink.getDstPSDELogicNodeMust().getMemo())) {
//						agentNode.put("description", iPSDELogicLink.getDstPSDELogicNodeMust().getMemo());
//					}
//					else
//						agentNode.put("description", iPSDELogicLink.getDstPSDELogicNodeMust().getName());
			nIndex ++;
		}
		
		if(defaultPSDELogicLink!=null) {
			ObjectNode agentNode = choicesNode.addObject();
			agentNode.put("id", defaultPSDELogicLink.getDstPSDELogicNodeMust().getCodeName());
			agentNode.put("name", defaultPSDELogicLink.getName());
			agentNode.put("index", "0");
			if (StringUtils.hasLength(defaultPSDELogicLink.getMemo())) {
				agentNode.put("description", defaultPSDELogicLink.getMemo());
			}
//			else
//				if (StringUtils.hasLength(defaultPSDELogicLink.getDstPSDELogicNodeMust().getMemo())) {
//						agentNode.put("description", defaultPSDELogicLink.getDstPSDELogicNodeMust().getMemo());
//					}
//					else
//						agentNode.put("description", defaultPSDELogicLink.getDstPSDELogicNodeMust().getName());
		}
		
		return promptNode;
	}
	
	protected String getChatDecisionPromptText(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, ObjectNode promptNode) {
		StringBuilder sb = new StringBuilder();
		ArrayNode choicesNode = (ArrayNode)promptNode.get("links");
		for(int i = 0;i<choicesNode.size();i++) {
			ObjectNode node = (ObjectNode)choicesNode.get(i);
			String strIndex = node.get("index").asText();
			String strName = node.get("name").asText();
			String strDescription = null;
			if(node.has("description")) {
				strDescription = node.get("description").asText();
			}
			if(StringUtils.hasLength(strDescription)) {
				strDescription = strDescription.replace("\r\n", "\n").replace("\n", "");
			}
			
			if(!"0".equals(strIndex)) {
				sb.append(String.format("(%1$s)**%2$s**", strIndex, strName));
			}
			else {
				//默认不输出序号
				sb.append(String.format("<BR>**%1$s**", strName));
			}
			if(StringUtils.hasLength(strDescription)) {
				sb.append(String.format("：%1$s", strDescription));
			}
			sb.append(String.format("<BR>"));
		}
		
		return sb.toString();
	}
	

	

	protected void onExecuteChatStep(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, Map<String, Object> params) throws Throwable {

		IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime) iDELogicRuntimeContext.getSystemRuntime();
		ISysAIFactoryRuntime iSysAIFactoryRuntime = null;
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime =null;

		if(iPSDESysAIChatAgentLogic.getPSSysAIFactory() != null && iPSDESysAIChatAgentLogic.getPSSysAIChatAgent() != null) {
			iSysAIFactoryRuntime = iServiceSystemRuntime.getSysAIFactoryRuntime(iPSDESysAIChatAgentLogic.getPSSysAIFactoryMust().getId(), false);
			iSysAIChatAgentRuntime = iSysAIFactoryRuntime.getAIChatAgentRuntime(iPSDESysAIChatAgentLogic.getPSSysAIChatAgentMust().getCodeName(), false);
		}
		
		Object objParam = null;
		IDELogicParamRuntime iDELogicParamRuntime = null;
		if (iPSDESysAIChatAgentLogic.getDstPSDELogicParam() != null) {
			iDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getDstPSDELogicParamMust().getCodeName(), false);
			objParam = iDELogicParamRuntime.getParamObject(iDELogicSession);
		}

		String strMessage = iPSDESysAIChatAgentLogic.getMessage();
		if (!StringUtils.hasLength(strMessage) && iPSDESysAIChatAgentLogic.getPSSysMsgTempl() != null) {
			strMessage = iPSDESysAIChatAgentLogic.getPSSysMsgTempl().getContent();
		}

		String strTitle = iPSDESysAIChatAgentLogic.getTitle();

		Map<String, Object> templParams = new HashMap<String, Object>();
		if(iSysAIChatAgentRuntime != null) {
			templParams.put(TEMPLATE_PARAM_AGENT, iSysAIChatAgentRuntime.getTemplateContext(MsgTemplEngine.FREEMARKER));
		}
		
		// 获取实际内容
		if (StringUtils.hasLength(strMessage)) {
			strMessage = this.getTemplateContent(iDELogicRuntimeContext, iDELogicSession, strMessage, templParams);
		}
		if (StringUtils.hasLength(strTitle)) {
			strTitle = this.getTemplateContent(iDELogicRuntimeContext, iDELogicSession, strTitle, templParams);
		}

		ObjectNode jsonNode = JsonUtils.createObjectNode();
		if (StringUtils.hasLength(strTitle)) {
			jsonNode.put("title", strTitle);
		}
		jsonNode.put("content", strMessage);
		String strContent = String.format("\r\n<%1$s>\r\n%2$s\r\n</%1$s>\r\n", DELogicSysAIChatAgentType.CHATSTEP.name().toLowerCase(), jsonNode.toPrettyString());

		if (objParam instanceof ChatCompletionResult) {
			// 结果对象
			ChatCompletionResult chatCompletionResult = (ChatCompletionResult) objParam;
			if (!ObjectUtils.isEmpty(chatCompletionResult.getChoices())) {
				// 附加到最后面
				String strOriginContent = chatCompletionResult.getChoices().get(0).getContent();
				if(StringUtils.hasLength(strOriginContent)) {
					strOriginContent += "\r\n";
				}
				strOriginContent += strContent;
				chatCompletionResult.getChoices().get(0).setContent(strOriginContent);
			} else {
				ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
				actionSession.updateActionStep(strContent, 0.0f, strContent);
				Thread.sleep(200);
				chatCompletionResult.setChoices(ChatMessagesBuilder.create().assistant(strContent).build());
			}

			iDELogicSession.setLastReturn(chatCompletionResult);
			return;
		}

		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
		actionSession.updateActionStep(strContent, 0.0f, strContent);
		Thread.sleep(200);

		ChatCompletionResult chatCompletionResult = new ChatCompletionResult();
		chatCompletionResult.setChoices(ChatMessagesBuilder.create().assistant(strContent).build());
		iDELogicSession.setLastReturn(chatCompletionResult);
	}

	protected void onExecuteChatUIAction(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, Map<String, Object> params) throws Throwable {

		IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime) iDELogicRuntimeContext.getSystemRuntime();
		ISysAIFactoryRuntime iSysAIFactoryRuntime = null;
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime =null;

		if(iPSDESysAIChatAgentLogic.getPSSysAIFactory() != null && iPSDESysAIChatAgentLogic.getPSSysAIChatAgent() != null) {
			iSysAIFactoryRuntime = iServiceSystemRuntime.getSysAIFactoryRuntime(iPSDESysAIChatAgentLogic.getPSSysAIFactoryMust().getId(), false);
			iSysAIChatAgentRuntime = iSysAIFactoryRuntime.getAIChatAgentRuntime(iPSDESysAIChatAgentLogic.getPSSysAIChatAgentMust().getCodeName(), false);
		}
		
		Object objParam = null;
		IDELogicParamRuntime iDELogicParamRuntime = null;
		if (iPSDESysAIChatAgentLogic.getDstPSDELogicParam() != null) {
			iDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getDstPSDELogicParamMust().getCodeName(), false);
			objParam = iDELogicParamRuntime.getParamObject(iDELogicSession);
		}

		String strMessage = iPSDESysAIChatAgentLogic.getMessage();
		if (!StringUtils.hasLength(strMessage) && iPSDESysAIChatAgentLogic.getPSSysMsgTempl() != null) {
			strMessage = iPSDESysAIChatAgentLogic.getPSSysMsgTempl().getContent();
		}

		String strTitle = iPSDESysAIChatAgentLogic.getTitle();

		Map<String, Object> templParams = new HashMap<String, Object>();
		if(iSysAIChatAgentRuntime != null) {
			templParams.put(TEMPLATE_PARAM_AGENT, iSysAIChatAgentRuntime.getTemplateContext(MsgTemplEngine.FREEMARKER));
		}
		
		// 获取实际内容
		if (StringUtils.hasLength(strMessage)) {
			strMessage = this.getTemplateContent(iDELogicRuntimeContext, iDELogicSession, strMessage, templParams);
		}
		if (StringUtils.hasLength(strTitle)) {
			strTitle = this.getTemplateContent(iDELogicRuntimeContext, iDELogicSession, strTitle, templParams);
		}

		ObjectNode jsonNode = JsonUtils.createObjectNode();
		if (StringUtils.hasLength(strTitle)) {
			jsonNode.put("title", strTitle);
		}
		jsonNode.put("content", strMessage);
		String strContent = String.format("\r\n<%1$s>\r\n%2$s\r\n</%1$s>\r\n", DELogicSysAIChatAgentType.CHATUIACTION.name().toLowerCase(), jsonNode.toPrettyString());

		if (objParam instanceof ChatCompletionResult) {
			// 结果对象
			ChatCompletionResult chatCompletionResult = (ChatCompletionResult) objParam;
			if (!ObjectUtils.isEmpty(chatCompletionResult.getChoices())) {
				// 附加到最后面
				String strOriginContent = chatCompletionResult.getChoices().get(0).getContent();
				if(StringUtils.hasLength(strOriginContent)) {
					strOriginContent += "\r\n";
				}
				strOriginContent += strContent;
				chatCompletionResult.getChoices().get(0).setContent(strOriginContent);
			} else {
				ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
				actionSession.updateActionStep(strContent, 0.0f, strContent);
				Thread.sleep(200);
				chatCompletionResult.setChoices(ChatMessagesBuilder.create().assistant(strContent).build());
			}

			iDELogicSession.setLastReturn(chatCompletionResult);
			return;
		}

		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
		//this.doAssistantOutput(actionSession, strContent);
		actionSession.updateActionStep(strContent, 0.0f, strContent);
		Thread.sleep(200);

		ChatCompletionResult chatCompletionResult = new ChatCompletionResult();
		chatCompletionResult.setChoices(ChatMessagesBuilder.create().assistant(strContent).build());
		iDELogicSession.setLastReturn(chatCompletionResult);
	}
	
	protected void onExecuteChatKnowledgeBases(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, Map<String, Object> params) throws Throwable {
		if(iPSDESysAIChatAgentLogic.getSrcPSDELogicParam() == null) {
			throw new Exception("未指定候选知识库参数对象");
		}
		
		
		ISysAIFactoryRuntime iSysAIFactoryRuntime = null;
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime =null;
		IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime) iDELogicRuntimeContext.getSystemRuntime();
		if(iPSDESysAIChatAgentLogic.getPSSysAIFactory() != null && iPSDESysAIChatAgentLogic.getPSSysAIChatAgent() != null) {
			iSysAIFactoryRuntime = iServiceSystemRuntime.getSysAIFactoryRuntime(iPSDESysAIChatAgentLogic.getPSSysAIFactoryMust().getId(), false);
			iSysAIChatAgentRuntime = iSysAIFactoryRuntime.getAIChatAgentRuntime(iPSDESysAIChatAgentLogic.getPSSysAIChatAgentMust().getCodeName(), false);
		}
		
		IDELogicParamRuntime srcDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getSrcPSDELogicParam().getCodeName(), false);
		Object srcParam = srcDELogicParamRuntime.getParamObject(iDELogicSession);
		List srcList = DELogicParamRuntime.asList(srcParam);
		if(ObjectUtils.isEmpty(srcList)) {
			throw new Exception(String.format("知识库参数未包含任何数据"));
		}
		
		List<KnowledgeBase> knowledgeBaseList = new ArrayList<KnowledgeBase>();
		for(Object item : srcList) {
			if(item instanceof IEntityDTO) {
				IEntityDTO iEntityDTO = (IEntityDTO)item;
				if(iEntityDTO.getDEMethodDTORuntime() != null) {
					IDataEntityRuntime iDataEntityRuntime = (IDataEntityRuntime)iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime();
					KnowledgeBase knowledgeBase = new KnowledgeBase();
					knowledgeBase.setId(String.valueOf(iDataEntityRuntime.getKeyFieldValue(iEntityDTO)));
					knowledgeBase.setName(iDataEntityRuntime.getMajorTextIf(iEntityDTO));
					IPSDEField descriptionPSDEField = iDataEntityRuntime.getPSDEFieldByTag(KnowledgeBase.FIELD_DESCRIPTION, true);
					if(descriptionPSDEField != null) {
						knowledgeBase.setDescription(iEntityDTO.getString(descriptionPSDEField.getLowerCaseName(), null));
					}
					else {
						knowledgeBase.setDescription(iEntityDTO.getString(KnowledgeBase.FIELD_DESCRIPTION, null));
					}
					knowledgeBaseList.add(knowledgeBase);
					continue;
				}
			}
			//直接进行对象转化
			try {
				KnowledgeBase knowledgeBase = JsonUtils.as(item, KnowledgeBase.class);
				knowledgeBaseList.add(knowledgeBase);
			}
			catch (Throwable ex) {
				throw new Exception(String.format("转化数据[%1$s]至知识库对象发生异常，%2$s", ex.getMessage()), ex);
			}
			continue;
		}
		
		IDELogicParamRuntime iDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getDstPSDELogicParamMust().getCodeName(), false);
		
		ChatCompletionRequest data = new ChatCompletionRequest();
		Object objParam = iDELogicParamRuntime.getParamObject(iDELogicSession);
		if (objParam instanceof ChatCompletionRequest) {
			ChatCompletionRequest chatCompletionRequest2 = (ChatCompletionRequest) objParam;
			// 放入历史消息
			if (iPSDESysAIChatAgentLogic.getHistoryCount() > 0 && !ObjectUtils.isEmpty(chatCompletionRequest2.getMessages()) && chatCompletionRequest2.getMessages().size() > iPSDESysAIChatAgentLogic.getHistoryCount()) {
				List<ChatMessage> list = chatCompletionRequest2.getMessages().subList(chatCompletionRequest2.getMessages().size() - iPSDESysAIChatAgentLogic.getHistoryCount(), chatCompletionRequest2.getMessages().size());
				data.setMessages(list);
			} else {
				data.setMessages(chatCompletionRequest2.getMessages());
			}
		}
		else
			throw new Exception(String.format("未识别的数据[%1$s]", objParam));

		// 判断模式
		List<String> kbIdList = new ArrayList<String>();
		String strCategoryMode = DataTypeUtils.asString(iPSDESysAIChatAgentLogic.getCategoryMode(), DELogicSysAIChatCategoryMode.RERANK.value);
		if (DELogicSysAIChatCategoryMode.RERANK.value.equals(strCategoryMode) || DELogicSysAIChatCategoryMode.MIXED.value.equals(strCategoryMode)) {
			TextReRankRequest textReRankRequest = new TextReRankRequest();
			textReRankRequest.setQuery(AIChatUtils.getLastChatMessage(data).getContent());
			
			Map<String, String> documentMap = new LinkedHashMap<String, String>();
			List<Document> documentList = new ArrayList<Document>();
			
			
			for(KnowledgeBase knowledgeBase : knowledgeBaseList) {
				String strContent = knowledgeBase.getName();
				if(StringUtils.hasLength(knowledgeBase.getDescription())) {
					strContent += ",";
					strContent += knowledgeBase.getDescription();
				}
				
				documentMap.put(strContent, knowledgeBase.getId());
				Document document = new Document();
				document.setContent(strContent);
				documentList.add(document);
			}
			

			if(ObjectUtils.isEmpty(documentList)) {
				throw new Exception("未指定重排序项");
			}

			textReRankRequest.setDocuments(documentList);

			Double fReRankThreshold = iPSDESysAIChatAgentLogic.getCategoryReRankThreshold();
			if(fReRankThreshold == null) {
				fReRankThreshold = new Double(0.15f);
			}

			TextReRankResult textReRankResult = null;
			if(iSysAIChatAgentRuntime != null) {
				textReRankResult = iServiceSystemRuntime.getSysAIUtilRuntime(false).textReRank(iSysAIChatAgentRuntime.getAIPlatformType(), textReRankRequest);
			}
			else {
				textReRankResult = iServiceSystemRuntime.getSysAIUtilRuntime(false).textReRank(textReRankRequest);
			}

			int nMaxKBCount = iPSDESysAIChatAgentLogic.getKnowledgeBaseCount();
			if(nMaxKBCount <= 0) {
				nMaxKBCount = 1;
			}
			
			
			if (!ObjectUtils.isEmpty(textReRankResult.getDocuments())) {
				for (TextReRankDocument textReRankDocument : textReRankResult.getDocuments()) {
					if (textReRankDocument.getDocument() == null) {
						continue;
					}
					log.debug(String.format("rerank score[%1$s]: %2$s", textReRankDocument.getRelevanceScore().doubleValue(), textReRankDocument.getDocument().getContent()));
					String strKBId = documentMap.get(textReRankDocument.getDocument().getContent());
					if (StringUtils.hasLength(strKBId)) {
						if(textReRankDocument.getRelevanceScore().doubleValue() >= fReRankThreshold.doubleValue()) {
							kbIdList.add(strKBId);
							if(kbIdList.size() == nMaxKBCount) {
								break;
							}
						}
						else {
							break;
						}
					}
				}
			}
		}

		if (ObjectUtils.isEmpty(kbIdList) && (DELogicSysAIChatCategoryMode.LLM.value.equals(strCategoryMode) || DELogicSysAIChatCategoryMode.MIXED.value.equals(strCategoryMode))) {
			if (params == null) {
				params = new HashMap<String, Object>();
			}

			params.put("data", data);
			ObjectNode promptNode = getChatKnowledgeBasesPromptNode(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, data, knowledgeBaseList);
			params.put("prompt_text", promptNode.toPrettyString());
			if(iSysAIChatAgentRuntime != null) {
				params.put(TEMPLATE_PARAM_AGENT, iSysAIChatAgentRuntime.getTemplateContext(MsgTemplEngine.FREEMARKER));
			}

			String strMessage = iPSDESysAIChatAgentLogic.getMessage();
			if (!StringUtils.hasLength(strMessage) && iPSDESysAIChatAgentLogic.getPSSysMsgTempl() != null) {
				strMessage = iPSDESysAIChatAgentLogic.getPSSysMsgTempl().getContent();
			}
			if (!StringUtils.hasLength(strMessage)) {
				strMessage = PROMPT;
			}
			// 获取实际内容
			if (StringUtils.hasLength(strMessage)) {
				strMessage = this.getTemplateContent(iDELogicRuntimeContext, iDELogicSession, strMessage, params);
			}

			ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();
			// chatCompletionRequest.setStreaming(EntityBase.BOOLEAN_FALSE);
			chatCompletionRequest.setMessages(ChatMessagesBuilder.create().user(strMessage).build());

			ChatCompletionResult chatCompletionResult = null;
			if(iSysAIChatAgentRuntime != null) {
				chatCompletionResult = iSysAIChatAgentRuntime.chatCompletion(new Entity(), chatCompletionRequest, null, true, false);
			}
			else {
				chatCompletionResult = iServiceSystemRuntime.getSysAIUtilRuntime(false).chatCompletion(chatCompletionRequest);
			}

			Object result = this.getRealResult(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, chatCompletionResult, chatCompletionRequest, objParam);
			Map map = null;
			if (result instanceof String) {
				String strJsonContent = getJsonContent((String) result);
				map = JsonUtils.asMap(strJsonContent);
			} else if (result instanceof Map) {
				map = (Map) result;
			} else
				throw new Exception(String.format("无法识别的返回数据[%1$s]", result));

			String strName = (String) map.get(JSON_NAME);
			if (ObjectUtils.isEmpty(strName)) {
				throw new Exception(String.format("返回数据[%1$s]未指定知识库名称", result));
			}
			
			for(KnowledgeBase knowledgeBase : knowledgeBaseList) {
				if(strName.equals(knowledgeBase.getName())) {
					kbIdList.add(knowledgeBase.getId());
					break;
				}
			}
		}
		
		if(ObjectUtils.isEmpty(kbIdList)) {
			throw new Exception("未选择任何知识库");
		}
		
		data.setKnowledgeBases(kbIdList);
		
		iDELogicSession.setLastReturn(data);
	}
	
	protected ObjectNode getChatKnowledgeBasesPromptNode(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, ChatCompletionRequest request, List<KnowledgeBase> knowledgeBaseList) {
		ObjectNode promptNode = JsonUtils.createObjectNode();
		promptNode.put("task", iPSDESysAIChatAgentLogic.getName());
		if (StringUtils.hasLength(iPSDESysAIChatAgentLogic.getMemo())) {
			promptNode.put("description", iPSDESysAIChatAgentLogic.getMemo());
		}
		promptNode.put("prompt", String.format("请根据以下最近%1$s条对话消息，从可选知识库列表中选择最适合处理当前用户请求的`知识库`，并说明选择原因。要求输出为 JSON 格式，包含 `name`（选择的`知识库`名称）和 'reason'（选择原因）字段", request.getMessages().size()));
		ArrayNode messagesNode = promptNode.putArray("messages");
		for (ChatMessage message : request.getMessages()) {
			ObjectNode messageNode = messagesNode.addObject();
			messageNode.put(ChatMessage.FIELD_ROLE, message.getRole());
			messageNode.put(ChatMessage.FIELD_CONTENT, message.getContent());
		}
		ArrayNode knowledgeBaseNode = promptNode.putArray("knowledge_bases");
		for (KnowledgeBase knowledgeBase : knowledgeBaseList) {
			ObjectNode agentNode = knowledgeBaseNode.addObject();
			agentNode.put("name", knowledgeBase.getName());
			if (StringUtils.hasLength(knowledgeBase.getDescription())) {
				agentNode.put("description", knowledgeBase.getDescription());
			}
		}
		promptNode.set("output_format", CHAT_KNOWLEDGEBASES_OUTPUT_FORMAT_JSON);

		return promptNode;
	}
	

	protected void onExecuteFetchChunks(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, Map<String, Object> params) throws Throwable {
		IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime) iDELogicRuntimeContext.getSystemRuntime();
		ISysAIFactoryRuntime iSysAIFactoryRuntime = iServiceSystemRuntime.getSysAIFactoryRuntime(iPSDESysAIChatAgentLogic.getPSSysAIFactoryMust().getId(), false);
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime = iSysAIFactoryRuntime.getAIChatAgentRuntime(iPSDESysAIChatAgentLogic.getPSSysAIChatAgentMust().getCodeName(), false);
		IDELogicParamRuntime iDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getDstPSDELogicParamMust().getCodeName(), false);

		ChunkSearchContext chunkSearchContext = null;
		Object objParam = iDELogicParamRuntime.getParamObject(iDELogicSession);
		if (objParam instanceof ISearchContextDTO) {
			ISearchContextDTO iSearchContext = (ISearchContextDTO) objParam;
			chunkSearchContext = new ChunkSearchContext(iSearchContext);

		} else {
			throw new Exception(String.format("未识别的数据[%1$s]，仅支持`搜索上下文对象`", objParam));
		}

		Object objRet = iSysAIChatAgentRuntime.fetchChunks(chunkSearchContext);

		iDELogicSession.setLastReturn(objRet);

		if (iPSDESysAIChatAgentLogic.getRetPSDELogicParam() != null) {
			IDELogicParamRuntime retDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getRetPSDELogicParam().getCodeName(), false);
			retDELogicParamRuntime.bind(iDELogicSession, objRet);
		}
	}

	protected void onAppendChatRequest(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, Map<String, Object> params) throws Throwable {

		IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime) iDELogicRuntimeContext.getSystemRuntime();
		ISysAIFactoryRuntime iSysAIFactoryRuntime = null;
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime =null;

		if(iPSDESysAIChatAgentLogic.getPSSysAIFactory() != null && iPSDESysAIChatAgentLogic.getPSSysAIChatAgent() != null) {
			iSysAIFactoryRuntime = iServiceSystemRuntime.getSysAIFactoryRuntime(iPSDESysAIChatAgentLogic.getPSSysAIFactoryMust().getId(), false);
			iSysAIChatAgentRuntime = iSysAIFactoryRuntime.getAIChatAgentRuntime(iPSDESysAIChatAgentLogic.getPSSysAIChatAgentMust().getCodeName(), false);
		}
		
		IDELogicParamRuntime iDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getDstPSDELogicParamMust().getCodeName(), false);
		Object objParam = iDELogicParamRuntime.getParamObject(iDELogicSession);

		String strMessage = iPSDESysAIChatAgentLogic.getMessage();
		if (!StringUtils.hasLength(strMessage) && iPSDESysAIChatAgentLogic.getPSSysMsgTempl() != null) {
			strMessage = iPSDESysAIChatAgentLogic.getPSSysMsgTempl().getContent();
		}

		// 获取实际内容
		if (StringUtils.hasLength(strMessage)) {
			Map<String, Object> templParams = new HashMap<String, Object>();
			if(iSysAIChatAgentRuntime != null) {
				templParams.put(TEMPLATE_PARAM_AGENT, iSysAIChatAgentRuntime.getTemplateContext(MsgTemplEngine.FREEMARKER));
			}
			strMessage = this.getTemplateContent(iDELogicRuntimeContext, iDELogicSession, strMessage, templParams);
		}
		ChatCompletionRequest chatCompletionRequest = null;
		if (objParam instanceof ChatCompletionRequest) {
			// 结果对象
			chatCompletionRequest = (ChatCompletionRequest) objParam;

		} else {
			throw new Exception(String.format("未识别的数据[%1$s]，仅支持`聊天请求对象`", objParam));
		}

		//获取附加模式
		String strChatRequestAppendMode = iPSDESysAIChatAgentLogic.getChatRequestAppendMode();
		DELogicSysAIChatRequestAppendMode chatRequestAppendMode = StringUtils.hasLength(strChatRequestAppendMode)?DELogicSysAIChatRequestAppendMode.from(strChatRequestAppendMode) : DELogicSysAIChatRequestAppendMode.CURRENT;
		switch(chatRequestAppendMode) {
			case ASSISTANT:
				chatCompletionRequest.getMessagesIf().addAll(ChatMessagesBuilder.create().assistant(strMessage).build());
				break;
			case USER:
				chatCompletionRequest.getMessagesIf().addAll(ChatMessagesBuilder.create().user(strMessage).build());
				break;
			case CURRENT:
				int nMessageSize = chatCompletionRequest.getMessagesIf().size();
				if(nMessageSize == 0) {
					throw new Exception("当前消息无效");
				}
				String strLast = chatCompletionRequest.getMessages().get(nMessageSize - 1).getContent();
				if(StringUtils.hasLength(strLast)) {
					strLast += "\r\n";
				}
				strLast += strMessage;
				chatCompletionRequest.getMessages().get(nMessageSize - 1).setContent(strLast);
				break;
			case SYSTEM:
				//判断第一个消息是否为SYSTEM
				if(!ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
					if(ChatMessageRole.SYSTEM.getValue().equalsIgnoreCase(chatCompletionRequest.getMessages().get(0).getRole())) {
						throw new Exception("当前已存在系统消息");
					}
				}
				chatCompletionRequest.getMessagesIf().addAll(0, ChatMessagesBuilder.create().system(strMessage).build());
				break;
		}


		iDELogicSession.setLastReturn(chatCompletionRequest);
//		if (iPSDESysAIChatAgentLogic.getRetPSDELogicParam() != null) {
//			IDELogicParamRuntime retDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getRetPSDELogicParam().getCodeName(), false);
//			retDELogicParamRuntime.bind(iDELogicSession, chatCompletionResult);
//		}

	}

	protected void onAppendChatResult(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, Map<String, Object> params) throws Throwable {

		IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime) iDELogicRuntimeContext.getSystemRuntime();
		ISysAIFactoryRuntime iSysAIFactoryRuntime = null;
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime =null;

		if(iPSDESysAIChatAgentLogic.getPSSysAIFactory() != null && iPSDESysAIChatAgentLogic.getPSSysAIChatAgent() != null) {
			iSysAIFactoryRuntime = iServiceSystemRuntime.getSysAIFactoryRuntime(iPSDESysAIChatAgentLogic.getPSSysAIFactoryMust().getId(), false);
			iSysAIChatAgentRuntime = iSysAIFactoryRuntime.getAIChatAgentRuntime(iPSDESysAIChatAgentLogic.getPSSysAIChatAgentMust().getCodeName(), false);
		}
		
		
		IDELogicParamRuntime iDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getDstPSDELogicParamMust().getCodeName(), false);
		Object objParam = iDELogicParamRuntime.getParamObject(iDELogicSession);

		String strMessage = iPSDESysAIChatAgentLogic.getMessage();
		if (!StringUtils.hasLength(strMessage) && iPSDESysAIChatAgentLogic.getPSSysMsgTempl() != null) {
			strMessage = iPSDESysAIChatAgentLogic.getPSSysMsgTempl().getContent();
		}

		// 获取实际内容
		if (StringUtils.hasLength(strMessage)) {
			Map<String, Object> templParams = new HashMap<String, Object>();
			if(iSysAIChatAgentRuntime != null) {
				templParams.put(TEMPLATE_PARAM_AGENT, iSysAIChatAgentRuntime.getTemplateContext(MsgTemplEngine.FREEMARKER));
			}
			strMessage = this.getTemplateContent(iDELogicRuntimeContext, iDELogicSession, strMessage, templParams);
		}
		ChatCompletionResult chatCompletionResult = null;
		if (objParam instanceof ChatCompletionResult) {
			// 结果对象
			chatCompletionResult = (ChatCompletionResult) objParam;

		} else {
			throw new Exception(String.format("未识别的数据[%1$s]，仅支持`聊天结果对象`", objParam));
		}

		if (ObjectUtils.isEmpty(chatCompletionResult.getChoices())) {
			chatCompletionResult.setChoices(ChatMessagesBuilder.create().assistant(strMessage).build());
		}
		else {
			String strContent = chatCompletionResult.getChoices().get(0).getContent();
			if (StringUtils.hasLength(strContent)) {
				strContent += "\r\n";
			} else {
				strContent = "";
			}
			strContent += strMessage;
			chatCompletionResult.getChoices().get(0).setContent(strContent);
		}

		iDELogicSession.setLastReturn(chatCompletionResult);
//		if (iPSDESysAIChatAgentLogic.getRetPSDELogicParam() != null) {
//			IDELogicParamRuntime retDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getRetPSDELogicParam().getCodeName(), false);
//			retDELogicParamRuntime.bind(iDELogicSession, chatCompletionResult);
//		}

	}

	/**
	 * 仿真助手输出
	 *
	 * @param actionSession
	 * @param strMessage
	 * @throws Throwable
	 */
	protected void doAssistantOutput(ActionSession actionSession, String strMessage) throws Throwable {

		String strLastResult = "";
		Encoding encoding = JTokenKitUtils.getEncoding(EncodingType.CL100K_BASE);
		IntArrayList list = encoding.encode(strMessage);
		int nTotalTokens = list.size();
		int nLastStart = 0;
		while (true) {
			PortalAsyncAction last = new PortalAsyncAction();

			int nSize = 20 + (random.nextInt(100) % 10);

			int nCurEnd = nLastStart + nSize;

			if (nCurEnd > nTotalTokens) {
				nCurEnd = nTotalTokens;
			}
			// 备份
			nLastStart = nCurEnd;

			IntArrayList curList = new IntArrayList(nCurEnd);
			for (int i = 0; i < nCurEnd; i++) {
				curList.add(list.get(i));
			}

			String strCurResult = encoding.decode(curList);
			String strCurStep = strCurResult.substring(strLastResult.length());
			last.setStepInfo(strCurStep);
			last.setActionResult(strCurResult);

			strLastResult = strCurResult;

			double fCompletionRate = 0.0f;
			if (last.getCompletionRate() != null) {
				fCompletionRate = last.getCompletionRate().doubleValue();
			}

			actionSession.updateActionStep(last.getStepInfo(), fCompletionRate, last.getActionResult());

			try {
				Thread.sleep(200);
			} catch (InterruptedException ex) {
				log.error(ex);
			}

			if (nCurEnd >= nTotalTokens) {
				// 结束
				break;
			}
		}
	}

	protected void onExecuteChatAggregation(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, Map<String, Object> params, boolean bAsync) throws Throwable {
		// 获取逻辑节点的后续连接
		List<IPSDELogicLink> psDELogicLinks = iPSDESysAIChatAgentLogic.getPSDELogicLinks();
		if (ObjectUtils.isEmpty(psDELogicLinks)) {
			throw new Exception("未定义后续处理节点");
		}

		// 获取子调用节点，子类型需要是默认
		Map<String, IPSDELogicLink> subPSDESysAIChatAgentLogicMap = new HashMap<String, IPSDELogicLink>();
		for (IPSDELogicLink iPSDELogicLink : psDELogicLinks) {
			if (!iPSDELogicLink.isSubCallLink()) {
				continue;
			}

			subPSDESysAIChatAgentLogicMap.put(iPSDELogicLink.getName(), iPSDELogicLink);
		}

		if (ObjectUtils.isEmpty(subPSDESysAIChatAgentLogicMap)) {
			throw new Exception("未定义AI交互并行节点");
		}

		IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime) iDELogicRuntimeContext.getSystemRuntime();
		Map<String, Object> subPSDESysAIChatAgentLogicResultMap = new ConcurrentHashMap<String, Object>();
		// 启动线程
		for (IPSDELogicLink iPSDELogicLink : subPSDESysAIChatAgentLogicMap.values()) {
			final Map<String, Object> params2 = new HashMap<String, Object>();
			if (params != null) {
				params2.putAll(params);
			}
			iServiceSystemRuntime.threadRun(new Runnable() {
				@Override
				public void run() {
					try {
						Object ret = doSubChatCompletionCall(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, iPSDELogicLink, params2);
						subPSDESysAIChatAgentLogicResultMap.put(iPSDELogicLink.getName(), ret);
					} catch (Throwable ex) {
						log.error(String.format("处理子交互[%1$s]发生异常，%2$s", iPSDELogicLink.getName(), ex.getMessage()), ex);
						subPSDESysAIChatAgentLogicResultMap.put(iPSDELogicLink.getName(), ex);
					}
				}
			});
		}

		while (subPSDESysAIChatAgentLogicMap.size() != subPSDESysAIChatAgentLogicResultMap.size()) {
			Thread.sleep(10);
		}

		// 判断返回值是否存在异常
		for (java.util.Map.Entry<String, Object> entry : subPSDESysAIChatAgentLogicResultMap.entrySet()) {
			if (entry.getValue() instanceof Throwable) {
				Throwable ex = (Throwable) entry.getValue();
				throw new Exception(String.format("处理子交互[%1$s]发生异常，%2$s", entry.getKey(), ex.getMessage()), ex);
			}
		}

		ISysAIFactoryRuntime iSysAIFactoryRuntime = iServiceSystemRuntime.getSysAIFactoryRuntime(iPSDESysAIChatAgentLogic.getPSSysAIFactoryMust().getId(), false);
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime = iSysAIFactoryRuntime.getAIChatAgentRuntime(iPSDESysAIChatAgentLogic.getPSSysAIChatAgentMust().getCodeName(), false);
		IDELogicParamRuntime iDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getDstPSDELogicParamMust().getCodeName(), false);

		// strJSCode += "sys,logic,entity,data,param";
		if (params == null) {
			params = new HashMap<String, Object>();
		}
		// params.put(sys, iDELogicRuntimeContext.getSystemRuntime());
		params.put("logic", iDELogicRuntimeContext.getDELogicRuntime());
		params.put("param", iDELogicParamRuntime);
		params.put("node", iPSDESysAIChatAgentLogic);
		

		ChatCompletionRequest data = new ChatCompletionRequest();
		Object objParam = iDELogicParamRuntime.getParamObject(iDELogicSession);
		if (objParam instanceof ChatCompletionRequest) {
			ChatCompletionRequest chatCompletionRequest2 = (ChatCompletionRequest) objParam;
			// 放入历史消息
			if (iPSDESysAIChatAgentLogic.getHistoryCount() > 0 && !ObjectUtils.isEmpty(chatCompletionRequest2.getMessages()) && chatCompletionRequest2.getMessages().size() > iPSDESysAIChatAgentLogic.getHistoryCount()) {
				List<ChatMessage> list = chatCompletionRequest2.getMessages().subList(chatCompletionRequest2.getMessages().size() - iPSDESysAIChatAgentLogic.getHistoryCount(), chatCompletionRequest2.getMessages().size());
				data.setMessages(list);
			} else {
				data.setMessages(chatCompletionRequest2.getMessages());
			}
		} else if (objParam instanceof String) {
			data.setMessages(new ChatMessagesBuilder().user(objParam.toString()).build());
		} else
			throw new Exception(String.format("未识别的数据[%1$s]", objParam));

		params.put("data", data);
		ObjectNode promptNode = getChatAggregationPromptNode(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, data, subPSDESysAIChatAgentLogicResultMap);
		params.put("prompt_text", promptNode.toPrettyString());
		
		if(iSysAIChatAgentRuntime != null) {
			params.put(TEMPLATE_PARAM_AGENT, iSysAIChatAgentRuntime.getTemplateContext(MsgTemplEngine.FREEMARKER));
		}

		String strMessage = iPSDESysAIChatAgentLogic.getMessage();
		if (!StringUtils.hasLength(strMessage) && iPSDESysAIChatAgentLogic.getPSSysMsgTempl() != null) {
			strMessage = iPSDESysAIChatAgentLogic.getPSSysMsgTempl().getContent();
		}
		if (!StringUtils.hasLength(strMessage)) {
			strMessage = PROMPT;
		}
		// 获取实际内容
		if (StringUtils.hasLength(strMessage)) {
			strMessage = this.getTemplateContent(iDELogicRuntimeContext, iDELogicSession, strMessage, params);
		}

		ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();
		chatCompletionRequest.setMessages(ChatMessagesBuilder.create().user(strMessage).build());

		if (bAsync) {
			PortalAsyncAction portalAsyncAction = iSysAIChatAgentRuntime.asyncChatCompletion(new Entity(), chatCompletionRequest, null, true, false);
			iDELogicSession.setResult(portalAsyncAction);
			iDELogicSession.setNext(IDELogicSession.NEXT_END);
		} else {
			ChatCompletionResult chatCompletionResult = iSysAIChatAgentRuntime.chatCompletion(new Entity(), chatCompletionRequest, new LinkedHashMap<String, Object>(), true, false);
			Object objRet = this.getRealResult(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, chatCompletionResult, chatCompletionRequest, objParam);

			iDELogicSession.setLastReturn(objRet);

			if (iPSDESysAIChatAgentLogic.getRetPSDELogicParam() != null) {
				IDELogicParamRuntime retDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getRetPSDELogicParam().getCodeName(), false);
				retDELogicParamRuntime.bind(iDELogicSession, objRet);
			}
		}
	}

	protected Object doSubChatCompletionCall(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, IPSDELogicLink iPSDELogicLink, Map<String, Object> params) throws Throwable {

		iDELogicSession.debugEnterLink(this, iPSDESysAIChatAgentLogic, iPSDELogicLink);
		IDELogicSession last = DELogicSession.getCurrent();
		IDELogicSession cloneDELogicSession = iDELogicSession.clone();
		DELogicSession.setCurrent(cloneDELogicSession);
		try {
			iDELogicRuntimeContext.executeNode(cloneDELogicSession, iPSDELogicLink.getDstPSDELogicNodeMust());
			return iDELogicSession.getLastReturn();
		} finally {
			DELogicSession.setCurrent(last);
		}
	}

	protected ObjectNode getChatAggregationPromptNode(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, ChatCompletionRequest request, Map<String, Object> subPSDESysAIChatAgentLogicResultMap) {
		ObjectNode promptNode = JsonUtils.createObjectNode();
		promptNode.put("task", iPSDESysAIChatAgentLogic.getName());
		if (StringUtils.hasLength(iPSDESysAIChatAgentLogic.getMemo())) {
			promptNode.put("description", iPSDESysAIChatAgentLogic.getMemo());
		}
		promptNode.put("prompt", String.format("根据最近%1$s条对话消息，并综合各辅助 Agent的反馈进行综合输出", request.getMessages().size()));
		ArrayNode messagesNode = promptNode.putArray("messages");
		for (ChatMessage message : request.getMessages()) {
			ObjectNode messageNode = messagesNode.addObject();
			messageNode.put(ChatMessage.FIELD_ROLE, message.getRole());
			messageNode.put(ChatMessage.FIELD_CONTENT, message.getContent());
		}
		ArrayNode agentsNode = promptNode.putArray("agents");
		for (IPSDELogicLink iPSDELogicLink : iPSDESysAIChatAgentLogic.getPSDELogicLinks()) {
			if (!iPSDELogicLink.isSubCallLink()) {
				continue;
			}

			Object ret = subPSDESysAIChatAgentLogicResultMap.get(iPSDELogicLink.getName());
			if (ret == null) {
				continue;
			}

			ObjectNode agentNode = agentsNode.addObject();
			agentNode.put("id", iPSDELogicLink.getName());
			if (StringUtils.hasLength(iPSDELogicLink.getMemo())) {
				agentNode.put("description", iPSDELogicLink.getMemo());
			}
			if (ret instanceof String) {
				agentNode.put("result", (String) ret);
			} else {
				agentNode.put("result", JsonUtils.toString(ret));
			}
		}

		return promptNode;
	}

	protected void fillChatCompletionRequest(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, ChatCompletionRequest chatCompletionRequest, Object objParam) throws Exception {

	}

	protected Object getRealResult(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, ChatCompletionResult chatCompletionResult, ChatCompletionRequest chatCompletionRequest, Object objParam) throws Exception {
		//return AIChatUtils.getRealResult(chatCompletionResult);
		return this.getRealResult(chatCompletionResult, chatCompletionRequest, objParam, iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic);
	}

	protected String getJsonContent(String markdownContent) {
		return AIChatUtils.getJsonContent(markdownContent);
	}

	protected boolean isCancelChatCompletion(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, ActionSession actionSession) {
		if (actionSession == null) {
			actionSession = ActionSessionManager.getCurrentSessionMust();
		}
		String strAsyncActionId = (String) actionSession.getActionParam(ActionSession.PARAM_ASYNCACTION_ID);
		if (ObjectUtils.isEmpty(strAsyncActionId)) {
			return false;
		}
		String strCancelTag = String.format("%1$s-ai-chatcompletion-canceltag--%2$s", CloudCacheTagUtils.PREFIX, strAsyncActionId);
		String strRet = iDELogicRuntimeContext.getSystemRuntime().getSysCacheUtilRuntime(false).get(strCancelTag);
		return "true".equals(strRet);
	}

	protected void fillFreeMarkerTemplParams(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, Map<String, Object> templParams) throws Throwable {
		// 循环所有参数
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		templParams.put("params", params);
		List<IPSDELogicParam> psDELogicParamList = iDELogicRuntimeContext.getDELogicRuntime().getPSDELogic().getPSDELogicParams();
		if (!ObjectUtils.isEmpty(psDELogicParamList)) {
			for (IPSDELogicParam iPSDELogicParam : psDELogicParamList) {
				Object value = this.getLogicParamFreeMarkerValue(iDELogicRuntimeContext, iDELogicSession, iPSDELogicParam);
				params.put(iPSDELogicParam.getCodeName(), value);
				if (!params.containsKey(iPSDELogicParam.getCodeName().toLowerCase())) {
					params.put(iPSDELogicParam.getCodeName().toLowerCase(), value);
				}
			}
		}
		//放入节点模型
		Map<String, Object> nodes = new LinkedHashMap<String, Object>();
		templParams.put("nodes", nodes);
		List<IPSDELogicNode> psDELogicNodeList = iDELogicRuntimeContext.getDELogicRuntime().getPSDELogic().getPSDELogicNodes();
		if (!ObjectUtils.isEmpty(psDELogicNodeList)) {
			for (IPSDELogicNode iPSDELogicNode : psDELogicNodeList) {
				Object value = iPSDELogicNode;
				nodes.put(iPSDELogicNode.getCodeName(), value);
				if (!nodes.containsKey(iPSDELogicNode.getCodeName().toLowerCase())) {
					nodes.put(iPSDELogicNode.getCodeName().toLowerCase(), value);
				}
			}
		}
	}

	protected Object getLogicParamFreeMarkerValue(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicParam iPSDELogicParam) throws Throwable {

		IDELogicParamRuntime iDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDELogicParam.getCodeName(), false);

		Object value = iDELogicParamRuntime.getReal(iDELogicSession);
		if(iPSDELogicParam.isSimpleParam() || iPSDELogicParam.isSimpleListParam()) {
			return value;
		}
		if (iPSDELogicParam.isChatCompletionRequestParam() || iPSDELogicParam.isChatCompletionResultParam() || iPSDELogicParam.isFilterParam() || iPSDELogicParam.isLastReturnParam() || iPSDELogicParam.isEnvParam() || iPSDELogicParam.isSessionParam() || iPSDELogicParam.isAppContextParam() || iPSDELogicParam.isWebContextParam()) {
			return new TemplateDELogicParam(iDELogicParamRuntime);
		}

		if (iPSDELogicParam.isEntityParam() || iPSDELogicParam.isLastParam()) {
			if (value instanceof IEntity) {
				IScriptEntity iScriptEntity = iDELogicRuntimeContext.getSystemRuntime().createScriptEntity((IEntity) value);
				return new TemplateEntity(iScriptEntity);
			}
			return value;
		}

		if (iPSDELogicParam.isEntityListParam()) {
			if (value instanceof List) {
				List list = (List) value;
				return list.stream().filter(item -> item instanceof IEntity).map(item -> {
					IScriptEntity iScriptEntity = iDELogicRuntimeContext.getSystemRuntime().createScriptEntity((IEntity) item);
					return new TemplateEntity(iScriptEntity);
				}).collect(Collectors.toList());
			}
			return value;
		}

		if (iPSDELogicParam.isEntityPageParam()) {
			if (value instanceof Page) {
				Page page = (Page) value;
				List list = page.getContent();
				List<ITemplateEntity> templateEntityList = (List<ITemplateEntity>) list.stream().filter(item -> item instanceof IEntity).map(item -> {
					IScriptEntity iScriptEntity = iDELogicRuntimeContext.getSystemRuntime().createScriptEntity((IEntity) item);
					return new TemplateEntity(iScriptEntity);
				}).collect(Collectors.toList());

				if (page instanceof IPage) {
					IPage page2 = (IPage) page;
					return new PageImpl<ITemplateEntity>(templateEntityList, page2.getPageable(), page2.getTotalElements(), page2.getTotalPages(), page2.getTotalX());
				}
				return new PageImpl<ITemplateEntity>(templateEntityList, page.getPageable(), page.getTotalElements(), page.getTotalPages());
			}
			return value;
		}

		if (iPSDELogicParam.isEntityMapParam()) {
			if (value instanceof Map) {
				Map<Object, Object> map = (Map) value;

				return map.entrySet().stream().filter(entry -> entry.getValue() instanceof IEntity).collect(Collectors.toMap(entry -> entry.getKey(), // 键的转换
						entry -> {
							IScriptEntity iScriptEntity = iDELogicRuntimeContext.getSystemRuntime().createScriptEntity((IEntity) entry.getValue());
							return new TemplateEntity(iScriptEntity);
						}));
			}
			return value;
		}

		// if (iPSDELogicParam.isFileParam()) {
		// return new DELogicFileParamRuntime();
		// }
		//
		// if (iPSDELogicParam.isFileListParam()) {
		// return new DELogicFileListParamRuntime();
		// }

		// if (iPSDELogicParam.isWebResponseParam()) {
		// return new DELogicWebResponseParamRuntime();
		// }

		// if (iPSDELogicParam.isAppGlobalParam()) {
		// return new DELogicAppGlobalParamRuntime();
		// }
		return null;
	}

	protected String getTemplateContent(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, String strTemplate, Map<String, Object> templateParams) throws Throwable {
		StringTemplateLoader stringTemplateLoader = new StringTemplateLoader();
		Configuration config = new Configuration();
		String strTemplateId = "templ_" + KeyValueUtils.genUniqueId(strTemplate);
		stringTemplateLoader.putTemplate(strTemplateId, strTemplate);
		config.setTemplateLoader(stringTemplateLoader);

		Map<String, Object> engineParams = new HashMap<String, Object>();
		this.fillFreeMarkerTemplParams(iDELogicRuntimeContext, iDELogicSession, engineParams);
		if (templateParams != null) {
			engineParams.putAll(templateParams);
		}

		try {
			freemarker.template.Template template = config.getTemplate(strTemplateId);
			StringWriter sw = new StringWriter();
			template.process(engineParams, sw);
			String strContent = sw.toString();
			return strContent;
		} catch (Exception ex) {
			log.error(String.format("获取模板内容发生异常，%1$s", ex.getMessage()), ex);
			return ex.getMessage();
		}
	}

	@Deprecated
	protected Object getRealResult(ChatCompletionResult chatCompletionResult, ChatCompletionRequest chatCompletionRequest, Object objParam, IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic) throws Exception {
		return AIChatUtils.getRealResult(chatCompletionResult);
	}
	
	protected Map<String, Object> getTemplParamsIf(Map<String, Object> params) {
		Map<String, Object> templParams = null;
		Object value = params.get(IAIAgentRuntimeBase.PARAM_TEMPLPARAMS);
		if(value instanceof Map) {
			templParams = (Map)value;
		}
		if(templParams == null) {
			templParams = new HashMap<String, Object>();
			params.put(IAIAgentRuntimeBase.PARAM_TEMPLPARAMS, templParams);
		}
		return templParams;
	}
	
	/**
	 * 获取交谈逻辑操作
	 * @param iDELogicRuntimeContext
	 * @param iDELogicSession
	 * @return
	 * @throws Throwable
	 */
	protected String getChatLogicAction(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession) throws Throwable {
		IDELogicParamRuntime actionDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(IDEAIChatLogicRuntimeBase.DELOGIC_AICHAT_PARAM_ACTION, true);
		if(actionDELogicParamRuntime == null) {
			Object value = iDELogicSession.getParamObject(IDEAIChatLogicRuntimeBase.DELOGIC_AICHAT_PARAM_ACTION, true);
			if(value instanceof String) {
				return (String)value;
			}
			return null;
		}
		
		return (String)actionDELogicParamRuntime.getReal(iDELogicSession);
	}
	
	
	protected ChatCompletionRequest getChatLogicRequest(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession) throws Throwable {
		IDELogicParamRuntime chatRequestDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(IDEAIChatLogicRuntimeBase.DELOGIC_AICHAT_PARAM_CHATREQUEST, true);
		if(chatRequestDELogicParamRuntime == null) {
			Object value = iDELogicSession.getParamObject(IDEAIChatLogicRuntimeBase.DELOGIC_AICHAT_PARAM_CHATREQUEST, true);
			if(value instanceof ChatCompletionRequest) {
				return (ChatCompletionRequest)value;
			}
			return null;
		}
		
		return (ChatCompletionRequest)chatRequestDELogicParamRuntime.getReal(iDELogicSession);
	}
}

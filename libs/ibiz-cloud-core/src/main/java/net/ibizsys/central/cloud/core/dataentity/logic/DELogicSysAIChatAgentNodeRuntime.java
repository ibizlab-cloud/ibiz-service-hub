package net.ibizsys.central.cloud.core.dataentity.logic;

import java.io.InputStream;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.IOUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import groovy.text.Template;
import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.ai.ISysAIChatAgentRuntime;
import net.ibizsys.central.cloud.core.ai.ISysAIFactoryRuntime;
import net.ibizsys.central.cloud.core.util.ChatMessagesBuilder;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResultEx;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.central.dataentity.logic.DELogicNodeRuntimeBase;
import net.ibizsys.central.dataentity.logic.IDELogicParamRuntime;
import net.ibizsys.central.dataentity.logic.IDELogicRuntimeContext;
import net.ibizsys.central.dataentity.logic.IDELogicSession;
import net.ibizsys.central.msg.ISysMsgTemplRuntime;
import net.ibizsys.model.PSModelEnums.DELogicSysAIChatAgentType;
import net.ibizsys.model.dataentity.logic.IPSDELogicLink;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDESysAIChatAgentLogic;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.JsonUtils;

/**
 * 实体调用AI交互代理节点运行时对象
 * @author lionlau
 *
 */
public class DELogicSysAIChatAgentNodeRuntime extends DELogicNodeRuntimeBase{
	
	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DELogicSysAIChatAgentNodeRuntime.class);
	public final static Pattern JSON_CODE_BLOCK_PATTERN = Pattern.compile("(?s)```json\\s*(.*?)\\s*```", Pattern.MULTILINE);
	public final static String JSON_AGENT_ID = "agent_id";
	
	public final static ObjectNode CHAT_CATEGORY_OUTPUT_FORMAT_JSON = JsonUtils.toObjectNode("{\r\n" + 
			"    \"type\": \"object\",\r\n" + 
			"    \"properties\": {\r\n" + 
			"      \"agent_id\": {\r\n" + 
			"        \"type\": \"string\",\r\n" + 
			"        \"description\": \"选择的 Agent 标识（如 agent_weather）\"\r\n" + 
			"      },\r\n" + 
			"      \"reason\": {\r\n" + 
			"        \"type\": \"string\",\r\n" + 
			"        \"description\": \"选择该 Agent 的具体原因（需结合上下文和 Agent 功能）\"\r\n" + 
			"      }\r\n" + 
			"    },\r\n" + 
			"    \"required\": [\"agent_id\", \"reason\"]\r\n" + 
			"  }");
	
	public final static String PROMPT = "# 任务说明\r\n" + 
			"``` json\r\n" + 
			"${prompt_text}\r\n" + 
			"```";

	@Override
	protected void onExecute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
	
		if(!(iPSDELogicNode instanceof IPSDESysAIChatAgentLogic)) {
			throw new DataEntityRuntimeException(iDELogicRuntimeContext.getDataEntityRuntime(), iDELogicRuntimeContext.getDELogicRuntime(), String.format("处理节点[%1$s]模型类型不正确", iPSDELogicNode.getName()));
		}
		
		IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic = (IPSDESysAIChatAgentLogic)iPSDELogicNode;
		
//		IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime)iDELogicRuntimeContext.getSystemRuntime();
//		Object objParam = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getDstPSDELogicParamMust().getCodeName(), false).getParamObject(iDELogicSession);
//		ISysAIFactoryRuntime iSysAIFactoryRuntime = iServiceSystemRuntime.getSysAIFactoryRuntime(iPSDESysAIChatAgentLogic.getPSSysAIFactoryMust().getId(), false);
//		ISysAIChatAgentRuntime iSysAIChatAgentRuntime = iSysAIFactoryRuntime.getAIChatAgentRuntime(iPSDESysAIChatAgentLogic.getPSSysAIChatAgentMust().getCodeName(), false);
		
		Map<String, Object> params = new HashMap<String, Object>();
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
		case CHATOUTPUT:
			this.onExecuteChatOutput(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, params);
			break;
		case DEFAULT:
		default:
			this.onExecuteChatDefault(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, params);
			break;
		}
	}
	
	protected void onExecuteChatDefault(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, Map<String, Object> params) throws Throwable {
		
		IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime)iDELogicRuntimeContext.getSystemRuntime();
		ISysAIFactoryRuntime iSysAIFactoryRuntime = iServiceSystemRuntime.getSysAIFactoryRuntime(iPSDESysAIChatAgentLogic.getPSSysAIFactoryMust().getId(), false);
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime = iSysAIFactoryRuntime.getAIChatAgentRuntime(iPSDESysAIChatAgentLogic.getPSSysAIChatAgentMust().getCodeName(), false);
		IDELogicParamRuntime iDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getDstPSDELogicParamMust().getCodeName(), false);
		
		ChatCompletionResult chatCompletionResult = null;
		ChatCompletionRequest chatCompletionRequest = null;
		Object objParam = iDELogicParamRuntime.getParamObject(iDELogicSession);
		if(objParam instanceof ChatCompletionRequest || objParam instanceof String) {
			chatCompletionRequest = new ChatCompletionRequest();
			if(objParam instanceof ChatCompletionRequest) {
				ChatCompletionRequest chatCompletionRequest2 = (ChatCompletionRequest)objParam;
				//放入历史消息
				if(iPSDESysAIChatAgentLogic.getHistoryCount() > 0 && !ObjectUtils.isEmpty(chatCompletionRequest2.getMessages()) && chatCompletionRequest2.getMessages().size() > iPSDESysAIChatAgentLogic.getHistoryCount()) {
					List<ChatMessage> list = chatCompletionRequest2.getMessages().subList(chatCompletionRequest2.getMessages().size() - iPSDESysAIChatAgentLogic.getHistoryCount(), chatCompletionRequest2.getMessages().size());
					chatCompletionRequest.setMessages(list);
				}
				else {
					chatCompletionRequest.setMessages(chatCompletionRequest2.getMessages());
				}
			}
			else
				if(objParam instanceof String) {
					chatCompletionRequest.setMessages(new ChatMessagesBuilder().user(objParam.toString()).build());
				}
			chatCompletionResult = iSysAIChatAgentRuntime.chatCompletion(new Entity() , chatCompletionRequest, new LinkedHashMap<String, Object>(), true, false);
		}
		else {
			chatCompletionRequest = new ChatCompletionRequest();
			chatCompletionResult = iSysAIChatAgentRuntime.chatCompletion(objParam , chatCompletionRequest, new LinkedHashMap<String, Object>(), true, true);
		}
		
		Object objRet = this.getRealResult(chatCompletionResult, chatCompletionRequest, objParam, iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic);
				
		iDELogicSession.setLastReturn(objRet);
		
		if(iPSDESysAIChatAgentLogic.getRetPSDELogicParam() != null) {
			IDELogicParamRuntime retDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getRetPSDELogicParam().getCodeName(), false);
			retDELogicParamRuntime.bind(iDELogicSession, objRet);
		}
	}
	
	protected void onExecuteChatCategory(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, Map<String, Object> params) throws Throwable {
		//获取逻辑节点的后续连接
		List<IPSDELogicLink> psDELogicLinks = iPSDESysAIChatAgentLogic.getPSDELogicLinks();
		if(ObjectUtils.isEmpty(psDELogicLinks)) {
			throw new Exception("未定义后续处理节点");
		}
		
		IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime)iDELogicRuntimeContext.getSystemRuntime();
		ISysAIFactoryRuntime iSysAIFactoryRuntime = iServiceSystemRuntime.getSysAIFactoryRuntime(iPSDESysAIChatAgentLogic.getPSSysAIFactoryMust().getId(), false);
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime = iSysAIFactoryRuntime.getAIChatAgentRuntime(iPSDESysAIChatAgentLogic.getPSSysAIChatAgentMust().getCodeName(), false);
		IDELogicParamRuntime iDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getDstPSDELogicParamMust().getCodeName(), false);
		
		//strJSCode += "sys,logic,entity,data,param";
		if(params == null) {
			params = new HashMap<String, Object>();
		}
		//params.put(sys, iDELogicRuntimeContext.getSystemRuntime());
		params.put("logic", iDELogicRuntimeContext.getDELogicRuntime());
		params.put("param", iDELogicParamRuntime);
		params.put("node", iPSDESysAIChatAgentLogic);
	
		ChatCompletionRequest data = new ChatCompletionRequest();
		Object objParam = iDELogicParamRuntime.getParamObject(iDELogicSession);
		if(objParam instanceof ChatCompletionRequest) {
			ChatCompletionRequest chatCompletionRequest2 = (ChatCompletionRequest)objParam;
			//放入历史消息
			if(iPSDESysAIChatAgentLogic.getHistoryCount() > 0 && !ObjectUtils.isEmpty(chatCompletionRequest2.getMessages()) && chatCompletionRequest2.getMessages().size() > iPSDESysAIChatAgentLogic.getHistoryCount()) {
				List<ChatMessage> list = chatCompletionRequest2.getMessages().subList(chatCompletionRequest2.getMessages().size() - iPSDESysAIChatAgentLogic.getHistoryCount(), chatCompletionRequest2.getMessages().size());
				data.setMessages(list);
			}
			else {
				data.setMessages(chatCompletionRequest2.getMessages());
			}
		}
		else
			if(objParam instanceof String) {
				data.setMessages(new ChatMessagesBuilder().user(objParam.toString()).build());
			}
			else
				throw new Exception(String.format("未识别的数据[%1$s]", objParam));
		
		params.put("data", data);
		ObjectNode promptNode = getChatCategoryPromptNode(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, data);
		params.put("prompt", promptNode);
		params.put("prompt_text", promptNode.toPrettyString());
		
		String strContent = null;
		if(iPSDESysAIChatAgentLogic.getPSSysMsgTempl() != null) {
			//存在定义消息模板
			ISysMsgTemplRuntime iSysMsgTemplRuntime = (ISysMsgTemplRuntime)iDELogicRuntimeContext.getSystemRuntime().getSysMsgTemplRuntime(iPSDESysAIChatAgentLogic.getPSSysMsgTemplMust());
			strContent = iSysMsgTemplRuntime.getContent(data, params);
		}
		else {
			String strTemplate = iPSDESysAIChatAgentLogic.getMessage();
			if(!StringUtils.hasLength(strTemplate)) {
				strTemplate = PROMPT;
			}
			Template template = iDELogicRuntimeContext.getSystemRuntime().getGroovyTemplate(strTemplate);
			StringWriter sw = new StringWriter();
			template.make(params).writeTo(sw);
			strContent = sw.toString();
		}
		
		ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();
		//chatCompletionRequest.setStreaming(EntityBase.BOOLEAN_FALSE);
		chatCompletionRequest.setMessages(ChatMessagesBuilder.create().user(strContent).build());
		
		ChatCompletionResult chatCompletionResult = iSysAIChatAgentRuntime.chatCompletion(new Entity(), chatCompletionRequest, null, true, false);
		Object result = this.getRealResult(chatCompletionResult, chatCompletionRequest, objParam, iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic);
		Map map = null;
		if(result instanceof String) {
			String strJsonContent = getJsonContent((String)result);
			map = JsonUtils.asMap(strJsonContent);
		}
		else
			if(result instanceof Map) {
				map = (Map)result;
			}
			else
				throw new Exception(String.format("无法识别的返回数据[%1$s]", result));
		
		String strAgentId = (String)map.get(JSON_AGENT_ID);
		if(ObjectUtils.isEmpty(strAgentId)) {
			throw new Exception(String.format("返回数据[%1$s]未指定代理标识", result));
		}
		
		for(IPSDELogicLink iPSDELogicLink : psDELogicLinks) {
			if(strAgentId.equals(iPSDELogicLink.getName())) {
				iDELogicSession.setNext(iPSDELogicLink.getDstPSDELogicNodeMust().getCodeName());
				return;
			}
		}
		
		throw new Exception(String.format("无法识别的代理标识[%1$s]", strAgentId));
	}
	
	protected ObjectNode getChatCategoryPromptNode(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, ChatCompletionRequest request) {
		ObjectNode promptNode = JsonUtils.createObjectNode();
		promptNode.put("task", iPSDESysAIChatAgentLogic.getName());
		if(StringUtils.hasLength(iPSDESysAIChatAgentLogic.getMemo())) {
			promptNode.put("description", iPSDESysAIChatAgentLogic.getMemo());
		}
		promptNode.put("prompt", String.format("请根据以下最近%1$s条对话消息，从可选 Agent列表中选择最适合处理当前用户请求的 Agent，并说明选择原因。要求输出为 JSON 格式，包含 agent_id'（选择的 Agent 标识）和 'reason'（选择原因）字段", request.getMessages().size()));
		ArrayNode messagesNode = promptNode.putArray("messages");
		for(ChatMessage message : request.getMessages()) {
			ObjectNode messageNode = messagesNode.addObject();
			messageNode.put(ChatMessage.FIELD_ROLE, message.getRole());
			messageNode.put(ChatMessage.FIELD_CONTENT, message.getContent());
		}
		ArrayNode agentsNode = promptNode.putArray("agents");
		for(IPSDELogicLink iPSDELogicLink : iPSDESysAIChatAgentLogic.getPSDELogicLinks()) {
			ObjectNode agentNode = agentsNode.addObject();
			agentNode.put("id", iPSDELogicLink.getName());
			if(StringUtils.hasLength(iPSDELogicLink.getMemo())) {
				agentNode.put("description", iPSDELogicLink.getMemo());
			}
		}
		promptNode.set("output_format", CHAT_CATEGORY_OUTPUT_FORMAT_JSON);
		
		return promptNode;
	}
	
	
	
	protected void onExecuteChatOutput(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, Map<String, Object> params) throws Throwable {
		
		IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime)iDELogicRuntimeContext.getSystemRuntime();
		ISysAIFactoryRuntime iSysAIFactoryRuntime = iServiceSystemRuntime.getSysAIFactoryRuntime(iPSDESysAIChatAgentLogic.getPSSysAIFactoryMust().getId(), false);
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime = iSysAIFactoryRuntime.getAIChatAgentRuntime(iPSDESysAIChatAgentLogic.getPSSysAIChatAgentMust().getCodeName(), false);
		IDELogicParamRuntime iDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getDstPSDELogicParamMust().getCodeName(), false);
		
		//strJSCode += "sys,logic,entity,data,param";
//		if(params == null) {
//			params = new HashMap<String, Object>();
//		}
//		//params.put(sys, iDELogicRuntimeContext.getSystemRuntime());
//		params.put("logic", iDELogicRuntimeContext.getDELogicRuntime());
//		params.put("param", iDELogicParamRuntime);
//		params.put("node", iPSDESysAIChatAgentLogic);
	
		ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();
		Object objParam = iDELogicParamRuntime.getParamObject(iDELogicSession);
		if(objParam instanceof ChatCompletionRequest) {
			ChatCompletionRequest chatCompletionRequest2 = (ChatCompletionRequest)objParam;
			chatCompletionRequest2.copyTo(chatCompletionRequest);
			//放入历史消息
			if(iPSDESysAIChatAgentLogic.getHistoryCount() > 0 && !ObjectUtils.isEmpty(chatCompletionRequest2.getMessages()) && chatCompletionRequest2.getMessages().size() > iPSDESysAIChatAgentLogic.getHistoryCount()) {
				List<ChatMessage> list = chatCompletionRequest2.getMessages().subList(chatCompletionRequest2.getMessages().size() - iPSDESysAIChatAgentLogic.getHistoryCount(), chatCompletionRequest2.getMessages().size());
				chatCompletionRequest.setMessages(list);
			}
			else {
				chatCompletionRequest.setMessages(chatCompletionRequest2.getMessages());
			}
		}
		else
			if(objParam instanceof String) {
				chatCompletionRequest.setMessages(new ChatMessagesBuilder().user(objParam.toString()).build());
			}
			else
				throw new Exception(String.format("未识别的数据[%1$s]", objParam));
			
		PortalAsyncAction portalAsyncAction = iSysAIChatAgentRuntime.asyncChatCompletion(new Entity(), chatCompletionRequest, null, true, false);
		iDELogicSession.setResult(portalAsyncAction);
		iDELogicSession.setNext(IDELogicSession.NEXT_END);
	}
	
	protected void onExecuteChatAggregation(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, Map<String, Object> params, boolean bAsync) throws Throwable {
		//获取逻辑节点的后续连接
		List<IPSDELogicLink> psDELogicLinks = iPSDESysAIChatAgentLogic.getPSDELogicLinks();
		if(ObjectUtils.isEmpty(psDELogicLinks)) {
			throw new Exception("未定义后续处理节点");
		}
		
		//获取子调用节点，子类型需要是默认
		Map<String, IPSDELogicLink> subPSDESysAIChatAgentLogicMap = new HashMap<String, IPSDELogicLink>();
		for(IPSDELogicLink iPSDELogicLink : psDELogicLinks) {
			if(!iPSDELogicLink.isSubCallLink()) {
				continue;
			}
			
			subPSDESysAIChatAgentLogicMap.put(iPSDELogicLink.getName(), iPSDELogicLink);
		}
		
		if(ObjectUtils.isEmpty(subPSDESysAIChatAgentLogicMap)) {
			throw new Exception("未定义AI交互并行节点");
		}
		
		IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime)iDELogicRuntimeContext.getSystemRuntime();
		Map<String, Object> subPSDESysAIChatAgentLogicResultMap = new ConcurrentHashMap<String, Object>();
		//启动线程
		for(IPSDELogicLink iPSDELogicLink : subPSDESysAIChatAgentLogicMap.values()) {
			final Map<String, Object> params2 = new HashMap<String, Object>();
			if(params != null) {
				params2.putAll(params);
			}
			iServiceSystemRuntime.threadRun(new Runnable() {
				@Override
				public void run() {
					try {
						Object ret = doSubChatCompletionCall(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, iPSDELogicLink, params2);
						subPSDESysAIChatAgentLogicResultMap.put(iPSDELogicLink.getName(), ret);
					}
					catch (Throwable ex) {
						log.error(String.format("处理子交互[%1$s]发生异常，%2$s", iPSDELogicLink.getName(), ex.getMessage()), ex);
						subPSDESysAIChatAgentLogicResultMap.put(iPSDELogicLink.getName(), ex);
					}
				}
			});
		}
		
		while(subPSDESysAIChatAgentLogicMap.size() != subPSDESysAIChatAgentLogicResultMap.size()) {
			Thread.sleep(10);
		}
		
		//判断返回值是否存在异常
		for(java.util.Map.Entry<String, Object> entry : subPSDESysAIChatAgentLogicResultMap.entrySet()) {
			if(entry.getValue() instanceof Throwable) {
				Throwable ex = (Throwable)entry.getValue();
				throw new Exception(String.format("处理子交互[%1$s]发生异常，%2$s", entry.getKey(), ex.getMessage()), ex);
			}
		}
		
		
		ISysAIFactoryRuntime iSysAIFactoryRuntime = iServiceSystemRuntime.getSysAIFactoryRuntime(iPSDESysAIChatAgentLogic.getPSSysAIFactoryMust().getId(), false);
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime = iSysAIFactoryRuntime.getAIChatAgentRuntime(iPSDESysAIChatAgentLogic.getPSSysAIChatAgentMust().getCodeName(), false);
		IDELogicParamRuntime iDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getDstPSDELogicParamMust().getCodeName(), false);
		
		//strJSCode += "sys,logic,entity,data,param";
		if(params == null) {
			params = new HashMap<String, Object>();
		}
		//params.put(sys, iDELogicRuntimeContext.getSystemRuntime());
		params.put("logic", iDELogicRuntimeContext.getDELogicRuntime());
		params.put("param", iDELogicParamRuntime);
		params.put("node", iPSDESysAIChatAgentLogic);
		
		ChatCompletionRequest data = new ChatCompletionRequest();
		Object objParam = iDELogicParamRuntime.getParamObject(iDELogicSession);
		if(objParam instanceof ChatCompletionRequest) {
			ChatCompletionRequest chatCompletionRequest2 = (ChatCompletionRequest)objParam;
			//放入历史消息
			if(iPSDESysAIChatAgentLogic.getHistoryCount() > 0 && !ObjectUtils.isEmpty(chatCompletionRequest2.getMessages()) && chatCompletionRequest2.getMessages().size() > iPSDESysAIChatAgentLogic.getHistoryCount()) {
				List<ChatMessage> list = chatCompletionRequest2.getMessages().subList(chatCompletionRequest2.getMessages().size() - iPSDESysAIChatAgentLogic.getHistoryCount(), chatCompletionRequest2.getMessages().size());
				data.setMessages(list);
			}
			else {
				data.setMessages(chatCompletionRequest2.getMessages());
			}
		}
		else
			if(objParam instanceof String) {
				data.setMessages(new ChatMessagesBuilder().user(objParam.toString()).build());
			}
			else
				throw new Exception(String.format("未识别的数据[%1$s]", objParam));
			
		params.put("data", data);
		ObjectNode promptNode = getChatAggregationPromptNode(iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic, data, subPSDESysAIChatAgentLogicResultMap);
		params.put("prompt", promptNode);
		params.put("prompt_text", promptNode.toPrettyString());
		
		String strContent = null;
		if(iPSDESysAIChatAgentLogic.getPSSysMsgTempl() != null) {
			//存在定义消息模板
			ISysMsgTemplRuntime iSysMsgTemplRuntime = (ISysMsgTemplRuntime)iDELogicRuntimeContext.getSystemRuntime().getSysMsgTemplRuntime(iPSDESysAIChatAgentLogic.getPSSysMsgTemplMust());
			strContent = iSysMsgTemplRuntime.getContent(data, params);
		}
		else {
			String strTemplate = iPSDESysAIChatAgentLogic.getMessage();
			if(!StringUtils.hasLength(strTemplate)) {
				strTemplate = PROMPT;
			}
			Template template = iDELogicRuntimeContext.getSystemRuntime().getGroovyTemplate(strTemplate);
			StringWriter sw = new StringWriter();
			template.make(params).writeTo(sw);
			strContent = sw.toString();
		}
		
		ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();
		chatCompletionRequest.setMessages(ChatMessagesBuilder.create().user(strContent).build());
		
		if(bAsync) {
			PortalAsyncAction portalAsyncAction = iSysAIChatAgentRuntime.asyncChatCompletion(new Entity(), chatCompletionRequest, null, true, false);
			iDELogicSession.setResult(portalAsyncAction);
			iDELogicSession.setNext(IDELogicSession.NEXT_END);
		}
		else {
			
			ChatCompletionResult chatCompletionResult = iSysAIChatAgentRuntime.chatCompletion(new Entity() , chatCompletionRequest, new LinkedHashMap<String, Object>(), true, false);
			Object objRet = this.getRealResult(chatCompletionResult, chatCompletionRequest, objParam, iDELogicRuntimeContext, iDELogicSession, iPSDESysAIChatAgentLogic);
			
			iDELogicSession.setLastReturn(objRet);
			
			if(iPSDESysAIChatAgentLogic.getRetPSDELogicParam() != null) {
				IDELogicParamRuntime retDELogicParamRuntime = iDELogicRuntimeContext.getDELogicRuntime().getDELogicParamRuntime(iPSDESysAIChatAgentLogic.getRetPSDELogicParam().getCodeName(), false);
				retDELogicParamRuntime.bind(iDELogicSession, objRet);
			}
		}
	}
	
	protected Object doSubChatCompletionCall(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, IPSDELogicLink iPSDELogicLink, Map<String, Object> params) throws Throwable{
		
		iDELogicSession.debugEnterLink(this, iPSDESysAIChatAgentLogic, iPSDELogicLink);
		IDELogicSession last = DELogicSession.getCurrent();
		IDELogicSession cloneDELogicSession = iDELogicSession.clone();
		DELogicSession.setCurrent(cloneDELogicSession);
		try {
			iDELogicRuntimeContext.executeNode(cloneDELogicSession, iPSDELogicLink.getDstPSDELogicNodeMust());
			return iDELogicSession.getLastReturn();
		}
		finally {
			DELogicSession.setCurrent(last);
		}
	}
	
	protected ObjectNode getChatAggregationPromptNode(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic, ChatCompletionRequest request, Map<String, Object> subPSDESysAIChatAgentLogicResultMap) {
		ObjectNode promptNode = JsonUtils.createObjectNode();
		promptNode.put("task", iPSDESysAIChatAgentLogic.getName());
		if(StringUtils.hasLength(iPSDESysAIChatAgentLogic.getMemo())) {
			promptNode.put("description", iPSDESysAIChatAgentLogic.getMemo());
		}
		promptNode.put("prompt", String.format("根据最近%1$s条对话消息，并综合各辅助 Agent的反馈进行综合输出", request.getMessages().size()));
		ArrayNode messagesNode = promptNode.putArray("messages");
		for(ChatMessage message : request.getMessages()) {
			ObjectNode messageNode = messagesNode.addObject();
			messageNode.put(ChatMessage.FIELD_ROLE, message.getRole());
			messageNode.put(ChatMessage.FIELD_CONTENT, message.getContent());
		}
		ArrayNode agentsNode = promptNode.putArray("agents");
		for(IPSDELogicLink iPSDELogicLink : iPSDESysAIChatAgentLogic.getPSDELogicLinks()) {
			if(!iPSDELogicLink.isSubCallLink()) {
				continue;
			}
			
			Object ret = subPSDESysAIChatAgentLogicResultMap.get(iPSDELogicLink.getName());
			if(ret == null) {
				continue;
			}
			
			ObjectNode agentNode = agentsNode.addObject();
			agentNode.put("id", iPSDELogicLink.getName());
			if(StringUtils.hasLength(iPSDELogicLink.getMemo())) {
				agentNode.put("description", iPSDELogicLink.getMemo());
			}
			if(ret instanceof String) {
				agentNode.put("result", (String)ret);
			}
			else {
				agentNode.put("result", JsonUtils.toString(ret));
			}
		}
		
		return promptNode;
	}
	
	
	protected String getTemplateContent(String strTemplatePath) throws Exception{
		InputStream is = this.getClass().getResourceAsStream(strTemplatePath);
		if(is != null) {
			return IOUtils.toString(is, "UTF-8");
		}
		throw new Exception(String.format("指定路径资源[%1$s]不存在", strTemplatePath));
	}
	
	
	protected void fillChatCompletionRequest(ChatCompletionRequest chatCompletionRequest, Object objParam, IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic) throws Exception {
		
	}
	
	protected Object getRealResult(ChatCompletionResult chatCompletionResult, ChatCompletionRequest chatCompletionRequest, Object objParam, IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDESysAIChatAgentLogic iPSDESysAIChatAgentLogic) throws Exception {
		if(chatCompletionResult instanceof ChatCompletionResultEx) {
			return ((ChatCompletionResultEx)chatCompletionResult).getResult();
		}
		if(chatCompletionResult == null || ObjectUtils.isEmpty(chatCompletionResult.getChoices())) {
			throw new Exception("返回AI交谈结果无效");
		}
		return chatCompletionResult.getChoices().get(0).getContent();
	}
	
	protected String getJsonContent(String markdownContent) {
		 Matcher matcher = JSON_CODE_BLOCK_PATTERN.matcher(markdownContent);
		  while (matcher.find()) {
		    return matcher.group(1);
		  }
		  return markdownContent;
	}
}

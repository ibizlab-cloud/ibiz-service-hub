package net.ibizsys.central.cloud.core.ai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import com.fasterxml.jackson.databind.JsonNode;

import net.ibizsys.central.cloud.core.ai.util.ChatCompletionRequestHolder;
import net.ibizsys.central.cloud.core.util.ChatMessagesBuilder;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResultEx;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.ChatMessageRole;
import net.ibizsys.central.cloud.core.util.domain.ChatTool;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncActionState;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.ai.IPSSysAIChatAgent;
import net.ibizsys.runtime.plugin.IModelRTScript;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.JsonUtils;

public abstract class SysAIChatAgentRuntimeBase extends SysAIAgentRuntimeBase implements ISysAIChatAgentRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysAIChatAgentRuntimeBase.class);

	private IPSSysAIChatAgent iPSSysAIChatAgent = null;
	private IDataEntityRuntime iDataEntityRuntime = null;
	
	/**
	 * AI代理脚本方法：获取实际结果
	 */
	public final static String AIAGENTRTSCRIPTMETHOD_GETRESULT = "GET_RESULT";
	
	@Override
	protected ISysAIChatAgentRuntimeContext createModelRuntimeContext() {
		return new SysAIChatAgentRuntimeContextBase<ISysAIChatAgentRuntime, ISysAIAgentRuntimeContext>(super.createModelRuntimeContext()) {
			
		};
	}
	

	
	@Override
	public void init(ISysAIFactoryRuntimeContext iSysAIFactoryRuntimeContext, IPSSysAIChatAgent iPSSysAIChatAgent) throws Exception {
		this.iPSSysAIChatAgent = iPSSysAIChatAgent;
		super.init(iSysAIFactoryRuntimeContext);
	}

	@Override
	protected void onInit() throws Exception {
		
		if(StringUtils.hasLength(this.getPSModelObject().getAIPlatformType())) {
			this.setAIPlatformType(this.getPSModelObject().getAIPlatformType());
		}
		
		if(this.getPSModelObject().getPSDataEntity() != null) {
			this.iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(this.getPSModelObject().getPSDataEntityMust().getId(), false);
		}

		super.onInit();
	}




	@Override
	public IPSSysAIChatAgent getPSModelObject() {
		return this.iPSSysAIChatAgent;
	}


	@Override
	protected ISysAIChatAgentRuntimeContext getModelRuntimeContext() {
		return (ISysAIChatAgentRuntimeContext)super.getModelRuntimeContext();
	}
	
	@Override
	public IDataEntityRuntime getDataEntityRuntime() {
		return this.iDataEntityRuntime;
	}

	@Override
	public String getAgentType() {
		return AIAGENT_CHAT;
	}
	
	@Override
	public String getAgentSubType() {
		return this.iPSSysAIChatAgent.getAgentType();
	}
	
	@Override
	public String getAgentMode() {
		return this.iPSSysAIChatAgent.getCodeName();
	}

	
	@Override
	public List<ChatMessage> getHistories(Object dataOrKeys, Object body, Map<String, Object> params) throws Throwable {
		return this.onGetHistories(dataOrKeys, body, params);
	}

	protected List<ChatMessage> onGetHistories(Object dataOrKeys, Object body, Map<String, Object> params) throws Throwable {
		Map<String, Object> exTemplParams = null;
		if (params != null && params.containsKey(PARAM_TEMPLPARAMS)) {
			exTemplParams = (Map<String, Object>) params.get(PARAM_TEMPLPARAMS);
		}
		return this.doGetHistories(getActiveData(dataOrKeys), body, params, exTemplParams);
	}

	protected List<ChatMessage> doGetHistories(List entityList, Object body, Map<String, Object> params, Map<String, Object> exTemplParams) throws Throwable {
		// 格式化文本
		String strConfigId = this.getHistoriesConfigId();
		if(ObjectUtils.isEmpty(strConfigId)) {
			return new ArrayList<ChatMessage>();
		}
		
		Map<String, Object> templParams = new HashMap<String, Object>();
		if (exTemplParams != null) {
			templParams.putAll(exTemplParams);
		}
		
		templParams.put(TEMPLATE_PARAM_BODY, body);

		String strContent = this.getContent(entityList, strConfigId, templParams, true);
		if(!StringUtils.hasLength(strContent)) {
			return new ArrayList<ChatMessage>();
		}

		return new ChatMessagesBuilder().xml(strContent).build();
	}
	

	@Override
	public List<ChatMessage> getSystemMessages(Object dataOrKeys, Map<String, Object> params) throws Throwable {
		return this.onGetSystemMessages(dataOrKeys, params);
	}

	protected List<ChatMessage> onGetSystemMessages(Object dataOrKeys, Map<String, Object> params) throws Throwable {
		Map<String, Object> exTemplParams = null;
		if (params != null && params.containsKey(PARAM_TEMPLPARAMS)) {
			exTemplParams = (Map<String, Object>) params.get(PARAM_TEMPLPARAMS);
		}
		return this.doGetSystemMessages(getActiveData(dataOrKeys), params, exTemplParams);
	}

	protected List<ChatMessage> doGetSystemMessages(List entityList, Map<String, Object> params, Map<String, Object> exTemplParams) throws Throwable {
		// 格式化文本
		String strConfigId = this.getSystemMessagesConfigId();
		if(ObjectUtils.isEmpty(strConfigId)) {
			return new ArrayList<ChatMessage>();
		}

		Map<String, Object> templParams = new HashMap<String, Object>();
		if (exTemplParams != null) {
			templParams.putAll(exTemplParams);
		}

//		templParams.put(TEMPLPARAM_APPDEACMODE, this.getAddinData());
//		templParams.put(TEMPLPARAM_APPDE, this.getPSAppDataEntity());

		String strContent = this.getContent(entityList, strConfigId, templParams, true);
		if(!StringUtils.hasLength(strContent)) {
			return new ArrayList<ChatMessage>();
		}
		
		int nPos = strConfigId.lastIndexOf(".xml.tpl");
		if(nPos == strConfigId.length() - 8) {
			return new ChatMessagesBuilder().xml(strContent).build();
		}
		return new ChatMessagesBuilder().system(strContent).build();
	}
	

	@Override
	public List<ChatMessage> getSuggestionMessages(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params) throws Throwable {
		return this.onGetSuggestionMessages(dataOrKeys, chatCompletionRequest, params);
	}

	protected List<ChatMessage> onGetSuggestionMessages(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params) throws Throwable {
		Map<String, Object> exTemplParams = null;
		if (params != null && params.containsKey(PARAM_TEMPLPARAMS)) {
			exTemplParams = (Map<String, Object>) params.get(PARAM_TEMPLPARAMS);
		}
		return this.doGetSuggestionMessages(getActiveData(dataOrKeys), chatCompletionRequest, params, exTemplParams);
	}

	protected List<ChatMessage> doGetSuggestionMessages(List entityList, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, Map<String, Object> exTemplParams) throws Throwable {
		// 格式化文本
		String strConfigId = this.getSuggestionMessagesConfigId();
		if(ObjectUtils.isEmpty(strConfigId)) {
			return new ArrayList<ChatMessage>();
		}

		Map<String, Object> templParams = new HashMap<String, Object>();
		if (exTemplParams != null) {
			templParams.putAll(exTemplParams);
		}

//		templParams.put(TEMPLPARAM_APPDEACMODE, this.getAddinData());
//		templParams.put(TEMPLPARAM_APPDE, this.getPSAppDataEntity());

		String strContent = this.getContent(entityList, strConfigId, templParams, true);
		if(!StringUtils.hasLength(strContent)) {
			return new ArrayList<ChatMessage>();
		}
		
		int nPos = strConfigId.lastIndexOf(".xml.tpl");
		if(nPos == strConfigId.length() - 8) {
			return new ChatMessagesBuilder().xml(strContent).build();
		}
		return new ChatMessagesBuilder().user(strContent).build();
	}
	
	@Override
	public List<ChatTool> getTools(Object dataOrKeys, Map<String, Object> params) throws Throwable {
		return this.onGetTools(dataOrKeys, params);
	}

	protected List<ChatTool> onGetTools(Object dataOrKeys, Map<String, Object> params) throws Throwable {
		Map<String, Object> exTemplParams = null;
		if (params != null && params.containsKey(PARAM_TEMPLPARAMS)) {
			exTemplParams = (Map<String, Object>) params.get(PARAM_TEMPLPARAMS);
		}
		return this.doGetTools(getActiveData(dataOrKeys), params, exTemplParams);
	}

	protected List<ChatTool> doGetTools(List entityList, Map<String, Object> params, Map<String, Object> exTemplParams) throws Throwable {
		// 格式化文本
		String strConfigId = this.getToolsConfigId();
		if(ObjectUtils.isEmpty(strConfigId)) {
			return new ArrayList<ChatTool>();
		}

		Map<String, Object> templParams = new HashMap<String, Object>();
		if (exTemplParams != null) {
			templParams.putAll(exTemplParams);
		}

//		templParams.put(TEMPLPARAM_APPDEACMODE, this.getAddinData());
//		templParams.put(TEMPLPARAM_APPDE, this.getPSAppDataEntity());

		String strContent = this.getContent(entityList, strConfigId, templParams, true);
		if(!StringUtils.hasLength(strContent)) {
			return new ArrayList<ChatTool>();
		}
		
		return JsonUtils.as(strContent, ChatToolListType);
	}
	


	@Override
	public ChatCompletionResult chatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params) throws Throwable {
		return this.chatCompletion(dataOrKeys, chatCompletionRequest, params, true, false);
	}

	@Override
	public PortalAsyncAction asyncChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params) throws Throwable {
		return this.asyncChatCompletion(dataOrKeys, chatCompletionRequest, params, true, false);
	}

	@Override
	public SseEmitter sseChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params) throws Throwable {
		return this.sseChatCompletion(dataOrKeys, chatCompletionRequest, params, true, false);
	}

	@Override
	public ChatCompletionResult chatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable {
		try {
			ChatCompletionRequestHolder.push(chatCompletionRequest);
			return this.onChatCompletion(dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories);
		}
		catch (Throwable ex) {
			throw new SysAIFactoryRuntimeException(this.getAIFactoryRuntime(), this, String.format("同步聊天交互发生异常，%1$s", ex.getMessage()), ex);
		}
		finally {
			ChatCompletionRequestHolder.poll();
		}
	}
	
	protected ChatCompletionResult onChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable {
		
		if(bAppendHistories) {
			List<ChatMessage> historyList = this.getHistories(dataOrKeys, chatCompletionRequest, params);
			if(!ObjectUtils.isEmpty(historyList)) {
				if(!ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
					historyList.addAll(chatCompletionRequest.getMessages());
					chatCompletionRequest.setMessages(historyList);
				}
				else {
					chatCompletionRequest.setMessages(historyList);
				}
			}
		}
		
		if(bAppendSystemMessage) {
//			if(params == null) {
//				params = new LinkedHashMap<String, Object>();
//			}
//			
//			Map<String, Object> templParams = (Map<String, Object>)params.get(PARAM_TEMPLPARAMS);
//			if(templParams == null) {
//				templParams = new LinkedHashMap<String, Object>();
//				params.put(PARAM_TEMPLPARAMS, templParams);
//			}
//			templParams.put(TEMPLATE_PARAM_REQUEST, chatCompletionRequest);
			
			List<ChatMessage> systemMessageList = this.getSystemMessages(dataOrKeys, params);
			if(!ObjectUtils.isEmpty(systemMessageList)) {
				if(!ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
					systemMessageList.addAll(chatCompletionRequest.getMessages());
					chatCompletionRequest.setMessages(systemMessageList);
				}
				else {
					chatCompletionRequest.setMessages(systemMessageList);
				}
			}
		}
		
		List<ChatTool> toolList = this.getTools(dataOrKeys, params);
		if(!ObjectUtils.isEmpty(toolList)) {
			if(!ObjectUtils.isEmpty(chatCompletionRequest.getTools())) {
				toolList.addAll(chatCompletionRequest.getTools());
				chatCompletionRequest.setTools(toolList);
			}
			else {
				chatCompletionRequest.setTools(toolList);
			}
		}
		
		return this.doChatCompletion(getAIPlatformType(), chatCompletionRequest);
		//return this.getSysAIUtilRuntime().chatCompletion(getAIPlatformType(), chatCompletionRequest);
	}

	
	
	@Override
	public ChatCompletionResult chatSuggestion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params) throws Throwable {
		try {
			ChatCompletionRequestHolder.push(chatCompletionRequest);
			return this.onChatSuggestion(dataOrKeys, chatCompletionRequest, params);
		}
		catch (Throwable ex) {
			throw new SysAIFactoryRuntimeException(this.getAIFactoryRuntime(), this, String.format("聊天建议发生异常，%1$s", ex.getMessage()), ex);
		}
		finally {
			ChatCompletionRequestHolder.poll();
		}
	}
	
	protected ChatCompletionResult onChatSuggestion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params) throws Throwable {
		ChatCompletionResult chatCompletionResult = new ChatCompletionResult();
		List<ChatMessage> suggestionMessageList = this.getSuggestionMessages(dataOrKeys, chatCompletionRequest, params);
		if(ObjectUtils.isEmpty(suggestionMessageList)) {
			chatCompletionResult.setChoices(suggestionMessageList);
			return chatCompletionResult;
		}
		
//		List<ChatMessage> realList = new ArrayList<ChatMessage>();
		List<ChatMessage> toolList = new ArrayList<ChatMessage>();
		for(ChatMessage chatMessage : suggestionMessageList) {
			ChatMessageRole role = ChatMessageRole.valueOf(chatMessage.getRole());
			switch (role) {
//			case ASSISTANT:
//			case SYSTEM:
//			case USER:
//				realList.add(chatMessage);
//				break;
			case TOOL:
				toolList.add(chatMessage);
				break;
			default:
				break;
			}
		}
		
		chatCompletionResult.setChoices(toolList);
//		if(!ObjectUtils.isEmpty(realList)) {
//			chatCompletionRequest.setMessages(suggestionMessageList);
//			ChatCompletionResult chatCompletionResult2 = this.getSysAIUtilRuntime().chatCompletion(getAIPlatformType(), chatCompletionRequest);
//			//需要分解
//		}
//		
		return chatCompletionResult;
	}



	@Override
	public PortalAsyncAction asyncChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable {
		try {
			ChatCompletionRequestHolder.push(chatCompletionRequest);
			return this.onAsyncChatCompletion(dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories);
		}
		catch (Throwable ex) {
			throw new SysAIFactoryRuntimeException(this.getAIFactoryRuntime(), this, String.format("异步聊天交互发生异常，%1$s", ex.getMessage()), ex);
		}
		finally {
			ChatCompletionRequestHolder.poll();
		}
	}

	protected PortalAsyncAction onAsyncChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable {
		
		if(bAppendHistories) {
			List<ChatMessage> historyList = this.getHistories(dataOrKeys, chatCompletionRequest, params);
			if(!ObjectUtils.isEmpty(historyList)) {
				if(!ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
					historyList.addAll(chatCompletionRequest.getMessages());
					chatCompletionRequest.setMessages(historyList);
				}
				else {
					chatCompletionRequest.setMessages(historyList);
				}
			}
		}
		
		if(bAppendSystemMessage) {
//			if(params == null) {
//				params = new LinkedHashMap<String, Object>();
//			}
//			
//			Map<String, Object> templParams = (Map<String, Object>)params.get(PARAM_TEMPLPARAMS);
//			if(templParams == null) {
//				templParams = new LinkedHashMap<String, Object>();
//				params.put(PARAM_TEMPLPARAMS, templParams);
//			}
//			templParams.put(TEMPLATE_PARAM_REQUEST, chatCompletionRequest);
			
			List<ChatMessage> systemMessageList = this.getSystemMessages(dataOrKeys, params);
			if(!ObjectUtils.isEmpty(systemMessageList)) {
				if(!ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
					systemMessageList.addAll(chatCompletionRequest.getMessages());
					chatCompletionRequest.setMessages(systemMessageList);
				}
				else {
					chatCompletionRequest.setMessages(systemMessageList);
				}
			}
		}
		
		List<ChatTool> toolList = this.getTools(dataOrKeys, params);
		if(!ObjectUtils.isEmpty(toolList)) {
			if(!ObjectUtils.isEmpty(chatCompletionRequest.getTools())) {
				toolList.addAll(chatCompletionRequest.getTools());
				chatCompletionRequest.setTools(toolList);
			}
			else {
				chatCompletionRequest.setTools(toolList);
			}
		}
		
		//return this.getSysAIUtilRuntime().asyncChatCompletion(getAIPlatformType(), chatCompletionRequest);
		return this.doAsyncChatCompletion(getAIPlatformType(), chatCompletionRequest);
	}

	@Override
	public SseEmitter sseChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable {
		try {
			ChatCompletionRequestHolder.push(chatCompletionRequest);
			return this.onSseChatCompletion(dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories);
		}
		catch (Throwable ex) {
			throw new SysAIFactoryRuntimeException(this.getAIFactoryRuntime(), this, String.format("SSE聊天交互发生异常，%1$s", ex.getMessage()), ex);
		}
		finally {
			ChatCompletionRequestHolder.poll();
		}
	}

	protected SseEmitter onSseChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable {

		PortalAsyncAction portalAsyncAction = this.asyncChatCompletion(dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories);

		long nTimeout = 300000;

		return (SseEmitter) this.getSystemRuntime().sseExecute(new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {

				long nCurrentTime = System.currentTimeMillis();
				ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
				while (true) {
					PortalAsyncAction last = getSysPortalUtilRuntime().getAsyncAction(portalAsyncAction.getAsyncAcitonId());

					double fCompletionRate = 0.0f;
					if (last.getCompletionRate() != null) {
						fCompletionRate = last.getCompletionRate().doubleValue();
					}
					
					if(DataTypeUtils.compare(actionSession.getActionStep(), last.getStepInfo(), false) != 0) {
						nCurrentTime = System.currentTimeMillis();
					}
					
					actionSession.updateActionStep(last.getStepInfo(), fCompletionRate, last.getActionResult());

					int nActionState = DataTypeUtils.getIntegerValue(last.getActionState(), PortalAsyncActionState.EXECUTING.getValue());
					if (nActionState == PortalAsyncActionState.FINISHED.getValue()) {
						return last.getActionResult();
					}
					if (nActionState == PortalAsyncActionState.FAILED.getValue()) {
						throw new Exception(last.getActionResult());
					}

					if (System.currentTimeMillis() - nCurrentTime >= nTimeout) {
						throw new Exception("反馈超时");
					}

					try {
						Thread.sleep(500);
					} catch (InterruptedException ex) {
						log.error(ex);
					}
				}
			}
		}, null, null, 0l);
	}
	
	@Override
	protected ChatCompletionResult doChatCompletion(String strAIPlatformType, ChatCompletionRequest chatCompletionRequest) throws Throwable {
		ChatCompletionResult chatCompletionResult = super.doChatCompletion(strAIPlatformType, chatCompletionRequest);
		if(this.getAIAgentRTScript(true)!=null && this.getAIAgentRTScript(false).contains(AIAGENTRTSCRIPTMETHOD_GETRESULT, IModelRTScript.ATTACHMODE_EXECUTE)) {
			Object ret = this.getAIAgentRTScript(false).call(AIAGENTRTSCRIPTMETHOD_GETRESULT, IModelRTScript.ATTACHMODE_EXECUTE, new Object[] {chatCompletionResult});
			if(ret != null) {
				ChatCompletionResultEx chatCompletionResultEx = new ChatCompletionResultEx(chatCompletionResult);
				chatCompletionResultEx.setResult(ret);
				return chatCompletionResultEx;
			}
		}
		return chatCompletionResult;
	}
	
	@Override
	public String getAgentParam(String strName, String strDefault) {
		if(this.getPSModelObject().getAgentParams() != null) {
			JsonNode jsonNode = this.getPSModelObject().getAgentParams().get(strName);
			if(jsonNode != null) {
				return jsonNode.asText(strDefault);
			}
		}
		return super.getAgentParam(strName, strDefault);
	}
	
	protected String getHistoriesConfigId() throws Throwable {
		throw new Exception("没有实现");
	}
	
	protected String getSystemMessagesConfigId() throws Throwable {
		throw new Exception("没有实现");
	}
	
	protected String getSuggestionMessagesConfigId() throws Throwable {
		throw new Exception("没有实现");
	}
	
	protected String getToolsConfigId() throws Throwable {
		throw new Exception("没有实现");
	}

}

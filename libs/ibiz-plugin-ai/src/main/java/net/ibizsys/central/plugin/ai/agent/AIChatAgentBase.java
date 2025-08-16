package net.ibizsys.central.plugin.ai.agent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import com.fasterxml.jackson.core.type.TypeReference;

import net.ibizsys.central.cloud.core.sysutil.ISysPortalUtilRuntime;
import net.ibizsys.central.cloud.core.util.ChatMessagesBuilder;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.ChatTool;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncActionState;
import net.ibizsys.central.util.domain.ACDataItem;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.JsonUtils;

/**
 * AI 交谈者代理对象基类
 * 
 * @author lionlau
 *
 */
public abstract class AIChatAgentBase extends AIAgentBase implements IAIChatAgent {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(AIChatAgentBase.class);

	public static final TypeReference<List<ChatTool>> ChatToolListType = new TypeReference<List<ChatTool>>() {
	};
	
	private ISysPortalUtilRuntime iSysPortalUtilRuntime = null;

	private IAIChatAgentContext iAIChatAgentContext = new IAIChatAgentContext() {
		@Override
		public String output(String strTemplateId) throws Throwable {
			return output(null, strTemplateId);
		}

		@Override
		public String output(Object data, String strTemplateId) throws Throwable {
			return output(data, strTemplateId, null);
		}

		@Override
		public String output(Object data, String strTemplateId, String strIndent) throws Throwable {
			String strContent = getContent(data, String.format("template/%1$s", strTemplateId), null);
			if (!StringUtils.hasLength(strContent) || !StringUtils.hasLength(strIndent)) {
				return strContent;
			}

			StringBuilder stringBuilder = new StringBuilder();
			String[] lines = strContent.replace("\r\n", "\n").replace("\r", "\n").split("\n");
			for (int i = 0; i < lines.length; i++) {
				if (i != 0) {
					stringBuilder.append("\n");
				}
				stringBuilder.append(strIndent);
				if (StringUtils.hasLength(lines[i])) {
					stringBuilder.append(lines[i]);
				}
			}
			return stringBuilder.toString();
		}

		@Override
		public boolean contains(String strTemplateId) {
			try {
				return StringUtils.hasLength(getContext().getConfigContent(null, String.format("template/%1$s", strTemplateId), true));
			} catch (Throwable ex) {
				return false;
			}
		}
	};

	@Override
	protected void onInit() throws Exception {

		super.onInit();
	}

	@Override
	protected IAIAgentContext getAIAgentContext() {
		return this.iAIChatAgentContext;
	}

	@Override
	public String getAgentType() {
		return AIAGENT_CHAT;
	}

	protected ISysPortalUtilRuntime getSysPortalUtilRuntime() {
		if (this.iSysPortalUtilRuntime == null) {
			this.iSysPortalUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysPortalUtilRuntime.class, false);
		}
		return this.iSysPortalUtilRuntime;
	}

	@Override
	public Page<ACDataItem> fetchACItems(Object objData, Object body, Map<String, Object> params) throws Throwable {
		// TODO Auto-generated method stub
		return null;
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

		String strContent = this.getContent(entityList, strConfigId, templParams, true);
		if(!StringUtils.hasLength(strContent)) {
			return new ArrayList<ChatMessage>();
		}

		return new ChatMessagesBuilder().xml(strContent).build();
	}
	
	protected String getHistoriesConfigId() throws Throwable {
		throw new Exception("没有实现");
	}
	
	protected List getActiveData(Object dataOrKeys) throws Throwable {
		throw new Exception("没有实现");
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

		return new ChatMessagesBuilder().xml(strContent).build();
	}
	
	
	
	protected String getSystemMessagesConfigId() throws Throwable {
		throw new Exception("没有实现");
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
	
	
	
	protected String getToolsConfigId() throws Throwable {
		throw new Exception("没有实现");
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
			return this.onChatCompletion(dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories);
		}
		catch (Throwable ex) {
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getSysAIFactoryUtilRuntime(), String.format("同步聊天交互发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected ChatCompletionResult onChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable {
		
		if(bAppendHistories) {
			List<ChatMessage> historyList = this.getHistories(dataOrKeys, null, params);
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
		
		return this.getSysAIUtilRuntime().chatCompletion(getAIPlatformType(), chatCompletionRequest);
	}

	@Override
	public PortalAsyncAction asyncChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable {
		try {
			return this.onAsyncChatCompletion(dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories);
		}
		catch (Throwable ex) {
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getSysAIFactoryUtilRuntime(), String.format("异步聊天交互发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected PortalAsyncAction onAsyncChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable {
		
		if(bAppendHistories) {
			List<ChatMessage> historyList = this.getHistories(dataOrKeys, null, params);
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
		
		return this.getSysAIUtilRuntime().asyncChatCompletion(getAIPlatformType(), chatCompletionRequest);
	}

	@Override
	public SseEmitter sseChatCompletion(Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable {
		try {
			return this.onSseChatCompletion(dataOrKeys, chatCompletionRequest, params, bAppendSystemMessage, bAppendHistories);
		}
		catch (Throwable ex) {
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getSysAIFactoryUtilRuntime(), String.format("SSE聊天交互发生异常，%1$s", ex.getMessage()), ex);
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

}

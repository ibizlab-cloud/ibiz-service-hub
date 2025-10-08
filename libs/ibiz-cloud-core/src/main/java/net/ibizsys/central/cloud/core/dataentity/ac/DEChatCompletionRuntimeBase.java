package net.ibizsys.central.cloud.core.dataentity.ac;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.ai.ISysAIChatAgentRuntime;
import net.ibizsys.central.cloud.core.ai.ISysAIFactoryRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysAIUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysPortalUtilRuntime;
import net.ibizsys.central.cloud.core.util.ChatMessagesBuilder;
import net.ibizsys.central.cloud.core.util.IChatResourceUtils;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncActionState;
import net.ibizsys.central.dataentity.ac.DEAutoCompleteRuntimeBase;
import net.ibizsys.central.msg.ISysMsgTemplRuntime;
import net.ibizsys.central.util.IEntity;
import net.ibizsys.model.ai.IPSSysAIChatAgent;
import net.ibizsys.model.msg.IPSSysMsgTempl;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IAction;

public abstract class DEChatCompletionRuntimeBase extends DEAutoCompleteRuntimeBase implements IDEChatCompletionRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEChatCompletionRuntimeBase.class);
	
	private ISysAIUtilRuntime iSysAIUtilRuntime = null;
	
	private ISysPortalUtilRuntime iSysPortalUtilRuntime = null;
	
	private ISysMsgTemplRuntime historySysMsgTemplRuntime = null;
	
	private ISysAIChatAgentRuntime iSysAIChatAgentRuntime = null;
	
	private boolean calcSysAIChatAgentRuntime = false;
	
	private boolean calcHistorySysMsgTemplRuntime = false;
	
	
	
	@Override
	protected void onInit() throws Exception {
		
		super.onInit();
	}
	
	
	protected ISysAIUtilRuntime getSysAIUtilRuntime() {
		if (this.iSysAIUtilRuntime == null) {
			this.iSysAIUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysAIUtilRuntime.class, false);
		}
		return this.iSysAIUtilRuntime;
	}
	
	protected ISysPortalUtilRuntime getSysPortalUtilRuntime() {
		if (this.iSysPortalUtilRuntime == null) {
			this.iSysPortalUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysPortalUtilRuntime.class, false);
		}
		return this.iSysPortalUtilRuntime;
	}
	
	protected ISysMsgTemplRuntime getHistorySysMsgTemplRuntime(boolean bTryMode) throws Exception{
		if(!this.calcHistorySysMsgTemplRuntime) {
			IPSSysMsgTempl historyPSSysMsgTempl = this.getPSDEACMode().getHistoryPSSysMsgTempl();
			if(historyPSSysMsgTempl != null) {
				this.historySysMsgTemplRuntime = (ISysMsgTemplRuntime)this.getSystemRuntime().getSysMsgTemplRuntime(historyPSSysMsgTempl);
			}
			this.calcHistorySysMsgTemplRuntime = true;
		}
		if(this.historySysMsgTemplRuntime != null || bTryMode) {
			return this.historySysMsgTemplRuntime;
		}
		throw new Exception(String.format("交互历史模板运行时对象无效"));
	}
	
	protected ISysAIChatAgentRuntime getSysAIChatAgentRuntime(boolean bTryMode) throws Exception{
		if(!this.calcSysAIChatAgentRuntime) {
			IPSSysAIChatAgent iPSSysAIChatAgent = this.getPSDEACMode().getPSSysAIChatAgent();
			if(iPSSysAIChatAgent != null) {
				ISysAIFactoryRuntime iSysAIFactoryRuntime = this.getSystemRuntime().getSysAIFactoryRuntime(this.getPSDEACMode().getPSSysAIFactoryMust());
				this.iSysAIChatAgentRuntime = iSysAIFactoryRuntime.getSysAIChatAgentRuntime(iPSSysAIChatAgent);
			}
			this.calcSysAIChatAgentRuntime = true;
		}
		if(this.iSysAIChatAgentRuntime != null || bTryMode) {
			return this.iSysAIChatAgentRuntime;
		}
		throw new Exception(String.format("AI交互代理运行时对象无效"));
	}
	
	@Override
	public IServiceSystemRuntime getSystemRuntime() {
		return (IServiceSystemRuntime)super.getSystemRuntime();
	}
	
	@Override
	public String getResource(Object dataOrKeys, Map<String, Object> params) throws Throwable {
		try {
			return this.onGetResource(dataOrKeys, params);
		}
		catch (Throwable ex) {
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("获取交互资源发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected String onGetResource(Object dataOrKeys, Map<String, Object> params) throws Throwable {
		String type = DataTypeUtils.asString(params.remove("type"));
		String subType = DataTypeUtils.asString(params.remove("subtype"));
		Object id = params.remove("id");
		return this.onGetResource(dataOrKeys, type, subType, id, params);
	}
	
	
	protected String onGetResource(Object dataOrKeys, String resourceType, String resourceSubType, Object resourceKey, Map<String, Object> params) throws Throwable {
		return this.getChatResourceUtils().getResource(resourceType, resourceSubType, resourceKey, params, true);
	}
	
	protected IChatResourceUtils getChatResourceUtils() throws Exception{
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getSysAIChatAgentRuntime(true);
		if(iSysAIChatAgentRuntime != null) {
			return iSysAIChatAgentRuntime.getAIFactoryRuntime().getChatResourceUtils();
		}
		return this.getSystemRuntime().getChatResourceUtils();
	}
	
	/**
	 * 获取代码项文本后缀
	 * @return
	 */
	protected String getCodeItemTextSuffix() {
		return "text";
	}
	
	@Override
	public List<ChatMessage> getHistories(Object key, Object body) throws Throwable {
		return this.getHistories(key, body, null);
	}
	
	
	@Override
	public List<ChatMessage> getHistories(Object key, Object body, Map<String, Object> templParams) throws Throwable {
		try {
			return this.onGetHistories(key, body, templParams);
		}
		catch (Throwable ex) {
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("获取交互历史发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected List<ChatMessage> onGetHistories(Object key, Object body, Map<String, Object> templParams) throws Throwable {
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getSysAIChatAgentRuntime(true);
		ISysMsgTemplRuntime iMsgTemplRuntime = this.getHistorySysMsgTemplRuntime(true);
		if(iSysAIChatAgentRuntime == null && iMsgTemplRuntime == null) {
			return new ArrayList<ChatMessage>();
		}
		IEntity iEntity = null;
		if(key instanceof IEntity) {
			iEntity = (IEntity)key;
		}
		else {
			iEntity = this.getDataEntityRuntime().get(key);
		}
		
		if(iSysAIChatAgentRuntime != null) {
			return iSysAIChatAgentRuntime.getHistories(iEntity, body, templParams);
		}
		
		this.getDataEntityRuntime().fillEntityCodeListTexts(iEntity, this.getCodeItemTextSuffix());
		
		String strContent = iMsgTemplRuntime.getContent(iEntity, templParams);
		if(StringUtils.hasLength(strContent)) {
			return new ChatMessagesBuilder().xml(strContent).build();
		}
		return new ArrayList<ChatMessage>();
	}

	
	@Override
	public ChatCompletionResult chatSuggestion(Object key, ChatCompletionRequest chatCompletionRequest) throws Throwable {
		try {
			return this.onChatSuggestion(key, chatCompletionRequest);
		}
		catch (Throwable ex) {
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("获取建议发生异常，%1$s", ex.getMessage()), ex);
		}	
	}
	
	protected ChatCompletionResult onChatSuggestion(Object key, ChatCompletionRequest chatCompletionRequest) throws Throwable {
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getSysAIChatAgentRuntime(true);
		if(iSysAIChatAgentRuntime != null) {
			IEntity iEntity = null;
			if(key instanceof IEntity) {
				iEntity = (IEntity)key;
			}
			else {
				iEntity = this.getDataEntityRuntime().createEntity();
				iEntity.set(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName(), key);
			}
			return iSysAIChatAgentRuntime.chatSuggestion(iEntity, chatCompletionRequest, null);
		}
		
		return new ChatCompletionResult();
	}


	@Override
	public ChatCompletionResult chatCompletion(Object key, ChatCompletionRequest chatCompletionRequest) throws Throwable {
		try {
			return this.onChatCompletion(key, chatCompletionRequest);
		}
		catch (Throwable ex) {
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("交互补全发生异常，%1$s", ex.getMessage()), ex);
		}	
	}
	
	protected ChatCompletionResult onChatCompletion(Object key, ChatCompletionRequest chatCompletionRequest) throws Throwable {
		throw new Exception("没有实现");
	}
	
	

	@Override
	public PortalAsyncAction asyncChatCompletion(Object key, ChatCompletionRequest chatCompletionRequest) throws Throwable {
		try {
			return this.onAsyncChatCompletion(key, chatCompletionRequest);
		}
		catch (Throwable ex) {
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("异步交互补全发生异常，%1$s", ex.getMessage()), ex);
		}	
	}
	
	protected PortalAsyncAction onAsyncChatCompletion(Object key, ChatCompletionRequest chatCompletionRequest) throws Throwable {
		//转化资源
		getChatResourceUtils().convert(chatCompletionRequest, true);
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getSysAIChatAgentRuntime(true);
		if(iSysAIChatAgentRuntime != null) {
			IEntity iEntity = null;
			if(key instanceof IEntity) {
				iEntity = (IEntity)key;
			}
			else {
				iEntity = this.getDataEntityRuntime().createEntity();
				iEntity.set(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName(), key);
			}
			return iSysAIChatAgentRuntime.asyncChatCompletion(iEntity, chatCompletionRequest, null, true, false);
		}
		
		return this.getSysAIUtilRuntime().asyncChatCompletion(getAIPlatformType(), chatCompletionRequest);
	}
	
	protected String getAIPlatformType() {
		return this.getSysAIUtilRuntime().getDefaultAIPlatformType();
	}

	@Override
	public SseEmitter sseChatCompletion(Object key, ChatCompletionRequest chatCompletionRequest) throws Throwable {
		try {
			return this.onSseChatCompletion(key, chatCompletionRequest);
		}
		catch (Throwable ex) {
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("SSE交互补全发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected SseEmitter onSseChatCompletion(Object key, ChatCompletionRequest chatCompletionRequest) throws Throwable {
		
		PortalAsyncAction portalAsyncAction = this.asyncChatCompletion(key, chatCompletionRequest);
		
		long nTimeout = 300000;

		return (SseEmitter)this.getSystemRuntime().sseExecute(new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {

				long nCurrentTime = System.currentTimeMillis();
				ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
				while(true) {
					PortalAsyncAction last = getSysPortalUtilRuntime().getAsyncAction(portalAsyncAction.getAsyncAcitonId());
					
					double fCompletionRate = 0.0f;
					if(last.getCompletionRate()!=null) {
						fCompletionRate = last.getCompletionRate().doubleValue();
					}
					
					if(DataTypeUtils.compare(actionSession.getActionStep(), last.getStepInfo(), false) != 0) {
						nCurrentTime = System.currentTimeMillis();
					}
					
					actionSession.updateActionStep(last.getStepInfo(), fCompletionRate, last.getActionResult());
					
					int nActionState = DataTypeUtils.getIntegerValue(last.getActionState(), PortalAsyncActionState.EXECUTING.getValue());
					if(nActionState == PortalAsyncActionState.FINISHED.getValue()) {
						return last.getActionResult();
					}
					if(nActionState == PortalAsyncActionState.FAILED.getValue()) {
						throw new Exception(last.getActionResult());
					}
					
					if(System.currentTimeMillis() - nCurrentTime >= nTimeout) {
						throw new Exception("反馈超时");
					}
	
					try {
						Thread.sleep(100);
					} catch (InterruptedException ex) {
						log.error(ex);
					}
				}
			}
		}, null, null, 0l);
	}
	
}

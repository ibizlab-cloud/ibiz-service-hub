package net.ibizsys.central.cloud.core.dataentity.ac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.ai.ISysAIAgentRuntime;
import net.ibizsys.central.cloud.core.ai.ISysAIChatAgentRuntime;
import net.ibizsys.central.cloud.core.ai.ISysAIFactoryRuntime;
import net.ibizsys.central.cloud.core.ai.SysAIFactoryRuntimeException;
import net.ibizsys.central.cloud.core.ai.util.AIChatUtils;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.sysutil.ISysAIUtilRuntime;
import net.ibizsys.central.cloud.core.sysutil.ISysPortalUtilRuntime;
import net.ibizsys.central.cloud.core.util.ChatMessagesBuilder;
import net.ibizsys.central.cloud.core.util.IChatResourceUtils;
import net.ibizsys.central.cloud.core.util.UserCancelException;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.ChatMessageRole;
import net.ibizsys.central.cloud.core.util.domain.ChatSkill;
import net.ibizsys.central.cloud.core.util.domain.KnowledgeBase;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncActionState;
import net.ibizsys.central.dataentity.ac.DEAutoCompleteRuntimeBase;
import net.ibizsys.central.msg.ISysMsgTemplRuntime;
import net.ibizsys.central.util.IEntity;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.ai.IPSSysAIChatAgent;
import net.ibizsys.model.msg.IPSSysMsgTempl;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.ErrorException;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.JsonUtils;

public abstract class DEChatCompletionRuntimeBase extends DEAutoCompleteRuntimeBase implements IDEChatCompletionRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEChatCompletionRuntimeBase.class);
	
	private ISysAIUtilRuntime iSysAIUtilRuntime = null;
	
	private ISysPortalUtilRuntime iSysPortalUtilRuntime = null;
	
	private ISysMsgTemplRuntime historySysMsgTemplRuntime = null;
	
	private ISysAIChatAgentRuntime iSysAIChatAgentRuntime = null;
	
	private boolean calcSysAIChatAgentRuntime = false;
	
	private boolean calcHistorySysMsgTemplRuntime = false;
	
	//public final static String AIAGENTTAG = "srfaiagenttag";
	
	public final static String AIAGENT = "srfaiagent";
	
	private String strAIAgentTag = null;
	
	private final static Random random = new Random();
	
	@Override
	protected void onInit() throws Exception {
		
		this.strAIAgentTag = this.getPSDEACMode().getACTag();
		if(!StringUtils.hasLength(this.strAIAgentTag) && StringUtils.hasLength(this.getPSDEACMode().getCodeName())) {
			this.strAIAgentTag = this.getPSDEACMode().getCodeName();
		}
		
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
			if(ex instanceof SysAIFactoryRuntimeException) {
				throw ex;
			}
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
			if(ex instanceof SysAIFactoryRuntimeException) {
				throw ex;
			}
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
			if(StringUtils.hasLength(iSysAIChatAgentRuntime.getAccessKey())) {
				if(!this.getSystemRuntime().getSystemAccessManager().testSysUniRes(UserContext.getCurrent(), iSysAIChatAgentRuntime.getAccessKey())) {
					log.error(String.format("AI交互代理[%1$s]不具备访问控制资源[%2$s]", iSysAIChatAgentRuntime.getName(), iSysAIChatAgentRuntime.getAccessKey()));
					throw new ErrorException(String.format("AI交互代理[%1$s]不具备访问能力", iSysAIChatAgentRuntime.getName()), Errors.ACCESSDENY);
				}
			}
			
			if(body instanceof Map) {
				Map map = (Map)body;
				String strAIAgent = (String)map.remove(AIAGENT);
				if(StringUtils.hasLength(strAIAgent)) {
					((Map)body).put(ISysAIAgentRuntime.AIAGENTTAG, strAIAgent);
				}
				else {
					((Map)body).put(ISysAIAgentRuntime.AIAGENTTAG, this.getAIAgentTag());
				}
			}
			else 
				if(body == null) {
					body = new HashMap<String, Object>();
					((Map)body).put(ISysAIAgentRuntime.AIAGENTTAG, this.getAIAgentTag());
				}
			
			//设置业务域
			Object businessScope = this.getBusinessScope(iEntity);
			if(!ObjectUtils.isEmpty(businessScope)) {
				((Map)body).put(ISysAIAgentRuntime.SCOPE, businessScope);
			}
			else {
				((Map)body).remove(ISysAIAgentRuntime.SCOPE);
			}
			
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
			if(ex instanceof SysAIFactoryRuntimeException) {
				throw ex;
			}
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("获取建议发生异常，%1$s", ex.getMessage()), ex);
		}	
	}
	
	protected ChatCompletionResult onChatSuggestion(Object key, ChatCompletionRequest chatCompletionRequest) throws Throwable {
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getSysAIChatAgentRuntime(true);
		if(iSysAIChatAgentRuntime != null) {
			if(StringUtils.hasLength(iSysAIChatAgentRuntime.getAccessKey())) {
				if(!this.getSystemRuntime().getSystemAccessManager().testSysUniRes(UserContext.getCurrent(), iSysAIChatAgentRuntime.getAccessKey())) {
					log.error(String.format("AI交互代理[%1$s]不具备访问控制资源[%2$s]", iSysAIChatAgentRuntime.getName(), iSysAIChatAgentRuntime.getAccessKey()));
					throw new ErrorException(String.format("AI交互代理[%1$s]不具备访问能力", iSysAIChatAgentRuntime.getName()), Errors.ACCESSDENY);
				}
			}
			IEntity iEntity = null;
			if(key instanceof IEntity) {
				iEntity = (IEntity)key;
			}
			else {
				iEntity = this.getDataEntityRuntime().createEntity();
				iEntity.set(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName(), key);
			}
			String strAIAgent = (String)chatCompletionRequest.get(AIAGENT);
			if(ObjectUtils.isEmpty(strAIAgent)) {
				strAIAgent = this.getAIAgentTag();
			}
			else {
				chatCompletionRequest.reset(AIAGENT);
			}
			chatCompletionRequest.set(ISysAIAgentRuntime.AIAGENTTAG, strAIAgent);
			
			//设置业务域
			Object businessScope = this.getBusinessScope(iEntity);
			if(!ObjectUtils.isEmpty(businessScope)) {
				chatCompletionRequest.set(ISysAIAgentRuntime.SCOPE, businessScope);
			}
			else {
				chatCompletionRequest.reset(ISysAIAgentRuntime.SCOPE);
			}
			
			return iSysAIChatAgentRuntime.chatSuggestion(iEntity, chatCompletionRequest, null);
		}
		
		return new ChatCompletionResult();
	}

	@Override
	public ChatCompletionResult chatDigest(Object key, ChatCompletionRequest chatCompletionRequest) throws Throwable {
		try {
			return this.onChatDigest(key, chatCompletionRequest);
		}
		catch (Throwable ex) {
			if(ex instanceof SysAIFactoryRuntimeException) {
				throw ex;
			}
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("聊天摘要发生异常，%1$s", ex.getMessage()), ex);
		}	
	}
	
	protected ChatCompletionResult onChatDigest(Object key, ChatCompletionRequest chatCompletionRequest) throws Throwable {
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getSysAIChatAgentRuntime(true);
		if(iSysAIChatAgentRuntime != null) {
			if(StringUtils.hasLength(iSysAIChatAgentRuntime.getAccessKey())) {
				if(!this.getSystemRuntime().getSystemAccessManager().testSysUniRes(UserContext.getCurrent(), iSysAIChatAgentRuntime.getAccessKey())) {
					log.error(String.format("AI交互代理[%1$s]不具备访问控制资源[%2$s]", iSysAIChatAgentRuntime.getName(), iSysAIChatAgentRuntime.getAccessKey()));
					throw new ErrorException(String.format("AI交互代理[%1$s]不具备访问能力", iSysAIChatAgentRuntime.getName()), Errors.ACCESSDENY);
				}
			}
			IEntity iEntity = null;
			if(key instanceof IEntity) {
				iEntity = (IEntity)key;
			}
			else {
				iEntity = this.getDataEntityRuntime().createEntity();
				iEntity.set(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName(), key);
			}
			String strAIAgent = (String)chatCompletionRequest.get(AIAGENT);
			if(ObjectUtils.isEmpty(strAIAgent)) {
				strAIAgent = this.getAIAgentTag();
			}
			else {
				chatCompletionRequest.reset(AIAGENT);
			}
			chatCompletionRequest.set(ISysAIAgentRuntime.AIAGENTTAG, strAIAgent);
			//设置业务域
			Object businessScope = this.getBusinessScope(iEntity);
			if(!ObjectUtils.isEmpty(businessScope)) {
				chatCompletionRequest.set(ISysAIAgentRuntime.SCOPE, businessScope);
			}
			else {
				chatCompletionRequest.reset(ISysAIAgentRuntime.SCOPE);
			}
			return iSysAIChatAgentRuntime.chatDigest(iEntity, chatCompletionRequest, null);
		}
		
		return new ChatCompletionResult();
	}

	@Override
	public ChatCompletionResult chatCompletion(Object key, ChatCompletionRequest chatCompletionRequest) throws Throwable {
		try {
			return this.onChatCompletion(key, chatCompletionRequest);
		}
		catch (Throwable ex) {
			if(ex instanceof SysAIFactoryRuntimeException) {
				throw ex;
			}
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("交互补全发生异常，%1$s", ex.getMessage()), ex);
		}	
	}
	
	protected ChatCompletionResult onChatCompletion(Object key, ChatCompletionRequest chatCompletionRequest) throws Throwable {
		//转化资源
		getChatResourceUtils().convert(chatCompletionRequest, true);
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getSysAIChatAgentRuntime(true);
		if(iSysAIChatAgentRuntime != null) {
			if(StringUtils.hasLength(iSysAIChatAgentRuntime.getAccessKey())) {
				if(!this.getSystemRuntime().getSystemAccessManager().testSysUniRes(UserContext.getCurrent(), iSysAIChatAgentRuntime.getAccessKey())) {
					log.error(String.format("AI交互代理[%1$s]不具备访问控制资源[%2$s]", iSysAIChatAgentRuntime.getName(), iSysAIChatAgentRuntime.getAccessKey()));
					throw new ErrorException(String.format("AI交互代理[%1$s]不具备访问能力", iSysAIChatAgentRuntime.getName()), Errors.ACCESSDENY);
				}
			}
			IEntity iEntity = null;
			if(key instanceof IEntity) {
				iEntity = (IEntity)key;
			}
			else {
				iEntity = this.getDataEntityRuntime().createEntity();
				iEntity.set(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName(), key);
			}
			String strAIAgent = (String)chatCompletionRequest.get(AIAGENT);
			if(ObjectUtils.isEmpty(strAIAgent)) {
				strAIAgent = this.getAIAgentTag();
			}
			else {
				chatCompletionRequest.reset(AIAGENT);
			}
			chatCompletionRequest.set(ISysAIAgentRuntime.AIAGENTTAG, strAIAgent);
			
			//设置业务域
			Object businessScope = this.getBusinessScope(iEntity);
			if(!ObjectUtils.isEmpty(businessScope)) {
				chatCompletionRequest.set(ISysAIAgentRuntime.SCOPE, businessScope);
			}
			else {
				chatCompletionRequest.reset(ISysAIAgentRuntime.SCOPE);
			}
			
			return iSysAIChatAgentRuntime.chatCompletion(iEntity, chatCompletionRequest, null, true, false);
		}
		
		return this.getSysAIUtilRuntime().chatCompletion(getAIPlatformType(), chatCompletionRequest);
	}
	
	

	@Override
	public PortalAsyncAction asyncChatCompletion(Object key, ChatCompletionRequest chatCompletionRequest) throws Throwable {
		try {
			return this.onAsyncChatCompletion(key, chatCompletionRequest);
		}
		catch (Throwable ex) {
			if(ex instanceof SysAIFactoryRuntimeException) {
				throw ex;
			}
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("异步交互补全发生异常，%1$s", ex.getMessage()), ex);
		}	
	}
	
	protected PortalAsyncAction onAsyncChatCompletion(Object key, ChatCompletionRequest chatCompletionRequest) throws Throwable {
		//转化资源
		getChatResourceUtils().convert(chatCompletionRequest, true);
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getSysAIChatAgentRuntime(true);
		if(iSysAIChatAgentRuntime != null) {
			if(StringUtils.hasLength(iSysAIChatAgentRuntime.getAccessKey())) {
				if(!this.getSystemRuntime().getSystemAccessManager().testSysUniRes(UserContext.getCurrent(), iSysAIChatAgentRuntime.getAccessKey())) {
					log.error(String.format("AI交互代理[%1$s]不具备访问控制资源[%2$s]", iSysAIChatAgentRuntime.getName(), iSysAIChatAgentRuntime.getAccessKey()));
					throw new ErrorException(String.format("AI交互代理[%1$s]不具备访问能力", iSysAIChatAgentRuntime.getName()), Errors.ACCESSDENY);
				}
			}
			IEntity iEntity = null;
			if(key instanceof IEntity) {
				iEntity = (IEntity)key;
			}
			else {
				iEntity = this.getDataEntityRuntime().createEntity();
				iEntity.set(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName(), key);
			}
			String strAIAgent = (String)chatCompletionRequest.get(AIAGENT);
			if(ObjectUtils.isEmpty(strAIAgent)) {
				strAIAgent = this.getAIAgentTag();
			}
			else {
				chatCompletionRequest.reset(AIAGENT);
			}
			chatCompletionRequest.set(ISysAIAgentRuntime.AIAGENTTAG, strAIAgent);
			//设置业务域
			Object businessScope = this.getBusinessScope(iEntity);
			if(!ObjectUtils.isEmpty(businessScope)) {
				chatCompletionRequest.set(ISysAIAgentRuntime.SCOPE, businessScope);
			}
			else {
				chatCompletionRequest.reset(ISysAIAgentRuntime.SCOPE);
			}
			return iSysAIChatAgentRuntime.asyncChatCompletion(iEntity, chatCompletionRequest, null, true, false);
		}
		
		return this.getSysAIUtilRuntime().asyncChatCompletion(getAIPlatformType(), chatCompletionRequest);
	}
	
	@Override
	public void cancelChatCompletion(Object key, String strAsyncActionId, Object body) throws Throwable {
		try {
			this.onCancelChatCompletion(key, strAsyncActionId, body);
		}
		catch (Throwable ex) {
			if(ex instanceof SysAIFactoryRuntimeException) {
				throw ex;
			}
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("取消交互补全发生异常，%1$s", ex.getMessage()), ex);
		}	
	}
	
	protected void onCancelChatCompletion(Object key, String strAsyncActionId, Object body) throws Throwable {
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getSysAIChatAgentRuntime(true);
		if(iSysAIChatAgentRuntime != null) {
			if(StringUtils.hasLength(iSysAIChatAgentRuntime.getAccessKey())) {
				if(!this.getSystemRuntime().getSystemAccessManager().testSysUniRes(UserContext.getCurrent(), iSysAIChatAgentRuntime.getAccessKey())) {
					log.error(String.format("AI交互代理[%1$s]不具备访问控制资源[%2$s]", iSysAIChatAgentRuntime.getName(), iSysAIChatAgentRuntime.getAccessKey()));
					throw new ErrorException(String.format("AI交互代理[%1$s]不具备访问能力", iSysAIChatAgentRuntime.getName()), Errors.ACCESSDENY);
				}
			}
			IEntity iEntity = null;
			if(key instanceof IEntity) {
				iEntity = (IEntity)key;
			}
			else {
				iEntity = this.getDataEntityRuntime().createEntity();
				iEntity.set(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName(), key);
			}
			if(body instanceof Map) {
				Map map = (Map)body;
				String strAIAgent = (String)map.remove(AIAGENT);
				if(StringUtils.hasLength(strAIAgent)) {
					((Map)body).put(ISysAIAgentRuntime.AIAGENTTAG, strAIAgent);
				}
				else {
					((Map)body).put(ISysAIAgentRuntime.AIAGENTTAG, this.getAIAgentTag());
				}
			}
			else 
				if(body == null) {
					body = new HashMap<String, Object>();
					((Map)body).put(ISysAIAgentRuntime.AIAGENTTAG, this.getAIAgentTag());
				}
			iSysAIChatAgentRuntime.cancelChatCompletion(iEntity, strAsyncActionId, body);
			return;
		}
		
		this.getSysAIUtilRuntime().cancelChatCompletion(getAIPlatformType(), strAsyncActionId);
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
			if(ex instanceof SysAIFactoryRuntimeException) {
				throw ex;
			}
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("SSE交互补全发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected SseEmitter onSseChatCompletion(Object key, ChatCompletionRequest chatCompletionRequest) throws Throwable {
		
		
		final ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getSysAIChatAgentRuntime(false);
		
		long nTimeout = 3000000;
		
		return (SseEmitter)this.getSystemRuntime().sseExecute(new IAction() {
			
			@Override
			public Object execute(Object[] args) throws Throwable {
				ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
				PortalAsyncAction portalAsyncAction = asyncChatCompletion(key, chatCompletionRequest);
				Object session = (iSysAIChatAgentRuntime != null)?iSysAIChatAgentRuntime.beginChatSession(chatCompletionRequest):null;
				if(session != null) {
					if(!ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
						try {
							iSysAIChatAgentRuntime.appendChatMessage(session, chatCompletionRequest.getMessages().get(chatCompletionRequest.getMessages().size() - 1));
						}
						catch (Throwable ex) {
							log.error(ex);
						}
					}
				}
				long nCurrentTime = System.currentTimeMillis();
				
				actionSession.setActionParam(ActionSession.PARAM_ASYNCACTION_ID, portalAsyncAction.getAsyncAcitonId());
				
				while(true) {
					boolean bDisabled = EmployeeContext.isCurrentDisabled();
                	PortalAsyncAction last = null;
    				try {
    					EmployeeContext.setCurrentDisabled(true);
    					last = getSysPortalUtilRuntime().getAsyncAction(portalAsyncAction.getAsyncAcitonId());
    				}
    				finally {
    					EmployeeContext.setCurrentDisabled(bDisabled);
    				}
					
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
						if(session != null) {
							ChatCompletionResult chatCompletionResult = JsonUtils.as(last.getActionResult(), ChatCompletionResult.class);
							ChatMessage chatMessage = new ChatMessage();
							chatMessage.setRole(ChatMessageRole.ASSISTANT.getValue());
							chatMessage.setContent(AIChatUtils.removeThinkingContent(chatCompletionResult.getChoices().get(0).getContent()));
							try {
								Object ret = iSysAIChatAgentRuntime.appendChatMessage(session, chatMessage, false, false);
								if(ret instanceof IEntityDTO) {
									IEntityDTO iEntityDTO = (IEntityDTO)ret;
									if(iEntityDTO.getDEMethodDTORuntime() != null && iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime() != null) {
										Object messageId =  iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime().getKeyFieldValue(iEntityDTO);
										if(messageId != null) {
											chatCompletionResult.getChoices().get(0).setMessageId(String.valueOf(messageId));
											return JsonUtils.toString(chatCompletionResult);
										}
									}
								}
							}
							catch (Throwable ex) {
								log.error(ex);
							}
						}
						return last.getActionResult();
					}
					if (nActionState == PortalAsyncActionState.CANCELED.getValue()) {
						if(session != null) {
							ChatMessage chatMessage = new ChatMessage();
							chatMessage.setContent(AIChatUtils.removeThinkingContent(last.getActionResult()));
							chatMessage.setRole(ChatMessageRole.ASSISTANT.getValue());
							try {
								iSysAIChatAgentRuntime.appendChatMessage(session, chatMessage, true, false);
							}
							catch (Throwable ex) {
								log.error(ex);
							}
						}
						throw new UserCancelException(last.getActionResult());
					}

					if(nActionState == PortalAsyncActionState.FAILED.getValue()) {
						if(session != null) {
							ChatMessage chatMessage = new ChatMessage();
							chatMessage.setRole(ChatMessageRole.ASSISTANT.getValue());
							chatMessage.setContent(AIChatUtils.removeThinkingContent(last.getActionResult()));
							try {
								iSysAIChatAgentRuntime.appendChatMessage(session, chatMessage, false, true);
							}
							catch (Throwable ex) {
								log.error(ex);
							}
						}
						throw new Exception(last.getActionResult());
					}
					
					if(System.currentTimeMillis() - nCurrentTime >= nTimeout) {
						throw new Exception("反馈超时");
					}
	
					try {
						Thread.sleep(200);
					} catch (InterruptedException ex) {
						log.error(ex);
					}
				}
			}
			
		}, null, null, 0l);
	}
	
	@Override
	public SseEmitter sseSubAgentOutput(Object dataOrKeys, String strAsyncActionId, Object body) throws Throwable {
		try {
			return this.onSseSubAgentOutput(dataOrKeys, strAsyncActionId, body);
		}
		catch (Throwable ex) {
			if(ex instanceof SysAIFactoryRuntimeException) {
				throw ex;
			}
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("SSE子代理输出发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected SseEmitter onSseSubAgentOutput(Object dataOrKeys, String strAsyncActionId, Object body) throws Throwable {
		return (SseEmitter)this.getSystemRuntime().sseAsyncActionOutput(strAsyncActionId, 0l);
	}
	
	
	
	
	@Override
	public List<ChatSkill> getSkills(Object dataOrKeys, Object body) throws Throwable {
		try {
			return this.onGetSkills(dataOrKeys, body);
		}
		catch (Throwable ex) {
			if(ex instanceof SysAIFactoryRuntimeException) {
				throw ex;
			}
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("获取技能集合发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected List<ChatSkill> onGetSkills(Object key, Object body) throws Throwable {
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getSysAIChatAgentRuntime(true);
		if(iSysAIChatAgentRuntime == null) {
			return new ArrayList<ChatSkill>();
		}
		IEntity iEntity = null;
		if(key instanceof IEntity) {
			iEntity = (IEntity)key;
		}
		else {
			iEntity = this.getDataEntityRuntime().get(key);
		}
		
		if(StringUtils.hasLength(iSysAIChatAgentRuntime.getAccessKey())) {
			if(!this.getSystemRuntime().getSystemAccessManager().testSysUniRes(UserContext.getCurrent(), iSysAIChatAgentRuntime.getAccessKey())) {
				log.error(String.format("AI交互代理[%1$s]不具备访问控制资源[%2$s]", iSysAIChatAgentRuntime.getName(), iSysAIChatAgentRuntime.getAccessKey()));
				throw new ErrorException(String.format("AI交互代理[%1$s]不具备访问能力", iSysAIChatAgentRuntime.getName()), Errors.ACCESSDENY);
			}
		}
		
		if(body instanceof Map) {
			Map map = (Map)body;
			String strAIAgent = (String)map.remove(AIAGENT);
			if(StringUtils.hasLength(strAIAgent)) {
				((Map)body).put(ISysAIAgentRuntime.AIAGENTTAG, strAIAgent);
			}
			else {
				((Map)body).put(ISysAIAgentRuntime.AIAGENTTAG, this.getAIAgentTag());
			}
		}
		else 
			if(body == null) {
				body = new HashMap<String, Object>();
				((Map)body).put(ISysAIAgentRuntime.AIAGENTTAG, this.getAIAgentTag());
			}
		return iSysAIChatAgentRuntime.getSkills(iEntity, body, new HashMap<String, Object>());
	}


	@Override
	public List<KnowledgeBase> getKnowledgeBases(Object dataOrKeys, Object body) throws Throwable {
		try {
			return this.onGetKnowledgeBases(dataOrKeys, body);
		}
		catch (Throwable ex) {
			if(ex instanceof SysAIFactoryRuntimeException) {
				throw ex;
			}
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("获取知识库集合发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected List<KnowledgeBase> onGetKnowledgeBases(Object key, Object body) throws Throwable {
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.getSysAIChatAgentRuntime(true);
		if(iSysAIChatAgentRuntime == null) {
			return new ArrayList<KnowledgeBase>();
		}
		IEntity iEntity = null;
		if(key instanceof IEntity) {
			iEntity = (IEntity)key;
		}
		else {
			iEntity = this.getDataEntityRuntime().get(key);
		}
		
		if(StringUtils.hasLength(iSysAIChatAgentRuntime.getAccessKey())) {
			if(!this.getSystemRuntime().getSystemAccessManager().testSysUniRes(UserContext.getCurrent(), iSysAIChatAgentRuntime.getAccessKey())) {
				log.error(String.format("AI交互代理[%1$s]不具备访问控制资源[%2$s]", iSysAIChatAgentRuntime.getName(), iSysAIChatAgentRuntime.getAccessKey()));
				throw new ErrorException(String.format("AI交互代理[%1$s]不具备访问能力", iSysAIChatAgentRuntime.getName()), Errors.ACCESSDENY);
			}
		}
		
		if(body instanceof Map) {
			Map map = (Map)body;
			String strAIAgent = (String)map.remove(AIAGENT);
			if(StringUtils.hasLength(strAIAgent)) {
				((Map)body).put(ISysAIAgentRuntime.AIAGENTTAG, strAIAgent);
			}
			else {
				((Map)body).put(ISysAIAgentRuntime.AIAGENTTAG, this.getAIAgentTag());
			}
		}
		else 
			if(body == null) {
				body = new HashMap<String, Object>();
				((Map)body).put(ISysAIAgentRuntime.AIAGENTTAG, this.getAIAgentTag());
			}
		return iSysAIChatAgentRuntime.getKnowledgeBases(iEntity, body, new HashMap<String, Object>());
	}


	protected String getAIAgentTag() {
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        if (requestAttributes instanceof ServletRequestAttributes) {
            String agent = ((ServletRequestAttributes) requestAttributes).getRequest().getParameter(AIAGENT);
            if(StringUtils.hasLength(agent))
                return agent;
        }
		return this.strAIAgentTag;
	}
	
	
	protected String getBusinessScope(IEntity iEntity) throws Throwable {
		if(this.getDataEntityRuntime() instanceof net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime ) {
			return ((net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime)this.getDataEntityRuntime()).getBusinessScope(iEntity);
		}
		Object realKey = this.getDataEntityRuntime().getKeyFieldValue(iEntity);
		if(!ObjectUtils.isEmpty(realKey)) {
			return String.format("%1$s=%2$s", this.getDataEntityRuntime().getName(), realKey);
		}
		return null;
	}
	
}

package net.ibizsys.central.plugin.ai.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import net.ibizsys.central.cloud.core.ai.util.ChatCompletionRequestHolder;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.KeyValueUtils;

public class ChatCompletionSession implements IChatCompletionSession {

	private Map<String, Object> params = new ConcurrentHashMap<String, Object>();
	private ChatCompletionRequest request = null;
	private IAIChatAgentUtil agentUtil = null; 
	private ChatCompletionResult result = null;
	
	public final static String PARAM_NEXT = "srfnext";
	
	public final static String PARAM_ACTION = "srfaction";
	
	public final static String PARAM_SCOPE = "srfscope";
	
	public final static String PARAM_CHATSESSIONID = "srfchatsessionid";
	
	private IEmployeeContext employeeContext = null;
	
	private String sessionId = KeyValueUtils.genUniqueId();
	
	private String systemId = null;
	
	
	private ActionSession actionSession = null;
	
	private AtomicInteger ref = new AtomicInteger(0);
	
	@Override
	public ChatCompletionRequest getRequest() {
		if(request == null) {
			return ChatCompletionRequestHolder.peekMust();
		}
		return request;
	}
	
	public void setRequest(ChatCompletionRequest request) {
		this.request = request;
	}
	
	@Override
	public ChatCompletionResult getResult() {
		return result;
	}
	
	@Override
	public void setResult(ChatCompletionResult result) {
		this.result = result;
	}

	@Override
	public void setParam(String key, Object value) {
		if(value == null) {
			this.params.remove(key);
			return;
		}
		this.params.put(key, value);
	}

	@Override
	public Object getParam(String key) {
		return this.params.get(key);
	}

	@Override
	public Object resetParam(String key) {
		return this.params.remove(key);
	}
	
	@Override
	public String getNext() {
		return (String)this.getParam(PARAM_NEXT);
	}

	@Override
	public void setNext(String next) {
		this.setParam(PARAM_NEXT, next);
	}

	@Override
	public String getAction() {
		return (String)this.getParam(PARAM_ACTION);
	}
	
	
	public void setAction(String action) {
		this.setParam(PARAM_ACTION, action);
	}
	
	
	@Override
	public String getBusinessScope() {
		return (String)this.getParam(PARAM_SCOPE);
	}

	public void setBusinessScope(String scope) {
		this.setParam(PARAM_SCOPE, scope);
	}
	
	@Override
	public String getChatSessionId() {
		return (String)this.getParam(PARAM_CHATSESSIONID);
	}

	public void setChatSessionId(String scope) {
		this.setParam(PARAM_CHATSESSIONID, scope);
	}
	
	@Override
	public IAIChatAgentUtil getAgentUtil() {
		return this.agentUtil;
	}
	
	public void setAgentUtil(IAIChatAgentUtil agentUtil) {
		this.agentUtil = agentUtil;
	}

	@Override
	public void fillParams(Map<String, Object> params) {
		params.putAll(this.params);
	}

	@Override
	public String getSessionId() {
		return this.sessionId;
	}

	@Override
	public IEmployeeContext getEmployeeContext() {
		return this.employeeContext;
	}
	
	public void setEmployeeContext(IEmployeeContext employeeContext) {
		this.employeeContext = employeeContext;
	}

	@Override
	public String getSystemId() {
		return this.systemId;
	}
	
	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}

	@Override
	public int addRef() {
		return ref.incrementAndGet();
	}

	@Override
	public int releaseRef() {
		return ref.decrementAndGet();
	}

	@Override
	public ActionSession getActionSession() {
		return this.actionSession;
	}
	
	public void setActionSession(ActionSession actionSession) {
		this.actionSession = actionSession;
	}
	
	
	
}

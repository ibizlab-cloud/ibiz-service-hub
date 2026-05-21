package net.ibizsys.central.cloud.core.ai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.util.ObjectUtils;

import net.ibizsys.central.ISystemRuntime;

public abstract class SysAIChatAgentGroupBase implements ISysAIChatAgentGroup {
	
	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysAIChatAgentGroupBase.class);
	
	private ISysAIFactoryRuntimeContext ctx = null;
	private Object groupData = null;
	private String strId = null;
	private String strName = null;
	private String strDescription = null;
	private String strPrompt = null;
	private Map<String, ISysAIChatAgentRuntime> sysAIChatAgentRuntimeMap = new ConcurrentHashMap<String, ISysAIChatAgentRuntime>();
	private List<ISysAIChatAgentRuntime> sysAIChatAgentRuntimeList = Collections.EMPTY_LIST;
	
	@Override
	public void init(ISysAIFactoryRuntimeContext iSysAIFactoryRuntimeContext, Object groupData) throws Exception {
		this.groupData = groupData;
		if(this.groupData instanceof String) {
			if(ObjectUtils.isEmpty(this.getId())) {
				this.setId((String)this.groupData);
			}	
		}
		this.init(iSysAIFactoryRuntimeContext);
	}
	
	
	protected void init(ISysAIFactoryRuntimeContext ctx) throws Exception {
		this.ctx = ctx;
		onInit();
	}
	
	protected void onInit() throws Exception {
		
	}

	protected ISysAIFactoryRuntimeContext getSysAIFactoryRuntimeContext() {
		return this.ctx;
	}

	//@Override
	public ISysAIFactoryRuntime getAIFactoryRuntime() {
		return this.getSysAIFactoryRuntimeContext().getAIFactoryRuntime();
	}
	
	
	protected ISystemRuntime getSystemRuntime() {
		return getSysAIFactoryRuntimeContext().getAIFactoryRuntime().getSystemRuntime();
	}
	
	protected Object getAgentGroupData() {
		return this.groupData;
	}
	
	@Override
	public String getId() {
		return this.strId;
	}
	
	protected void setId(String strId) {
		this.strId = strId;
	}

	@Override
	public String getName() {
		return this.strName;
	}
	
	protected void setName(String strName) {
		this.strName = strName;
	}

	@Override
	public String getDescription() {
		return this.strDescription;
	}
	
	protected void setDescription(String strDescription) {
		this.strDescription = strDescription;
	}


	@Override
	public synchronized void registerAIChatAgent(ISysAIChatAgentRuntime aiChatAgentRuntimeBase) throws Exception {
		if(this.sysAIChatAgentRuntimeMap.containsKey(aiChatAgentRuntimeBase.getUniqueTag())) {
			throw new Exception(String.format("代理[%1$s]已经存在", aiChatAgentRuntimeBase.getUniqueTag()));
		}
		this.sysAIChatAgentRuntimeMap.put(aiChatAgentRuntimeBase.getUniqueTag(), aiChatAgentRuntimeBase);
		this.sysAIChatAgentRuntimeList = Collections.unmodifiableList(new ArrayList<ISysAIChatAgentRuntime>(sysAIChatAgentRuntimeMap.values()));
	}


	@Override
	public synchronized boolean unregisterAIChatAgent(ISysAIChatAgentRuntime aiChatAgentRuntimeBase) {
		if(!sysAIChatAgentRuntimeMap.remove(aiChatAgentRuntimeBase.getUniqueTag(), aiChatAgentRuntimeBase)) {
			return false;
		}
		this.sysAIChatAgentRuntimeList = Collections.unmodifiableList(new ArrayList<ISysAIChatAgentRuntime>(sysAIChatAgentRuntimeMap.values()));
		return true;
	}

	@Override
	public  synchronized ISysAIChatAgentRuntime getAIChatAgent(String agentTag, boolean tryMode) throws Exception {
		ISysAIChatAgentRuntime iSysAIChatAgentRuntime = this.sysAIChatAgentRuntimeMap.get(agentTag);
		if(iSysAIChatAgentRuntime != null || tryMode) {
			return iSysAIChatAgentRuntime;
		}
		throw new Exception(String.format("指定代理[%1$s]不存在", agentTag));
	}
	

	@Override
	public List<ISysAIChatAgentRuntime> getAIChatAgents() {
		return this.sysAIChatAgentRuntimeList;
	}


	
	
	
	
//	@Override
//	public String getPrompt() {
//		return this.strPrompt;
//	}
//	
//	protected void setPrompt(String strPrompt) {
//		this.strPrompt = strPrompt;
//	}
	
//	@Override
//	public void reload() {
//		try {
//			this.onReload();
//		}
//		catch (Throwable ex) {
//			log.error(ex);
//		}
//	}
//	
//	protected void onReload() throws Throwable {
//		
//	}
}

package net.ibizsys.central.plugin.ai.util.template;

import net.ibizsys.central.cloud.core.ai.ISysAIAgentRuntime;

public class AIAgentRTFreeMarkerObject {

	private ISysAIAgentRuntime iSysAIAgentRuntime = null;
	
	public AIAgentRTFreeMarkerObject(ISysAIAgentRuntime iSysAIAgentRuntime) {
		this.iSysAIAgentRuntime = iSysAIAgentRuntime;
	}
	
	protected ISysAIAgentRuntime getSysAIAgentRuntime() {
		return this.iSysAIAgentRuntime;
	}
	
}

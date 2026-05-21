package net.ibizsys.central.plugin.ai.util.template;

import net.ibizsys.central.cloud.core.ai.ISysAIChatAgentRuntime;

public class AIChatAgentRTFreeMarkerObject extends AIAgentRTFreeMarkerObject {

	public AIChatAgentRTFreeMarkerObject(ISysAIChatAgentRuntime iSysAIChatAgentRuntime) {
		super(iSysAIChatAgentRuntime);
	}
	
	@Override
	protected ISysAIChatAgentRuntime getSysAIAgentRuntime() {
		return (ISysAIChatAgentRuntime) super.getSysAIAgentRuntime();
	}

}

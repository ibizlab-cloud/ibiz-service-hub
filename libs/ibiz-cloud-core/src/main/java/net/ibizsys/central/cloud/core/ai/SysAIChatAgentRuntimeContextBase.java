package net.ibizsys.central.cloud.core.ai;

public abstract class SysAIChatAgentRuntimeContextBase <M extends ISysAIChatAgentRuntime, C extends ISysAIAgentRuntimeContext> extends SysAIAgentRuntimeContextProxy<M, C> implements ISysAIChatAgentRuntimeContext {

	public SysAIChatAgentRuntimeContextBase(C superContext) {
		super(superContext);
	}
	
	
}

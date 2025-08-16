package net.ibizsys.central.cloud.core.ai;

public abstract class SysAIWorkerAgentRuntimeContextBase <M extends ISysAIWorkerAgentRuntime, C extends ISysAIAgentRuntimeContext> extends SysAIAgentRuntimeContextProxy<M, C> implements ISysAIWorkerAgentRuntimeContext {

	public SysAIWorkerAgentRuntimeContextBase(C superContext) {
		super(superContext);
	}
	
	
}

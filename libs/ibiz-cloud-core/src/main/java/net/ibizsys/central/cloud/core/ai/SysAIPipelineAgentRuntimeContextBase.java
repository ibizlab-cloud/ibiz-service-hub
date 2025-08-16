package net.ibizsys.central.cloud.core.ai;

public abstract class SysAIPipelineAgentRuntimeContextBase <M extends ISysAIPipelineAgentRuntime, C extends ISysAIAgentRuntimeContext> extends SysAIAgentRuntimeContextProxy<M, C> implements ISysAIPipelineAgentRuntimeContext {

	public SysAIPipelineAgentRuntimeContextBase(C superContext) {
		super(superContext);
	}
	
	
}

package net.ibizsys.central.cloud.core.ai;

import net.ibizsys.model.ai.IPSSysAIPipelineAgent;

/**
 * 系统AI生产线代理运行时
 * @author lionlau
 *
 */
public interface ISysAIPipelineAgentRuntime extends ISysAIAgentRuntime, IAIPipelineAgentRuntimeBase{

	/**
	 * 初始化
	 * @param iSysAIFactoryRuntimeContext
	 * @param iPSSysAIPipelineAgent
	 * @throws Exception
	 */
	void init(ISysAIFactoryRuntimeContext iSysAIFactoryRuntimeContext, IPSSysAIPipelineAgent iPSSysAIPipelineAgent) throws Exception;
	
	
	/* (non-Javadoc)
	 * @see net.ibizsys.runtime.IModelRuntime#getPSModelObject()
	 */
	IPSSysAIPipelineAgent getPSModelObject();
	
	
	/**
	 * 执行作业
	 * @param strAction 行为
	 * @param data 作业数据
	 * @return
	 * @throws Throwable
	 */
	Object executeAction(String strAction, Object args[]) throws Throwable;
	
}

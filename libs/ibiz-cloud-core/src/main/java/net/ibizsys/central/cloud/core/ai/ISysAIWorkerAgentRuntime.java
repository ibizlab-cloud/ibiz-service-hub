package net.ibizsys.central.cloud.core.ai;

import net.ibizsys.model.ai.IPSSysAIWorkerAgent;

/**
 * 系统AI工作者代理运行时
 * @author lionlau
 *
 */
public interface ISysAIWorkerAgentRuntime extends ISysAIAgentRuntime, IAIWorkerAgentRuntimeBase{

	/**
	 * 初始化
	 * @param iSysAIFactoryRuntimeContext
	 * @param iPSSysAIWorkerAgent
	 * @throws Exception
	 */
	void init(ISysAIFactoryRuntimeContext iSysAIFactoryRuntimeContext, IPSSysAIWorkerAgent iPSSysAIWorkerAgent) throws Exception;
	
	
	/* (non-Javadoc)
	 * @see net.ibizsys.runtime.IModelRuntime#getPSModelObject()
	 */
	IPSSysAIWorkerAgent getPSModelObject();
	
	

	
}

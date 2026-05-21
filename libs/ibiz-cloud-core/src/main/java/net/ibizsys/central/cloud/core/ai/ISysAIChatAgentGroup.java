package net.ibizsys.central.cloud.core.ai;

public interface ISysAIChatAgentGroup extends IAIChatAgentGroup<ISysAIChatAgentRuntime> {

	/**
	 * 初始化
	 * @param iSysAIFactoryRuntimeContext
	 * @param groupData
	 * @throws Exception
	 */
	void init(ISysAIFactoryRuntimeContext iSysAIFactoryRuntimeContext, Object groupData) throws Exception;
	
	
	
	
	
}

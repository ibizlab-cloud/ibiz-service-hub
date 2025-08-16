package net.ibizsys.central.plugin.ai.agent;

import net.ibizsys.central.plugin.ai.addin.ISysAIFactoryUtilRTAddin;

public interface IAIPipelineProvider extends ISysAIFactoryUtilRTAddin{

	/**
	 * 建立传入流水线数据的代理对象
	 * @param aiPipelineAgentData
	 * @return
	 */
	IAIPipelineAgent createAIPipelineAgent(Object aiPipelineAgentData);
}

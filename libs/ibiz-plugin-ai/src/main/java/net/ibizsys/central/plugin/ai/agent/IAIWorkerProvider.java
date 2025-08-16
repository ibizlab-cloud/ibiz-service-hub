package net.ibizsys.central.plugin.ai.agent;

import net.ibizsys.central.plugin.ai.addin.ISysAIFactoryUtilRTAddin;

public interface IAIWorkerProvider extends ISysAIFactoryUtilRTAddin{

	/**
	 * 建立传入工作者数据的代理对象
	 * @param aiWorkerAgentData
	 * @return
	 */
	IAIWorkerAgent createAIWorkerAgent(Object aiWorkerAgentData);
}

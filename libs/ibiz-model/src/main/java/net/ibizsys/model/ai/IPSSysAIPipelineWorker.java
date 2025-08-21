package net.ibizsys.model.ai;



/**
 * AI工厂生产线工作者模型对象接口
 *
 */
public interface IPSSysAIPipelineWorker extends net.ibizsys.model.ai.IPSAIPipelineWorker
		,net.ibizsys.model.ai.IPSSysAIPipelineObject{

	
	
	/**
	 * 获取AI工作者代理
	 * @return
	 */
	net.ibizsys.model.ai.IPSSysAIWorkerAgent getPSSysAIWorkerAgent();


	/**
	 * 获取AI工作者代理，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.ai.IPSSysAIWorkerAgent getPSSysAIWorkerAgentMust();
}
package net.ibizsys.model.ai;



/**
 * AI工厂生产线工作者模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysAIPipelineWorkerDTO}运行时对象
 *
 */
public interface IPSSysAIPipelineWorker extends net.ibizsys.model.ai.IPSAIPipelineWorker
		,net.ibizsys.model.ai.IPSSysAIPipelineObject{

	
	
	/**
	 * 获取AI工作者代理
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysAIPipelineWorkerDTO#FIELD_PSSYSAIWORKERAGENTID}
	 * @return
	 */
	net.ibizsys.model.ai.IPSSysAIWorkerAgent getPSSysAIWorkerAgent();


	/**
	 * 获取AI工作者代理，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.ai.IPSSysAIWorkerAgent getPSSysAIWorkerAgentMust();
}
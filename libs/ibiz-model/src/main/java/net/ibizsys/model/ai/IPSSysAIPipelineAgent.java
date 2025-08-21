package net.ibizsys.model.ai;



/**
 * AI工厂生产线模型对象接口
 *
 */
public interface IPSSysAIPipelineAgent extends net.ibizsys.model.ai.IPSAIPipelineAgent
		,net.ibizsys.model.ai.IPSSysAIFactoryObject{

	
	
	/**
	 * 获取AI生产线作业集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.ai.IPSSysAIPipelineJob> getAllPSSysAIPipelineJobs();
	
	/**
	 * 获取AI生产线作业集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.ai.IPSSysAIPipelineJob getPSSysAIPipelineJob(Object objKey, boolean bTryMode);
	
	/**
	 * 设置AI生产线作业集合
	 * @param list AI生产线作业集合
	 */
	void setPSSysAIPipelineJobs(java.util.List<net.ibizsys.model.ai.IPSSysAIPipelineJob> list);
	
	
	/**
	 * 获取立方体指标集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.ai.IPSSysAIPipelineWorker> getAllPSSysAIPipelineWorkers();
	
	/**
	 * 获取立方体指标集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.ai.IPSSysAIPipelineWorker getPSSysAIPipelineWorker(Object objKey, boolean bTryMode);
	
	/**
	 * 设置立方体指标集合
	 * @param list 立方体指标集合
	 */
	void setPSSysAIPipelineWorkers(java.util.List<net.ibizsys.model.ai.IPSSysAIPipelineWorker> list);
	
	
	/**
	 * 获取实体对象
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity();


	/**
	 * 获取实体对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust();
	
	
	/**
	 * 获取后台扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin();


	/**
	 * 获取后台扩展插件，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPluginMust();
}
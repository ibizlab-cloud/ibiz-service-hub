package net.ibizsys.model.ai;



/**
 * AI工厂模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysAIFactoryDTO}运行时对象
 *
 */
public interface IPSSysAIFactory extends net.ibizsys.model.ai.IPSAIFactory
		,net.ibizsys.model.service.IPSSubSysServiceAPIBase{

	
	
	/**
	 * 获取AI交谈代理集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.ai.IPSSysAIChatAgent> getAllPSSysAIChatAgents();
	
	/**
	 * 获取AI交谈代理集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.ai.IPSSysAIChatAgent getPSSysAIChatAgent(Object objKey, boolean bTryMode);
	
	/**
	 * 设置AI交谈代理集合
	 * @param list AI交谈代理集合
	 */
	void setPSSysAIChatAgents(java.util.List<net.ibizsys.model.ai.IPSSysAIChatAgent> list);
	
	
	/**
	 * 获取AI生产线代理集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.ai.IPSSysAIPipelineAgent> getAllPSSysAIPipelineAgents();
	
	/**
	 * 获取AI生产线代理集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.ai.IPSSysAIPipelineAgent getPSSysAIPipelineAgent(Object objKey, boolean bTryMode);
	
	/**
	 * 设置AI生产线代理集合
	 * @param list AI生产线代理集合
	 */
	void setPSSysAIPipelineAgents(java.util.List<net.ibizsys.model.ai.IPSSysAIPipelineAgent> list);
	
	
	/**
	 * 获取AI工作者集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.ai.IPSSysAIWorkerAgent> getAllPSSysAIWorkerAgents();
	
	/**
	 * 获取AI工作者集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.ai.IPSSysAIWorkerAgent getPSSysAIWorkerAgent(Object objKey, boolean bTryMode);
	
	/**
	 * 设置AI工作者集合
	 * @param list AI工作者集合
	 */
	void setPSSysAIWorkerAgents(java.util.List<net.ibizsys.model.ai.IPSSysAIWorkerAgent> list);
	
	
	/**
	 * 获取系统资源对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysAIFactoryDTO#FIELD_PSSYSRESOURCEID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysResource getPSSysResource();


	/**
	 * 获取系统资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysResource getPSSysResourceMust();
	
	
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
	
	
	/**
	 * 获取系统模块
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModule();


	/**
	 * 获取系统模块，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModuleMust();
}
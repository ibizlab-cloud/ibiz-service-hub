package net.ibizsys.model.ai;



/**
 * AI工作者代理模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysAIWorkerAgentDTO}运行时对象
 *
 */
public interface IPSSysAIWorkerAgent extends net.ibizsys.model.ai.IPSSysAIFactoryObject
		,net.ibizsys.model.ai.IPSAIWorkerAgent{

	
	
	/**
	 * 获取实体对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysAIWorkerAgentDTO#FIELD_PSDEID}
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
package net.ibizsys.model.res;



/**
 * 系统数据同步代理模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysDataSyncAgentDTO}运行时对象
 *
 */
public interface IPSSysDataSyncAgent extends net.ibizsys.model.service.IPSSubSysServiceAPIBase{

	
	
	/**
	 * 获取同步代理动态参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getAgentParams();
	
	
	/**
	 * 获取代理标记
	 * @return
	 */
	java.lang.String getAgentTag();
	
	
	/**
	 * 获取代理标记2
	 * @return
	 */
	java.lang.String getAgentTag2();
	
	
	/**
	 * 获取代理类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DataSyncAgentType}
	 * @return
	 */
	java.lang.String getAgentType();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取消费组标识
	 * @return
	 */
	java.lang.String getGroupId();
	
	
	/**
	 * 获取外部服务接口
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPI getPSSubSysServiceAPI();


	/**
	 * 获取外部服务接口，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPI getPSSubSysServiceAPIMust();
	
	
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
	
	
	/**
	 * 获取同步方向
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DataSyncDir}
	 * @return
	 */
	java.lang.String getSyncDir();
	
	
	/**
	 * 获取消息主题
	 * @return
	 */
	java.lang.String getTopic();
	
	
	/**
	 * 获取是否直接数据模式
	 * @return
	 */
	boolean isRawDataMode();
}
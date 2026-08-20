package net.ibizsys.model.res;



/**
 * 系统预置功能组件模型对象接口
 *
 */
public interface IPSSysUtil extends net.ibizsys.model.dataentity.util.IPSDEUtil
		,net.ibizsys.model.service.IPSSubSysServiceAPIBase{

	
	
	/**
	 * 获取认证token路径
	 * @return
	 */
	String getAuthAccessTokenUrl();
	
	
	/**
	 * 获取认证客户端标识
	 * @return
	 */
	String getAuthClientId();
	
	
	/**
	 * 获取认证客户端密码
	 * @return
	 */
	String getAuthClientSecret();
	
	
	/**
	 * 获取认证模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.APIAuthMode}
	 * @return
	 */
	String getAuthMode();
	
	
	/**
	 * 获取认证参数
	 * @return
	 */
	String getAuthParam();
	
	
	/**
	 * 获取认证参数2
	 * @return
	 */
	String getAuthParam2();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	String getCodeName();
	
	
	/**
	 * 获取输入系统数据同步代理对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysDataSyncAgent getInPSSysDataSyncAgent();


	/**
	 * 获取输入系统数据同步代理对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysDataSyncAgent getInPSSysDataSyncAgentMust();
	
	
	/**
	 * 获取排序值
	 * @return
	 */
	int getOrderValue();
	
	
	/**
	 * 获取输出系统数据同步代理对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysDataSyncAgent getOutPSSysDataSyncAgent();


	/**
	 * 获取输出系统数据同步代理对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysDataSyncAgent getOutPSSysDataSyncAgentMust();
	
	
	/**
	 * 获取输出系统资源对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysResource getOutPSSysResource();


	/**
	 * 获取输出系统资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysResource getOutPSSysResourceMust();
	
	
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
	 * 获取系统实体组
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSSysDEGroup getPSSysDEGroup();


	/**
	 * 获取系统实体组，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.IPSSysDEGroup getPSSysDEGroupMust();
	
	
	/**
	 * 获取系统模型组
	 * @return
	 */
	net.ibizsys.model.system.IPSSysModelGroup getPSSysModelGroup();


	/**
	 * 获取系统模型组，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.system.IPSSysModelGroup getPSSysModelGroupMust();
	
	
	/**
	 * 获取系统资源对象
	 * @return
	 */
	net.ibizsys.model.res.IPSSysResource getPSSysResource();


	/**
	 * 获取系统资源对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysResource getPSSysResourceMust();
	
	
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
	 * 获取运行时对象名称
	 * @return
	 */
	String getRTObjectName();
	
	
	/**
	 * 获取服务参数
	 * @return
	 */
	String getServiceParam();
	
	
	/**
	 * 获取服务参数2
	 * @return
	 */
	String getServiceParam2();
	
	
	/**
	 * 获取服务路径
	 * @return
	 */
	String getServicePath();
	
	
	/**
	 * 获取功能实体10名称
	 * @return
	 */
	String getUtilPSDE10Name();
	
	
	/**
	 * 获取功能实体2名称
	 * @return
	 */
	String getUtilPSDE2Name();
	
	
	/**
	 * 获取功能实体3名称
	 * @return
	 */
	String getUtilPSDE3Name();
	
	
	/**
	 * 获取功能实体4名称
	 * @return
	 */
	String getUtilPSDE4Name();
	
	
	/**
	 * 获取功能实体5名称
	 * @return
	 */
	String getUtilPSDE5Name();
	
	
	/**
	 * 获取功能实体6名称
	 * @return
	 */
	String getUtilPSDE6Name();
	
	
	/**
	 * 获取功能实体7名称
	 * @return
	 */
	String getUtilPSDE7Name();
	
	
	/**
	 * 获取功能实体8名称
	 * @return
	 */
	String getUtilPSDE8Name();
	
	
	/**
	 * 获取功能实体9名称
	 * @return
	 */
	String getUtilPSDE9Name();
	
	
	/**
	 * 获取功能实体名称
	 * @return
	 */
	String getUtilPSDEName();
	
	
	/**
	 * 获取功能类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SysUtilType}
	 * @return
	 */
	String getUtilType();
	
	
	/**
	 * 获取是否注册到系统
	 * @return
	 */
	boolean isRegToSys();
	
	
	/**
	 * 获取是否尝试模式
	 * @return
	 */
	boolean isTryMode();
}
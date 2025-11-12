package net.ibizsys.model.service;



/**
 * 外部服务接口模型对象接口
 * <P>
 * 定义系统访问的外部接口
 *
 */
public interface IPSSubSysServiceAPI extends net.ibizsys.model.service.IPSSubSysServiceAPIBase{

	
	
	/**
	 * 获取服务接口代码标识模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CodeNameMode}
	 * @return
	 */
	java.lang.String getAPICodeNameMode();
	
	
	/**
	 * 获取接口来源
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SubSysAPISource}
	 * @return
	 */
	java.lang.String getAPISource();
	
	
	/**
	 * 获取接口标记
	 * @return
	 */
	java.lang.String getAPITag();
	
	
	/**
	 * 获取接口标记2
	 * @return
	 */
	java.lang.String getAPITag2();
	
	
	/**
	 * 获取接口类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SubSysAPIType}
	 * @return
	 */
	java.lang.String getAPIType();
	
	
	/**
	 * 获取接口实体关系集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDERS> getAllPSSubSysServiceAPIDERSs();
	
	/**
	 * 获取接口实体关系集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDERS getPSSubSysServiceAPIDERS(Object objKey, boolean bTryMode);
	
	/**
	 * 设置接口实体关系集合
	 * @param list 接口实体关系集合
	 */
	void setPSSubSysServiceAPIDERs(java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDERS> list);
	
	
	/**
	 * 获取接口实体集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDE> getAllPSSubSysServiceAPIDEs();
	
	/**
	 * 获取接口实体集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDE getPSSubSysServiceAPIDE(Object objKey, boolean bTryMode);
	
	/**
	 * 设置接口实体集合
	 * @param list 接口实体集合
	 */
	void setPSSubSysServiceAPIDEs(java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDE> list);
	
	
	/**
	 * 获取接口DTO集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDTO> getAllPSSubSysServiceAPIDTOs();
	
	/**
	 * 获取接口DTO集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.service.IPSSubSysServiceAPIDTO getPSSubSysServiceAPIDTO(Object objKey, boolean bTryMode);
	
	/**
	 * 设置接口DTO集合
	 * @param list 接口DTO集合
	 */
	void setPSSubSysServiceAPIDTOs(java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDTO> list);
	
	
	/**
	 * 获取认证参数3
	 * @return
	 */
	java.lang.String getAuthParam3();
	
	
	/**
	 * 获取认证参数4
	 * @return
	 */
	java.lang.String getAuthParam4();
	
	
	/**
	 * 获取认证脚本代码
	 * @return
	 */
	java.lang.String getAuthScriptCode();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取处理对象
	 * @return
	 */
	java.lang.String getHandler();
	
	
	/**
	 * 获取请求头集合
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getHeaderParams();
	
	
	/**
	 * 获取方法调用脚本代码
	 * @return
	 */
	java.lang.String getMethodScriptCode();
	
	
	/**
	 * 获取OpenAPI3 Schema
	 * @return
	 */
	net.ibizsys.model.service.openapi.IPSOpenAPI3Schema getPSOpenAPI3Schema();


	/**
	 * 获取OpenAPI3 Schema，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.service.openapi.IPSOpenAPI3Schema getPSOpenAPI3SchemaMust();
	
	
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
	 * 获取后端扩展插件
	 * @return
	 */
	net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin();


	/**
	 * 获取后端扩展插件，不存在时抛出异常
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
	 * 获取预定义接口类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.PredefinedServiceAPIClient}
	 * @return
	 */
	java.lang.String getPredefinedType();
	
	
	/**
	 * 获取服务代码名称
	 * @return
	 */
	java.lang.String getServiceCodeName();
	
	
	/**
	 * 获取服务参数3
	 * @return
	 */
	java.lang.String getServiceParam3();
	
	
	/**
	 * 获取服务参数4
	 * @return
	 */
	java.lang.String getServiceParam4();
	
	
	/**
	 * 获取服务类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ServiceType}
	 * @return
	 */
	java.lang.String getServiceType();
	
	
	/**
	 * 获取是否启用服务接口DTO
	 * @return
	 */
	boolean isEnableServiceAPIDTO();
}
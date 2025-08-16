package net.ibizsys.model.service;



/**
 * 系统服务接口模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysServiceAPIDTO}运行时对象
 *
 */
public interface IPSSysServiceAPI extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取服务接口代码标识模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysServiceAPIDTO#FIELD_CODENAMEMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.CodeNameMode}
	 * @return
	 */
	java.lang.String getAPICodeNameMode();
	
	
	/**
	 * 获取接口级别
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysServiceAPIDTO#FIELD_APILEVEL}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ServiceAPILevel}
	 * @return
	 */
	int getAPILevel();
	
	
	/**
	 * 获取接口模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysServiceAPIDTO#FIELD_APIMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ServiceAPIMode}
	 * @return
	 */
	int getAPIMode();
	
	
	/**
	 * 获取接口标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysServiceAPIDTO#FIELD_APITAG}
	 * @return
	 */
	java.lang.String getAPITag();
	
	
	/**
	 * 获取接口标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysServiceAPIDTO#FIELD_APITAG2}
	 * @return
	 */
	java.lang.String getAPITag2();
	
	
	/**
	 * 获取接口类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysServiceAPIDTO#FIELD_APITYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ServiceAPIType}
	 * @return
	 */
	java.lang.String getAPIType();
	
	
	/**
	 * 获取接口版本
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysServiceAPIDTO#FIELD_VER}
	 * @return
	 */
	int getAPIVersion();
	
	
	/**
	 * 获取认证token路径
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysServiceAPIDTO#FIELD_AUTHCHECKTOKENURI}
	 * @return
	 */
	java.lang.String getAuthCheckTokenUrl();
	
	
	/**
	 * 获取认证客户端标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysServiceAPIDTO#FIELD_AUTHCLIENTID}
	 * @return
	 */
	java.lang.String getAuthClientId();
	
	
	/**
	 * 获取认证客户端密码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysServiceAPIDTO#FIELD_AUTHCLIENTSECRET}
	 * @return
	 */
	java.lang.String getAuthClientSecret();
	
	
	/**
	 * 获取认证模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysServiceAPIDTO#FIELD_AUTHMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.APIAuthMode}
	 * @return
	 */
	java.lang.String getAuthMode();
	
	
	/**
	 * 获取认证参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysServiceAPIDTO#FIELD_AUTHPARAM}
	 * @return
	 */
	java.lang.String getAuthParam();
	
	
	/**
	 * 获取认证参数2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysServiceAPIDTO#FIELD_AUTHPARAM2}
	 * @return
	 */
	java.lang.String getAuthParam2();
	
	
	/**
	 * 获取认证参数3
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysServiceAPIDTO#FIELD_AUTHPARAM3}
	 * @return
	 */
	java.lang.String getAuthParam3();
	
	
	/**
	 * 获取认证参数4
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysServiceAPIDTO#FIELD_AUTHPARAM4}
	 * @return
	 */
	java.lang.String getAuthParam4();
	
	
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
	 * 获取默认端口
	 * @return
	 */
	int getHttpPort();
	
	
	/**
	 * 获取忽略认证模式集合
	 * @return
	 */
	java.util.List<java.lang.String> getIgnoreAuthPatterns();
	
	
	/**
	 * 获取命名服务
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysServiceAPIDTO#FIELD_NAMINGSERVICE}
	 * @return
	 */
	java.lang.String getNamingService();
	
	
	/**
	 * 获取输出值转换器
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysServiceAPIDTO#FIELD_OUTPSSYSTRANSLATORID}
	 * @return
	 */
	net.ibizsys.model.res.IPSSysTranslator getOutPSSysTranslator();


	/**
	 * 获取输出值转换器，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.res.IPSSysTranslator getOutPSSysTranslatorMust();
	
	
	/**
	 * 获取实体资源关系集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS> getPSDEServiceAPIRSs();
	
	/**
	 * 获取实体资源关系集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS getPSDEServiceAPIRS(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体资源关系集合
	 * @param list 实体资源关系集合
	 */
	void setPSDEServiceAPIRSs(java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS> list);
	
	
	/**
	 * 获取实体资源集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPI> getPSDEServiceAPIs();
	
	/**
	 * 获取实体资源集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.service.IPSDEServiceAPI getPSDEServiceAPI(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体资源集合
	 * @param list 实体资源集合
	 */
	void setPSDEServiceAPIs(java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPI> list);
	
	
	/**
	 * 获取系统资源对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysServiceAPIDTO#FIELD_PSSYSRESOURCEID}
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
	 * 获取测试项目集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.testing.IPSSysTestPrj> getPSSysTestPrjs();
	
	/**
	 * 获取测试项目集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.testing.IPSSysTestPrj getPSSysTestPrj(Object objKey, boolean bTryMode);
	
	/**
	 * 设置测试项目集合
	 * @param list 测试项目集合
	 */
	void setPSSysTestPrjs(java.util.List<net.ibizsys.model.testing.IPSSysTestPrj> list);
	
	
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
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysServiceAPIDTO#FIELD_PREDEFINEDTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ServiceAPIPredefinedType}
	 * @return
	 */
	java.lang.String getPredefinedType();
	
	
	/**
	 * 获取服务代码名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysServiceAPIDTO#FIELD_SERVICECODENAME}
	 * @return
	 */
	java.lang.String getServiceCodeName();
	
	
	/**
	 * 获取服务参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysServiceAPIDTO#FIELD_SERVICEPARAM}
	 * @return
	 */
	java.lang.String getServiceParam();
	
	
	/**
	 * 获取服务参数2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysServiceAPIDTO#FIELD_SERVICEPARAM2}
	 * @return
	 */
	java.lang.String getServiceParam2();
	
	
	/**
	 * 获取服务参数3
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysServiceAPIDTO#FIELD_SERVICEPARAM3}
	 * @return
	 */
	java.lang.String getServiceParam3();
	
	
	/**
	 * 获取服务参数4
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysServiceAPIDTO#FIELD_SERVICEPARAM4}
	 * @return
	 */
	java.lang.String getServiceParam4();
	
	
	/**
	 * 获取服务类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysServiceAPIDTO#FIELD_SERVICETYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ServiceType}
	 * @return
	 */
	java.lang.String getServiceType();
	
	
	/**
	 * 获取是否平台管理员级别接口，等同{@link getAPILevel}返回平台管理员(1)
	 * @return
	 */
	boolean isCloudAdminLevel();
	
	
	/**
	 * 获取是否系统级别接口，等同{@link getAPILevel}返回核心级(0)
	 * @return
	 */
	boolean isCoreLevel();
	
	
	/**
	 * 获取是否机构管理员级别接口，等同{@link getAPILevel}返回机构管理员(2)
	 * @return
	 */
	boolean isDCAdminLevel();
	
	
	/**
	 * 获取是否支持网关
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysServiceAPIDTO#FIELD_ENABLEGATEWAY}
	 * @return
	 */
	boolean isEnableGateway();
	
	
	/**
	 * 获取是否启用服务接口DTO
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysServiceAPIDTO#FIELD_SERVICEDTOFLAG}
	 * @return
	 */
	boolean isEnableServiceAPIDTO();
	
	
	/**
	 * 获取是否用户级别接口，等同{@link getAPILevel}返回用户级(3)
	 * @return
	 */
	boolean isUserLevel();
}
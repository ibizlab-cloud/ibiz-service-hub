package net.ibizsys.model.res;



/**
 * 系统预置功能组件模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSSysUtilDTO}运行时对象
 *
 */
public interface IPSSysUtil extends net.ibizsys.model.dataentity.util.IPSDEUtil
		,net.ibizsys.model.service.IPSSubSysServiceAPIBase{

	
	
	/**
	 * 获取认证token路径
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysUtilDTO#FIELD_AUTHACCESSTOKENURI}
	 * @return
	 */
	java.lang.String getAuthAccessTokenUrl();
	
	
	/**
	 * 获取认证客户端标识
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysUtilDTO#FIELD_AUTHCLIENTID}
	 * @return
	 */
	java.lang.String getAuthClientId();
	
	
	/**
	 * 获取认证客户端密码
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysUtilDTO#FIELD_AUTHCLIENTSECRET}
	 * @return
	 */
	java.lang.String getAuthClientSecret();
	
	
	/**
	 * 获取认证模式
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysUtilDTO#FIELD_AUTHMODE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.APIAuthMode}
	 * @return
	 */
	java.lang.String getAuthMode();
	
	
	/**
	 * 获取认证参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysUtilDTO#FIELD_AUTHPARAM}
	 * @return
	 */
	java.lang.String getAuthParam();
	
	
	/**
	 * 获取认证参数2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysUtilDTO#FIELD_AUTHPARAM2}
	 * @return
	 */
	java.lang.String getAuthParam2();
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取输入系统数据同步代理对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysUtilDTO#FIELD_INPSSYSDATASYNCAGENTID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysUtilDTO#FIELD_ORDERVALUE}
	 * @return
	 */
	int getOrderValue();
	
	
	/**
	 * 获取输出系统数据同步代理对象
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysUtilDTO#FIELD_OUTPSSYSDATASYNCAGENTID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysUtilDTO#FIELD_OUTPSSYSRESOURCEID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysUtilDTO#FIELD_PSSUBSYSSERVICEAPIID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysUtilDTO#FIELD_PSDEGROUPID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysUtilDTO#FIELD_PSSYSMODELGROUPID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysUtilDTO#FIELD_PSSYSRESOURCEID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysUtilDTO#FIELD_PSMODULEID}
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysUtilDTO#FIELD_UTILOBJ}
	 * @return
	 */
	java.lang.String getRTObjectName();
	
	
	/**
	 * 获取服务参数
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysUtilDTO#FIELD_SERVICEPARAM}
	 * @return
	 */
	java.lang.String getServiceParam();
	
	
	/**
	 * 获取服务参数2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysUtilDTO#FIELD_SERVICEPARAM2}
	 * @return
	 */
	java.lang.String getServiceParam2();
	
	
	/**
	 * 获取服务路径
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysUtilDTO#FIELD_SERVICEPATH}
	 * @return
	 */
	java.lang.String getServicePath();
	
	
	/**
	 * 获取功能实体10名称
	 * @return
	 */
	java.lang.String getUtilPSDE10Name();
	
	
	/**
	 * 获取功能实体2名称
	 * @return
	 */
	java.lang.String getUtilPSDE2Name();
	
	
	/**
	 * 获取功能实体3名称
	 * @return
	 */
	java.lang.String getUtilPSDE3Name();
	
	
	/**
	 * 获取功能实体4名称
	 * @return
	 */
	java.lang.String getUtilPSDE4Name();
	
	
	/**
	 * 获取功能实体5名称
	 * @return
	 */
	java.lang.String getUtilPSDE5Name();
	
	
	/**
	 * 获取功能实体6名称
	 * @return
	 */
	java.lang.String getUtilPSDE6Name();
	
	
	/**
	 * 获取功能实体7名称
	 * @return
	 */
	java.lang.String getUtilPSDE7Name();
	
	
	/**
	 * 获取功能实体8名称
	 * @return
	 */
	java.lang.String getUtilPSDE8Name();
	
	
	/**
	 * 获取功能实体9名称
	 * @return
	 */
	java.lang.String getUtilPSDE9Name();
	
	
	/**
	 * 获取功能实体名称
	 * @return
	 */
	java.lang.String getUtilPSDEName();
	
	
	/**
	 * 获取功能类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSSysUtilDTO#FIELD_UTILTYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SysUtilType}
	 * @return
	 */
	java.lang.String getUtilType();
	
	
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
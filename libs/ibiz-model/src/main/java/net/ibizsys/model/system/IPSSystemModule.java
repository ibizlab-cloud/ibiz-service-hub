package net.ibizsys.model.system;



/**
 * 系统模块模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSModuleDTO}运行时对象
 *
 */
public interface IPSSystemModule extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码表集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.codelist.IPSCodeList> getAllPSCodeLists();
	
	/**
	 * 获取代码表集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.codelist.IPSCodeList getPSCodeList(Object objKey, boolean bTryMode);
	
	/**
	 * 设置代码表集合
	 * @param list 代码表集合
	 */
	void setPSCodeLists(java.util.List<net.ibizsys.model.codelist.IPSCodeList> list);
	
	
	/**
	 * 获取实体集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.dataentity.IPSDataEntity> getAllPSDataEntities();
	
	/**
	 * 获取实体集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity(Object objKey, boolean bTryMode);
	
	/**
	 * 设置实体集合
	 * @param list 实体集合
	 */
	void setPSDataEntities(java.util.List<net.ibizsys.model.dataentity.IPSDataEntity> list);
	
	
	/**
	 * 获取工作流集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.wf.IPSWorkflow> getAllPSWorkflows();
	
	/**
	 * 获取工作流集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.wf.IPSWorkflow getPSWorkflow(Object objKey, boolean bTryMode);
	
	/**
	 * 设置工作流集合
	 * @param list 工作流集合
	 */
	void setPSWorkflows(java.util.List<net.ibizsys.model.wf.IPSWorkflow> list);
	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取默认数据源
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSModuleDTO#FIELD_DSLINK}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.DataSourceLink}
	 * @return
	 */
	java.lang.String getDSLink();
	
	
	/**
	 * 获取模块编号
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSModuleDTO#FIELD_MODULESN}
	 * @return
	 */
	java.lang.String getModuleSN();
	
	
	/**
	 * 获取模块标记
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSModuleDTO#FIELD_MODTAG}
	 * @return
	 */
	java.lang.String getModuleTag();
	
	
	/**
	 * 获取模块标记2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSModuleDTO#FIELD_MODTAG2}
	 * @return
	 */
	java.lang.String getModuleTag2();
	
	
	/**
	 * 获取模块标记3
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSModuleDTO#FIELD_MODTAG3}
	 * @return
	 */
	java.lang.String getModuleTag3();
	
	
	/**
	 * 获取模块标记4
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSModuleDTO#FIELD_MODTAG4}
	 * @return
	 */
	java.lang.String getModuleTag4();
	
	
	/**
	 * 获取包代码名称
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSModuleDTO#FIELD_PKGCODENAME}
	 * @return
	 */
	java.lang.String getPKGCodeName();
	
	
	/**
	 * 获取系统模型组
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSModuleDTO#FIELD_PSSYSMODELGROUPID}
	 * @return
	 */
	net.ibizsys.model.system.IPSSysModelGroup getPSSysModelGroup();


	/**
	 * 获取系统模型组，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.system.IPSSysModelGroup getPSSysModelGroupMust();
	
	
	/**
	 * 获取系统引用
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSModuleDTO#FIELD_PSSYSREFID}
	 * @return
	 */
	net.ibizsys.model.system.IPSSysRef getPSSysRef();


	/**
	 * 获取系统引用，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.system.IPSSysRef getPSSysRefMust();
	
	
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
	 * 获取运行时类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSModuleDTO#FIELD_RUNTIMETYPE}
	 * @return
	 */
	java.lang.String getRuntimeType();
	
	
	/**
	 * 获取引用系统类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SysRefType}
	 * @return
	 */
	java.lang.String getSysRefType();
	
	
	/**
	 * 获取模块功能参数
	 * @return
	 */
	com.fasterxml.jackson.databind.node.ObjectNode getUtilParams();
	
	
	/**
	 * 获取模块功能标记
	 * @return
	 */
	java.lang.String getUtilTag();
	
	
	/**
	 * 获取模块功能类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.ModuleUtilType}
	 * @return
	 */
	java.lang.String getUtilType();
	
	
	/**
	 * 获取是否默认模块
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSModuleDTO#FIELD_DEFAULTFLAG}
	 * @return
	 */
	boolean isDefaultModule();
	
	
	/**
	 * 获取是否子系统以云服务方式提供
	 * @return
	 */
	boolean isSubSysAsCloud();
	
	
	/**
	 * 获取是否子系统模块
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSModuleDTO#FIELD_SUBSYSMODULE}
	 * @return
	 */
	boolean isSubSysModule();
}
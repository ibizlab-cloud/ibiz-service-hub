package net.ibizsys.model.wf;



/**
 * 工作流处理角色模型对象接口，标准模型{@link net.ibizsys.centralstudio.dto.PSWFRoleDTO}运行时对象
 *
 */
public interface IPSWFRole extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
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
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFRoleDTO#FIELD_PSMODULEID}
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModule();


	/**
	 * 获取系统模块，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.system.IPSSystemModule getPSSystemModuleMust();
	
	
	/**
	 * 获取角色唯一标记
	 * @return
	 */
	java.lang.String getUniqueTag();
	
	
	/**
	 * 获取工作流角色数据
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFRoleDTO#FIELD_USERDATA}
	 * @return
	 */
	java.lang.String getUserData();
	
	
	/**
	 * 获取工作流角色数据2
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFRoleDTO#FIELD_USERDATA2}
	 * @return
	 */
	java.lang.String getUserData2();
	
	
	/**
	 * 获取工作流角色编号
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFRoleDTO#FIELD_WFROLESN}
	 * @return
	 */
	java.lang.String getWFRoleSN();
	
	
	/**
	 * 获取工作流角色类型
	 * <P>
	 * 相关模型：{@link net.ibizsys.centralstudio.dto.PSWFRoleDTO#FIELD_WFROLETYPE}
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.WFRoleType}
	 * @return
	 */
	java.lang.String getWFRoleType();
}
package net.ibizsys.central.cloud.core.cloudutil;


import java.util.Collection;
import java.util.List;
import java.util.Map;

import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.security.IUAAGrantedAuthority;
import net.ibizsys.central.cloud.core.util.domain.AppHub;
import net.ibizsys.central.cloud.core.util.domain.Application;
import net.ibizsys.central.cloud.core.util.domain.CodeList;
import net.ibizsys.central.cloud.core.util.domain.Config;
import net.ibizsys.central.cloud.core.util.domain.DCSystem;
import net.ibizsys.central.cloud.core.util.domain.DepCenter;
import net.ibizsys.central.cloud.core.util.domain.Department;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.MetaDynaModel;
import net.ibizsys.central.cloud.core.util.domain.MsgTemplate;
import net.ibizsys.central.cloud.core.util.domain.OpenAccess;
import net.ibizsys.central.cloud.core.util.domain.OpenUser;
import net.ibizsys.central.cloud.core.util.domain.OrgSystem;
import net.ibizsys.central.cloud.core.util.domain.Organization;
import net.ibizsys.central.cloud.core.util.domain.Role;
import net.ibizsys.central.cloud.core.util.domain.SysAudit;
import net.ibizsys.central.cloud.core.util.domain.SysEvent;
import net.ibizsys.central.cloud.core.util.domain.SysLog;
import net.ibizsys.central.cloud.core.util.domain.SysPO;
import net.ibizsys.central.cloud.core.util.domain.User;
import net.ibizsys.central.cloud.core.util.domain.UserRole;
import net.ibizsys.central.cloud.core.util.domain.WFDefinition;
import net.ibizsys.central.cloud.core.util.domain.WFGroup;
import net.ibizsys.central.cloud.core.util.domain.WFMember;
import net.ibizsys.runtime.util.domain.File;

public interface ICloudSaaSUtilRuntime extends ICloudUtilRuntime{

	/**
	 * SaaS功能插件前缀
	 */
	public final static String ADDIN_SAASFUNC_PREFIX = "SAASFUNC:";

	/**
	 * 门户系统默认标识
	 */
	final static String SYSTEMID_PORTAL = "iBizPortal";
	
	
	/**
	 * 最大系统服务标识长度
	 */
	public final int MAXSERVICEIDLENGTH = 30;
	
	
//	/**
//	 * 获取应用数据对象
//	 * @param strSystemId
//	 * @param strOrgId
//	 * @param iAuthenticationUser 当前认证用户
//	 * @return
//	 */
//	AppData getAppData(String strSystemId, String strOrgId, IAuthenticationUser iAuthenticationUser);
//	
	
	/**
	 * 通过名称获取用户
	 * @param strName
	 * @return
	 */
	User getUserByName(String strName);
	
	
	
	/**
	 * 通过名称获取用户
	 * @param strSystemId
	 * @param strOrgId
	 * @param strName
	 * @return
	 */
	User getUserByName(String strSystemId, String strOrgId, String strName);
	
	
	
	/**
	 * 通过名称重置用户（进行缓存清除等操作）
	 * @param iAuthenticationUser
	 * @return
	 */
	void resetUser(IAuthenticationUser iAuthenticationUser);
	
	
	
	 /**
     * 变更传入用户登录密码
     * @param strUserId
     * @param password
     */
    void changePassword(String strUserId, String oldpassword, String newpassword);
    
	
	/**
	 * 获取中心员工身份
	 * @param iAuthenticationUser
	 * @param strSystemId
	 * @param strOrgId
	 * @return
	 */
	Employee getEmployee(IAuthenticationUser iAuthenticationUser, String strSystemId, String strOrgId);
	
	
	/**
	 * 获取机构用户数据
	 * @param iAuthenticationUser
	 * @param strDCId 租户标识
	 * @return
	 */
	Employee getEmployeeByDC(IAuthenticationUser iAuthenticationUser, String strDCId);
	
	/**
	 * 获取机构用户数据
	 * @param iAuthenticationUser
	 * @param strDCId 租户标识
	 * @param strSystemId 平台系统标识
	 * @return
	 */
	Employee getEmployeeByDC(IAuthenticationUser iAuthenticationUser, String strDCId, String strSystemId);
	
	
	/**
	 * 获取中心员工身份
	 * @param ids
	 * @return
	 */
	Collection<Employee> getEmployees(String[] ids);
	
	
	
	/**
	 * 获取中心员工身份
	 * @param id
	 * @return
	 */
	Employee getEmployee(String id);
	
	
	
	/**
	 * 获取传入组织的员工集合
	 * @param strOrgId
	 * @return
	 */
	Collection<Employee> getEmployeesByOrg(String strOrgId);
	
	
	
	/**
	 * 获取机构部门
	 * @param id
	 * @return
	 */
	Department getDepartment(String id);
	
	
	
	/**
	 * 获取传入部门的员工集合
	 * @param strOrgId
	 * @return
	 */
	Collection<Employee> getEmployeesByDept(String strDeptId);
	
//	/**
//	 * 获取传入系统及组织的模块动态模型配置
//	 * @param strModuleInstTag
//	 * @param strModuleInstTag2
//	 * @return
//	 */
//	MetaDynaModel getMetaDynaModel(String strModuleInstTag, String strModuleInstTag2);

	
	
	/**
	 * 获取传入系统及组织的默认动态模型配置
	 * @return
	 */
	MetaDynaModel getDefaultMetaDynaModel();
	
	/**
	 * 获取指定系统的动态模型配置
	 * @param strSystemId
	 * @param strOrgId
	 * @return
	 */
	MetaDynaModel getMetaDynaModel(String strSystemId, String strOrgId);
	
	
	/**
	 * 获取当前用户在指定租户系统的组织身份
	 * @param strDCSystemId
	 * @param iAuthenticationUser 认证用户
	 * @return
	 */
	Collection<OrgSystem> getOrgSystems(IAuthenticationUser iAuthenticationUser, String strDCSystemId);
	
	
	
	
	/**
	 * 获取传入机构用户的授权清单
	 * @param iAuthenticationUser
	 * @param iEmployeeContext
	 * @return
	 */
	Collection<IUAAGrantedAuthority> getGrantedAuthorities(IAuthenticationUser iAuthenticationUser, IEmployeeContext iEmployeeContext);
	
	
	
	
//	/**
//	 * 获取中心所有系统集合
//	 * @param strDCId
//	 * @return
//	 */
//	List<DCSystem> getDCSystems(String strDCId);
//	
//	
//	
//	/**
//	 * 获取租户中心标识（通过传入组合系统及用户标识）
//	 * @param strDCSystemId
//	 * @param strUserId
//	 * @return
//	 */
//	String getDCId(String strDCSystemId, String strUserId);
	
	/**
	 * 获取业务实体流程定义
	 * @param strSystemTag
	 * @param strDynaInstTag
	 * @param strDynaInstTag2
	 * @param strDataEntity
	 * @param strAppName
	 * @return
	 */
	Collection<WFDefinition> getWFDefinitions(String strSystemTag, String strDynaInstTag, String strDynaInstTag2, String strDataEntity, String strAppName);
	
	
	
	
	/**
	 * 获取业务实体流程定义
	 * @param strSystemTag
	 * @param strDynaInstTag
	 * @param strDynaInstTag2
	 * @param strDataEntity
	 * @param strWFDefinitionId 定义标识
	 * @param strAppName
	 * @return
	 */
	WFDefinition getWFDefinition(String strSystemTag, String strDynaInstTag, String strDynaInstTag2, String strDataEntity, String strProcessDefinitionKey, String strAppName);
	
	
	
	

	/**
	 * 获取业务实体流程定义
	 * @param strSystemTag
	 * @param strDataEntity
	 * @param strWFDefinitionId 定义标识
	 * @param strAppName
	 * @return
	 */
	WFDefinition getWFDefinition(String strSystemTag, String strDataEntity, String strKey, String strProcessDefinitionKey, String strAppName);
	
	
	
	
	/**
	 * 获取配置值
	 * @param strConfigType
	 * @param strTargetType
	 * @param bTryMode
	 * @return
	 */
	Config getConfig(String strConfigType, String strTargetType, boolean bTryMode);
	
	
	/**
	 * 保存配置值
	 * @param strConfigType
	 * @param strTargetType
	 * @param objConfig 配置数据
	 * @return
	 */
	Config saveConfig(String strConfigType, String strTargetType, Object objConfig);
	
	
	/**
	 * 获取配置值
	 * @param strConfigType
	 * @param strTargetType
	 * @param bTryMode
	 * @param bTryGlobal 尝试全局
	 * @return
	 */
	Config getConfig(String strConfigType, String strTargetType, boolean bTryMode, boolean bTryGlobal);
	
	
	/**
	 * 保存配置值
	 * @param strConfigType
	 * @param strTargetType
	 * @param objConfig 配置数据
	 * @param bAsGlobal 同时保持全局
	 * @return
	 */
	Config saveConfig(String strConfigType, String strTargetType, Object objConfig, boolean bAsGlobal);
	
	/**
	 * 移除配置
	 * @param strConfigType
	 * @param strTargetType
	 */
	void removeConfig(String strConfigType, String strTargetType);
	
	
	
	/**
	 * 获取指定代码表对象
	 * @param strCodeListTag
	 * @param bTryMode
	 * @return
	 */
	CodeList getCodeList(String strCodeListTag, boolean bTryMode);

	/**
	 * 获取指定代码表对象
	 * @param strCodeListTag
	 * @param bTryMode
	 * @return
	 */
	CodeList getCodeList(String strCodeListTag, boolean bTryMode,Integer maxSize);
	
	/**
	 * 常规日志 
	 * @param sysLog
	 */
	void log(SysLog sysLog);
	
	
	
	/**
	 * 日志审计信息
	 * @param sysAudit
	 */
	void logAudit(SysAudit sysAudit);
	
	
	
	/**
	 * 日志系统事件
	 * @param sysEvent
	 */
	void logEvent(SysEvent sysEvent);
	
	
	
	/**
	 * 日志性能记录
	 * @param sysEvent
	 */
	void logPO(SysPO sysPO);
	
	
	/**
	 * 批量日志（通用日志对象）
	 * @param list
	 */
	void log(List<net.ibizsys.runtime.util.domain.Log> list);
	
	
	
	
	/**
	 * 获取当前机构用户所在租户的全部机构
	 * @return
	 */
	java.util.Collection<Organization> getAllOrganizations();
	
	
	
	
	/**
	 * 获取当前用户所在机构的全部部门
	 * @return
	 */
	java.util.Collection<Department> getAllDepartments();
	
	
	/**
	 * 获取传入组织的全部部门
	 * @param strOrgId 
	 * @return
	 */
	java.util.Collection<Department> getDepartmentsByOrg(String strOrgId);
	
	

	/**
	 * 获取当前用户所在机构的全部人员
	 * @return
	 */
	Collection<Employee> getAllEmployees();
	
	
	
	/**
	 * 获取云平台全部系统
	 * @return
	 */
	java.util.Collection<net.ibizsys.central.cloud.core.util.domain.System> getAllSystems();
	
	
	
	/**
	 * 获取指定云平台系统
	 * @param strSystemId
	 * @return
	 */
	net.ibizsys.central.cloud.core.util.domain.System getSystem(String strSystemId);
	
	
	/**
	 * 获取云平台全部应用
	 * @return
	 */
	java.util.Collection<Application> getAllApplications();
	
	
	
	/**
	 * 获取指定系统全部应用
	 * @param strSystemId 系统标识
	 * @return
	 */
	java.util.Collection<Application> getApplications(String strSystemId);
	
	
	/**
	 * 获取云平台全部部署机构
	 * @return
	 */
	Collection<DepCenter> getAllDepCenters();
	
	/**
	 * 获取部署中心
	 * @param strDepCenterId
	 * @return
	 */
	DepCenter getDepCenter(String strDepCenterId);
	
	/**
	 * 获取全部租户系统集合
	 * @return
	 */
	Collection<DCSystem> getAllDCSystems();
	
	/**
	 * 获取指定租户系统
	 * @param strDCSystemId
	 * @return
	 */
	DCSystem getDCSystem(String strDCSystemId);
	
	/**
	 * 通过系统标识获取租户系统
	 * @param strSystemId
	 * @param strTanentId
	 * @return
	 */
	DCSystem getDCSystem(String strSystemId, String strTanentId);
	
	
	
	/**
	 * 获取传入租户系统的服务标识
	 * @param strDCSystemId
	 * @return
	 */
	String getServiceId(String strDCSystemId);
	
	/**
	 * 获取当前机构全部工作流组
	 * @return
	 */
	java.util.Collection<WFGroup> getAllWFGroups();
	
	
	/**
	 * 获取指定工作流组
	 * @return
	 */
	WFGroup getWFGroup(String strWFGroupId);
	
	
	/**
	 * 获取工作流组成员
	 * @return
	 */
	java.util.Collection<WFMember> getWFMembers(String strWFGroupId);
	
	
	

	/**
	 * 获取当前机构全部全局角色
	 * @return
	 */
	java.util.Collection<Role> getAllGlobalRoles();
	
	
	/**
	 * 获取指定全局角色
	 * @param strRoleTag 角色标记
	 * @return
	 */
	Role getGlobalRole(String strRoleTag);
	
	
	/**
	 * 获取全局角色组成员
	 * @param strRoleId
	 * @return
	 */
	java.util.Collection<UserRole> getGlobalUserRoles(String strRoleId);
	
	
	/**
	 * 获取传入系统全部角色
	 * @param strDCSystemId 系统标识
	 * @return
	 */
	java.util.Collection<Role> getSystemRoles(String strDCSystemId);
	
	
	/**
	 * 获取指定系统角色
	 * @param strDCSystemId 系统标识
	 * @param strRoleTag 角色标记
	 * @param bTryMode 尝试模式
	 * @return
	 */
	Role getSystemRole(String strDCSystemId, String strRoleTag, boolean bTryMode);
	
	
	/**
	 * 获取系统角色组成员
	 * @param strDCSystemId 系统标识
	 * @param strRoleId
	 * @return
	 */
	java.util.Collection<UserRole> getSystemUserRoles(String strDCSystemId, String strRoleId);
	
	
	
	/**
	 * 获取开放平台访问数据对象
	 * @param strOpenAccessId
	 * @return
	 */
	OpenAccess getOpenAccess(String strOpenAccessId);
	
	

	/**
	 * 获取开放平台访问数据对象
	 * @param strOpenAccessId
	 * @param bTryMode 
	 * @return
	 */
	OpenAccess getOpenAccess(String strOpenAccessId, boolean bTryMode);
	
	
	
	/**
	 * 获取传入机构用户的第三方用户信息
	 * @param strOpenType
	 * @param strUserId
	 * @return
	 */
	OpenUser getOpenUser(String strOpenType, String strUserId);
	
	
	
	
	/**
	 * 获取默认开放应用标识
	 * @param strOpenType
	 * @return
	 */
	String getDefaultOpenAccessId(String strOpenType);
	
	
	
	/**
	 * 获取全部消息模板
	 * @return
	 */
	java.util.Collection<MsgTemplate> getAllMsgTemplates();
	
	
	
	
	/**
	 * 获取消息模板
	 * @param strOpenAccessId 开放平台应用标识
	 * @param strTemplateType  模板类型
	 * @param strTemplateId  模板标识
	 * @return
	 */
	MsgTemplate getMsgTemplate(String strOpenAccessId, String strTemplateType, String strTemplateId);
	
	
	
	/**
	 * 通过开放用户获取系统用户
	 * @param openUser
	 * @return
	 */
	User getUserByOpenUser(OpenUser openUser);
	
	
	
	
	
	/**
	 * 获取传入机构用户的门户Mqtt标题
	 * @param employee
	 * @param strSystemId
	 * @return
	 */
	String getPortalMqttTopic(Employee employee, String strSystemId);
	
	
	
	/**
	 * 获取传入机构用户的门户MqttUrl
	 * @param employee
	 * @param strSystemId
	 * @return
	 */
	String getPortalMqttUrl(Employee employee, String strSystemId);
	
	
	
	/**
	 * 获取应用总线配置
	 * @param strSystemId
	 * @param strAppId
	 * @return
	 */
	AppHub getAppHub(String strSystemId, String strAppId);
	
//	/**
//	 * 获取核心数据源标记
//	 * @return
//	 */
//	String getDataSourceTag();

	/**
	 * 登记认证信息
	 * @param user
	 * @param strAgentName
	 */
	void logAuthInfo(User user, String strAgentName);
	
	
	
	/**
	 * 获取传入机构系统门户Mqtt标题
	 * @param strDCSystemId
	 * @param params
	 * @return
	 */
	String getPortalMqttTopic(String strDCSystemId, Collection<String> params);
	
	
	
	/**
	 * 保存OSS文件
	 * @param file
	 */
	void saveOSSFile(File file);
	
	
	
	/**
	 * 调用SaaS功能
	 * @param type
	 * @param id
	 * @param method
	 * @param params
	 * @return
	 */
	Object invokeSaaSFunc(String type, String id, String method, Map<String, Object> params);
}

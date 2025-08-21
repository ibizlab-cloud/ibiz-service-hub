package net.ibizsys.model.security;



/**
 * 系统用户角色模型对象接口
 *
 */
public interface IPSSysUserRole extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取代码标识
	 * @return
	 */
	java.lang.String getCodeName();
	
	
	/**
	 * 获取默认用户
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SysRoleDefaultUser}
	 * @return
	 */
	java.lang.String getDefaultUser();
	
	
	/**
	 * 获取实体数据集对象
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet();


	/**
	 * 获取实体数据集对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust();
	
	
	/**
	 * 获取实体对象
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
	
	
	/**
	 * 获取数据能力集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.security.IPSSysUserRoleData> getPSSysUserRoleDatas();
	
	/**
	 * 获取数据能力集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.security.IPSSysUserRoleData getPSSysUserRoleData(Object objKey, boolean bTryMode);
	
	/**
	 * 设置数据能力集合
	 * @param list 数据能力集合
	 */
	void setPSSysUserRoleData(java.util.List<net.ibizsys.model.security.IPSSysUserRoleData> list);
	
	
	/**
	 * 获取统一资源集合
	 * @return
	 */
	java.util.List<net.ibizsys.model.security.IPSSysUserRoleRes> getPSSysUserRoleReses();
	
	/**
	 * 获取统一资源集合的指定项
	 * @param objKey 项标识
	 * @param bTryMode 是否为尝试获取
	 * @return 返回指定项，尝试模式下不存在返回null，否则抛出异常
	 */
	net.ibizsys.model.security.IPSSysUserRoleRes getPSSysUserRoleRes(Object objKey, boolean bTryMode);
	
	/**
	 * 设置统一资源集合
	 * @param list 统一资源集合
	 */
	void setPSSysUserRoleRes(java.util.List<net.ibizsys.model.security.IPSSysUserRoleRes> list);
	
	
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
	 * 获取角色标记
	 * @return
	 */
	java.lang.String getRoleTag();
	
	
	/**
	 * 获取角色标记实体属性对象
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getRoleTagPSDEField();


	/**
	 * 获取角色标记实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getRoleTagPSDEFieldMust();
	
	
	/**
	 * 获取角色类型
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.SysUserRoleType}
	 * @return
	 */
	java.lang.String getRoleType();
	
	
	/**
	 * 获取用户标识实体属性对象
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getUserIdPSDEField();


	/**
	 * 获取用户标识实体属性对象，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.dataentity.defield.IPSDEField getUserIdPSDEFieldMust();
	
	
	/**
	 * 获取是否全局角色，非系统保留用户{@link #isSystemReserved}且显式定义
	 * @return
	 */
	boolean isGlobalRole();
	
	
	/**
	 * 获取是否系统保留，显式定义或默认用户{@link #getDefaultUser}为[USER,ADMIN]
	 * @return
	 */
	boolean isSystemReserved();
}
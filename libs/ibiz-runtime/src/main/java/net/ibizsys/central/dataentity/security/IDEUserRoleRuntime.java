package net.ibizsys.central.dataentity.security;

import java.util.List;

import net.ibizsys.central.dataentity.IDataEntityModelRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.model.dataentity.priv.IPSDEUserRole;
import net.ibizsys.model.dataentity.priv.IPSDEUserRoleOPPriv;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.IEntity;

public interface IDEUserRoleRuntime extends IDataEntityModelRuntime{

	/**
	 * 初始化
	 * @param iDataEntityRuntimeContext
	 * @param iPSDEUserRole
	 * @throws Exception
	 */
	void init(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEUserRole iPSDEUserRole) throws Exception;
	
	/**
	 * 获取实体角色
	 * @return
	 */
	IPSDEUserRole getPSDEUserRole();
	
	
	
	/**
	 * 判断是否包含指定数据访问标识
	 * @param strDataAccessAction
	 * @return
	 */
	boolean containsDataAccessAction(String strDataAccessAction);
	
	
	
	/**
	 * 判断传入用户是否对数据具备权限
	 * @param iUserContext
	 * @param strDataAccessAction
	 * @param iEntity
	 * @return
	 */
	Boolean test(IUserContext iUserContext, String strDataAccessAction, IEntity iEntity);
	
	
	
	/**
	 * 获取指定行为相关的用户角色操作标识
	 * @param strDataAccessAction
	 * @return
	 */
	List<IPSDEUserRoleOPPriv> getPSDEUserRoleOPPrivs(String strDataAccessAction);
	
	
	

	/**
	 * 自定义条件
	 * @return
	 */
	java.lang.String getCustomCond();
	
	
	/**
	 * 自定义数据范围模式
	 * @return
	 */
	java.lang.String getCustomDRMode();
	
	
	/**
	 * 自定义数据范围模式2
	 * @return
	 */
	java.lang.String getCustomDRMode2();
	
	
	/**
	 * 自定义数据范围2参数
	 * @return
	 */
	java.lang.String getCustomDRMode2Param();
	
	
	/**
	 * 自定义数据范围参数
	 * @return
	 */
	java.lang.String getCustomDRModeParam();
	
	
	/**
	 * 机构数据范围
	 * @return
	 */
	long getOrgDR();
	
	
//	/**
//	 * 实体数据集
//	 * @return
//	 */
//	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet();
//
//
//	/**
//	 * 实体数据集（必须存在）
//	 * @return
//	 */
//	net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust();
//	
//	
//	/**
//	 * 实体角色操作标识集合
//	 * @return
//	 */
//	java.util.List<net.ibizsys.model.dataentity.priv.IPSDEUserRoleOPPriv> getPSDEUserRoleOPPrivs();
//	
//	net.ibizsys.model.dataentity.priv.IPSDEUserRoleOPPriv getPSDEUserRoleOPPriv(Object objKey, boolean bTryMode);
//	
//	
//	/**
//	 * 用户数据范围对象
//	 * @return
//	 */
//	net.ibizsys.model.security.IPSSysUserDR getPSSysUserDR();
//
//
//	/**
//	 * 用户数据范围对象（必须存在）
//	 * @return
//	 */
//	net.ibizsys.model.security.IPSSysUserDR getPSSysUserDRMust();
//	
//	
//	/**
//	 * 用户数据范围对象2
//	 * @return
//	 */
//	net.ibizsys.model.security.IPSSysUserDR getPSSysUserDR2();
//
//
//	/**
//	 * 用户数据范围对象2（必须存在）
//	 * @return
//	 */
//	net.ibizsys.model.security.IPSSysUserDR getPSSysUserDR2Must();
	
	
	/**
	 * 角色标记
	 * @return
	 */
	java.lang.String getRoleTag();
	
	
	/**
	 * 部门业务条件
	 * @return
	 */
	java.lang.String getSecBC();
	
	
	/**
	 * 部门数据范围
	 * @return
	 */
	long getSecDR();
	
	
//	/**
//	 * 数据访问使用操作标识
//	 * @return
//	 */
//	java.lang.String getUserDRAction();
	
	
	/**
	 * 默认角色
	 * @return
	 */
	boolean isDefaultMode();
	
	
	/**
	 * 支持机构数据范围
	 * @return
	 */
	boolean isEnableOrgDR();
	
	
	/**
	 * 支持部门业务条线
	 * @return
	 */
	boolean isEnableSecBC();
	
	
	/**
	 * 支持部门数据范围
	 * @return
	 */
	boolean isEnableSecDR();
	
	
	/**
	 * 启用用户数据范围
	 * @return
	 */
	boolean isEnableUserDR();
	
	
	/**
	 * 系统保留
	 * @return
	 */
	boolean isSystemReserved();
	
}

package net.ibizsys.central.cloud.core.security;

import net.ibizsys.central.cloud.core.util.domain.AppData;
import net.ibizsys.runtime.util.Entity;

public interface ISystemAccessManager extends net.ibizsys.central.security.ISystemAccessManager {

	/**
	 * 获取当前用户应用数据环境
	 * @param strSystemTag
	 * @param strOrgId
	 * @return
	 */
	AppData getAppData(String strSystemTag, String strOrgId);
	
	
	/**
	 * 获取当前用户应用数据环境
	 * @param strDCSystemTag DC系统标记
	 * @return
	 */
	AppData getAppData(String strDCSystemTag);
	
	
	
	/**
	 * 填充插件系统的应用数据
	 * @param appData
	 * @param session 会话变量
	 */
	default void fillAddinAppData(AppData appData, Entity session) {
		
	}
	
	
	/**
	 * 判断用户是否具备指定角色
	 * @param iEmployeeContext
	 * @param strUserRoleTag 系统角色标记
	 * @return
	 * @throws Exception
	 */
	@Deprecated
	boolean testUserRole(IEmployeeContext iEmployeeContext, String strUserRoleTag) throws Exception;
	
	
	/**
	 * 判断用户是否具备指定角色
	 * @param iEmployeeContext
	 * @param strUserRoleTag 系统角色标记
	 * @return
	 * @throws Exception
	 */
	boolean testSysUserRole(IEmployeeContext iEmployeeContext, String strSysUserRoleTag) throws Exception;
	
	
	
	/**
	 * 判断用户是否具备指定实体角色
	 * @param iEmployeeContext
	 * @param strDEUserRoleTag 实体角色标记
	 * @return
	 * @throws Exception
	 */
	boolean testDEUserRole(IEmployeeContext iEmployeeContext, String strDEUserRoleTag) throws Exception;
	
	
	/**
	 * 获取当前系统机构上下文对象
	 * @param iEmployeeContext
	 * @param bSetCurrent 设置为当前
	 * @return
	 * @throws Exception
	 */
	IEmployeeContext getCurrentSystemEmployeeContext(IEmployeeContext iEmployeeContext, boolean bSetCurrent) throws Exception;
	
}

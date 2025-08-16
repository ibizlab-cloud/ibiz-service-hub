package net.ibizsys.central.security;

import java.util.List;

import net.ibizsys.central.ISystemModelRuntime;
import net.ibizsys.model.PSModelEnums.SysUserRoleType;
import net.ibizsys.model.dataentity.priv.IPSDEUserRole;
import net.ibizsys.model.security.IPSSysUserRole;
import net.ibizsys.runtime.ISystemRuntimeBaseContext;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.IEntity;

/**
 * 系统用户角色运行时对象
 * @author lionlau
 *
 */
public interface ISysUserRoleRuntime extends ISystemModelRuntime {

	/**
	 * 初始化系统用户角色运行时
	 * @param iSystemRuntimeContext
	 * @param iPSSysUserRole
	 * @throws Exception
	 */
	void init(ISystemRuntimeBaseContext iSystemRuntimeBaseContext, ISystemAccessManager iSystemAccessManager, IPSSysUserRole iPSSysUserRole) throws Exception;

	
	
	/**
	 * 获取系统用户角色模型对象
	 * @return
	 */
	IPSSysUserRole getPSSysUserRole();
	
	
	
	/**
	 * 判断是否具备系统统一资源
	 * @param iUserContext
	 * @param strUniResCode
	 * @return
	 */
	Boolean testSysUniRes(IUserContext iUserContext, String strUniResCode);

	
	/**
	 * 判断是否具备系统统一资源
	 * @param iUserContext
	 * @param strUniResCode
	 * @param iEntity 
	 * @return
	 */
	Boolean testSysUniRes(IUserContext iUserContext, String strUniResCode, IEntity iEntity);
	
	
	/**
	 * 获取系统访问控制管理对象
	 * @return
	 */
	ISystemAccessManager getSystemAccessManager();
	
	
	
	/**
	 * 获取指定实体的用户角色集合
	 * @param strDEId
	 * @return
	 */
	List<IPSDEUserRole> getPSDEUserRoles(String strDEId);
	
	
	/**
	 * 获取默认用户模式
	 * @return
	 */
	String getDefaultUser();
	

	/**
	 * 判断传入用户是否在角色中
	 * @param iUserContext
	 * @return
	 */
	boolean testUser(IUserContext iUserContext);
	
	
	
	/**
	 * 获取角色标记
	 * @return
	 */
	String getRoleTag();
	
	
	
	/**
	 * 是否支持判断用户在角色中
	 * @return
	 */
	boolean isEnableTestUser();
	
	
	
	/**
	 * 获取角色类型
	 * @return
	 */
	SysUserRoleType getRoleType();
}

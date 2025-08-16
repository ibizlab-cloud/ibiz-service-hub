package net.ibizsys.central.security;

import java.util.List;

import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.security.IDataEntityAccessManager;
import net.ibizsys.model.dataentity.priv.IPSSysDEOPPriv;
import net.ibizsys.runtime.ISystemRuntimeUtil;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.IEntity;

/**
 * 系统访问控制管理器对象接口
 * @author lionlau
 *
 */
public interface ISystemAccessManager extends ISystemRuntimeUtil{

	/**
	 * 初始化
	 * @param iSystemRuntimeContext
	 * @throws Exception
	 */
	void init(ISystemRuntimeContext iSystemRuntimeContext) throws Exception;

	
	
	/**
	 * 建立指定实体的访问控制对象
	 * @param iDataEntityRuntime
	 * @return
	 */
	IDataEntityAccessManager createDataEntityAccessManager(IDataEntityRuntime iDataEntityRuntime);
	
	
	
	
	/**
	 * 获取传入用户的系统角色集合
	 * @param iUserContext
	 * @return
	 */
	List<ISysUserRoleRuntime> getSysUserRoleRuntimes(IUserContext iUserContext);
	
	
	
	
	/**
	 * 判断用户是否具备统一资源标识
	 * @param iUserContext
	 * @param strSysUniRes
	 * @return
	 * @throws Exception
	 */
	boolean testSysUniRes(IUserContext iUserContext, String strSysUniRes) throws Exception;
	
	
	/**
	 * 判断用户是否具备统一资源标识
	 * @param iUserContext
	 * @param strSysUniRes
	 * @param iEntity
	 * @return
	 * @throws Exception
	 */
	boolean testSysUniRes(IUserContext iUserContext, String strSysUniRes, IEntity iEntity) throws Exception;
	
	
		
	/**
	 * 获取系统统一资源运行时
	 * @param strUniResCode
	 * @param bTryMode
	 * @return
	 */
	ISysUniResRuntime getSysUniResRuntime(String strUniResCode, boolean bTryMode);
	
	
	/**
	 * 获取用户默认用户角色集合
	 * @return
	 */
	List<ISysUserRoleRuntime> getUserSysUserRoleRuntimes();
	
	
	/**
	 * 获取管理员默认用户角色集合
	 * @return
	 */
	List<ISysUserRoleRuntime> getAdminSysUserRoleRuntimes();
	
	/**
	 * 获取动态判断用户角色集合
	 * @return
	 */
	List<ISysUserRoleRuntime> getTestSysUserRoleRuntimes();
	
	
	/**
	 * 获取系统角色
	 * @param strRoleTag
	 * @param bTryMode
	 * @return
	 */
	ISysUserRoleRuntime getSysUserRoleRuntime(String strRoleTag, boolean bTryMode);
	
	
	
	/**
	 * 获取系统全局操作标识
	 * @param strAccessAction
	 * @param bTryMode
	 * @return
	 */
	IPSSysDEOPPriv getPSSysDEOPPriv(String strAccessAction, boolean bTryMode);
}

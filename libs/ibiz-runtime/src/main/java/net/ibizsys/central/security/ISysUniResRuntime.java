package net.ibizsys.central.security;

import net.ibizsys.central.ISystemModelRuntime;
import net.ibizsys.model.security.IPSSysUniRes;
import net.ibizsys.runtime.ISystemRuntimeBaseContext;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.IEntity;

/**
 * 系统统一资源运行时对象
 * @author lionlau
 *
 */
public interface ISysUniResRuntime extends ISystemModelRuntime {

	/**
	 * 初始化系统统一资源运行时
	 * @param iSystemRuntimeContext
	 * @param iPSSysUniRes
	 * @throws Exception
	 */
	void init(ISystemRuntimeBaseContext iSystemRuntimeBaseContext, ISystemAccessManager iSystemAccessManager, IPSSysUniRes iPSSysUniRes) throws Exception;

	
	
	/**
	 * 获取系统统一资源模型对象
	 * @return
	 */
	IPSSysUniRes getPSSysUniRes();
	
	
	/**
	 * 进一步判断当前用户是否具备该资源标识
	 * @param iUserContext
	 * @param iEntity 
	 * @return
	 */
	boolean test(IUserContext iUserContext, IEntity iEntity);

	
	/**
	 * 获取系统访问控制管理对象
	 * @return
	 */
	ISystemAccessManager getSystemAccessManager();
	
	
	
	/**
	 * 资源标识
	 * @return
	 */
	java.lang.String getResCode();
}

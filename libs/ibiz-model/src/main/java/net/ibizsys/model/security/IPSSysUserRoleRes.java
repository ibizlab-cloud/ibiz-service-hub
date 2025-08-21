package net.ibizsys.model.security;



/**
 * 系统用户角色资源能力模型对象接口
 *
 */
public interface IPSSysUserRoleRes extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取系统统一资源
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUniRes getPSSysUniRes();


	/**
	 * 获取系统统一资源，不存在时抛出异常
	 * @return
	 */
	net.ibizsys.model.security.IPSSysUniRes getPSSysUniResMust();
	
	
	/**
	 * 获取系统统一资源代码，来自{@link #getPSSysUniRes}.{@link net.ibizsys.model.security.IPSSysUniRes#getResCode}
	 * @return
	 */
	java.lang.String getSysUniResCode();
}
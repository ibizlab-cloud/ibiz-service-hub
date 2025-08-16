package net.ibizsys.central.cloud.core.cloudutil;


import net.ibizsys.central.cloud.core.security.IAuthenticationUser;

/**
 * 系统认证功能运行时对象
 * @author lionlau
 *
 */
public interface ICloudAuthUtilRuntime extends ICloudUtilRuntime{

	/**
	 * 认证代理插件前缀
	 */
	public final static String ADDIN_AUTHAGENT_PREFIX = "AUTHAGENT:";


	/**
	 * 认证代理：默认
	 */
	public final static String AUTHAGENT_DEFAULT = "DEFAULT";


	/**
	 * 认证代理：CAS
	 */
	public final static String AUTHAGENT_CAS = "CAS";


	/**
	 * 认证代理：Ldap
	 */
	public final static String AUTHAGENT_LDAP = "LDAP";


	/**
	 * 认证代理：HTTP
	 */
	public final static String AUTHAGENT_HTTP = "HTTP";

	/**
	 * 通过用户名加载认证用户信息 
	 * @param username
	 * @return
	 */
	IAuthenticationUser getUserByName(String username);
    
    /**
	 * 通过用户名加载认证用户信息
	 * @param srfsystem
	 * @param srforgid 
	 * @param username
	 * @return
	 */
	IAuthenticationUser getUserByName(String srfsystem, String srforgid, String username);
    
    
    /**
     * 通过用户名及密码加载认证用户信息
     * @param username
     * @param password
     * @return
     */
	IAuthenticationUser getUserByLogin(String username, String password);
    
    /**
     * 通过用户名及密码加载认证用户信息
     * @param srfsystem
	 * @param srforgid 
     * @param username
     * @param password
     * @return
     */
	IAuthenticationUser getUserByLogin(String srfsystem, String srforgid, String username, String password);
    
    
//
//    void resetByUsername(String username);
//
//    void resetByUsername(String srfsystem,String srforgid, String username);
//    

    /**
     * 通过UKey加载认证用户信息
     * @param srfsystem
     * @param srforgid
     * @param ukey
     * @return
     */
	IAuthenticationUser getUserByUKey(String srfsystem, String srforgid, String ukey);
    
    
    /**
     * 变更认证用户登录密码
     * @param iAuthenticationUser
     * @param oldpassword
     * @param newpassword
     * 
     */
    void changePassword(IAuthenticationUser iAuthenticationUser, String oldpassword, String newpassword);
 //   AuthenticationUser loadUserByUKey(String username);
}

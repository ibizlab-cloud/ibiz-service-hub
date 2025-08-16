package net.ibizsys.central.cloud.uaa.core.addin;

import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.cloud.uaa.core.cloudutil.ICloudAuthUtilRuntimeContext;

/**
 * 认证代理插件接口
 * @author lionlau
 *
 */
public interface IAuthAgent extends ICloudAuthUtilRTAddin{

	/**
	 * 初始化
	 * @param ctx
	 * @param strAgentId
	 * @param strConfig
	 * @throws Exception
	 */
	void init(ICloudAuthUtilRuntimeContext ctx, String strAgentId, String strConfig) throws Exception;
	
	/**
	 * 获取代理标识
	 * @return
	 */
	String getAgentId();
	
	
	/**
	 * 通过用户名加载认证用户信息 
	 * @param username
	 * @param bTryMode 尝试模式
	 * @return
	 */
	IAuthenticationUser getUserByName(String username, boolean bTryMode);
    
    /**
	 * 通过用户名加载认证用户信息
	 * @param srfsystem
	 * @param srforgid 
	 * @param username
	 * @return
	 */
	IAuthenticationUser getUserByName(String srfsystem,String srforgid, String username, boolean bTryMode);
    
    
    /**
     * 通过用户名及密码加载认证用户信息
     * @param username
     * @param password
     * @param bTryMode 尝试模式
     * @return
     */
	IAuthenticationUser getUserByLogin(String username,String password, boolean bTryMode);
    
    /**
     * 通过用户名及密码加载认证用户信息
     * @param srfsystem
	 * @param srforgid 
     * @param username
     * @param password
     * @param bTryMode 尝试模式
     * @return
     */
	IAuthenticationUser getUserByLogin(String srfsystem, String srforgid, String username,String password, boolean bTryMode);
    
    
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
     * @param bTryMode 尝试模式
     * @return
     */
	IAuthenticationUser getUserByUKey(String srfsystem,String srforgid, String ukey, boolean bTryMode);
    
    
    /**
     * 变更用户登录密码
     * @param iAuthenticationUser
     * @param oldpassword
     * @param newpassword
     * @param bTryMode 尝试模式
     */
    boolean changePassword(IAuthenticationUser iAuthenticationUser, String oldpassword, String newpassword, boolean bTryMode);
    
    
}

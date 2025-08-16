package net.ibizsys.central.cloud.core.security;

import org.springframework.security.core.userdetails.UserDetails;

/**
 * 全局认证用户对象接口
 * @author lionlau
 *
 */
public interface IAuthenticationUser extends UserDetails{

	/**
	 * 获取当前用户标识
	 * @return
	 */
	String getUserid();
	
	
	/**
	 * 获取当前用户名称
	 * @return
	 */
	String getUsername();
	
	/**
	 * 获取用户标识
	 * @return
	 */
	String getPersonid();

	/**
	 * 获取用户名称
	 * @return
	 */
	String getPersonname();
	
	
	/**
	 * 获取状态
	 * @return
	 */
	String getState();
	
	
	
	/**
	 * 是否为超级用户
	 * @return
	 */
	int getSuperuser();
	
	
	
	/**
	 * 是否为系统接口用户
	 * @return
	 */
	int getApiuser();
	
	
	
	/**
	 * 是否为开发者
	 * @return
	 */
	int getDevuser();
	
	
	/**
	 * 是否为匿名用户
	 * @return
	 */
	int getAnonymoususer();
	
	
	/**
	 * 获取登录标识
	 * @return
	 */
	String getLoginname();
	
	/**
	 * 获取认证标识
	 * @return
	 */
	String getToken();
	
	
	/**
	 * 获取刷新认证标识
	 * @return
	 */
	String getRefreshtoken();

	
	/**
	 * 获取电子邮件地址
	 * @return
	 */
	String getEmail();
	
	
	/**
	 * 获取授权范围
	 * @return
	 */
	String getScope();
	
	/**
	 * 获取过期间隔秒数
	 * @return
	 */
	int getExpirein();
	
	/**
	 * 获取机构用户上下文
	 * @return
	 */
	IEmployeeContext getEmployeeContext();
	

	
	/**
	 * 身份为接口用户
	 * @return
	 */
	//boolean isApiuser();
	
//	/**
//	 * 获取是否为超级用户
//	 * @return
//	 */
//	int getSuperuser();
//	
//
//	/**
//	 * 获取部门标识
//	 * @return
//	 */
//	String getMdeptid();
//	
//
//	/**
//	 * 获取部门代码
//	 * @return
//	 */
//	String getMdeptcode();
//
//	/**
//	 * 获取部门名称
//	 * @return
//	 */
//	String getMdeptname();

	

}

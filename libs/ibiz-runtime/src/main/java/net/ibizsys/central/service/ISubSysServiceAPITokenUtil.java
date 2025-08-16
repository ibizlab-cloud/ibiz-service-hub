package net.ibizsys.central.service;

/**
 * 外部系统服务接口认证辅助对象
 * @author lionlau
 *
 */
public interface ISubSysServiceAPITokenUtil {

	/**
	 * 获取用户名称
	 * @return
	 */
	String getUserName();
	
	
	/**
	 * 获取用户密码
	 * @return
	 */
	String getPassword();
	

	
	/**
	 * 获取登录路径
	 * @return
	 */
	String getLoginUrl();
	
	
	/**
	 * 获取登录Token
	 * @return
	 */
	String getToken() throws Throwable;
	
	
	
	
	/**
	 * 获取最后登录时间
	 * @return
	 */
	long getLastLoginTime();
}

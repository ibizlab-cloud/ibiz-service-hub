package net.ibizsys.central.service;

/**
 * 外部服务运行时对象基础接口
 * @author lionlau
 *
 */
public interface ISubSysServiceAPIRuntimeBase {

	public final static String PARAM_SERVICEURL = "serviceurl";
	
	public final static String PARAM_SERVICEPARAM = "serviceparam";
	
	public final static String PARAM_SERVICEPARAM2 = "serviceparam2";
	
	public final static String PARAM_CLIENTID = "clientid";
	
	public final static String PARAM_CLIENTSECRET = "clientsecret";
	
	public final static String PARAM_AUTHMODE = "authmode";
	
	public final static String PARAM_AUTHPARAM = "authparam";
	
	public final static String PARAM_AUTHPARAM2 = "authparam2";
	
	/**
	 * 服务路径：未定义
	 */
	public final static String SERVICEURL_UNDEFINED = "UNDEFINED";
	
	/**
	 * 获取服务基础路径
	 * @return
	 */
	String getServiceUrl();
	
	
	/**
	 * 服务参数
	 * @return
	 */
	String getServiceParam();
	
	
	/**
	 * 服务参数2
	 * @return
	 */
	String getServiceParam2();
	
	
	/**
	 * 认证客户端标识
	 * @return
	 */
	String getClientId();
	
	
	/**
	 * 认证客户端密码
	 * @return
	 */
	String getClientSecret();
	
	
	/**
	 * 认证模式
	 * @return
	 */
	String getAuthMode();
	
	
	/**
	 * 认证参数
	 * @return
	 */
	String getAuthParam();
	
	
	/**
	 * 认证参数2
	 * @return
	 */
	String getAuthParam2();
}

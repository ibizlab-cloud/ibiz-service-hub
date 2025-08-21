package net.ibizsys.model.service;



/**
 * 外部服务接口基础对象接口
 *
 */
public interface IPSSubSysServiceAPIBase extends net.ibizsys.model.IPSModelObject{

	
	
	/**
	 * 获取认证token路径
	 * @return
	 */
	java.lang.String getAuthAccessTokenUrl();
	
	
	/**
	 * 获取认证客户端标识
	 * @return
	 */
	java.lang.String getAuthClientId();
	
	
	/**
	 * 获取认证客户端密码
	 * @return
	 */
	java.lang.String getAuthClientSecret();
	
	
	/**
	 * 获取认证模式
	 * <P>
	 * 返回值参考 {@link net.ibizsys.model.PSModelEnums.APIAuthMode}
	 * @return
	 */
	java.lang.String getAuthMode();
	
	
	/**
	 * 获取认证参数
	 * @return
	 */
	java.lang.String getAuthParam();
	
	
	/**
	 * 获取认证参数2
	 * @return
	 */
	java.lang.String getAuthParam2();
	
	
	/**
	 * 获取认证超时时长
	 * @return
	 */
	int getAuthTimeout();
	
	
	/**
	 * 获取服务参数
	 * @return
	 */
	java.lang.String getServiceParam();
	
	
	/**
	 * 获取服务参数2
	 * @return
	 */
	java.lang.String getServiceParam2();
	
	
	/**
	 * 获取服务路径
	 * @return
	 */
	java.lang.String getServicePath();
}
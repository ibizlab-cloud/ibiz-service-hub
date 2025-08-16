package net.ibizsys.central.cloud.core.sysutil;

import net.ibizsys.central.service.ISubSysServiceAPIRuntime;
import net.ibizsys.central.service.client.IWebClient;

/**
 * 系统云体系客户端功能组件
 * @author lionlau
 *
 */
public interface ISysCloudClientUtilRuntime extends ISysUtilRuntime{

	public final static String CLOUDCLIENTUTIL_CONFIGFOLDER = "cloudclientutil";
	
	/**
	 * 获取外部服务接口运行时对象
	 * @return
	 */
	ISubSysServiceAPIRuntime getSubSysServiceAPIRuntime();
	
	
	/**
	 * 获取直接的客户端对象（不附加认证的头部信息）
	 * @return
	 */
	IWebClient getRawServiceClient(String strServiceType);
	
	
	
	/**
	 * 获取代理的客户端对象
	 * @param strServiceType 获取指定服务客户端
	 * @return
	 */
	IWebClient getServiceClient(String strServiceType);
	
	
	
	/**
	 * 获取代理的客户端对象
	 * @param strServiceType 获取指定服务客户端
	 * @param 客户端接口对象
	 * @return
	 */
	<T> T getServiceClient(String strServiceType, Class<?> cls);
	
	
	
	
	/**
	 * 获取代理的客户端对象
	 * @param strServiceType 获取指定服务客户端
	 * @param 客户端接口对象
	 * @param 仅API用户
	 * @return
	 */
	<T> T getServiceClient(String strServiceType, Class<?> cls, boolean bAPIUserOnly);
	
	
//	
//	/**
//	 * 获取当前用户的应用数据对象
//	 * @param strSystemId
//	 * @param strOrgId 组织标识
//	 * @param iAuthenticationUser 认证用户
//	 * @return
//	 */
//	AppData getAppData(String strSystemId, String strOrgId, IAuthenticationUser iAuthenticationUser);
}

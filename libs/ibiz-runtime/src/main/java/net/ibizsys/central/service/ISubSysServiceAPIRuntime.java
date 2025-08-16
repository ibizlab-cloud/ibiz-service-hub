package net.ibizsys.central.service;

import java.util.Map;

import net.ibizsys.central.ISystemModelRuntime;
import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.central.sysutil.IObjectStorageServiceAdapter;
import net.ibizsys.model.service.IPSSubSysServiceAPI;
import net.ibizsys.runtime.IModelRuntimeShutdownable;

/**
 * 外部服务接口运行时
 * @author lionlau
 *
 */
public interface ISubSysServiceAPIRuntime extends ISystemModelRuntime, ISubSysServiceAPIRuntimeBase, IModelRuntimeShutdownable {

	
	/**
	 * 功能对象
	 */
	final static String UTILDE = "UTIL";
	
	
	/**
	 * 功能方法：上传文件
	 */
	final static String UTILMETHOD_UPLOADFILE = "UPLOADFILE";
	
	
	/**
	 * 功能方法：下载文件
	 */
	final static String UTILMETHOD_DOWNLOADFILE = "DOWNLOADFILE";
	
	/**
	 * 功能实体：常规MAP对象
	 */
	public final static String COMMONMAPDE = "COMMONMAP";
	
	/**
	 * 功能实体：常规Entity对象
	 */
	public final static String COMMONENTITYDE = "COMMONENTITY";

	
	/**
	 * 初始化外部服务接口运行时
	 * @param iSystemRuntimeContext
	 * @param iPSSubSysServiceAPI
	 * @throws Exception
	 */
	void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSubSysServiceAPI iPSSubSysServiceAPI) throws Exception;

	
	/**
	 * 获取外部服务接口模型
	 * @return
	 */
	IPSSubSysServiceAPI getPSSubSysServiceAPI();
	

	/**
	 * 获取服务类型
	 * @return
	 */
	String getServiceType();
	
	
	
	/**
	 * 获取服务参数3
	 * @return
	 */
	String getServiceParam3();
	
	
	/**
	 * 获取服务参数4
	 * @return
	 */
	String getServiceParam4();
	
	
	/**
	 * 获取全局请求头内容
	 * @return
	 */
	Map<String, ?> getHeaders();
	
	
	/**
	 * 获取全局请求头内容
	 * @param bAuthMode 是否为认证请求
	 * @return
	 */
	Map<String, ?> getHeaders(boolean bAuthMode);
	
	/**
	 * 设置全局请求头内容
	 * @param headers
	 */
	void setHeaders(Map<String, ?> headers);
	
	/**
	 * 获取Web客户端对象
	 * @return
	 */
	IWebClient getWebClient();
	
	/**
	 * 获取服务客户端
	 * @param cls
	 * @return
	 */
	<T> T getServiceClient(Class<?> cls);


	/**
	 * 获取实体服务接口运行时对象
	 * @param strTag
	 * @param bTryMode
	 * @return
	 * @throws Exception
	 */
	ISubSysServiceAPIDERuntime getSubSysServiceAPIDERuntime(String strTag, boolean bTryMode);
	
	
	
	/**
	 * 调用实体方法
	 * @param strDataEntityName
	 * @param strMethodName
	 * @param 调用上下文
	 * @param objBody
	 * @param objKey
	 * @param objTag
	 * @return
	 * @throws Exception
	 */
	Object invokeDEMethod(String strDataEntityName, String strMethodName, Map<String, Object> context, Object objBody, Map<String, Object> params, Object objTag) throws Throwable;
	
	
	
	
	/**
	 * 认证token路径
	 * @return
	 */
	java.lang.String getAccessTokenUrl();
	
	
	
	/**
	 * 认证参数3
	 * @return
	 */
	java.lang.String getAuthParam3();
	
	
	/**
	 * 认证参数4
	 * @return
	 */
	java.lang.String getAuthParam4();
	
	
	/**
	 * 获取认证超时时间（未来的时间，毫秒）
	 * @return
	 */
	long getTokenTimeout();
	
	
	/**
	 * 设置认证超时时间（未来的时间，毫秒）
	 * @param nTokenTimeout
	 */
	void setTokenTimeout(long nTokenTimeout);
	
	
	/**
	 * 请求认证（异步）
	 */
	void requestToken();
	
	/**
	 * 请求认证
	 * @param bImmediately 立即请求
	 */
	void requestToken(boolean bImmediately);
	
	
	/**
	 * 请求认证（如果当前未认证）
	 * @param bImmediately 立即请求
	 */
	void requestTokenIf(boolean bImmediately);
	
	
	/**
	 * Token未来过期时间
	 * @param nSeconds
	 */
	void tokenExpireIn(int nSeconds);
	
	/**
	 * 获取外部服务接口运行时脚本上下文对象
	 * @return
	 */
	ISubSysServiceAPIRTScriptContext getSubSysServiceAPIRTScriptContext();
	
	
	
	
	/**
	 * 获取对象存储适配器
	 * @return
	 */
	IObjectStorageServiceAdapter getObjectStorageServiceAdapter();
	
	
	/**
	 * 外部服务接口运行时是否启用
	 * @return
	 */
	default boolean isEnabled() {
		return true;
	}
	
	/**
	 * 开始客户端
	 */
	void start() throws Exception;
	
	/**
	 * 停止客户端
	 */
	void stop() throws Exception;
}

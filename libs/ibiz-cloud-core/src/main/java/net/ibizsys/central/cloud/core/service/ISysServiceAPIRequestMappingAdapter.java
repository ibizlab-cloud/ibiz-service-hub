package net.ibizsys.central.cloud.core.service;

import java.lang.reflect.Method;
import java.util.Map;

import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import net.ibizsys.central.ISystemGatewayContext;
import net.ibizsys.central.cloud.core.app.IServiceAppRuntime;
import net.ibizsys.central.service.ISysServiceAPIRuntime;

public interface ISysServiceAPIRequestMappingAdapter {

	/**
	 * 初始化 
	 * @param iSystemGatewayContext
	 * @param requestMappingHandlerMapping
	 * @param iSysServiceAPIDocAdapter
	 * @throws Exception
	 */
	void init(ISystemGatewayContext iSystemGatewayContext, RequestMappingHandlerMapping requestMappingHandlerMapping, ISysServiceAPIDocAdapter iSysServiceAPIDocAdapter) throws Exception;
	
	/**
	 * 登记映射
	 * @param iSysServiceAPIRuntime
	 * @throws Exception
	 */
	void registerMapping(ISysServiceAPIRuntime iSysServiceAPIRuntime) throws Exception;
	
	
	/**
	 * 注销登记映射
	 * @param iSysServiceAPIRuntime
	 * @throws Exception
	 */
	void unregisterMapping(ISysServiceAPIRuntime iSysServiceAPIRuntime);
	

	
	/**
	 * 登记映射
	 * @param iServiceAppRuntime
	 * @throws Exception
	 */
	void registerMapping(IServiceAppRuntime iServiceAppRuntime) throws Exception;
	
	
	/**
	 * 注销登记映射
	 * @param iServiceAppRuntime
	 * @throws Exception
	 */
	void unregisterMapping(IServiceAppRuntime iServiceAppRuntime);
	

	/**
	 * 获取系统服务接口文档设配器
	 * @return
	 */
	ISysServiceAPIDocAdapter getSysServiceAPIDocAdapter();
	
	
	
	/**
	 * 获取请求映射处理器映射
	 * @return
	 */
	RequestMappingHandlerMapping getRequestMappingHandlerMapping();
	
	
	/**
	 * 直接注册映射处理
	 * @param iSysServiceAPIRuntime
	 * @param handler
	 * @param method
	 */
	RequestMappingInfo registerMapping(ISysServiceAPIRuntime iSysServiceAPIRuntime, Object handler, Method method);
		
	
	
	/**
	 * 注册服务接口请求映射
	 * @param iSysServiceAPIRuntime
	 * @param mapping
	 * @param handler
	 * @param method
	 */
	void registerMapping(ISysServiceAPIRuntime iSysServiceAPIRuntime, RequestMappingInfo mapping, Object handler, Method method);
	
	
	/**
	 * 注册前端应用请求映射
	 * @param iServiceAppRuntime
	 * @param mapping
	 * @param handler
	 * @param method
	 */
	void registerMapping(IServiceAppRuntime iServiceAppRuntime, RequestMappingInfo mapping, Object handler, Method method);
	
	
//	void unregisterMapping(ISysServiceAPIRuntime iSysServiceAPIRuntime, RequestMappingInfo mapping);
//	
//	
//	void unregisterMapping(IApplicationRuntime iApplicationRuntime, RequestMappingInfo mapping);
	
	/**
	 * 直接注册映射处理
	 * @param iSysServiceAPIRuntime
	 * @param uris
	 * @param methods
	 * @param handler
	 * @param method
	 */
	//RequestMappingInfo registerMapping(ISysServiceAPIRuntime iSysServiceAPIRuntime, String[] uris, RequestMethod[] methods, Object handler, Method method);
	
	
	/**
	 * 直接注册映射处理
	 * @param iSysServiceAPIRuntime
	 * @param mapping
	 * @param handler
	 * @param method
	 */
	//void registerMapping(ISysServiceAPIRuntime iSysServiceAPIRuntime, RequestMappingInfo mapping, Object handler, Method method);
	
	

	/**
	 * 获取传入路径的完整应用上下文
	 * @param iSysServiceAPIRuntime
	 * @param strUrl
	 * @param strLastParentDEName
	 * @return
	 */
	Map<String, String> getAppContext(ISysServiceAPIRuntime iSysServiceAPIRuntime, String strUrl, String strLastParentDEName) throws Exception;
}

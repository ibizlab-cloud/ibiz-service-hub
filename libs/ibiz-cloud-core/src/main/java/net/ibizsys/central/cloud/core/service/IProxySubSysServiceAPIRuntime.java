package net.ibizsys.central.cloud.core.service;

import net.ibizsys.central.service.ISubSysServiceAPIRuntime;

public interface IProxySubSysServiceAPIRuntime extends ISubSysServiceAPIRuntime{

	/**
	 * 获取基础服务路径
	 * @return
	 */
	String getBaseUrl();
	
	
	
	/**
	 * 注册服务接口映射
	 * @param iSysServiceAPIRequestMappingAdapter
	 * @throws Exception
	 */
	void registerMapping(ISysServiceAPIRequestMappingAdapter iSysServiceAPIRequestMappingAdapter) throws Exception;
	
	
	
	/**
	 * 注销服务接口映射
	 * @param iSysServiceAPIRequestMappingAdapter
	 * @throws Exception
	 */
	void unregisterMapping(ISysServiceAPIRequestMappingAdapter iSysServiceAPIRequestMappingAdapter) throws Exception;
	
}

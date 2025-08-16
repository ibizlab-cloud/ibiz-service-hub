package net.ibizsys.central.cloud.core.app;

import net.ibizsys.central.app.IApplicationRuntime;
import net.ibizsys.central.cloud.core.service.ISysServiceAPIRequestMappingAdapter;

/**
 * 服务应用对象运行时接口
 * @author lionlau
 *
 */
public interface IServiceAppRuntime extends IApplicationRuntime {

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

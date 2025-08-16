package net.ibizsys.central.cloud.log.core.addin;

import net.ibizsys.central.cloud.log.core.cloudutil.ICloudLogUtilRuntimeContext;
import net.ibizsys.runtime.plugin.IModelRTAddin;

/**
 * 云体系日志功能插件对象接口
 * @author lionlau
 *
 */
public interface ICloudLogUtilRTAddin extends IModelRTAddin{

	/**
	 * 初始化
	 * @param ctx
	 * @param addinData
	 * @throws Exception
	 */
	void init(ICloudLogUtilRuntimeContext ctx, Object addinData) throws Exception;

	
	
	

}

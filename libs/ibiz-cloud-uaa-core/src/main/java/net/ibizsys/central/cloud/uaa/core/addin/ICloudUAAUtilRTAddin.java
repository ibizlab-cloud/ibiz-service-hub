package net.ibizsys.central.cloud.uaa.core.addin;

import net.ibizsys.central.cloud.uaa.core.cloudutil.ICloudUAAUtilRuntimeContext;
import net.ibizsys.runtime.plugin.IModelRTAddin;

/**
 * 云体系UAA功能插件对象接口
 * @author lionlau
 *
 */
public interface ICloudUAAUtilRTAddin extends IModelRTAddin{

	/**
	 * 初始化
	 * @param ctx
	 * @param addinData
	 * @throws Exception
	 */
	void init(ICloudUAAUtilRuntimeContext ctx, Object addinData) throws Exception;

	

}

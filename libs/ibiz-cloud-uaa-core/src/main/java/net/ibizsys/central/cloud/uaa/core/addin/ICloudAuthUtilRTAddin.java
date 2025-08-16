package net.ibizsys.central.cloud.uaa.core.addin;

import net.ibizsys.central.cloud.uaa.core.cloudutil.ICloudAuthUtilRuntimeContext;
import net.ibizsys.runtime.plugin.IModelRTAddin;

/**
 * 云体系Auth功能插件对象接口
 * @author lionlau
 *
 */
public interface ICloudAuthUtilRTAddin extends IModelRTAddin{

	/**
	 * 初始化
	 * @param ctx
	 * @param addinData
	 * @throws Exception
	 */
	void init(ICloudAuthUtilRuntimeContext ctx, Object addinData) throws Exception;

	

}

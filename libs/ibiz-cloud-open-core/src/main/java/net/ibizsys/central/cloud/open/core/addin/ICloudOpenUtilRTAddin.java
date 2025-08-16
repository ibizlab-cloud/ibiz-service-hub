package net.ibizsys.central.cloud.open.core.addin;

import net.ibizsys.central.cloud.open.core.cloudutil.ICloudOpenUtilRuntimeContext;
import net.ibizsys.runtime.plugin.IModelRTAddin;

/**
 * 云体系开放平台功能插件对象接口
 * @author lionlau
 *
 */
public interface ICloudOpenUtilRTAddin extends IModelRTAddin{

	/**
	 * 初始化
	 * @param ctx
	 * @param addinData
	 * @throws Exception
	 */
	void init(ICloudOpenUtilRuntimeContext ctx, Object addinData) throws Exception;

	

}

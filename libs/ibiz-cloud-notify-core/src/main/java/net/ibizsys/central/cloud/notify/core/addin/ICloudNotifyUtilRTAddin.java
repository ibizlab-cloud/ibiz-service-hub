package net.ibizsys.central.cloud.notify.core.addin;

import net.ibizsys.central.cloud.notify.core.cloudutil.ICloudNotifyUtilRuntimeContext;
import net.ibizsys.runtime.plugin.IModelRTAddin;

/**
 * 云体系通知功能插件对象接口
 * @author lionlau
 *
 */
public interface ICloudNotifyUtilRTAddin extends IModelRTAddin{

	/**
	 * 初始化
	 * @param ctx
	 * @param addinData
	 * @throws Exception
	 */
	void init(ICloudNotifyUtilRuntimeContext ctx, Object addinData) throws Exception;

	

}

package net.ibizsys.central.cloud.ai.core.addin;

import net.ibizsys.central.cloud.ai.core.cloudutil.ICloudAIUtilRuntimeContext;
import net.ibizsys.runtime.plugin.IModelRTAddin;

/**
 * 云体系AI功能插件对象接口
 * @author lionlau
 *
 */
public interface ICloudAIUtilRTAddin extends IModelRTAddin{

	/**
	 * 初始化
	 * @param ctx
	 * @param addinData
	 * @throws Exception
	 */
	void init(ICloudAIUtilRuntimeContext ctx, Object addinData) throws Exception;

	

}

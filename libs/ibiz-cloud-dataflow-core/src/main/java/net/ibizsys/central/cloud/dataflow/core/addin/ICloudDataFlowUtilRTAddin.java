package net.ibizsys.central.cloud.dataflow.core.addin;

import net.ibizsys.central.cloud.dataflow.core.cloudutil.ICloudDataFlowUtilRuntimeContext;
import net.ibizsys.runtime.plugin.IModelRTAddin;

/**
 * 云体系数据流功能插件对象接口
 * @author lionlau
 *
 */
public interface ICloudDataFlowUtilRTAddin extends IModelRTAddin{

	/**
	 * 初始化
	 * @param ctx
	 * @param addinData
	 * @throws Exception
	 */
	void init(ICloudDataFlowUtilRuntimeContext ctx, Object addinData) throws Exception;

	

}

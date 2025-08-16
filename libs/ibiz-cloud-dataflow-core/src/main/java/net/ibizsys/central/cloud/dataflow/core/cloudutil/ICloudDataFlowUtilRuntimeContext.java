package net.ibizsys.central.cloud.dataflow.core.cloudutil;

import net.ibizsys.central.cloud.core.cloudutil.ICloudDataFlowUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;

public interface ICloudDataFlowUtilRuntimeContext extends ICloudUtilRuntimeContext{

	
	@Override
	ICloudDataFlowUtilRuntime getModelRuntime();
	
	
	
	
	/**
	 * 获取云体系数据流功能对象（旧版本）
	 * @return
	 */
	default ICloudDataFlowUtilRuntime getCloudDataFlowUtilRuntime() {
		return this.getModelRuntime();
	}
}

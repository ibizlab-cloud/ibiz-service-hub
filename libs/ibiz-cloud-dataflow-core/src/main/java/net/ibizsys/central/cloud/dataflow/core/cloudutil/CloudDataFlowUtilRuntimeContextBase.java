package net.ibizsys.central.cloud.dataflow.core.cloudutil;

import net.ibizsys.central.cloud.core.cloudutil.CloudUtilRuntimeContextProxy;
import net.ibizsys.central.cloud.core.cloudutil.ICloudDataFlowUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;

public abstract class CloudDataFlowUtilRuntimeContextBase <M extends ICloudDataFlowUtilRuntime, C extends ICloudUtilRuntimeContext> extends CloudUtilRuntimeContextProxy<M, C> implements ICloudDataFlowUtilRuntimeContext {

	public CloudDataFlowUtilRuntimeContextBase(C superContext) {
		super(superContext);
	}
	
	
	@Override
	public ICloudDataFlowUtilRuntime getCloudDataFlowUtilRuntime() {
		return this.getModelRuntime();
	}
}

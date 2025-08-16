package net.ibizsys.central.cloud.uaa.core.cloudutil;

import net.ibizsys.central.cloud.core.cloudutil.CloudUtilRuntimeContextProxy;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUAAUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;

public abstract class CloudUAAUtilRuntimeContextBase <M extends ICloudUAAUtilRuntime, C extends ICloudUtilRuntimeContext> extends CloudUtilRuntimeContextProxy<M, C> implements ICloudUAAUtilRuntimeContext {

	public CloudUAAUtilRuntimeContextBase(C superContext) {
		super(superContext);
	}
	
	
	@Override
	public ICloudUAAUtilRuntime getCloudUAAUtilRuntime() {
		return this.getModelRuntime();
	}
}

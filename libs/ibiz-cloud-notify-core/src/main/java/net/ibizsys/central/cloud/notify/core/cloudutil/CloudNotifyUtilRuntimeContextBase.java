package net.ibizsys.central.cloud.notify.core.cloudutil;

import net.ibizsys.central.cloud.core.cloudutil.CloudUtilRuntimeContextProxy;
import net.ibizsys.central.cloud.core.cloudutil.ICloudNotifyUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;

public abstract class CloudNotifyUtilRuntimeContextBase <M extends ICloudNotifyUtilRuntime, C extends ICloudUtilRuntimeContext> extends CloudUtilRuntimeContextProxy<M, C> implements ICloudNotifyUtilRuntimeContext {

	public CloudNotifyUtilRuntimeContextBase(C superContext) {
		super(superContext);
	}
	
	
	@Override
	public ICloudNotifyUtilRuntime getCloudNotifyUtilRuntime() {
		return this.getModelRuntime();
	}
}

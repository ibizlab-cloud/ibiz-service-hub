package net.ibizsys.central.cloud.open.core.cloudutil;

import net.ibizsys.central.cloud.core.cloudutil.CloudUtilRuntimeContextProxy;
import net.ibizsys.central.cloud.core.cloudutil.ICloudOpenUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;

public abstract class CloudOpenUtilRuntimeContextBase <M extends ICloudOpenUtilRuntime, C extends ICloudUtilRuntimeContext> extends CloudUtilRuntimeContextProxy<M, C> implements ICloudOpenUtilRuntimeContext {

	public CloudOpenUtilRuntimeContextBase(C superContext) {
		super(superContext);
	}
	
	
	@Override
	public ICloudOpenUtilRuntime getCloudOpenUtilRuntime() {
		return this.getModelRuntime();
	}
}

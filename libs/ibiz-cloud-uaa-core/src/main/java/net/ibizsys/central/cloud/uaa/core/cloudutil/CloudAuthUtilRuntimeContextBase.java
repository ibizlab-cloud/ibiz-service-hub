package net.ibizsys.central.cloud.uaa.core.cloudutil;

import net.ibizsys.central.cloud.core.cloudutil.CloudUtilRuntimeContextProxy;
import net.ibizsys.central.cloud.core.cloudutil.ICloudAuthUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;

public abstract class CloudAuthUtilRuntimeContextBase <M extends ICloudAuthUtilRuntime, C extends ICloudUtilRuntimeContext> extends CloudUtilRuntimeContextProxy<M, C> implements ICloudAuthUtilRuntimeContext {

	public CloudAuthUtilRuntimeContextBase(C superContext) {
		super(superContext);
	}
	
	
	@Override
	public ICloudAuthUtilRuntime getCloudAuthUtilRuntime() {
		return this.getModelRuntime();
	}
}

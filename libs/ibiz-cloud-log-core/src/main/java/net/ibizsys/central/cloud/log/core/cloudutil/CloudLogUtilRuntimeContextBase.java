package net.ibizsys.central.cloud.log.core.cloudutil;

import net.ibizsys.central.cloud.core.cloudutil.CloudUtilRuntimeContextProxy;
import net.ibizsys.central.cloud.core.cloudutil.ICloudLogUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;

public abstract class CloudLogUtilRuntimeContextBase <M extends ICloudLogUtilRuntime, C extends ICloudUtilRuntimeContext> extends CloudUtilRuntimeContextProxy<M, C> implements ICloudLogUtilRuntimeContext {

	public CloudLogUtilRuntimeContextBase(C superContext) {
		super(superContext);
	}
	
	
	@Override
	public ICloudLogUtilRuntime getCloudLogUtilRuntime() {
		return this.getModelRuntime();
	}
}

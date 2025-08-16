package net.ibizsys.central.cloud.saas.core.cloudutil;

import net.ibizsys.central.cloud.core.cloudutil.CloudUtilRuntimeContextProxy;
import net.ibizsys.central.cloud.core.cloudutil.ICloudSaaSUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;

public abstract class CloudSaaSUtilRuntimeContextBase <M extends ICloudSaaSUtilRuntime, C extends ICloudUtilRuntimeContext> extends CloudUtilRuntimeContextProxy<M, C> implements ICloudSaaSUtilRuntimeContext {

	public CloudSaaSUtilRuntimeContextBase(C superContext) {
		super(superContext);
	}
	
	
	@Override
	public ICloudSaaSUtilRuntime getCloudSaaSUtilRuntime() {
		return this.getModelRuntime();
	}
}

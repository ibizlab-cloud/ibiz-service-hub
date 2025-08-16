package net.ibizsys.central.cloud.devops.core.cloudutil;

import net.ibizsys.central.cloud.core.cloudutil.CloudUtilRuntimeContextProxy;
import net.ibizsys.central.cloud.core.cloudutil.ICloudDevOpsUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;

public abstract class CloudDevOpsUtilRuntimeContextBase <M extends ICloudDevOpsUtilRuntime, C extends ICloudUtilRuntimeContext> extends CloudUtilRuntimeContextProxy<M, C> implements ICloudDevOpsUtilRuntimeContext {

	public CloudDevOpsUtilRuntimeContextBase(C superContext) {
		super(superContext);
	}
	
	
	@Override
	public ICloudDevOpsUtilRuntime getCloudDevOpsUtilRuntime() {
		return this.getModelRuntime();
	}
}

package net.ibizsys.central.cloud.portal.core.cloudutil;

import net.ibizsys.central.cloud.core.cloudutil.CloudUtilRuntimeContextProxy;
import net.ibizsys.central.cloud.core.cloudutil.ICloudPortalUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;

public abstract class CloudPortalUtilRuntimeContextBase <M extends ICloudPortalUtilRuntime, C extends ICloudUtilRuntimeContext> extends CloudUtilRuntimeContextProxy<M, C> implements ICloudPortalUtilRuntimeContext {

	public CloudPortalUtilRuntimeContextBase(C superContext) {
		super(superContext);
	}
	
	
	@Override
	public ICloudPortalUtilRuntime getCloudPortalUtilRuntime() {
		return this.getModelRuntime();
	}
}

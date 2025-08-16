package net.ibizsys.central.cloud.oss.core.cloudutil;

import net.ibizsys.central.cloud.core.cloudutil.CloudUtilRuntimeContextProxy;
import net.ibizsys.central.cloud.core.cloudutil.ICloudOSSUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;

public abstract class CloudOSSUtilRuntimeContextBase <M extends ICloudOSSUtilRuntime, C extends ICloudUtilRuntimeContext> extends CloudUtilRuntimeContextProxy<M, C> implements ICloudOSSUtilRuntimeContext {

	public CloudOSSUtilRuntimeContextBase(C superContext) {
		super(superContext);
	}
	
	
	@Override
	public ICloudOSSUtilRuntime getCloudOSSUtilRuntime() {
		return this.getModelRuntime();
	}
}

package net.ibizsys.central.cloud.kb.core.cloudutil;

import net.ibizsys.central.cloud.core.cloudutil.CloudUtilRuntimeContextProxy;
import net.ibizsys.central.cloud.core.cloudutil.ICloudKBUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;

public abstract class CloudKBUtilRuntimeContextBase <M extends ICloudKBUtilRuntime, C extends ICloudUtilRuntimeContext> extends CloudUtilRuntimeContextProxy<M, C> implements ICloudKBUtilRuntimeContext {

	public CloudKBUtilRuntimeContextBase(C superContext) {
		super(superContext);
	}
	
	
	@Override
	public ICloudKBUtilRuntime getCloudKBUtilRuntime() {
		return this.getModelRuntime();
	}
}

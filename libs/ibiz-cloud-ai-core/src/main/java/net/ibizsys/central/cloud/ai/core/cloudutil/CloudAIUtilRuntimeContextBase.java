package net.ibizsys.central.cloud.ai.core.cloudutil;

import net.ibizsys.central.cloud.core.cloudutil.CloudUtilRuntimeContextProxy;
import net.ibizsys.central.cloud.core.cloudutil.ICloudAIUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;

public abstract class CloudAIUtilRuntimeContextBase <M extends ICloudAIUtilRuntime, C extends ICloudUtilRuntimeContext> extends CloudUtilRuntimeContextProxy<M, C> implements ICloudAIUtilRuntimeContext {

	public CloudAIUtilRuntimeContextBase(C superContext) {
		super(superContext);
	}
	
	
	@Override
	public ICloudAIUtilRuntime getCloudAIUtilRuntime() {
		return this.getModelRuntime();
	}
}

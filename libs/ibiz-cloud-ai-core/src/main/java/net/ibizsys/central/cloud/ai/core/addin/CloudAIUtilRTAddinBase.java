package net.ibizsys.central.cloud.ai.core.addin;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.cloud.ai.core.cloudutil.ICloudAIUtilRuntimeContext;
import net.ibizsys.central.cloud.core.IServiceSystemRuntimeBase;
import net.ibizsys.central.cloud.core.cloudutil.ICloudAIUtilRuntime;
import net.ibizsys.runtime.plugin.ModelRTAddinBase;

public abstract class CloudAIUtilRTAddinBase extends ModelRTAddinBase implements ICloudAIUtilRTAddin {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudAIUtilRTAddinBase.class);
	
	@Override
	public void init(ICloudAIUtilRuntimeContext ctx, Object addinData) throws Exception {
		super.init(ctx, addinData);
	}

	@Override
	protected ICloudAIUtilRuntimeContext getContext() {
		return (ICloudAIUtilRuntimeContext)super.getContext();
	}

	protected ICloudAIUtilRuntime getCloudAIUtilRuntime() {
		return this.getContext().getCloudAIUtilRuntime();
	}
	
	protected IServiceSystemRuntimeBase getSystemRuntime() {
		return (IServiceSystemRuntimeBase)this.getCloudAIUtilRuntime().getSystemRuntime();
	}
}

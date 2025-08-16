package net.ibizsys.central.cloud.open.core.addin;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudOpenUtilRuntime;
import net.ibizsys.central.cloud.open.core.cloudutil.ICloudOpenUtilRuntimeContext;
import net.ibizsys.runtime.plugin.ModelRTAddinBase;

public abstract class CloudOpenUtilRTAddinBase extends ModelRTAddinBase implements ICloudOpenUtilRTAddin {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudOpenUtilRTAddinBase.class);
	
	@Override
	public void init(ICloudOpenUtilRuntimeContext ctx, Object addinData) throws Exception {
		super.init(ctx, addinData);
	}

	@Override
	protected ICloudOpenUtilRuntimeContext getContext() {
		return (ICloudOpenUtilRuntimeContext)super.getContext();
	}

	protected ICloudOpenUtilRuntime getCloudOpenUtilRuntime() {
		return this.getContext().getCloudOpenUtilRuntime();
	}
	
	protected ISystemRuntime getSystemRuntime() {
		return this.getCloudOpenUtilRuntime().getSystemRuntime();
	}
}

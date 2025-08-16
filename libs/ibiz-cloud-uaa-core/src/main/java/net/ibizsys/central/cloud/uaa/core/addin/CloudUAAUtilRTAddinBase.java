package net.ibizsys.central.cloud.uaa.core.addin;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.addin.CloudUtilRTAddinBase;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUAAUtilRuntime;
import net.ibizsys.central.cloud.uaa.core.cloudutil.ICloudUAAUtilRuntimeContext;

public abstract class CloudUAAUtilRTAddinBase extends CloudUtilRTAddinBase implements ICloudUAAUtilRTAddin {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudUAAUtilRTAddinBase.class);
	
	@Override
	public void init(ICloudUAAUtilRuntimeContext ctx, Object addinData) throws Exception {
		super.init(ctx, addinData);
	}

	@Override
	protected ICloudUAAUtilRuntimeContext getContext() {
		return (ICloudUAAUtilRuntimeContext)super.getContext();
	}

	protected ICloudUAAUtilRuntime getCloudUAAUtilRuntime() {
		return this.getContext().getCloudUAAUtilRuntime();
	}
	
	@Override
	protected ISystemRuntime getSystemRuntime() {
		return this.getCloudUAAUtilRuntime().getSystemRuntime();
	}
	
	@Override
	protected ICloudUAAUtilRuntime getCloudUtilRuntime() {
		return this.getCloudUAAUtilRuntime();
	}
	
	@Override
	protected String getCloudConfigIdPrefix() {
		return "cloud-uaa-";
	}
	
	
}

package net.ibizsys.central.cloud.uaa.core.addin;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.addin.CloudUtilRTAddinBase;
import net.ibizsys.central.cloud.core.cloudutil.ICloudAuthUtilRuntime;
import net.ibizsys.central.cloud.uaa.core.cloudutil.ICloudAuthUtilRuntimeContext;

public abstract class CloudAuthUtilRTAddinBase extends CloudUtilRTAddinBase implements ICloudAuthUtilRTAddin {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudAuthUtilRTAddinBase.class);
	
	@Override
	public void init(ICloudAuthUtilRuntimeContext ctx, Object addinData) throws Exception {
		super.init(ctx, addinData);
	}

	@Override
	protected ICloudAuthUtilRuntimeContext getContext() {
		return (ICloudAuthUtilRuntimeContext)super.getContext();
	}

	protected ICloudAuthUtilRuntime getCloudAuthUtilRuntime() {
		return this.getContext().getCloudAuthUtilRuntime();
	}
	
	@Override
	protected ISystemRuntime getSystemRuntime() {
		return this.getCloudAuthUtilRuntime().getSystemRuntime();
	}
	
	@Override
	protected ICloudAuthUtilRuntime getCloudUtilRuntime() {
		return this.getCloudAuthUtilRuntime();
	}
	
	@Override
	protected String getCloudConfigIdPrefix() {
		return "cloud-uaa-auth-";
	}
	
	
}

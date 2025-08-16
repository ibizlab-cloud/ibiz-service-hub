package net.ibizsys.central.cloud.log.core.addin;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.addin.CloudUtilRTAddinBase;
import net.ibizsys.central.cloud.core.cloudutil.ICloudLogUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.log.core.cloudutil.ICloudLogUtilRuntimeContext;

public abstract class CloudLogUtilRTAddinBase extends CloudUtilRTAddinBase implements ICloudLogUtilRTAddin {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudLogUtilRTAddinBase.class);
	
	@Override
	public void init(ICloudLogUtilRuntimeContext ctx, Object addinData) throws Exception {
		super.init(ctx, addinData);
	}

	@Override
	protected ICloudLogUtilRuntimeContext getContext() {
		return (ICloudLogUtilRuntimeContext)super.getContext();
	}

	
	protected ICloudLogUtilRuntime getCloudLogUtilRuntime() {
		return getContext().getCloudLogUtilRuntime();
	}
	
	protected ISystemRuntime getSystemRuntime() {
		return this.getCloudLogUtilRuntime().getSystemRuntime();
	}
	
	
	@Override
	protected ICloudUtilRuntime getCloudUtilRuntime() {
		return this.getCloudLogUtilRuntime();
	}
}

package net.ibizsys.central.cloud.oss.core.addin;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudOSSUtilRuntime;
import net.ibizsys.central.cloud.oss.core.cloudutil.ICloudOSSUtilRuntimeContext;
import net.ibizsys.runtime.plugin.ModelRTAddinBase;

public abstract class CloudOSSUtilRTAddinBase extends ModelRTAddinBase implements ICloudOSSUtilRTAddin {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudOSSUtilRTAddinBase.class);
	
	@Override
	public void init(ICloudOSSUtilRuntimeContext ctx, Object addinData) throws Exception {
		super.init(ctx, addinData);
	}

	@Override
	protected ICloudOSSUtilRuntimeContext getContext() {
		return (ICloudOSSUtilRuntimeContext)super.getContext();
	}

	protected ICloudOSSUtilRuntime getCloudOSSUtilRuntime() {
		return this.getContext().getCloudOSSUtilRuntime();
	}
	
	protected ISystemRuntime getSystemRuntime() {
		return this.getCloudOSSUtilRuntime().getSystemRuntime();
	}
}

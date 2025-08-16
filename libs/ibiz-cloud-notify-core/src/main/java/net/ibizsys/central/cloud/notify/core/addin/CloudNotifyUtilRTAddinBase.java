package net.ibizsys.central.cloud.notify.core.addin;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudNotifyUtilRuntime;
import net.ibizsys.central.cloud.notify.core.cloudutil.ICloudNotifyUtilRuntimeContext;
import net.ibizsys.runtime.plugin.ModelRTAddinBase;

public abstract class CloudNotifyUtilRTAddinBase extends ModelRTAddinBase implements ICloudNotifyUtilRTAddin {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudNotifyUtilRTAddinBase.class);
	
	@Override
	public void init(ICloudNotifyUtilRuntimeContext ctx, Object addinData) throws Exception {
		super.init(ctx, addinData);
	}

	@Override
	protected ICloudNotifyUtilRuntimeContext getContext() {
		return (ICloudNotifyUtilRuntimeContext)super.getContext();
	}

	
	protected ICloudNotifyUtilRuntime getCloudNotifyUtilRuntime() {
		return getContext().getCloudNotifyUtilRuntime();
	}
	
	protected ISystemRuntime getSystemRuntime() {
		return this.getCloudNotifyUtilRuntime().getSystemRuntime();
	}
	
}

package net.ibizsys.central.cloud.kb.core.addin;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudKBUtilRuntime;
import net.ibizsys.central.cloud.kb.core.cloudutil.ICloudKBUtilRuntimeContext;
import net.ibizsys.runtime.plugin.ModelRTAddinBase;

public abstract class CloudKBUtilRTAddinBase extends ModelRTAddinBase implements ICloudKBUtilRTAddin {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudKBUtilRTAddinBase.class);
	
	@Override
	public void init(ICloudKBUtilRuntimeContext ctx, Object addinData) throws Exception {
		super.init(ctx, addinData);
	}

	@Override
	protected ICloudKBUtilRuntimeContext getContext() {
		return (ICloudKBUtilRuntimeContext)super.getContext();
	}

	protected ICloudKBUtilRuntime getCloudKBUtilRuntime() {
		return this.getContext().getCloudKBUtilRuntime();
	}
	
	protected ISystemRuntime getSystemRuntime() {
		return this.getCloudKBUtilRuntime().getSystemRuntime();
	}
}

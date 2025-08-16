package net.ibizsys.central.cloud.report.core.addin;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudReportUtilRuntime;
import net.ibizsys.central.cloud.report.core.cloudutil.ICloudReportUtilRuntimeContext;
import net.ibizsys.runtime.plugin.ModelRTAddinBase;

public abstract class CloudReportUtilRTAddinBase extends ModelRTAddinBase implements ICloudReportUtilRTAddin {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudReportUtilRTAddinBase.class);
	
	@Override
	public void init(ICloudReportUtilRuntimeContext ctx, Object addinData) throws Exception {
		super.init(ctx, addinData);
	}

	@Override
	protected ICloudReportUtilRuntimeContext getContext() {
		return (ICloudReportUtilRuntimeContext)super.getContext();
	}

	protected ICloudReportUtilRuntime getCloudReportUtilRuntime() {
		return this.getContext().getCloudReportUtilRuntime();
	}
	
	protected ISystemRuntime getSystemRuntime() {
		return this.getCloudReportUtilRuntime().getSystemRuntime();
	}
}

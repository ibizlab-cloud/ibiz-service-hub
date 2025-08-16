package net.ibizsys.central.cloud.report.core.cloudutil;

import net.ibizsys.central.cloud.core.cloudutil.CloudUtilRuntimeContextProxy;
import net.ibizsys.central.cloud.core.cloudutil.ICloudReportUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntimeContext;

public abstract class CloudReportUtilRuntimeContextBase <M extends ICloudReportUtilRuntime, C extends ICloudUtilRuntimeContext> extends CloudUtilRuntimeContextProxy<M, C> implements ICloudReportUtilRuntimeContext {

	public CloudReportUtilRuntimeContextBase(C superContext) {
		super(superContext);
	}
	
	
	@Override
	public ICloudReportUtilRuntime getCloudReportUtilRuntime() {
		return this.getModelRuntime();
	}
}

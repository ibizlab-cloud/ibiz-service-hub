package net.ibizsys.central.cloud.devops.core.addin;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.addin.CloudUtilRTAddinBase;
import net.ibizsys.central.cloud.core.cloudutil.ICloudDevOpsUtilRuntime;
import net.ibizsys.central.cloud.devops.core.cloudutil.ICloudDevOpsUtilRuntimeContext;

public abstract class CloudDevOpsUtilRTAddinBase extends CloudUtilRTAddinBase implements ICloudDevOpsUtilRTAddin {
	
	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudDevOpsUtilRTAddinBase.class);
	
	
	@Override
	protected void prepareDefaultSetting() throws Exception {
		// TODO Auto-generated method stub
		super.prepareDefaultSetting();
	}
	
	@Override
	protected ICloudDevOpsUtilRuntimeContext getContext() {
		return (ICloudDevOpsUtilRuntimeContext)super.getContext();
	}

	protected ICloudDevOpsUtilRuntime getCloudDevOpsUtilRuntime() {
		return this.getContext().getCloudDevOpsUtilRuntime();
	}
	
	@Override
	protected ISystemRuntime getSystemRuntime() {
		return this.getCloudDevOpsUtilRuntime().getSystemRuntime();
	}
	
	@Override
	protected ICloudDevOpsUtilRuntime getCloudUtilRuntime() {
		return this.getCloudDevOpsUtilRuntime();
	}
	
	
	
	
	
	@Override
	protected String getCloudConfigIdPrefix() {
		return "cloud-devops-";
	}
	
}

package net.ibizsys.central.cloud.saas.core.addin;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.addin.CloudUtilRTAddinBase;
import net.ibizsys.central.cloud.core.cloudutil.ICloudSaaSUtilRuntime;
import net.ibizsys.central.cloud.saas.core.cloudutil.ICloudSaaSUtilRuntimeContext;

public abstract class CloudSaaSUtilRTAddinBase extends CloudUtilRTAddinBase implements ICloudSaaSUtilRTAddin {
	
	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudSaaSUtilRTAddinBase.class);
	
	
	@Override
	protected void prepareDefaultSetting() throws Exception {
		// TODO Auto-generated method stub
		super.prepareDefaultSetting();
	}
	
	@Override
	protected ICloudSaaSUtilRuntimeContext getContext() {
		return (ICloudSaaSUtilRuntimeContext)super.getContext();
	}

	protected ICloudSaaSUtilRuntime getCloudSaaSUtilRuntime() {
		return this.getContext().getCloudSaaSUtilRuntime();
	}
	
	@Override
	protected ISystemRuntime getSystemRuntime() {
		return this.getCloudSaaSUtilRuntime().getSystemRuntime();
	}
	
	@Override
	protected ICloudSaaSUtilRuntime getCloudUtilRuntime() {
		return this.getCloudSaaSUtilRuntime();
	}
	
	
	
	@Override
	protected String getCloudConfigIdPrefix() {
		return "cloud-saas-";
	}
	
}

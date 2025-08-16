package net.ibizsys.central.cloud.core.system;

import org.apache.commons.logging.LogFactory;


public abstract class ServiceRefRuntimeBase extends net.ibizsys.central.system.SysRefRuntimeBase implements IServiceRefRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(ServiceRefRuntimeBase.class);
	
	private String refServiceId = null;
	
	@Override
	protected void onInit() throws Exception {
		
		this.setRefServiceId(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + "." + PARAM_REFSERVICEID, this.getPSSysRef().getRefServiceId()));
		
		super.onInit();
	}

	@Override
	public String getRefServiceId() {
		return refServiceId;
	}

	protected void setRefServiceId(String refServiceId) {
		this.refServiceId = refServiceId;
	}
	
	
	
}

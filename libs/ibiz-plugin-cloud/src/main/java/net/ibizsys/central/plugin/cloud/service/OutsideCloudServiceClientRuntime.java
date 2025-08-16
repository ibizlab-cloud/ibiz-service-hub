package net.ibizsys.central.plugin.cloud.service;

public class OutsideCloudServiceClientRuntime extends AutoCloudServiceClientRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(OutsideCloudServiceClientRuntime.class);
	
	@Override
	public boolean isOutsideCloud() {
		return true;
	}
}

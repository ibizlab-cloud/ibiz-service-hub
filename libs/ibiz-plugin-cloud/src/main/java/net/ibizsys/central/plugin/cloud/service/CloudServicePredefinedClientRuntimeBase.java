package net.ibizsys.central.plugin.cloud.service;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.service.SubSysServiceAPIDERuntime;

public abstract class CloudServicePredefinedClientRuntimeBase extends SubSysServiceAPIDERuntime{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(CloudServicePredefinedClientRuntimeBase.class);
	
	private ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = null;
	
	protected ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime() {
		if (this.iSysCloudClientUtilRuntime == null) {
			this.iSysCloudClientUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
		}
		return this.iSysCloudClientUtilRuntime;
	}
}

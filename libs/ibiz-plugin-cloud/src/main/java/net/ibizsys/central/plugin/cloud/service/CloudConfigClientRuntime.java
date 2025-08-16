package net.ibizsys.central.plugin.cloud.service;

import net.ibizsys.central.service.ISubSysServiceAPIDERuntime;
import net.ibizsys.central.service.SubSysServiceAPIRuntime;

/**
 * Cloud配置服务接口客户端运行时
 * 
 * @author lionlau
 *
 */
public class CloudConfigClientRuntime extends SubSysServiceAPIRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(CloudConfigClientRuntime.class);

	

	@Override
	protected void onInit() throws Exception {

		super.onInit();

	}

	@Override
	protected ISubSysServiceAPIDERuntime createDefaultSubSysServiceAPIDERuntime() {
		return new CloudConfigDEClientRuntime();
	}

	@Override
	protected void runAuthTimer(boolean bTimerOnly) {
		// super.runAuthTimer(bTimerOnly);
	}

}

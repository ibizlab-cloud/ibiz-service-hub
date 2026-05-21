package net.ibizsys.central.cloud.core.service.util;

import net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime;

public class SysServiceAPIAIUtils extends SysServiceAPIAIUtilsBase {

	public SysServiceAPIAIUtils(ISysServiceAPIRuntime iSysServiceAPIRuntime) {
		super(iSysServiceAPIRuntime);
	}

	
	public static ISysServiceAPIAIUtils getInstance(ISysServiceAPIRuntime iSysServiceAPIRuntime) {
		return new SysServiceAPIAIUtils(iSysServiceAPIRuntime);
	}
	
}

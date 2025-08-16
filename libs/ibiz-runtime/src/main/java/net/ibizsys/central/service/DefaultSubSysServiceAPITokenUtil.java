package net.ibizsys.central.service;

public class DefaultSubSysServiceAPITokenUtil {

	private static ISubSysServiceAPITokenUtil instance = null;
	
	public static void setInstance(ISubSysServiceAPITokenUtil instance) {
		DefaultSubSysServiceAPITokenUtil.instance = instance;
	}
	
	public static ISubSysServiceAPITokenUtil getInstance() {
		return DefaultSubSysServiceAPITokenUtil.instance;
	}
	
}

package cn.ibizlab.central.plugin.groovy.sysutil

import net.ibizsys.central.cloud.core.sysutil.SysUtilRuntimeBase

class SimpleSysUtilRuntime extends SysUtilRuntimeBase{
	
	@Override
	protected void onInstall() throws Exception {
	
		
		
		super.onInstall()
	}
	
	
	public String calcValue() {
		return "hello world"
	}
}

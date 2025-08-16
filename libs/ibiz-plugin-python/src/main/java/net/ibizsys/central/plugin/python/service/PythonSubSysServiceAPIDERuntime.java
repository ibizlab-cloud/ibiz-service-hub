package net.ibizsys.central.plugin.python.service;

import net.ibizsys.central.cloud.core.service.SubSysRestServiceAPIDERuntimeBase;

public class PythonSubSysServiceAPIDERuntime extends SubSysRestServiceAPIDERuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(PythonSubSysServiceAPIDERuntime.class);
	
	public static boolean isUtilDE(String name) {
		
		if(name.indexOf("__") == 0 && name.lastIndexOf("__") == name.length() -2 ) {
			return true;
		}
		return false;
	}
	
	
	@Override
	protected void prepareMethodScriptLogicRuntime() throws Exception {
		if(isUtilDE(this.getName())) {
			return;
		}

		super.prepareMethodScriptLogicRuntime();
	}

	
	
}

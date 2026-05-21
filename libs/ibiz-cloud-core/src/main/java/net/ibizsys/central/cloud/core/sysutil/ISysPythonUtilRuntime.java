package net.ibizsys.central.cloud.core.sysutil;

import net.ibizsys.central.cloud.core.util.python.IChatPythonUtil;

public interface ISysPythonUtilRuntime extends ISysUtilRuntime {

	public final static String MODE_DEFAULT = "DEFAULT";
	
	
	default IChatPythonUtil getChatPythonUtil() {
		return getChatPythonUtil(MODE_DEFAULT);
	}
	
	IChatPythonUtil getChatPythonUtil(String mode);

}

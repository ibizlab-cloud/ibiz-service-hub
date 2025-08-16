package net.ibizsys.central.sysutil;

import net.ibizsys.runtime.util.script.IScriptUtil;

public interface ISysScriptUtilRuntime extends ISysUtilRuntime{

	/**
	 * 获取脚本功能对象
	 * @return
	 */
	IScriptUtil getScriptUtil();
}

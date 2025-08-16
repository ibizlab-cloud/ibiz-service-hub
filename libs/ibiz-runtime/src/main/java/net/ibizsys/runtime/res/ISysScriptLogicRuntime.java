package net.ibizsys.runtime.res;

import net.ibizsys.runtime.ISystemUtilRuntime;

public interface ISysScriptLogicRuntime extends ISysLogicRuntime{

	/**
	 * 获取脚本引擎类型
	 * @return
	 */
	default String getScriptEngine() {
		return ISystemUtilRuntime.SCRIPTENGINE_JAVASCRIPT;
	}
}

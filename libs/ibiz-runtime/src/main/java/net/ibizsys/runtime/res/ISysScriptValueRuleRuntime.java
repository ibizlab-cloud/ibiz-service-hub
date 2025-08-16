package net.ibizsys.runtime.res;

import net.ibizsys.runtime.ISystemUtilRuntime;

/**
 * 系统脚本值规则
 * @author lionlau
 *
 */
public interface ISysScriptValueRuleRuntime extends ISysValueRuleRuntime {

	/**
	 * 获取脚本引擎类型
	 * @return
	 */
	default String getScriptEngine() {
		return ISystemUtilRuntime.SCRIPTENGINE_JAVASCRIPT;
	}
}

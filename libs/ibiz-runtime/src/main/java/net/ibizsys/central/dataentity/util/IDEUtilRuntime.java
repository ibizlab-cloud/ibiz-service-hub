package net.ibizsys.central.dataentity.util;

import net.ibizsys.central.dataentity.IDataEntityModelRuntime;

public interface IDEUtilRuntime extends net.ibizsys.runtime.dataentity.util.IDEUtilRuntime, IDataEntityModelRuntime {

	/**
	 * 执行自定义行为
	 * @param strActionName 行为名称
	 * @param args
	 * @return
	 * @throws Throwable
	 */
	Object executeAction(String strActionName, Object[] args);
}

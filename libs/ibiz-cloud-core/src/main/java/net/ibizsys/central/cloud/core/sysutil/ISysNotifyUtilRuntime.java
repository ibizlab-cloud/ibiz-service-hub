package net.ibizsys.central.cloud.core.sysutil;

import net.ibizsys.central.cloud.core.util.domain.CarbonCopy;
import net.ibizsys.central.cloud.core.util.domain.Todo;

public interface ISysNotifyUtilRuntime extends net.ibizsys.central.sysutil.ISysNotifyUtilRuntime {

	/**
	 * 创建Todo
	 * @param todo
	 */
	void createTodo(Todo[] todos);
	
	
	
	/**
	 * 创建抄送
	 * @param todo
	 */
	void createCarbonCopy(CarbonCopy[] todos);
	
	
	
	
}

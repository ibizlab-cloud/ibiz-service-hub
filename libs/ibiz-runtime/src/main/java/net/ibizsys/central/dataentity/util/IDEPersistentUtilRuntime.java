package net.ibizsys.central.dataentity.util;

import net.ibizsys.central.ISystemPersistentAdapter;

/**
 * 实体持久化组件
 * @author lionlau
 *
 */
public interface IDEPersistentUtilRuntime extends IDEUtilRuntime {

	
	/**
	 * 获取实体的系统持久化设配器对象
	 * @return
	 */
	ISystemPersistentAdapter getSystemPersistentAdapter();
}

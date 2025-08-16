package net.ibizsys.central.dataentity;

import net.ibizsys.central.IDynaInstRuntime;

/**
 * 动态实例实体运行时对象接口
 * @author lionlau
 *
 */
public interface IDynaInstDataEntityRuntime extends net.ibizsys.runtime.dataentity.IDynaInstDataEntityRuntime{

		/**
	 * 获取动态实例运行时对象
	 * @return
	 */
	IDynaInstRuntime getDynaInstRuntime();
	
	
	
	
	/**
	 * 获取全局实体运行时对象
	 * @return
	 */
	IDataEntityRuntime getDataEntityRuntime();
	
	
	

	
}
package net.ibizsys.central.dataentity;


import net.ibizsys.central.IDynaInstRuntime;
import net.ibizsys.central.ISystemRuntime;


/**
 * 实体相关模型运行时对象接口
 * @author lionlau
 *
 */
public interface IDataEntityModelRuntime extends net.ibizsys.runtime.dataentity.IDataEntityModelRuntime{

	/**
	 * 获取实体运行时对象
	 * @return
	 */
	IDataEntityRuntime getDataEntityRuntime();
	
	
	
	/**
	 * 获取动态实例实体运行时对象
	 * @return
	 */
	IDynaInstDataEntityRuntime getDynaInstDataEntityRuntime();
	
	
	/**
	 * 获取系统运行时对象
	 * @return
	 */
	ISystemRuntime getSystemRuntime();
	
	
	
	/**
	 * 获取动态实例运行时对象
	 * @return
	 */
	IDynaInstRuntime getDynaInstRuntime();
}

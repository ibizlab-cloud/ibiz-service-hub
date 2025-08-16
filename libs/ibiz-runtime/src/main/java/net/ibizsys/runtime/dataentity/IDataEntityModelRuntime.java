package net.ibizsys.runtime.dataentity;

import net.ibizsys.runtime.IDynaInstRuntime;
import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.ISystemRuntime;

/**
 * 实体相关模型运行时对象接口
 * @author lionlau
 *
 */
public interface IDataEntityModelRuntime extends IModelRuntime{

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

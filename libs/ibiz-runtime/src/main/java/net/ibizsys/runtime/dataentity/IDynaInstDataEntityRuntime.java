package net.ibizsys.runtime.dataentity;

import net.ibizsys.runtime.IDynaInstRuntime;

/**
 * 动态实例实体运行时对象接口
 * @author lionlau
 *
 */
public interface IDynaInstDataEntityRuntime extends IDataEntityRuntimeBase{

	/**
	 * 初始化动态实例运行时
	 * @param iDynaInstRuntime
	 * @param iDataEntityRuntimeContext
	 * @throws Exception
	 */
	void init(IDynaInstRuntime iDynaInstRuntime, IDataEntityRuntimeContext iDataEntityRuntimeContext)throws Exception;
	
	
	
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
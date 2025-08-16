package net.ibizsys.runtime.dataentity.logic;

import net.ibizsys.runtime.dataentity.IDataEntityRuntime;

/**
 * 实体主状态逻辑运行时上下文
 * @author lionlau
 *
 */
public interface IDEMSLogicRuntimeContext {

	/**
	 * 获取相关的实体运行时对象
	 * @return
	 */
	IDataEntityRuntime getDataEntityRuntime();
	
	
	
	/**
	 * 获取实体主状态逻辑运行时对象
	 * @return
	 */
	IDEMSLogicRuntime getDEMSLogicRuntime();
}

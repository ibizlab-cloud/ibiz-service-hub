package net.ibizsys.central.plugin.task.addin;

import net.ibizsys.runtime.plugin.IModelRTAddin2;

/**
 * 调度器提供者对象接口
 * @author lionlau
 *
 */
public interface ISchedulerProvider extends IModelRTAddin2 {

	/**
	 * 建立调度器对象
	 * @param addin
	 * @return
	 */
	IScheduler createScheduler(Object addin);
	
	
	
}

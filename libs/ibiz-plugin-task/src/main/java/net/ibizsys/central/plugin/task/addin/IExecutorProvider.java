package net.ibizsys.central.plugin.task.addin;

import net.ibizsys.runtime.plugin.IModelRTAddin2;

/**
 * 执行器提供者对象接口
 * @author lionlau
 *
 */
public interface IExecutorProvider extends IModelRTAddin2 {

	/**
	 * 建立执行器对象
	 * @param addin
	 * @return
	 */
	IExecutor createExecutor(Object addin);
}

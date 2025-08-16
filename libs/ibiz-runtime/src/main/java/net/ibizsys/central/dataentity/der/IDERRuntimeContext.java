package net.ibizsys.central.dataentity.der;

import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.IModelRuntimeContext;

/**
 * 关系运行时上下文对象接口
 * @author lionlau
 *
 */
public interface IDERRuntimeContext extends IModelRuntimeContext {

	/**
	 * 获取关系运行时对象
	 * @return
	 */
	IDERRuntime getDERRuntime();
	
	
	@Override
	default IModelRuntime getModelRuntime() {
		return getDERRuntime();
	}
}

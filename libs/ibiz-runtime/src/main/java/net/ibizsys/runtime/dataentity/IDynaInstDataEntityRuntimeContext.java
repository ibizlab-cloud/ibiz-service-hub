package net.ibizsys.runtime.dataentity;

/**
 * 实体运行时上下文接口
 * @author lionlau
 *
 */
public interface IDynaInstDataEntityRuntimeContext extends IDataEntityRuntimeBaseContext{

	/**
	 * 获取实体运行时对象
	 * @return
	 */
	IDynaInstDataEntityRuntime getDataEntityRuntime();
}

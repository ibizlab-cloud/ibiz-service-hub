package net.ibizsys.runtime;

/**
 * 动态实例运行时上下文
 * @author lionlau
 *
 */
public interface IDynaInstRuntimeContext extends ISystemRuntimeBaseContext{
	
	/**
	 * 获取系统运行时对象
	 * @return
	 */
	IDynaInstRuntime getSystemRuntime();
}

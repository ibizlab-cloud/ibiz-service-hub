package net.ibizsys.central.app;

/**
 * 系统前端应用运行时上下文对象
 * @author lionlau
 *
 */
public interface IApplicationRuntimeContext {

	/**
	 * 获取系统前端应用运行时对象
	 * @return
	 */
	IApplicationRuntime getApplicationRuntime();
}

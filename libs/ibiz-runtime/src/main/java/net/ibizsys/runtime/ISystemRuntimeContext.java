package net.ibizsys.runtime;

/**
 * 系统运行时上下文接口
 * @author lionlau
 *
 */
public interface ISystemRuntimeContext extends ISystemRuntimeBaseContext, IModelRuntimeContext{

	/**
	 * 获取系统运行时对象
	 * @return
	 */
	ISystemRuntime getSystemRuntime();
	
	
	@Override
	default IModelRuntime getModelRuntime() {
		return getSystemRuntime();
	}

}

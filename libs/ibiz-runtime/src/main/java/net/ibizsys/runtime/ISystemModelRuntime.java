package net.ibizsys.runtime;

/**
 * 系统相关模型运行时对象接口
 * @author lionlau
 *
 */
public interface ISystemModelRuntime extends IModelRuntime{

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
	
	
	
	/**
	 * 获取设置对象
	 * @return
	 */
	IModelRuntimeSetting getSetting();
}

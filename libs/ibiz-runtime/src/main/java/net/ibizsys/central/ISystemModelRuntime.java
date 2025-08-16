package net.ibizsys.central;

/**
 * 系统相关模型运行时对象接口
 * @author lionlau
 *
 */
public interface ISystemModelRuntime extends net.ibizsys.runtime.ISystemModelRuntime{

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
}

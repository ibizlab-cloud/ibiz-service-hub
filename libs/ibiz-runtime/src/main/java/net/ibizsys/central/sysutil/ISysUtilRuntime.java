package net.ibizsys.central.sysutil;



import net.ibizsys.central.ISystemModelRuntime;

/**
 * 系统预置功能组件运行时对象接口
 * @author lionlau
 *
 */
public interface ISysUtilRuntime extends net.ibizsys.runtime.res.ISysUtilRuntime, ISysUtilRuntimeBase, ISystemModelRuntime {

	
	/**
	 * 执行自定义行为
	 * @param strActionName 行为名称
	 * @param args
	 * @return
	 * @throws Throwable
	 */
	Object executeAction(String strActionName, Object[] args);
	
	
}

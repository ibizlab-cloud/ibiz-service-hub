package net.ibizsys.central.plugin.task.sysutil;


import net.ibizsys.central.cloud.core.sysutil.ISysUtilRuntime;
import net.ibizsys.central.plugin.task.addin.IExecutorProvider;
import net.ibizsys.central.plugin.task.addin.ISchedulerProvider;

/**
 * 系统任务功能组件运行时对象接口
 * @author lionlau
 *
 */
public interface ISysTaskUtilRuntime extends net.ibizsys.central.cloud.core.sysutil.ISysTaskUtilRuntime, ISysUtilRuntime{

	/**
	 * 调度器插件前缀
	 */
	public final static String ADDIN_SCHEDULER_PREFIX = "SCHEDULER:";
	
	
	/**
	 * 执行器插件前缀
	 */
	public final static String ADDIN_EXECUTOR_PREFIX = "EXECUTOR:";
	
	/**
	 * 是否存在指定调度器提供器对象
	 * @param strSchedulerName
	 * @return
	 */
	boolean containsSchedulerProvider(String strSchedulerName);
	
	
	/**
	 * 注册调度器提供器对象
	 * @param strSchedulerName
	 * @param iScheduler
	 */
	void registerSchedulerProvider(String strSchedulerName, ISchedulerProvider iScheduler);
	
	
	/**
	 * 注销调度器提供器对象
	 * @param strSchedulerName
	 * @param iScheduler
	 * @return
	 */
	boolean unregisterSchedulerProvider(String strSchedulerName, ISchedulerProvider iScheduler);
	
	
	/**
	 * 是否存在指定执行器提供器对象
	 * @param strExecutorName
	 * @return
	 */
	boolean containsExecutorProvider(String strExecutorName);
	
	
	/**
	 * 注册执行器提供器对象
	 * @param strExecutorName
	 * @param iExecutor
	 */
	void registerExecutorProvider(String strExecutorName, IExecutorProvider iExecutor);
	
	
	/**
	 * 注销执行器提供器对象
	 * @param strExecutorName
	 * @param iExecutor
	 * @return
	 */
	boolean unregisterExecutorProvider(String strExecutorName, IExecutorProvider iExecutor);
	
	
	

	/**
	 * 重新加载
	 */
	void reload();
}

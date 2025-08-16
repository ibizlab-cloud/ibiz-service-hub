package net.ibizsys.central.plugin.quartz.sysutil;

import org.quartz.Scheduler;

import net.ibizsys.central.backend.ISysBackendTaskRuntimeBase;
import net.ibizsys.central.sysutil.ISysUtilRuntime;

/**
 * 系统Quartz定时组件运行时接口
 * @author lionlau
 *
 */
public interface ISysQuartzUtilRuntime extends ISysUtilRuntime{

	
	/**
	 * 获取调度对象（必须存在）
	 * @return
	 */
	Scheduler getScheduler();
	
	
	/**
	 * 获取调度对象
	 * @param bTryMode 尝试模式
	 * @return
	 */
	Scheduler getScheduler(boolean bTryMode);
	
	
	
	
	/**
	 * 启动系统后台作业
	 * @param iSysBackendTaskRuntimeBase
	 */
	void startSysBackendTask(ISysBackendTaskRuntimeBase iSysBackendTaskRuntimeBase);
	
	
	
	/**
	 * 停止系统后台作业
	 * @param iSysBackendTaskRuntimeBase
	 */
	void stopSysBackendTask(ISysBackendTaskRuntimeBase iSysBackendTaskRuntimeBase);
}

package net.ibizsys.central.plugin.task.sysutil;

import java.util.Map;

import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;

/**
 * 系统Task功能组件运行时上下文接口
 * @author lionlau
 *
 */
public interface ISysTaskUtilRuntimeContext extends ISysUtilRuntimeContext{

	default ISysTaskUtilRuntime getSysTaskUtilRuntime() {
		return this.getModelRuntime();
	}
	
	
	@Override
	ISysTaskUtilRuntime getModelRuntime();
	

	
	/**
	 * 执行计划
	 * @param schedule
	 * @param objData
	 */
	void executeSchedule(Map<String, Object> schedule, Object objData);
}

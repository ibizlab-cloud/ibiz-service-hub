package net.ibizsys.central.cloud.core.sysutil;

import java.util.Map;

public interface ISysTaskUtilRuntime extends net.ibizsys.central.sysutil.ISysTaskUtilRuntime, ISysUtilRuntime {

	/**
	 * 注册任务类型（如果不存在）
	 * @param strTaskTypeId
	 * @param taskTypeParams
	 * @param bOverwrite 存在时是否覆盖
	 * @param bPersistent 是否持久化
	 */
	void registerTaskType(String strTaskTypeId, Map<String, Object> taskTypeParams, boolean bOverwrite, boolean bPersistent);
	
	
	/**
	 * 添加计划
	 * @param strScheduleId
	 * @param scheduleParams
	 * @param bOverwrite 存在时是否覆盖
	 * @param bPersistent 是否持久化
	 */
	void addSchedule(String strScheduleId, Map<String, Object> scheduleParams, boolean bOverwrite, boolean bPersistent);
}

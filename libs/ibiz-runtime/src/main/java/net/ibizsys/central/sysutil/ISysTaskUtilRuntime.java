package net.ibizsys.central.sysutil;

import java.util.Map;

public interface ISysTaskUtilRuntime extends ISysUtilRuntime{

	public final static String TASKTYPEPARAM_ID = "ID";
	public final static String TASKTYPEPARAM_NAME = "NAME";
	public final static String TASKTYPEPARAM_RETRYABLE = "RETRYABLE";
	public final static String TASKTYPEPARAM_EXECUTOR_TYPE = "EXECUTOR_TYPE";
	public final static String TASKTYPEPARAM_MAX_RETRY = "MAX_RETRY";
	public final static String TASKTYPEPARAM_TIMEOUT = "TIMEOUT";
	public final static String TASKTYPEPARAM_EXECUTOR_TAG = "EXECUTOR_TAG";
	public final static String TASKTYPEPARAM_CODE = "CODE";
	public final static String TASKTYPEPARAM_EXECUTOR_CONFIG = "EXECUTOR_CONFIG";
	public final static String TASKTYPEPARAM_EXECUTOR_SUBTYPE = "EXECUTOR_SUBTYPE";
	
	//指定执行的执行器对象，插件系统要注意卸载，避免释放不干净
	public final static String TASKTYPEPARAM_EXECUTOR = "EXECUTOR";
	
	//是否本地执行，忽略检测Cloud互斥锁
	public final static String TASKTYPEPARAM_LOCAL_EXECUTION = "LOCAL_EXECUTION";
	
	public final static String SCHEDULEPARAM_ID = "ID";
	public final static String SCHEDULEPARAM_NAME = "NAME";
	public final static String SCHEDULEPARAM_TASK_TYPE = "TASK_TYPE";
	public final static String SCHEDULEPARAM_TIMER_POLICY = "TIMER_POLICY";
	public final static String SCHEDULEPARAM_SCHEDULE_TYPE = "SCHEDULE_TYPE";
	public final static String SCHEDULEPARAM_PAYLOAD = "PAYLOAD";
	public final static String SCHEDULEPARAM_NEXT_TRIGGER_TIME = "NEXT_TRIGGER_TIME";
	public final static String SCHEDULEPARAM_FIRE_TIME = "FIRE_TIME";
	public final static String SCHEDULEPARAM_PRINCIPAL_TYPE = "PRINCIPAL_TYPE";
	public final static String SCHEDULEPARAM_PRINCIPAL_NAME = "PRINCIPAL_NAME";
	public final static String SCHEDULEPARAM_PRINCIPAL_ID = "PRINCIPAL_ID";
	
	
	/**
	 * 定期类型：CRON
	 */
	public final static String SCHEDULE_TYPE_CRON = "CRON";
	

	/**
	 * 注册任务类型（如果不存在）
	 * @param strTaskTypeId
	 * @param taskTypeParams
	 * @param bOverwrite 存在时是否覆盖
	 */
	void registerTaskType(String strTaskTypeId, Map<String, Object> taskTypeParams, boolean bOverwrite);
	
	
	/**
	 * 移除任务类型
	 * @param strTaskTypeId
	 * @return
	 */
	boolean unregisterTaskType(String strTaskTypeId);
	
	
	
	/**
	 * 添加计划
	 * @param strScheduleId
	 * @param scheduleParams
	 * @param bOverwrite 存在时是否覆盖
	 */
	void addSchedule(String strScheduleId, Map<String, Object> scheduleParams, boolean bOverwrite);
	
	
	
	/**
	 * 移除计划
	 * @param strScheduleId
	 * @return
	 */
	boolean removeSchedule(String strScheduleId);
}

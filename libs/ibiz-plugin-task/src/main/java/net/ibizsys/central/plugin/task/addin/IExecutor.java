package net.ibizsys.central.plugin.task.addin;

import java.util.Map;

import net.ibizsys.runtime.plugin.IModelRTAddin;

public interface IExecutor extends IModelRTAddin{

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
	
	
	public final static String SCHEDULEDTASKPARAM_ID = "ID";
	public final static String SCHEDULEDTASKPARAM_NAME = "NAME";
	public final static String SCHEDULEDTASKPARAM_RETRY_COUNT = "RETRY_COUNT";
	public final static String SCHEDULEDTASKPARAM_SCHEDULED_AT = "SCHEDULED_AT";
	public final static String SCHEDULEDTASKPARAM_STATUS = "STATUS";
	
	public final static String SCHEDULEDTASKPARAM_RESULT_MESSAGE = "RESULT_MESSAGE";
	public final static String SCHEDULEDTASKPARAM_TASK_TYPE = "TASK_TYPE";
	public final static String SCHEDULEDTASKPARAM_FINISHED_AT = "FINISHED_AT";
	public final static String SCHEDULEDTASKPARAM_PAYLOAD = "PAYLOAD";
	public final static String SCHEDULEDTASKPARAM_SCHEDULE_ID = "SCHEDULE_ID";
	
	public final static String SCHEDULEDTASKPARAM_STARTED_AT = "STARTED_AT";
	public final static String SCHEDULEDTASKPARAM_RESULT = "RESULT";
	public final static String SCHEDULEDTASKPARAM_PRINCIPAL_TYPE = "PRINCIPAL_TYPE";
	public final static String SCHEDULEDTASKPARAM_PRINCIPAL_NAME = "PRINCIPAL_NAME";
	public final static String SCHEDULEDTASKPARAM_PRINCIPAL_ID = "PRINCIPAL_ID";
	
	/**
	 * 调度任务状态：待处理
	 */
	public final static String SCHEDULETASKSTATUS_PENDING = "PENDING";
	
	/**
	 * 调度任务状态：运行中
	 */
	public final static String SCHEDULETASKSTATUS_RUNNING = "RUNNING";
	/**
	 * 调度任务状态：成功
	 */
	public final static String SCHEDULETASKSTATUS_SUCCESS = "SUCCESS";
	/**
	 * 调度任务状态：失败
	 */
	public final static String SCHEDULETASKSTATUS_FAILED = "FAILED";
	/**
	 * 调度任务状态：已取消
	 */
	public final static String SCHEDULETASKSTATUS_CANCELLED = "CANCELLED";
		
	
	/**
	 * 获取类型
	 * @return
	 */
	String getType();
	
	
	/**
	 * 执行
	 * @param schedule
	 * @param taskType
	 * @param objData
	 * @return
	 * @throws Throwable
	 */
	Object execute(Map<String, Object> schedule, Map<String, Object> taskType, Object objData) throws Throwable;
}

package net.ibizsys.central.cloud.workflow.flowable.util;

import java.util.List;

import org.flowable.engine.runtime.Execution;

public interface IFlowableRuntimeServiceEx {

	/**
	 * 标记任务已读
	 * @param strTaskId
	 * @param strUserId
	 */
	void markReadTask(String strTaskId, String strUserId) throws Throwable;
	
	
	/**
	 * 发生抄送任务
	 * @param strScope
	 * @param strTaskId
	 * @param strUserId
	 */
	void sendCopyTask(String strScope, String strTaskId, String strUserId) throws Throwable;
	
	
	/**
	 * 转移任务
	 * @param strOriginUserId
	 * @param strTaskId
	 * @param strUserId
	 */
	void reassignTask(String strOriginUserId, String strTaskId, String strUserId) throws Throwable;
	
	
	
	/**
	 * 授权任务
	 * @param strOriginUserId
	 * @param strTaskId
	 * @param strUserId
	 */
	void delegateTask(String strOriginUserId, String strTaskId, String strUserId) throws Throwable;
	
	
	/**
	 * 任务完成
	 * @param strOriginUserId
	 * @param strTaskId
	 * @param strUserId
	 */
	void resolveTask(String strTaskId, String strUserId) throws Throwable;
	
	
	/**
	 * 搜索用户历史任务
	 * @param strCategory
	 * @param strUserId
	 * @throws Throwable
	 */
	List<?> searchHistoryTask(String strCategory, String strUserId) throws Throwable;
	
	
	/**
	 * 搜索用户历史任务（单项）
	 * @param strCategory
	 * @param strUserId
	 * @throws Throwable
	 */
	Execution selectOneHistoryTask(String strCategory, String strUserId) throws Throwable;
}

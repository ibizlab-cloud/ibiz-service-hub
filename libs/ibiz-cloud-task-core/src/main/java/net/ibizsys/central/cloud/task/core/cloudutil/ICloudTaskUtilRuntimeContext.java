package net.ibizsys.central.cloud.task.core.cloudutil;

import net.ibizsys.central.cloud.core.util.domain.JobsInfo;

public interface ICloudTaskUtilRuntimeContext {

	/**
	 * 执行任务
	 * @param jobsInfo
	 * @param objData
	 */
	void executeTask(JobsInfo jobsInfo, Object objData);
}

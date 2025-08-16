package net.ibizsys.central.cloud.core.cloudutil;

import java.util.Map;

/**
 * 云体系作业功能组件接口
 * @author lionlau
 *
 */
public interface ICloudTaskUtilRuntime extends ICloudUtilRuntime{

	
	/**
	 * 执行任务
	 * @param strId
	 * @param params
	 * @return
	 */
	Object executeTask(String strId, Map params);
	
	
	/**
	 * 开始定时任务
	 * @param strId
	 */
	void startTask(String strId);
	
	
	/**
	 * 停止定时任务
	 * @param strId
	 */
	void stopTask(String strId);
	
	
}




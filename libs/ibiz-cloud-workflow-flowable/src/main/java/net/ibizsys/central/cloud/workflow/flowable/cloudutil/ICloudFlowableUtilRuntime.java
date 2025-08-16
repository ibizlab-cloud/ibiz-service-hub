package net.ibizsys.central.cloud.workflow.flowable.cloudutil;

import java.util.Map;

import org.flowable.bpmn.model.UserTask;
import org.flowable.engine.ProcessEngine;

import net.ibizsys.central.cloud.core.cloudutil.ICloudWFUtilRuntime;

public interface ICloudFlowableUtilRuntime extends ICloudWFUtilRuntime{

	/**
	 * 获取工作流引擎
	 * @return
	 */
	ProcessEngine getProcessEngine();
	
	/**
	 * 获取处理的全局配置
	 * @param strDefinitionId
	 * @return
	 */
	Map<String,Object> getProcessGlobalSetting(String strDefinitionId);
	
	
	/**
	 * 获取用户任务
	 * @param strDefinitionKey
	 * @return
	 */
	Map<String,UserTask> getUserTasksByDefinitionKey(String strDefinitionKey);
	
	/**
	 * 获取用户任务
	 * @param strDefinitionKey
	 * @return
	 */
	Map<String,UserTask> getUserTasksByDefinitionId(String strDefinitionId);
	
	
	
}

package net.ibizsys.central.plugin.task.sysutil.addin;

import java.util.Map;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.plugin.task.addin.IExecutor;

public abstract class ExecutorBase extends SysTaskUtilRTAddinBase implements IExecutor {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(ExecutorBase.class);


	
	@Override
	public String getType() {
		return (String) this.getAddinData();
	}
	
	
	@Override
	public Object execute(Map<String, Object> schedule, Map<String, Object> taskType, Object objData) throws Throwable {
		return onExecute(schedule, taskType, objData);
	}
	
	protected abstract Object onExecute(Map<String, Object> schedule, Map<String, Object> taskType, Object objData) throws Throwable;
}
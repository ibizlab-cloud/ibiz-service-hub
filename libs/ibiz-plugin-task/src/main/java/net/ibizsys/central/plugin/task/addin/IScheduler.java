package net.ibizsys.central.plugin.task.addin;

import java.util.List;
import java.util.Map;

import net.ibizsys.runtime.plugin.IModelRTAddin;

public interface IScheduler extends IModelRTAddin{

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
	 * 获取类型
	 * @return
	 */
	String getType();
	
	/**
	 * 开始代理
	 */
	void start() throws Exception;
	
	/**
	 * 停止代理
	 */
	void stop() throws Exception;
	

	/**
	 * 刷新计划
	 * @param list
	 */
	void refreshSchedules(List<Map> list) throws Throwable;
}

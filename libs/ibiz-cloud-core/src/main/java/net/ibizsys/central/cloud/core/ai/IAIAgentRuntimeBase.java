package net.ibizsys.central.cloud.core.ai;

public interface IAIAgentRuntimeBase {

	public final static String AIAGENT_CHAT = "AICHAT";
	
	public final static String AIAGENT_WORKER = "AIWORKER";
	
	public final static String AIAGENT_PIPELINE = "AIPIPELINE";
	
	
	/**
	 * AI代理模式：默认
	 */
	public final static String AIAGENTMODE_DEFAULT = "DEFAULT";
	
	
	/**
	 * 行为用户参数：传入模板参数
	 */
	public final static String PARAM_TEMPLPARAMS = "templparams";
	
	
	/**
	 * 目标参数参数：当前数据，列表类型
	 */
	public final static String TEMPLPARAM_DATA = "DATA";
	
	
	/**
	 * 目标参数参数：当前数据对象
	 */
	public final static String TEMPLPARAM_ENTITY = "entity";
	
	
	
	/**
	 * 获取代理类型
	 * @return
	 */
	String getAgentType();
	
	
	
	/**
	 * 获取代理模式
	 * @return
	 */
	String getAgentMode();
	
	

}

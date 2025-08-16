package net.ibizsys.central.plugin.ai.agent;

import net.ibizsys.central.cloud.core.ai.IAIAgentRuntimeBase;
import net.ibizsys.central.plugin.ai.sysutil.ISysAIFactoryUtilRuntimeContext;
import net.ibizsys.runtime.plugin.IModelRTAddin;

public interface IAIAgent extends IAIAgentRuntimeBase, IModelRTAddin {

//	public final static String AIAGENT_CHAT = "AICHAT";
//	
//	public final static String AIAGENT_WORKER = "AIWORKER";
//	
//	public final static String AIAGENT_PIPELINE = "AIPIPELINE";
//	
//	
//	/**
//	 * AI代理模式：默认
//	 */
//	public final static String AIAGENTMODE_DEFAULT = "DEFAULT";
//	
//	
//	/**
//	 * 行为用户参数：传入模板参数
//	 */
//	public final static String PARAM_TEMPLPARAMS = "templparams";
//	
//	
//	/**
//	 * 目标参数参数：当前数据，列表类型
//	 */
//	public final static String TEMPLPARAM_DATA = "DATA";
//	
//	
//	/**
//	 * 目标参数参数：当前数据对象
//	 */
//	public final static String TEMPLPARAM_ENTITY = "entity";
	
	
	
	/**
	 * 初始化
	 * @param ctx
	 * @param addinData
	 * @param mode
	 * @throws Exception
	 */
	void init(ISysAIFactoryUtilRuntimeContext ctx, Object addinData, String strAgentMode) throws Exception;
	
	
	
	/**
	 * 获取代理模式
	 * @return
	 */
	String getAgentMode();
	
	
	
	/**
	 * 获取代理类型
	 * @return
	 */
	String getAgentType();
}

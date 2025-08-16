package net.ibizsys.central.plugin.ai.agent;

import java.util.Map;

/**
 * AI 流水线代理对象
 * @author lionlau
 *
 */
public interface IAIPipelineAgent extends IAIAgent{

	/**
	 * 运行流水线
	 * @param nRound 指定轮次，-1为无限制
	 * @param params 动态参数
	 */
	void run(int nRound, Map<String, Object> params) throws Throwable;
	
	/**
	 * 运行流水线
	 * @param target 运行目标
	 * @param nRound 指定轮次，-1为无限制
	 * @param params 动态参数
	 */
	void run(Object target, int nRound, Map<String, Object> params) throws Throwable;
}

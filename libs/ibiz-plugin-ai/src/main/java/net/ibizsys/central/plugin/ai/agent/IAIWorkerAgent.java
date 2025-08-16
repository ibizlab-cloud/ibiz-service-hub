package net.ibizsys.central.plugin.ai.agent;

import java.util.Map;

/**
 * AI 工作者代理对象接口
 * @author lionlau
 *
 */
public interface IAIWorkerAgent extends IAIAgent{

	/**
	 * 完成指定工作
	 * @param iAIPipelineRunSession
	 * @param job
	 * @param params
	 * @return
	 */
	Object finish(IAIPipelineRunSession iAIPipelineRunSession, Object job, Map<String, Object> params) throws Throwable;
	
}

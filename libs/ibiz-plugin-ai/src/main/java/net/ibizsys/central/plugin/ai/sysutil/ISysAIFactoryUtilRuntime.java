package net.ibizsys.central.plugin.ai.sysutil;

import net.ibizsys.central.cloud.core.sysutil.ISysUtilRuntime;
import net.ibizsys.central.plugin.ai.agent.IAIChatAgent;
import net.ibizsys.central.plugin.ai.agent.IAIPipelineAgent;
import net.ibizsys.central.plugin.ai.agent.IAIWorkerAgent;
import net.ibizsys.central.res.ISysFileResourceRuntime;

/**
 * 系统AI工厂功能组件运行时接口
 * @author lionlau
 *
 */
public interface ISysAIFactoryUtilRuntime extends ISysUtilRuntime, ISysAIFactoryUtilRuntimeBase{

	/**
	 * 流水线插件前缀
	 */
	public final static String ADDIN_AIPIPELINE_PREFIX = "AIPIPELINE:";
	
	
	/**
	 * 工作者插件前缀
	 */
	public final static String ADDIN_AIWORKER_PREFIX = "AIWORKER:";
	
	/**
	 * 工作者插件前缀
	 */
	public final static String ADDIN_AICHAT_PREFIX = "AICHAT:";
	
	
	
	
	/**
	 * 通过生产线数据获取工作者代理对象
	 * @param aiPipelineAgentData
	 * @return
	 */
	IAIPipelineAgent getAIPipelineAgent(Object aiPipelineAgentData);
	
	
	
	/**
	 * 通过工作者数据获取工作者代理对象
	 * @param aiWorkerAgentData
	 * @return
	 */
	IAIWorkerAgent getAIWorkerAgent(Object aiWorkerAgentData);
	
	
	/**
	 * 通过工作者数据重置工作者代理对象
	 * @param aiWorkerAgentData
	 * @return
	 */
	boolean resetAIWorkerAgent(Object aiWorkerAgentData);
	
	
	/**
	 * 重置全部AI工作者代理对象
	 */
	void resetAIWorkerAgents();
	
	
	/**
	 * 通过交谈数据获取交谈代理对象
	 * @param aiChatAgentData
	 * @return
	 */
	IAIChatAgent getAIChatAgent(Object aiChatAgentData);
	
	
	/**
	 * 通过交谈数据重置交谈代理对象
	 * @param aiChatAgentData
	 * @return
	 */
	boolean resetAIChatAgent(Object aiChatAgentData);
	
	
	
	/**
	 * 重置全部AI交谈代理对象
	 */
	void resetAIChatAgents();
	
	/**
	 * 获取工厂配置文件资源运行时对象
	 * @param bTryMode 尝试模式 
	 * @return
	 */
	ISysFileResourceRuntime getConfigSysFileResourceRuntime(boolean bTryMode);
	
	
	
	/**
	 * 重置全部对象
	 */
	void resetAll();
}

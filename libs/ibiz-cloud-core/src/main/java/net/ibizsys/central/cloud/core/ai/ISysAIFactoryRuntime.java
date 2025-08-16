package net.ibizsys.central.cloud.core.ai;

import net.ibizsys.central.ISystemModelRuntime;
import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.cloud.core.util.IChatResourceUtils;
import net.ibizsys.central.res.ISysFileResourceRuntime;
import net.ibizsys.central.service.ISubSysServiceAPIRuntimeBase;
import net.ibizsys.model.ai.IPSSysAIChatAgent;
import net.ibizsys.model.ai.IPSSysAIFactory;
import net.ibizsys.model.ai.IPSSysAIPipelineAgent;
import net.ibizsys.model.ai.IPSSysAIWorkerAgent;
import net.ibizsys.runtime.IModelRuntimeShutdownable;

/**
 * 系统AI工厂运行时
 * @author lionlau
 *
 */
public interface ISysAIFactoryRuntime extends ISystemModelRuntime, IAIFactoryRuntimeBase, ISubSysServiceAPIRuntimeBase, IModelRuntimeShutdownable{


	/**
	 * 初始化系统AI工厂运行时
	 * @param iSystemRuntimeContext
	 * @param iPSSysAIFactory
	 * @throws Exception
	 */
	void init(ISystemRuntimeContext iSystemRuntimeContext, IPSSysAIFactory iPSSysAIFactory) throws Exception;

	
	/**
	 * 安装功能
	 * @throws Throwable
	 */
	void install() throws Exception;

	
	/**
	 * 是否已经安装
	 * @return
	 */
	boolean isInstalled();
	
	/**
	 * 卸载功能
	 */
	void uninstall();
	
	
	/**
	 * 获取系统AI工厂模型
	 * @return
	 */
	IPSSysAIFactory getPSSysAIFactory();
	

	/**
	 * 获取AI工厂类型
	 * @return
	 */
	String getAIFactoryType();
	
	
	/**
	 * 设置AI工厂类型
	 * @param strAIFactoryType
	 */
	void setAIFactoryType(String strAIFactoryType);
	
	
	
	
	/**
	 * 获取指定系统AI交谈代理运行时对象
	 * @param strAIChatAgentName
	 * @param bTryMode
	 * @return
	 */
	ISysAIChatAgentRuntime getAIChatAgentRuntime(String strAIChatAgentName, boolean bTryMode);
	
	
	
	
	
	/**
	 * 获取指定系统AI交谈代理运行时对象
	 * @param iPSSysAIChatAgent
	 * @return
	 */
	ISysAIChatAgentRuntime getSysAIChatAgentRuntime(IPSSysAIChatAgent iPSSysAIChatAgent);
	
	
	/**
	 * 获取指定系统AI工作者代理运行时对象
	 * @param strAIWorkerAgentName
	 * @param bTryMode
	 * @return
	 */
	ISysAIWorkerAgentRuntime getAIWorkerAgentRuntime(String strAIWorkerAgentName, boolean bTryMode);
	
	
	
	/**
	 * 获取指定系统AI工作者代理运行时对象
	 * @param iPSSysAIWorkerAgent
	 * @return
	 */
	ISysAIWorkerAgentRuntime getSysAIWorkerAgentRuntime(IPSSysAIWorkerAgent iPSSysAIWorkerAgent);
	
	
	/**
	 * 获取指定系统AI生产线代理运行时对象
	 * @param strAIPipelineAgentName
	 * @param bTryMode
	 * @return
	 */
	ISysAIPipelineAgentRuntime getAIPipelineAgentRuntime(String strAIPipelineAgentName, boolean bTryMode);
	
	
	
	/**
	 * 获取指定系统AI生产线代理运行时对象
	 * @param iPSSysAIPipelineAgent
	 * @return
	 */
	ISysAIPipelineAgentRuntime getSysAIPipelineAgentRuntime(IPSSysAIPipelineAgent iPSSysAIPipelineAgent);
	
	
	/**
	 * 获取工厂配置文件资源运行时对象
	 * @param bTryMode 尝试模式 
	 * @return
	 */
	ISysFileResourceRuntime getConfigSysFileResourceRuntime(boolean bTryMode);
	
	
	
	/**
	 * 获取工厂的聊天资源功能对象
	 * @return
	 */
	IChatResourceUtils getChatResourceUtils();
	
}

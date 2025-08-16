package net.ibizsys.central.cloud.core.ai;

public interface IAIFactoryRuntimeBase {

	/**
	 * 获取指定系统AI交谈代理运行时对象
	 * @param strAIChatAgentName
	 * @param bTryMode
	 * @return
	 */
	IAIChatAgentRuntimeBase getAIChatAgentRuntime(String strAIChatAgentName, boolean bTryMode);
	
	
	
	
	/**
	 * 重新加载AI工厂
	 */
	void reload();
}

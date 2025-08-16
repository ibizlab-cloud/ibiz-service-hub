package net.ibizsys.central.plugin.ai.agent;

import net.ibizsys.runtime.plugin.IModelRTAddin;

public interface IAIChatProvider extends IModelRTAddin{

	/**
	 * 建立传入交谈数据的代理对象
	 * @param aiChatAgentData
	 * @return
	 */
	IAIChatAgent createAIChatAgent(Object aiChatAgentData);
}

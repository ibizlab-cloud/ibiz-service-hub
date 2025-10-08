package net.ibizsys.central.cloud.core.ai;

public interface ISysAIChatAgentRuntimeContext extends IAIChatAgentRuntimeBaseContext, ISysAIAgentRuntimeContext{

	/**
	 * 获取聊天历史消息数量
	 * @return
	 */
	int getHistoryCount();
}

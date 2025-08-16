package net.ibizsys.central.cloud.core.ai;

import java.util.Map;

import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;

public interface IAIWorkerAgentRuntimeBase extends IAIAgentRuntimeBase{

	/**
	 * 同步聊天补全操作
	 * @param strMode 模式
	 * @param dataOrKeys 键值或数据对象
	 * @param chatCompletionRequest
	 * @param params
	 * @param bAppendSystemMessage 附加系统消息
	 * @param bAppendHistories 附加历史消息
	 * @return
	 * @throws Throwable
	 */
	ChatCompletionResult chatCompletion(String strMode, Object dataOrKeys, ChatCompletionRequest chatCompletionRequest, Map<String, Object> params, boolean bAppendSystemMessage, boolean bAppendHistories) throws Throwable;


}

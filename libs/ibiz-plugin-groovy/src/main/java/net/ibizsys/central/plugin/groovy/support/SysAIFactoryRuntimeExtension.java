package net.ibizsys.central.plugin.groovy.support;

import net.ibizsys.central.cloud.core.ai.IAIFactoryRuntimeBase;
import net.ibizsys.central.cloud.core.ai.IAIWorkerAgentRuntimeBase;
import net.ibizsys.central.cloud.core.ai.ISysAIChatAgentRuntime;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;

public class SysAIFactoryRuntimeExtension {

	public static String chatCompletion(IAIWorkerAgentRuntimeBase iAIWorkerAgentRuntimeBase, Object dataOrKeys) throws Throwable {
		ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();
		ChatCompletionResult chatCompletionResult = iAIWorkerAgentRuntimeBase.chatCompletion("default", dataOrKeys, chatCompletionRequest, null, true, true);
		return chatCompletionResult.getChoices().get(0).getContent();
	}
	
	public static String chatCompletion(IAIWorkerAgentRuntimeBase iAIWorkerAgentRuntimeBase, String strMode, Object dataOrKeys) throws Throwable {
		ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();
		ChatCompletionResult chatCompletionResult = iAIWorkerAgentRuntimeBase.chatCompletion(strMode, dataOrKeys, chatCompletionRequest, null, true, true);
		return chatCompletionResult.getChoices().get(0).getContent();
	}
	
	public static String chatCompletion(IAIWorkerAgentRuntimeBase iAIWorkerAgentRuntimeBase, String strMode, Object dataOrKeys, boolean bAppendSystemMessage) throws Throwable {
		ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();
		ChatCompletionResult chatCompletionResult = iAIWorkerAgentRuntimeBase.chatCompletion(strMode, dataOrKeys, chatCompletionRequest, null, bAppendSystemMessage, true);
		return chatCompletionResult.getChoices().get(0).getContent();
	}
	
	public static ISysAIChatAgentRuntime chatAgent(IAIFactoryRuntimeBase iAIFactoryRuntimeBase, String strAIChatAgentTag, boolean bTryMode) {
		return (ISysAIChatAgentRuntime)iAIFactoryRuntimeBase.getAIChatAgentRuntime(strAIChatAgentTag, bTryMode);
	}
	
	public static ISysAIChatAgentRuntime chatAgent(IAIFactoryRuntimeBase iAIFactoryRuntimeBase, String strAIChatAgentTag) {
		return (ISysAIChatAgentRuntime)iAIFactoryRuntimeBase.getAIChatAgentRuntime(strAIChatAgentTag, false);
	}
}

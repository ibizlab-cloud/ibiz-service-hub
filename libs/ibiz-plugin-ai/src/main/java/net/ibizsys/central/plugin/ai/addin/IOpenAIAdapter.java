package net.ibizsys.central.plugin.ai.addin;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.ibizsys.central.cloud.core.ai.IAIChatAgentRuntimeBase;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.runtime.plugin.IModelRTAddin2;

/**
 * OpenAI兼容适配器
 * @author lionlau
 *
 */
public interface IOpenAIAdapter  extends IModelRTAddin2 {

	/**
	 * 交谈补全
	 * @param iAIChatAgentRuntimeBase
	 * @param chatCompletionRequest
	 * @param request
	 * @param response
	 * @param body
	 * @return
	 * @throws Throwable
	 */
	Object chatCompletion(IAIChatAgentRuntimeBase iAIChatAgentRuntimeBase, ChatCompletionRequest chatCompletionRequest, HttpServletRequest request, HttpServletResponse response, Map<String, Object> body) throws Throwable;
	
}

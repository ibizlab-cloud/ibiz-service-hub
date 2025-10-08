package net.ibizsys.central.cloud.ai.core.addin;

import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.cloudutil.ICloudAIUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.runtime.util.DataTypeUtils;

public abstract class QwenOpenAIAccessAgentBase extends OpenAIAccessAgentBase {

	@Override
	public String getName() {
		return ICloudAIUtilRuntime.AIPLATFORM_QWEN;
	}
	
	@Override
	protected void onFillChatCompletionBody(ChatCompletionRequest chatCompletionRequest, Map<String, Object> body) throws Exception {
		final String strThink = this.getAgentData().getThink();
		
		if(StringUtils.hasLength(strThink)) {
			if("true".equalsIgnoreCase(strThink)) {
				body.put("enable_thinking", true);
			}
			else
				if("false".equalsIgnoreCase(strThink)) {
					body.put("enable_thinking", false);
				}
		}
		
		
		if(DataTypeUtils.asBoolean(body.get("enable_thinking"), false)) {
			if(this.getAgentData().getThinkBudget() != null && this.getAgentData().getThinkBudget() > 0) {
				body.put("thinking_budget", this.getAgentData().getThinkBudget());
			}
		}
		
		if(!ObjectUtils.isEmpty(body.get("tools"))) {
			final String strParallelToolCall = this.getAgentData().getParallelToolCall();
			if(StringUtils.hasLength(strParallelToolCall)) {
				if("true".equalsIgnoreCase(strParallelToolCall)) {
					body.put("parallel_tool_calls", true);
				}
				else
					if("false".equalsIgnoreCase(strParallelToolCall)) {
						body.put("parallel_tool_calls", false);
					}
			}
		}
		
		if (chatCompletionRequest.getMaxInputTokens() != null && chatCompletionRequest.getMaxInputTokens() > 0) {
			body.put("max_input_tokens", chatCompletionRequest.getMaxInputTokens());
		} else if (this.getAgentData().getMaxInputTokens() != null && this.getAgentData().getMaxInputTokens() > 0) {
			body.put("max_input_tokens", this.getAgentData().getMaxInputTokens());
		}
		
		
		super.onFillChatCompletionBody(chatCompletionRequest, body);
	}
	
}

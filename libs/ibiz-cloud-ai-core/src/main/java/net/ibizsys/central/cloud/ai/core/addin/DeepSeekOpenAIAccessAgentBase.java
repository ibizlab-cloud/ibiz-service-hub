package net.ibizsys.central.cloud.ai.core.addin;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.cloudutil.ICloudAIUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.runtime.util.DataTypeUtils;

public abstract class DeepSeekOpenAIAccessAgentBase extends OpenAIAccessAgentBase {
	
	@Override
	public String getName() {
		return ICloudAIUtilRuntime.AIPLATFORM_DEEPSEEK;
	}
	
	@Override
	protected void onInit() throws Exception {
		
		
		super.onInit();
	}
	
	
	
	@Override
	protected void onFillChatCompletionBody(ChatCompletionRequest chatCompletionRequest, Map<String, Object> body) throws Exception {
		String strThink = this.getAgentData().getThink();
		if(chatCompletionRequest.getThinking()!=null) {
			strThink = DataTypeUtils.asBoolean(chatCompletionRequest.getThinking(), true)?"true":"false";
		}
		
		
		if(StringUtils.hasLength(strThink)) {
			if("true".equalsIgnoreCase(strThink)) {
				Map<String, String> thinking = new HashMap<String, String>();
				thinking.put("type", "enabled");
				body.put("thinking", thinking);
			}
		}
		
//		
//		if(DataTypeUtils.asBoolean(body.get("enable_thinking"), false)) {
//			if(this.getAgentData().getThinkBudget() != null && this.getAgentData().getThinkBudget() > 0) {
//				body.put("thinking_budget", this.getAgentData().getThinkBudget());
//			}
//		}
//		
//		if(!ObjectUtils.isEmpty(body.get("tools"))) {
//			final String strParallelToolCall = this.getAgentData().getParallelToolCall();
//			if(StringUtils.hasLength(strParallelToolCall)) {
//				if("true".equalsIgnoreCase(strParallelToolCall)) {
//					body.put("parallel_tool_calls", true);
//				}
//				else
//					if("false".equalsIgnoreCase(strParallelToolCall)) {
//						body.put("parallel_tool_calls", false);
//					}
//			}
//		}
//		
//		if (chatCompletionRequest.getMaxInputTokens() != null && chatCompletionRequest.getMaxInputTokens() > 0) {
//			body.put("max_input_tokens", chatCompletionRequest.getMaxInputTokens());
//		} else if (this.getAgentData().getMaxInputTokens() != null && this.getAgentData().getMaxInputTokens() > 0) {
//			body.put("max_input_tokens", this.getAgentData().getMaxInputTokens());
//		}
		
		
		super.onFillChatCompletionBody(chatCompletionRequest, body);
	}
	
	@Override
	protected void onFillChatMessageBody(ChatMessage chatMessage, Map<String, Object> body) throws Exception {
		Object tool_calls = body.get("tool_calls");
		if(tool_calls != null) {
			Object content = body.remove("content");
			body.put(FIELD_REASONING_CONTENT, content);
		}
		super.onFillChatMessageBody(chatMessage, body);
	}

}

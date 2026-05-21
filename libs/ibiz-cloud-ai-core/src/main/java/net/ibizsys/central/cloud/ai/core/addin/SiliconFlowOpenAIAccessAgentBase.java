package net.ibizsys.central.cloud.ai.core.addin;

import java.util.Map;

import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.cloudutil.ICloudAIUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.runtime.util.DataTypeUtils;

public abstract class SiliconFlowOpenAIAccessAgentBase extends OpenAIAccessAgentBase {
	
	
	
	@Override
	public String getName() {
		return ICloudAIUtilRuntime.AIPLATFORM_SILICONFLOW;
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
		
		
		super.onFillChatCompletionBody(chatCompletionRequest, body);
	}
	

	@Override
	protected String getDefaultTextReRankModel() {
		return "Qwen/Qwen3-Reranker-8B";
	}
	
}

package net.ibizsys.central.cloud.ai.core.addin;

import java.util.Map;

import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.cloudutil.ICloudAIUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;

public abstract class QwenOpenAIAccessAgentBase extends OpenAIAccessAgentBase {

	@Override
	public String getName() {
		return ICloudAIUtilRuntime.AIPLATFORM_QWEN;
	}
	
	@Override
	protected void onFillChatCompletionBody(ChatCompletionRequest chatCompletionRequest, Map<String, Object> body) throws Exception {
		final String strThink = this.getAgentData().getThink();
		
//		Map<String, Object> extra_body = (Map<String, Object>)body.get("extra_body");
//		if(extra_body == null) {
//			extra_body = new LinkedHashMap<String, Object>();
//		}
		if(StringUtils.hasLength(strThink)) {
			if("true".equalsIgnoreCase(strThink)) {
				body.put("enable_thinking", true);
			}
			else
				if("false".equalsIgnoreCase(strThink)) {
					body.put("enable_thinking", false);
				}
		}
		
//		if(!ObjectUtils.isEmpty(extra_body)) {
//			body.put("extra_body", extra_body);
//		}
		
		super.onFillChatCompletionBody(chatCompletionRequest, body);
	}
	
}

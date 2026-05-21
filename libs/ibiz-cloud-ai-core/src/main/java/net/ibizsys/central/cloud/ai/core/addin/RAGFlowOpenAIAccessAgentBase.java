package net.ibizsys.central.cloud.ai.core.addin;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.cloudutil.ICloudAIUtilRuntime;

public abstract class RAGFlowOpenAIAccessAgentBase extends OpenAIAccessAgentBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(RAGFlowOpenAIAccessAgentBase.class);
	
	private String strAgentId = null;
	private String strChatId = null;
	
	@Override
	protected void onInit() throws Exception {
		this.strAgentId = (String) this.getAgentData().get("agentid");
		this.strChatId = (String) this.getAgentData().get("chatid");
		super.onInit();
	}
	
	@Override
	public String getName() {
		return ICloudAIUtilRuntime.AIPLATFORM_RAGFLOW;
	}
	
	protected String getAgentId() {
		return this.strAgentId;
	}
	
	protected String getChatId() {
		return this.strChatId;
	}
	
	
	@Override
	protected String getChatCompletionServiceUrl() {
		if(StringUtils.hasLength(this.getAgentId())) {
			return String.format("%1$s/api/v1/agents_openai/%2$s/chat/completions", this.getAgentData().getServiceUrl(), this.getAgentId());
		}
		else {
			return String.format("%1$s/api/v1/chats_openai/%2$s/chat/completions", this.getAgentData().getServiceUrl(), this.getChatId());
		}
		
	}
	
	@Override
	protected String getChatCompletionDataPrefix() {
		return "data:";
	}
	
}

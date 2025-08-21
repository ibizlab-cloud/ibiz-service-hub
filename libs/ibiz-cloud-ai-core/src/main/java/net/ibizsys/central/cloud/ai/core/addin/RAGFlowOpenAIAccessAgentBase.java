package net.ibizsys.central.cloud.ai.core.addin;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.cloudutil.ICloudAIUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.ChatMessageRole;
import net.ibizsys.central.cloud.core.util.domain.ChatTool;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.JsonUtils;

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
	protected String getCompletionsServiceUrl() {
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

package net.ibizsys.central.cloud.ai.core.addin;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.cloud.core.cloudutil.ICloudAIUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudAIClient;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.CompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.CompletionResult;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.runtime.SystemRuntimeException;

public class SimpleAIAccessAgent  extends AIAccessAgentBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SimpleAIAccessAgent.class);
	private ICloudAIClient iCloudAIClient = null;

	@Override
	protected void onInit() throws Exception {
		super.onInit();

		if (getCloudAIClient(true) == null) {
			this.prepareCloudAIClient();

			if (this.getCloudAIClient(true) == null) {
				throw new Exception(String.format("AI客户端对象对象无效"));
			}
		}
	}

	@Override
	protected void runAuthTimer() {
		// super.runAuthTimer();
	}

	protected ICloudAIClient getCloudAIClient() {
		return this.getCloudAIClient(false);
	}

	protected ICloudAIClient getCloudAIClient(boolean bTryMode) {
		if (this.iCloudAIClient != null || bTryMode) {
			return this.iCloudAIClient;
		}
		throw new SystemRuntimeException(this.getContext().getCloudAIUtilRuntime().getSystemRuntime(), this.getContext().getCloudAIUtilRuntime(), "未指定AI服务对象");
	}

	protected void setCloudAIClient(ICloudAIClient iCloudAIClient) {
		this.iCloudAIClient = iCloudAIClient;
	}

	protected void prepareCloudAIClient() throws Exception {

		String strServiceUrl = this.getAgentData().getServiceUrl();
		IWebClient iWebClient = this.getSystemRuntime().createWebClient(strServiceUrl);
		iWebClient.init(this.getSystemRuntime(), strServiceUrl, null);
		
		ICloudAIClient iCloudAIClient = iWebClient.getProxyClient(ICloudAIClient.class);
		
		this.setCloudAIClient(iCloudAIClient);
	}

	@Override
	public String getName() {
		return ICloudAIUtilRuntime.AIPLATFORM_SIMPLE;
	}

	@Override
	protected ChatCompletionResult onChatCompletion(ChatCompletionRequest chatCompletionRequest) throws Throwable {
		return this.getCloudAIClient().chatCompletion("simple", chatCompletionRequest);
		
	}
	
	@Override
	protected CompletionResult onCompletion(CompletionRequest completionRequest) throws Throwable {
		return this.getCloudAIClient().completion("simple", completionRequest);
	}

}

package net.ibizsys.central.cloud.ai.openai.gpt3.addin;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.theokanning.openai.OpenAiApi;
import com.theokanning.openai.service.OpenAiService;

import net.ibizsys.central.cloud.ai.core.addin.AIAccessAgentBase;
import net.ibizsys.central.cloud.core.cloudutil.ICloudAIUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.Completion;
import net.ibizsys.central.cloud.core.util.domain.CompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.CompletionResult;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public class GPT3AIAccessAgent extends AIAccessAgentBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(GPT3AIAccessAgent.class);
	private OpenAiService openAiService = null;

	@Override
	protected void onInit() throws Exception {
		super.onInit();

		if (getOpenAiService(true) == null) {
			this.prepareOpenAiService();

			if (this.getOpenAiService(true) == null) {
				throw new Exception(String.format("AI服务对象无效"));
			}
		}

	}

	@Override
	protected void runAuthTimer() {
		// super.runAuthTimer();
	}

	protected OpenAiService getOpenAiService() {
		return this.getOpenAiService(false);
	}

	protected OpenAiService getOpenAiService(boolean bTryMode) {
		if (this.openAiService != null || bTryMode) {
			return this.openAiService;
		}
		throw new SystemRuntimeException(this.getContext().getCloudAIUtilRuntime().getSystemRuntime(), this.getContext().getCloudAIUtilRuntime(), "未指定AI服务对象");
	}

	protected void setOpenAiService(OpenAiService openAiService) {
		this.openAiService = openAiService;
	}

	protected void prepareOpenAiService() throws Exception {

		String token = this.getAgentData().getAccessToken();
		Proxy proxy = null;
		if(StringUtils.hasLength(this.getAgentData().getProxyUrl())){
			java.net.URL url = new java.net.URL(this.getAgentData().getProxyUrl());
			if(Proxy.Type.SOCKS.toString().equalsIgnoreCase(url.getProtocol())){
				proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(url.getHost(), (url.getPort()!=-1)?url.getPort():url.getDefaultPort()));
			}
			else {
				proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(url.getHost(), (url.getPort()!=-1)?url.getPort():url.getDefaultPort()));
			}
		}

		ObjectMapper mapper = OpenAiService.defaultObjectMapper();
		OkHttpClient client = OpenAiService.defaultClient(token, Duration.ofMillis(500000)).newBuilder().proxy(proxy).build();
		Retrofit retrofit = OpenAiService.defaultRetrofit(client, mapper);
		OpenAiApi api = retrofit.create(OpenAiApi.class);
		OpenAiService service = new OpenAiService(api);
		this.setOpenAiService(service);
	}

	@Override
	public String getName() {
		return ICloudAIUtilRuntime.AIPLATFORM_GPT3;
	}

	@Override
	protected ChatCompletionResult onChatCompletion(ChatCompletionRequest chatCompletionRequest) throws Throwable {
		final List<com.theokanning.openai.completion.chat.ChatMessage> chatMessageList = new ArrayList<>();
		if(!ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
			for (ChatMessage message : chatCompletionRequest.getMessages()) {
				if (!StringUtils.hasLength(message.getRole())) {
					continue;
				}
				chatMessageList.add(new com.theokanning.openai.completion.chat.ChatMessage(message.getRole().toLowerCase(), message.getContent()));
			}
		}

		com.theokanning.openai.completion.chat.ChatCompletionRequest request = com.theokanning.openai.completion.chat.ChatCompletionRequest.builder().model("gpt-3.5-turbo").messages(chatMessageList).n(1).user(chatCompletionRequest.getSessionId())
				// .maxTokens(4096)
				// .logitBias(new HashMap<>())
				.build();

		final StringBuilder sb = new StringBuilder();

		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		// service.
		getOpenAiService().streamChatCompletion(request).blockingForEach(it -> {
			String strContent = it.getChoices().get(0).getMessage().getContent();
			if (StringUtils.hasLength(strContent)) {
				sb.append(strContent);
				if(actionSession!=null) {
					String strStep = sb.toString();
					actionSession.updateActionStep(strStep, 0);
				}
			}
		});

		ChatMessage chatMessage = new ChatMessage();
		chatMessage.setRole(net.ibizsys.central.cloud.core.util.domain.ChatMessageRole.ASSISTANT.getValue());
		chatMessage.setContent(sb.toString());
		
		final List<ChatMessage> retMessageList = new ArrayList<>();
		retMessageList.add(chatMessage);
		
		ChatCompletionResult chatCompletionResult = new ChatCompletionResult();
		chatCompletionResult.setChoices(retMessageList);
		return chatCompletionResult;
		
	}
	
	@Override
	protected CompletionResult onCompletion(CompletionRequest completionRequest) throws Throwable {
		
		
		int nMaxTokens = 4096;
		if(completionRequest.containsMaxTokens()) {
			nMaxTokens = completionRequest.getMaxTokens();
		}
		else {
			if(StringUtils.hasLength(completionRequest.getPrompt())) {
				nMaxTokens = nMaxTokens - completionRequest.getPrompt().length();
			}
		}
		
		
		if(nMaxTokens <= 0) {
			throw new Exception("最大词数异常");
		}
		
		com.theokanning.openai.completion.CompletionRequest request = com.theokanning.openai.completion.CompletionRequest
				.builder()
				.model("text-davinci-003")
				.prompt(completionRequest.getPrompt())
				.n(1)
				.user(completionRequest.getSessionId())
				.maxTokens(nMaxTokens)
				// .logitBias(new HashMap<>())
				.build();

		final StringBuilder sb = new StringBuilder();

		ActionSession actionSession = ActionSessionManager.getCurrentSession();
		// service.
		getOpenAiService().streamCompletion(request).blockingForEach(it -> {
			String strContent = it.getChoices().get(0).getText();
			if (StringUtils.hasLength(strContent)) {
				sb.append(strContent);
				if(actionSession!=null) {
					String strStep = sb.toString();
					actionSession.updateActionStep(strStep, 0);
				}
			}
		});

		Completion completion = new Completion();
		completion.setContent(sb.toString());
		
		final List<Completion> completionList = new ArrayList<>();
		completionList.add(completion);
		
		CompletionResult completionResult = new CompletionResult();
		completionResult.setChoices(completionList);
		return completionResult;
	}

}

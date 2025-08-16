package net.ibizsys.central.cloud.ai.langchain.chatchat.addin;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.ai.core.addin.AIAccessAgentBase;
import net.ibizsys.central.cloud.core.cloudutil.ICloudAIUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.CompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.CompletionResult;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.runtime.SystemRuntimeException;

public class ChatchatAIAccessAgent extends AIAccessAgentBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(ChatchatAIAccessAgent.class);
	//private AIService openAiService = null;
	private IWebClient aiService = null;

	@Override
	protected void onInit() throws Exception {
		super.onInit();

		if (getAIService(true) == null) {
			this.prepareAIService();

			if (this.getAIService(true) == null) {
				throw new Exception(String.format("AI服务对象无效"));
			}
		}

	}

	@Override
	protected void runAuthTimer() {
		// super.runAuthTimer();
	}

	protected IWebClient getAIService() {
		return this.getAIService(false);
	}

	protected IWebClient getAIService(boolean bTryMode) {
		if (this.aiService != null || bTryMode) {
			return this.aiService;
		}
		throw new SystemRuntimeException(this.getContext().getCloudAIUtilRuntime().getSystemRuntime(), this.getContext().getCloudAIUtilRuntime(), "未指定AI服务对象");
	}

	protected void setAIService(IWebClient aiService) {
		this.aiService = aiService;
	}

	protected void prepareAIService() throws Exception {

		if(!StringUtils.hasLength(this.getAgentData().getServiceUrl())) {
			throw new Exception("未指定服务路径");
		}
		IWebClient iWebClient = this.getSystemRuntime().createWebClient(this.getAgentData().getServiceUrl());
		iWebClient.init(this.getSystemRuntime(), this.getAgentData().getServiceUrl(), null);
		
		this.setAIService(iWebClient);
	}

	@Override
	public String getName() {
		return ICloudAIUtilRuntime.AIPLATFORM_LANGCHAIN_CHATCHAT;
	}

	@Override
	protected ChatCompletionResult onChatCompletion(ChatCompletionRequest chatCompletionRequest) throws Throwable {
		
		String strQuery = null;
		List<Map> historyList= new ArrayList<Map>();
		if(!ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
			for(int i=0;i<chatCompletionRequest.getMessages().size()-1;i++) {
				ChatMessage message = chatCompletionRequest.getMessages().get(i);
				if(!StringUtils.hasLength(message.getRole())) {
					continue;
				}
				Map<String, String> history = new LinkedHashMap<String, String>();
				history.put("role", message.getRole().toLowerCase());
				history.put("content", message.getContent());
				historyList.add(history);
			}
			
			ChatMessage lastMessage = chatCompletionRequest.getMessages().get(chatCompletionRequest.getMessages().size()-1);
			strQuery = lastMessage.getContent();
		}
		
		if(!StringUtils.hasLength(strQuery)) {
			throw new Exception("未传入查询内容");
		}
		
		Map<String, Object> body = new LinkedHashMap<String, Object>();
		body.put("query", strQuery);
		body.put("history", historyList);
		body.put("stream", false);
		body.put("model_name", "bc2-13b-chat");
		body.put("temperature", 0.7);
	
		  
		IWebClientRep<String> rep =	this.getAIService().post("/chat/chat", null, body);
		
		ChatMessage chatMessage = new ChatMessage();
		chatMessage.setRole(net.ibizsys.central.cloud.core.util.domain.ChatMessageRole.ASSISTANT.getValue());
		chatMessage.setContent(rep.getBody());
		
		final List<ChatMessage> retMessageList = new ArrayList<>();
		retMessageList.add(chatMessage);
		
		ChatCompletionResult chatCompletionResult = new ChatCompletionResult();
		chatCompletionResult.setChoices(retMessageList);
		return chatCompletionResult;
		
		
//		final List<com.theokanning.openai.completion.chat.ChatMessage> chatMessageList = new ArrayList<>();
//		if(!ObjectUtils.isEmpty(chatCompletionRequest.getMessages())) {
//			for (ChatMessage message : chatCompletionRequest.getMessages()) {
//				if (!StringUtils.hasLength(message.getRole())) {
//					continue;
//				}
//				chatMessageList.add(new com.theokanning.openai.completion.chat.ChatMessage(message.getRole().toLowerCase(), message.getContent()));
//			}
//		}
//
//		com.theokanning.openai.completion.chat.ChatCompletionRequest request = com.theokanning.openai.completion.chat.ChatCompletionRequest.builder().model("gpt-3.5-turbo").messages(chatMessageList).n(1).user(chatCompletionRequest.getSessionId())
//				// .maxTokens(4096)
//				// .logitBias(new HashMap<>())
//				.build();
//
//		final StringBuilder sb = new StringBuilder();
//
//		ActionSession actionSession = ActionSessionManager.getCurrentSession();
//		// service.
//		getAIService().streamChatCompletion(request).blockingForEach(it -> {
//			String strContent = it.getChoices().get(0).getMessage().getContent();
//			if (StringUtils.hasLength(strContent)) {
//				sb.append(strContent);
//				if(actionSession!=null) {
//					String strStep = sb.toString();
//					actionSession.updateActionStep(strStep, 0, false);
//				}
//			}
//		});
//
//		ChatMessage chatMessage = new ChatMessage();
//		chatMessage.setRole(net.ibizsys.central.cloud.core.util.domain.ChatMessageRole.ASSISTANT.getValue());
//		chatMessage.setContent(sb.toString());
//		
//		final List<ChatMessage> retMessageList = new ArrayList<>();
//		retMessageList.add(chatMessage);
//		
//		ChatCompletionResult chatCompletionResult = new ChatCompletionResult();
//		chatCompletionResult.setChoices(retMessageList);
//		return chatCompletionResult;
//		return null;
	}
	
	@Override
	protected CompletionResult onCompletion(CompletionRequest completionRequest) throws Throwable {
		
//		
//		int nMaxTokens = 4096;
//		if(completionRequest.containsMaxTokens()) {
//			nMaxTokens = completionRequest.getMaxTokens();
//		}
//		else {
//			if(StringUtils.hasLength(completionRequest.getPrompt())) {
//				nMaxTokens = nMaxTokens - completionRequest.getPrompt().length();
//			}
//		}
//		
//		
//		if(nMaxTokens <= 0) {
//			throw new Exception("最大词数异常");
//		}
//		
//		com.theokanning.openai.completion.CompletionRequest request = com.theokanning.openai.completion.CompletionRequest
//				.builder()
//				.model("text-davinci-003")
//				.prompt(completionRequest.getPrompt())
//				.n(1)
//				.user(completionRequest.getSessionId())
//				.maxTokens(nMaxTokens)
//				// .logitBias(new HashMap<>())
//				.build();
//
//		final StringBuilder sb = new StringBuilder();
//
//		ActionSession actionSession = ActionSessionManager.getCurrentSession();
//		// service.
//		getAIService().streamCompletion(request).blockingForEach(it -> {
//			String strContent = it.getChoices().get(0).getText();
//			if (StringUtils.hasLength(strContent)) {
//				sb.append(strContent);
//				if(actionSession!=null) {
//					String strStep = sb.toString();
//					actionSession.updateActionStep(strStep, 0, false);
//				}
//			}
//		});
//
//		Completion completion = new Completion();
//		completion.setContent(sb.toString());
//		
//		final List<Completion> completionList = new ArrayList<>();
//		completionList.add(completion);
//		
//		CompletionResult completionResult = new CompletionResult();
//		completionResult.setChoices(completionList);
//		return completionResult;
		return null;
	}

}

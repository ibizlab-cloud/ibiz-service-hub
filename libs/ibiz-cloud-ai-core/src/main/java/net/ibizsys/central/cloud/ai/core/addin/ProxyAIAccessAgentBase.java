package net.ibizsys.central.cloud.ai.core.addin;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.cloudutil.ICloudAIUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.CompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.CompletionResult;
import net.ibizsys.central.cloud.core.util.domain.EmbeddingRequest;
import net.ibizsys.central.cloud.core.util.domain.EmbeddingResult;
import net.ibizsys.central.cloud.core.util.domain.TextReRankRequest;
import net.ibizsys.central.cloud.core.util.domain.TextReRankResult;
import net.ibizsys.central.util.WebResponseException;

public abstract class ProxyAIAccessAgentBase extends AIAccessAgentBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(ProxyAIAccessAgentBase.class);
	
	private Deque<String> accessIdDeque = new ArrayDeque<String>();
	private Deque<String> chatAccessIdDeque = new ArrayDeque<String>();
	
	@Override
	protected void onInit() throws Exception {
		Object accessIds = this.getAgentData().get("accessids");
		if(accessIds instanceof List) {
			accessIdDeque.addAll((List)accessIds);
		}
		else
			if(accessIds instanceof String) {
				List list = Arrays.asList(accessIds.toString().split("[,]"));
				accessIdDeque.addAll(list);
			}
		
		if(ObjectUtils.isEmpty(accessIdDeque)) {
			throw new Exception("未定义代理的应用标识");
		}
		
		Object chatAccessIds = this.getAgentData().get("chataccessids");
		if(chatAccessIds instanceof List) {
			chatAccessIdDeque.addAll((List)chatAccessIds);
		}
		else
			if(chatAccessIds instanceof String) {
				List list = Arrays.asList(chatAccessIds.toString().split("[,]"));
				chatAccessIdDeque.addAll(list);
			}
		
		if(chatAccessIdDeque.size() == 0) {
			chatAccessIdDeque.addAll(accessIdDeque);
		}
		
		super.onInit();
	}
	
	@Override
	protected void runAuthTimer() {
		
	}
	
	@Override
	public String getName() {
		return ICloudAIUtilRuntime.AIPLATFORM_PROXY;
	}
	
	protected String getRealAccessId() {
		String strAccessId = null;
		synchronized (this.accessIdDeque) {
			strAccessId = this.accessIdDeque.pollFirst();
			if (StringUtils.hasLength(strAccessId)) {
				this.accessIdDeque.addLast(strAccessId);
			}
		}
		return strAccessId;
	}
	
	protected String getRealChatAccessId() {
		String strAccessId = null;
		synchronized (this.chatAccessIdDeque) {
			strAccessId = this.chatAccessIdDeque.pollFirst();
			if (StringUtils.hasLength(strAccessId)) {
				this.chatAccessIdDeque.addLast(strAccessId);
			}
		}
		return strAccessId;
	}
	

	@Override
	public ChatCompletionResult chatCompletion(ChatCompletionRequest chatCompletionRequest) throws Throwable {
		Map<String, String> realChatAccessIdMap = new HashMap<>();
		String strRealChatAccessId = this.getRealChatAccessId();
		while(true) {
			if(ObjectUtils.isEmpty(strRealChatAccessId)) {
				throw new Exception("无效的AI交谈代理标识");
			}
			realChatAccessIdMap.put(strRealChatAccessId, "");
			try {
				return this.getContext().getAIAccessAgent(strRealChatAccessId, chatCompletionRequest).chatCompletion(chatCompletionRequest);
			}
			catch (Throwable ex) {
				if(ex instanceof WebResponseException) {
					//判断是否为429
					WebResponseException webResponseException = (WebResponseException)ex;
					if(webResponseException.getStatusCode() == HttpStatus.TOO_MANY_REQUESTS.value()) {
						//重新获取应用标识
						String strLast = strRealChatAccessId;
						strRealChatAccessId = this.getRealChatAccessId();
						if(StringUtils.hasLength(strRealChatAccessId) && !realChatAccessIdMap.containsKey(strRealChatAccessId)) {
							log.warn(String.format("AI交谈代理[%1$s]返回[429]，重试交谈代理[%2$s]", strLast, strRealChatAccessId));
							continue;
						}
					}
				}
				throw ex;
			}
		}
	}

	@Override
	public CompletionResult completion(CompletionRequest completionRequest) throws Throwable {
		return this.getContext().getAIAccessAgent(this.getRealChatAccessId(), completionRequest).completion(completionRequest);
	}

	@Override
	public EmbeddingResult embedding(EmbeddingRequest embeddingRequest) throws Throwable {
		return this.getContext().getAIAccessAgent(this.getRealAccessId(), embeddingRequest).embedding(embeddingRequest);
	}

	@Override
	public TextReRankResult textReRank(TextReRankRequest textReRankRequest) throws Throwable {
		return this.getContext().getAIAccessAgent(this.getRealAccessId(), textReRankRequest).textReRank(textReRankRequest);
	}
	
	
	
}

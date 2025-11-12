package net.ibizsys.central.cloud.ai.core.spring.controller;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import net.ibizsys.central.SystemGatewayException;
import net.ibizsys.central.cloud.ai.core.IAIUtilSystemRuntime;
import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.cloud.core.cloudutil.ICloudAIUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.CompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.CompletionResult;
import net.ibizsys.central.cloud.core.util.domain.EmbeddingRequest;
import net.ibizsys.central.cloud.core.util.domain.EmbeddingResult;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.central.cloud.core.util.domain.TextReRankRequest;
import net.ibizsys.central.cloud.core.util.domain.TextReRankResult;

@RestController()
@RequestMapping("")
public class AIRestController {

	private static final Log log = LogFactory.getLog(AIRestController.class);

	@Autowired
	IServiceHub iServiceHub;

	@PostConstruct
	protected void postConstruct() {
		log.debug(String.format("CloudAI服务已经启动"));
		iServiceHub.registerIgnoreAuthPattern("/ai/simple/**");
		iServiceHub.registerNamingService("ibizcloud-ai");
	}

	@Autowired(required=false)
	private ICloudAIUtilRuntime iCloudAIUtilRuntime = null;

	protected ICloudAIUtilRuntime getCloudAIUtilRuntime() {
		if (this.iCloudAIUtilRuntime == null) {
			try {
				this.iCloudAIUtilRuntime = iServiceHub.getCloudUtilRuntime(IAIUtilSystemRuntime.class, ICloudAIUtilRuntime.class, false);
			} catch (Throwable ex) {
				log.debug(String.format("未指定Cloud服务AI功能模块"), ex);
				throw new SystemGatewayException(iServiceHub, String.format("未指定Cloud服务AI功能模块"), ex);
			}
		}
		return this.iCloudAIUtilRuntime;
	}

	/**
	 * Chat交互
	 * @param type
	 * @param chatCompletionRequest
	 * @return
	 */
	@RequestMapping(method = {RequestMethod.POST}, value = {"/ai/{type}/chatcompletion","/ai/{type}/chatcompletions"})
	public ChatCompletionResult chatCompletion(@PathVariable("type") String type, @RequestBody ChatCompletionRequest chatCompletionRequest) {
		return this.getCloudAIUtilRuntime().chatCompletion(type, chatCompletionRequest);
	}
	
	
	/**
	 * 异步交谈补全
	 * @param type
	 * @param chatCompletionRequest
	 * @return
	 */
	@RequestMapping(method = {RequestMethod.POST}, value = { "/ai/{type}/asyncchatcompletion", "/ai/{type}/asyncchatcompletions"})
	public PortalAsyncAction asyncChatCompletion(@PathVariable("type") String type, @RequestBody ChatCompletionRequest chatCompletionRequest) {
		return this.getCloudAIUtilRuntime().asyncChatCompletion(type, chatCompletionRequest);
	}
	
	/**
	 * 异步交谈补全
	 * @param type
	 * @param chatCompletionRequest
	 * @return
	 */
	@RequestMapping(method = {RequestMethod.POST}, value = { "/ai/{type}/ssechatcompletion", "/ai/{type}/ssechatcompletions"})
	public SseEmitter sseChatCompletion(@PathVariable("type") String type, @RequestBody ChatCompletionRequest chatCompletionRequest) {
		return this.getCloudAIUtilRuntime().sseChatCompletion(type, chatCompletionRequest);
	}
	
	
	
	/**
	 * 补全
	 * @param type
	 * @param completionRequest
	 * @return
	 */
	@RequestMapping(method = {RequestMethod.POST}, value = {"/ai/{type}/completion", "/ai/{type}/completions"})
	public CompletionResult completion(@PathVariable("type") String type, @RequestBody CompletionRequest completionRequest) {
		return this.getCloudAIUtilRuntime().completion(type, completionRequest);
	}
	
	
	/**
	 * 异步补全
	 * @param type
	 * @param completionRequest
	 * @return
	 */
	@RequestMapping(method = {RequestMethod.POST}, value = { "/ai/{type}/asynccompletion", "/ai/{type}/asynccompletions"})
	public PortalAsyncAction asyncCompletion(@PathVariable("type") String type, @RequestBody CompletionRequest completionRequest) {
		return this.getCloudAIUtilRuntime().asyncCompletion(type, completionRequest);
	}
	
	/**
	 * 异步补全
	 * @param type
	 * @param completionRequest
	 * @return
	 */
	@RequestMapping(method = {RequestMethod.POST}, value = { "/ai/{type}/ssecompletion", "/ai/{type}/ssecompletions"})
	public SseEmitter sseCompletion(@PathVariable("type") String type, @RequestBody CompletionRequest completionRequest) {
		return this.getCloudAIUtilRuntime().sseCompletion(type, completionRequest);
	}
	
	
	/**
	 * 获取嵌入值
	 * @param type
	 * @param completionRequest
	 * @return
	 */
	@RequestMapping(method = {RequestMethod.POST}, value = {"/ai/{type}/embedding","/ai/{type}/embeddings"})
	public EmbeddingResult embedding(@PathVariable("type") String type, @RequestBody EmbeddingRequest embeddingRequest) {
		return this.getCloudAIUtilRuntime().embedding(type, embeddingRequest);
	}

	/**
	 * 获取嵌入值
	 * @param type
	 * @param completionRequest
	 * @return
	 */
	@RequestMapping(method = {RequestMethod.POST}, value = {"/ai/{type}/textrerank","/ai/{type}/textreranks"})
	public TextReRankResult textReRank(@PathVariable("type") String type, @RequestBody TextReRankRequest textReRankRequest) {
		return this.getCloudAIUtilRuntime().textReRank(type, textReRankRequest);
	}
}

package net.ibizsys.central.cloud.core.cloudutil.client;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.CompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.CompletionResult;
import net.ibizsys.central.cloud.core.util.domain.EmbeddingRequest;
import net.ibizsys.central.cloud.core.util.domain.EmbeddingResult;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.central.cloud.core.util.domain.TextReRankRequest;
import net.ibizsys.central.cloud.core.util.domain.TextReRankResult;

public interface ICloudAIClient {

	@RequestMapping(method = {RequestMethod.POST}, value = "/ai/{type}/chatcompletion")
	ChatCompletionResult chatCompletion(@PathVariable("type") String type, @RequestBody ChatCompletionRequest chatCompletionRequest);
	

	@RequestMapping(method = {RequestMethod.POST}, value = { "/ai/{type}/asyncchatcompletion"})
	PortalAsyncAction asyncChatCompletion(@PathVariable("type") String type, @RequestBody ChatCompletionRequest chatCompletionRequest);
	
	
	@RequestMapping(method = {RequestMethod.POST}, value = "/ai/{type}/completion")
	CompletionResult completion(@PathVariable("type") String type, @RequestBody CompletionRequest completionRequest);
	

	@RequestMapping(method = {RequestMethod.POST}, value = { "/ai/{type}/asynccompletion"})
	PortalAsyncAction asyncCompletion(@PathVariable("type") String type, @RequestBody CompletionRequest completionRequest);
	
	
	@RequestMapping(method = {RequestMethod.POST}, value = { "/ai/{type}/embedding"})
	EmbeddingResult embedding(@PathVariable("type") String type, @RequestBody EmbeddingRequest embeddingRequest);
	
	@RequestMapping(method = {RequestMethod.POST}, value = { "/ai/{type}/textrerank"})
	TextReRankResult textReRank(@PathVariable("type") String type, @RequestBody TextReRankRequest textReRankRequest);
	
	
}

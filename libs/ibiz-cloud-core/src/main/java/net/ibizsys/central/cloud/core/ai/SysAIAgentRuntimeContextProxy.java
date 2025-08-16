package net.ibizsys.central.cloud.core.ai;

import java.util.List;
import java.util.Map;

import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.Chunk;

public class SysAIAgentRuntimeContextProxy<M extends ISysAIAgentRuntime, C extends ISysAIAgentRuntimeContext> extends SysAIAgentRuntimeContextBase<M>{

	final C proxyContext;
	public SysAIAgentRuntimeContextProxy(C proxyContext) {
		this.proxyContext = proxyContext;
	}
	
	
	@Override
	public M getModelRuntime() {
		return (M)getProxyContext().getModelRuntime();
	}
	
	protected C getProxyContext() {
		return this.proxyContext;
	}

	@Override
	public String output(String strTemplateId) throws Throwable {
		return this.getProxyContext().output(strTemplateId);
	}

	@Override
	public String output(Object data, String strTemplateId) throws Throwable {
		return this.getProxyContext().output(data, strTemplateId);
	}

	@Override
	public String output(Object data, String strTemplateId, String strIndent) throws Throwable {
		return this.getProxyContext().output(data, strTemplateId, strIndent);
	}
	
	@Override
	public String outputRaw(String strTemplateId) throws Throwable {
		return this.getProxyContext().outputRaw(strTemplateId);
	}
	
	@Override
	public String outputRaw(String strTemplateId, String strIndent) throws Throwable {
		return this.getProxyContext().outputRaw(strTemplateId, strIndent);
	}

	@Override
	public boolean contains(String strTemplateId) {
		return this.getProxyContext().contains(strTemplateId);
	}

	
	@Override
	public List<Chunk> chunks(String query, Float similaritythreshold, Integer size) {
		return this.getProxyContext().chunks(query, similaritythreshold, size);
	}


	@Override
	public List<Chunk> chunks(String type, String query, Float similaritythreshold, Integer size) {
		return this.getProxyContext().chunks(type, query, similaritythreshold, size);
	}

	@Override
	public List<Chunk> chunks(String query) {
		return this.getProxyContext().chunks(query);
	}
	
	@Override
	public List<Chunk> chunks(String type, String query, Float similaritythreshold, Float vectorSimilarityWeight, Integer size) {
		return this.getProxyContext().chunks(type, query, similaritythreshold, vectorSimilarityWeight, size);
	}
	


	@Override
	public ChatCompletionResult rawChatCompletion(String strAIPlatformType, ChatCompletionRequest chatCompletionRequest) {
		return this.getProxyContext().rawChatCompletion(strAIPlatformType, chatCompletionRequest);
	}



	@Override
	public String rawChatCompletion(String strAIPlatformType, String strMessage) {
		return this.getProxyContext().rawChatCompletion(strAIPlatformType, strMessage);
	}



	@Override
	public ChatCompletionResult rawChatCompletion(ChatCompletionRequest chatCompletionRequest) {
		return this.getProxyContext().rawChatCompletion(chatCompletionRequest);
	}



	@Override
	public String rawChatCompletion(String strMessage) {
		return this.getProxyContext().rawChatCompletion(strMessage);
	}



	@Override
	protected String getContent(Object data, String strTemplateId, Map<String, Object> params, boolean bTryMode) throws Throwable {
		throw new Exception("没有实现");
	}



	@Override
	protected String getTemplateContent(String strConfigId, boolean bTryMode) throws Throwable {
		throw new Exception("没有实现");
	}



	
}

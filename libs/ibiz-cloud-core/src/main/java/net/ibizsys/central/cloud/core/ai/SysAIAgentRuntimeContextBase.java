package net.ibizsys.central.cloud.core.ai;

import java.util.List;

import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.Chunk;

public abstract class SysAIAgentRuntimeContextBase<M extends ISysAIAgentRuntime> extends AIAgentRuntimeBaseContextBase implements ISysAIAgentRuntimeContext {

	public SysAIAgentRuntimeContextBase() {
		
	}

	@Override
	public List<Chunk> chunks(String query) {
		return this.chunks(null, query, null, null);
	}

	@Override
	public List<Chunk> chunks(String query, Float similaritythreshold, Integer size) {
		return this.chunks(null, query, similaritythreshold, size);
	}
	
	@Override
	public List<Chunk> chunks(String type, String query, Float similaritythreshold, Integer size) {
		return this.chunks(type, query, similaritythreshold, null, size);
	}

	@Override
	public ChatCompletionResult rawChatCompletion(ChatCompletionRequest chatCompletionRequest) {
		return this.rawChatCompletion(null, chatCompletionRequest);
	}

	@Override
	public String rawChatCompletion(String strMessage) {
		return this.rawChatCompletion(null, strMessage);
	}
	
	 


}

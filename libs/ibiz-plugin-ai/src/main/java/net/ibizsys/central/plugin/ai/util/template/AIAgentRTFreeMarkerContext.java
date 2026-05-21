package net.ibizsys.central.plugin.ai.util.template;

import java.util.List;

import net.ibizsys.central.cloud.core.ai.ISysAIAgentRuntimeContext;
import net.ibizsys.central.cloud.core.util.domain.Chunk;

public class AIAgentRTFreeMarkerContext {

	private ISysAIAgentRuntimeContext iSysAIAgentRuntimeContext = null;
	
	public AIAgentRTFreeMarkerContext(ISysAIAgentRuntimeContext iSysAIAgentRuntimeContext) {
		this.iSysAIAgentRuntimeContext = iSysAIAgentRuntimeContext;
	}
	/**
	 * 获取本地知识片段
	 * @param type
	 * @param query
	 * @return
	 */
	public List<Chunk> chunks(String query){
		return this.iSysAIAgentRuntimeContext.chunks(query);
	}
	
	
	/**
	 * 获取本地知识片段
	 * @param type
	 * @param query
	 * @return
	 */
	public List<Chunk> chunks(String query, Float similaritythreshold, Integer size){
		return this.iSysAIAgentRuntimeContext.chunks(query, similaritythreshold, size);
	}
	
	/**
	 * 获取本地知识片段
	 * @param type
	 * @param query
	 * @return
	 */
	public List<Chunk> chunks(String type, String query, Float similaritythreshold, Integer size){
		return this.iSysAIAgentRuntimeContext.chunks(type, query, similaritythreshold, size);
	}
	
	/**
	 * 获取本地知识片段
	 * @param type
	 * @param query
	 * @return
	 */
	public List<Chunk> chunks(String type, String query, Float similaritythreshold, Float vectorSimilarityWeight, Integer size){
		return this.iSysAIAgentRuntimeContext.chunks(type, query, similaritythreshold, vectorSimilarityWeight, size);
	}
	
	
//	/**
//	 * 直接交互补全
//	 * @param chatCompletionRequest
//	 * @return
//	 */
//	ChatCompletionResult rawChatCompletion(ChatCompletionRequest chatCompletionRequest);
	
	
	
	/**
	 * 直接交互补全
	 * @param strAIPlatformType
	 * @param strMessage
	 * @return
	 */
	public String raw_chat_completion(String strMessage) {
		return this.iSysAIAgentRuntimeContext.rawChatCompletion(strMessage);
	}
	
	
//	/**
//	 * 直接交互补全
//	 * @param strAIPlatformType
//	 * @param chatCompletionRequest
//	 * @return
//	 */
//	ChatCompletionResult rawChatCompletion(String strAIPlatformType, ChatCompletionRequest chatCompletionRequest);
	
	
	
	/**
	 * 直接交互补全
	 * @param strAIPlatformType
	 * @param strMessage
	 * @return
	 */
	public String raw_chat_completion(String strAIPlatformType, String strMessage) {
		return this.iSysAIAgentRuntimeContext.rawChatCompletion(strAIPlatformType, strMessage);
	}
}

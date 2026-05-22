package net.ibizsys.central.cloud.core.ai;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.runtime.IModelRuntimeContext;

public interface ISysAIAgentRuntimeContext extends IModelRuntimeContext, IAIAgentRuntimeBaseContext{

	
	/**
	 * 获取模型运行时
	 * @return
	 */
	ISysAIAgentRuntime getModelRuntime();
	
	
	/**
	 * 获取本地知识片段
	 * @param type
	 * @param query
	 * @return
	 */
	List<Chunk> chunks(String query);
	
	
	/**
	 * 获取本地知识片段
	 * @param type
	 * @param query
	 * @return
	 */
	List<Chunk> chunks(String query, Float similaritythreshold, Integer size);
	
	/**
	 * 获取本地知识片段
	 * @param type
	 * @param query
	 * @return
	 */
	List<Chunk> chunks(String type, String query, Float similaritythreshold, Integer size);
	
	/**
	 * 获取本地知识片段
	 * @param type
	 * @param query
	 * @return
	 */
	List<Chunk> chunks(String type, String query, Float similaritythreshold, Float vectorSimilarityWeight, Integer size);
	
	
	/**
	 * 直接交互补全
	 * @param chatCompletionRequest
	 * @return
	 */
	ChatCompletionResult rawChatCompletion(ChatCompletionRequest chatCompletionRequest);
	
	
	
	/**
	 * 直接交互补全
	 * @param strAIPlatformType
	 * @param strMessage
	 * @return
	 */
	String rawChatCompletion(String strMessage);
	
	
	/**
	 * 直接交互补全
	 * @param strAIPlatformType
	 * @param chatCompletionRequest
	 * @return
	 */
	ChatCompletionResult rawChatCompletion(String strAIPlatformType, ChatCompletionRequest chatCompletionRequest);
	
	
	
	/**
	 * 直接交互补全
	 * @param strAIPlatformType
	 * @param strMessage
	 * @return
	 */
	String rawChatCompletion(String strAIPlatformType, String strMessage);
	
	/**
	 * 直接获取资料
	 * @param strKBPlatformType
	 * @param iChunkSearchContext
	 * @return
	 */
	default List<Chunk> rawFetchChunks(String strKBPlatformType, IChunkSearchContext iChunkSearchContext) {
		return rawFetchChunks(strKBPlatformType, Arrays.asList(iChunkSearchContext));
	}
	
	/**
	 * @param iChunkSearchContext
	 * @return
	 */
	default List<Chunk> rawFetchChunks(IChunkSearchContext iChunkSearchContext) {
		return rawFetchChunks(null, Arrays.asList(iChunkSearchContext));
	}
	
	/**
	 * 直接获取资料
	 * @param strKBPlatformType
	 * @param chunkSearchContextList
	 * @return
	 */
	List<Chunk> rawFetchChunks(String strKBPlatformType, List<IChunkSearchContext> chunkSearchContextList);
	
	
	/**
	 * 直接获取资料
	 * @param strKBPlatformType
	 * @param chunkSearchContextList
	 * @return
	 */
	default List<Chunk> rawFetchChunks(List<IChunkSearchContext> chunkSearchContextList){
		return rawFetchChunks(null, chunkSearchContextList);
	}

	
	
	/**
	 * 获取上下文数据
	 * @return
	 */
	Map<String, Object> getData();
}

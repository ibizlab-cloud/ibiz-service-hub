package net.ibizsys.central.cloud.core.ai;

import java.util.Arrays;
import java.util.List;

import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.domain.Chunk;

public interface ISysAIChatResourceContext extends IAIAgentRuntimeBaseContext{

	/**
	 * 获取本地知识片段
	 * @param type
	 * @param query
	 * @return
	 */
	default List<Chunk> chunks(String query){
		return chunks(null, query, null, null, null);
	}
	
	
	/**
	 * 获取本地知识片段
	 * @param type
	 * @param query
	 * @return
	 */
	default List<Chunk> chunks(String query, Float similaritythreshold, Integer size){
		return chunks(null, query, similaritythreshold, null, size);
	}
	
	/**
	 * 获取本地知识片段
	 * @param type
	 * @param query
	 * @return
	 */
	default List<Chunk> chunks(String type, String query, Float similaritythreshold, Integer size){
		return chunks(type, query, similaritythreshold, null, size);
	}
	
	
	
	/**
	 * 获取本地知识片段
	 * @param type
	 * @param query
	 * @return
	 */
	List<Chunk> chunks(String type, String query, Float similaritythreshold, Float vectorSimilarityWeight, Integer size);
	
	
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
}

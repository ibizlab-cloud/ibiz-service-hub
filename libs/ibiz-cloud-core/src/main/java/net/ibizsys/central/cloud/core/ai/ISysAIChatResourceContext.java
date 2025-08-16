package net.ibizsys.central.cloud.core.ai;

import java.util.List;

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
}

package net.ibizsys.central.plugin.ai.addin;

import java.util.List;

import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.plugin.ai.util.domain.Graph;
import net.ibizsys.central.plugin.ai.util.domain.GraphRAGConfig;
import net.ibizsys.runtime.plugin.IModelRTAddin2;

public interface IChunkGraphExtractor extends IModelRTAddin2 {

	/**
	 * 生成图
	 * @param documentId 文档标识
	 * @param chunkList
	 * @param graphRagConfig
	 * @return
	 * @throws Throwable
	 */
	Graph<List<Chunk>> generate(Object documentId, List<Chunk> chunkList, GraphRAGConfig graphRAGConfig) throws Throwable;
}

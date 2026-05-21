package net.ibizsys.central.plugin.ai.sysutil.addin;

import java.util.List;

import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.plugin.ai.addin.IChunkClusterer;
import net.ibizsys.central.plugin.ai.util.domain.RaptorConfig;
import net.ibizsys.central.plugin.ai.util.domain.RaptorNode;

/**
 *  片段聚合器对象基类
 * 
 * @author lionlau
 *
 */
public abstract class ChunkClustererBase extends SysKnowledgeBaseUtilRTAddinBase implements IChunkClusterer {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(ChunkClustererBase.class);
	
	protected double[] getEmbedding(String strEmbeddingAgent, String strContent) throws Throwable {
		return this.getContext().getEmbedding(strEmbeddingAgent, strContent);
	}
	
	@Override
	public List<List<RaptorNode>> cluster(Object documentId, List<RaptorNode> nodes, RaptorConfig config) throws Throwable {
		return this.onCluster(documentId, nodes, config);
	}
	
	protected List<List<RaptorNode>> onCluster(Object documentId, List<RaptorNode> nodes, RaptorConfig config) throws Throwable {
		throw new Exception("没有实现");
	}
}

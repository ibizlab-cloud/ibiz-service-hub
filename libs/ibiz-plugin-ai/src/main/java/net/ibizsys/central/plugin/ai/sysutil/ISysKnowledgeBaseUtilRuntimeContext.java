package net.ibizsys.central.plugin.ai.sysutil;

import java.util.List;
import java.util.Map;

import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ClusterEmbeddingsRequest;
import net.ibizsys.central.cloud.core.util.domain.EmbeddingRequest;
import net.ibizsys.central.cloud.core.util.domain.EmbeddingResult;
import net.ibizsys.central.cloud.core.util.domain.TextReRankRequest;
import net.ibizsys.central.cloud.core.util.domain.TextReRankResult;
import net.ibizsys.central.plugin.ai.addin.IChunkClusterer;
import net.ibizsys.central.plugin.ai.sysutil.ISysKnowledgeBaseUtilRuntime.IChunkProxyDERuntime;
import net.ibizsys.central.plugin.ai.sysutil.ISysKnowledgeBaseUtilRuntime.IDocumentProxyDERuntime;
import net.ibizsys.central.plugin.ai.sysutil.ISysKnowledgeBaseUtilRuntime.IGraphEntityProxyDERuntime;
import net.ibizsys.central.plugin.ai.sysutil.ISysKnowledgeBaseUtilRuntime.IGraphRelationProxyDERuntime;
import net.ibizsys.central.plugin.ai.sysutil.ISysKnowledgeBaseUtilRuntime.IKnowledgeBaseProxyDERuntime;
import net.ibizsys.central.plugin.ai.util.domain.ParserConfig;
import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.runtime.util.IAction;

/**
 * 系统知识库功能组件运行时上下文接口
 * @author lionlau
 *
 */
public interface ISysKnowledgeBaseUtilRuntimeContext extends ISysUtilRuntimeContext{

	default ISysKnowledgeBaseUtilRuntime getSysKnowledgeBaseUtilRuntime() {
		return this.getModelRuntime();
	}
	
	
	@Override
	ISysKnowledgeBaseUtilRuntime getModelRuntime();
	
	
	/**
	 * 交互补全
	 * @param chatCompletionRequest
	 * @return
	 */
	ChatCompletionResult chatCompletion(String strAgentTag, ChatCompletionRequest chatCompletionRequest) throws Throwable;
	
	
	/**
	 * 进行嵌入值计算
	 * @param embeddingRequest
	 * @return
	 */
	EmbeddingResult embedding(String strAgentTag, EmbeddingRequest embeddingRequest) throws Throwable;
	
	/**
	 * 文本重排序
	 * @param textReRankRequest
	 * @return
	 */
	TextReRankResult textReRank(String strAgentTag, TextReRankRequest textReRankRequest) throws Throwable;
	
	
	/**
	 * 聚合向量值
	 * @param clusterEmbeddingsRequest
	 * @return
	 */
	List<Integer> clusterEmbeddings(ClusterEmbeddingsRequest clusterEmbeddingsRequest) throws Throwable;
	
	
	
	/**
	 * 更新文档进展
	 * @param documentId
	 * @param progress
	 * @throws Throwable
	 */
	void updateDocumentProgress(Object documentId, String progress) throws Throwable;
	
	
	/**
	 * 获取传入内容的嵌入值
	 * @param strContent
	 * @return
	 * @throws Throwable
	 */
	default double[] getEmbedding(String strAgentTag, String strContent) throws Throwable{
		EmbeddingRequest embeddingRequest = new EmbeddingRequest();
		embeddingRequest.setContent(strContent);
		EmbeddingResult embeddingResult = this.embedding(strAgentTag, embeddingRequest);
		List<Double> list = embeddingResult.getData().get(0).getEmbedding();
		double[] doubleArray = list.stream().mapToDouble(Double::doubleValue) // 等价于 .mapToDouble(d -> d)
				.toArray();
		return doubleArray;
	}
	
	
	
	
	/**
	 * 线程运行
	 * @param actions
	 * @param bIgnoreException
	 * @param env
	 * @return
	 * @throws Throwable
	 */
	Map<String, Object> threadRunAllOf(List<IAction> actions, boolean bIgnoreException, Object env) throws Throwable;
	
	
	
	/**
	 * @param strType
	 * @param bTryMode
	 * @return
	 * @throws Throwable
	 */
	IChunkClusterer getChunkClusterer(String strType, boolean bTryMode) throws Throwable;
	
	/**
	 * @param strType
	 * @param bTryMode
	 * @return
	 * @throws Throwable
	 */
	default IChunkClusterer getDefaultChunkClusterer() throws Throwable{
		return getChunkClusterer(ISysKnowledgeBaseUtilRuntime.CLUSTERER_DEFAULT, false);
	}
	
	
	IKnowledgeBaseProxyDERuntime getKnowledgeBaseProxyDERuntime(boolean tryMode) throws Exception;
	
	
	IDocumentProxyDERuntime getDocumentProxyDERuntime(boolean tryMode) throws Exception;
	
	
	IChunkProxyDERuntime getChunkProxyDERuntime(boolean tryMode) throws Exception;
	
	
	IGraphEntityProxyDERuntime getGraphEntityProxyDERuntime(boolean tryMode) throws Exception;
	
	IGraphRelationProxyDERuntime getGraphRelationProxyDERuntime(boolean tryMode) throws Exception;
	
	
	/**
	 * 获取知识库数据对象
	 * @param key
	 * @param tryMode
	 * @return
	 * @throws Throwable
	 */
	IEntityDTO getKnowledgeBaseEntityDTO(Object key, boolean tryMode) throws Throwable;
	
	
	/**
	 * 获取知识库配置
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	ParserConfig getKnowledgeBaseParserConfig(Object key) throws Throwable;
	
	
	
	/**
	 * 是否正在运行
	 * @return
	 */
	boolean isThreadRunning();
	
	
	
	/**
	 * 获取查询交互代理
	 * @return
	 */
	String getQueryChatAgent();
	
	
	
	
	/**
	 * 判断是否取消文档作业
	 * @param documentId
	 * @return
	 */
	boolean shouldCancelDocumentJobs(Object documentId);
}

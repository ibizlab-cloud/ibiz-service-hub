package net.ibizsys.central.plugin.ai.addin;

import java.util.List;

import net.ibizsys.central.plugin.ai.util.domain.RaptorConfig;
import net.ibizsys.central.plugin.ai.util.domain.RaptorNode;
import net.ibizsys.runtime.plugin.IModelRTAddin2;

public interface IChunkClusterer extends IModelRTAddin2 {

//	/**
//	 * The maximum number of clusters to create. Defaults to 64, with a maximum limit of 1024.
//	 */
//	public final static String RAPTOR_CONFIG__MAX_CLUSTERS = "max_clusters";
//	
//	/**
//	 * The minimum number of clusters to create. Defaults to 2.
//	 */
//	public final static String RAPTOR_CONFIG__MIN_CLUSTERS = "min_clusters";
//	
//	/**
//	 * It defaults to 0.1, with a maximum limit of 1. A higher Threshold means fewer chunks in each cluster, while a lower one means more.
//	 */
//	public final static String RAPTOR_CONFIG__THRESHOLD = "threshold";
//	
//	/**
//	 * The maximum number of tokens per generated summary chunk. Defaults to 256, with a maximum limit of 2048.
//	 */
//	public final static String RAPTOR_CONFIG__MAX_TOKENS = "max_tokens";
//	
//	public final static String RAPTOR_CONFIG__PROMPT = "prompt";
//	
//	public final static String RAPTOR_CONFIG__USE_RAPTOR = "use_raptor"; 
//	
//	public final static String RAPTOR_CONFIG__CLUSTERING_METHOD = "clustering_method"; 
//	
//	
//	public final static String CLUSTERING_METHOD__KMEANS = "kmeans";
//	public final static String CLUSTERING_METHOD__HIERARCHICAL = "hierarchical";
//	public final static String CLUSTERING_METHOD__DENSITY = "density";
//	public final static String CLUSTERING_METHOD__GMM = "gmm";
//	
//	public final static String RAPTOR_CONFIG__MAX_ITERATIONS = "max_iterations"; 
//	
//	/**
//	 * 随机种子
//	 */
//	public final static String RAPTOR_CONFIG__RANDOM_SEED = "random_seed"; 
	
	
	
	 /**
	  * 聚合
	  *@param documentId 文档标识
	 * @param nodes
	 * @param config
	 * @return
	 * @throws Throwable
	 */
	List<List<RaptorNode>> cluster(Object documentId, List<RaptorNode> nodes, RaptorConfig config) throws Throwable;
}

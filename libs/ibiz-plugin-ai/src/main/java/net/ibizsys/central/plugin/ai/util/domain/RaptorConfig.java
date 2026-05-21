package net.ibizsys.central.plugin.ai.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

public class RaptorConfig extends EntityBase {

	/**
	 * The maximum number of clusters to create. Defaults to 64, with a maximum limit of 1024.
	 */
	public final static String FIELD__MAX_CLUSTERS = "max_clusters";
	
	/**
	 * The minimum number of clusters to create. Defaults to 2.
	 */
	public final static String FIELD__MIN_CLUSTERS = "min_clusters";
	
	/**
	 * It defaults to 0.1, with a maximum limit of 1. A higher Threshold means fewer chunks in each cluster, while a lower one means more.
	 */
	public final static String FIELD__THRESHOLD = "threshold";
	
	/**
	 * The maximum number of tokens per generated summary chunk. Defaults to 256, with a maximum limit of 2048.
	 */
	public final static String FIELD__MAX_TOKENS = "max_tokens";
	
	public final static String FIELD__PROMPT = "prompt";
	
	public final static String FIELD__USE_RAPTOR = "use_raptor"; 
	
	public final static String FIELD__CLUSTERING_METHOD = "clustering_method"; 
	
	
	public final static String CLUSTERING_METHOD__KMEANS = "kmeans";
	public final static String CLUSTERING_METHOD__HIERARCHICAL = "hierarchical";
	public final static String CLUSTERING_METHOD__DENSITY = "density";
	public final static String CLUSTERING_METHOD__GMM = "gmm";
	
	public final static String FIELD__MAX_ITERATIONS = "max_iterations"; 
	
	/**
	 * 随机种子
	 */
	public final static String FIELD__RANDOM_SEED = "random_seed"; 
	
	public final static String FIELD__CHAT_AGENT = "chat_agent";
	
	public final static String FIELD__EMBEDDING_AGENT = "embedding_agent";
	
	public final static String FIELD__RERANK_AGENT = "rerank_agent";
	
	private transient int umapNComponents = 12;

	@JsonIgnore
	public int getMaxClusters() {
		int value = DataTypeUtils.asInteger(this.get(FIELD__MAX_CLUSTERS), 64);
		if (value <= 0) {
			return 1;
		}

		if (value > 1024) {
			return 1024;
		}

		return value;
	}

	@JsonIgnore
	public void setMaxClusters(int value) {
		this.set(FIELD__MAX_CLUSTERS, value);
	}

	@JsonIgnore
	public int getMinClusters() {
		int value = DataTypeUtils.asInteger(this.get(FIELD__MIN_CLUSTERS), 2);
		if (value <= 0) {
			return 1;
		}

		if (value > 1024) {
			return 1024;
		}

		return value;
	}

	@JsonIgnore
	public void setMinClusters(int value) {
		this.set(FIELD__MIN_CLUSTERS, value);
	}

	@JsonIgnore
	public int getMaxTokens() {
		int value = DataTypeUtils.asInteger(this.get(FIELD__MAX_TOKENS), 256);
		if (value < 1) {
			return 1;
		}

		if (value > 2048) {
			return 2048;
		}

		return value;
	}

	@JsonIgnore
	public void setMaxTokens(int value) {
		this.set(FIELD__MAX_TOKENS, value);
	}
	
	@JsonIgnore
	public int getRandomSeed() {
		int value = DataTypeUtils.asInteger(this.get(FIELD__RANDOM_SEED), 42);
		if (value <=0) {
			return 5672;
		}

		return value;
	}

	@JsonIgnore
	public void setRandomSeed(int value) {
		this.set(FIELD__RANDOM_SEED, value);
	}
	

	@JsonIgnore
	public double getSimilarityThreshold() {
		double value = DataTypeUtils.asDouble(this.get(FIELD__THRESHOLD), 0.1);
		if (value <= 0) {
			return 0.1;
		}

		if (value >= 1) {
			return 0.9;
		}

		return value;
	}

	@JsonIgnore
	public void setSimilarityThreshold(double value) {
		this.set(FIELD__THRESHOLD, value);
	}

	@JsonIgnore
	public boolean isUseRaptor() {
		return DataTypeUtils.asBoolean(this.get(FIELD__USE_RAPTOR), false);
	}

	@JsonIgnore
	public void setUseRaptor(boolean value) {
		this.set(FIELD__USE_RAPTOR, value);
	}

	@JsonIgnore
	public String getClusteringMethod() {
		return DataTypeUtils.asString(this.get(FIELD__CLUSTERING_METHOD), CLUSTERING_METHOD__GMM);
	}

	@JsonIgnore
	public void setClusteringMethod(boolean value) {
		this.set(FIELD__CLUSTERING_METHOD, value);
	}
	
	@JsonIgnore
	public String getPrompt() {
		return DataTypeUtils.asString(this.get(FIELD__PROMPT), null);
	}

	@JsonIgnore
	public void setPrompt(String value) {
		this.set(FIELD__PROMPT, value);
	}
	

	@JsonIgnore
	public int getMaxIterations() {
		int value = DataTypeUtils.asInteger(this.get(FIELD__MAX_ITERATIONS), 100);
		if (value <= 0) {
			return 1;
		}

		if (value > 200) {
			return 200;
		}

		return value;
	}

	@JsonIgnore
	public void setMaxIterations(int value) {
		this.set(FIELD__MAX_ITERATIONS, value);
	}

	@JsonIgnore
	public int getUmapNComponents() {
		return umapNComponents;
	}

	@JsonIgnore
	public void setUmapNComponents(int umapNComponents) {
		this.umapNComponents = umapNComponents;
	}

	@JsonIgnore
	public String getChatAgent() {
		return DataTypeUtils.asString(this.get(FIELD__CHAT_AGENT), null);
	}

	@JsonIgnore
	public void setChatAgent(String value) {
		this.set(FIELD__CHAT_AGENT, value);
	}
	
	@JsonIgnore
	public String getEmbeddingAgent() {
		return DataTypeUtils.asString(this.get(FIELD__EMBEDDING_AGENT), null);
	}

	@JsonIgnore
	public void setEmbeddingAgent(String value) {
		this.set(FIELD__EMBEDDING_AGENT, value);
	}
	
	@JsonIgnore
	public String getReRankAgent() {
		return DataTypeUtils.asString(this.get(FIELD__RERANK_AGENT), null);
	}

	@JsonIgnore
	public void setReRankAgent(String value) {
		this.set(FIELD__RERANK_AGENT, value);
	}

}

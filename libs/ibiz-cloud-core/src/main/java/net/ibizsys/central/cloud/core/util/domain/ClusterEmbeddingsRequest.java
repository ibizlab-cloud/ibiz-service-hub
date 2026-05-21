package net.ibizsys.central.cloud.core.util.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 聚合向量集合请求数据对象
 * @author lionlau
 *
 */
public class ClusterEmbeddingsRequest extends EntityBase {

	public final static String FIELD_EMBEDDINGS = "embeddings";

	/**
	 阈值
	 */
	public final static String FIELD_THRESHOLD = "threshold";
	
	
	/**
	 * 最大族数
	 */
	public final static String FIELD_MAXCLUSTERS = "maxclusters";
	
	

	/**
	 * 随机状态
	 */
	public final static String FIELD_RANDOMSTATE = "randomstate";
	
	
	
	
	/**
	 * 设置「嵌入值集合」
	 *
	 * @param val
	 */
	//@JsonIgnore
	@JsonProperty(FIELD_EMBEDDINGS)
	public ClusterEmbeddingsRequest setEmbeddings(List<double[]> val) {
		this.set(FIELD_EMBEDDINGS, val);
		return this;
	}

	/**
	 * 获取「嵌入值集合」值
	 *
	 */
	@JsonIgnore
	public List<double[]> getEmbeddings() {
		Object objValue = this.get(FIELD_EMBEDDINGS);
		if (objValue == null) {
			return null;
		}
		
		return (List<double[]>) objValue;
	}

	/**
	 * 判断 「嵌入值集合」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsEmbeddings() {
		return this.contains(FIELD_EMBEDDINGS);
	}

	/**
	 * 重置 「嵌入值集合」
	 *
	 */
	@JsonIgnore
	public ClusterEmbeddingsRequest resetEmbeddings() {
		this.reset(FIELD_EMBEDDINGS);
		return this;
	}
	
	
	
    
    
    /**
	 * 设置「最大族数」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ClusterEmbeddingsRequest setMaxClusters(Integer val) {
		this.set(FIELD_MAXCLUSTERS, val);
		return this;
	}

	/**
	 * 获取「最大族数」值
	 *
	 */
	@JsonIgnore
	public Integer getMaxClusters() {
		return DataTypeUtils.asInteger(this.get(FIELD_MAXCLUSTERS), null);
	}

	/**
	 * 判断 「最大族数」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsMaxClusters() {
		return this.contains(FIELD_MAXCLUSTERS);
	}

	/**
	 * 重置 「最大族数」
	 *
	 */
	@JsonIgnore
	public ClusterEmbeddingsRequest resetMaxClusters() {
		this.reset(FIELD_MAXCLUSTERS);
		return this;
	}
	
	/**
     * 设置「阈值」
     *
     * @param val
    */
    @JsonIgnore
    public ClusterEmbeddingsRequest setThreshold(Float val) {
        this.set(FIELD_THRESHOLD, val);
        return this;
    }

    /**
     * 获取「阈值」值
     *
    */
    @JsonIgnore
    public Float getThreshold() {
        try{
            return DataTypeUtils.getFloatValue(this.get(FIELD_THRESHOLD),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「阈值」是否有值
     *
    */
    @JsonIgnore
    public boolean containsThreshold() {
        return this.contains(FIELD_THRESHOLD);
    }

    /**
     * 重置 「阈值」
     *
    */
    @JsonIgnore
    public ClusterEmbeddingsRequest resetThreshold() {
        this.reset(FIELD_THRESHOLD);
        return this;
    }
    
    
    /**
	 * 设置「随机状态」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ClusterEmbeddingsRequest setRandomState(Integer val) {
		this.set(FIELD_RANDOMSTATE, val);
		return this;
	}

	/**
	 * 获取「随机状态」值
	 *
	 */
	@JsonIgnore
	public Integer getRandomState() {
		return DataTypeUtils.asInteger(this.get(FIELD_RANDOMSTATE), null);
	}

	/**
	 * 判断 「随机状态」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsRandomState() {
		return this.contains(FIELD_RANDOMSTATE);
	}

	/**
	 * 重置 「随机状态」
	 *
	 */
	@JsonIgnore
	public ClusterEmbeddingsRequest resetRandomState() {
		this.reset(FIELD_RANDOMSTATE);
		return this;
	}
	
}

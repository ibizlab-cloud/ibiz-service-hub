package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 数据片段
 */
public class Chunk extends EntityBase {

	/**
	 * 数据片段标识
	 */
	public final static String FIELD_ID = "id";

	/**
	 * 数据片段名称
	 */
	public final static String FIELD_NAME = "name";

	/**
	 *  数据片段类型
	 */
	public final static String FIELD_TYPE = "type";

	
	/**
	 *  数据片段内容
	 */
	public final static String FIELD_CONTENT = "content";
	
	
	/**
	 *  相似度
	 */
	public final static String FIELD_SIMILARITY = "similarity";
	
	
	
	/**
	 * 设置「 数据片段标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Chunk setId(String val) {
		this.set(FIELD_ID, val);
		return this;
	}

	/**
	 * 获取「 数据片段标识」值
	 *
	 */
	@JsonIgnore
	public String getId() {
		return (String) this.get(FIELD_ID);
	}

	/**
	 * 判断 「 数据片段标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsId() {
		return this.contains(FIELD_ID);
	}

	/**
	 * 重置 「 数据片段标识」
	 *
	 */
	@JsonIgnore
	public Chunk resetId() {
		this.reset(FIELD_ID);
		return this;
	}

	/**
	 * 设置「 数据片段名称」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Chunk setName(String val) {
		this.set(FIELD_NAME, val);
		return this;
	}

	/**
	 * 获取「 数据片段名称」值
	 *
	 */
	@JsonIgnore
	public String getName() {
		return (String) this.get(FIELD_NAME);
	}

	/**
	 * 判断 「 数据片段名称」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsName() {
		return this.contains(FIELD_NAME);
	}

	/**
	 * 重置 「 数据片段名称」
	 *
	 */
	@JsonIgnore
	public Chunk resetName() {
		this.reset(FIELD_NAME);
		return this;
	}

	/**
	 * 设置「 数据片段类型」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Chunk setType(String val) {
		this.set(FIELD_TYPE, val);
		return this;
	}

	/**
	 * 获取「 数据片段类型」值
	 *
	 */
	@JsonIgnore
	public String getType() {
		return (String) this.get(FIELD_TYPE);
	}

	/**
	 * 判断 「 数据片段类型」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsType() {
		return this.contains(FIELD_TYPE);
	}

	/**
	 * 重置 「 数据片段类型」
	 *
	 */
	@JsonIgnore
	public Chunk resetType() {
		this.reset(FIELD_TYPE);
		return this;
	}

	
	/**
	 * 设置「 数据片段内容」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Chunk setContent(String val) {
		this.set(FIELD_CONTENT, val);
		return this;
	}

	/**
	 * 获取「 数据片段内容」值
	 *
	 */
	@JsonIgnore
	public String getContent() {
		return (String) this.get(FIELD_CONTENT);
	}

	/**
	 * 判断 「 数据片段内容」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsContent() {
		return this.contains(FIELD_CONTENT);
	}

	/**
	 * 重置 「 数据片段内容」
	 *
	 */
	@JsonIgnore
	public Chunk resetContent() {
		this.reset(FIELD_CONTENT);
		return this;
	}

	
	 /**
     * 设置「相似度」
     *
     * @param val
    */
    @JsonIgnore
    public Chunk setSimilarity(Double val) {
        this.set(FIELD_SIMILARITY, val);
        return this;
    }

    /**
     * 获取「相似度」值
     *
    */
    @JsonIgnore
    public Double getSimilarity() {
        try{
            return DataTypeUtils.asDouble(this.get(FIELD_SIMILARITY),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「相似度」是否有值
     *
    */
    @JsonIgnore
    public boolean containsSimilarity() {
        return this.contains(FIELD_SIMILARITY);
    }

    /**
     * 重置 「相似度」
     *
    */
    @JsonIgnore
    public Chunk resetSimilarity() {
        this.reset(FIELD_SIMILARITY);
        return this;
    }
    
}

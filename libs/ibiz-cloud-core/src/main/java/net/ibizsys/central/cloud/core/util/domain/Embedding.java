package net.ibizsys.central.cloud.core.util.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.EntityBase;

public class Embedding extends EntityBase {

	public final static String FIELD_EMBEDDING = "embedding";
	
	//public final static String FIELD_INDEX = "index";
	
	public final static String FIELD_CONTENT = "content";
	

	/**
	 * 设置「嵌入数据」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Embedding setEmbedding(List<Double> val) {
		this.set(FIELD_EMBEDDING, val);
		return this;
	}

	/**
	 * 获取「嵌入数据」值
	 *
	 */
	@JsonIgnore
	public List<Double> getEmbedding() {
		Object ret = this.get(FIELD_EMBEDDING);
		if (ret == null) {
			return null;
		}
		return (List<Double>) ret;
	}

	/**
	 * 判断 「嵌入数据」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsEmbedding() {
		return this.contains(FIELD_EMBEDDING);
	}

	/**
	 * 重置 「嵌入数据」
	 *
	 */
	@JsonIgnore
	public Embedding resetEmbedding() {
		this.reset(FIELD_EMBEDDING);
		return this;
	}

	

	/**
	 * 设置「内容」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Embedding setContent(String val) {
		this.set(FIELD_CONTENT, val);
		return this;
	}

	/**
	 * 获取「内容」值
	 *
	 */
	@JsonIgnore
	public String getContent() {
		return (String)this.get(FIELD_CONTENT);
	}

	/**
	 * 判断 「内容」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsContent() {
		return this.contains(FIELD_CONTENT);
	}

	/**
	 * 重置 「内容」
	 *
	 */
	@JsonIgnore
	public Embedding resetContent() {
		this.reset(FIELD_CONTENT);
		return this;
	}
}

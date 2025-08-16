package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.EntityBase;

public class EmbeddingRequest  extends EntityBase {

	public final static String FIELD_MODEL = "model";
	
	
	public final static String FIELD_SESSIONID = "sessionid";
	
	
	public final static String FIELD_CONTENT = "content";
	
	/**
	 * 设置「内容」
	 *
	 * @param val
	 */
	@JsonIgnore
	public EmbeddingRequest setSessionId(String val) {
		this.set(FIELD_SESSIONID, val);
		return this;
	}

	/**
	 * 获取「内容」值
	 *
	 */
	@JsonIgnore
	public String getSessionId() {
		return (String) this.get(FIELD_SESSIONID);
	}

	/**
	 * 判断 「内容」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsSessionId() {
		return this.contains(FIELD_SESSIONID);
	}

	/**
	 * 重置 「内容」
	 *
	 */
	@JsonIgnore
	public EmbeddingRequest resetSessionId() {
		this.reset(FIELD_SESSIONID);
		return this;
	}
	
	
	/**
	 * 设置「模型」
	 *
	 * @param val
	 */
	@JsonIgnore
	public EmbeddingRequest setModel(String val) {
		this.set(FIELD_MODEL, val);
		return this;
	}

	/**
	 * 获取「模型」值
	 *
	 */
	@JsonIgnore
	public String getModel() {
		return (String) this.get(FIELD_MODEL);
	}

	/**
	 * 判断 「模型」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsModel() {
		return this.contains(FIELD_MODEL);
	}

	/**
	 * 重置 「模型」
	 *
	 */
	@JsonIgnore
	public EmbeddingRequest resetModel() {
		this.reset(FIELD_MODEL);
		return this;
	}
	
	
	
	/**
	 * 设置「内容」
	 *
	 * @param val
	 */
	@JsonIgnore
	public EmbeddingRequest setContent(String val) {
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
	public EmbeddingRequest resetContent() {
		this.reset(FIELD_CONTENT);
		return this;
	}
	
}

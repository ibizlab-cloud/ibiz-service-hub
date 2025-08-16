package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.EntityBase;

/**
 * 知识库
 */
public class KnowledgeBase extends EntityBase {

	/**
	 *知识库标识
	 */
	public final static String FIELD_ID = "id";

	/**
	 *知识库名称
	 */
	public final static String FIELD_NAME = "name";

	/**
	 * 知识库类型
	 */
	public final static String FIELD_TYPE = "type";

	/**
	 *嵌入模型
	 */
	public final static String FIELD_EMBED_MODEL = "embed_model";

	
	
	
	/**
	 * 设置「知识库标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public KnowledgeBase setId(String val) {
		this.set(FIELD_ID, val);
		return this;
	}

	/**
	 * 获取「知识库标识」值
	 *
	 */
	@JsonIgnore
	public String getId() {
		return (String) this.get(FIELD_ID);
	}

	/**
	 * 判断 「知识库标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsId() {
		return this.contains(FIELD_ID);
	}

	/**
	 * 重置 「知识库标识」
	 *
	 */
	@JsonIgnore
	public KnowledgeBase resetId() {
		this.reset(FIELD_ID);
		return this;
	}

	/**
	 * 设置「知识库名称」
	 *
	 * @param val
	 */
	@JsonIgnore
	public KnowledgeBase setName(String val) {
		this.set(FIELD_NAME, val);
		return this;
	}

	/**
	 * 获取「知识库名称」值
	 *
	 */
	@JsonIgnore
	public String getName() {
		return (String) this.get(FIELD_NAME);
	}

	/**
	 * 判断 「知识库名称」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsName() {
		return this.contains(FIELD_NAME);
	}

	/**
	 * 重置 「知识库名称」
	 *
	 */
	@JsonIgnore
	public KnowledgeBase resetName() {
		this.reset(FIELD_NAME);
		return this;
	}

	/**
	 * 设置「知识库类型」
	 *
	 * @param val
	 */
	@JsonIgnore
	public KnowledgeBase setType(String val) {
		this.set(FIELD_TYPE, val);
		return this;
	}

	/**
	 * 获取「知识库类型」值
	 *
	 */
	@JsonIgnore
	public String getType() {
		return (String) this.get(FIELD_TYPE);
	}

	/**
	 * 判断 「知识库类型」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsType() {
		return this.contains(FIELD_TYPE);
	}

	/**
	 * 重置 「知识库类型」
	 *
	 */
	@JsonIgnore
	public KnowledgeBase resetType() {
		this.reset(FIELD_TYPE);
		return this;
	}

	/**
	 * 设置「嵌入模型」
	 *
	 * @param val
	 */
	@JsonIgnore
	public KnowledgeBase setEmbedModel(String val) {
		this.set(FIELD_EMBED_MODEL, val);
		return this;
	}

	/**
	 * 获取「嵌入模型」值
	 *
	 */
	@JsonIgnore
	public String getEmbedModel() {
		return (String) this.get(FIELD_EMBED_MODEL);
	}

	/**
	 * 判断 「嵌入模型」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsEmbedModel() {
		return this.contains(FIELD_EMBED_MODEL);
	}

	/**
	 * 重置 「嵌入模型」
	 *
	 */
	@JsonIgnore
	public KnowledgeBase resetEmbedModel() {
		this.reset(FIELD_EMBED_MODEL);
		return this;
	}
	
}

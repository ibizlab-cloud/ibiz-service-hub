package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.EntityBase;

/**
 * 文档
 */
public class Document extends EntityBase {

	/**
	 *文档标识
	 */
	public final static String FIELD_ID = "id";

	/**
	 *文档名称
	 */
	public final static String FIELD_NAME = "name";

	/**
	 * 文档类型
	 */
	public final static String FIELD_TYPE = "type";
	
	/**
	 * 文档内容
	 */
	public final static String FIELD_CONTENT = "content";
	
	
	/**
	 * 设置「文档标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Document setId(String val) {
		this.set(FIELD_ID, val);
		return this;
	}

	/**
	 * 获取「文档标识」值
	 *
	 */
	@JsonIgnore
	public String getId() {
		return (String) this.get(FIELD_ID);
	}

	/**
	 * 判断 「文档标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsId() {
		return this.contains(FIELD_ID);
	}

	/**
	 * 重置 「文档标识」
	 *
	 */
	@JsonIgnore
	public Document resetId() {
		this.reset(FIELD_ID);
		return this;
	}

	/**
	 * 设置「文档名称」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Document setName(String val) {
		this.set(FIELD_NAME, val);
		return this;
	}

	/**
	 * 获取「文档名称」值
	 *
	 */
	@JsonIgnore
	public String getName() {
		return (String) this.get(FIELD_NAME);
	}

	/**
	 * 判断 「文档名称」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsName() {
		return this.contains(FIELD_NAME);
	}

	/**
	 * 重置 「文档名称」
	 *
	 */
	@JsonIgnore
	public Document resetName() {
		this.reset(FIELD_NAME);
		return this;
	}

	/**
	 * 设置「文档类型」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Document setType(String val) {
		this.set(FIELD_TYPE, val);
		return this;
	}

	/**
	 * 获取「文档类型」值
	 *
	 */
	@JsonIgnore
	public String getType() {
		return (String) this.get(FIELD_TYPE);
	}

	/**
	 * 判断 「文档类型」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsType() {
		return this.contains(FIELD_TYPE);
	}

	/**
	 * 重置 「文档类型」
	 *
	 */
	@JsonIgnore
	public Document resetType() {
		this.reset(FIELD_TYPE);
		return this;
	}

	
	/**
	 * 设置「文档内容」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Document setContent(String val) {
		this.set(FIELD_CONTENT, val);
		return this;
	}

	/**
	 * 获取「文档内容」值
	 *
	 */
	@JsonIgnore
	public String getContent() {
		return (String) this.get(FIELD_CONTENT);
	}

	/**
	 * 判断 「文档内容」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsContent() {
		return this.contains(FIELD_CONTENT);
	}

	/**
	 * 重置 「文档内容」
	 *
	 */
	@JsonIgnore
	public Document resetContent() {
		this.reset(FIELD_CONTENT);
		return this;
	}

}

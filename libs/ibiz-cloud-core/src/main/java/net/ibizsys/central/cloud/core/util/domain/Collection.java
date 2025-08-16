package net.ibizsys.central.cloud.core.util.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.EntityBase;

/**
 * 数据集
 */
public class Collection extends EntityBase {

	/**
	 *数据集标识
	 */
	public final static String FIELD_ID = "id";

	/**
	 *数据集名称
	 */
	public final static String FIELD_NAME = "name";

	/**
	 * 数据集类型
	 */
	public final static String FIELD_TYPE = "type";

	
	/**
	 * 数据集属性集合
	 */
	public final static String FIELD_FIELDS = "fields";
	
	
	
	/**
	 * 设置「数据集标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Collection setId(String val) {
		this.set(FIELD_ID, val);
		return this;
	}

	/**
	 * 获取「数据集标识」值
	 *
	 */
	@JsonIgnore
	public String getId() {
		return (String) this.get(FIELD_ID);
	}

	/**
	 * 判断 「数据集标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsId() {
		return this.contains(FIELD_ID);
	}

	/**
	 * 重置 「数据集标识」
	 *
	 */
	@JsonIgnore
	public Collection resetId() {
		this.reset(FIELD_ID);
		return this;
	}

	/**
	 * 设置「数据集名称」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Collection setName(String val) {
		this.set(FIELD_NAME, val);
		return this;
	}

	/**
	 * 获取「数据集名称」值
	 *
	 */
	@JsonIgnore
	public String getName() {
		return (String) this.get(FIELD_NAME);
	}

	/**
	 * 判断 「数据集名称」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsName() {
		return this.contains(FIELD_NAME);
	}

	/**
	 * 重置 「数据集名称」
	 *
	 */
	@JsonIgnore
	public Collection resetName() {
		this.reset(FIELD_NAME);
		return this;
	}

	/**
	 * 设置「数据集类型」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Collection setType(String val) {
		this.set(FIELD_TYPE, val);
		return this;
	}

	/**
	 * 获取「数据集类型」值
	 *
	 */
	@JsonIgnore
	public String getType() {
		return (String) this.get(FIELD_TYPE);
	}

	/**
	 * 判断 「数据集类型」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsType() {
		return this.contains(FIELD_TYPE);
	}

	/**
	 * 重置 「数据集类型」
	 *
	 */
	@JsonIgnore
	public Collection resetType() {
		this.reset(FIELD_TYPE);
		return this;
	}

	/**
	 * 设置「数据集属性集合」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Collection setFields(List<Field> val) {
		this.set(FIELD_FIELDS, val);
		return this;
	}

	/**
	 * 获取「数据集属性集合」值
	 *
	 */
	@JsonIgnore
	public List<Field> getFields() {
		Object ret = this.get(FIELD_FIELDS);
		if(ret == null) {
			return null;
		}
		return (List<Field>)ret ;
	}

	/**
	 * 判断 「数据集属性集合」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsFields() {
		return this.contains(FIELD_FIELDS);
	}

	/**
	 * 重置 「数据集属性集合」
	 *
	 */
	@JsonIgnore
	public Collection resetFields() {
		this.reset(FIELD_FIELDS);
		return this;
	}
}

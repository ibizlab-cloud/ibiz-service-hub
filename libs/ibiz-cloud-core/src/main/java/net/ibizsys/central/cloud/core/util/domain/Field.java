package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.EntityBase;

/**
 * 属性
 */
public class Field extends EntityBase {

	/**
	 *属性标识
	 */
	public final static String FIELD_ID = "id";

	/**
	 *属性名称
	 */
	public final static String FIELD_NAME = "name";

	/**
	 * 数据类型
	 */
	public final static String FIELD_DATA_TYPE = "data_type";

	
	/**
	 * 附加参数
	 */
	public final static String FIELD_PARAMS = "params";
	
	
	
	/**
	 * 设置「属性标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Field setId(String val) {
		this.set(FIELD_ID, val);
		return this;
	}

	/**
	 * 获取「属性标识」值
	 *
	 */
	@JsonIgnore
	public String getId() {
		return (String) this.get(FIELD_ID);
	}

	/**
	 * 判断 「属性标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsId() {
		return this.contains(FIELD_ID);
	}

	/**
	 * 重置 「属性标识」
	 *
	 */
	@JsonIgnore
	public Field resetId() {
		this.reset(FIELD_ID);
		return this;
	}

	/**
	 * 设置「属性名称」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Field setName(String val) {
		this.set(FIELD_NAME, val);
		return this;
	}

	/**
	 * 获取「属性名称」值
	 *
	 */
	@JsonIgnore
	public String getName() {
		return (String) this.get(FIELD_NAME);
	}

	/**
	 * 判断 「属性名称」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsName() {
		return this.contains(FIELD_NAME);
	}

	/**
	 * 重置 「属性名称」
	 *
	 */
	@JsonIgnore
	public Field resetName() {
		this.reset(FIELD_NAME);
		return this;
	}

	/**
	 * 设置「数据类型」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Field setDataType(Integer val) {
		this.set(FIELD_DATA_TYPE, val);
		return this;
	}

	/**
	 * 获取「数据类型」值
	 *
	 */
	@JsonIgnore
	public Integer getDataType() {
		return (Integer) this.get(FIELD_DATA_TYPE);
	}

	/**
	 * 判断 「数据类型」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsDataType() {
		return this.contains(FIELD_DATA_TYPE);
	}

	/**
	 * 重置 「数据类型」
	 *
	 */
	@JsonIgnore
	public Field resetDataType() {
		this.reset(FIELD_DATA_TYPE);
		return this;
	}

	/**
	 * 设置「附加参数」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Field setParams(Integer val) {
		this.set(FIELD_PARAMS, val);
		return this;
	}

	/**
	 * 获取「附加参数」值
	 *
	 */
	@JsonIgnore
	public Integer getParams() {
		return (Integer) this.get(FIELD_PARAMS);
	}

	/**
	 * 判断 「附加参数」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsParams() {
		return this.contains(FIELD_PARAMS);
	}

	/**
	 * 重置 「附加参数」
	 *
	 */
	@JsonIgnore
	public Field resetParams() {
		this.reset(FIELD_PARAMS);
		return this;
	}

}

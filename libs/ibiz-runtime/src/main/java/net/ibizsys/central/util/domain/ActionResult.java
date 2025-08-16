package net.ibizsys.central.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import net.ibizsys.runtime.util.EntityBase;

/**
 * 通用操作结果
 * @author lionlau
 *
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ActionResult extends EntityBase {

	public final static String FIELD_CODE = "code";
	
	public final static String FIELD_INFO = "info";
	
	public final static String FIELD_DATA = "data";
	
	
	/**
	 * 设置「错误代码」
	 *
	 * @param val
	 */
	@JsonIgnore
	public void setCode(Integer val) {
		this.set(FIELD_CODE, val);
	}

	/**
	 * 获取「错误代码」值
	 *
	 */
	@JsonIgnore
	public Integer getCode() {
		return (Integer) this.get(FIELD_CODE);
	}

	/**
	 * 判断 「错误代码」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsCode() {
		return this.contains(FIELD_CODE);
	}

	/**
	 * 重置 「错误代码」
	 *
	 */
	@JsonIgnore
	public void resetCode() {
		this.reset(FIELD_CODE);
	}
	
	

	/**
	 * 设置「数据」
	 *
	 * @param val
	 */
	@JsonProperty(FIELD_DATA)
	public void setData(Object val) {
		this.set(FIELD_DATA, val);
	}

	/**
	 * 获取「数据」值
	 *
	 */
	@JsonIgnore
	public Object getData() {
		return (Object) this.get(FIELD_DATA);
	}

	/**
	 * 判断 「数据」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsData() {
		return this.contains(FIELD_DATA);
	}

	/**
	 * 重置 「数据」
	 *
	 */
	@JsonIgnore
	public void resetData() {
		this.reset(FIELD_DATA);
	}

	
	/**
	 * 设置「信息」
	 *
	 * @param val
	 */
	@JsonIgnore
	public void setInfo(String val) {
		this.set(FIELD_INFO, val);
	}

	/**
	 * 获取「信息」值
	 *
	 */
	@JsonIgnore
	public String getInfo() {
		return (String) this.get(FIELD_INFO);
	}

	/**
	 * 判断 「信息」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsInfo() {
		return this.contains(FIELD_INFO);
	}

	/**
	 * 重置 「信息」
	 *
	 */
	@JsonIgnore
	public void resetInfo() {
		this.reset(FIELD_INFO);
	}
}

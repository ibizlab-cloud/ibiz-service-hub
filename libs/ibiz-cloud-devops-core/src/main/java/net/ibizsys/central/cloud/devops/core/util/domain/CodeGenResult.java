package net.ibizsys.central.cloud.devops.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.central.util.EntityDTO;

public class CodeGenResult extends EntityDTO {

	public final static String FIELD_CODE = "code";
	
	/**
	 * 设置「代码」
	 *
	 * @param val
	 */
	@JsonIgnore
	public void setCode(String val) {
		this.set(FIELD_CODE, val);

	}

	/**
	 * 获取「代码」值
	 *
	 */
	@JsonIgnore
	public String getCode() {
		return (String) this.get(FIELD_CODE);
	}

	/**
	 * 判断 「代码」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsCode() {
		return this.contains(FIELD_CODE);
	}

	/**
	 * 重置 「代码」
	 *
	 */
	@JsonIgnore
	public void resetCode() {
		this.reset(FIELD_CODE);

	}
	
}

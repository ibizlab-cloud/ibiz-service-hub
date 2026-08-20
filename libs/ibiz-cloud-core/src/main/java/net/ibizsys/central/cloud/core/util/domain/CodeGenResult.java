package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 代码生成结果
 * 
 * @author lionlau
 *
 */
public class CodeGenResult extends EntityBase {

	public final static String FIELD_SUCCESS = "success";
	public final static String FIELD_CODE = "code";
	public final static String FIELD_ERROR_MESSAGE = "error_message";

	@JsonProperty(FIELD_SUCCESS)
	public CodeGenResult setSuccess(Boolean val) {
		this.set(FIELD_SUCCESS, val);
		return this;
	}

	@JsonIgnore
	public Boolean getSuccess() {
		return DataTypeUtils.asBoolean(this.get(FIELD_SUCCESS), null);
	}

	@JsonIgnore
	public boolean containsSuccess() {
		return this.contains(FIELD_SUCCESS);
	}

	@JsonIgnore
	public CodeGenResult resetSuccess() {
		this.reset(FIELD_SUCCESS);
		return this;
	}

	@JsonProperty(FIELD_CODE)
	public CodeGenResult setCode(String val) {
		this.set(FIELD_CODE, val);
		return this;
	}

	@JsonIgnore
	public String getCode() {
		return (String) this.get(FIELD_CODE);
	}

	@JsonIgnore
	public boolean containsCode() {
		return this.contains(FIELD_CODE);
	}

	@JsonIgnore
	public CodeGenResult resetCode() {
		this.reset(FIELD_CODE);
		return this;
	}

	@JsonProperty(FIELD_ERROR_MESSAGE)
	public CodeGenResult setErrorMessage(String val) {
		this.set(FIELD_ERROR_MESSAGE, val);
		return this;
	}

	@JsonIgnore
	public String getErrorMessage() {
		return (String) this.get(FIELD_ERROR_MESSAGE);
	}

	@JsonIgnore
	public boolean containsErrorMessage() {
		return this.contains(FIELD_ERROR_MESSAGE);
	}

	@JsonIgnore
	public CodeGenResult resetErrorMessage() {
		this.reset(FIELD_ERROR_MESSAGE);
		return this;
	}

}
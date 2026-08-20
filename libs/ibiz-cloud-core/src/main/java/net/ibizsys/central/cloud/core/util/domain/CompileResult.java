package net.ibizsys.central.cloud.core.util.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 动态编译结果
 * @author lionlau
 *
 */
public class CompileResult extends EntityBase {

    public final static String FIELD_SUCCESS = "success";
    public final static String FIELD_COMPILED_CLASS_NAME = "compiled_class_name";
    public final static String FIELD_ERROR_MESSAGE = "error_message";
    public final static String FIELD_ERRORS = "errors";  

    // ---------- success ----------
    @JsonProperty(FIELD_SUCCESS)
    public CompileResult setSuccess(Boolean val) {
        this.set(FIELD_SUCCESS, val);
        return this;
    }

    @JsonIgnore
    public Boolean getSuccess() {
    	return DataTypeUtils.asBoolean(this.get(FIELD_SUCCESS),  null);
    }

    @JsonIgnore
    public boolean containsSuccess() {
        return this.contains(FIELD_SUCCESS);
    }

    @JsonIgnore
    public CompileResult resetSuccess() {
        this.reset(FIELD_SUCCESS);
        return this;
    }

    // ---------- compiledClass ----------
    @JsonProperty(FIELD_COMPILED_CLASS_NAME)
    public CompileResult setCompiledClassName(String val) {
        this.set(FIELD_COMPILED_CLASS_NAME, val);
        return this;
    }

    @JsonIgnore
    public String getCompiledClassName() {
        return (String) this.get(FIELD_COMPILED_CLASS_NAME);
    }

    @JsonIgnore
    public boolean containsCompiledClassName() {
        return this.contains(FIELD_COMPILED_CLASS_NAME);
    }

    @JsonIgnore
    public CompileResult resetCompiledClassName() {
        this.reset(FIELD_COMPILED_CLASS_NAME);
        return this;
    }

    // ---------- errorMessage ----------
    @JsonProperty(FIELD_ERROR_MESSAGE)
    public CompileResult setErrorMessage(String val) {
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
    public CompileResult resetErrorMessage() {
        this.reset(FIELD_ERROR_MESSAGE);
        return this;
    }

    @JsonProperty(FIELD_ERRORS)
    public CompileResult setErrors(List<String> val) {
        this.set(FIELD_ERRORS, val);
        return this;
    }

    @JsonIgnore
    public List<String> getErrors() {
        return (List<String>) this.get(FIELD_ERRORS);
    }

    @JsonIgnore
    public boolean containsErrors() {
        return this.contains(FIELD_ERRORS);
    }

    @JsonIgnore
    public CompileResult resetErrors() {
        this.reset(FIELD_ERRORS);
        return this;
    }
}
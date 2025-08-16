package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

public class CompletionRequest  extends EntityBase {

	public final static String FIELD_PROMPT = "prompt";
	
	public final static String FIELD_SESSIONID = "sessionid";
	
	public final static String FIELD_MAXTOKENS = "maxtokens";
	
	public final static String FIELD_MODEL = "model";
	
	public final static String FIELD_STREAMING = "streaming";
	
	/**
	 * 设置「补全文本」
	 *
	 * @param val
	 */
	@JsonIgnore
	public CompletionRequest setPrompt(String val) {
		this.set(FIELD_PROMPT, val);
		return this;
	}

	/**
	 * 获取「补全文本」值
	 *
	 */
	@JsonIgnore
	public String getPrompt() {
		return (String) this.get(FIELD_PROMPT);
	}

	/**
	 * 判断 「补全文本」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsPrompt() {
		return this.contains(FIELD_PROMPT);
	}

	/**
	 * 重置 「补全文本」
	 *
	 */
	@JsonIgnore
	public CompletionRequest resetPrompt() {
		this.reset(FIELD_PROMPT);
		return this;
	}
	

	/**
	 * 设置「会话标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public CompletionRequest setSessionId(String val) {
		this.set(FIELD_SESSIONID, val);
		return this;
	}

	/**
	 * 获取「会话标识」值
	 *
	 */
	@JsonIgnore
	public String getSessionId() {
		return (String) this.get(FIELD_SESSIONID);
	}

	/**
	 * 判断 「会话标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsSessionId() {
		return this.contains(FIELD_SESSIONID);
	}

	/**
	 * 重置 「会话标识」
	 *
	 */
	@JsonIgnore
	public CompletionRequest resetSessionId() {
		this.reset(FIELD_SESSIONID);
		return this;
	}
	

	/**
	 * 设置「最大词量」
	 *
	 * @param val
	 */
	@JsonIgnore
	public CompletionRequest setMaxTokens(Integer val) {
		this.set(FIELD_MAXTOKENS, val);
		return this;
	}

	/**
	 * 获取「最大词量」值
	 *
	 */
	@JsonIgnore
	public Integer getMaxTokens() {
		return DataTypeUtils.asInteger(this.get(FIELD_MAXTOKENS), null);
	}

	/**
	 * 判断 「最大词量」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsMaxTokens() {
		return this.contains(FIELD_MAXTOKENS);
	}

	/**
	 * 重置 「最大词量」
	 *
	 */
	@JsonIgnore
	public CompletionRequest resetMaxTokens() {
		this.reset(FIELD_MAXTOKENS);
		return this;
	}
	
	/**
	 * 设置「模型」
	 *
	 * @param val
	 */
	@JsonIgnore
	public CompletionRequest setModel(String val) {
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
	public CompletionRequest resetModel() {
		this.reset(FIELD_MODEL);
		return this;
	}
	
	/**
     * 设置「是否流式反馈」
     *
     * @param val
    */
    @JsonIgnore
    public CompletionRequest setStreaming(Integer val) {
        this.set(FIELD_STREAMING, val);
        return this;
    }

    /**
     * 获取「是否流式反馈」值
     *
    */
    @JsonIgnore
    public Integer getStreaming() {
        try{
            return DataTypeUtils.getIntegerValue(this.get(FIELD_STREAMING),null);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 判断 「是否流式反馈」是否有值
     *
    */
    @JsonIgnore
    public boolean containsStreaming() {
        return this.contains(FIELD_STREAMING);
    }

    /**
     * 重置 「是否流式反馈」
     *
    */
    @JsonIgnore
    public CompletionRequest resetStreaming() {
        this.reset(FIELD_STREAMING);
        return this;
    }
}

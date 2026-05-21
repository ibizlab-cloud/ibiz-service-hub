package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 交谈补全用量
 *
 */
public class ChatCompletionUsage extends EntityBase {

	/**
	 * 提示词Token用量
	 */
	public final static String FIELD_PROMPTTOKENS = "prompttokens";
	
	/**
	 * 补全Token用量
	 */
	public final static String FIELD_COMPLETIONTOKENS = "completiontokens";
	
	
	/**
	 * 全部Token用量
	 */
	public final static String FIELD_TOTALTOKENS = "totaltokens";
	
	
	/**
	 * 工具调用次数
	 */
	public final static String FIELD_TOOLCALLS = "toolcalls";
	
	
	/**
	 * 设置「提示词Token用量」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatCompletionUsage setPromptTokens(Integer val) {
		this.set(FIELD_PROMPTTOKENS, val);
		return this;
	}

	/**
	 * 获取「提示词Token用量」值
	 *
	 */
	@JsonIgnore
	public Integer getPromptTokens() {
		return DataTypeUtils.asInteger(this.get(FIELD_PROMPTTOKENS), null);
	}

	/**
	 * 判断 「提示词Token用量」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsPromptTokens() {
		return this.contains(FIELD_PROMPTTOKENS);
	}

	/**
	 * 重置 「提示词Token用量」
	 *
	 */
	@JsonIgnore
	public ChatCompletionUsage resetPromptTokens() {
		this.reset(FIELD_PROMPTTOKENS);
		return this;
	}
	
	/**
	 * 设置「补全Token用量」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatCompletionUsage setCompletionTokens(Integer val) {
		this.set(FIELD_COMPLETIONTOKENS, val);
		return this;
	}

	/**
	 * 获取「补全Token用量」值
	 *
	 */
	@JsonIgnore
	public Integer getCompletionTokens() {
		return DataTypeUtils.asInteger(this.get(FIELD_COMPLETIONTOKENS), null);
	}

	/**
	 * 判断 「补全Token用量」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsCompletionTokens() {
		return this.contains(FIELD_COMPLETIONTOKENS);
	}

	/**
	 * 重置 「补全Token用量」
	 *
	 */
	@JsonIgnore
	public ChatCompletionUsage resetCompletionTokens() {
		this.reset(FIELD_COMPLETIONTOKENS);
		return this;
	}
	
	/**
	 * 设置「全部Token用量」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatCompletionUsage setTotalTokens(Integer val) {
		this.set(FIELD_TOTALTOKENS, val);
		return this;
	}

	/**
	 * 获取「全部Token用量」值
	 *
	 */
	@JsonIgnore
	public Integer getTotalTokens() {
		return DataTypeUtils.asInteger(this.get(FIELD_TOTALTOKENS), null);
	}

	/**
	 * 判断 「全部Token用量」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsTotalTokens() {
		return this.contains(FIELD_TOTALTOKENS);
	}

	/**
	 * 重置 「全部Token用量」
	 *
	 */
	@JsonIgnore
	public ChatCompletionUsage resetTotalTokens() {
		this.reset(FIELD_TOTALTOKENS);
		return this;
	}
	
	
	/**
	 * 设置「全部工具调用次数」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatCompletionUsage setToolCalls(Integer val) {
		this.set(FIELD_TOOLCALLS, val);
		return this;
	}

	/**
	 * 获取「全部工具调用次数」值
	 *
	 */
	@JsonIgnore
	public Integer getToolCalls() {
		return DataTypeUtils.asInteger(this.get(FIELD_TOOLCALLS), null);
	}

	/**
	 * 判断 「全部工具调用次数」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsToolCalls() {
		return this.contains(FIELD_TOOLCALLS);
	}

	/**
	 * 重置 「全部工具调用次数」
	 *
	 */
	@JsonIgnore
	public ChatCompletionUsage resetToolCalls() {
		this.reset(FIELD_TOOLCALLS);
		return this;
	}
}

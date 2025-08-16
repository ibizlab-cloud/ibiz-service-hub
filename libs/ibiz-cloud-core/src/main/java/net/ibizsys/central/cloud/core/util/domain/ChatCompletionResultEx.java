package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.jsonwebtoken.lang.Assert;

/**
 * AI交互补全结果扩展
 * @author lionlau
 *
 */
public class ChatCompletionResultEx extends ChatCompletionResult{

	public final static String FIELD_RESULT = "result";
	
	
	public ChatCompletionResultEx() {
		
	}
	
	
	public ChatCompletionResultEx(ChatCompletionResult chatCompletionResult) {
		Assert.notNull(chatCompletionResult, "传入交互完成结果对象无效");
		chatCompletionResult.copyTo(this);
	}
	
	
	/**
	 * 设置「实际结果」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatCompletionResultEx setResult(Object val) {
		this.set(FIELD_RESULT, val);
		return this;
	}

	/**
	 * 获取「实际结果」值
	 *
	 */
	@JsonIgnore
	public Object getResult() {
		return this.get(FIELD_RESULT);
	}

	/**
	 * 判断 「实际结果」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsResult() {
		return this.contains(FIELD_RESULT);
	}

	/**
	 * 重置 「实际结果」
	 *
	 */
	@JsonIgnore
	public ChatCompletionResultEx resetResult() {
		this.reset(FIELD_RESULT);
		return this;
	}
}

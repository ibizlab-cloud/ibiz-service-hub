package net.ibizsys.central.cloud.core.util.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.EntityBase;

/**
 * AI交互补全结果
 * @author lionlau
 *
 */
public class ChatCompletionResult extends EntityBase {

	public final static String FIELD_CHOICES = "choices";
	
	public final static String FIELD_SESSIONID = "sessionid";
	

	/**
	 * 设置「消息集合」
	 *
	 * @param val
	 */
	//@JsonIgnore
	@JsonProperty(FIELD_CHOICES)
	public ChatCompletionResult setChoices(List<ChatMessage> val) {
		this.set(FIELD_CHOICES, val);
		return this;
	}

	/**
	 * 获取「消息集合」值
	 *
	 */
	@JsonIgnore
	public List<ChatMessage> getChoices() {
		return (List<ChatMessage>) this.get(FIELD_CHOICES);
	}

	/**
	 * 判断 「消息集合」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsChoices() {
		return this.contains(FIELD_CHOICES);
	}

	/**
	 * 重置 「消息集合」
	 *
	 */
	@JsonIgnore
	public ChatCompletionResult resetChoices() {
		this.reset(FIELD_CHOICES);
		return this;
	}

	
	/**
	 * 设置「会话标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatCompletionResult setSessionId(String val) {
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
	public ChatCompletionResult resetSessionId() {
		this.reset(FIELD_SESSIONID);
		return this;
	}

}

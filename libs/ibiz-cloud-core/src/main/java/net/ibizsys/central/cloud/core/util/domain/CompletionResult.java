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
public class CompletionResult extends EntityBase {

	public final static String FIELD_CHOICES = "choices";

	/**
	 * 设置「选项集合」
	 *
	 * @param val
	 */
	//@JsonIgnore
	@JsonProperty(FIELD_CHOICES)
	public CompletionResult setChoices(List<Completion> val) {
		this.set(FIELD_CHOICES, val);
		return this;
	}

	/**
	 * 获取「选项集合」值
	 *
	 */
	@JsonIgnore
	public List<Completion> getChoices() {
		return (List<Completion>) this.get(FIELD_CHOICES);
	}

	/**
	 * 判断 「选项集合」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsChoices() {
		return this.contains(FIELD_CHOICES);
	}

	/**
	 * 重置 「选项集合」
	 *
	 */
	@JsonIgnore
	public CompletionResult resetChoices() {
		this.reset(FIELD_CHOICES);
		return this;
	}


}

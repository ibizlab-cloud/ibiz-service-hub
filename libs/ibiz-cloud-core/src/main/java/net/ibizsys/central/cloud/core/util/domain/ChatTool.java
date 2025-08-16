package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.EntityBase;

/**
 * 交谈辅助工具对象（用于AIChat）
 *
 */
public class ChatTool extends EntityBase {

	
	/**
	 * 工具类型
	 */
	public final static String FIELD_TYPE = "type";
	

	/**
	 *工具函数
	 *
	 */
	public final static String FIELD_FUNCTION = "function";

	
	
	/**
	 * 设置「工具类型」
	 *
	 * @param val
	 */
	@JsonProperty(FIELD_TYPE)
	public ChatTool setType(String val) {
		this.set(FIELD_TYPE, val);
		return this;
	}

	/**
	 * 获取「工具类型」值
	 *
	 */
	@JsonIgnore
	public String getType() {
		return (String) this.get(FIELD_TYPE);
	}

	/**
	 * 判断 「工具类型」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsType() {
		return this.contains(FIELD_TYPE);
	}

	/**
	 * 重置 「工具类型」
	 *
	 */
	@JsonIgnore
	public ChatTool resetType() {
		this.reset(FIELD_TYPE);
		return this;
	}
	
	
	/**
	 * 设置「工具函数」
	 *
	 * @param val
	 */
	@JsonProperty(FIELD_FUNCTION)
	public ChatTool setFunction(ChatFunction val) {
		this.set(FIELD_FUNCTION, val);
		return this;
	}

	/**
	 * 获取「工具函数」值
	 *
	 */
	@JsonIgnore
	public ChatFunction getFunction() {
		return (ChatFunction)this.get(FIELD_FUNCTION);
	}

	/**
	 * 判断 「工具函数」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsFunction() {
		return this.contains(FIELD_FUNCTION);
	}

	/**
	 * 重置 「工具函数」
	 *
	 */
	@JsonIgnore
	public ChatTool resetFunction() {
		this.reset(FIELD_FUNCTION);
		return this;
	}
	
	

}

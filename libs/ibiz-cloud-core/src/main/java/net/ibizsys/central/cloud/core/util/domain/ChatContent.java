package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import groovy.lang.GString;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 交谈内容对象
 *
 */
public class ChatContent extends EntityBase {

	/**
	 * 内容类型
	 */
	public final static String FIELD_TYPE = "type";
	
//	/**
//	 * 消息子类型
//	 */
//	public final static String FIELD_SUBTYPE = "subtype";
	

	/**
	 * 聊天内容
	 *
	 */
	public final static String FIELD_TEXT = "text";

	
	/**
	 *内容路径
	 *
	 */
	public final static String FIELD_URL = "url";
	

	
	
	/**
	 * 设置「内容类型」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatContent setType(String val) {
		this.set(FIELD_TYPE, val);
		return this;
	}

	/**
	 * 获取「内容类型」值
	 *
	 */
	@JsonIgnore
	public String getType() {
		return (String) this.get(FIELD_TYPE);
	}

	/**
	 * 判断 「内容类型」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsType() {
		return this.contains(FIELD_TYPE);
	}

	/**
	 * 重置 「内容类型」
	 *
	 */
	@JsonIgnore
	public ChatContent resetType() {
		this.reset(FIELD_TYPE);
		return this;
	}
	
	/**
	 * 设置「聊天内容」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatContent setText(Object val) {
		if(val instanceof GString) {
			val = ((GString)val).toString();
		}
		this.set(FIELD_TEXT, val);
		return this;
	}
	
	
	/**
	 * 设置「聊天内容」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatContent setText(String val) {
		this.set(FIELD_TEXT, val);
		return this;
	}
	

	/**
	 * 获取「聊天内容」值
	 *
	 */
	@JsonIgnore
	public String getText() {
		return DataTypeUtils.asString(this.get(FIELD_TEXT));
	}
	
	/**
	 * 判断 「聊天内容」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsText() {
		return this.contains(FIELD_TEXT);
	}

	/**
	 * 重置 「聊天内容」
	 *
	 */
	@JsonIgnore
	public ChatContent resetText() {
		this.reset(FIELD_TEXT);
		return this;
	}

	

	
	/**
	 * 设置「URL」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatContent setUrl(String val) {
		this.set(FIELD_URL, val);
		return this;
	}
	

	/**
	 * 获取「URL」值
	 *
	 */
	@JsonIgnore
	public String getUrl() {
		return (String) this.get(FIELD_URL);
	}

	/**
	 * 判断 「URL」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsUrl() {
		return this.contains(FIELD_URL);
	}

	/**
	 * 重置 「URL」
	 *
	 */
	@JsonIgnore
	public ChatContent resetUrl() {
		this.reset(FIELD_URL);
		return this;
	}
	
	
	
}

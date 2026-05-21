package net.ibizsys.central.cloud.core.util.domain;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.EntityBase;

public class ChatFunctionService extends EntityBase {

	/**
	 * Url
	 *
	 */
	public final static String FIELD_URL = "url";

	
	
	/**
	 * 设置「Url」
	 *
	 * @param val
	 */
	@JsonProperty(FIELD_URL)
	public ChatFunctionService setUrl(String val) {
		this.set(FIELD_URL, val);
		return this;
	}
	

	/**
	 * 获取「Url」值
	 *
	 */
	@JsonIgnore
	public String getUrl() {
		return (String) this.get(FIELD_URL);
	}

	/**
	 * 判断 「Url」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsUrl() {
		return this.contains(FIELD_URL);
	}

	/**
	 * 重置 「Url」
	 *
	 */
	@JsonIgnore
	public ChatFunctionService resetUrl() {
		this.reset(FIELD_URL);
		return this;
	}
	
	
	/**
	 * Method
	 *
	 */
	public final static String FIELD_METHOD = "method";

	
	
	/**
	 * 设置「Method」
	 *
	 * @param val
	 */
	@JsonProperty(FIELD_METHOD)
	public ChatFunctionService setMethod(String val) {
		this.set(FIELD_METHOD, val);
		return this;
	}
	

	/**
	 * 获取「Method」值
	 *
	 */
	@JsonIgnore
	public String getMethod() {
		return (String) this.get(FIELD_METHOD);
	}

	/**
	 * 判断 「Method」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsMethod() {
		return this.contains(FIELD_METHOD);
	}

	/**
	 * 重置 「Method」
	 *
	 */
	@JsonIgnore
	public ChatFunctionService resetMethod() {
		this.reset(FIELD_METHOD);
		return this;
	}
	
	/**
	 * Header
	 *
	 */
	public final static String FIELD_HEADER = "header";

	
	
	/**
	 * 设置「Header」
	 *
	 * @param val
	 */
	@JsonProperty(FIELD_HEADER)
	public ChatFunctionService setHeader(Map<String, Object> val) {
		this.set(FIELD_HEADER, val);
		return this;
	}
	

	/**
	 * 获取「Header」值
	 *
	 */
	@JsonIgnore
	public Map<String, Object> getHeader() {
		return (Map<String, Object>) this.get(FIELD_HEADER);
	}

	/**
	 * 判断 「Header」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsHeader() {
		return this.contains(FIELD_HEADER);
	}

	/**
	 * 重置 「Header」
	 *
	 */
	@JsonIgnore
	public ChatFunctionService resetHeader() {
		this.reset(FIELD_HEADER);
		return this;
	}
	
}

package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 开放平台二维码
 * 
 * @see ibizmos:/psmodules/uaa/psdataentities/SYS_OPEN_DEPT/.ibizmodel.index
 */
public class OpenQRCode extends EntityBase {

	public final static String FIELD_EXPIRESECONDS = "expireseconds";

	public final static String FIELD_URL = "url";
	
	public final static String FIELD_TICKET = "ticket";
	

	/**
	 * 设置「失效时长」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenQRCode setExpireSeconds(Integer val) {
		this.set(FIELD_EXPIRESECONDS, val);
		return this;
	}

	/**
	 * 获取「失效时长」值
	 *
	 */
	@JsonIgnore
	public Integer getExpireSeconds() {
		try {
			return DataTypeUtils.getIntegerValue(this.get(FIELD_EXPIRESECONDS), null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 判断 「失效时长」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsExpireSeconds() {
		return this.contains(FIELD_EXPIRESECONDS);
	}

	/**
	 * 重置 「失效时长」
	 *
	 */
	@JsonIgnore
	public OpenQRCode resetExpireSeconds() {
		this.reset(FIELD_EXPIRESECONDS);
		return this;
	}

	/**
	 * 设置「场景」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenQRCode setUrl(String val) {
		this.set(FIELD_URL, val);
		return this;
	}

	/**
	 * 获取「场景」值
	 *
	 */
	@JsonIgnore
	public String getUrl() {
		return (String) this.get(FIELD_URL);
	}

	/**
	 * 判断 「场景」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsUrl() {
		return this.contains(FIELD_URL);
	}

	/**
	 * 重置 「场景」
	 *
	 */
	@JsonIgnore
	public OpenQRCode resetUrl() {
		this.reset(FIELD_URL);
		return this;
	}

	/**
	 * 设置「票据」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenQRCode setTicket(String val) {
		this.set(FIELD_TICKET, val);
		return this;
	}

	/**
	 * 获取「票据」值
	 *
	 */
	@JsonIgnore
	public String getTicket() {
		return (String) this.get(FIELD_TICKET);
	}

	/**
	 * 判断 「票据」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsTicket() {
		return this.contains(FIELD_TICKET);
	}

	/**
	 * 重置 「票据」
	 *
	 */
	@JsonIgnore
	public OpenQRCode resetTicket() {
		this.reset(FIELD_TICKET);
		return this;
	}
	
}

package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.EntityBase;

/**
 * 开放平台二维码扫描结果
 * 
 */
public class OpenQRCodeScanResult extends EntityBase {

	public final static String FIELD_OPENUSERID = "openuserid";
	
	public final static String FIELD_TICKET = "ticket";
	

	/**
	 * 设置「扫描用户标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenQRCodeScanResult setOpenUserId(String val) {
		this.set(FIELD_OPENUSERID, val);
		return this;
	}

	/**
	 * 获取「扫描用户标识」值
	 *
	 */
	@JsonIgnore
	public String getOpenUserId() {
		return (String) this.get(FIELD_OPENUSERID);
	}

	/**
	 * 判断 「扫描用户标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsOpenUserId() {
		return this.contains(FIELD_OPENUSERID);
	}

	/**
	 * 重置 「扫描用户标识」
	 *
	 */
	@JsonIgnore
	public OpenQRCodeScanResult resetOpenUserId() {
		this.reset(FIELD_OPENUSERID);
		return this;
	}

	/**
	 * 设置「票据」
	 *
	 * @param val
	 */
	@JsonIgnore
	public OpenQRCodeScanResult setTicket(String val) {
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
	public OpenQRCodeScanResult resetTicket() {
		this.reset(FIELD_TICKET);
		return this;
	}
	
}

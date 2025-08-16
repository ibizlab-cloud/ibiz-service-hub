package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.EntityBase;

/**
 * 门户消息对象
 *
 */
public class PortalMessage extends EntityBase {

	/**
	* 消息标识
	*/
	public final static String FIELD_MESSAGEID = "messageid";

	/**
	 * 消息名称
	 *
	 */
	public final static String FIELD_MESSAGENAME = "messagename";

	/**
	 * 消息类型
	 */
	public final static String FIELD_TYPE = "type";
	
	/**
	 * 消息子类型
	 */
	public final static String FIELD_SUBTYPE = "subtype";
	

	/**
	 * 消息内容
	 *
	 */
	public final static String FIELD_CONTENT = "content";

	/**
	 *消息数据
	 *
	 */
	public final static String FIELD_DATA = "data";

	/**
	 *消息路径
	 *
	 */
	public final static String FIELD_URL = "url";
	
	
	/**
	 *标题
	 *
	 */
	public final static String FIELD_SUBJECT = "subject";
	

	/**
	 *移动端消息路径
	 *
	 */
	public final static String FIELD_MOBILEURL = "mobileurl";
	
	
	/**
	 * 设置「消息标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public PortalMessage setMessageId(String val) {
		this.set(FIELD_MESSAGEID, val);
		return this;
	}

	/**
	 * 获取「消息标识」值
	 *
	 */
	@JsonIgnore
	public String getMessageId() {
		return (String) this.get(FIELD_MESSAGEID);
	}

	/**
	 * 判断 「消息标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsMessageId() {
		return this.contains(FIELD_MESSAGEID);
	}

	/**
	 * 重置 「消息标识」
	 *
	 */
	@JsonIgnore
	public PortalMessage resetMessageId() {
		this.reset(FIELD_MESSAGEID);
		return this;
	}

	/**
	 * 设置「消息标题」
	 *
	 * @param val
	 */
	@JsonIgnore
	public PortalMessage setMessageName(String val) {
		this.set(FIELD_MESSAGENAME, val);
		return this;
	}

	/**
	 * 获取「消息标题」值
	 *
	 */
	@JsonIgnore
	public String getMessageName() {
		return (String) this.get(FIELD_MESSAGENAME);
	}

	/**
	 * 判断 「消息标题」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsMessageName() {
		return this.contains(FIELD_MESSAGENAME);
	}

	/**
	 * 重置 「消息标题」
	 *
	 */
	@JsonIgnore
	public PortalMessage resetMessageName() {
		this.reset(FIELD_MESSAGENAME);
		return this;
	}

	/**
	 * 设置「消息类型」
	 *
	 * @param val
	 */
	@JsonIgnore
	public PortalMessage setType(String val) {
		this.set(FIELD_TYPE, val);
		return this;
	}

	/**
	 * 获取「消息类型」值
	 *
	 */
	@JsonIgnore
	public String getType() {
		return (String) this.get(FIELD_TYPE);
	}

	/**
	 * 判断 「消息类型」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsType() {
		return this.contains(FIELD_TYPE);
	}

	/**
	 * 重置 「消息类型」
	 *
	 */
	@JsonIgnore
	public PortalMessage resetType() {
		this.reset(FIELD_TYPE);
		return this;
	}
	
	
	/**
	 * 设置「消息子类型」
	 *
	 * @param val
	 */
	@JsonIgnore
	public PortalMessage setSubType(String val) {
		this.set(FIELD_SUBTYPE, val);
		return this;
	}

	/**
	 * 获取「消息子类型」值
	 *
	 */
	@JsonIgnore
	public String getSubType() {
		return (String) this.get(FIELD_SUBTYPE);
	}

	/**
	 * 判断 「消息子类型」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsSubType() {
		return this.contains(FIELD_SUBTYPE);
	}

	/**
	 * 重置 「消息子类型」
	 *
	 */
	@JsonIgnore
	public PortalMessage resetSubType() {
		this.reset(FIELD_SUBTYPE);
		return this;
	}
	
	

	/**
	 * 设置「消息内容」
	 *
	 * @param val
	 */
	@JsonIgnore
	public PortalMessage setContent(String val) {
		this.set(FIELD_CONTENT, val);
		return this;
	}

	/**
	 * 获取「消息内容」值
	 *
	 */
	@JsonIgnore
	public String getContent() {
		return (String) this.get(FIELD_CONTENT);
	}

	/**
	 * 判断 「消息内容」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsContent() {
		return this.contains(FIELD_CONTENT);
	}

	/**
	 * 重置 「消息内容」
	 *
	 */
	@JsonIgnore
	public PortalMessage resetContent() {
		this.reset(FIELD_CONTENT);
		return this;
	}

	
	/**
	 * 设置「消息数据」
	 *
	 * @param val
	 */
	@JsonIgnore
	public PortalMessage setData(Object val) {
		this.set(FIELD_DATA, val);
		return this;
	}

	/**
	 * 获取「消息数据」值
	 *
	 */
	@JsonIgnore
	public Object getData() {
		return this.get(FIELD_DATA);
	}

	/**
	 * 判断 「消息数据」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsData() {
		return this.contains(FIELD_DATA);
	}

	/**
	 * 重置 「消息数据」
	 *
	 */
	@JsonIgnore
	public PortalMessage resetData() {
		this.reset(FIELD_DATA);
		return this;
	}
	
	
	/**
	 * 设置「URL」
	 *
	 * @param val
	 */
	@JsonIgnore
	public PortalMessage setUrl(Object val) {
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
	public PortalMessage resetUrl() {
		this.reset(FIELD_URL);
		return this;
	}
	
	/**
	 * 设置「SUBJECT」
	 *
	 * @param val
	 */
	@JsonIgnore
	public PortalMessage setSubject(Object val) {
		this.set(FIELD_SUBJECT, val);
		return this;
	}
	
	

	/**
	 * 获取「SUBJECT」值
	 *
	 */
	@JsonIgnore
	public String getSubject() {
		return (String) this.get(FIELD_SUBJECT);
	}

	/**
	 * 判断 「SUBJECT」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsSubject() {
		return this.contains(FIELD_SUBJECT);
	}

	/**
	 * 重置 「SUBJECT」
	 *
	 */
	@JsonIgnore
	public PortalMessage resetSubject() {
		this.reset(FIELD_SUBJECT);
		return this;
	}
	
	
	
	/**
	 * 设置「MOBILEURL」
	 *
	 * @param val
	 */
	@JsonIgnore
	public PortalMessage setMobileUrl(Object val) {
		this.set(FIELD_MOBILEURL, val);
		return this;
	}
	

	/**
	 * 获取「MOBILEURL」值
	 *
	 */
	@JsonIgnore
	public String getMobileUrl() {
		return (String) this.get(FIELD_MOBILEURL);
	}

	/**
	 * 判断 「MOBILEURL」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsMobileUrl() {
		return this.contains(FIELD_MOBILEURL);
	}

	/**
	 * 重置 「MOBILEURL」
	 *
	 */
	@JsonIgnore
	public PortalMessage resetMobileUrl() {
		this.reset(FIELD_MOBILEURL);
		return this;
	}
	
}

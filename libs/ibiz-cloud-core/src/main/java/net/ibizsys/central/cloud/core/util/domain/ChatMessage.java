package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.EntityBase;

/**
 * 交谈消息对象（用于AIChat）
 *
 */
public class ChatMessage extends EntityBase {

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
	 * 消息角色
	 */
	public final static String FIELD_ROLE = "role";
	
	
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
	 *工具名称
	 *
	 */
	public final static String FIELD_TOOLNAME = "toolname";
	
	
	/**
	 *工具调用标识
	 *
	 */
	public final static String FIELD_TOOLCALLID = "toolcallid";

	/**
	 * 设置「消息标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatMessage setMessageId(String val) {
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
	public ChatMessage resetMessageId() {
		this.reset(FIELD_MESSAGEID);
		return this;
	}

	/**
	 * 设置「消息标题」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatMessage setMessageName(String val) {
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
	public ChatMessage resetMessageName() {
		this.reset(FIELD_MESSAGENAME);
		return this;
	}

	/**
	 * 设置「消息角色」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatMessage setRole(String val) {
		this.set(FIELD_ROLE, val);
		return this;
	}

	/**
	 * 获取「消息角色」值
	 *
	 */
	@JsonIgnore
	public String getRole() {
		return (String) this.get(FIELD_ROLE);
	}

	/**
	 * 判断 「消息角色」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsRole() {
		return this.contains(FIELD_ROLE);
	}

	/**
	 * 重置 「消息角色」
	 *
	 */
	@JsonIgnore
	public ChatMessage resetRole() {
		this.reset(FIELD_ROLE);
		return this;
	}
	
	
	
	/**
	 * 设置「消息类型」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatMessage setType(String val) {
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
	public ChatMessage resetType() {
		this.reset(FIELD_TYPE);
		return this;
	}
	
	
	/**
	 * 设置「消息子类型」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatMessage setSubType(String val) {
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
	public ChatMessage resetSubType() {
		this.reset(FIELD_SUBTYPE);
		return this;
	}
	
	

	/**
	 * 设置「消息内容」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatMessage setContent(String val) {
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
	public ChatMessage resetContent() {
		this.reset(FIELD_CONTENT);
		return this;
	}

	
	/**
	 * 设置「消息数据」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatMessage setData(Object val) {
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
	public ChatMessage resetData() {
		this.reset(FIELD_DATA);
		return this;
	}
	
	/**
	 * 设置「URL」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatMessage setUrl(Object val) {
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
	public ChatMessage resetUrl() {
		this.reset(FIELD_URL);
		return this;
	}
	
	/**
	 * 设置「工具名称」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatMessage setToolName(Object val) {
		this.set(FIELD_TOOLNAME, val);
		return this;
	}
	

	/**
	 * 获取「工具名称」值
	 *
	 */
	@JsonIgnore
	public String getToolName() {
		return (String) this.get(FIELD_TOOLNAME);
	}

	/**
	 * 判断 「工具名称」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsToolName() {
		return this.contains(FIELD_TOOLNAME);
	}

	/**
	 * 重置 「工具名称」
	 *
	 */
	@JsonIgnore
	public ChatMessage resetToolName() {
		this.reset(FIELD_TOOLNAME);
		return this;
	}

	/**
	 * 设置「工具调用标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public ChatMessage setToolCallId(Object val) {
		this.set(FIELD_TOOLCALLID, val);
		return this;
	}
	

	/**
	 * 获取「工具调用标识」值
	 *
	 */
	@JsonIgnore
	public String getToolCallId() {
		return (String) this.get(FIELD_TOOLCALLID);
	}

	/**
	 * 判断 「工具调用标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsToolCallId() {
		return this.contains(FIELD_TOOLCALLID);
	}

	/**
	 * 重置 「工具调用标识」
	 *
	 */
	@JsonIgnore
	public ChatMessage resetToolCallId() {
		this.reset(FIELD_TOOLCALLID);
		return this;
	}
	
}

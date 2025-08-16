package net.ibizsys.central.cloud.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.EntityBase;

/**
 *  补全消息对象（用于AIChat）
 *
 */
public class Completion extends EntityBase {

	/**
	* 补全消息标识
	*/
	public final static String FIELD_COMPLETIONID = "completionid";

	/**
	 * 补全消息名称
	 *
	 */
	public final static String FIELD_COMPLETIONNAME = "completionname";
	
	/**
	 * 补全消息类型
	 */
	public final static String FIELD_TYPE = "type";
	
	/**
	 * 消补全消息子类型
	 */
	public final static String FIELD_SUBTYPE = "subtype";
	
	/**
	 * 补全消息内容
	 *
	 */
	public final static String FIELD_CONTENT = "content";

	/**
	 *补全消息数据
	 *
	 */
	public final static String FIELD_DATA = "data";

	/**
	 *补全消息路径
	 *
	 */
	public final static String FIELD_URL = "url";
	
	

	/**
	 * 设置「消息标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Completion setCompletionId(String val) {
		this.set(FIELD_COMPLETIONID, val);
		return this;
	}

	/**
	 * 获取「消息标识」值
	 *
	 */
	@JsonIgnore
	public String getCompletionId() {
		return (String) this.get(FIELD_COMPLETIONID);
	}

	/**
	 * 判断 「消息标识」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsCompletionId() {
		return this.contains(FIELD_COMPLETIONID);
	}

	/**
	 * 重置 「消息标识」
	 *
	 */
	@JsonIgnore
	public Completion resetCompletionId() {
		this.reset(FIELD_COMPLETIONID);
		return this;
	}

	/**
	 * 设置「消息标题」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Completion setCompletionName(String val) {
		this.set(FIELD_COMPLETIONNAME, val);
		return this;
	}

	/**
	 * 获取「消息标题」值
	 *
	 */
	@JsonIgnore
	public String getCompletionName() {
		return (String) this.get(FIELD_COMPLETIONNAME);
	}

	/**
	 * 判断 「消息标题」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsCompletionName() {
		return this.contains(FIELD_COMPLETIONNAME);
	}

	/**
	 * 重置 「消息标题」
	 *
	 */
	@JsonIgnore
	public Completion resetCompletionName() {
		this.reset(FIELD_COMPLETIONNAME);
		return this;
	}

	
	
	/**
	 * 设置「消息类型」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Completion setType(String val) {
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
	public Completion resetType() {
		this.reset(FIELD_TYPE);
		return this;
	}
	
	
	/**
	 * 设置「消息子类型」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Completion setSubType(String val) {
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
	public Completion resetSubType() {
		this.reset(FIELD_SUBTYPE);
		return this;
	}
	
	

	/**
	 * 设置「消息内容」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Completion setContent(String val) {
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
	public Completion resetContent() {
		this.reset(FIELD_CONTENT);
		return this;
	}

	
	/**
	 * 设置「消息数据」
	 *
	 * @param val
	 */
	@JsonIgnore
	public Completion setData(Object val) {
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
	public Completion resetData() {
		this.reset(FIELD_DATA);
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
	public Completion resetUrl() {
		this.reset(FIELD_URL);
		return this;
	}

	
}

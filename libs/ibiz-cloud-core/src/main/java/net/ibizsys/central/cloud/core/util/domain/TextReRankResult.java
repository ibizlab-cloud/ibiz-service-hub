package net.ibizsys.central.cloud.core.util.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.EntityBase;

/**
 * 文本排序结果对象
 * @author lionlau
 *
 */
public class TextReRankResult extends EntityBase {

	public final static String FIELD_DOCUMENTS = "documents";
	
	public final static String FIELD_SESSIONID = "sessionid";
	

	/**
	 * 设置「文档集合」
	 *
	 * @param val
	 */
	//@JsonIgnore
	@JsonProperty(FIELD_DOCUMENTS)
	public TextReRankResult setDocuments(List<TextReRankDocument> val) {
		this.set(FIELD_DOCUMENTS, val);
		return this;
	}

	/**
	 * 获取「文档集合」值
	 *
	 */
	@JsonIgnore
	public List<TextReRankDocument> getDocuments() {
		return (List<TextReRankDocument>) this.get(FIELD_DOCUMENTS);
	}

	/**
	 * 判断 「文档集合」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsDocuments() {
		return this.contains(FIELD_DOCUMENTS);
	}

	/**
	 * 重置 「文档集合」
	 *
	 */
	@JsonIgnore
	public TextReRankResult resetDocuments() {
		this.reset(FIELD_DOCUMENTS);
		return this;
	}

	
	/**
	 * 设置「会话标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public TextReRankResult setSessionId(String val) {
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
	public TextReRankResult resetSessionId() {
		this.reset(FIELD_SESSIONID);
		return this;
	}

}

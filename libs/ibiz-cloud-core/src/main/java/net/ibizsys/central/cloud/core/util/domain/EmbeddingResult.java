package net.ibizsys.central.cloud.core.util.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.EntityBase;

/**
 * Embedding结果
 * @author lionlau
 *
 */
public class EmbeddingResult extends EntityBase {

	public final static String FIELD_DATA = "data";
	
	public final static String FIELD_SESSIONID = "sessionid";
	

	/**
	 * 设置「嵌入数据集合」
	 *
	 * @param val
	 */
	//@JsonIgnore
	@JsonProperty(FIELD_DATA)
	public EmbeddingResult setData(List<Embedding> val) {
		this.set(FIELD_DATA, val);
		return this;
	}

	/**
	 * 获取「嵌入数据集合」值
	 *
	 */
	@JsonIgnore
	public List<Embedding> getData() {
		return (List<Embedding>) this.get(FIELD_DATA);
	}

	/**
	 * 判断 「嵌入数据集合」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsData() {
		return this.contains(FIELD_DATA);
	}

	/**
	 * 重置 「嵌入数据集合」
	 *
	 */
	@JsonIgnore
	public EmbeddingResult resetData() {
		this.reset(FIELD_DATA);
		return this;
	}

	
	/**
	 * 设置「会话标识」
	 *
	 * @param val
	 */
	@JsonIgnore
	public EmbeddingResult setSessionId(String val) {
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
	public EmbeddingResult resetSessionId() {
		this.reset(FIELD_SESSIONID);
		return this;
	}

}

package net.ibizsys.central.cloud.core.util.domain;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 文本重排序文档
 *
 */
public class TextReRankDocument extends EntityBase {

	/**
	 * 文档
	 *
	 */
	public final static String FIELD_DOCUMENT = "document";


	/**
	 * 相关性评分
	 */
	public final static String FIELD_RELEVANCESCORE = "relevancescore";

	/**
	 * 索引
	 */
	public final static String FIELD_INDEX = "index";

	/**
	 * 设置「索引」
	 *
	 * @param val
	 */
	@JsonIgnore
	public TextReRankDocument setIndex(Integer val) {
		this.set(FIELD_INDEX, val);
		return this;
	}

	/**
	 * 获取「索引」值
	 *
	 */
	@JsonIgnore
	public Integer getIndex() {
		return DataTypeUtils.asInteger(this.get(FIELD_INDEX), null);
	}

	/**
	 * 判断 「索引」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsIndex() {
		return this.contains(FIELD_INDEX);
	}

	/**
	 * 重置 「索引」
	 *
	 */
	@JsonIgnore
	public TextReRankDocument resetIndex() {
		this.reset(FIELD_INDEX);
		return this;
	}

	/**
	 * 设置「文档」
	 *
	 * @param val
	 */
	@JsonIgnore
	public TextReRankDocument setDocument(Document val) {
		this.set(FIELD_DOCUMENT, val);
		return this;
	}

	/**
	 * 获取「文档」值
	 *
	 */
	@JsonIgnore
	public Document getDocument() {
		return (Document) this.get(FIELD_DOCUMENT);
	}

	/**
	 * 判断 「文档」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsDocument() {
		return this.contains(FIELD_DOCUMENT);
	}

	/**
	 * 重置 「文档」
	 *
	 */
	@JsonIgnore
	public TextReRankDocument resetDocument() {
		this.reset(FIELD_DOCUMENT);
		return this;
	}

	

	/**
	 * 设置「相关性评分」
	 *
	 * @param val
	 */
	@JsonIgnore
	public TextReRankDocument setRelevanceScore(BigDecimal val) {
		this.set(FIELD_RELEVANCESCORE, val);
		return this;
	}

	/**
	 * 获取「相关性评分」值
	 *
	 */
	@JsonIgnore
	public BigDecimal getRelevanceScore() {
		try {
			return DataTypeUtils.asBigDecimal(this.get(FIELD_RELEVANCESCORE), null);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 判断 「相关性评分」是否有值
	 *
	 */
	@JsonIgnore
	public boolean containsRelevanceScore() {
		return this.contains(FIELD_RELEVANCESCORE);
	}

	/**
	 * 重置 「相关性评分」
	 *
	 */
	@JsonIgnore
	public TextReRankDocument resetRelevanceScore() {
		this.reset(FIELD_RELEVANCESCORE);
		return this;
	}

}

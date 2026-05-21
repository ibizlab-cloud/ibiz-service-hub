package net.ibizsys.central.plugin.ai.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

/**
 * 页面目录配置
 * @author lionlau
 *
 */
public class PageIndexConfig extends EntityBase {

	/**
	 * 是否使用页面目录
	 */
	public final static String FIELD__USE_PAGEINDEX = "use_pageindex"; 
	
	/**
	 * 每次构建目录的页面数，默认为5，最大为20
	 */
	public final static String FIELD__PAGES_PER_INDEX = "pages_per_index";
	
	
	/**
	 * 仅构建页面片段
	 */
	public final static String FIELD__PAGEINDEX_ONLY = "pageindex_only";
	
	
	//public final static String FIELD__PROMPT = "prompt";
	
	public final static String FIELD__TOC_VALIDATION_PROMPT = "toc_validation_prompt";
	
	public final static String FIELD__PAGE_INDEXER_PROMPT = "page_indexer_prompt";
	
	
	public final static String FIELD__CHAT_AGENT = "chat_agent";
	
	public final static String FIELD__EMBEDDING_AGENT = "embedding_agent";
	
	public final static String FIELD__RERANK_AGENT = "rerank_agent";
	
	

	@JsonIgnore
	public int getPagesPerIndex() {
		int value = DataTypeUtils.asInteger(this.get(FIELD__PAGES_PER_INDEX), 5);
		if (value < 1) {
			return 1;
		}

		if (value > 20) {
			return 20;
		}

		return value;
	}

	@JsonIgnore
	public void setPagesPerIndex(int value) {
		this.set(FIELD__PAGES_PER_INDEX, value);
	}
	
	@JsonIgnore
	public boolean isUsePageIndex() {
		return DataTypeUtils.asBoolean(this.get(FIELD__USE_PAGEINDEX), false);
	}

	@JsonIgnore
	public void setUsePageIndex(boolean value) {
		this.set(FIELD__USE_PAGEINDEX, value);
	}

	@JsonIgnore
	public boolean isPageIndexOnly() {
		return DataTypeUtils.asBoolean(this.get(FIELD__PAGEINDEX_ONLY), false);
	}

	@JsonIgnore
	public void setPageIndexOnly(boolean value) {
		this.set(FIELD__PAGEINDEX_ONLY, value);
	}

	
	@JsonIgnore
	public String getTOCValidationPrompt() {
		return DataTypeUtils.asString(this.get(FIELD__TOC_VALIDATION_PROMPT), null);
	}

	@JsonIgnore
	public void setTOCValidationPrompt(String value) {
		this.set(FIELD__TOC_VALIDATION_PROMPT, value);
	}
	
	@JsonIgnore
	public String getPageIndexerPrompt() {
		return DataTypeUtils.asString(this.get(FIELD__PAGE_INDEXER_PROMPT), null);
	}

	@JsonIgnore
	public void setPageIndexerPrompt(String value) {
		this.set(FIELD__PAGE_INDEXER_PROMPT, value);
	}
	

	@JsonIgnore
	public String getChatAgent() {
		return DataTypeUtils.asString(this.get(FIELD__CHAT_AGENT), null);
	}

	@JsonIgnore
	public void setChatAgent(String value) {
		this.set(FIELD__CHAT_AGENT, value);
	}
	
	@JsonIgnore
	public String getEmbeddingAgent() {
		return DataTypeUtils.asString(this.get(FIELD__EMBEDDING_AGENT), null);
	}

	@JsonIgnore
	public void setEmbeddingAgent(String value) {
		this.set(FIELD__EMBEDDING_AGENT, value);
	}
	
	@JsonIgnore
	public String getReRankAgent() {
		return DataTypeUtils.asString(this.get(FIELD__RERANK_AGENT), null);
	}

	@JsonIgnore
	public void setReRankAgent(String value) {
		this.set(FIELD__RERANK_AGENT, value);
	}

}

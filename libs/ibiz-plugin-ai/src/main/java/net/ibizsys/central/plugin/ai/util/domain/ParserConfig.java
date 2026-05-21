package net.ibizsys.central.plugin.ai.util.domain;





import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

public class ParserConfig extends EntityBase {

	/*
	 * 
			Defaults to 0
			Minimum: 0
			Maximum: 32
	 */
	public final static String FIELD__AUTO_KEYWORDS = "auto_keywords";
	
	
	/*Defaults to 0
		Minimum: 0
		Maximum: 10*/
	public final static String FIELD__AUTO_QUESTIONS = "auto_questions";
	
	/**
	 * 自动关键字提示词
	 */
	public final static String FIELD__AUTO_KEYWORD_PROMPT = "auto_keyword_prompt";
	
	/**
	 * 自动问题提示词
	 */
	public final static String FIELD__AUTO_QUESTION_PROMPT = "auto_question_prompt";
	
	/**
	 * 片段展开提示词
	 */
	public final static String FIELD__CHUNK_EXTRACTION_PROMPT = "chunk_extraction_prompt";
	
	/**
	 * 片段展开子提示词
	 */
	public final static String FIELD__CHUNK_EXTRACTION_SUB_PROMPT = "chunk_extraction_sub_prompt";
	
	
	/**
	 * Defaults to "\n".
	 */
	public final static String FIELD__DELIMITER = "delimiter";
	
	/**
	 * Defaults to 512, Minimum: 1, Maximum: 2048
	 */
	public final static String FIELD__CHUNK_TOKEN_NUM = "chunk_token_num";
	
	/**
	 * Defaults to 50, Minimum: 1, Maximum: 100
	 */
	public final static String FIELD__CHUNK_OVERLAP_NUM = "chunk_overlap_num";
	
	
	
	/**
	 * bool Indicates whether to convert Excel documents into HTML format.
	 */
	public final static String FIELD__HTML4EXCEL = "html4excel";
	
	
	public final static String FIELD__LAYOUT_RECOGNIZE = "layout_recognize";
	
	/**
	 * "tag_kb_ids": array<string> refer to Use tag set
	 */
	public final static String FIELD__TAG_KB_IDS = "tag_kb_ids";
	
	/**
	 * "task_page_size": int For PDF only.
		Defaults to 12
		Minimum: 1
	 */
	public final static String FIELD__TASK_PAGE_SIZE = "task_page_size";
	
	
	public final static String FIELD__RAPTOR = "raptor";
	
	public final static String FIELD__PAGEINDEX = "pageindex";
	
	public final static String FIELD__GRAPHRAG = "graphrag";
	
	public final static String FIELD__TAGS = "tags";
	
	
	/**
	 * 分析器配置：预处理规则
	 */
	public final static String FIELD__PRE_PROCESS_RULES = "pre_process_rules";
	
	public final static String FIELD__CHAT_AGENT = "chat_agent";
	
	public final static String FIELD__EMBEDDING_AGENT = "embedding_agent";
	
	public final static String FIELD__RERANK_AGENT = "rerank_agent";
	

	
	@JsonIgnore
	public int getAutoKeywords() {
		int value = DataTypeUtils.asInteger(this.get(FIELD__AUTO_KEYWORDS), 0);
		if(value <0) {
			return 0;
		}
		
		if(value > 32) {
			return 32;
		}
		
		return value;
	}
	
	@JsonIgnore
	public void setAutoKeywords(int value) {
		this.set(FIELD__AUTO_KEYWORDS, value);
	}
	
	
	@JsonIgnore
	public int getAutoQuestions() {
		int value = DataTypeUtils.asInteger(this.get(FIELD__AUTO_QUESTIONS), 0);
		if(value <0) {
			return 0;
		}
		
		if(value > 10) {
			return 10;
		}
		
		return value;
	}
	
	@JsonIgnore
	public void setAutoQuestions(int value) {
		this.set(FIELD__AUTO_QUESTIONS, value);
	}
	
	
	@JsonIgnore
	public String getDelimiter() {
		return DataTypeUtils.asString(this.get(FIELD__DELIMITER), "\n");
	}
	
	@JsonIgnore
	public void setDelimiter(String value) {
		this.set(FIELD__DELIMITER, value);
	}
	
	
	@JsonIgnore
	public int getChunkTokenNum() {
		int value = DataTypeUtils.asInteger(this.get(FIELD__CHUNK_TOKEN_NUM), 512);
		if(value <=0) {
			return 1;
		}
		
		if(value > 2048) {
			return 2048;
		}
		
		return value;
	}
	
	@JsonIgnore
	public void setChunkTokenNum(int value) {
		this.set(FIELD__CHUNK_TOKEN_NUM, value);
	}
	
	@JsonIgnore
	public int getChunkOverlapNum() {
		int value = DataTypeUtils.asInteger(this.get(FIELD__CHUNK_OVERLAP_NUM), 50);
		if(value <0) {
			return 0;
		}
		
		if(value > 100) {
			return 100;
		}
		
		return value;
	}
	
	@JsonIgnore
	public void setChunkOverlapNum(int value) {
		this.set(FIELD__CHUNK_OVERLAP_NUM, value);
	}
	
	@JsonIgnore
	public String getPreProcessRules() {
		return DataTypeUtils.asString(this.get(FIELD__PRE_PROCESS_RULES), null);
	}
	
	@JsonIgnore
	public void setPreProcessRules(String value) {
		this.set(FIELD__PRE_PROCESS_RULES, value);
	}
	
	@JsonIgnore
	public String getAutoQuestionPrompt() {
		return DataTypeUtils.asString(this.get(FIELD__AUTO_QUESTION_PROMPT), null);
	}

	@JsonIgnore
	public void setAutoQuestionPrompt(String value) {
		this.set(FIELD__AUTO_QUESTION_PROMPT, value);
	}
	
	@JsonIgnore
	public String getAutoKeywordPrompt() {
		return DataTypeUtils.asString(this.get(FIELD__AUTO_KEYWORD_PROMPT), null);
	}

	@JsonIgnore
	public void setAutoKeywordPrompt(String value) {
		this.set(FIELD__AUTO_KEYWORD_PROMPT, value);
	}
	
	@JsonIgnore
	public String getChunkExtractionPrompt() {
		return DataTypeUtils.asString(this.get(FIELD__CHUNK_EXTRACTION_PROMPT), null);
	}

	@JsonIgnore
	public void setChunkExtractionPrompt(String value) {
		this.set(FIELD__CHUNK_EXTRACTION_PROMPT, value);
	}
	
	@JsonIgnore
	public String getChunkExtractionSubPrompt() {
		return DataTypeUtils.asString(this.get(FIELD__CHUNK_EXTRACTION_SUB_PROMPT), null);
	}

	@JsonIgnore
	public void setChunkExtractionSubPrompt(String value) {
		this.set(FIELD__CHUNK_EXTRACTION_SUB_PROMPT, value);
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
	
	@JsonIgnore
	public String getLayoutRecognize() {
		return DataTypeUtils.asString(this.get(FIELD__LAYOUT_RECOGNIZE), null);
	}

	@JsonIgnore
	public void setLayoutRecognize(String value) {
		this.set(FIELD__LAYOUT_RECOGNIZE, value);
	}
	
	
	
	@JsonIgnore
	public Map<String, String> getTags() {
		return (Map<String, String>)this.get(FIELD__TAGS);
	}

	@JsonIgnore
	public void setTags(Map<String, String> value) {
		this.set(FIELD__TAGS, value);
	}
	
	
	@JsonProperty(FIELD__RAPTOR)
	public RaptorConfig getRaptorConfig() {
		RaptorConfig raptorConfig = (RaptorConfig)this.get(FIELD__RAPTOR);
		if(raptorConfig == null) {
			raptorConfig = new RaptorConfig();
			this.set(FIELD__RAPTOR, raptorConfig);
		}
		raptorConfig.setChatAgent(this.getChatAgent());
		raptorConfig.setEmbeddingAgent(this.getEmbeddingAgent());
		raptorConfig.setReRankAgent(this.getReRankAgent());
		return raptorConfig;
	}
	
	@JsonProperty(FIELD__RAPTOR)
	public void setRaptorConfig(RaptorConfig raptorConfig) {
		this.set(FIELD__RAPTOR, raptorConfig);
	}
	
	@JsonProperty(FIELD__PAGEINDEX)
	public PageIndexConfig getPageIndexConfig() {
		PageIndexConfig pageIndexConfig = (PageIndexConfig)this.get(FIELD__PAGEINDEX);
		if(pageIndexConfig == null) {
			pageIndexConfig = new PageIndexConfig();
			this.set(FIELD__PAGEINDEX, pageIndexConfig);
		}
		pageIndexConfig.setChatAgent(this.getChatAgent());
		pageIndexConfig.setEmbeddingAgent(this.getEmbeddingAgent());
		pageIndexConfig.setReRankAgent(this.getReRankAgent());
		return pageIndexConfig;
	}
	
	@JsonProperty(FIELD__PAGEINDEX)
	public void setPageIndexConfig(PageIndexConfig pageIndexConfig) {
		this.set(FIELD__PAGEINDEX, pageIndexConfig);
	}
	
	@JsonProperty(FIELD__GRAPHRAG)
	public GraphRAGConfig getGraphRAGConfig() {
		GraphRAGConfig graphRAGConfig = (GraphRAGConfig)this.get(FIELD__GRAPHRAG);
		if(graphRAGConfig == null) {
			graphRAGConfig = new GraphRAGConfig();
			this.set(FIELD__GRAPHRAG, graphRAGConfig);
		}
		graphRAGConfig.setChatAgent(this.getChatAgent());
		graphRAGConfig.setEmbeddingAgent(this.getEmbeddingAgent());
		graphRAGConfig.setReRankAgent(this.getReRankAgent());
		return graphRAGConfig;
	}
	
	@JsonProperty(FIELD__GRAPHRAG)
	public void setGraphRAGConfig(GraphRAGConfig graphRAGConfig) {
		this.set(FIELD__GRAPHRAG, graphRAGConfig);
	}
	
	
	
}

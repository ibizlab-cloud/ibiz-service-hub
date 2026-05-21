package net.ibizsys.central.plugin.ai.util.domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;

public class GraphRAGConfig extends EntityBase {

	/**
	 * 最大收集此时，默认为2
	 */
	public final static String FIELD__MAX_GLEANINGS = "max_gleanings";
	
	/**
	 * 循环提示词
	 */
	public final static String FIELD__LOOP_PROMPT = "loop_prompt";
	
	/**
	 * 展开提示词
	 */
	public final static String FIELD__EXTRACTION_PROMPT = "extraction_prompt";
	
	/**
	 * 展开提示词
	 */
	public final static String FIELD__EXTRACTION_SUB_PROMPT = "extraction_sub_prompt";
	
	/**
	 * 实体类型集合
	 */
	public final static String FIELD__ENTITY_TYPES = "entity_types";
	
	/**
	 * 可选实体类型集合 
	 */
	public final static String FIELD__OPTIONAL_ENTITY_TYPES = "optional_entity_types";
	
	public final static String FIELD__TUPLE_DELIMITER_KEY = "tuple_delimiter_key";
	
	public final static String FIELD__RECORD_DELIMITER_KEY = "record_delimiter_key";
	
	public final static String FIELD__INPUT_TEXT_KEY = "input_text_key";
	
	public final static String FIELD__ENTITY_TYPES_KEY = "entity_types_key";
	
	public final static String FIELD__COMPLETION_DELIMITER_KEY = "completion_delimiter_key";
	
	public final static String FIELD__LANGUAGE = "language";
	
	public final static String FIELD__METHOD = "method";
	
	public final static String FIELD__USE_GRAPHRAG = "use_graphrag"; 
	
	
	/**
	 * 实体统一
	 */
	public final static String FIELD__RESOLUTION = "resolution"; 
	
	
	/**
	 * 实体消歧：	根据上下文，确定一个名称（往往有多重含义）具体指代哪个实体。解决“一名多义”问题。
	 */
	public final static String FIELD__DISAMBIGUATION = "disambiguation";
	
	
	public final static String FIELD__ENTITY_INDEX_DELIMITER_KEY = "entity_index_delimiter_key";
	
	public final static String FIELD__RESOLUTION_RESULT_DELIMITER_KEY = "resolution_result_delimiter_key";
	
	/**
	 * 全局实体
	 */
	public final static String FIELD__GLOBAL_ENTITY = "global_entity";
	
	/**
	 * 实体归一提示词
	 */
	public final static String FIELD__RESOLUTION_PROMPT = "resolution_prompt";
	
	
	public final static String FIELD__DISAMBIGUATION_PROMPT = "disambiguation_prompt";
	
	public final static String FIELD__DISAMBIGUATION_SUB_PROMPT = "disambiguation_sub_prompt";
	
	public final static String FIELD__RELATION_DISAMBIGUATION_PROMPT = "relation_disambiguation_prompt";
	
	public final static String FIELD__RELATION_DISAMBIGUATION_SUB_PROMPT = "relation_disambiguation_sub_prompt";
	
	public final static String FIELD__CHAT_AGENT = "chat_agent";
	
	public final static String FIELD__EMBEDDING_AGENT = "embedding_agent";
	
	public final static String FIELD__RERANK_AGENT = "rerank_agent";
	
	
	@JsonIgnore
	public int getMaxGleanings() {
		int value = DataTypeUtils.asInteger(this.get(FIELD__MAX_GLEANINGS), 1);
		if (value <= 0) {
			return 1;
		}

		if (value > 10) {
			return 10;
		}

		return value;
	}

	@JsonIgnore
	public void setMaxGleanings(int value) {
		this.set(FIELD__MAX_GLEANINGS, value);
	}

	@JsonIgnore
	public String getLoopPrompt() {
		return DataTypeUtils.asString(this.get(FIELD__LOOP_PROMPT), null);
	}

	@JsonIgnore
	public void setLoopPrompt(String value) {
		this.set(FIELD__LOOP_PROMPT, value);
	}
	
	@JsonIgnore
	public String getExtractionPrompt() {
		return DataTypeUtils.asString(this.get(FIELD__EXTRACTION_PROMPT), null);
	}

	@JsonIgnore
	public void setExtractionPrompt(String value) {
		this.set(FIELD__EXTRACTION_PROMPT, value);
	}
	
	@JsonIgnore
	public String getExtractionSubPrompt() {
		return DataTypeUtils.asString(this.get(FIELD__EXTRACTION_SUB_PROMPT), null);
	}

	@JsonIgnore
	public void setExtractionSubPrompt(String value) {
		this.set(FIELD__EXTRACTION_SUB_PROMPT, value);
	}
	
	
	
	
	@JsonIgnore
	public List<String> getEntityTypes() {
		Object value = this.get(FIELD__ENTITY_TYPES);
		if(ObjectUtils.isEmpty(value)) {
			return Collections.EMPTY_LIST;
		}
		
		if(value instanceof List) {
			return (List)value;
		}
		
		String str = String.valueOf(value);
		List<String> list = Arrays.asList(str.split("[,]"));
		this.set(FIELD__ENTITY_TYPES, list);
		return list;
	}

	@JsonIgnore
	public void setEntityTypes(Object value) {
		this.set(FIELD__ENTITY_TYPES, value);
	}
	
	
	@JsonIgnore
	public String getTupleDelimiterKey() {
		return DataTypeUtils.asString(this.get(FIELD__TUPLE_DELIMITER_KEY), "tuple_delimiter");
	}

	@JsonIgnore
	public void setTupleDelimiterKey(String value) {
		this.set(FIELD__TUPLE_DELIMITER_KEY, value);
	}
	
	@JsonIgnore
	public String getRecordDelimiterKey() {
		return DataTypeUtils.asString(this.get(FIELD__RECORD_DELIMITER_KEY), "record_delimiter");
	}

	@JsonIgnore
	public void setRecordDelimiterKey(String value) {
		this.set(FIELD__RECORD_DELIMITER_KEY, value);
	}
	
	
	@JsonIgnore
	public String getInputTextKey() {
		return DataTypeUtils.asString(this.get(FIELD__INPUT_TEXT_KEY), "input_text");
	}

	@JsonIgnore
	public void setInputTextKey(String value) {
		this.set(FIELD__INPUT_TEXT_KEY, value);
	}
	

	@JsonIgnore
	public String getEntityTypesKey() {
		return DataTypeUtils.asString(this.get(FIELD__ENTITY_TYPES_KEY), "entity_types");
	}

	@JsonIgnore
	public void setEntityTypesKey(String value) {
		this.set(FIELD__ENTITY_TYPES_KEY, value);
	}
	
	@JsonIgnore
	public String getCompletionDelimiterKey() {
		return DataTypeUtils.asString(this.get(FIELD__COMPLETION_DELIMITER_KEY), "completion_delimiter");
	}

	@JsonIgnore
	public void setCompletionDelimiterKey(String value) {
		this.set(FIELD__COMPLETION_DELIMITER_KEY, value);
	}
	
	@JsonIgnore
	public String getLanguage() {
		return DataTypeUtils.asString(this.get(FIELD__LANGUAGE), "Chinese（简体中文）");
	}

	@JsonIgnore
	public void setLanguage(String value) {
		this.set(FIELD__LANGUAGE, value);
	}
	
	@JsonIgnore
	public String getMethod() {
		return DataTypeUtils.asString(this.get(FIELD__METHOD), "general");
	}

	@JsonIgnore
	public void setMethod(String value) {
		this.set(FIELD__METHOD, value);
	}
	
	
	@JsonIgnore
	public boolean isUseGraphRAG() {
		return DataTypeUtils.asBoolean(this.get(FIELD__USE_GRAPHRAG), false);
	}

	@JsonIgnore
	public void setUseGraphRAG(boolean value) {
		this.set(FIELD__USE_GRAPHRAG, value);
	}
	
	@JsonIgnore
	public Object getResolution() {
		return this.get(FIELD__RESOLUTION);
	}

	@JsonIgnore
	public void setResolution(Object value) {
		this.set(FIELD__RESOLUTION, value);
	}
	
	
	@JsonIgnore
	public Object getDisambiguation() {
		return this.get(FIELD__DISAMBIGUATION);
	}

	@JsonIgnore
	public void setDisambiguation(Object value) {
		this.set(FIELD__DISAMBIGUATION, value);
	}
	
	@JsonIgnore
	public Object getGlobalEntity() {
		return this.get(FIELD__DISAMBIGUATION);
	}

	@JsonIgnore
	public void setGlobalEntity(Object value) {
		this.set(FIELD__DISAMBIGUATION, value);
	}
	
	
	@JsonIgnore
	public String getEntityIndexDelimiterKey() {
		return DataTypeUtils.asString(this.get(FIELD__ENTITY_INDEX_DELIMITER_KEY), "entity_index_delimiter");
	}

	@JsonIgnore
	public void setEntityIndexDelimiterKey(String value) {
		this.set(FIELD__ENTITY_INDEX_DELIMITER_KEY, value);
	}
	
	@JsonIgnore
	public String getResolutionResultDelimiterKey() {
		return DataTypeUtils.asString(this.get(FIELD__RESOLUTION_RESULT_DELIMITER_KEY), "resolution_result_delimiter");
	}

	@JsonIgnore
	public void setResolutionResultDelimiterKey(String value) {
		this.set(FIELD__RESOLUTION_RESULT_DELIMITER_KEY, value);
	}
	
	@JsonIgnore
	public String getResolutionPrompt() {
		return DataTypeUtils.asString(this.get(FIELD__RESOLUTION_PROMPT), null);
	}

	@JsonIgnore
	public void setResolutionPrompt(String value) {
		this.set(FIELD__RESOLUTION_PROMPT, value);
	}
	
	@JsonIgnore
	public String getDisambiguationPrompt() {
		return DataTypeUtils.asString(this.get(FIELD__DISAMBIGUATION_PROMPT), null);
	}

	@JsonIgnore
	public void setDisambiguationPrompt(String value) {
		this.set(FIELD__DISAMBIGUATION_PROMPT, value);
	}
	
	@JsonIgnore
	public String getDisambiguationSubPrompt() {
		return DataTypeUtils.asString(this.get(FIELD__DISAMBIGUATION_SUB_PROMPT), null);
	}

	@JsonIgnore
	public void setDisambiguationSubPrompt(String value) {
		this.set(FIELD__DISAMBIGUATION_SUB_PROMPT, value);
	}
	
	@JsonIgnore
	public String getRelationDisambiguationPrompt() {
		return DataTypeUtils.asString(this.get(FIELD__RELATION_DISAMBIGUATION_PROMPT), null);
	}

	@JsonIgnore
	public void setRelationDisambiguationPrompt(String value) {
		this.set(FIELD__RELATION_DISAMBIGUATION_PROMPT, value);
	}
	
	@JsonIgnore
	public String getRelationDisambiguationSubPrompt() {
		return DataTypeUtils.asString(this.get(FIELD__RELATION_DISAMBIGUATION_SUB_PROMPT), null);
	}

	@JsonIgnore
	public void setRelationDisambiguationSubPrompt(String value) {
		this.set(FIELD__RELATION_DISAMBIGUATION_SUB_PROMPT, value);
	}
	
	
	
	@JsonIgnore
	public Map<String, String> getOptionalEntityTypes() {
		return (Map<String, String>)this.get(FIELD__OPTIONAL_ENTITY_TYPES);
	}

	@JsonIgnore
	public void setOptionalEntityTypes(Map<String, String> value) {
		this.set(FIELD__OPTIONAL_ENTITY_TYPES, value);
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

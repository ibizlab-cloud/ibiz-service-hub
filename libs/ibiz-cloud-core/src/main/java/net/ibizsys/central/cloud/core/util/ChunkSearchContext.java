package net.ibizsys.central.cloud.core.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.SimpleSearchContextDTO;
import net.ibizsys.runtime.util.DataTypeUtils;

@SuppressWarnings("serial")
@JsonInclude(Include.NON_NULL)
public class ChunkSearchContext extends SimpleSearchContextDTO implements IChunkSearchContext{

	public final static String FIELD_GRAPHRAG = "n_graphrag_eq";
	
	public final static String FIELD_RAPTOR = "n_raptor_eq";
	
	public final static String FIELD_SIMILARITYTHRESHOLD = "n_similarity_gtandeq";
	
	public final static String FIELD_VECTORSIMILARITYWEIGHT = "n_vector_similarity_gtandeq";
	
	public final static String FIELD_RERANK = "n_rerank_eq";
	
	public final static String FIELD_KBGUIDANCE = "n_kbguidance_eq";
	
	public final static String FIELD_PAGEINDEX = "n_pageindex_eq";
	
	public final static String FIELD_DOCIDS = "n_docid_in";
	
	public final static String FIELD_DOCNAMES = "n_docname_in";
	
	public final static String FIELD_KBIDS = "n_kbid_in";
	
	public final static String FIELD_DOCCATEGORIES = "n_doccategories_in";
	
	public final static String FIELD_LANGUAGES = "n_language_in";
	
	public final static String FIELD_DOCTOPK = "n_doctopk_eq";
	
	public final static String FIELD_TYPES = "n_type_in";
	
	public final static String FIELD_ROOT = "n_pid_testnull";
	
	public ChunkSearchContext() {
		super();
	}

	public ChunkSearchContext(Map map) throws Exception {
		super(map);
	}

	public ChunkSearchContext(ISearchContextDTO iSearchContext) throws Exception {
		super(iSearchContext.any());
		this.setPageable(iSearchContext.getPageable());
		this.setPageSort(iSearchContext.getPageSort());
	}
	
	@Override
	@JsonIgnore
	public Float getSimilarityThreshold() {
		Object value = this.get(FIELD_SIMILARITYTHRESHOLD);
		return DataTypeUtils.asFloat(value, new Float(0.4));
	}

	@JsonIgnore
	public void setSimilarityThreshold(Float value) {
		this.set(FIELD_SIMILARITYTHRESHOLD, value);
	}
	
	@Override
	@JsonIgnore
	public Float getVectorSimilarityWeight() {
		Object value = this.get(FIELD_VECTORSIMILARITYWEIGHT);
//		if(value == null){
//			value = this.get("n_vectorsimilarity_gtandeq");
//		}
		return DataTypeUtils.asFloat(value, new Float(0.3));
	}
	
	
	
	@JsonIgnore
	public void setVectorSimilarityWeight(Float value) {
		this.set(FIELD_VECTORSIMILARITYWEIGHT, value);
	}

	
	@Override
	@JsonIgnore
	public Integer getTextReRank() {
		Object value = this.get(FIELD_RERANK);
		return DataTypeUtils.asInteger(value, 0);
	}
	
	@JsonIgnore
	public void setTextReRank(Integer value) {
		this.set(FIELD_RERANK, value);
	}
	
	
	@Override
	@JsonIgnore
	public Integer getDocTopK() {
		Object value = this.get(FIELD_DOCTOPK);
		return DataTypeUtils.asInteger(value, null);
	}
	
	@JsonIgnore
	public void setDocTopK(Integer value) {
		this.set(FIELD_DOCTOPK, value);
	}
	
	
	@Override
	@JsonIgnore
	public Integer getPageIndex() {
		Object value = this.get(FIELD_PAGEINDEX);
		return DataTypeUtils.asInteger(value, null);
	}
	
	@JsonIgnore
	public void setPageIndex(Integer value) {
		this.set(FIELD_PAGEINDEX, value);
	}
	
	@Override
	@JsonIgnore
	public Integer getGraphRAG() {
		Object value = this.get(FIELD_GRAPHRAG);
		return DataTypeUtils.asInteger(value, null);
	}
	
	@JsonIgnore
	public void setGraphRAG(Integer value) {
		this.set(FIELD_GRAPHRAG, value);
	}
	
	
	@Override
	@JsonIgnore
	public Integer getRaptor() {
		Object value = this.get(FIELD_RAPTOR);
		//默认启用Raptor
		return DataTypeUtils.asInteger(value, RAPTOR_ENABLED);
	}
	
	@JsonIgnore
	public void setRaptor(Integer value) {
		this.set(FIELD_RAPTOR, value);
	}
	
	
	@Override
	@JsonIgnore
	public Integer getKBGuidance() {
		Object value = this.get(FIELD_KBGUIDANCE);
		return DataTypeUtils.asInteger(value, null);
	}
	
	@JsonIgnore
	public void setKBGuidance(Integer value) {
		this.set(FIELD_KBGUIDANCE, value);
	}
	
	/**
	 * 设置「指导信息」
	 *
	 * @param val
	 */
	@JsonIgnore
	public void setInstruct(String val) {
		this.set(PARAM_INSTRUCT, val);
	}

	/**
	 * 获取「指导信息」值
	 *
	 */
	@JsonIgnore
	public String getInstruct() {
		return (String) this.get(PARAM_INSTRUCT);
	}

	@Override
	@JsonIgnore
	public List<String> getQueries() {
		Object value = this.get(PARAM_QUERIES);
		if(value instanceof List) {
			return (List)value;
		}
		
		String strQuery = this.getQuery();
		if(ObjectUtils.isEmpty(strQuery)) {
			return Collections.EMPTY_LIST;
		}
		
		return Arrays.asList(strQuery);
	}
	
	@JsonIgnore
	public void setQueries(List<String> value) {
		this.set(PARAM_QUERIES, value);
	}

	@Override
	@JsonIgnore
	public List<String> getDocIds() {
		Object value = this.get(FIELD_DOCIDS);
		if(ObjectUtils.isEmpty(value)) {
			return Collections.EMPTY_LIST;
		}
		if(value instanceof List) {
			return (List)value;
		}
		List<String> list = Arrays.asList(String.valueOf(value).split("[,]"));
		this.set(FIELD_DOCIDS, list);
		return list;
	}
	
	@JsonIgnore
	public void setDocIds(List<String> value) {
		if(ObjectUtils.isEmpty(value)) {
			this.reset(FIELD_DOCIDS);
		}
		else {
			this.set(FIELD_DOCIDS, value);
		}
	}
	
	@Override
	@JsonIgnore
	public List<String> getKBIds() {
		Object value = this.get(FIELD_KBIDS);
		if(ObjectUtils.isEmpty(value)) {
			return Collections.EMPTY_LIST;
		}
		if(value instanceof List) {
			return (List)value;
		}
		List<String> list = Arrays.asList(String.valueOf(value).split("[,]"));
		this.set(FIELD_KBIDS, list);
		return list;
	}
	
	@JsonIgnore
	public void setKBIds(List<String> value) {
		if(ObjectUtils.isEmpty(value)) {
			this.reset(FIELD_KBIDS);
		}
		else {
			this.set(FIELD_KBIDS, value);
		}
	}
	

	@Override
	@JsonIgnore
	public List<String> getDocCategories() {
		Object value = this.get(FIELD_DOCCATEGORIES);
		if(ObjectUtils.isEmpty(value)) {
			return Collections.EMPTY_LIST;
		}
		if(value instanceof List) {
			return (List)value;
		}
		List<String> list = Arrays.asList(String.valueOf(value).split("[,]"));
		this.set(FIELD_DOCCATEGORIES, list);
		return list;
	}
	
	@JsonIgnore
	public void setDocCategories(List<String> value) {
		if(ObjectUtils.isEmpty(value)) {
			this.reset(FIELD_DOCCATEGORIES);
		}
		else {
			this.set(FIELD_DOCCATEGORIES, value);
		}
	}

	@Override
	@JsonIgnore
	public List<String> getLanguages() {
		Object value = this.get(FIELD_LANGUAGES);
		if(ObjectUtils.isEmpty(value)) {
			return Collections.EMPTY_LIST;
		}
		if(value instanceof List) {
			return (List)value;
		}
		List<String> list = Arrays.asList(String.valueOf(value).split("[,]"));
		this.set(FIELD_LANGUAGES, list);
		return list;
	}
	
	@JsonIgnore
	public void setLanguages(List<String> value) {
		if(ObjectUtils.isEmpty(value)) {
			this.reset(FIELD_LANGUAGES);
		}
		else {
			this.set(FIELD_LANGUAGES, value);
		}
	}
	
	
	@Override
	@JsonIgnore
	public List<String> getTypes() {
		Object value = this.get(FIELD_TYPES);
		if(ObjectUtils.isEmpty(value)) {
			return Collections.EMPTY_LIST;
		}
		if(value instanceof List) {
			return (List)value;
		}
		List<String> list = Arrays.asList(String.valueOf(value).split("[,]"));
		this.set(FIELD_TYPES, list);
		return list;
	}
	
	@JsonIgnore
	public void setTypes(List<String> value) {
		if(ObjectUtils.isEmpty(value)) {
			this.reset(FIELD_TYPES);
		}
		else {
			this.set(FIELD_TYPES, value);
		}
	}
	
	
	
	@Override
	@JsonIgnore
	public Integer getRoot() {
		Object value = this.get(FIELD_ROOT);
		//不能给默认值，有意义的
		return DataTypeUtils.asInteger(value, null);
	}
	
	@JsonIgnore
	public void setRoot(Integer value) {
		this.set(FIELD_ROOT, value);
	}
	
	
	@Override
	@JsonIgnore
	public List<String> getDocNames() {
		Object value = this.get(FIELD_DOCNAMES);
		if(ObjectUtils.isEmpty(value)) {
			return Collections.EMPTY_LIST;
		}
		if(value instanceof List) {
			return (List)value;
		}
		List<String> list = Arrays.asList(String.valueOf(value).split("[,]"));
		this.set(FIELD_DOCNAMES, list);
		return list;
	}
	
	@JsonIgnore
	public void setDocNames(List<String> value) {
		if(ObjectUtils.isEmpty(value)) {
			this.reset(FIELD_DOCNAMES);
		}
		else {
			this.set(FIELD_DOCNAMES, value);
		}
	}
	
	
	/**
	 * 设置「片段反查链接」
	 *
	 * @param val
	 */
	@JsonIgnore
	public void setChunkViewUrl(String val) {
		this.set(PARAM_CHUNKVIEWURL, val);
	}

	/**
	 * 获取「片段反查链接」值
	 *
	 */
	@JsonIgnore
	public String getChunkViewUrl() {
		return (String)this.get(PARAM_CHUNKVIEWURL);
	}


	/**
	 * 设置「片段编号前缀」
	 *
	 * @param val
	 */
	@JsonIgnore
	public void setChunkSNPrefix(String val) {
		this.set(PARAM_CHUNKSNPREFIX, val);
	}

	/**
	 * 获取「片段反差链接」值
	 *
	 */
	@JsonIgnore
	public String getChunkSNPrefix() {
		return (String) this.get(PARAM_CHUNKSNPREFIX);
	}
	
	
}

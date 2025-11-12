package net.ibizsys.central.cloud.core.util;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import net.ibizsys.central.util.SimpleSearchContextDTO;
import net.ibizsys.runtime.util.DataTypeUtils;

@SuppressWarnings("serial")
@JsonInclude(Include.NON_NULL)
public class ChunkSearchContext extends SimpleSearchContextDTO implements IChunkSearchContext{

	public ChunkSearchContext() {
		super();
	}

	public ChunkSearchContext(Map map) throws Exception {
		super(map);
	}

	@Override
	@JsonIgnore
	public Float getSimilarityThreshold() {
		Object value = this.get("n_similarity_gtandeq");
		return DataTypeUtils.asFloat(value, new Float(0.4));
	}

	@Override
	@JsonIgnore
	public Float getVectorSimilarityWeight() {
		Object value = this.get("n_vector_similarity_gtandeq");
//		if(value == null){
//			value = this.get("n_vectorsimilarity_gtandeq");
//		}
		return DataTypeUtils.asFloat(value, new Float(0.3));
	}
	
	@JsonIgnore
	public void setSimilarityThreshold(Float value) {
		this.set("n_similarity_gtandeq", value);
	}
	
	@JsonIgnore
	public void setVectorSimilarityWeight(Float value) {
		this.set("n_vector_similarity_gtandeq", value);
	}

}

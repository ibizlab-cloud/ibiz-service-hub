package net.ibizsys.runtime.util;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true) 
@JsonInclude(Include.NON_NULL)
public class SearchPredefinedCond implements ISearchPredefinedCond,ISearchCondRuntime {

	@JsonIgnore
	private String strPredefinedCond = null;
	
	@JsonIgnore
	private String strPredefinedType = null;

	@JsonIgnore
	private String strTag = null;
	
	@JsonIgnore
	private String strCat = null;
	
	@Override
	@JsonProperty("condtype")
	public String getCondType() {
		return CONDTYPE_PREDEFINED;
	}

	@Override
	@JsonProperty("predefinedcode")
	public String getPredefinedCond() {
		return this.strPredefinedCond;
	}
	
	@JsonProperty("predefinedcode")
	public void setPredefinedCond(String strPredefinedCond) {
		this.strPredefinedCond = strPredefinedCond;
	}

	@Override
	@JsonProperty("predefinedtype")
	public String getPredefinedType() {
		return this.strPredefinedType;
	}
	
	@JsonProperty("predefinedtype")
	public void setPredefinedType(String strPredefinedType) {
		this.strPredefinedType = strPredefinedType;
	}
	
	@Override
	@JsonProperty("cat")
	public String getCat() {
		return this.strCat;
	}
	
	@JsonProperty("cat")
	public void setCat(String strCat) {
		this.strCat = strCat;
	}
	
	@Override
	@JsonProperty("tag")
	public String getTag() {
		return this.strTag;
	}
	
	@JsonProperty("tag")
	public void setTag(String strTag) {
		this.strTag = strTag;
	}
	
	
	@Override
	public String toString() {
		return JsonUtils.toString(this);
	}
}



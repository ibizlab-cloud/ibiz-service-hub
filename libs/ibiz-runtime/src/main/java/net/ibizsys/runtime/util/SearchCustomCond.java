package net.ibizsys.runtime.util;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true) 
@JsonInclude(Include.NON_NULL)
public class SearchCustomCond implements ISearchCustomCond,ISearchCondRuntime{

	@JsonIgnore
	private String strCustomCond = null;
	
	@JsonIgnore
	private String strCustomType = null;
	
	
	@JsonIgnore
	private String strTag = null;
	
	@JsonIgnore
	private String strCat = null;
	
	@Override
	@JsonProperty("condtype")
	public String getCondType() {
		return CONDTYPE_CUSTOM;
	}

	@Override
	@JsonProperty("customcond")
	public String getCustomCond() {
		return this.strCustomCond;
	}
	
	@JsonProperty("customcond")
	public void setCustomCond(String strCustomCond) {
		this.strCustomCond = strCustomCond;
	}
	
	@Override
	@JsonProperty("customtype")
	public String getCustomType() {
		return this.strCustomType;
	}
	
	@JsonProperty("customtype")
	public void setCustomType(String strCustomType) {
		this.strCustomType = strCustomType;
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
	@JsonProperty("cat")
	public String getCat() {
		return this.strCat;
	}
	
	@JsonProperty("cat")
	public void setCat(String strCat) {
		this.strCat = strCat;
	}
	
	@Override
	public String toString() {
		return JsonUtils.toString(this);
	}
	
	public static SearchCustomCond of(String strCond) {
		return of(strCond, null, null);
	}
	
	public static SearchCustomCond of(String strCond, String strType) {
		return of(strCond, strType, null);
	}
	
	public static SearchCustomCond of(String strCond, String strType, String strTag) {
		SearchCustomCond searchCustomCond = new SearchCustomCond();
		searchCustomCond.setCustomCond(strCond);
		searchCustomCond.setCustomType(strType);
		searchCustomCond.setTag(strTag);
		return searchCustomCond;
	}
}

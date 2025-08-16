package net.ibizsys.psmodel.core.util;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true) 
@JsonInclude(Include.NON_NULL)
public class SearchCustomCond implements ISearchCustomCond {

	@JsonIgnore
	private String strCustomCond = null;
	
	@JsonIgnore
	private String strTag = null;
	
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
}

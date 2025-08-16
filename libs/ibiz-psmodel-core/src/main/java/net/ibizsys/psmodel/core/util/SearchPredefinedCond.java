package net.ibizsys.psmodel.core.util;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true) 
@JsonInclude(Include.NON_NULL)
public class SearchPredefinedCond implements ISearchPredefinedCond {

	@JsonIgnore
	private String strPredefinedCond = null;
	
	@JsonIgnore
	private String strPredefinedType = null;
	
	
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
	

}



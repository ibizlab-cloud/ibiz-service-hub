package net.ibizsys.psmodel.core.util;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true) 
@JsonInclude(Include.NON_NULL)
public class SearchGroupCond implements ISearchGroupCond{

	
	@JsonIgnore
	private String strCondOp = null;
	
	@JsonIgnore
	private List<ISearchCond> searchCondList = null;
	
	@JsonIgnore
	private boolean bNotMode = false;
	
	

	
	
	@Override
	@JsonProperty("condtype")
	public String getCondType() {
		return CONDTYPE_GROUP;
	}

	@Override
	@JsonProperty("condop")
	public String getCondOp() {
		return this.strCondOp;
	}
	
	@JsonProperty("condop")
	public void setCondOp(String strCondOp) {
		this.strCondOp = strCondOp;
	}

	@Override
	@JsonProperty("searchconds")
	public List<ISearchCond> getSearchConds() {
		return this.searchCondList;
	}
	
	
	@JsonProperty("searchconds")
	public void setSearchConds(List<ISearchCond> list) {
		this.searchCondList = list;
	}
	
	@Override
	@JsonIgnore
	public List<ISearchCond> getSearchCondsIf() {
		if(this.searchCondList == null) {
			this.searchCondList = new ArrayList<ISearchCond>();
		}
		return this.searchCondList;
	}

	@Override
	@JsonProperty("notmode")
	public boolean isNotMode() {
		return this.bNotMode;
	}
	
	@JsonProperty("notmode")
	public void setNotMode(boolean bNotMode) {
		this.bNotMode = bNotMode;
	}

}

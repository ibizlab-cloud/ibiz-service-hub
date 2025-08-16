package net.ibizsys.runtime.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true) 
@JsonInclude(Include.NON_NULL)
public class SearchGroupCond implements ISearchGroupCond,ISearchCondRuntime{

	
	@JsonIgnore
	private String strCondOp = null;
	
	@JsonIgnore
	private List<ISearchCond> searchCondList = null;
	
	@JsonIgnore
	private boolean bNotMode = false;
	
	
	@JsonIgnore
	private String strCat = null;
	
	@JsonIgnore
	private String strTag = null;
	
	
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
		if(StringUtils.hasLength(this.strCondOp)) {
			this.strCondOp = this.strCondOp.toUpperCase();
		}
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

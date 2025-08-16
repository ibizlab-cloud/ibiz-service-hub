package net.ibizsys.central.bi.util;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BISearchDimension implements IBISearchDimension {

	transient String strName = null;
	transient String strHierarchy = null;
	transient List<String> levelList = null;
	transient Map<String, Object> param = null;
	transient IBISearchPeriod iBISearchPeriod = null;
	
	@Override
	@JsonProperty("name")
	public String getName() {
		return this.strName;
	}
	
	@JsonProperty("name")
	public void setName(String strName) {
		this.strName = strName;
	}

	@Override
	@JsonProperty("hierarchy")
	public String getHierarchy() {
		return this.strHierarchy;
	}
	
	@JsonProperty("hierarchy")
	public void setHierarchy(String strHierarchy) {
		this.strHierarchy = strHierarchy;
	}

	@Override
	@JsonProperty("levels")
	public List<String> getLevels() {
		return this.levelList;
	}
	
	@JsonProperty("levels")
	public void setLevels(List<String> levelList) {
		this.levelList = levelList;
	}

	@Override
	@JsonProperty("param")
	public Map<String, Object> getParam() {
		return this.param;
	}
	
	@JsonProperty("param")
	public void setParam(Map<String, Object> param) {
		this.param = param;
	}

	@Override
	@JsonProperty("period")
	public IBISearchPeriod getPeriod() {
		return this.iBISearchPeriod;
	}
	
	@JsonProperty("period")
	public void setPeriod(IBISearchPeriod iBISearchPeriod) {
		this.iBISearchPeriod = iBISearchPeriod;
	}

}

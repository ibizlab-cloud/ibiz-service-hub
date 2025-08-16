package net.ibizsys.central.bi.util;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BISearchMeasure implements IBISearchMeasure {

	transient String strName = null;
	transient String strAggMode = null;
	transient Map<String, Object> param = null;
	transient boolean bHidden = false;
	
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
	@JsonProperty("aggmode")
	public String getAggMode() {
		return this.strAggMode;
	}
	
	@JsonProperty("aggmode")
	public void setAggMode(String strAggMode) {
		this.strAggMode = strAggMode;
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
	@JsonProperty("hidden")
	public boolean isHidden() {
		return this.bHidden;
	}
	
	@JsonProperty("hidden")
	public void setHidden(boolean bHidden) {
		this.bHidden = bHidden;
	}
}

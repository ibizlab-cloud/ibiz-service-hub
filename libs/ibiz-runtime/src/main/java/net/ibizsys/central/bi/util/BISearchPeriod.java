package net.ibizsys.central.bi.util;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BISearchPeriod implements IBISearchPeriod {

	transient String strField = null;
	transient String strUnit = UNIT_DAY;
	transient String strType = TYPE_STATIC;
	transient long nStart = 0l;
	transient long nEnd = 0l;
	transient int nPoP = 1;
	transient int nYoY = 0;
	
	@Override
	@JsonProperty("field")
	public String getField() {
		return this.strField;
	}
	
	@JsonProperty("field")
	public void setField(String strField){
		this.strField = strField;
	}

	@Override
	@JsonProperty("unit")
	public String getUnit() {
		return this.strUnit;
	}
	
	@JsonProperty("unit")
	public void setUnit(String strUnit) {
		this.strUnit = strUnit;
	}

	@Override
	@JsonProperty("type")
	public String getType() {
		return this.strType;
	}
	
	@JsonProperty("type")
	public void setType(String strType) {
		this.strType = strType;
	}

	@Override
	@JsonProperty("start")
	public long getStart() {
		return this.nStart;
	}
	
	@JsonProperty("start")
	public void setStart(long nStart) {
		this.nStart = nStart;
	}

	@Override
	@JsonProperty("end")
	public long getEnd() {
		return this.nEnd;
	}

	@JsonProperty("end")
	public void setEnd(long nEnd) {
		this.nEnd = nEnd;
	}
	
	
	@Override
	@JsonProperty("pop")
	public int getPoP() {
		return this.nPoP;
	}

	@JsonProperty("pop")
	public void setPoP(int nPoP) {
		this.nPoP = nPoP;
	}
	
	
	@Override
	@JsonProperty("yoy")
	public int getYoY() {
		return this.nYoY;
	}

	@JsonProperty("yoy")
	public void setYoY(int nYoY) {
		this.nYoY = nYoY;
	}
	
}

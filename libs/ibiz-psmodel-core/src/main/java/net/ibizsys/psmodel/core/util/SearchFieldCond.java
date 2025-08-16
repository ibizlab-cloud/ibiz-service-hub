package net.ibizsys.psmodel.core.util;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true) 
@JsonInclude(Include.NON_NULL)
public class SearchFieldCond implements ISearchFieldCond{

	@JsonIgnore
	private String strName = null;
	
	@JsonIgnore
	private String strFieldName = null;
	
	@JsonIgnore
	private String strCondOp = null;
	
	@JsonIgnore
	private Object objValue = null;
	
	@JsonIgnore
	private boolean bParamMode = false;
	
	@JsonIgnore
	private int nDataType = DataTypes.UNKNOWN;
	
	@JsonIgnore
	private String strValueFunc = null;
	
	@JsonIgnore
	private String strOption = null;
	
	
	@Override
	@JsonProperty("condtype")
	public String getCondType() {
		return ISearchFieldCond.CONDTYPE_DEFIELD;
	}

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
	@JsonProperty("fieldname")
	public String getFieldName() {
		return this.strFieldName;
	}
	
	@JsonProperty("fieldname")
	public void setFieldName(String strFieldName) {
		this.strFieldName = strFieldName;
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
	@JsonProperty("value")
	public Object getValue() {
		return this.objValue;
	}

	@JsonProperty("value")
	public void setValue(Object objValue) {
		this.objValue = objValue;
	}

	@Override
	@JsonProperty("parammode")
	public boolean isParamMode() {
		return this.bParamMode;
	}
	
	@JsonProperty("parammode")
	public void setParamMode(boolean bParamMode) {
		this.bParamMode = bParamMode;
	}

	@Override
	@JsonProperty("datatype")
	public int getDataType() {
		return this.nDataType;
	}
	
	@JsonProperty("datatype")
	public void setDataType(int nDataType) {
		this.nDataType = nDataType;
	}

	@Override
	@JsonProperty("valuefunc")
	public String getValueFunc() {
		return this.strValueFunc;
	}
	
	@JsonProperty("valuefunc")
	public void setValueFunc(String strValueFunc) {
		this.strValueFunc = strValueFunc;
	}
	
	@Override
	@JsonProperty("option")
	public String getOption() {
		return this.strOption;
	}
	
	@JsonProperty("option")
	public void setOption(String strOption) {
		this.strOption = strOption;
	}
	
}

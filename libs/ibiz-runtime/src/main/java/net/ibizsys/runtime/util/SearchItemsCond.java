package net.ibizsys.runtime.util;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true) 
@JsonInclude(Include.NON_NULL)
public class SearchItemsCond implements ISearchItemsCond,ISearchCondRuntime{

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
	
//	@JsonIgnore
//	private int nDataType = DataTypes.UNKNOWN;
	
	@JsonIgnore
	private String strValueFunc = null;
	
	@JsonIgnore
	private int nOption = 0;
	
	@JsonIgnore
	private String strCat = null;
	
//	@JsonIgnore
//	private String strItemType = null;
	
	
	@JsonIgnore
	private List<ISearchCond> searchCondList = null;
	
	
	@JsonIgnore
	private String strTag = null;
	
	
	@Override
	@JsonProperty("condtype")
	public String getCondType() {
		return ISearchFieldCond.CONDTYPE_ITEMS;
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

//	@Override
//	@JsonProperty("datatype")
//	public int getDataType() {
//		return this.nDataType;
//	}
//	
//	@JsonProperty("datatype")
//	public void setDataType(int nDataType) {
//		this.nDataType = nDataType;
//	}

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
	public int getOption() {
		return this.nOption;
	}
	
	@JsonProperty("option")
	public void setOption(int nOption) {
		this.nOption = nOption;
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
	
//	@Override
//	@JsonProperty("itemtype")
//	public String getItemType() {
//		return this.strItemType;
//	}
//	
//	@JsonProperty("itemtype")
//	public void setItemType(String strItemType) {
//		this.strItemType = strItemType;
//	}
	
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

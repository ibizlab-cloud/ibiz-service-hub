package net.ibizsys.model.control.form;



public class PSDESearchFormImpl extends net.ibizsys.model.control.form.PSDEFormImpl implements net.ibizsys.model.control.form.IPSDESearchForm{

	public final static String ATTR_GETSEARCHBUTTONPOS = "searchButtonPos";
	public final static String ATTR_GETSEARCHBUTTONSTYLE = "searchButtonStyle";
	public final static String ATTR_ISENABLEADVANCESEARCH = "enableAdvanceSearch";
	public final static String ATTR_ISENABLEAUTOSEARCH = "enableAutoSearch";
	public final static String ATTR_ISENABLEFILTERSAVE = "enableFilterSave";

	public java.lang.String getSearchButtonPos(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSEARCHBUTTONPOS);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSearchButtonStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSEARCHBUTTONSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isEnableAdvanceSearch(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEADVANCESEARCH);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableAutoSearch(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEAUTOSEARCH);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableFilterSave(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEFILTERSAVE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
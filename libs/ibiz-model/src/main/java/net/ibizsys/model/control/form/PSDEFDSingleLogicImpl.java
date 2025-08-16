package net.ibizsys.model.control.form;



public class PSDEFDSingleLogicImpl extends net.ibizsys.model.control.form.PSDEFDLogicImpl implements net.ibizsys.model.control.form.IPSDEFDSingleLogic{

	public final static String ATTR_GETCONDOP = "condOP";
	public final static String ATTR_GETDEFDNAME = "dEFDName";
	public final static String ATTR_GETVALUE = "value";

	public java.lang.String getCondOP(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONDOP);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDEFDName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFDNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
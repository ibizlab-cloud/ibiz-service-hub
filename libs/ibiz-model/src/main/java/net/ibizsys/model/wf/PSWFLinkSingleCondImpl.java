package net.ibizsys.model.wf;



public class PSWFLinkSingleCondImpl extends net.ibizsys.model.wf.PSWFLinkCondImpl implements net.ibizsys.model.wf.IPSWFLinkSingleCond{

	public final static String ATTR_GETCONDOP = "condOP";
	public final static String ATTR_GETFIELDNAME = "fieldName";
	public final static String ATTR_GETPARAMTYPE = "paramType";
	public final static String ATTR_GETPARAMVALUE = "paramValue";

	public java.lang.String getCondOP(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONDOP);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getFieldName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFIELDNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getParamType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAMTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getParamValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAMVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
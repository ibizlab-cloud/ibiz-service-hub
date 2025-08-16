package net.ibizsys.model.dataentity.defield.valuerule;



public class PSDEFVRSimpleConditionImpl extends net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRSingleConditionImpl implements net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRSimpleCondition{

	public final static String ATTR_GETCONDOP = "condOp";
	public final static String ATTR_GETPARAMTYPE = "paramType";
	public final static String ATTR_GETPARAMVALUE = "paramValue";

	public java.lang.String getCondOp(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONDOP);
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
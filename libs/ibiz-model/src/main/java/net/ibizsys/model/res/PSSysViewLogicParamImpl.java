package net.ibizsys.model.res;



public class PSSysViewLogicParamImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.res.IPSSysViewLogicParam{

	public final static String ATTR_GETPARAMVALUE = "paramValue";
	public final static String ATTR_GETPARAMVALUE2 = "paramValue2";

	public java.lang.String getParamValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAMVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getParamValue2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAMVALUE2);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
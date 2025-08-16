package net.ibizsys.model.dataentity.defield.valuerule;



public class PSDEFVRRegExConditionImpl extends net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRSingleConditionImpl implements net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRRegExCondition{

	public final static String ATTR_GETREGEXCODE = "regExCode";

	public java.lang.String getRegExCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREGEXCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
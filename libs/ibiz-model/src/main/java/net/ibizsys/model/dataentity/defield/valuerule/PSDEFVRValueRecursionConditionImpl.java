package net.ibizsys.model.dataentity.defield.valuerule;



public class PSDEFVRValueRecursionConditionImpl extends net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRSingleConditionImpl implements net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRValueRecursionCondition{

	public final static String ATTR_ISTRYMODE = "tryMode";

	@Deprecated
	public boolean isTryMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISTRYMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
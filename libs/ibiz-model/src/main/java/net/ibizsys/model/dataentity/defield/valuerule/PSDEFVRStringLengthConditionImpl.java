package net.ibizsys.model.dataentity.defield.valuerule;



public class PSDEFVRStringLengthConditionImpl extends net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRSingleConditionImpl implements net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRStringLengthCondition{

	public final static String ATTR_GETMAXVALUE = "maxValue";
	public final static String ATTR_GETMINVALUE = "minValue";
	public final static String ATTR_ISINCLUDEMAXVALUE = "includeMaxValue";
	public final static String ATTR_ISINCLUDEMINVALUE = "includeMinValue";

	public java.lang.Integer getMaxValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAXVALUE);
		if(value == null){
			return null;
		}
		return value.asInt();
	}

	public java.lang.Integer getMinValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINVALUE);
		if(value == null){
			return null;
		}
		return value.asInt();
	}

	public boolean isIncludeMaxValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISINCLUDEMAXVALUE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isIncludeMinValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISINCLUDEMINVALUE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
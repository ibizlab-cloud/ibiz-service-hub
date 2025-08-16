package net.ibizsys.model.dataentity.defield.valuerule;



public class PSDEFVRValueRange3ConditionImpl extends net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRSingleConditionImpl implements net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRValueRange3Condition{

	public final static String ATTR_GETSEPARATOR = "separator";
	public final static String ATTR_GETVALUERANGES = "valueRanges";

	public java.lang.String getSeparator(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSEPARATOR);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private java.lang.String[] valueranges = null;
	public java.lang.String[] getValueRanges(){
		if(this.valueranges == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUERANGES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.lang.String[] array = new java.lang.String[arrayNode.size()];
			for(int i = 0;i<arrayNode.size();i++) {
				array[i] = arrayNode.get(i).asText();
			}
			this.valueranges = array;
		}
		return this.valueranges;
	}
}
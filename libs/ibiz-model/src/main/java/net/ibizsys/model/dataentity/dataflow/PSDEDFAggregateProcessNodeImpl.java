package net.ibizsys.model.dataentity.dataflow;



public class PSDEDFAggregateProcessNodeImpl extends net.ibizsys.model.dataentity.dataflow.PSDEDataFlowProcessNodeImpl implements net.ibizsys.model.dataentity.dataflow.IPSDEDFAggregateProcessNode{

	public final static String ATTR_GETAGGREGATEFIELD = "aggregateField";
	public final static String ATTR_ISAGGREGATEFROMFIELD = "aggregateFromField";

	public java.lang.String getAggregateField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAGGREGATEFIELD);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isAggregateFromField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISAGGREGATEFROMFIELD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
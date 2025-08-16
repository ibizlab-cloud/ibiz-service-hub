package net.ibizsys.model.dataentity.ds;



public class PSDEDQCustomConditionImpl extends net.ibizsys.model.dataentity.ds.PSDEDQConditionImpl implements net.ibizsys.model.dataentity.ds.IPSDEDQCustomCondition{

	public final static String ATTR_GETCONDOP = "condOp";
	public final static String ATTR_GETCONDITION = "condition";
	public final static String ATTR_GETCUSTOMTYPE = "customType";

	@Deprecated
	public java.lang.String getCondOp(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONDOP);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCondition(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONDITION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCustomType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCUSTOMTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
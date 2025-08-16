package net.ibizsys.model.dataentity.ds;



public abstract class PSDEDQConditionImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.ds.IPSDEDQCondition{

	public final static String ATTR_GETCONDTAG = "condTag";
	public final static String ATTR_GETCONDTAG2 = "condTag2";
	public final static String ATTR_GETCONDTYPE = "condType";

	public java.lang.String getCondTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONDTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCondTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONDTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCondType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONDTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
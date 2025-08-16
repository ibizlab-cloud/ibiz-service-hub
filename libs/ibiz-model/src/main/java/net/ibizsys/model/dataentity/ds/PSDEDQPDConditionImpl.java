package net.ibizsys.model.dataentity.ds;



public class PSDEDQPDConditionImpl extends net.ibizsys.model.dataentity.ds.PSDEDQConditionImpl implements net.ibizsys.model.dataentity.ds.IPSDEDQPDCondition{

	public final static String ATTR_GETCONDOP = "condOp";

	@Deprecated
	public java.lang.String getCondOp(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONDOP);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
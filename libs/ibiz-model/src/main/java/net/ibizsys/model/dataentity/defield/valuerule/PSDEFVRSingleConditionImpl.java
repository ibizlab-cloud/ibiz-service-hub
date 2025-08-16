package net.ibizsys.model.dataentity.defield.valuerule;



public class PSDEFVRSingleConditionImpl extends net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRConditionImpl implements net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRSingleCondition{

	public final static String ATTR_GETCONDOP = "condOp";
	public final static String ATTR_GETDEFNAME = "dEFName";

	@Deprecated
	public java.lang.String getCondOp(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONDOP);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDEFName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
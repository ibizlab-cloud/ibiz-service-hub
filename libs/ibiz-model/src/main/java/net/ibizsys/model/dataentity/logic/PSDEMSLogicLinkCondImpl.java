package net.ibizsys.model.dataentity.logic;



public abstract class PSDEMSLogicLinkCondImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkCond{

	public final static String ATTR_GETLOGICTYPE = "logicType";

	public java.lang.String getLogicType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
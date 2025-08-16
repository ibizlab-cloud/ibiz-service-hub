package net.ibizsys.model.dataentity.logic;



public abstract class PSDEUILogicLinkCondImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.logic.IPSDEUILogicLinkCond
		,net.ibizsys.model.app.dataentity.IPSAppDEUILogicLinkCond{

	public final static String ATTR_GETLOGICTYPE = "logicType";

	public java.lang.String getLogicType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
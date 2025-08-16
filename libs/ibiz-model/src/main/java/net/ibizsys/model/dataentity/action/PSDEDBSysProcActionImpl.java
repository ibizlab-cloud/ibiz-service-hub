package net.ibizsys.model.dataentity.action;



public class PSDEDBSysProcActionImpl extends net.ibizsys.model.dataentity.action.PSDEActionImplBase{

	public final static String ATTR_GETACTIONMODE = "actionMode";

	@Deprecated
	public java.lang.String getActionMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
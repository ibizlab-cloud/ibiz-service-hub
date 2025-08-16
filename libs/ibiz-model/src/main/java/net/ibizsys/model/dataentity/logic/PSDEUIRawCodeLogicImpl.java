package net.ibizsys.model.dataentity.logic;



public class PSDEUIRawCodeLogicImpl extends net.ibizsys.model.dataentity.logic.PSDEUILogicNodeImpl implements net.ibizsys.model.dataentity.logic.IPSDEUIRawCodeLogic{

	public final static String ATTR_GETCODE = "code";

	public java.lang.String getCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
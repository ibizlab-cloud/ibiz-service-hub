package net.ibizsys.model.dataentity.action;



public class PSDEActionTemplImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.dataentity.action.IPSDEActionTempl{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETPREDEFINEDTEMPL = "predefinedTempl";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPredefinedTempl(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPREDEFINEDTEMPL);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
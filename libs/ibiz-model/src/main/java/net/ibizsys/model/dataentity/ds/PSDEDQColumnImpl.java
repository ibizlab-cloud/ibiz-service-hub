package net.ibizsys.model.dataentity.ds;



public class PSDEDQColumnImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.ds.IPSDEDQColumn{

	public final static String ATTR_GETALIAS = "alias";
	public final static String ATTR_GETNAME = "name";

	public java.lang.String getAlias(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALIAS);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
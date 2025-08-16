package net.ibizsys.model.dynamodel;



public class PSJsonObjectImpl extends net.ibizsys.model.dynamodel.PSJsonNodeImpl implements net.ibizsys.model.dynamodel.IPSJsonObject{

	public final static String ATTR_GETDESCRIPTION = "description";

	public java.lang.String getDescription(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDESCRIPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
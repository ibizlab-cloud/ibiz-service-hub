package net.ibizsys.model.service.openapi;



public abstract class PSOpenAPI3JsonSchemaImpl extends net.ibizsys.model.dynamodel.PSJsonNodeImpl implements net.ibizsys.model.service.openapi.IPSOpenAPI3JsonSchema{

	public final static String ATTR_GETTYPE = "type";

	public java.lang.String getType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
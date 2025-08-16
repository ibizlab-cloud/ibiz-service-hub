package net.ibizsys.model.service.openapi;



public class PSOpenAPI3PathImpl extends net.ibizsys.model.service.openapi.PSOpenAPI3ObjectImpl implements net.ibizsys.model.service.openapi.IPSOpenAPI3Path{

	public final static String ATTR_GETSUMMARY = "summary";

	public java.lang.String getSummary(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSUMMARY);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
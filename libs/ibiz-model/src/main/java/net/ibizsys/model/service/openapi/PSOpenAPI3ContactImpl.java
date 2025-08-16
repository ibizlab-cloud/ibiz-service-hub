package net.ibizsys.model.service.openapi;



public class PSOpenAPI3ContactImpl extends net.ibizsys.model.service.openapi.PSOpenAPI3ObjectImpl implements net.ibizsys.model.service.openapi.IPSOpenAPI3Contact{

	public final static String ATTR_GETEMAIL = "email";
	public final static String ATTR_GETURL = "url";

	public java.lang.String getEmail(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEMAIL);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUrl(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETURL);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
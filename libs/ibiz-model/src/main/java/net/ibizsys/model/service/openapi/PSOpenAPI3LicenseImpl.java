package net.ibizsys.model.service.openapi;



public class PSOpenAPI3LicenseImpl extends net.ibizsys.model.service.openapi.PSOpenAPI3ObjectImpl implements net.ibizsys.model.service.openapi.IPSOpenAPI3License{

	public final static String ATTR_GETURL = "url";

	public java.lang.String getUrl(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETURL);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
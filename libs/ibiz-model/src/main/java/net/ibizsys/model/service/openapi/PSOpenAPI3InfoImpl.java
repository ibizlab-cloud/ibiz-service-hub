package net.ibizsys.model.service.openapi;



public class PSOpenAPI3InfoImpl extends net.ibizsys.model.service.openapi.PSOpenAPI3ObjectImpl implements net.ibizsys.model.service.openapi.IPSOpenAPI3Info{

	public final static String ATTR_GETAPIVERSION = "aPIVersion";
	public final static String ATTR_GETTERMSOFSERVICE = "termsOfService";
	public final static String ATTR_GETTITLE = "title";

	public java.lang.String getAPIVersion(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAPIVERSION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTermsOfService(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTERMSOFSERVICE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTitle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTITLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
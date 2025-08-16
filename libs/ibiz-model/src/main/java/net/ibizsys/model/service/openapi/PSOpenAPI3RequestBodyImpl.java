package net.ibizsys.model.service.openapi;



public class PSOpenAPI3RequestBodyImpl extends net.ibizsys.model.service.openapi.PSOpenAPI3ObjectImpl implements net.ibizsys.model.service.openapi.IPSOpenAPI3RequestBody{

	public final static String ATTR_ISREQUIRED = "required";

	public boolean isRequired(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISREQUIRED);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
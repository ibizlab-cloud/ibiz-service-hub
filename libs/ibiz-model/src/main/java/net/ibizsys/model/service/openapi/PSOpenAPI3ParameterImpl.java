package net.ibizsys.model.service.openapi;



public class PSOpenAPI3ParameterImpl extends net.ibizsys.model.service.openapi.PSOpenAPI3ObjectImpl implements net.ibizsys.model.service.openapi.IPSOpenAPI3Parameter{

	public final static String ATTR_GETIN = "in";
	public final static String ATTR_ISREQUIRED = "required";

	public java.lang.String getIn(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETIN);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isRequired(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISREQUIRED);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
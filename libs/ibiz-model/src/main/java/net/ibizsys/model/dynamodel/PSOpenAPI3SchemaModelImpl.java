package net.ibizsys.model.dynamodel;



public class PSOpenAPI3SchemaModelImpl extends net.ibizsys.model.dynamodel.PSSysDynaModelImpl implements net.ibizsys.model.service.openapi.IPSOpenAPI3Schema{

	public final static String ATTR_GETDESCRIPTION = "description";

	@Deprecated
	public java.lang.String getDescription(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDESCRIPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
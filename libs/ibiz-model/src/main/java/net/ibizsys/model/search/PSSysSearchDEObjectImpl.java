package net.ibizsys.model.search;



public abstract class PSSysSearchDEObjectImpl extends net.ibizsys.model.search.PSSysSearchSchemeObjectImpl implements net.ibizsys.model.search.IPSSysSearchDEObject{

	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";

	@Deprecated
	public java.lang.String getDynaModelFilePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMODELFILEPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
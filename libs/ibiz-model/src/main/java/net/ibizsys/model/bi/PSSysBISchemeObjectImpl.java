package net.ibizsys.model.bi;



public abstract class PSSysBISchemeObjectImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.bi.IPSSysBISchemeObject{

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
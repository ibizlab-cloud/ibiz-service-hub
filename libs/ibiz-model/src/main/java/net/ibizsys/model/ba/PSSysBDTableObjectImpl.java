package net.ibizsys.model.ba;



public abstract class PSSysBDTableObjectImpl extends net.ibizsys.model.ba.PSSysBDSchemeObjectImpl implements net.ibizsys.model.ba.IPSSysBDTableObject{

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
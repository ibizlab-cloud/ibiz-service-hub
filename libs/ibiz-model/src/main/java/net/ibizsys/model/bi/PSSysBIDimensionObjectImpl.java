package net.ibizsys.model.bi;



public abstract class PSSysBIDimensionObjectImpl extends net.ibizsys.model.bi.PSSysBISchemeObjectImpl implements net.ibizsys.model.bi.IPSSysBIDimensionObject{

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
package net.ibizsys.model.bi;



public class PSSysBICubeDimensionObjectImpl extends net.ibizsys.model.bi.PSSysBICubeObjectImpl implements net.ibizsys.model.bi.IPSSysBICubeDimensionObject{

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
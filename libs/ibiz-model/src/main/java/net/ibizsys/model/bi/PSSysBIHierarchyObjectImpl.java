package net.ibizsys.model.bi;



public abstract class PSSysBIHierarchyObjectImpl extends net.ibizsys.model.bi.PSSysBIDimensionObjectImpl implements net.ibizsys.model.bi.IPSSysBIHierarchyObject{

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
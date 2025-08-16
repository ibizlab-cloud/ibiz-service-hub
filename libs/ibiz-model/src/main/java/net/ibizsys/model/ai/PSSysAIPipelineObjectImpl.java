package net.ibizsys.model.ai;



public abstract class PSSysAIPipelineObjectImpl extends net.ibizsys.model.ai.PSSysAIFactoryObjectImpl implements net.ibizsys.model.ai.IPSSysAIPipelineObject{

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
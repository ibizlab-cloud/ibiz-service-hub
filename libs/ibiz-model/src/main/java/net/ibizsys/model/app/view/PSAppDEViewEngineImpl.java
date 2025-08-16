package net.ibizsys.model.app.view;



public class PSAppDEViewEngineImpl extends net.ibizsys.model.app.view.PSAppDEViewEngineImplBase{

	public final static String ATTR_GETENGINETYPE = "engineType";

	public java.lang.String getEngineType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENGINETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
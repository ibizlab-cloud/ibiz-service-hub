package net.ibizsys.model.control.panel;



public class PSPanelEngineImpl extends net.ibizsys.model.app.view.PSAppViewEngineImplBase implements net.ibizsys.model.control.panel.IPSPanelEngine{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETENGINECAT = "engineCat";
	public final static String ATTR_GETENGINETYPE = "engineType";
	public final static String ATTR_GETORDERVALUE = "orderValue";

	@Deprecated
	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getEngineCat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENGINECAT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getEngineType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENGINETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
}
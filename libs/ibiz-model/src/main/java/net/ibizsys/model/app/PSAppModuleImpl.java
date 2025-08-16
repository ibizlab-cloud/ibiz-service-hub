package net.ibizsys.model.app;



public class PSAppModuleImpl extends net.ibizsys.model.app.PSApplicationObjectImpl implements net.ibizsys.model.app.IPSAppModule{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_ISDEFAULTMODULE = "defaultModule";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isDefaultModule(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDEFAULTMODULE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
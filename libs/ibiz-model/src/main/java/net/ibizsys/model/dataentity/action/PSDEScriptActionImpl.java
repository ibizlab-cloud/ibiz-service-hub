package net.ibizsys.model.dataentity.action;



public class PSDEScriptActionImpl extends net.ibizsys.model.dataentity.action.PSDEActionImplBase implements net.ibizsys.model.dataentity.action.IPSDEScriptAction{

	public final static String ATTR_GETSCRIPTCODE = "scriptCode";

	public java.lang.String getScriptCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSCRIPTCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
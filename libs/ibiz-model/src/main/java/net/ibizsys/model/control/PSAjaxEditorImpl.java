package net.ibizsys.model.control;



public abstract class PSAjaxEditorImpl extends net.ibizsys.model.control.PSEditorImpl implements net.ibizsys.model.control.IPSAjaxEditor{

	public final static String ATTR_GETHANDLERTYPE = "handlerType";

	public java.lang.String getHandlerType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHANDLERTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
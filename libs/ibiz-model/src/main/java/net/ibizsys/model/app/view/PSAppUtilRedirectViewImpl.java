package net.ibizsys.model.app.view;



public class PSAppUtilRedirectViewImpl extends net.ibizsys.model.app.view.PSAppUtilViewImpl{

	public final static String ATTR_ISREDIRECTVIEW = "redirectView";

	public boolean isRedirectView(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISREDIRECTVIEW);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
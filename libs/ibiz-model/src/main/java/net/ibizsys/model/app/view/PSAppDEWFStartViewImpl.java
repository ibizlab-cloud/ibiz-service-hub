package net.ibizsys.model.app.view;



public class PSAppDEWFStartViewImpl extends net.ibizsys.model.app.view.PSAppDEWFEditViewImpl{

	public final static String ATTR_GETOPENMODE = "openMode";

	public java.lang.String getOpenMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETOPENMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
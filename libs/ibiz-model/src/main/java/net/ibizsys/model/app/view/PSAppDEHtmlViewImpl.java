package net.ibizsys.model.app.view;



public class PSAppDEHtmlViewImpl extends net.ibizsys.model.app.view.PSAppDEViewImpl implements net.ibizsys.model.app.view.IPSAppDEHtmlView{

	public final static String ATTR_GETHTMLURL = "htmlUrl";
	public final static String ATTR_ISLOADDEFAULT = "loadDefault";

	public java.lang.String getHtmlUrl(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHTMLURL);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isLoadDefault(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISLOADDEFAULT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
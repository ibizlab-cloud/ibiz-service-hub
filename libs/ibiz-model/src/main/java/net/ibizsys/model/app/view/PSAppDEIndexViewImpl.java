package net.ibizsys.model.app.view;



public class PSAppDEIndexViewImpl extends net.ibizsys.model.app.view.PSAppDEXDataViewImpl implements net.ibizsys.model.app.view.IPSAppDEIndexView{

	public final static String ATTR_GETMARKOPENDATAMODE = "markOpenDataMode";
	public final static String ATTR_ISENABLEWF = "enableWF";
	public final static String ATTR_ISSHOWCAPTIONBAR = "showCaptionBar";

	public java.lang.String getMarkOpenDataMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMARKOPENDATAMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public boolean isEnableWF(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEWF);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isShowCaptionBar(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSHOWCAPTIONBAR);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}
}
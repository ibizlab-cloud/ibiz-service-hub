package net.ibizsys.model.app.view;



public class PSAppDEDashboardViewImpl extends net.ibizsys.model.app.view.PSAppDESearchViewImpl implements net.ibizsys.model.app.view.IPSAppDEDashboardView{

	public final static String ATTR_GETMARKOPENDATAMODE = "markOpenDataMode";
	public final static String ATTR_ISSHOWDATAINFOBAR = "showDataInfoBar";

	public java.lang.String getMarkOpenDataMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMARKOPENDATAMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isShowDataInfoBar(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSHOWDATAINFOBAR);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
package net.ibizsys.model.app.view;



public class PSAppDEReportViewImpl extends net.ibizsys.model.app.view.PSAppDESearchViewImpl implements net.ibizsys.model.app.view.IPSAppDEReportView{

	public final static String ATTR_GETMARKOPENDATAMODE = "markOpenDataMode";

	public java.lang.String getMarkOpenDataMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMARKOPENDATAMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
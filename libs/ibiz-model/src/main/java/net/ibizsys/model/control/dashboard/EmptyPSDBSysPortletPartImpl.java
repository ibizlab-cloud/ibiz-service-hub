package net.ibizsys.model.control.dashboard;



public class EmptyPSDBSysPortletPartImpl extends net.ibizsys.model.control.dashboard.PSDBPortletPartImpl{

	public final static String ATTR_GETPORTLETTYPE = "portletType";

	public java.lang.String getPortletType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPORTLETTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
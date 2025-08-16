package net.ibizsys.model.res;



public class PSSysHtmlPortletImpl extends net.ibizsys.model.res.PSSysPortletImpl implements net.ibizsys.model.res.IPSSysHtmlPortlet{

	public final static String ATTR_GETHTMLSHOWMODE = "htmlShowMode";
	public final static String ATTR_GETPAGEURL = "pageUrl";

	public java.lang.String getHtmlShowMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHTMLSHOWMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPageUrl(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPAGEURL);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
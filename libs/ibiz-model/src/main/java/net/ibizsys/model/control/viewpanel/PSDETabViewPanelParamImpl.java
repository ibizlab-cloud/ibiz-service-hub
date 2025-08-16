package net.ibizsys.model.control.viewpanel;



public class PSDETabViewPanelParamImpl extends net.ibizsys.model.control.viewpanel.PSDEViewPanelParamImpl implements net.ibizsys.model.control.viewpanel.IPSDETabViewPanelParam{

	public final static String ATTR_GETNAVFILTER = "navFilter";
	public final static String ATTR_GETNAVPSDERNAME = "navPSDERName";
	public final static String ATTR_GETPSDEOPPRIVID = "getPSDEOPPrivId";
	public final static String ATTR_GETPSSYSIMAGEID = "getPSSysImageId";

	public java.lang.String getNavFilter(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAVFILTER);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getNavPSDERName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAVPSDERNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPSDEOPPrivId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEOPPRIVID);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPSSysImageId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSIMAGEID);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
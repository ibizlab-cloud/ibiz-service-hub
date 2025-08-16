package net.ibizsys.model.app.theme;



public class PSAppUIThemeImpl extends net.ibizsys.model.app.PSApplicationObjectImpl implements net.ibizsys.model.app.theme.IPSAppUITheme{

	public final static String ATTR_GETCSSSTYLE = "cssStyle";
	public final static String ATTR_GETTHEMEDESC = "themeDesc";
	public final static String ATTR_GETTHEMEPARAMS = "themeParams";
	public final static String ATTR_GETTHEMETAG = "themeTag";
	public final static String ATTR_GETTHEMEURL = "themeUrl";

	public java.lang.String getCssStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCSSSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getThemeDesc(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTHEMEDESC);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getThemeParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTHEMEPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getThemeTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTHEMETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getThemeUrl(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTHEMEURL);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
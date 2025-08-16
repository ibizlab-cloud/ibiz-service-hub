package net.ibizsys.model.res;



public class PSSysChartThemeImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.res.IPSSysChartTheme{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETTHEMEDESC = "themeDesc";
	public final static String ATTR_GETTHEMEPARAMS = "themeParams";
	public final static String ATTR_GETTHEMETAG = "themeTag";
	public final static String ATTR_GETTHEMETAG2 = "themeTag2";
	public final static String ATTR_ISDEFAULTMODE = "defaultMode";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
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

	public java.lang.String getThemeParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTHEMEPARAMS);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getThemeTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTHEMETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getThemeTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTHEMETAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isDefaultMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDEFAULTMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
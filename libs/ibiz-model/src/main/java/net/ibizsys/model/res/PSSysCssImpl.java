package net.ibizsys.model.res;



public class PSSysCssImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.res.IPSSysCss{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCSSNAME = "cssName";
	public final static String ATTR_GETCSSSTYLE = "cssStyle";
	public final static String ATTR_GETDESIGNCSSSTYLE = "designCssStyle";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCssName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCSSNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCssStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCSSSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDesignCssStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDESIGNCSSSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
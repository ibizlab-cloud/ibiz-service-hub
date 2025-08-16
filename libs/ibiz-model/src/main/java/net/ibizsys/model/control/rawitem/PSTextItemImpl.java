package net.ibizsys.model.control.rawitem;



public class PSTextItemImpl extends net.ibizsys.model.control.rawitem.PSRawItemImplBase implements net.ibizsys.model.control.rawitem.IPSTextItem{

	public final static String ATTR_GETCAPTION = "caption";
	public final static String ATTR_GETHALIGN = "hAlign";
	public final static String ATTR_GETRENDERMODE = "renderMode";
	public final static String ATTR_GETVALIGN = "vAlign";
	public final static String ATTR_GETWRAPMODE = "wrapMode";

	public java.lang.String getCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCAPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getHAlign(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHALIGN);
		if(value == null){
			return "LEFT";
		}
		return value.asText();
	}

	public java.lang.String getRenderMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRENDERMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getVAlign(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALIGN);
		if(value == null){
			return "MIDDLE";
		}
		return value.asText();
	}

	public java.lang.String getWrapMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWRAPMODE);
		if(value == null){
			return "NOWRAP";
		}
		return value.asText();
	}
}
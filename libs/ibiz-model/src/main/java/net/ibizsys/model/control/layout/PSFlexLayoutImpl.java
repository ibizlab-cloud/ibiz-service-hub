package net.ibizsys.model.control.layout;



public class PSFlexLayoutImpl extends net.ibizsys.model.control.layout.PSLayoutImplBase implements net.ibizsys.model.control.layout.IPSFlexLayout{

	public final static String ATTR_GETALIGN = "align";
	public final static String ATTR_GETDIR = "dir";
	public final static String ATTR_GETLAYOUT = "layout";
	public final static String ATTR_GETVALIGN = "vAlign";

	public java.lang.String getAlign(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALIGN);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDir(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDIR);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getLayout(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLAYOUT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getVAlign(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALIGN);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
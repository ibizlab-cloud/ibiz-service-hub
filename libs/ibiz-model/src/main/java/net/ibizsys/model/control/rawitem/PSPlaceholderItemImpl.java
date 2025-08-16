package net.ibizsys.model.control.rawitem;



public class PSPlaceholderItemImpl extends net.ibizsys.model.control.rawitem.PSRawItemImplBase implements net.ibizsys.model.control.rawitem.IPSPlaceholderItem{

	public final static String ATTR_GETCAPTION = "caption";
	public final static String ATTR_GETCONTENT = "content";

	public java.lang.String getCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCAPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getContent(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENT);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
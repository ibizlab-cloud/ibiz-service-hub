package net.ibizsys.model.control.rawitem;



public class PSHtmlItemImpl extends net.ibizsys.model.control.rawitem.PSRawItemImplBase implements net.ibizsys.model.control.rawitem.IPSHtmlItem{

	public final static String ATTR_GETCONTENT = "content";

	public java.lang.String getContent(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENT);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
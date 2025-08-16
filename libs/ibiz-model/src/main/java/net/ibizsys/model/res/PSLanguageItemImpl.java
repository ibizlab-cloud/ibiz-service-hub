package net.ibizsys.model.res;



public class PSLanguageItemImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.res.IPSLanguageItem{

	public final static String ATTR_GETCONTENT = "content";
	public final static String ATTR_GETLANRESTAG = "lanResTag";
	public final static String ATTR_GETNAME = "name";

	public java.lang.String getContent(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getLanResTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLANRESTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
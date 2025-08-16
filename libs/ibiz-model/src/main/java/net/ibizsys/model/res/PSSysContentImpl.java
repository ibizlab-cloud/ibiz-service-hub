package net.ibizsys.model.res;



public class PSSysContentImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.res.IPSSysContent{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCONTENT = "content";
	public final static String ATTR_GETCONTENTPATH = "contentPath";
	public final static String ATTR_GETCONTENTTAG = "contentTag";
	public final static String ATTR_GETCONTENTTAG2 = "contentTag2";
	public final static String ATTR_GETCONTENTTAG3 = "contentTag3";
	public final static String ATTR_GETCONTENTTAG4 = "contentTag4";
	public final static String ATTR_GETCONTENTTYPE = "contentType";
	public final static String ATTR_GETSUBJECT = "subject";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
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

	public java.lang.String getContentPath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getContentTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getContentTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getContentTag3(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTTAG3);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getContentTag4(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTTAG4);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getContentType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSubject(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSUBJECT);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
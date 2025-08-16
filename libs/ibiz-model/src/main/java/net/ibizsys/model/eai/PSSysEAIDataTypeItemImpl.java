package net.ibizsys.model.eai;



public class PSSysEAIDataTypeItemImpl extends net.ibizsys.model.eai.PSSysEAIDataTypeObjectImpl implements net.ibizsys.model.eai.IPSSysEAIDataTypeItem{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDATA = "data";
	public final static String ATTR_GETITEMTAG = "itemTag";
	public final static String ATTR_GETITEMTAG2 = "itemTag2";
	public final static String ATTR_GETVALUE = "value";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATA);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getItemTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getItemTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
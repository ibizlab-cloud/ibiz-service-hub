package net.ibizsys.model.res;



public class PSLanguageResImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.res.IPSLanguageRes{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDEFAULTCONTENT = "defaultContent";
	public final static String ATTR_GETLANRESTAG = "lanResTag";
	public final static String ATTR_GETLANRESTYPE = "lanResType";
	public final static String ATTR_GETNAME = "name";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETREFFLAG = "refFlag";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDefaultContent(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTCONTENT);
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

	public java.lang.String getLanResType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLANRESTYPE);
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

	@Deprecated
	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public boolean getRefFlag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFFLAG);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
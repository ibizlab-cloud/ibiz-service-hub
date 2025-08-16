package net.ibizsys.model.dynamodel;



public class PSSysDynaModelAttrImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dynamodel.IPSSysDynaModelAttr{

	public final static String ATTR_GETATTRTAG = "attrTag";
	public final static String ATTR_GETATTRTAG2 = "attrTag2";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETSTDDATATYPE = "stdDataType";
	public final static String ATTR_GETVALUE = "value";
	public final static String ATTR_GETVALUETYPE = "valueType";
	public final static String ATTR_ISARRAY = "array";

	public java.lang.String getAttrTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETATTRTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAttrTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETATTRTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 99999;
		}
		return value.asInt();
	}

	public int getStdDataType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTDDATATYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getValueType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isArray(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISARRAY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
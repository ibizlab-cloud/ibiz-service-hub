package net.ibizsys.model.dynamodel;



public abstract class PSJsonSimpleSchemaImpl extends net.ibizsys.model.dynamodel.PSJsonNodeSchemaImplBase implements net.ibizsys.model.dynamodel.IPSJsonSimpleSchema{

	public final static String ATTR_GETFORMAT = "format";
	public final static String ATTR_GETSTDDATATYPE = "stdDataType";

	public java.lang.String getFormat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFORMAT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getStdDataType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTDDATATYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
}
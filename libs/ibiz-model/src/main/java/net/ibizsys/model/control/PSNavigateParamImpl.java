package net.ibizsys.model.control;



public class PSNavigateParamImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.control.IPSNavigateParam{

	public final static String ATTR_GETDESC = "desc";
	public final static String ATTR_GETKEY = "key";
	public final static String ATTR_GETVALUE = "value";
	public final static String ATTR_ISRAWVALUE = "rawValue";

	public java.lang.String getDesc(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDESC);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getKey(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETKEY);
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

	public boolean isRawValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISRAWVALUE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
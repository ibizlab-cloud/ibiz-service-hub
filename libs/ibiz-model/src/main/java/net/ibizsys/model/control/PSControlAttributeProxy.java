package net.ibizsys.model.control;



public class PSControlAttributeProxy extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.control.IPSControlAttribute{

	public final static String ATTR_GETATTRNAME = "attrName";
	public final static String ATTR_GETATTRVALUE = "attrValue";
	public final static String ATTR_GETNAME = "name";

	public java.lang.String getAttrName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETATTRNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAttrValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETATTRVALUE);
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
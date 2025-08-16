package net.ibizsys.model.dynamodel;



public abstract class PSJsonPropertyImplBase extends net.ibizsys.model.dynamodel.PSJsonNodeImpl implements net.ibizsys.model.dynamodel.IPSJsonProperty{

	public final static String ATTR_GETDESCRIPTION = "description";
	public final static String ATTR_GETTYPE = "type";

	public java.lang.String getDescription(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDESCRIPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
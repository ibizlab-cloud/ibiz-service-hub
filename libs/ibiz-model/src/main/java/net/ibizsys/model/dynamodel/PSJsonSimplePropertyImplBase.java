package net.ibizsys.model.dynamodel;



public abstract class PSJsonSimplePropertyImplBase extends net.ibizsys.model.dynamodel.PSJsonPropertyImplBase implements net.ibizsys.model.dynamodel.IPSJsonSimpleProperty{

	public final static String ATTR_GETFORMAT = "format";

	public java.lang.String getFormat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFORMAT);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
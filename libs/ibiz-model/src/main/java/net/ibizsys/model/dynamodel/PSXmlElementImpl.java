package net.ibizsys.model.dynamodel;



public abstract class PSXmlElementImpl extends net.ibizsys.model.dynamodel.PSXmlNodeImpl implements net.ibizsys.model.dynamodel.IPSXmlElement{

	public final static String ATTR_GETELEMENTID = "elementId";

	public java.lang.String getElementId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETELEMENTID);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
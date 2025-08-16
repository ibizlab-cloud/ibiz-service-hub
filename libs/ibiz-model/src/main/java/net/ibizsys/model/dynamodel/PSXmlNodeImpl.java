package net.ibizsys.model.dynamodel;



public abstract class PSXmlNodeImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dynamodel.IPSXmlNode{

	public final static String ATTR_GETNODENAME = "nodeName";
	public final static String ATTR_GETNODEVALUE = "nodeValue";

	public java.lang.String getNodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getNodeValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNODEVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
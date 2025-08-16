package net.ibizsys.model.dynamodel;



public class PSLiquibaseChangeLogModelImpl extends net.ibizsys.model.dynamodel.PSSysDynaModelImpl{

	public final static String ATTR_GETELEMENTID = "elementId";
	public final static String ATTR_GETNODENAME = "nodeName";
	public final static String ATTR_GETNODEVALUE = "nodeValue";

	@Deprecated
	public java.lang.String getElementId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETELEMENTID);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getNodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getNodeValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNODEVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
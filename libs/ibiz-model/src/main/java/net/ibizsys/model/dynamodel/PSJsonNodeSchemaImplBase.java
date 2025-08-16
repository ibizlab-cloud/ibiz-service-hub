package net.ibizsys.model.dynamodel;



public abstract class PSJsonNodeSchemaImplBase extends net.ibizsys.model.dynamodel.PSJsonNodeImpl implements net.ibizsys.model.dynamodel.IPSJsonNodeSchema{

	public final static String ATTR_GETDESCRIPTION = "description";
	public final static String ATTR_GETREFSCHEMAID = "refSchemaId";
	public final static String ATTR_GETTYPE = "type";
	public final static String ATTR_ISREFMODE = "refMode";

	public java.lang.String getDescription(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDESCRIPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRefSchemaId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFSCHEMAID);
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

	public boolean isRefMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISREFMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
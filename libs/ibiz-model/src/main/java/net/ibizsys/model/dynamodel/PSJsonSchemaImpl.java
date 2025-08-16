package net.ibizsys.model.dynamodel;



public class PSJsonSchemaImpl extends net.ibizsys.model.dynamodel.PSSysDynaModelImpl implements net.ibizsys.model.dynamodel.IPSJsonSchema{

	public final static String ATTR_GETDESCRIPTION = "description";
	public final static String ATTR_GETREFSCHEMAID = "refSchemaId";
	public final static String ATTR_GETSCHEMAID = "schemaId";
	public final static String ATTR_GETTYPE = "type";
	public final static String ATTR_ISENABLEADDITIONALPROPERTIES = "enableAdditionalProperties";
	public final static String ATTR_ISREFMODE = "refMode";

	public java.lang.String getDescription(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDESCRIPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getRefSchemaId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFSCHEMAID);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSchemaId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSCHEMAID);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isEnableAdditionalProperties(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEADDITIONALPROPERTIES);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isRefMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISREFMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
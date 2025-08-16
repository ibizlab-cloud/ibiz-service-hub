package net.ibizsys.model.dynamodel;



public class PSJsonObjectSchemaImpl extends net.ibizsys.model.dynamodel.PSJsonNodeSchemaImplBase implements net.ibizsys.model.dynamodel.IPSJsonObjectSchema{

	public final static String ATTR_ISENABLEADDITIONALPROPERTIES = "enableAdditionalProperties";

	public boolean isEnableAdditionalProperties(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEADDITIONALPROPERTIES);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
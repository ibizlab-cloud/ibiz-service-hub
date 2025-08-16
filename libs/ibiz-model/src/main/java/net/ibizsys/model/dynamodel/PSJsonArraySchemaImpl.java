package net.ibizsys.model.dynamodel;



public class PSJsonArraySchemaImpl extends net.ibizsys.model.dynamodel.PSJsonNodeSchemaImplBase implements net.ibizsys.model.dynamodel.IPSJsonArraySchema{

	public final static String ATTR_ISENABLEADDITIONALITEMS = "enableAdditionalItems";
	public final static String ATTR_ISENABLEUNIQUEITEMS = "enableUniqueItems";

	public boolean isEnableAdditionalItems(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEADDITIONALITEMS);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableUniqueItems(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEUNIQUEITEMS);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
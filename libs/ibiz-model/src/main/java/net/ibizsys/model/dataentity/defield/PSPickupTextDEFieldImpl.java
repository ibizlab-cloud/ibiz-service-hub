package net.ibizsys.model.dataentity.defield;



public class PSPickupTextDEFieldImpl extends net.ibizsys.model.dataentity.defield.PSPickupDataDEFieldImpl implements net.ibizsys.model.dataentity.defield.IPSPickupTextDEField{

	public final static String ATTR_ISPHISICALDEFIELD = "phisicalDEField";

	public boolean isPhisicalDEField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISPHISICALDEFIELD);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}
}
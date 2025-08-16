package net.ibizsys.model.dataentity.defield;



public class PSPickupDEFieldImpl extends net.ibizsys.model.dataentity.defield.PSLinkDEFieldImpl implements net.ibizsys.model.dataentity.defield.IPSPickupDEField{

	public final static String ATTR_ISPHISICALDEFIELD = "phisicalDEField";

	public boolean isPhisicalDEField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISPHISICALDEFIELD);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}
}
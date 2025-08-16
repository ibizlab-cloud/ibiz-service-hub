package net.ibizsys.model.app.view;



public class PSAppDEMobPickupMDViewImpl extends net.ibizsys.model.app.view.PSAppDEMobMDViewImpl{

	public final static String ATTR_ISPICKUPMODE = "pickupMode";

	@Deprecated
	public boolean isPickupMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISPICKUPMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
package net.ibizsys.model.app.view;



public class PSAppDEPickupGridViewImpl extends net.ibizsys.model.app.view.PSAppDEGridViewImpl{

	public final static String ATTR_ISPICKUPMODE = "pickupMode";

	public boolean isPickupMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISPICKUPMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
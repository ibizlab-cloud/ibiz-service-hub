package net.ibizsys.model.app.view;



public class PSAppDEPickupDataViewImpl extends net.ibizsys.model.app.view.PSAppDEDataViewImpl{

	public final static String ATTR_ISPICKUPMODE = "pickupMode";

	public boolean isPickupMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISPICKUPMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
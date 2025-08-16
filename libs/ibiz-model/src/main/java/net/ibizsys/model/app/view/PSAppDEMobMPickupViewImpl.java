package net.ibizsys.model.app.view;



public class PSAppDEMobMPickupViewImpl extends net.ibizsys.model.app.view.PSAppDEMPickupViewImpl implements net.ibizsys.model.app.view.IPSAppDEMobPickupView{

	public final static String ATTR_ISENABLEPULLDOWNREFRESH = "enablePullDownRefresh";

	public boolean isEnablePullDownRefresh(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEPULLDOWNREFRESH);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
package net.ibizsys.model.app.view;



public class PSAppDEMobMapViewImpl extends net.ibizsys.model.app.view.PSAppDEMapViewImpl implements net.ibizsys.model.app.view.IPSAppDEMobMapView{

	public final static String ATTR_ISENABLEPULLDOWNREFRESH = "enablePullDownRefresh";

	public boolean isEnablePullDownRefresh(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEPULLDOWNREFRESH);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
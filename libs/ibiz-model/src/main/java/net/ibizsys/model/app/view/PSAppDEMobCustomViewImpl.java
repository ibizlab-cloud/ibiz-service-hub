package net.ibizsys.model.app.view;



public class PSAppDEMobCustomViewImpl extends net.ibizsys.model.app.view.PSAppDECustomViewImpl implements net.ibizsys.model.app.view.IPSAppDEMobCustomView{

	public final static String ATTR_ISENABLEPULLDOWNREFRESH = "enablePullDownRefresh";

	public boolean isEnablePullDownRefresh(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEPULLDOWNREFRESH);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
package net.ibizsys.model.app.view;



public class PSAppDEMobRedirectViewImpl extends net.ibizsys.model.app.view.PSAppDERedirectViewImpl implements net.ibizsys.model.app.view.IPSAppDEMobRedirectView{

	public final static String ATTR_ISENABLEPULLDOWNREFRESH = "enablePullDownRefresh";

	@Deprecated
	public boolean isEnablePullDownRefresh(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEPULLDOWNREFRESH);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
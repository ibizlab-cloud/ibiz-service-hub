package net.ibizsys.model.app.view;



public class PSAppDEMobWFMDViewImpl extends net.ibizsys.model.app.view.PSAppDEMobMDViewImpl implements net.ibizsys.model.app.view.IPSAppDEWFActionView
		,net.ibizsys.model.app.view.IPSAppDEMobWFMDView{

	public final static String ATTR_ISENABLEWF = "enableWF";

	@Deprecated
	public boolean isEnableWF(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEWF);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
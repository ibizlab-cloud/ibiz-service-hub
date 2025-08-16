package net.ibizsys.model.app.view;



public class PSAppDEWFProxyStartViewImpl extends net.ibizsys.model.app.view.PSAppDEViewImpl implements net.ibizsys.model.app.view.IPSAppDEWFProxyStartView{

	public final static String ATTR_ISENABLEWF = "enableWF";

	public boolean isEnableWF(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEWF);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
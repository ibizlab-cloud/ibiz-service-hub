package net.ibizsys.model.app.view;



public class PSAppFuncPickupViewImpl extends net.ibizsys.model.app.view.PSAppUtilViewImpl implements net.ibizsys.model.app.view.IPSAppFuncPickupView{

	public final static String ATTR_ISENABLEDP = "enableDP";
	public final static String ATTR_ISENABLEWF = "enableWF";

	public boolean isEnableDP(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEDP);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isEnableWF(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEWF);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
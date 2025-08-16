package net.ibizsys.model.app.view;



public class PSAppPortalViewImpl extends net.ibizsys.model.app.view.PSAppViewImpl implements net.ibizsys.model.app.view.IPSAppPortalView{

	public final static String ATTR_ISDEFAULTPAGE = "defaultPage";
	public final static String ATTR_ISENABLEDP = "enableDP";
	public final static String ATTR_ISENABLEPULLDOWNREFRESH = "enablePullDownRefresh";
	public final static String ATTR_ISENABLEWF = "enableWF";

	public boolean isDefaultPage(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDEFAULTPAGE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableDP(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEDP);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isEnablePullDownRefresh(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEPULLDOWNREFRESH);
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
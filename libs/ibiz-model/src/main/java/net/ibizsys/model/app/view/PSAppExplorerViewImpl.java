package net.ibizsys.model.app.view;



public class PSAppExplorerViewImpl extends net.ibizsys.model.app.view.PSAppViewImpl implements net.ibizsys.model.app.view.IPSAppExplorerView{

	public final static String ATTR_ISENABLEDP = "enableDP";
	public final static String ATTR_ISENABLEWF = "enableWF";
	public final static String ATTR_ISIFRAMEMODE = "iFrameMode";

	@Deprecated
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

	@Deprecated
	public boolean isIFrameMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISIFRAMEMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
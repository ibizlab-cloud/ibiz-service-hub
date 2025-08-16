package net.ibizsys.model.app.view;



public class PSAppDETreeExplorerView2Impl extends net.ibizsys.model.app.view.PSAppDETreeExplorerViewImpl{

	public final static String ATTR_ISIFRAMEMODE = "iFrameMode";

	public boolean isIFrameMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISIFRAMEMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
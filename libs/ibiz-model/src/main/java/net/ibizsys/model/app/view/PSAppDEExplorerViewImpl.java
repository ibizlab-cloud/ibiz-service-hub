package net.ibizsys.model.app.view;



public class PSAppDEExplorerViewImpl extends net.ibizsys.model.app.view.PSAppDEViewImpl implements net.ibizsys.model.app.view.IPSAppDEExplorerView{

	public final static String ATTR_GETMARKOPENDATAMODE = "markOpenDataMode";
	public final static String ATTR_ISIFRAMEMODE = "iFrameMode";
	public final static String ATTR_ISLOADDEFAULT = "loadDefault";
	public final static String ATTR_ISSHOWDATAINFOBAR = "showDataInfoBar";

	public java.lang.String getMarkOpenDataMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMARKOPENDATAMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public boolean isIFrameMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISIFRAMEMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isLoadDefault(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISLOADDEFAULT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isShowDataInfoBar(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSHOWDATAINFOBAR);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
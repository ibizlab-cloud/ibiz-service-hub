package net.ibizsys.model.app.view;



public class PSAppDESideBarExplorerViewImpl extends net.ibizsys.model.app.view.PSAppDEMultiDataViewImpl implements net.ibizsys.model.app.view.IPSAppDESideBarExplorerView{

	public final static String ATTR_GETMARKOPENDATAMODE = "markOpenDataMode";
	public final static String ATTR_GETSIDEBARLAYOUT = "sideBarLayout";
	public final static String ATTR_ISIFRAMEMODE = "iFrameMode";
	public final static String ATTR_ISSHOWDATAINFOBAR = "showDataInfoBar";

	public java.lang.String getMarkOpenDataMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMARKOPENDATAMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSideBarLayout(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSIDEBARLAYOUT);
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

	public boolean isShowDataInfoBar(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSHOWDATAINFOBAR);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
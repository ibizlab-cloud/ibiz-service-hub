package net.ibizsys.model.app.view;



public class PSAppDEEditViewImpl extends net.ibizsys.model.app.view.PSAppDEXDataViewImpl implements net.ibizsys.model.app.view.IPSAppDEEditView{

	public final static String ATTR_GETMARKOPENDATAMODE = "markOpenDataMode";
	public final static String ATTR_GETMULTIFORMMODE = "multiFormMode";
	public final static String ATTR_ISENABLEDIRTYCHECKING = "enableDirtyChecking";
	public final static String ATTR_ISENABLEWF = "enableWF";
	public final static String ATTR_ISHIDEEDITFORM = "hideEditForm";
	public final static String ATTR_ISMANUALAPPENDFORMS = "manualAppendForms";
	public final static String ATTR_ISSHOWCAPTIONBAR = "showCaptionBar";
	public final static String ATTR_ISSHOWDATAINFOBAR = "showDataInfoBar";

	public java.lang.String getMarkOpenDataMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMARKOPENDATAMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getMultiFormMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMULTIFORMMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public boolean isEnableDirtyChecking(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEDIRTYCHECKING);
		if(value == null){
			return true;
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

	public boolean isHideEditForm(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISHIDEEDITFORM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isManualAppendForms(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISMANUALAPPENDFORMS);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isShowCaptionBar(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSHOWCAPTIONBAR);
		if(value == null){
			return true;
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
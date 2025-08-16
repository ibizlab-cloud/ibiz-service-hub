package net.ibizsys.model.app.view;



public class PSAppDEWFActionViewImpl extends net.ibizsys.model.app.view.PSAppDEEditViewImpl implements net.ibizsys.model.app.view.IPSAppDEWFActionView{

	public final static String ATTR_GETOPENMODE = "openMode";
	public final static String ATTR_GETWFSTEPVALUE = "wFStepValue";
	public final static String ATTR_GETWFUTILTYPE = "wFUtilType";
	public final static String ATTR_ISENABLEWF = "enableWF";
	public final static String ATTR_ISWFIAMODE = "wFIAMode";

	public java.lang.String getOpenMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETOPENMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getWFStepValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFSTEPVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getWFUtilType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFUTILTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isEnableWF(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEWF);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isWFIAMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISWFIAMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
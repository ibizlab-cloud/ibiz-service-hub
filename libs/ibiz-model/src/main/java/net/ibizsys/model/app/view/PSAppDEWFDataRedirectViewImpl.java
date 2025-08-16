package net.ibizsys.model.app.view;



public class PSAppDEWFDataRedirectViewImpl extends net.ibizsys.model.app.view.PSAppDERedirectViewImpl implements net.ibizsys.model.app.view.IPSAppDEWFDataRedirectView{

	public final static String ATTR_GETWFSTEPVALUE = "wFStepValue";
	public final static String ATTR_ISENABLEWF = "enableWF";
	public final static String ATTR_ISWFIAMODE = "wFIAMode";

	public java.lang.String getWFStepValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFSTEPVALUE);
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
package net.ibizsys.model.control.editor;



public class PSCodeImpl extends net.ibizsys.model.control.editor.PSTextAreaImpl implements net.ibizsys.model.control.editor.IPSCode{

	public final static String ATTR_GETCODETYPE = "codeType";
	public final static String ATTR_ISENABLEFULLSCREEN = "enableFullScreen";
	public final static String ATTR_ISENABLEMINIMAP = "enableMinimap";

	public java.lang.String getCodeType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isEnableFullScreen(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEFULLSCREEN);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableMinimap(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEMINIMAP);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
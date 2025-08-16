package net.ibizsys.model.control.editor;



public class PSRawImpl extends net.ibizsys.model.control.PSEditorImpl implements net.ibizsys.model.control.editor.IPSRaw{

	public final static String ATTR_GETCONTENTTYPE = "contentType";
	public final static String ATTR_GETTEMPLATE = "template";
	public final static String ATTR_ISEDITABLE = "editable";

	public java.lang.String getContentType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTTYPE);
		if(value == null){
			return "RAW";
		}
		return value.asText();
	}

	public java.lang.String getTemplate(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEMPLATE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isEditable(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISEDITABLE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
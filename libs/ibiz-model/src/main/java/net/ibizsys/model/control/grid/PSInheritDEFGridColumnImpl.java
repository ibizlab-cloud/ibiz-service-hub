package net.ibizsys.model.control.grid;



public class PSInheritDEFGridColumnImpl extends net.ibizsys.model.control.grid.PSLinkDEFGridColumnImpl{

	public final static String ATTR_GETEDITORSTYLE = "editorStyle";
	public final static String ATTR_GETEDITORTYPE = "editorType";

	public java.lang.String getEditorStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEDITORSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getEditorType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEDITORTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
package net.ibizsys.model.control.editor;



public class PSValueItemEditorImpl extends net.ibizsys.model.control.PSEditorImpl implements net.ibizsys.model.control.editor.IPSValueItemEditor{

	public final static String ATTR_GETVALUEITEMNAME = "valueItemName";

	public java.lang.String getValueItemName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUEITEMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
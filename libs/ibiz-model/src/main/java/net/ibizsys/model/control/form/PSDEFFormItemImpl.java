package net.ibizsys.model.control.form;



public class PSDEFFormItemImpl extends net.ibizsys.model.dataentity.defield.PSDEFUIItemImpl implements net.ibizsys.model.control.form.IPSDEFFormItem{

	public final static String ATTR_GETEDITORHEIGHT = "editorHeight";
	public final static String ATTR_GETEDITORWIDTH = "editorWidth";

	@Deprecated
	public int getEditorHeight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEDITORHEIGHT);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	@Deprecated
	public int getEditorWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEDITORWIDTH);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
}
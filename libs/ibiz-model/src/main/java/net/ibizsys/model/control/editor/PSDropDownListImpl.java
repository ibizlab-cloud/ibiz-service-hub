package net.ibizsys.model.control.editor;



public class PSDropDownListImpl extends net.ibizsys.model.control.editor.PSCodeListEditorImpl implements net.ibizsys.model.control.editor.IPSDropDownList{

	public final static String ATTR_ISSINGLESELECT = "singleSelect";

	public boolean isSingleSelect(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSINGLESELECT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
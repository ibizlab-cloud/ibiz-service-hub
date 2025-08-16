package net.ibizsys.model.control.editor;



public class PSMDropDownListImpl extends net.ibizsys.model.control.editor.PSDropDownListImpl implements net.ibizsys.model.control.editor.IPSMDropDownList{

	public final static String ATTR_ISSINGLESELECT = "singleSelect";

	public boolean isSingleSelect(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSINGLESELECT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
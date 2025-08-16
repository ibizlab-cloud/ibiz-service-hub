package net.ibizsys.model.control.editor;



public class PSMailAddressImpl extends net.ibizsys.model.control.editor.PSPickerEditorImpl implements net.ibizsys.model.control.editor.IPSMailAddress{

	public final static String ATTR_ISENABLEPICKUPVIEW = "enablePickupView";

	public boolean isEnablePickupView(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEPICKUPVIEW);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
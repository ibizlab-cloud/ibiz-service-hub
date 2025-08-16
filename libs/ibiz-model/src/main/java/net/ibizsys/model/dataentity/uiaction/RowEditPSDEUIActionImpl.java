package net.ibizsys.model.dataentity.uiaction;



public class RowEditPSDEUIActionImpl extends net.ibizsys.model.dataentity.uiaction.PSDEUIActionImpl{

	public final static String ATTR_ISENABLETOGGLEMODE = "enableToggleMode";

	public boolean isEnableToggleMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLETOGGLEMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
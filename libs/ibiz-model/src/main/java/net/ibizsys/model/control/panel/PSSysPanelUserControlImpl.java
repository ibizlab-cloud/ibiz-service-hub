package net.ibizsys.model.control.panel;



public class PSSysPanelUserControlImpl extends net.ibizsys.model.control.panel.PSSysPanelItemImpl implements net.ibizsys.model.control.panel.IPSSysPanelUserControl{

	public final static String ATTR_GETCTRLPARAMS = "ctrlParams";
	public final static String ATTR_GETPREDEFINEDTYPE = "predefinedType";

	public com.fasterxml.jackson.databind.node.ObjectNode getCtrlParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCTRLPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getPredefinedType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPREDEFINEDTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
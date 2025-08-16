package net.ibizsys.model.control.form;



public class PSDEFormUserControlImpl extends net.ibizsys.model.control.form.PSDEFormDetailImpl implements net.ibizsys.model.control.form.IPSDEFormUserControl{

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
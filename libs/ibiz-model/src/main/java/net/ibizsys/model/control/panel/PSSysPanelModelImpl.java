package net.ibizsys.model.control.panel;



public class PSSysPanelModelImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.control.panel.IPSSysPanelModel{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDATATYPE = "dataType";
	public final static String ATTR_GETTYPE = "type";
	public final static String ATTR_ISCTRLMODEL = "ctrlModel";
	public final static String ATTR_ISPANELMODEL = "panelModel";
	public final static String ATTR_ISVIEWMODEL = "viewModel";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDataType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATATYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isCtrlModel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCTRLMODEL);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isPanelModel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISPANELMODEL);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isViewModel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISVIEWMODEL);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
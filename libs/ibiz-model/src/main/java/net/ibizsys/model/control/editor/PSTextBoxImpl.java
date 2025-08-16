package net.ibizsys.model.control.editor;



public class PSTextBoxImpl extends net.ibizsys.model.control.editor.PSTextEditorImpl implements net.ibizsys.model.control.editor.IPSTextBox{

	public final static String ATTR_GETMAXVALUE = "maxValue";
	public final static String ATTR_GETMINVALUE = "minValue";
	public final static String ATTR_GETPRECISION = "precision";

	public java.lang.Double getMaxValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAXVALUE);
		if(value == null){
			return null;
		}
		return value.asDouble();
	}

	public java.lang.Double getMinValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINVALUE);
		if(value == null){
			return null;
		}
		return value.asDouble();
	}

	public java.lang.Integer getPrecision(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPRECISION);
		if(value == null){
			return null;
		}
		return value.asInt();
	}
}
package net.ibizsys.model.control.editor;



public class PSStepperImpl extends net.ibizsys.model.control.editor.PSNumberEditorImpl implements net.ibizsys.model.control.editor.IPSStepper{

	public final static String ATTR_GETSTEPVALUE = "stepValue";

	public java.lang.Double getStepValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTEPVALUE);
		if(value == null){
			return null;
		}
		return value.asDouble();
	}
}
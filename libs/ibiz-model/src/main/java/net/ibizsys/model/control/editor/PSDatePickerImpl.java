package net.ibizsys.model.control.editor;



public class PSDatePickerImpl extends net.ibizsys.model.control.PSEditorImpl implements net.ibizsys.model.control.editor.IPSDatePicker{

	public final static String ATTR_GETDATETIMEFORMAT = "dateTimeFormat";

	public java.lang.String getDateTimeFormat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATETIMEFORMAT);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
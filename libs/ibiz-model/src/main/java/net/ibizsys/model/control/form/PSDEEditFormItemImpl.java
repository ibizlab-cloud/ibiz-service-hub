package net.ibizsys.model.control.form;



public class PSDEEditFormItemImpl extends net.ibizsys.model.control.form.PSDEFormItemImpl implements net.ibizsys.model.control.form.IPSDEEditFormItem{

	public final static String ATTR_GETVALUEFORMAT = "valueFormat";

	public java.lang.String getValueFormat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUEFORMAT);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
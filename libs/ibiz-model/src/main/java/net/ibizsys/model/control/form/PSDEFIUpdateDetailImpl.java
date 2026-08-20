package net.ibizsys.model.control.form;



public class PSDEFIUpdateDetailImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.control.form.IPSDEFIUpdateDetail{

	public final static String ATTR_GETNAME = "name";
	public final static String ATTR_ISNESTEDMODEL = "nestedModel";

	public java.lang.String getName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isNestedModel(){
		return true;
	}
}
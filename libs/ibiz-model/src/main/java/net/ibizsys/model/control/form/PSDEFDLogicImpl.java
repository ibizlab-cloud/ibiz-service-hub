package net.ibizsys.model.control.form;



public abstract class PSDEFDLogicImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.control.form.IPSDEFDLogic{

	public final static String ATTR_GETLOGICCAT = "logicCat";
	public final static String ATTR_GETLOGICTYPE = "logicType";

	@Deprecated
	public java.lang.String getLogicCat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICCAT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getLogicType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
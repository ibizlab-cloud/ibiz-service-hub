package net.ibizsys.model.app.view;



public class PSAppViewEngineParamImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.app.view.IPSAppViewEngineParam{

	public final static String ATTR_GETAPPVIEWLOGICNAME = "appViewLogicName";
	public final static String ATTR_GETCTRLNAME = "ctrlName";
	public final static String ATTR_GETNAME = "name";
	public final static String ATTR_GETPARAMTYPE = "paramType";
	public final static String ATTR_GETVALUE = "value";

	public java.lang.String getAppViewLogicName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAPPVIEWLOGICNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCtrlName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCTRLNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getParamType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAMTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.Object getValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
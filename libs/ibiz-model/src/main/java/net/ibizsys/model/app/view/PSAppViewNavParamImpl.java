package net.ibizsys.model.app.view;



public class PSAppViewNavParamImpl extends net.ibizsys.model.app.view.PSAppViewParamImpl implements net.ibizsys.model.app.view.IPSAppViewNavParam{

	public final static String ATTR_ISRAWVALUE = "rawValue";

	public boolean isRawValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISRAWVALUE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
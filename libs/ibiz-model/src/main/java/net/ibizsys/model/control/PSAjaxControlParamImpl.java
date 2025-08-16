package net.ibizsys.model.control;



public class PSAjaxControlParamImpl extends net.ibizsys.model.control.PSControlParamImpl implements net.ibizsys.model.control.IPSAjaxControlParam{

	public final static String ATTR_ISAUTOLOAD = "autoLoad";
	public final static String ATTR_ISSHOWBUSYINDICATOR = "showBusyIndicator";

	public boolean isAutoLoad(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISAUTOLOAD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public java.lang.Boolean isShowBusyIndicator(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSHOWBUSYINDICATOR);
		if(value == null){
			return null;
		}
		return value.asBoolean();
	}
}
package net.ibizsys.model.app.view;



public class PSAppDEXDataViewImpl extends net.ibizsys.model.app.view.PSAppDEViewImpl implements net.ibizsys.model.app.view.IPSAppDEXDataView{

	public final static String ATTR_GETXDATACONTROLNAME = "xDataControlName";
	public final static String ATTR_ISENABLEEDITDATA = "enableEditData";
	public final static String ATTR_ISENABLENEWDATA = "enableNewData";
	public final static String ATTR_ISENABLEREMOVEDATA = "enableRemoveData";
	public final static String ATTR_ISLOADDEFAULT = "loadDefault";
	public final static String ATTR_ISREADONLY = "readOnly";

	public java.lang.String getXDataControlName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETXDATACONTROLNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isEnableEditData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEEDITDATA);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableNewData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLENEWDATA);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableRemoveData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEREMOVEDATA);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isLoadDefault(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISLOADDEFAULT);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}

	public boolean isReadOnly(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISREADONLY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
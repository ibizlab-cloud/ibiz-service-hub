package net.ibizsys.model.app.view;



public class PSAppDEMultiDataView2Impl extends net.ibizsys.model.app.view.PSAppDEMultiDataViewImpl implements net.ibizsys.model.app.view.IPSAppDEMultiDataView2{

	public final static String ATTR_GETMDCTRLACTIVEMODE = "mDCtrlActiveMode";

	public int getMDCtrlActiveMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMDCTRLACTIVEMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
}
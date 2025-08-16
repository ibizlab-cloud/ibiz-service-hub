package net.ibizsys.model.app.view;



public class PSAppDETreeGridViewImpl extends net.ibizsys.model.app.view.PSAppDEMultiDataViewImpl implements net.ibizsys.model.app.view.IPSAppDETreeGridView{

	public final static String ATTR_GETGRIDROWACTIVEMODE = "gridRowActiveMode";
	public final static String ATTR_ISENABLEEXPORT = "enableExport";
	public final static String ATTR_ISENABLEIMPORT = "enableImport";
	public final static String ATTR_ISENABLEROWEDIT = "enableRowEdit";
	public final static String ATTR_ISROWEDITDEFAULT = "rowEditDefault";

	public int getGridRowActiveMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGRIDROWACTIVEMODE);
		if(value == null){
			return 2;
		}
		return value.asInt();
	}

	public boolean isEnableExport(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEEXPORT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableImport(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEIMPORT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableRowEdit(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEROWEDIT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isRowEditDefault(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISROWEDITDEFAULT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
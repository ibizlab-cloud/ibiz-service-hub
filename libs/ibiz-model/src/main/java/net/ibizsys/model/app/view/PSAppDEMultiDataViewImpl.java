package net.ibizsys.model.app.view;



public class PSAppDEMultiDataViewImpl extends net.ibizsys.model.app.view.PSAppDEXDataViewImpl implements net.ibizsys.model.app.view.IPSAppDEMultiDataView{

	public final static String ATTR_GETQUICKGROUPPSCODELIST = "getQuickGroupPSCodeList";
	public final static String ATTR_ISENABLEEDITDATA = "enableEditData";
	public final static String ATTR_ISENABLEEXPORT = "enableExport";
	public final static String ATTR_ISENABLEFILTER = "enableFilter";
	public final static String ATTR_ISENABLEIMPORT = "enableImport";
	public final static String ATTR_ISENABLENEWDATA = "enableNewData";
	public final static String ATTR_ISENABLEQUICKCREATE = "enableQuickCreate";
	public final static String ATTR_ISENABLEQUICKGROUP = "enableQuickGroup";
	public final static String ATTR_ISENABLEQUICKSEARCH = "enableQuickSearch";
	public final static String ATTR_ISENABLESEARCH = "enableSearch";
	public final static String ATTR_ISENABLEVIEWDATA = "enableViewData";
	public final static String ATTR_ISEXPANDSEARCHFORM = "expandSearchForm";
	public final static String ATTR_ISPICKUPMODE = "pickupMode";
	private net.ibizsys.model.app.codelist.IPSAppCodeList quickgrouppscodelist;

	public net.ibizsys.model.app.codelist.IPSAppCodeList getQuickGroupPSCodeList(){
		if(this.quickgrouppscodelist != null) return this.quickgrouppscodelist;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETQUICKGROUPPSCODELIST);
		if(value == null){
			return null;
		}
		this.quickgrouppscodelist = getPSModelObject(net.ibizsys.model.app.codelist.IPSAppCodeList.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETQUICKGROUPPSCODELIST);
		return this.quickgrouppscodelist;
	}

	public net.ibizsys.model.app.codelist.IPSAppCodeList getQuickGroupPSCodeListMust(){
		net.ibizsys.model.app.codelist.IPSAppCodeList value = this.getQuickGroupPSCodeList();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定快速分组代码表");}
		return value;
	}

	public void setQuickGroupPSCodeList(net.ibizsys.model.app.codelist.IPSAppCodeList quickgrouppscodelist){
		this.quickgrouppscodelist = quickgrouppscodelist;
	}


	public boolean isEnableEditData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEEDITDATA);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableExport(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEEXPORT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableFilter(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEFILTER);
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

	public boolean isEnableNewData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLENEWDATA);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableQuickCreate(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEQUICKCREATE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableQuickGroup(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEQUICKGROUP);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableQuickSearch(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEQUICKSEARCH);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableSearch(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLESEARCH);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableViewData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEVIEWDATA);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isExpandSearchForm(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISEXPANDSEARCHFORM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isPickupMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISPICKUPMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
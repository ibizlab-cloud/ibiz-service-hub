package net.ibizsys.model.app.view;



public class PSAppDESearchViewImpl extends net.ibizsys.model.app.view.PSAppDEViewImpl implements net.ibizsys.model.app.view.IPSAppDESearchView
		,net.ibizsys.model.app.view.IPSAppDESearchView2{

	public final static String ATTR_GETQUICKGROUPPSCODELIST = "getQuickGroupPSCodeList";
	public final static String ATTR_ISENABLEQUICKGROUP = "enableQuickGroup";
	public final static String ATTR_ISENABLEQUICKSEARCH = "enableQuickSearch";
	public final static String ATTR_ISENABLESEARCH = "enableSearch";
	public final static String ATTR_ISEXPANDSEARCHFORM = "expandSearchForm";
	public final static String ATTR_ISLOADDEFAULT = "loadDefault";
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

	public boolean isExpandSearchForm(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISEXPANDSEARCHFORM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isLoadDefault(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISLOADDEFAULT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
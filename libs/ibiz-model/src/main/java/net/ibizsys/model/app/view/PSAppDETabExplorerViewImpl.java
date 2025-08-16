package net.ibizsys.model.app.view;



public class PSAppDETabExplorerViewImpl extends net.ibizsys.model.app.view.PSAppDEExplorerViewImpl implements net.ibizsys.model.app.view.IPSAppDETabExplorerView
		,net.ibizsys.model.app.view.IPSAppDESearchView{

	public final static String ATTR_GETTABLAYOUT = "tabLayout";
	public final static String ATTR_ISENABLEQUICKSEARCH = "enableQuickSearch";
	public final static String ATTR_ISENABLESEARCH = "enableSearch";
	public final static String ATTR_ISEXPANDSEARCHFORM = "expandSearchForm";
	public final static String ATTR_ISLOADDEFAULT = "loadDefault";

	public java.lang.String getTabLayout(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTABLAYOUT);
		if(value == null){
			return null;
		}
		return value.asText();
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
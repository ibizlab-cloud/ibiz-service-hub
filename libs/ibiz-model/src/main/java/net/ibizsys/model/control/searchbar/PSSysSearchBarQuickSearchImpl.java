package net.ibizsys.model.control.searchbar;



public class PSSysSearchBarQuickSearchImpl extends net.ibizsys.model.control.searchbar.PSSysSearchBarItemImplBase implements net.ibizsys.model.control.searchbar.IPSSearchBarQuickSearch{

	public final static String ATTR_GETPSDEFSEARCHMODE = "getPSDEFSearchMode";
	private net.ibizsys.model.dataentity.defield.IPSDEFSearchMode psdefsearchmode;

	public net.ibizsys.model.dataentity.defield.IPSDEFSearchMode getPSDEFSearchMode(){
		if(this.psdefsearchmode != null) return this.psdefsearchmode;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFSEARCHMODE);
		if(value == null){
			return null;
		}
		this.psdefsearchmode = getPSModelObject(net.ibizsys.model.dataentity.defield.IPSDEFSearchMode.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDEFSEARCHMODE);
		return this.psdefsearchmode;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEFSearchMode getPSDEFSearchModeMust(){
		net.ibizsys.model.dataentity.defield.IPSDEFSearchMode value = this.getPSDEFSearchMode();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定属性搜索模式");}
		return value;
	}

	public void setPSDEFSearchMode(net.ibizsys.model.dataentity.defield.IPSDEFSearchMode psdefsearchmode){
		this.psdefsearchmode = psdefsearchmode;
	}

}
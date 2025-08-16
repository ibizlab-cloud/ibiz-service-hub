package net.ibizsys.model.control.expbar;



public class PSTabExpPanelImpl extends net.ibizsys.model.control.PSControlContainerImpl implements net.ibizsys.model.control.expbar.IPSTabExpPanel{

	public final static String ATTR_GETPSTABEXPPAGES = "getPSTabExpPages";
	public final static String ATTR_GETTABLAYOUT = "tabLayout";
	public final static String ATTR_GETUNIQUETAG = "uniqueTag";

	private java.util.List<net.ibizsys.model.control.expbar.IPSTabExpPage> pstabexppages = null;
	public java.util.List<net.ibizsys.model.control.expbar.IPSTabExpPage> getPSTabExpPages(){
		if(this.pstabexppages == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSTABEXPPAGES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.expbar.IPSTabExpPage> list = new java.util.ArrayList<net.ibizsys.model.control.expbar.IPSTabExpPage>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.expbar.IPSTabExpPage obj = this.getPSModelObject(net.ibizsys.model.control.expbar.IPSTabExpPage.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSTABEXPPAGES);
				if(obj!=null)list.add(obj);
			}
			this.pstabexppages = list;
		}
		return (this.pstabexppages.size() == 0)? null : this.pstabexppages;
	}

	public net.ibizsys.model.control.expbar.IPSTabExpPage getPSTabExpPage(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.expbar.IPSTabExpPage.class, this.getPSTabExpPages(), objKey, bTryMode);
	}
	public void setPSTabExpPages(java.util.List<net.ibizsys.model.control.expbar.IPSTabExpPage> list){
		this.pstabexppages = list;
	}

	public java.lang.String getTabLayout(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTABLAYOUT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUniqueTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNIQUETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
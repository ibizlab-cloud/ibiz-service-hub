package net.ibizsys.model.control.toolbar;



public class PSDEToolbarImpl extends net.ibizsys.model.control.PSControlImpl implements net.ibizsys.model.control.toolbar.IPSDEToolbar{

	public final static String ATTR_GETOWNER = "owner";
	public final static String ATTR_GETPSDETOOLBARITEMS = "getPSDEToolbarItems";
	public final static String ATTR_GETTOOLBARSTYLE = "toolbarStyle";
	public final static String ATTR_GETXDATACONTROLNAME = "xDataControlName";

	public java.lang.Object getOwner(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETOWNER);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.control.toolbar.IPSDEToolbarItem> psdetoolbaritems = null;
	public java.util.List<net.ibizsys.model.control.toolbar.IPSDEToolbarItem> getPSDEToolbarItems(){
		if(this.psdetoolbaritems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDETOOLBARITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.toolbar.IPSDEToolbarItem> list = new java.util.ArrayList<net.ibizsys.model.control.toolbar.IPSDEToolbarItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.toolbar.IPSDEToolbarItem obj = this.getPSModelObject(net.ibizsys.model.control.toolbar.IPSDEToolbarItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDETOOLBARITEMS);
				if(obj!=null)list.add(obj);
			}
			this.psdetoolbaritems = list;
		}
		return (this.psdetoolbaritems.size() == 0)? null : this.psdetoolbaritems;
	}

	public net.ibizsys.model.control.toolbar.IPSDEToolbarItem getPSDEToolbarItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.toolbar.IPSDEToolbarItem.class, this.getPSDEToolbarItems(), objKey, bTryMode);
	}
	public void setPSDEToolbarItems(java.util.List<net.ibizsys.model.control.toolbar.IPSDEToolbarItem> list){
		this.psdetoolbaritems = list;
	}

	public java.lang.String getToolbarStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTOOLBARSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getXDataControlName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETXDATACONTROLNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
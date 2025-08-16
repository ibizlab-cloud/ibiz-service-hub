package net.ibizsys.model.app.appmenu;



public class PSAppMenuModelImpl extends net.ibizsys.model.control.menu.PSAppMenuImpl implements net.ibizsys.model.app.appmenu.IPSAppMenuModel{

	public final static String ATTR_GETPSAPPMENUITEMS = "getPSAppMenuItems";

	private java.util.List<net.ibizsys.model.control.menu.IPSAppMenuItem> psappmenuitems = null;
	public java.util.List<net.ibizsys.model.control.menu.IPSAppMenuItem> getPSAppMenuItems(){
		if(this.psappmenuitems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPMENUITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.menu.IPSAppMenuItem> list = new java.util.ArrayList<net.ibizsys.model.control.menu.IPSAppMenuItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.menu.IPSAppMenuItem obj = this.getPSModelObject(net.ibizsys.model.control.menu.IPSAppMenuItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPMENUITEMS);
				if(obj!=null)list.add(obj);
			}
			this.psappmenuitems = list;
		}
		return (this.psappmenuitems.size() == 0)? null : this.psappmenuitems;
	}

	public net.ibizsys.model.control.menu.IPSAppMenuItem getPSAppMenuItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.menu.IPSAppMenuItem.class, this.getPSAppMenuItems(), objKey, bTryMode);
	}
	public void setPSAppMenuItems(java.util.List<net.ibizsys.model.control.menu.IPSAppMenuItem> list){
		this.psappmenuitems = list;
	}
}
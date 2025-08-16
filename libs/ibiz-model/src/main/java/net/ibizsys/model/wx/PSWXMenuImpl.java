package net.ibizsys.model.wx;



public class PSWXMenuImpl extends net.ibizsys.model.wx.PSWXAccountObjectImpl implements net.ibizsys.model.wx.IPSWXMenu{

	public final static String ATTR_GETPSWXMENUITEMS = "getPSWXMenuItems";
	public final static String ATTR_ISDEFAULTMENU = "defaultMenu";

	private java.util.List<net.ibizsys.model.wx.IPSWXMenuItem> pswxmenuitems = null;
	public java.util.List<net.ibizsys.model.wx.IPSWXMenuItem> getPSWXMenuItems(){
		if(this.pswxmenuitems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSWXMENUITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.wx.IPSWXMenuItem> list = new java.util.ArrayList<net.ibizsys.model.wx.IPSWXMenuItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.wx.IPSWXMenuItem obj = this.getPSModelObject(net.ibizsys.model.wx.IPSWXMenuItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSWXMENUITEMS);
				if(obj!=null)list.add(obj);
			}
			this.pswxmenuitems = list;
		}
		return (this.pswxmenuitems.size() == 0)? null : this.pswxmenuitems;
	}

	public net.ibizsys.model.wx.IPSWXMenuItem getPSWXMenuItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.wx.IPSWXMenuItem.class, this.getPSWXMenuItems(), objKey, bTryMode);
	}
	public void setPSWXMenuItems(java.util.List<net.ibizsys.model.wx.IPSWXMenuItem> list){
		this.pswxmenuitems = list;
	}

	public boolean isDefaultMenu(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDEFAULTMENU);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
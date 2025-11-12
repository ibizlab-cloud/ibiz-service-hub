package net.ibizsys.model.control.toolbar;



public class PSDETBGroupItemImpl extends net.ibizsys.model.control.toolbar.PSDEToolbarItemImpl implements net.ibizsys.model.control.toolbar.IPSDETBGroupItem
		,net.ibizsys.model.control.toolbar.IPSDECMGroupItem{

	public final static String ATTR_GETACTIONLEVEL = "actionLevel";
	public final static String ATTR_GETBORDERSTYLE = "borderStyle";
	public final static String ATTR_GETBUTTONSTYLE = "buttonStyle";
	public final static String ATTR_GETGROUPEXTRACTMODE = "groupExtractMode";
	public final static String ATTR_GETPSDECONTEXTMENUITEMS = "getPSDEContextMenuItems";
	public final static String ATTR_GETPSDETOOLBARITEMS = "getPSDEToolbarItems";
	public final static String ATTR_GETPSUIACTIONGROUP = "getPSUIActionGroup";
	public final static String ATTR_ISVALID = "valid";

	public int getActionLevel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONLEVEL);
		if(value == null){
			return 100;
		}
		return value.asInt();
	}

	public java.lang.String getBorderStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBORDERSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getButtonStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBUTTONSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getGroupExtractMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPEXTRACTMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.control.toolbar.IPSDEContextMenuItem> psdecontextmenuitems = null;
	public java.util.List<net.ibizsys.model.control.toolbar.IPSDEContextMenuItem> getPSDEContextMenuItems(){
		if(this.psdecontextmenuitems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDECONTEXTMENUITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.toolbar.IPSDEContextMenuItem> list = new java.util.ArrayList<net.ibizsys.model.control.toolbar.IPSDEContextMenuItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.toolbar.IPSDEContextMenuItem obj = this.getPSModelObject(net.ibizsys.model.control.toolbar.IPSDEContextMenuItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDECONTEXTMENUITEMS);
				if(obj!=null)list.add(obj);
			}
			this.psdecontextmenuitems = list;
		}
		return (this.psdecontextmenuitems.size() == 0)? null : this.psdecontextmenuitems;
	}

	public net.ibizsys.model.control.toolbar.IPSDEContextMenuItem getPSDEContextMenuItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.toolbar.IPSDEContextMenuItem.class, this.getPSDEContextMenuItems(), objKey, bTryMode);
	}
	public void setPSDEContextMenuItems(java.util.List<net.ibizsys.model.control.toolbar.IPSDEContextMenuItem> list){
		this.psdecontextmenuitems = list;
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
	private net.ibizsys.model.view.IPSUIActionGroup psuiactiongroup;

	public net.ibizsys.model.view.IPSUIActionGroup getPSUIActionGroup(){
		if(this.psuiactiongroup != null) return this.psuiactiongroup;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSUIACTIONGROUP);
		if(value == null){
			return null;
		}
		this.psuiactiongroup = getPSModelObject(net.ibizsys.model.view.IPSUIActionGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSUIACTIONGROUP);
		return this.psuiactiongroup;
	}

	public net.ibizsys.model.view.IPSUIActionGroup getPSUIActionGroupMust(){
		net.ibizsys.model.view.IPSUIActionGroup value = this.getPSUIActionGroup();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定界面行为组对象");}
		return value;
	}

	public void setPSUIActionGroup(net.ibizsys.model.view.IPSUIActionGroup psuiactiongroup){
		this.psuiactiongroup = psuiactiongroup;
	}


	public boolean isValid(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISVALID);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}
}
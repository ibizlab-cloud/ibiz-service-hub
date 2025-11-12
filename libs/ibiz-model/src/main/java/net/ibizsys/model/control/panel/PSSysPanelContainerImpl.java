package net.ibizsys.model.control.panel;



public class PSSysPanelContainerImpl extends net.ibizsys.model.control.panel.PSSysPanelContainerImplBase implements net.ibizsys.model.control.panel.IPSSysPanelContainer{

	public final static String ATTR_GETACTIONGROUPEXTRACTMODE = "actionGroupExtractMode";
	public final static String ATTR_GETCAPTIONITEMNAME = "captionItemName";
	public final static String ATTR_GETPSPANELITEMS = "getPSPanelItems";
	public final static String ATTR_GETPSUIACTIONGROUP = "getPSUIActionGroup";
	public final static String ATTR_GETPREDEFINEDTYPE = "predefinedType";
	public final static String ATTR_GETTITLEBARCLOSEMODE = "titleBarCloseMode";

	public java.lang.String getActionGroupExtractMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONGROUPEXTRACTMODE);
		if(value == null){
			return "ITEM";
		}
		return value.asText();
	}

	public java.lang.String getCaptionItemName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCAPTIONITEMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.control.panel.IPSPanelItem> pspanelitems = null;
	public java.util.List<net.ibizsys.model.control.panel.IPSPanelItem> getPSPanelItems(){
		if(this.pspanelitems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSPANELITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.panel.IPSPanelItem> list = new java.util.ArrayList<net.ibizsys.model.control.panel.IPSPanelItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.panel.IPSPanelItem obj = this.getPSModelObject(net.ibizsys.model.control.panel.IPSPanelItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSPANELITEMS);
				if(obj!=null)list.add(obj);
			}
			this.pspanelitems = list;
		}
		return (this.pspanelitems.size() == 0)? null : this.pspanelitems;
	}

	public net.ibizsys.model.control.panel.IPSPanelItem getPSPanelItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.panel.IPSPanelItem.class, this.getPSPanelItems(), objKey, bTryMode);
	}
	public void setPSPanelItems(java.util.List<net.ibizsys.model.control.panel.IPSPanelItem> list){
		this.pspanelitems = list;
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


	public java.lang.String getPredefinedType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPREDEFINEDTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getTitleBarCloseMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTITLEBARCLOSEMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
}
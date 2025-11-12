package net.ibizsys.model.control.panel;



public class PSSysPanelButtonListImpl extends net.ibizsys.model.control.panel.PSSysPanelItemImpl implements net.ibizsys.model.control.panel.IPSSysPanelButtonList{

	public final static String ATTR_GETACTIONGROUPEXTRACTMODE = "actionGroupExtractMode";
	public final static String ATTR_GETBUTTONLISTTYPE = "buttonListType";
	public final static String ATTR_GETPSPANELBUTTONS = "getPSPanelButtons";
	public final static String ATTR_GETPSUIACTIONGROUP = "getPSUIActionGroup";
	public final static String ATTR_ISSHOWCAPTION = "showCaption";

	public java.lang.String getActionGroupExtractMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONGROUPEXTRACTMODE);
		if(value == null){
			return "ITEM";
		}
		return value.asText();
	}

	public java.lang.String getButtonListType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBUTTONLISTTYPE);
		if(value == null){
			return "UIACTIONGROUP";
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.control.panel.IPSPanelButton> pspanelbuttons = null;
	public java.util.List<net.ibizsys.model.control.panel.IPSPanelButton> getPSPanelButtons(){
		if(this.pspanelbuttons == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSPANELBUTTONS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.panel.IPSPanelButton> list = new java.util.ArrayList<net.ibizsys.model.control.panel.IPSPanelButton>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.panel.IPSPanelButton obj = this.getPSModelObject(net.ibizsys.model.control.panel.IPSPanelButton.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSPANELBUTTONS);
				if(obj!=null)list.add(obj);
			}
			this.pspanelbuttons = list;
		}
		return (this.pspanelbuttons.size() == 0)? null : this.pspanelbuttons;
	}

	public net.ibizsys.model.control.panel.IPSPanelButton getPSPanelButton(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.panel.IPSPanelButton.class, this.getPSPanelButtons(), objKey, bTryMode);
	}
	public void setPSPanelButtons(java.util.List<net.ibizsys.model.control.panel.IPSPanelButton> list){
		this.pspanelbuttons = list;
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


	@Deprecated
	public boolean isShowCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSHOWCAPTION);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
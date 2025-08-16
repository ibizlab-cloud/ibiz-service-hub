package net.ibizsys.model.control.panel;



public class PSPanelItemGroupLogicImpl extends net.ibizsys.model.control.panel.PSPanelItemLogicImpl implements net.ibizsys.model.control.panel.IPSPanelItemGroupLogic{

	public final static String ATTR_GETGROUPOP = "groupOP";
	public final static String ATTR_GETPSPANELITEMLOGICS = "getPSPanelItemLogics";
	public final static String ATTR_ISNOTMODE = "notMode";

	public java.lang.String getGroupOP(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPOP);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.control.panel.IPSPanelItemLogic> pspanelitemlogics = null;
	public java.util.List<net.ibizsys.model.control.panel.IPSPanelItemLogic> getPSPanelItemLogics(){
		if(this.pspanelitemlogics == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSPANELITEMLOGICS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.panel.IPSPanelItemLogic> list = new java.util.ArrayList<net.ibizsys.model.control.panel.IPSPanelItemLogic>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.panel.IPSPanelItemLogic obj = this.getPSModelObject(net.ibizsys.model.control.panel.IPSPanelItemLogic.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSPANELITEMLOGICS);
				if(obj!=null)list.add(obj);
			}
			this.pspanelitemlogics = list;
		}
		return (this.pspanelitemlogics.size() == 0)? null : this.pspanelitemlogics;
	}

	public net.ibizsys.model.control.panel.IPSPanelItemLogic getPSPanelItemLogic(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.panel.IPSPanelItemLogic.class, this.getPSPanelItemLogics(), objKey, bTryMode);
	}
	public void setPSPanelItemLogics(java.util.List<net.ibizsys.model.control.panel.IPSPanelItemLogic> list){
		this.pspanelitemlogics = list;
	}

	public boolean isNotMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISNOTMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
package net.ibizsys.model.control.drctrl;



public class PSDEDRTabImpl extends net.ibizsys.model.control.drctrl.PSDEDRCtrlImpl implements net.ibizsys.model.control.drctrl.IPSDEDRTab{

	public final static String ATTR_GETPSDEDRCTRLITEMS = "getPSDEDRCtrlItems";
	public final static String ATTR_GETPSDEDRTABPAGES = "getPSDEDRTabPages";

	private java.util.List<net.ibizsys.model.control.drctrl.IPSDEDRCtrlItem> psdedrctrlitems = null;
	public java.util.List<net.ibizsys.model.control.drctrl.IPSDEDRCtrlItem> getPSDEDRCtrlItems(){
		if(this.psdedrctrlitems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDRCTRLITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.drctrl.IPSDEDRCtrlItem> list = new java.util.ArrayList<net.ibizsys.model.control.drctrl.IPSDEDRCtrlItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.drctrl.IPSDEDRCtrlItem obj = this.getPSModelObject(net.ibizsys.model.control.drctrl.IPSDEDRCtrlItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEDRCTRLITEMS);
				if(obj!=null)list.add(obj);
			}
			this.psdedrctrlitems = list;
		}
		return (this.psdedrctrlitems.size() == 0)? null : this.psdedrctrlitems;
	}

	public net.ibizsys.model.control.drctrl.IPSDEDRCtrlItem getPSDEDRCtrlItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.drctrl.IPSDEDRCtrlItem.class, this.getPSDEDRCtrlItems(), objKey, bTryMode);
	}
	public void setPSDEDRCtrlItems(java.util.List<net.ibizsys.model.control.drctrl.IPSDEDRCtrlItem> list){
		this.psdedrctrlitems = list;
	}

	private java.util.List<net.ibizsys.model.control.drctrl.IPSDEDRTabPage> psdedrtabpages = null;
	public java.util.List<net.ibizsys.model.control.drctrl.IPSDEDRTabPage> getPSDEDRTabPages(){
		if(this.psdedrtabpages == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDRTABPAGES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.drctrl.IPSDEDRTabPage> list = new java.util.ArrayList<net.ibizsys.model.control.drctrl.IPSDEDRTabPage>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.drctrl.IPSDEDRTabPage obj = this.getPSModelObject(net.ibizsys.model.control.drctrl.IPSDEDRTabPage.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEDRTABPAGES);
				if(obj!=null)list.add(obj);
			}
			this.psdedrtabpages = list;
		}
		return (this.psdedrtabpages.size() == 0)? null : this.psdedrtabpages;
	}

	public net.ibizsys.model.control.drctrl.IPSDEDRTabPage getPSDEDRTabPage(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.drctrl.IPSDEDRTabPage.class, this.getPSDEDRTabPages(), objKey, bTryMode);
	}
	public void setPSDEDRTabPages(java.util.List<net.ibizsys.model.control.drctrl.IPSDEDRTabPage> list){
		this.psdedrtabpages = list;
	}
}
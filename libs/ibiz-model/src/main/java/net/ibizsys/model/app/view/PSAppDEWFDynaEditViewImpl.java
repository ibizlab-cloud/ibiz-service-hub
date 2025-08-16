package net.ibizsys.model.app.view;



public class PSAppDEWFDynaEditViewImpl extends net.ibizsys.model.app.view.PSAppDEWFEditViewImpl implements net.ibizsys.model.app.view.IPSAppDEWFDynaEditView{

	public final static String ATTR_GETPSUIACTIONGROUPS = "getPSUIActionGroups";

	private java.util.List<net.ibizsys.model.view.IPSUIActionGroup> psuiactiongroups = null;
	public java.util.List<net.ibizsys.model.view.IPSUIActionGroup> getPSUIActionGroups(){
		if(this.psuiactiongroups == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSUIACTIONGROUPS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.view.IPSUIActionGroup> list = new java.util.ArrayList<net.ibizsys.model.view.IPSUIActionGroup>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.view.IPSUIActionGroup obj = this.getPSModelObject(net.ibizsys.model.view.IPSUIActionGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSUIACTIONGROUPS);
				if(obj!=null)list.add(obj);
			}
			this.psuiactiongroups = list;
		}
		return (this.psuiactiongroups.size() == 0)? null : this.psuiactiongroups;
	}

	public net.ibizsys.model.view.IPSUIActionGroup getPSUIActionGroup(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.view.IPSUIActionGroup.class, this.getPSUIActionGroups(), objKey, bTryMode);
	}
	public void setPSUIActionGroups(java.util.List<net.ibizsys.model.view.IPSUIActionGroup> list){
		this.psuiactiongroups = list;
	}
}
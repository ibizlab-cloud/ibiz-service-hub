package net.ibizsys.model.dataentity.logic;



public class PSDEUILogicLinkGroupCondImpl extends net.ibizsys.model.dataentity.logic.PSDEUILogicLinkCondImpl implements net.ibizsys.model.dataentity.logic.IPSDEUILogicLinkGroupCond{

	public final static String ATTR_GETGROUPOP = "groupOP";
	public final static String ATTR_GETPSDEUILOGICLINKCONDS = "getPSDEUILogicLinkConds";
	public final static String ATTR_ISNOTMODE = "notMode";

	public java.lang.String getGroupOP(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPOP);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.dataentity.logic.IPSDEUILogicLinkCond> psdeuilogiclinkconds = null;
	public java.util.List<net.ibizsys.model.dataentity.logic.IPSDEUILogicLinkCond> getPSDEUILogicLinkConds(){
		if(this.psdeuilogiclinkconds == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEUILOGICLINKCONDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.logic.IPSDEUILogicLinkCond> list = new java.util.ArrayList<net.ibizsys.model.dataentity.logic.IPSDEUILogicLinkCond>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.logic.IPSDEUILogicLinkCond obj = this.getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEUILogicLinkCond.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEUILOGICLINKCONDS);
				if(obj!=null)list.add(obj);
			}
			this.psdeuilogiclinkconds = list;
		}
		return (this.psdeuilogiclinkconds.size() == 0)? null : this.psdeuilogiclinkconds;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicLinkCond getPSDEUILogicLinkCond(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEUILogicLinkCond.class, this.getPSDEUILogicLinkConds(), objKey, bTryMode);
	}
	public void setPSDEUILogicLinkConds(java.util.List<net.ibizsys.model.dataentity.logic.IPSDEUILogicLinkCond> list){
		this.psdeuilogiclinkconds = list;
	}

	public boolean isNotMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISNOTMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
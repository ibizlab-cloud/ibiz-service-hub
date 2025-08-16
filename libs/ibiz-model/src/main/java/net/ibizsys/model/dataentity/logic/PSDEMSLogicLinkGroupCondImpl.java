package net.ibizsys.model.dataentity.logic;



public class PSDEMSLogicLinkGroupCondImpl extends net.ibizsys.model.dataentity.logic.PSDEMSLogicLinkCondImpl implements net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkGroupCond{

	public final static String ATTR_GETGROUPOP = "groupOP";
	public final static String ATTR_GETPSDEMSLOGICLINKCONDS = "getPSDEMSLogicLinkConds";
	public final static String ATTR_ISNOTMODE = "notMode";

	public java.lang.String getGroupOP(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPOP);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkCond> psdemslogiclinkconds = null;
	public java.util.List<net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkCond> getPSDEMSLogicLinkConds(){
		if(this.psdemslogiclinkconds == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEMSLOGICLINKCONDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkCond> list = new java.util.ArrayList<net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkCond>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkCond obj = this.getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkCond.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEMSLOGICLINKCONDS);
				if(obj!=null)list.add(obj);
			}
			this.psdemslogiclinkconds = list;
		}
		return (this.psdemslogiclinkconds.size() == 0)? null : this.psdemslogiclinkconds;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkCond getPSDEMSLogicLinkCond(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkCond.class, this.getPSDEMSLogicLinkConds(), objKey, bTryMode);
	}
	public void setPSDEMSLogicLinkConds(java.util.List<net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkCond> list){
		this.psdemslogiclinkconds = list;
	}

	public boolean isNotMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISNOTMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
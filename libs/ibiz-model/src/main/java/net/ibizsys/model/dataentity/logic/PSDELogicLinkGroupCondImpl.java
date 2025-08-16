package net.ibizsys.model.dataentity.logic;



public class PSDELogicLinkGroupCondImpl extends net.ibizsys.model.dataentity.logic.PSDELogicLinkCondImpl implements net.ibizsys.model.dataentity.logic.IPSDELogicLinkGroupCond{

	public final static String ATTR_GETGROUPOP = "groupOP";
	public final static String ATTR_GETPSDELOGICLINKCONDS = "getPSDELogicLinkConds";
	public final static String ATTR_ISNOTMODE = "notMode";

	public java.lang.String getGroupOP(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPOP);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogicLinkCond> psdelogiclinkconds = null;
	public java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogicLinkCond> getPSDELogicLinkConds(){
		if(this.psdelogiclinkconds == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDELOGICLINKCONDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogicLinkCond> list = new java.util.ArrayList<net.ibizsys.model.dataentity.logic.IPSDELogicLinkCond>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.logic.IPSDELogicLinkCond obj = this.getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDELogicLinkCond.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDELOGICLINKCONDS);
				if(obj!=null)list.add(obj);
			}
			this.psdelogiclinkconds = list;
		}
		return (this.psdelogiclinkconds.size() == 0)? null : this.psdelogiclinkconds;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogicLinkCond getPSDELogicLinkCond(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDELogicLinkCond.class, this.getPSDELogicLinkConds(), objKey, bTryMode);
	}
	public void setPSDELogicLinkConds(java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogicLinkCond> list){
		this.psdelogiclinkconds = list;
	}

	public boolean isNotMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISNOTMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
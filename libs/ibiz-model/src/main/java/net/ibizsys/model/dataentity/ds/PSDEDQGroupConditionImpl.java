package net.ibizsys.model.dataentity.ds;



public class PSDEDQGroupConditionImpl extends net.ibizsys.model.dataentity.ds.PSDEDQConditionImpl implements net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition{

	public final static String ATTR_GETCONDOP = "condOp";
	public final static String ATTR_GETPSDEDQCONDITIONS = "getPSDEDQConditions";
	public final static String ATTR_ISNOTMODE = "notMode";

	public java.lang.String getCondOp(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONDOP);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQCondition> psdedqconditions = null;
	public java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQCondition> getPSDEDQConditions(){
		if(this.psdedqconditions == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDQCONDITIONS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQCondition> list = new java.util.ArrayList<net.ibizsys.model.dataentity.ds.IPSDEDQCondition>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.ds.IPSDEDQCondition obj = this.getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDQCondition.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEDQCONDITIONS);
				if(obj!=null)list.add(obj);
			}
			this.psdedqconditions = list;
		}
		return (this.psdedqconditions.size() == 0)? null : this.psdedqconditions;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDQCondition getPSDEDQCondition(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDQCondition.class, this.getPSDEDQConditions(), objKey, bTryMode);
	}
	public void setPSDEDQConditions(java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQCondition> list){
		this.psdedqconditions = list;
	}

	public boolean isNotMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISNOTMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
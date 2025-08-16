package net.ibizsys.model.dataentity.dataflow;



public class PSDEDFJoinGroupCondImpl extends net.ibizsys.model.dataentity.dataflow.PSDEDFJoinCondImpl implements net.ibizsys.model.dataentity.dataflow.IPSDEDFJoinGroupCond{

	public final static String ATTR_GETCONDOP = "condOp";
	public final static String ATTR_GETCONDTYPE = "condType";
	public final static String ATTR_GETPSDEDFJOINCONDS = "getPSDEDFJoinConds";
	public final static String ATTR_ISNOTMODE = "notMode";

	public java.lang.String getCondOp(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONDOP);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCondType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONDTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.dataentity.dataflow.IPSDEDFJoinCond> psdedfjoinconds = null;
	public java.util.List<net.ibizsys.model.dataentity.dataflow.IPSDEDFJoinCond> getPSDEDFJoinConds(){
		if(this.psdedfjoinconds == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDFJOINCONDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.dataflow.IPSDEDFJoinCond> list = new java.util.ArrayList<net.ibizsys.model.dataentity.dataflow.IPSDEDFJoinCond>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.dataflow.IPSDEDFJoinCond obj = this.getPSModelObject(net.ibizsys.model.dataentity.dataflow.IPSDEDFJoinCond.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEDFJOINCONDS);
				if(obj!=null)list.add(obj);
			}
			this.psdedfjoinconds = list;
		}
		return (this.psdedfjoinconds.size() == 0)? null : this.psdedfjoinconds;
	}

	public net.ibizsys.model.dataentity.dataflow.IPSDEDFJoinCond getPSDEDFJoinCond(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.dataflow.IPSDEDFJoinCond.class, this.getPSDEDFJoinConds(), objKey, bTryMode);
	}
	public void setPSDEDFJoinConds(java.util.List<net.ibizsys.model.dataentity.dataflow.IPSDEDFJoinCond> list){
		this.psdedfjoinconds = list;
	}

	public boolean isNotMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISNOTMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
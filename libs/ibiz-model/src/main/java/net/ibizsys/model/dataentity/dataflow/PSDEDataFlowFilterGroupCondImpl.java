package net.ibizsys.model.dataentity.dataflow;



public class PSDEDataFlowFilterGroupCondImpl extends net.ibizsys.model.dataentity.dataflow.PSDEDataFlowFilterCondImpl implements net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowFilterGroupCond{

	public final static String ATTR_GETCONDOP = "condOp";
	public final static String ATTR_GETCONDTYPE = "condType";
	public final static String ATTR_GETPSDEDATAFLOWFILTERCONDS = "getPSDEDataFlowFilterConds";
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

	private java.util.List<net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowFilterCond> psdedataflowfilterconds = null;
	public java.util.List<net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowFilterCond> getPSDEDataFlowFilterConds(){
		if(this.psdedataflowfilterconds == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATAFLOWFILTERCONDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowFilterCond> list = new java.util.ArrayList<net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowFilterCond>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowFilterCond obj = this.getPSModelObject(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowFilterCond.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEDATAFLOWFILTERCONDS);
				if(obj!=null)list.add(obj);
			}
			this.psdedataflowfilterconds = list;
		}
		return (this.psdedataflowfilterconds.size() == 0)? null : this.psdedataflowfilterconds;
	}

	public net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowFilterCond getPSDEDataFlowFilterCond(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowFilterCond.class, this.getPSDEDataFlowFilterConds(), objKey, bTryMode);
	}
	public void setPSDEDataFlowFilterConds(java.util.List<net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowFilterCond> list){
		this.psdedataflowfilterconds = list;
	}

	public boolean isNotMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISNOTMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
package net.ibizsys.model.dataentity.defield.valuerule;



public class PSDEFVRGroupConditionImpl extends net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRConditionImpl implements net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRGroupCondition{

	public final static String ATTR_GETCONDOP = "condOp";
	public final static String ATTR_GETPSDEFVRCONDITIONS = "getPSDEFVRConditions";

	public java.lang.String getCondOp(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONDOP);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRCondition> psdefvrconditions = null;
	public java.util.List<net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRCondition> getPSDEFVRConditions(){
		if(this.psdefvrconditions == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFVRCONDITIONS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRCondition> list = new java.util.ArrayList<net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRCondition>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRCondition obj = this.getPSModelObject(net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRCondition.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEFVRCONDITIONS);
				if(obj!=null)list.add(obj);
			}
			this.psdefvrconditions = list;
		}
		return (this.psdefvrconditions.size() == 0)? null : this.psdefvrconditions;
	}

	public net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRCondition getPSDEFVRCondition(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRCondition.class, this.getPSDEFVRConditions(), objKey, bTryMode);
	}
	public void setPSDEFVRConditions(java.util.List<net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRCondition> list){
		this.psdefvrconditions = list;
	}
}
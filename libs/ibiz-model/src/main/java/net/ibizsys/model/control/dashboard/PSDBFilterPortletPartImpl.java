package net.ibizsys.model.control.dashboard;



public class PSDBFilterPortletPartImpl extends net.ibizsys.model.control.dashboard.PSDBSysPortletPartImpl implements net.ibizsys.model.control.dashboard.IPSDBFilterPortletPart{

	public final static String ATTR_GETFILTERPSDEDQCONDITIONS = "getFilterPSDEDQConditions";

	private java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQCondition> filterpsdedqconditions = null;
	public java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQCondition> getFilterPSDEDQConditions(){
		if(this.filterpsdedqconditions == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFILTERPSDEDQCONDITIONS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQCondition> list = new java.util.ArrayList<net.ibizsys.model.dataentity.ds.IPSDEDQCondition>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.ds.IPSDEDQCondition obj = this.getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDQCondition.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETFILTERPSDEDQCONDITIONS);
				if(obj!=null)list.add(obj);
			}
			this.filterpsdedqconditions = list;
		}
		return (this.filterpsdedqconditions.size() == 0)? null : this.filterpsdedqconditions;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDQCondition getFilterPSDEDQCondition(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDQCondition.class, this.getFilterPSDEDQConditions(), objKey, bTryMode);
	}
	
	public void setFilterPSDEDQConditions(java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQCondition> list){
		this.filterpsdedqconditions = list;
	}
}
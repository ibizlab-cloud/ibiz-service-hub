package net.ibizsys.model.dataentity.action;



public class PSDEActionGroupImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.action.IPSDEActionGroup{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCODENAME2 = "codeName2";
	public final static String ATTR_GETGROUPTAG = "groupTag";
	public final static String ATTR_GETGROUPTAG2 = "groupTag2";
	public final static String ATTR_GETPSDEACTIONGROUPDETAILS = "getPSDEActionGroupDetails";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCodeName2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getGroupTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getGroupTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionGroupDetail> psdeactiongroupdetails = null;
	public java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionGroupDetail> getPSDEActionGroupDetails(){
		if(this.psdeactiongroupdetails == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEACTIONGROUPDETAILS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionGroupDetail> list = new java.util.ArrayList<net.ibizsys.model.dataentity.action.IPSDEActionGroupDetail>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.action.IPSDEActionGroupDetail obj = this.getPSModelObject(net.ibizsys.model.dataentity.action.IPSDEActionGroupDetail.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEACTIONGROUPDETAILS);
				if(obj!=null)list.add(obj);
			}
			this.psdeactiongroupdetails = list;
		}
		return (this.psdeactiongroupdetails.size() == 0)? null : this.psdeactiongroupdetails;
	}

	public net.ibizsys.model.dataentity.action.IPSDEActionGroupDetail getPSDEActionGroupDetail(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.action.IPSDEActionGroupDetail.class, this.getPSDEActionGroupDetails(), objKey, bTryMode);
	}
	public void setPSDEActionGroupDetails(java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionGroupDetail> list){
		this.psdeactiongroupdetails = list;
	}
}
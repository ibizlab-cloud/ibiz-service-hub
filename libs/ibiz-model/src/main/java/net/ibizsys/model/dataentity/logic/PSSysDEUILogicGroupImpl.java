package net.ibizsys.model.dataentity.logic;



public class PSSysDEUILogicGroupImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.app.dataentity.IPSAppDEUILogicGroup{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETEXTENDMODE = "extendMode";
	public final static String ATTR_GETPSAPPDEUILOGICGROUPDETAILS = "getPSAppDEUILogicGroupDetails";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public int getExtendMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXTENDMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	private java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUILogicGroupDetail> psappdeuilogicgroupdetails = null;
	public java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUILogicGroupDetail> getPSAppDEUILogicGroupDetails(){
		if(this.psappdeuilogicgroupdetails == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEUILOGICGROUPDETAILS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUILogicGroupDetail> list = new java.util.ArrayList<net.ibizsys.model.app.dataentity.IPSAppDEUILogicGroupDetail>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.dataentity.IPSAppDEUILogicGroupDetail obj = this.getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEUILogicGroupDetail.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPDEUILOGICGROUPDETAILS);
				if(obj!=null)list.add(obj);
			}
			this.psappdeuilogicgroupdetails = list;
		}
		return (this.psappdeuilogicgroupdetails.size() == 0)? null : this.psappdeuilogicgroupdetails;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEUILogicGroupDetail getPSAppDEUILogicGroupDetail(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEUILogicGroupDetail.class, this.getPSAppDEUILogicGroupDetails(), objKey, bTryMode);
	}
	public void setPSAppDEUILogicGroupDetails(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUILogicGroupDetail> list){
		this.psappdeuilogicgroupdetails = list;
	}
}
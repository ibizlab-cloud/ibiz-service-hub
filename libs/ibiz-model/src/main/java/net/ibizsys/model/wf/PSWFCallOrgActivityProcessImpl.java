package net.ibizsys.model.wf;



public class PSWFCallOrgActivityProcessImpl extends net.ibizsys.model.wf.PSWFCallActivityProcessImplBase implements net.ibizsys.model.wf.IPSWFCallOrgActivityProcess{

	public final static String ATTR_GETPSWFPROCESSROLES = "getPSWFProcessRoles";

	private java.util.List<net.ibizsys.model.wf.IPSWFProcessRole> pswfprocessroles = null;
	public java.util.List<net.ibizsys.model.wf.IPSWFProcessRole> getPSWFProcessRoles(){
		if(this.pswfprocessroles == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSWFPROCESSROLES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.wf.IPSWFProcessRole> list = new java.util.ArrayList<net.ibizsys.model.wf.IPSWFProcessRole>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.wf.IPSWFProcessRole obj = this.getPSModelObject(net.ibizsys.model.wf.IPSWFProcessRole.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSWFPROCESSROLES);
				if(obj!=null)list.add(obj);
			}
			this.pswfprocessroles = list;
		}
		return (this.pswfprocessroles.size() == 0)? null : this.pswfprocessroles;
	}

	public net.ibizsys.model.wf.IPSWFProcessRole getPSWFProcessRole(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.wf.IPSWFProcessRole.class, this.getPSWFProcessRoles(), objKey, bTryMode);
	}
	public void setPSWFProcessRoles(java.util.List<net.ibizsys.model.wf.IPSWFProcessRole> list){
		this.pswfprocessroles = list;
	}
}
package net.ibizsys.model.wf;



public class PSWFLinkRoleImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.wf.IPSWFLinkRole{

	public final static String ATTR_GETPSSYSMSGTEMPL = "getPSSysMsgTempl";
	public final static String ATTR_GETPSWFPROCESSROLE = "getPSWFProcessRole";
	private net.ibizsys.model.msg.IPSSysMsgTempl pssysmsgtempl;

	public net.ibizsys.model.msg.IPSSysMsgTempl getPSSysMsgTempl(){
		if(this.pssysmsgtempl != null) return this.pssysmsgtempl;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSMSGTEMPL);
		if(value == null){
			return null;
		}
		this.pssysmsgtempl = getPSModelObject(net.ibizsys.model.msg.IPSSysMsgTempl.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSMSGTEMPL);
		return this.pssysmsgtempl;
	}

	public net.ibizsys.model.msg.IPSSysMsgTempl getPSSysMsgTemplMust(){
		net.ibizsys.model.msg.IPSSysMsgTempl value = this.getPSSysMsgTempl();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定通知消息模板");}
		return value;
	}

	public void setPSSysMsgTempl(net.ibizsys.model.msg.IPSSysMsgTempl pssysmsgtempl){
		this.pssysmsgtempl = pssysmsgtempl;
	}

	private net.ibizsys.model.wf.IPSWFProcessRole pswfprocessrole;

	public net.ibizsys.model.wf.IPSWFProcessRole getPSWFProcessRole(){
		if(this.pswfprocessrole != null) return this.pswfprocessrole;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSWFPROCESSROLE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.wf.IPSWFInteractiveLink ipswfinteractivelink = getParentPSModelObject(net.ibizsys.model.wf.IPSWFInteractiveLink.class);
		this.pswfprocessrole = ipswfinteractivelink.getFromPSWFProcessMust().getPSWFProcessRole(value, false);
		return this.pswfprocessrole;
	}

	public net.ibizsys.model.wf.IPSWFProcessRole getPSWFProcessRoleMust(){
		net.ibizsys.model.wf.IPSWFProcessRole value = this.getPSWFProcessRole();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定流程处理角色");}
		return value;
	}

	public void setPSWFProcessRole(net.ibizsys.model.wf.IPSWFProcessRole pswfprocessrole){
		this.pswfprocessrole = pswfprocessrole;
	}

}
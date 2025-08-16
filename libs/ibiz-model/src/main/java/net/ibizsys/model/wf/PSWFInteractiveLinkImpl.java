package net.ibizsys.model.wf;



public class PSWFInteractiveLinkImpl extends net.ibizsys.model.wf.PSWFLinkImpl implements net.ibizsys.model.wf.IPSWFInteractiveLink{

	public final static String ATTR_GETFORMCODENAME = "formCodeName";
	public final static String ATTR_GETFORMNAME = "formName";
	public final static String ATTR_GETFROMPSWFPROCESS = "getFromPSWFProcess";
	public final static String ATTR_GETMOBFORMCODENAME = "mobFormCodeName";
	public final static String ATTR_GETMOBFORMNAME = "mobFormName";
	public final static String ATTR_GETMOBVIEWCODENAME = "mobViewCodeName";
	public final static String ATTR_GETMOBVIEWNAME = "mobViewName";
	public final static String ATTR_GETNEXTCONDITION = "nextCondition";
	public final static String ATTR_GETPSWFLINKROLES = "getPSWFLinkRoles";
	public final static String ATTR_GETVIEWCODENAME = "viewCodeName";
	public final static String ATTR_GETVIEWNAME = "viewName";

	public java.lang.String getFormCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFORMCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getFormName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFORMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.wf.IPSWFInteractiveProcess frompswfprocess;

	public net.ibizsys.model.wf.IPSWFInteractiveProcess getFromPSWFProcess(){
		if(this.frompswfprocess != null) return this.frompswfprocess;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFROMPSWFPROCESS);
		if(value == null){
			return null;
		}
		net.ibizsys.model.wf.IPSWFVersion ipswfversion = getParentPSModelObject(net.ibizsys.model.wf.IPSWFVersion.class);
		this.frompswfprocess = (net.ibizsys.model.wf.IPSWFInteractiveProcess)ipswfversion.getPSWFProcess(value, false);
		return this.frompswfprocess;
	}

	public net.ibizsys.model.wf.IPSWFInteractiveProcess getFromPSWFProcessMust(){
		net.ibizsys.model.wf.IPSWFInteractiveProcess value = this.getFromPSWFProcess();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定源流程处理");}
		return value;
	}


	public java.lang.String getMobFormCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMOBFORMCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMobFormName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMOBFORMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMobViewCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMOBVIEWCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMobViewName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMOBVIEWNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getNextCondition(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNEXTCONDITION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.wf.IPSWFLinkRole> pswflinkroles = null;
	public java.util.List<net.ibizsys.model.wf.IPSWFLinkRole> getPSWFLinkRoles(){
		if(this.pswflinkroles == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSWFLINKROLES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.wf.IPSWFLinkRole> list = new java.util.ArrayList<net.ibizsys.model.wf.IPSWFLinkRole>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.wf.IPSWFLinkRole obj = this.getPSModelObject(net.ibizsys.model.wf.IPSWFLinkRole.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSWFLINKROLES);
				if(obj!=null)list.add(obj);
			}
			this.pswflinkroles = list;
		}
		return (this.pswflinkroles.size() == 0)? null : this.pswflinkroles;
	}

	public net.ibizsys.model.wf.IPSWFLinkRole getPSWFLinkRole(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.wf.IPSWFLinkRole.class, this.getPSWFLinkRoles(), objKey, bTryMode);
	}
	public void setPSWFLinkRoles(java.util.List<net.ibizsys.model.wf.IPSWFLinkRole> list){
		this.pswflinkroles = list;
	}

	public java.lang.String getViewCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVIEWCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getViewName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVIEWNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
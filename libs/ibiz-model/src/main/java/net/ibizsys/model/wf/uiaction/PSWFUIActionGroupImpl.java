package net.ibizsys.model.wf.uiaction;



public class PSWFUIActionGroupImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.wf.uiaction.IPSWFUIActionGroup
		,net.ibizsys.model.app.wf.IPSAppWFUIActionGroup{

	public final static String ATTR_GETGROUPTAG = "groupTag";
	public final static String ATTR_GETGROUPTAG2 = "groupTag2";
	public final static String ATTR_GETGROUPTAG3 = "groupTag3";
	public final static String ATTR_GETGROUPTAG4 = "groupTag4";
	public final static String ATTR_GETPSUIACTIONGROUPDETAILS = "getPSUIActionGroupDetails";
	public final static String ATTR_GETPSWORKFLOW = "getPSWorkflow";

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

	public java.lang.String getGroupTag3(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPTAG3);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getGroupTag4(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPTAG4);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.view.IPSUIActionGroupDetail> psuiactiongroupdetails = null;
	public java.util.List<net.ibizsys.model.view.IPSUIActionGroupDetail> getPSUIActionGroupDetails(){
		if(this.psuiactiongroupdetails == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSUIACTIONGROUPDETAILS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.view.IPSUIActionGroupDetail> list = new java.util.ArrayList<net.ibizsys.model.view.IPSUIActionGroupDetail>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.view.IPSUIActionGroupDetail obj = this.getPSModelObject(net.ibizsys.model.view.IPSUIActionGroupDetail.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSUIACTIONGROUPDETAILS);
				if(obj!=null)list.add(obj);
			}
			this.psuiactiongroupdetails = list;
		}
		return (this.psuiactiongroupdetails.size() == 0)? null : this.psuiactiongroupdetails;
	}

	public net.ibizsys.model.view.IPSUIActionGroupDetail getPSUIActionGroupDetail(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.view.IPSUIActionGroupDetail.class, this.getPSUIActionGroupDetails(), objKey, bTryMode);
	}
	public void setPSUIActionGroupDetails(java.util.List<net.ibizsys.model.view.IPSUIActionGroupDetail> list){
		this.psuiactiongroupdetails = list;
	}
	private net.ibizsys.model.wf.IPSWorkflow psworkflow;

	public net.ibizsys.model.wf.IPSWorkflow getPSWorkflow(){
		if(this.psworkflow != null) return this.psworkflow;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSWORKFLOW);
		if(value == null){
			return null;
		}
		this.psworkflow = getPSModelObject(net.ibizsys.model.wf.IPSWorkflow.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSWORKFLOW);
		return this.psworkflow;
	}

	public net.ibizsys.model.wf.IPSWorkflow getPSWorkflowMust(){
		net.ibizsys.model.wf.IPSWorkflow value = this.getPSWorkflow();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定工作流对象");}
		return value;
	}

	public void setPSWorkflow(net.ibizsys.model.wf.IPSWorkflow psworkflow){
		this.psworkflow = psworkflow;
	}

}
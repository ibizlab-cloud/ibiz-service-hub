package net.ibizsys.model.app.wf;



public class PSAppWFImpl extends net.ibizsys.model.app.PSApplicationObjectImpl implements net.ibizsys.model.app.wf.IPSAppWF{

	public final static String ATTR_GETALLPSAPPWFUIACTIONS = "getAllPSAppWFUIActions";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETPSAPPWFDES = "getPSAppWFDEs";
	public final static String ATTR_GETPSAPPWFVERS = "getPSAppWFVers";
	public final static String ATTR_GETPSWORKFLOW = "getPSWorkflow";
	public final static String ATTR_HASPSAPPWFVER = "hasPSAppWFVer";

	private java.util.List<net.ibizsys.model.app.wf.IPSAppWFUIAction> allpsappwfuiactions = null;
	public java.util.List<net.ibizsys.model.app.wf.IPSAppWFUIAction> getAllPSAppWFUIActions(){
		if(this.allpsappwfuiactions == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPWFUIACTIONS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.wf.IPSAppWFUIAction> list = new java.util.ArrayList<net.ibizsys.model.app.wf.IPSAppWFUIAction>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.wf.IPSAppWFUIAction obj = this.getPSModelObject(net.ibizsys.model.app.wf.IPSAppWFUIAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPWFUIACTIONS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappwfuiactions = list;
		}
		return (this.allpsappwfuiactions.size() == 0)? null : this.allpsappwfuiactions;
	}

	public net.ibizsys.model.app.wf.IPSAppWFUIAction getPSAppWFUIAction(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.wf.IPSAppWFUIAction.class, this.getAllPSAppWFUIActions(), objKey, bTryMode);
	}
	public void setPSAppWFUIActions(java.util.List<net.ibizsys.model.app.wf.IPSAppWFUIAction> list){
		this.allpsappwfuiactions = list;
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getDynaModelFilePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMODELFILEPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.app.wf.IPSAppWFDE> psappwfdes = null;
	public java.util.List<net.ibizsys.model.app.wf.IPSAppWFDE> getPSAppWFDEs(){
		if(this.psappwfdes == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPWFDES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.wf.IPSAppWFDE> list = new java.util.ArrayList<net.ibizsys.model.app.wf.IPSAppWFDE>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.wf.IPSAppWFDE obj = this.getPSModelObject(net.ibizsys.model.app.wf.IPSAppWFDE.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPWFDES);
				if(obj!=null)list.add(obj);
			}
			this.psappwfdes = list;
		}
		return (this.psappwfdes.size() == 0)? null : this.psappwfdes;
	}

	public net.ibizsys.model.app.wf.IPSAppWFDE getPSAppWFDE(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.wf.IPSAppWFDE.class, this.getPSAppWFDEs(), objKey, bTryMode);
	}
	public void setPSAppWFDEs(java.util.List<net.ibizsys.model.app.wf.IPSAppWFDE> list){
		this.psappwfdes = list;
	}

	private java.util.List<net.ibizsys.model.app.wf.IPSAppWFVer> psappwfvers = null;
	public java.util.List<net.ibizsys.model.app.wf.IPSAppWFVer> getPSAppWFVers(){
		if(this.psappwfvers == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPWFVERS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.wf.IPSAppWFVer> list = new java.util.ArrayList<net.ibizsys.model.app.wf.IPSAppWFVer>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.wf.IPSAppWFVer obj = this.getPSModelObject(net.ibizsys.model.app.wf.IPSAppWFVer.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPWFVERS);
				if(obj!=null)list.add(obj);
			}
			this.psappwfvers = list;
		}
		return (this.psappwfvers.size() == 0)? null : this.psappwfvers;
	}

	public net.ibizsys.model.app.wf.IPSAppWFVer getPSAppWFVer(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.wf.IPSAppWFVer.class, this.getPSAppWFVers(), objKey, bTryMode);
	}
	public void setPSAppWFVers(java.util.List<net.ibizsys.model.app.wf.IPSAppWFVer> list){
		this.psappwfvers = list;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定工作流");}
		return value;
	}

	public void setPSWorkflow(net.ibizsys.model.wf.IPSWorkflow psworkflow){
		this.psworkflow = psworkflow;
	}


	public boolean hasPSAppWFVer(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_HASPSAPPWFVER);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
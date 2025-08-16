package net.ibizsys.model.app.wf;



public class PSAppWFVerImpl extends net.ibizsys.model.app.PSApplicationObjectImpl implements net.ibizsys.model.app.wf.IPSAppWFVer{

	public final static String ATTR_GETALLPSAPPWFUIACTIONS = "getAllPSAppWFUIActions";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETPSAPPWF = "getPSAppWF";
	public final static String ATTR_GETPSWFVERSION = "getPSWFVersion";

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
	private net.ibizsys.model.app.wf.IPSAppWF psappwf;

	public net.ibizsys.model.app.wf.IPSAppWF getPSAppWF(){
		if(this.psappwf != null) return this.psappwf;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPWF);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.IPSApplication ipsapplication = getParentPSModelObject(net.ibizsys.model.app.IPSApplication.class);
		this.psappwf = ipsapplication.getPSAppWF(value, false);
		return this.psappwf;
	}

	public net.ibizsys.model.app.wf.IPSAppWF getPSAppWFMust(){
		net.ibizsys.model.app.wf.IPSAppWF value = this.getPSAppWF();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用工作流");}
		return value;
	}

	public void setPSAppWF(net.ibizsys.model.app.wf.IPSAppWF psappwf){
		this.psappwf = psappwf;
	}

	private net.ibizsys.model.wf.IPSWFVersion pswfversion;

	public net.ibizsys.model.wf.IPSWFVersion getPSWFVersion(){
		if(this.pswfversion != null) return this.pswfversion;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSWFVERSION);
		if(value == null){
			return null;
		}
		this.pswfversion = this.getPSAppWFMust().getPSWorkflowMust().getPSWFVersion(value, false);
		return this.pswfversion;
	}

	public net.ibizsys.model.wf.IPSWFVersion getPSWFVersionMust(){
		net.ibizsys.model.wf.IPSWFVersion value = this.getPSWFVersion();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定工作流版本");}
		return value;
	}

	public void setPSWFVersion(net.ibizsys.model.wf.IPSWFVersion pswfversion){
		this.pswfversion = pswfversion;
	}

}
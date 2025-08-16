package net.ibizsys.model.app.wf;



public class PSAppWFUtilUIActionImpl extends net.ibizsys.model.app.PSApplicationObjectImpl implements net.ibizsys.model.app.wf.IPSAppWFUtilUIAction{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETPSAPPUIACTION = "getPSAppUIAction";
	public final static String ATTR_GETPSDEUIACTIONID = "getPSDEUIActionId";
	public final static String ATTR_GETPSWORKFLOWID = "getPSWorkflowId";
	public final static String ATTR_GETUTILTYPE = "utilType";

	@Deprecated
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
	private net.ibizsys.model.app.view.IPSAppUIAction psappuiaction;

	public net.ibizsys.model.app.view.IPSAppUIAction getPSAppUIAction(){
		if(this.psappuiaction != null) return this.psappuiaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPUIACTION);
		if(value == null){
			return null;
		}
		this.psappuiaction = getPSModelObject(net.ibizsys.model.app.view.IPSAppUIAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPUIACTION);
		return this.psappuiaction;
	}

	public net.ibizsys.model.app.view.IPSAppUIAction getPSAppUIActionMust(){
		net.ibizsys.model.app.view.IPSAppUIAction value = this.getPSAppUIAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用界面行为");}
		return value;
	}

	public void setPSAppUIAction(net.ibizsys.model.app.view.IPSAppUIAction psappuiaction){
		this.psappuiaction = psappuiaction;
	}


	@Deprecated
	public java.lang.String getPSDEUIActionId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEUIACTIONID);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getPSWorkflowId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSWORKFLOWID);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUtilType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
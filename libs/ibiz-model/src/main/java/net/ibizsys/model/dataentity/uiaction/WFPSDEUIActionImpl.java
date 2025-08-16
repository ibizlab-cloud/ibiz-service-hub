package net.ibizsys.model.dataentity.uiaction;



public class WFPSDEUIActionImpl extends net.ibizsys.model.dataentity.uiaction.PSDEUIActionImpl implements net.ibizsys.model.app.wf.IPSAppWFUIAction{

	public final static String ATTR_GETPSAPPWF = "getPSAppWF";
	public final static String ATTR_GETPSAPPWFVER = "getPSAppWFVer";
	public final static String ATTR_GETPSWORKFLOW = "getPSWorkflow";
	private net.ibizsys.model.app.wf.IPSAppWF psappwf;

	public net.ibizsys.model.app.wf.IPSAppWF getPSAppWF(){
		if(this.psappwf != null) return this.psappwf;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPWF);
		if(value == null){
			return null;
		}
		this.psappwf = getPSModelObject(net.ibizsys.model.app.wf.IPSAppWF.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPWF);
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

	private net.ibizsys.model.app.wf.IPSAppWFVer psappwfver;

	public net.ibizsys.model.app.wf.IPSAppWFVer getPSAppWFVer(){
		if(this.psappwfver != null) return this.psappwfver;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPWFVER);
		if(value == null){
			return null;
		}
		this.psappwfver = getPSModelObject(net.ibizsys.model.app.wf.IPSAppWFVer.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPWFVER);
		return this.psappwfver;
	}

	public net.ibizsys.model.app.wf.IPSAppWFVer getPSAppWFVerMust(){
		net.ibizsys.model.app.wf.IPSAppWFVer value = this.getPSAppWFVer();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用工作流版本");}
		return value;
	}

	public void setPSAppWFVer(net.ibizsys.model.app.wf.IPSAppWFVer psappwfver){
		this.psappwfver = psappwfver;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统工作流");}
		return value;
	}

	public void setPSWorkflow(net.ibizsys.model.wf.IPSWorkflow psworkflow){
		this.psworkflow = psworkflow;
	}

}
package net.ibizsys.model.dataentity.uiaction;



public class RollbackWFPSDEUIActionImpl extends net.ibizsys.model.dataentity.uiaction.WFPSDEUIActionImpl implements net.ibizsys.model.wf.uiaction.IPSWFUIAction{

	public final static String ATTR_GETPSWORKFLOW = "getPSWorkflow";
	private net.ibizsys.model.wf.IPSWorkflow psworkflow;

	@Deprecated
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "[getPSWorkflow]返回空值");}
		return value;
	}

	public void setPSWorkflow(net.ibizsys.model.wf.IPSWorkflow psworkflow){
		this.psworkflow = psworkflow;
	}

}
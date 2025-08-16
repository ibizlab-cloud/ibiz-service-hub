package net.ibizsys.model.wf;



public abstract class PSWFCallActivityProcessImplBase extends net.ibizsys.model.wf.PSWFProcessImpl implements net.ibizsys.model.wf.IPSWFCallActivityProcess{

	public final static String ATTR_GETMULTIINSTMODE = "multiInstMode";
	public final static String ATTR_GETTARGETPSWF = "getTargetPSWF";

	public java.lang.String getMultiInstMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMULTIINSTMODE);
		if(value == null){
			return "NONE";
		}
		return value.asText();
	}
	private net.ibizsys.model.wf.IPSWorkflow tarpswf;

	public net.ibizsys.model.wf.IPSWorkflow getTargetPSWF(){
		if(this.tarpswf != null) return this.tarpswf;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTARGETPSWF);
		if(value == null){
			return null;
		}
		this.tarpswf = getPSModelObject(net.ibizsys.model.wf.IPSWorkflow.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETTARGETPSWF);
		return this.tarpswf;
	}

	public net.ibizsys.model.wf.IPSWorkflow getTargetPSWFMust(){
		net.ibizsys.model.wf.IPSWorkflow value = this.getTargetPSWF();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定调用目标流程");}
		return value;
	}

}
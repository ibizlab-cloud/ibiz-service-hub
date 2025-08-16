package net.ibizsys.model.dataentity.dataflow;



public class PSDEDFSysDataSyncAgentSourceNodeImpl extends net.ibizsys.model.dataentity.dataflow.PSDEDataFlowSourceNodeImpl implements net.ibizsys.model.dataentity.dataflow.IPSDEDFSysDataSyncAgentSourceNode{

	public final static String ATTR_GETPSSYSDATASYNCAGENT = "getPSSysDataSyncAgent";
	public final static String ATTR_GETSUBTYPE = "subType";
	private net.ibizsys.model.res.IPSSysDataSyncAgent pssysdatasyncagent;

	public net.ibizsys.model.res.IPSSysDataSyncAgent getPSSysDataSyncAgent(){
		if(this.pssysdatasyncagent != null) return this.pssysdatasyncagent;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSDATASYNCAGENT);
		if(value == null){
			return null;
		}
		this.pssysdatasyncagent = getPSModelObject(net.ibizsys.model.res.IPSSysDataSyncAgent.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSDATASYNCAGENT);
		return this.pssysdatasyncagent;
	}

	public net.ibizsys.model.res.IPSSysDataSyncAgent getPSSysDataSyncAgentMust(){
		net.ibizsys.model.res.IPSSysDataSyncAgent value = this.getPSSysDataSyncAgent();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统数据同步代理");}
		return value;
	}

	public void setPSSysDataSyncAgent(net.ibizsys.model.res.IPSSysDataSyncAgent pssysdatasyncagent){
		this.pssysdatasyncagent = pssysdatasyncagent;
	}


	public java.lang.String getSubType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSUBTYPE);
		if(value == null){
			return "RAW";
		}
		return value.asText();
	}
}
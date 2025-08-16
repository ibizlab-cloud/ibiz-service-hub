package net.ibizsys.model.dataentity.logic;



public class PSDESysDataSyncAgentOutLogicImpl extends net.ibizsys.model.dataentity.logic.PSDELogicNodeImpl implements net.ibizsys.model.dataentity.logic.IPSDESysDataSyncAgentOutLogic{

	public final static String ATTR_GETDSTPSDELOGICPARAM = "getDstPSDELogicParam";
	public final static String ATTR_GETPSSYSDATASYNCAGENT = "getPSSysDataSyncAgent";
	private net.ibizsys.model.dataentity.logic.IPSDELogicParam dstpsdelogicparam;

	public net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParam(){
		if(this.dstpsdelogicparam != null) return this.dstpsdelogicparam;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDELOGICPARAM);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.logic.IPSDELogic ipsdelogic = getParentPSModelObject(net.ibizsys.model.dataentity.logic.IPSDELogic.class);
		this.dstpsdelogicparam = ipsdelogic.getPSDELogicParam(value, false);
		return this.dstpsdelogicparam;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogicParam getDstPSDELogicParamMust(){
		net.ibizsys.model.dataentity.logic.IPSDELogicParam value = this.getDstPSDELogicParam();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标逻辑参数对象");}
		return value;
	}

	public void setDstPSDELogicParam(net.ibizsys.model.dataentity.logic.IPSDELogicParam dstpsdelogicparam){
		this.dstpsdelogicparam = dstpsdelogicparam;
	}

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

}
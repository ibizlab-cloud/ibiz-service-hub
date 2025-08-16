package net.ibizsys.model.ai;



public class PSSysAIPipelineWorkerImpl extends net.ibizsys.model.ai.PSSysAIPipelineObjectImpl implements net.ibizsys.model.ai.IPSSysAIPipelineWorker{

	public final static String ATTR_GETPSSYSAIWORKERAGENT = "getPSSysAIWorkerAgent";
	private net.ibizsys.model.ai.IPSSysAIWorkerAgent pssysaiworkeragent;

	public net.ibizsys.model.ai.IPSSysAIWorkerAgent getPSSysAIWorkerAgent(){
		if(this.pssysaiworkeragent != null) return this.pssysaiworkeragent;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSAIWORKERAGENT);
		if(value == null){
			return null;
		}
		net.ibizsys.model.ai.IPSSysAIFactory ipssysaifactory = getParentPSModelObject(net.ibizsys.model.ai.IPSSysAIFactory.class);
		this.pssysaiworkeragent = ipssysaifactory.getPSSysAIWorkerAgent(value, false);
		return this.pssysaiworkeragent;
	}

	public net.ibizsys.model.ai.IPSSysAIWorkerAgent getPSSysAIWorkerAgentMust(){
		net.ibizsys.model.ai.IPSSysAIWorkerAgent value = this.getPSSysAIWorkerAgent();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定AI工作者代理");}
		return value;
	}

	public void setPSSysAIWorkerAgent(net.ibizsys.model.ai.IPSSysAIWorkerAgent pssysaiworkeragent){
		this.pssysaiworkeragent = pssysaiworkeragent;
	}

}
package net.ibizsys.model.ai;



public class PSSysAIPipelineAgentImpl extends net.ibizsys.model.ai.PSSysAIFactoryObjectImpl implements net.ibizsys.model.ai.IPSSysAIPipelineAgent{

	public final static String ATTR_GETAIPLATFORMTYPE = "aIPlatformType";
	public final static String ATTR_GETAGENTPARAMS = "agentParams";
	public final static String ATTR_GETAGENTTAG = "agentTag";
	public final static String ATTR_GETAGENTTAG2 = "agentTag2";
	public final static String ATTR_GETAGENTTYPE = "agentType";
	public final static String ATTR_GETALLPSSYSAIPIPELINEJOBS = "getAllPSSysAIPipelineJobs";
	public final static String ATTR_GETALLPSSYSAIPIPELINEWORKERS = "getAllPSSysAIPipelineWorkers";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETPSDATAENTITY = "getPSDataEntity";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";

	public java.lang.String getAIPlatformType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAIPLATFORMTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getAgentParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAGENTPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getAgentTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAGENTTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAgentTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAGENTTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAgentType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAGENTTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.ai.IPSSysAIPipelineJob> allpssysaipipelinejobs = null;
	public java.util.List<net.ibizsys.model.ai.IPSSysAIPipelineJob> getAllPSSysAIPipelineJobs(){
		if(this.allpssysaipipelinejobs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSAIPIPELINEJOBS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.ai.IPSSysAIPipelineJob> list = new java.util.ArrayList<net.ibizsys.model.ai.IPSSysAIPipelineJob>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.ai.IPSSysAIPipelineJob obj = this.getPSModelObject(net.ibizsys.model.ai.IPSSysAIPipelineJob.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSAIPIPELINEJOBS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysaipipelinejobs = list;
		}
		return (this.allpssysaipipelinejobs.size() == 0)? null : this.allpssysaipipelinejobs;
	}

	public net.ibizsys.model.ai.IPSSysAIPipelineJob getPSSysAIPipelineJob(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.ai.IPSSysAIPipelineJob.class, this.getAllPSSysAIPipelineJobs(), objKey, bTryMode);
	}
	public void setPSSysAIPipelineJobs(java.util.List<net.ibizsys.model.ai.IPSSysAIPipelineJob> list){
		this.allpssysaipipelinejobs = list;
	}

	private java.util.List<net.ibizsys.model.ai.IPSSysAIPipelineWorker> allpssysaipipelineworkers = null;
	public java.util.List<net.ibizsys.model.ai.IPSSysAIPipelineWorker> getAllPSSysAIPipelineWorkers(){
		if(this.allpssysaipipelineworkers == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSAIPIPELINEWORKERS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.ai.IPSSysAIPipelineWorker> list = new java.util.ArrayList<net.ibizsys.model.ai.IPSSysAIPipelineWorker>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.ai.IPSSysAIPipelineWorker obj = this.getPSModelObject(net.ibizsys.model.ai.IPSSysAIPipelineWorker.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSAIPIPELINEWORKERS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysaipipelineworkers = list;
		}
		return (this.allpssysaipipelineworkers.size() == 0)? null : this.allpssysaipipelineworkers;
	}

	public net.ibizsys.model.ai.IPSSysAIPipelineWorker getPSSysAIPipelineWorker(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.ai.IPSSysAIPipelineWorker.class, this.getAllPSSysAIPipelineWorkers(), objKey, bTryMode);
	}
	public void setPSSysAIPipelineWorkers(java.util.List<net.ibizsys.model.ai.IPSSysAIPipelineWorker> list){
		this.allpssysaipipelineworkers = list;
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.IPSDataEntity psdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity(){
		if(this.psdataentity != null) return this.psdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.psdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDATAENTITY);
		return this.psdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体对象");}
		return value;
	}

	public void setPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity psdataentity){
		this.psdataentity = psdataentity;
	}

	private net.ibizsys.model.res.IPSSysSFPlugin pssyssfplugin;

	public net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin(){
		if(this.pssyssfplugin != null) return this.pssyssfplugin;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSSFPLUGIN);
		if(value == null){
			return null;
		}
		this.pssyssfplugin = getPSModelObject(net.ibizsys.model.res.IPSSysSFPlugin.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSSFPLUGIN);
		return this.pssyssfplugin;
	}

	public net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPluginMust(){
		net.ibizsys.model.res.IPSSysSFPlugin value = this.getPSSysSFPlugin();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定后台扩展插件");}
		return value;
	}

	public void setPSSysSFPlugin(net.ibizsys.model.res.IPSSysSFPlugin pssyssfplugin){
		this.pssyssfplugin = pssyssfplugin;
	}

}
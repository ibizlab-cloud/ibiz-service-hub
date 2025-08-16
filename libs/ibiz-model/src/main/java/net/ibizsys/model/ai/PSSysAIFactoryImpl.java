package net.ibizsys.model.ai;



public class PSSysAIFactoryImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.ai.IPSSysAIFactory{

	public final static String ATTR_GETAIFACTORYPARAMS = "aIFactoryParams";
	public final static String ATTR_GETAIFACTORYTAG = "aIFactoryTag";
	public final static String ATTR_GETAIFACTORYTAG2 = "aIFactoryTag2";
	public final static String ATTR_GETAIFACTORYTYPE = "aIFactoryType";
	public final static String ATTR_GETALLPSSYSAICHATAGENTS = "getAllPSSysAIChatAgents";
	public final static String ATTR_GETALLPSSYSAIPIPELINEAGENTS = "getAllPSSysAIPipelineAgents";
	public final static String ATTR_GETALLPSSYSAIWORKERAGENTS = "getAllPSSysAIWorkerAgents";
	public final static String ATTR_GETAUTHACCESSTOKENURL = "authAccessTokenUrl";
	public final static String ATTR_GETAUTHCLIENTID = "authClientId";
	public final static String ATTR_GETAUTHCLIENTSECRET = "authClientSecret";
	public final static String ATTR_GETAUTHMODE = "authMode";
	public final static String ATTR_GETAUTHPARAM = "authParam";
	public final static String ATTR_GETAUTHPARAM2 = "authParam2";
	public final static String ATTR_GETAUTHTIMEOUT = "authTimeout";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETPSSYSRESOURCE = "getPSSysResource";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";
	public final static String ATTR_GETSERVICEPARAM = "serviceParam";
	public final static String ATTR_GETSERVICEPARAM2 = "serviceParam2";
	public final static String ATTR_GETSERVICEPATH = "servicePath";

	public com.fasterxml.jackson.databind.node.ObjectNode getAIFactoryParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAIFACTORYPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getAIFactoryTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAIFACTORYTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAIFactoryTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAIFACTORYTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAIFactoryType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAIFACTORYTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.ai.IPSSysAIChatAgent> allpssysaichatagents = null;
	public java.util.List<net.ibizsys.model.ai.IPSSysAIChatAgent> getAllPSSysAIChatAgents(){
		if(this.allpssysaichatagents == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSAICHATAGENTS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.ai.IPSSysAIChatAgent> list = new java.util.ArrayList<net.ibizsys.model.ai.IPSSysAIChatAgent>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.ai.IPSSysAIChatAgent obj = this.getPSModelObject(net.ibizsys.model.ai.IPSSysAIChatAgent.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSAICHATAGENTS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysaichatagents = list;
		}
		return (this.allpssysaichatagents.size() == 0)? null : this.allpssysaichatagents;
	}

	public net.ibizsys.model.ai.IPSSysAIChatAgent getPSSysAIChatAgent(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.ai.IPSSysAIChatAgent.class, this.getAllPSSysAIChatAgents(), objKey, bTryMode);
	}
	public void setPSSysAIChatAgents(java.util.List<net.ibizsys.model.ai.IPSSysAIChatAgent> list){
		this.allpssysaichatagents = list;
	}

	private java.util.List<net.ibizsys.model.ai.IPSSysAIPipelineAgent> allpssysaipipelineagents = null;
	public java.util.List<net.ibizsys.model.ai.IPSSysAIPipelineAgent> getAllPSSysAIPipelineAgents(){
		if(this.allpssysaipipelineagents == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSAIPIPELINEAGENTS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.ai.IPSSysAIPipelineAgent> list = new java.util.ArrayList<net.ibizsys.model.ai.IPSSysAIPipelineAgent>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.ai.IPSSysAIPipelineAgent obj = this.getPSModelObject(net.ibizsys.model.ai.IPSSysAIPipelineAgent.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSAIPIPELINEAGENTS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysaipipelineagents = list;
		}
		return (this.allpssysaipipelineagents.size() == 0)? null : this.allpssysaipipelineagents;
	}

	public net.ibizsys.model.ai.IPSSysAIPipelineAgent getPSSysAIPipelineAgent(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.ai.IPSSysAIPipelineAgent.class, this.getAllPSSysAIPipelineAgents(), objKey, bTryMode);
	}
	public void setPSSysAIPipelineAgents(java.util.List<net.ibizsys.model.ai.IPSSysAIPipelineAgent> list){
		this.allpssysaipipelineagents = list;
	}

	private java.util.List<net.ibizsys.model.ai.IPSSysAIWorkerAgent> allpssysaiworkeragents = null;
	public java.util.List<net.ibizsys.model.ai.IPSSysAIWorkerAgent> getAllPSSysAIWorkerAgents(){
		if(this.allpssysaiworkeragents == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSAIWORKERAGENTS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.ai.IPSSysAIWorkerAgent> list = new java.util.ArrayList<net.ibizsys.model.ai.IPSSysAIWorkerAgent>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.ai.IPSSysAIWorkerAgent obj = this.getPSModelObject(net.ibizsys.model.ai.IPSSysAIWorkerAgent.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSAIWORKERAGENTS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysaiworkeragents = list;
		}
		return (this.allpssysaiworkeragents.size() == 0)? null : this.allpssysaiworkeragents;
	}

	public net.ibizsys.model.ai.IPSSysAIWorkerAgent getPSSysAIWorkerAgent(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.ai.IPSSysAIWorkerAgent.class, this.getAllPSSysAIWorkerAgents(), objKey, bTryMode);
	}
	public void setPSSysAIWorkerAgents(java.util.List<net.ibizsys.model.ai.IPSSysAIWorkerAgent> list){
		this.allpssysaiworkeragents = list;
	}

	@Deprecated
	public java.lang.String getAuthAccessTokenUrl(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAUTHACCESSTOKENURL);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAuthClientId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAUTHCLIENTID);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAuthClientSecret(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAUTHCLIENTSECRET);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAuthMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAUTHMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAuthParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAUTHPARAM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAuthParam2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAUTHPARAM2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public int getAuthTimeout(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAUTHTIMEOUT);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSSysResource pssysresource;

	public net.ibizsys.model.res.IPSSysResource getPSSysResource(){
		if(this.pssysresource != null) return this.pssysresource;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSRESOURCE);
		if(value == null){
			return null;
		}
		this.pssysresource = getPSModelObject(net.ibizsys.model.res.IPSSysResource.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSRESOURCE);
		return this.pssysresource;
	}

	public net.ibizsys.model.res.IPSSysResource getPSSysResourceMust(){
		net.ibizsys.model.res.IPSSysResource value = this.getPSSysResource();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统资源对象");}
		return value;
	}

	public void setPSSysResource(net.ibizsys.model.res.IPSSysResource pssysresource){
		this.pssysresource = pssysresource;
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

	private net.ibizsys.model.system.IPSSystemModule pssystemmodule;

	public net.ibizsys.model.system.IPSSystemModule getPSSystemModule(){
		if(this.pssystemmodule != null) return this.pssystemmodule;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSTEMMODULE);
		if(value == null){
			return null;
		}
		this.pssystemmodule = getPSModelObject(net.ibizsys.model.system.IPSSystemModule.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSTEMMODULE);
		return this.pssystemmodule;
	}

	public net.ibizsys.model.system.IPSSystemModule getPSSystemModuleMust(){
		net.ibizsys.model.system.IPSSystemModule value = this.getPSSystemModule();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统模块");}
		return value;
	}

	public void setPSSystemModule(net.ibizsys.model.system.IPSSystemModule pssystemmodule){
		this.pssystemmodule = pssystemmodule;
	}


	public java.lang.String getServiceParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERVICEPARAM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getServiceParam2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERVICEPARAM2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getServicePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERVICEPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
package net.ibizsys.model.ai;



public class PSSysAIWorkerAgentImpl extends net.ibizsys.model.ai.PSSysAIFactoryObjectImpl implements net.ibizsys.model.ai.IPSSysAIWorkerAgent{

	public final static String ATTR_GETAIPLATFORMTYPE = "aIPlatformType";
	public final static String ATTR_GETAGENTPARAMS = "agentParams";
	public final static String ATTR_GETAGENTTAG = "agentTag";
	public final static String ATTR_GETAGENTTAG2 = "agentTag2";
	public final static String ATTR_GETAGENTTYPE = "agentType";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETPSDELOGIC = "getPSDELogic";
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

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.logic.IPSDELogic psdelogic;

	public net.ibizsys.model.dataentity.logic.IPSDELogic getPSDELogic(){
		if(this.psdelogic != null) return this.psdelogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDELOGIC);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.psdelogic = ipsdataentity.getPSDELogic(value, false);
		return this.psdelogic;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogic getPSDELogicMust(){
		net.ibizsys.model.dataentity.logic.IPSDELogic value = this.getPSDELogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体逻辑");}
		return value;
	}

	public void setPSDELogic(net.ibizsys.model.dataentity.logic.IPSDELogic psdelogic){
		this.psdelogic = psdelogic;
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
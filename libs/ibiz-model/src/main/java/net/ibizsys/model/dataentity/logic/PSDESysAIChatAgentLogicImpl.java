package net.ibizsys.model.dataentity.logic;



public class PSDESysAIChatAgentLogicImpl extends net.ibizsys.model.dataentity.logic.PSDELogicNodeImpl implements net.ibizsys.model.dataentity.logic.IPSDESysAIChatAgentLogic{

	public final static String ATTR_GETCATEGORYMODE = "categoryMode";
	public final static String ATTR_GETCATEGORYRERANKTHRESHOLD = "categoryReRankThreshold";
	public final static String ATTR_GETCHATREQUESTAPPENDMODE = "chatRequestAppendMode";
	public final static String ATTR_GETDSTPSDEACTION = "getDstPSDEAction";
	public final static String ATTR_GETDSTPSDEDATASET = "getDstPSDEDataSet";
	public final static String ATTR_GETDSTPSDELOGICPARAM = "getDstPSDELogicParam";
	public final static String ATTR_GETDSTPSDATAENTITY = "getDstPSDataEntity";
	public final static String ATTR_GETHISTORYCOUNT = "historyCount";
	public final static String ATTR_GETKNOWLEDGEBASECOUNT = "knowledgeBaseCount";
	public final static String ATTR_GETMAXSMARTATTEMPTS = "maxSmartAttempts";
	public final static String ATTR_GETMESSAGE = "message";
	public final static String ATTR_GETPSSYSAICHATAGENT = "getPSSysAIChatAgent";
	public final static String ATTR_GETPSSYSAIFACTORY = "getPSSysAIFactory";
	public final static String ATTR_GETPSSYSMSGTEMPL = "getPSSysMsgTempl";
	public final static String ATTR_GETPSSYSSERVICEAPI = "getPSSysServiceAPI";
	public final static String ATTR_GETRERANKTHRESHOLD = "reRankThreshold";
	public final static String ATTR_GETREENTRYLIMIT = "reentryLimit";
	public final static String ATTR_GETRETPSDELOGICPARAM = "getRetPSDELogicParam";
	public final static String ATTR_GETSRCPSDELOGICPARAM = "getSrcPSDELogicParam";
	public final static String ATTR_GETSUBTYPE = "subType";
	public final static String ATTR_GETTITLE = "title";

	public java.lang.String getCategoryMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCATEGORYMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.Double getCategoryReRankThreshold(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCATEGORYRERANKTHRESHOLD);
		if(value == null){
			return null;
		}
		return value.asDouble();
	}

	public java.lang.String getChatRequestAppendMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCHATREQUESTAPPENDMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.action.IPSDEAction dstpsdeaction;

	public net.ibizsys.model.dataentity.action.IPSDEAction getDstPSDEAction(){
		if(this.dstpsdeaction != null) return this.dstpsdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDEACTION);
		if(value == null){
			return null;
		}
		this.dstpsdeaction = this.getDstPSDataEntityMust().getPSDEAction(value, false);
		return this.dstpsdeaction;
	}

	public net.ibizsys.model.dataentity.action.IPSDEAction getDstPSDEActionMust(){
		net.ibizsys.model.dataentity.action.IPSDEAction value = this.getDstPSDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标实体行为对象");}
		return value;
	}

	public void setDstPSDEAction(net.ibizsys.model.dataentity.action.IPSDEAction dstpsdeaction){
		this.dstpsdeaction = dstpsdeaction;
	}

	private net.ibizsys.model.dataentity.ds.IPSDEDataSet dstpsdedataset;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getDstPSDEDataSet(){
		if(this.dstpsdedataset != null) return this.dstpsdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDEDATASET);
		if(value == null){
			return null;
		}
		this.dstpsdedataset = this.getDstPSDataEntityMust().getPSDEDataSet(value, false);
		return this.dstpsdedataset;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getDstPSDEDataSetMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getDstPSDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标实体数据集对象");}
		return value;
	}

	public void setDstPSDEDataSet(net.ibizsys.model.dataentity.ds.IPSDEDataSet dstpsdedataset){
		this.dstpsdedataset = dstpsdedataset;
	}

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

	private net.ibizsys.model.dataentity.IPSDataEntity dstpsdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getDstPSDataEntity(){
		if(this.dstpsdataentity != null) return this.dstpsdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.dstpsdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETDSTPSDATAENTITY);
		return this.dstpsdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getDstPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getDstPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标实体对象");}
		return value;
	}

	public void setDstPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity dstpsdataentity){
		this.dstpsdataentity = dstpsdataentity;
	}


	public int getHistoryCount(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHISTORYCOUNT);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public int getKnowledgeBaseCount(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETKNOWLEDGEBASECOUNT);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public java.lang.Integer getMaxSmartAttempts(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAXSMARTATTEMPTS);
		if(value == null){
			return null;
		}
		return value.asInt();
	}

	public java.lang.String getMessage(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMESSAGE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.ai.IPSSysAIChatAgent pssysaichatagent;

	public net.ibizsys.model.ai.IPSSysAIChatAgent getPSSysAIChatAgent(){
		if(this.pssysaichatagent != null) return this.pssysaichatagent;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSAICHATAGENT);
		if(value == null){
			return null;
		}
		net.ibizsys.model.ai.IPSSysAIFactory ipssysaifactory = this.getPSSysAIFactoryMust();
		this.pssysaichatagent = ipssysaifactory.getPSSysAIChatAgent(value, false);
		return this.pssysaichatagent;
	}

	public net.ibizsys.model.ai.IPSSysAIChatAgent getPSSysAIChatAgentMust(){
		net.ibizsys.model.ai.IPSSysAIChatAgent value = this.getPSSysAIChatAgent();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定AI交谈代理");}
		return value;
	}

	public void setPSSysAIChatAgent(net.ibizsys.model.ai.IPSSysAIChatAgent pssysaichatagent){
		this.pssysaichatagent = pssysaichatagent;
	}

	private net.ibizsys.model.ai.IPSSysAIFactory pssysaifactory;

	public net.ibizsys.model.ai.IPSSysAIFactory getPSSysAIFactory(){
		if(this.pssysaifactory != null) return this.pssysaifactory;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSAIFACTORY);
		if(value == null){
			return null;
		}
		this.pssysaifactory = getPSModelObject(net.ibizsys.model.ai.IPSSysAIFactory.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSAIFACTORY);
		return this.pssysaifactory;
	}

	public net.ibizsys.model.ai.IPSSysAIFactory getPSSysAIFactoryMust(){
		net.ibizsys.model.ai.IPSSysAIFactory value = this.getPSSysAIFactory();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定AI工厂");}
		return value;
	}

	public void setPSSysAIFactory(net.ibizsys.model.ai.IPSSysAIFactory pssysaifactory){
		this.pssysaifactory = pssysaifactory;
	}

	private net.ibizsys.model.msg.IPSSysMsgTempl pssysmsgtempl;

	public net.ibizsys.model.msg.IPSSysMsgTempl getPSSysMsgTempl(){
		if(this.pssysmsgtempl != null) return this.pssysmsgtempl;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSMSGTEMPL);
		if(value == null){
			return null;
		}
		this.pssysmsgtempl = getPSModelObject(net.ibizsys.model.msg.IPSSysMsgTempl.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSMSGTEMPL);
		return this.pssysmsgtempl;
	}

	public net.ibizsys.model.msg.IPSSysMsgTempl getPSSysMsgTemplMust(){
		net.ibizsys.model.msg.IPSSysMsgTempl value = this.getPSSysMsgTempl();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定消息模板");}
		return value;
	}

	public void setPSSysMsgTempl(net.ibizsys.model.msg.IPSSysMsgTempl pssysmsgtempl){
		this.pssysmsgtempl = pssysmsgtempl;
	}

	private net.ibizsys.model.service.IPSSysServiceAPI pssysserviceapi;

	public net.ibizsys.model.service.IPSSysServiceAPI getPSSysServiceAPI(){
		if(this.pssysserviceapi != null) return this.pssysserviceapi;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSSERVICEAPI);
		if(value == null){
			return null;
		}
		this.pssysserviceapi = getPSModelObject(net.ibizsys.model.service.IPSSysServiceAPI.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSSERVICEAPI);
		return this.pssysserviceapi;
	}

	public net.ibizsys.model.service.IPSSysServiceAPI getPSSysServiceAPIMust(){
		net.ibizsys.model.service.IPSSysServiceAPI value = this.getPSSysServiceAPI();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定调用服务接口");}
		return value;
	}

	public void setPSSysServiceAPI(net.ibizsys.model.service.IPSSysServiceAPI pssysserviceapi){
		this.pssysserviceapi = pssysserviceapi;
	}


	public java.lang.Double getReRankThreshold(){
		return this.getCategoryReRankThreshold();
	}

	public java.lang.Integer getReentryLimit(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREENTRYLIMIT);
		if(value == null){
			return null;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.logic.IPSDELogicParam retpsdelogicparam;

	public net.ibizsys.model.dataentity.logic.IPSDELogicParam getRetPSDELogicParam(){
		if(this.retpsdelogicparam != null) return this.retpsdelogicparam;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRETPSDELOGICPARAM);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.logic.IPSDELogic ipsdelogic = getParentPSModelObject(net.ibizsys.model.dataentity.logic.IPSDELogic.class);
		this.retpsdelogicparam = ipsdelogic.getPSDELogicParam(value, false);
		return this.retpsdelogicparam;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogicParam getRetPSDELogicParamMust(){
		net.ibizsys.model.dataentity.logic.IPSDELogicParam value = this.getRetPSDELogicParam();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定返回值绑定逻辑参数对象");}
		return value;
	}

	public void setRetPSDELogicParam(net.ibizsys.model.dataentity.logic.IPSDELogicParam retpsdelogicparam){
		this.retpsdelogicparam = retpsdelogicparam;
	}

	private net.ibizsys.model.dataentity.logic.IPSDELogicParam srcpsdelogicparam;

	public net.ibizsys.model.dataentity.logic.IPSDELogicParam getSrcPSDELogicParam(){
		if(this.srcpsdelogicparam != null) return this.srcpsdelogicparam;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCPSDELOGICPARAM);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.logic.IPSDELogic ipsdelogic = getParentPSModelObject(net.ibizsys.model.dataentity.logic.IPSDELogic.class);
		this.srcpsdelogicparam = ipsdelogic.getPSDELogicParam(value, false);
		return this.srcpsdelogicparam;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogicParam getSrcPSDELogicParamMust(){
		net.ibizsys.model.dataentity.logic.IPSDELogicParam value = this.getSrcPSDELogicParam();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定源逻辑参数对象");}
		return value;
	}

	public void setSrcPSDELogicParam(net.ibizsys.model.dataentity.logic.IPSDELogicParam srcpsdelogicparam){
		this.srcpsdelogicparam = srcpsdelogicparam;
	}


	public java.lang.String getSubType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSUBTYPE);
		if(value == null){
			return "DEFAULT";
		}
		return value.asText();
	}

	public java.lang.String getTitle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTITLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
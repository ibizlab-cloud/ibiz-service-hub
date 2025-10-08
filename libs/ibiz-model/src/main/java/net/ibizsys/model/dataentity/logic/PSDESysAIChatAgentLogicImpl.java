package net.ibizsys.model.dataentity.logic;



public class PSDESysAIChatAgentLogicImpl extends net.ibizsys.model.dataentity.logic.PSDELogicNodeImpl implements net.ibizsys.model.dataentity.logic.IPSDESysAIChatAgentLogic{

	public final static String ATTR_GETDSTPSDELOGICPARAM = "getDstPSDELogicParam";
	public final static String ATTR_GETHISTORYCOUNT = "historyCount";
	public final static String ATTR_GETMESSAGE = "message";
	public final static String ATTR_GETPSSYSAICHATAGENT = "getPSSysAIChatAgent";
	public final static String ATTR_GETPSSYSAIFACTORY = "getPSSysAIFactory";
	public final static String ATTR_GETPSSYSMSGTEMPL = "getPSSysMsgTempl";
	public final static String ATTR_GETRETPSDELOGICPARAM = "getRetPSDELogicParam";
	public final static String ATTR_GETSUBTYPE = "subType";
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


	public int getHistoryCount(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHISTORYCOUNT);
		if(value == null){
			return -1;
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


	public java.lang.String getSubType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSUBTYPE);
		if(value == null){
			return "DEFAULT";
		}
		return value.asText();
	}
}
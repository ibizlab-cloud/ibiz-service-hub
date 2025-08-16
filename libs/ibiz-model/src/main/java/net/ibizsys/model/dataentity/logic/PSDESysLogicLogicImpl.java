package net.ibizsys.model.dataentity.logic;



public class PSDESysLogicLogicImpl extends net.ibizsys.model.dataentity.logic.PSDELogicNodeImpl implements net.ibizsys.model.dataentity.logic.IPSDESysLogicLogic{

	public final static String ATTR_GETDSTPSDELOGICPARAM = "getDstPSDELogicParam";
	public final static String ATTR_GETLOGICPARAM = "logicParam";
	public final static String ATTR_GETLOGICPARAM2 = "logicParam2";
	public final static String ATTR_GETPSSYSLOGIC = "getPSSysLogic";
	public final static String ATTR_GETRETPSDELOGICPARAM = "getRetPSDELogicParam";
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


	public java.lang.String getLogicParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICPARAM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getLogicParam2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICPARAM2);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSSysLogic pssyslogic;

	public net.ibizsys.model.res.IPSSysLogic getPSSysLogic(){
		if(this.pssyslogic != null) return this.pssyslogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSLOGIC);
		if(value == null){
			return null;
		}
		this.pssyslogic = getPSModelObject(net.ibizsys.model.res.IPSSysLogic.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSLOGIC);
		return this.pssyslogic;
	}

	public net.ibizsys.model.res.IPSSysLogic getPSSysLogicMust(){
		net.ibizsys.model.res.IPSSysLogic value = this.getPSSysLogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统逻辑对象");}
		return value;
	}

	public void setPSSysLogic(net.ibizsys.model.res.IPSSysLogic pssyslogic){
		this.pssyslogic = pssyslogic;
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

}
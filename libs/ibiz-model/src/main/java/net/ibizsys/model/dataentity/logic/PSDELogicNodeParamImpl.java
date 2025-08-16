package net.ibizsys.model.dataentity.logic;



public class PSDELogicNodeParamImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.logic.IPSDELogicNodeParam
		,net.ibizsys.model.app.dataentity.IPSAppDELogicNodeParam{

	public final static String ATTR_GETAGGMODE = "aggMode";
	public final static String ATTR_GETDSTFIELDNAME = "dstFieldName";
	public final static String ATTR_GETDSTINDEX = "dstIndex";
	public final static String ATTR_GETDSTPSDELOGICPARAM = "getDstPSDELogicParam";
	public final static String ATTR_GETDSTSORTDIR = "dstSortDir";
	public final static String ATTR_GETEXPRESSION = "expression";
	public final static String ATTR_GETPSSYSSEQUENCE = "getPSSysSequence";
	public final static String ATTR_GETPSSYSTRANSLATOR = "getPSSysTranslator";
	public final static String ATTR_GETPARAMACTION = "paramAction";
	public final static String ATTR_GETPARAMS = "params";
	public final static String ATTR_GETSRCFIELDNAME = "srcFieldName";
	public final static String ATTR_GETSRCINDEX = "srcIndex";
	public final static String ATTR_GETSRCPSDELOGICPARAM = "getSrcPSDELogicParam";
	public final static String ATTR_GETSRCSIZE = "srcSize";
	public final static String ATTR_GETSRCVALUE = "srcValue";
	public final static String ATTR_GETSRCVALUESTDDATATYPE = "srcValueStdDataType";
	public final static String ATTR_GETSRCVALUETYPE = "srcValueType";
	public final static String ATTR_ISOUTTRANSLATE = "outTranslate";

	public java.lang.String getAggMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAGGMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDstFieldName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTFIELDNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getDstIndex(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTINDEX);
		if(value == null){
			return -1;
		}
		return value.asInt();
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标逻辑参数");}
		return value;
	}

	public void setDstPSDELogicParam(net.ibizsys.model.dataentity.logic.IPSDELogicParam dstpsdelogicparam){
		this.dstpsdelogicparam = dstpsdelogicparam;
	}


	public java.lang.String getDstSortDir(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTSORTDIR);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getExpression(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXPRESSION);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSSysSequence pssyssequence;

	public net.ibizsys.model.res.IPSSysSequence getPSSysSequence(){
		if(this.pssyssequence != null) return this.pssyssequence;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSSEQUENCE);
		if(value == null){
			return null;
		}
		this.pssyssequence = getPSModelObject(net.ibizsys.model.res.IPSSysSequence.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSSEQUENCE);
		return this.pssyssequence;
	}

	public net.ibizsys.model.res.IPSSysSequence getPSSysSequenceMust(){
		net.ibizsys.model.res.IPSSysSequence value = this.getPSSysSequence();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统值序列对象");}
		return value;
	}

	public void setPSSysSequence(net.ibizsys.model.res.IPSSysSequence pssyssequence){
		this.pssyssequence = pssyssequence;
	}

	private net.ibizsys.model.res.IPSSysTranslator pssystranslator;

	public net.ibizsys.model.res.IPSSysTranslator getPSSysTranslator(){
		if(this.pssystranslator != null) return this.pssystranslator;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSTRANSLATOR);
		if(value == null){
			return null;
		}
		this.pssystranslator = getPSModelObject(net.ibizsys.model.res.IPSSysTranslator.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSTRANSLATOR);
		return this.pssystranslator;
	}

	public net.ibizsys.model.res.IPSSysTranslator getPSSysTranslatorMust(){
		net.ibizsys.model.res.IPSSysTranslator value = this.getPSSysTranslator();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统值转换器对象");}
		return value;
	}

	public void setPSSysTranslator(net.ibizsys.model.res.IPSSysTranslator pssystranslator){
		this.pssystranslator = pssystranslator;
	}


	public java.lang.String getParamAction(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAMACTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getSrcFieldName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCFIELDNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getSrcIndex(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCINDEX);
		if(value == null){
			return -1;
		}
		return value.asInt();
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定源逻辑参数");}
		return value;
	}

	public void setSrcPSDELogicParam(net.ibizsys.model.dataentity.logic.IPSDELogicParam srcpsdelogicparam){
		this.srcpsdelogicparam = srcpsdelogicparam;
	}


	public int getSrcSize(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCSIZE);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public java.lang.String getSrcValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getSrcValueStdDataType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCVALUESTDDATATYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getSrcValueType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCVALUETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isOutTranslate(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISOUTTRANSLATE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
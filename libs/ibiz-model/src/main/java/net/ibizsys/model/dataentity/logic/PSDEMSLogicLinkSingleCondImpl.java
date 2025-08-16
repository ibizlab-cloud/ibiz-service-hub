package net.ibizsys.model.dataentity.logic;



public class PSDEMSLogicLinkSingleCondImpl extends net.ibizsys.model.dataentity.logic.PSDEMSLogicLinkCondImpl implements net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkSingleCond{

	public final static String ATTR_GETCONDOP = "condOP";
	public final static String ATTR_GETDSTFIELDNAME = "dstFieldName";
	public final static String ATTR_GETDSTLOGICPARAM = "getDstLogicParam";
	public final static String ATTR_GETPARAMTYPE = "paramType";
	public final static String ATTR_GETPARAMVALUE = "paramValue";
	public final static String ATTR_GETSRCLOGICPARAM = "getSrcLogicParam";
	public final static String ATTR_GETVALUE = "value";

	public java.lang.String getCondOP(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONDOP);
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
	private net.ibizsys.model.dataentity.logic.IPSDELogicParamBase dstlogicparam;

	@Deprecated
	public net.ibizsys.model.dataentity.logic.IPSDELogicParamBase getDstLogicParam(){
		if(this.dstlogicparam != null) return this.dstlogicparam;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTLOGICPARAM);
		if(value == null){
			return null;
		}
		this.dstlogicparam = getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDELogicParamBase.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETDSTLOGICPARAM);
		return this.dstlogicparam;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogicParamBase getDstLogicParamMust(){
		net.ibizsys.model.dataentity.logic.IPSDELogicParamBase value = this.getDstLogicParam();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "[getDstLogicParam]返回空值");}
		return value;
	}

	public void setDstLogicParam(net.ibizsys.model.dataentity.logic.IPSDELogicParamBase dstlogicparam){
		this.dstlogicparam = dstlogicparam;
	}


	public java.lang.String getParamType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAMTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getParamValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAMVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.logic.IPSDELogicParamBase srclogicparam;

	@Deprecated
	public net.ibizsys.model.dataentity.logic.IPSDELogicParamBase getSrcLogicParam(){
		if(this.srclogicparam != null) return this.srclogicparam;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCLOGICPARAM);
		if(value == null){
			return null;
		}
		this.srclogicparam = getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDELogicParamBase.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETSRCLOGICPARAM);
		return this.srclogicparam;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogicParamBase getSrcLogicParamMust(){
		net.ibizsys.model.dataentity.logic.IPSDELogicParamBase value = this.getSrcLogicParam();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "[getSrcLogicParam]返回空值");}
		return value;
	}

	public void setSrcLogicParam(net.ibizsys.model.dataentity.logic.IPSDELogicParamBase srclogicparam){
		this.srclogicparam = srclogicparam;
	}


	public java.lang.String getValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
package net.ibizsys.model.dataentity.logic;



public class PSDEUILogicLinkSingleCondImpl extends net.ibizsys.model.dataentity.logic.PSDEUILogicLinkCondImpl implements net.ibizsys.model.dataentity.logic.IPSDEUILogicLinkSingleCond{

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
	private net.ibizsys.model.dataentity.logic.IPSDEUILogicParam dstlogicparam;

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getDstLogicParam(){
		if(this.dstlogicparam != null) return this.dstlogicparam;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTLOGICPARAM);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.logic.IPSDEUILogic ipsdeuilogic = getParentPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEUILogic.class);
		this.dstlogicparam = ipsdeuilogic.getPSDEUILogicParam(value, false);
		return this.dstlogicparam;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getDstLogicParamMust(){
		net.ibizsys.model.dataentity.logic.IPSDEUILogicParam value = this.getDstLogicParam();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标逻辑参数对象");}
		return value;
	}

	public void setDstLogicParam(net.ibizsys.model.dataentity.logic.IPSDEUILogicParam dstlogicparam){
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
	private net.ibizsys.model.dataentity.logic.IPSDEUILogicParam srclogicparam;

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getSrcLogicParam(){
		if(this.srclogicparam != null) return this.srclogicparam;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCLOGICPARAM);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.logic.IPSDEUILogic ipsdeuilogic = getParentPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEUILogic.class);
		this.srclogicparam = ipsdeuilogic.getPSDEUILogicParam(value, false);
		return this.srclogicparam;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getSrcLogicParamMust(){
		net.ibizsys.model.dataentity.logic.IPSDEUILogicParam value = this.getSrcLogicParam();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定源逻辑参数对象");}
		return value;
	}

	public void setSrcLogicParam(net.ibizsys.model.dataentity.logic.IPSDEUILogicParam srclogicparam){
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
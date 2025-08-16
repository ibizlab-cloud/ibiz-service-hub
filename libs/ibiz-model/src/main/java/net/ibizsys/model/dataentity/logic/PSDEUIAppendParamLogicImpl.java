package net.ibizsys.model.dataentity.logic;



public class PSDEUIAppendParamLogicImpl extends net.ibizsys.model.dataentity.logic.PSDEUILogicNodeImpl implements net.ibizsys.model.dataentity.logic.IPSDEUIAppendParamLogic{

	public final static String ATTR_GETDSTINDEX = "dstIndex";
	public final static String ATTR_GETDSTPSDEUILOGICPARAM = "getDstPSDEUILogicParam";
	public final static String ATTR_GETSRCFIELDNAME = "srcFieldName";
	public final static String ATTR_GETSRCINDEX = "srcIndex";
	public final static String ATTR_GETSRCPSDEUILOGICPARAM = "getSrcPSDEUILogicParam";
	public final static String ATTR_GETSRCSIZE = "srcSize";

	public int getDstIndex(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTINDEX);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.logic.IPSDEUILogicParam dstpsdeuilogicparam;

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getDstPSDEUILogicParam(){
		if(this.dstpsdeuilogicparam != null) return this.dstpsdeuilogicparam;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDEUILOGICPARAM);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.logic.IPSDEUILogic ipsdeuilogic = getParentPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEUILogic.class);
		this.dstpsdeuilogicparam = ipsdeuilogic.getPSDEUILogicParam(value, false);
		return this.dstpsdeuilogicparam;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getDstPSDEUILogicParamMust(){
		net.ibizsys.model.dataentity.logic.IPSDEUILogicParam value = this.getDstPSDEUILogicParam();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标逻辑参数对象");}
		return value;
	}

	public void setDstPSDEUILogicParam(net.ibizsys.model.dataentity.logic.IPSDEUILogicParam dstpsdeuilogicparam){
		this.dstpsdeuilogicparam = dstpsdeuilogicparam;
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
	private net.ibizsys.model.dataentity.logic.IPSDEUILogicParam srcpsdeuilogicparam;

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getSrcPSDEUILogicParam(){
		if(this.srcpsdeuilogicparam != null) return this.srcpsdeuilogicparam;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCPSDEUILOGICPARAM);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.logic.IPSDEUILogic ipsdeuilogic = getParentPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEUILogic.class);
		this.srcpsdeuilogicparam = ipsdeuilogic.getPSDEUILogicParam(value, false);
		return this.srcpsdeuilogicparam;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getSrcPSDEUILogicParamMust(){
		net.ibizsys.model.dataentity.logic.IPSDEUILogicParam value = this.getSrcPSDEUILogicParam();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定源逻辑参数对象");}
		return value;
	}

	public void setSrcPSDEUILogicParam(net.ibizsys.model.dataentity.logic.IPSDEUILogicParam srcpsdeuilogicparam){
		this.srcpsdeuilogicparam = srcpsdeuilogicparam;
	}


	public int getSrcSize(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCSIZE);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}
}
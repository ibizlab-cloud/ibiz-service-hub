package net.ibizsys.model.dataentity.logic;



public class PSDEUICtrlInvokeLogicImpl extends net.ibizsys.model.dataentity.logic.PSDEUILogicNodeImpl implements net.ibizsys.model.dataentity.logic.IPSDEUICtrlInvokeLogic{

	public final static String ATTR_GETINVOKECTRL = "getInvokeCtrl";
	public final static String ATTR_GETINVOKEMETHOD = "invokeMethod";
	public final static String ATTR_GETINVOKEPARAM = "getInvokeParam";
	public final static String ATTR_GETSRCPSDEUILOGICPARAM = "getSrcPSDEUILogicParam";
	private net.ibizsys.model.dataentity.logic.IPSDEUILogicParam invokectrl;

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getInvokeCtrl(){
		if(this.invokectrl != null) return this.invokectrl;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINVOKECTRL);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.logic.IPSDEUILogic ipsdeuilogic = getParentPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEUILogic.class);
		this.invokectrl = ipsdeuilogic.getPSDEUILogicParam(value, false);
		return this.invokectrl;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getInvokeCtrlMust(){
		net.ibizsys.model.dataentity.logic.IPSDEUILogicParam value = this.getInvokeCtrl();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定调用部件");}
		return value;
	}

	public void setInvokeCtrl(net.ibizsys.model.dataentity.logic.IPSDEUILogicParam invokectrl){
		this.invokectrl = invokectrl;
	}


	public java.lang.String getInvokeMethod(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINVOKEMETHOD);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.logic.IPSDEUILogicParam invokeparam;

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getInvokeParam(){
		if(this.invokeparam != null) return this.invokeparam;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINVOKEPARAM);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.logic.IPSDEUILogic ipsdeuilogic = getParentPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEUILogic.class);
		this.invokeparam = ipsdeuilogic.getPSDEUILogicParam(value, false);
		return this.invokeparam;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getInvokeParamMust(){
		net.ibizsys.model.dataentity.logic.IPSDEUILogicParam value = this.getInvokeParam();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定调用参数");}
		return value;
	}

	public void setInvokeParam(net.ibizsys.model.dataentity.logic.IPSDEUILogicParam invokeparam){
		this.invokeparam = invokeparam;
	}

	private net.ibizsys.model.dataentity.logic.IPSDEUILogicParam srcpsdeuilogicparam;

	@Deprecated
	public net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getSrcPSDEUILogicParam(){
		if(this.srcpsdeuilogicparam != null) return this.srcpsdeuilogicparam;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCPSDEUILOGICPARAM);
		if(value == null){
			return null;
		}
		this.srcpsdeuilogicparam = getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEUILogicParam.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETSRCPSDEUILOGICPARAM);
		return this.srcpsdeuilogicparam;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getSrcPSDEUILogicParamMust(){
		net.ibizsys.model.dataentity.logic.IPSDEUILogicParam value = this.getSrcPSDEUILogicParam();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "[getSrcPSDEUILogicParam]返回空值");}
		return value;
	}

	public void setSrcPSDEUILogicParam(net.ibizsys.model.dataentity.logic.IPSDEUILogicParam srcpsdeuilogicparam){
		this.srcpsdeuilogicparam = srcpsdeuilogicparam;
	}

}
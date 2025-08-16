package net.ibizsys.model.dataentity.logic;



public class PSDEUICtrlFireEventLogicImpl extends net.ibizsys.model.dataentity.logic.PSDEUILogicNodeImpl implements net.ibizsys.model.dataentity.logic.IPSDEUICtrlFireEventLogic{

	public final static String ATTR_GETEVENTNAME = "eventName";
	public final static String ATTR_GETEVENTPARAM = "getEventParam";
	public final static String ATTR_GETFIRECTRL = "getFireCtrl";
	public final static String ATTR_GETSRCPSDEUILOGICPARAM = "getSrcPSDEUILogicParam";

	public java.lang.String getEventName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEVENTNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.logic.IPSDEUILogicParam eventparam;

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getEventParam(){
		if(this.eventparam != null) return this.eventparam;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEVENTPARAM);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.logic.IPSDEUILogic ipsdeuilogic = getParentPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEUILogic.class);
		this.eventparam = ipsdeuilogic.getPSDEUILogicParam(value, false);
		return this.eventparam;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getEventParamMust(){
		net.ibizsys.model.dataentity.logic.IPSDEUILogicParam value = this.getEventParam();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定事件参数");}
		return value;
	}

	public void setEventParam(net.ibizsys.model.dataentity.logic.IPSDEUILogicParam eventparam){
		this.eventparam = eventparam;
	}

	private net.ibizsys.model.dataentity.logic.IPSDEUILogicParam firectrl;

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getFireCtrl(){
		if(this.firectrl != null) return this.firectrl;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFIRECTRL);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.logic.IPSDEUILogic ipsdeuilogic = getParentPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEUILogic.class);
		this.firectrl = ipsdeuilogic.getPSDEUILogicParam(value, false);
		return this.firectrl;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getFireCtrlMust(){
		net.ibizsys.model.dataentity.logic.IPSDEUILogicParam value = this.getFireCtrl();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定触发对象");}
		return value;
	}

	public void setFireCtrl(net.ibizsys.model.dataentity.logic.IPSDEUILogicParam firectrl){
		this.firectrl = firectrl;
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
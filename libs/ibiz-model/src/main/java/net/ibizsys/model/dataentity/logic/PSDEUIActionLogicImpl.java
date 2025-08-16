package net.ibizsys.model.dataentity.logic;



public class PSDEUIActionLogicImpl extends net.ibizsys.model.dataentity.logic.PSDEUILogicNodeImpl implements net.ibizsys.model.dataentity.logic.IPSDEUIActionLogic{

	public final static String ATTR_GETDSTPSAPPDEUIACTION = "getDstPSAppDEUIAction";
	public final static String ATTR_GETDSTPSAPPDATAENTITY = "getDstPSAppDataEntity";
	public final static String ATTR_GETDSTPSDEUILOGICPARAM = "getDstPSDEUILogicParam";
	private net.ibizsys.model.app.dataentity.IPSAppDEUIAction dstpsappdeuiaction;

	public net.ibizsys.model.app.dataentity.IPSAppDEUIAction getDstPSAppDEUIAction(){
		if(this.dstpsappdeuiaction != null) return this.dstpsappdeuiaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSAPPDEUIACTION);
		if(value == null){
			return null;
		}
		this.dstpsappdeuiaction = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEUIAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETDSTPSAPPDEUIACTION);
		return this.dstpsappdeuiaction;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEUIAction getDstPSAppDEUIActionMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEUIAction value = this.getDstPSAppDEUIAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定调用应用实体界面行为");}
		return value;
	}

	public void setDstPSAppDEUIAction(net.ibizsys.model.app.dataentity.IPSAppDEUIAction dstpsappdeuiaction){
		this.dstpsappdeuiaction = dstpsappdeuiaction;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDataEntity dstpsappdataentity;

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getDstPSAppDataEntity(){
		if(this.dstpsappdataentity != null) return this.dstpsappdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSAPPDATAENTITY);
		if(value == null){
			return null;
		}
		this.dstpsappdataentity = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETDSTPSAPPDATAENTITY);
		return this.dstpsappdataentity;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getDstPSAppDataEntityMust(){
		net.ibizsys.model.app.dataentity.IPSAppDataEntity value = this.getDstPSAppDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标应用实体对象");}
		return value;
	}

	public void setDstPSAppDataEntity(net.ibizsys.model.app.dataentity.IPSAppDataEntity dstpsappdataentity){
		this.dstpsappdataentity = dstpsappdataentity;
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

}
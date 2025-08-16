package net.ibizsys.model.dataentity.logic;



public class PSDEUIDEDataSetLogicImpl extends net.ibizsys.model.dataentity.logic.PSDEUILogicNodeImpl implements net.ibizsys.model.dataentity.logic.IPSDEUIDEDataSetLogic{

	public final static String ATTR_GETDSTPSAPPDEDATASET = "getDstPSAppDEDataSet";
	public final static String ATTR_GETDSTPSAPPDATAENTITY = "getDstPSAppDataEntity";
	public final static String ATTR_GETDSTPSDEUILOGICPARAM = "getDstPSDEUILogicParam";
	public final static String ATTR_GETRETPSDEUILOGICPARAM = "getRetPSDEUILogicParam";
	private net.ibizsys.model.app.dataentity.IPSAppDEDataSet dstpsappdedataset;

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getDstPSAppDEDataSet(){
		if(this.dstpsappdedataset != null) return this.dstpsappdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSAPPDEDATASET);
		if(value == null){
			return null;
		}
		this.dstpsappdedataset = this.getDstPSAppDataEntityMust().getPSAppDEDataSet(value, false);
		return this.dstpsappdedataset;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getDstPSAppDEDataSetMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEDataSet value = this.getDstPSAppDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体数据集对象");}
		return value;
	}

	public void setDstPSAppDEDataSet(net.ibizsys.model.app.dataentity.IPSAppDEDataSet dstpsappdedataset){
		this.dstpsappdedataset = dstpsappdedataset;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体对象");}
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

	private net.ibizsys.model.dataentity.logic.IPSDEUILogicParam retpsdeuilogicparam;

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getRetPSDEUILogicParam(){
		if(this.retpsdeuilogicparam != null) return this.retpsdeuilogicparam;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRETPSDEUILOGICPARAM);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.logic.IPSDEUILogic ipsdeuilogic = getParentPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEUILogic.class);
		this.retpsdeuilogicparam = ipsdeuilogic.getPSDEUILogicParam(value, false);
		return this.retpsdeuilogicparam;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEUILogicParam getRetPSDEUILogicParamMust(){
		net.ibizsys.model.dataentity.logic.IPSDEUILogicParam value = this.getRetPSDEUILogicParam();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定返回值绑定逻辑参数对象");}
		return value;
	}

	public void setRetPSDEUILogicParam(net.ibizsys.model.dataentity.logic.IPSDEUILogicParam retpsdeuilogicparam){
		this.retpsdeuilogicparam = retpsdeuilogicparam;
	}

}
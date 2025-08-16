package net.ibizsys.model.dataentity.logic;



public class PSDEDELogicLogicImpl extends net.ibizsys.model.dataentity.logic.PSDELogicNodeImpl implements net.ibizsys.model.dataentity.logic.IPSDEDELogicLogic{

	public final static String ATTR_GETDSTPSAPPDELOGIC = "getDstPSAppDELogic";
	public final static String ATTR_GETDSTPSAPPDATAENTITY = "getDstPSAppDataEntity";
	public final static String ATTR_GETDSTPSDELOGIC = "getDstPSDELogic";
	public final static String ATTR_GETDSTPSDELOGICPARAM = "getDstPSDELogicParam";
	public final static String ATTR_GETDSTPSDATAENTITY = "getDstPSDataEntity";
	public final static String ATTR_GETRETPSDELOGICPARAM = "getRetPSDELogicParam";
	private net.ibizsys.model.app.dataentity.IPSAppDELogic dstpsappdelogic;

	public net.ibizsys.model.app.dataentity.IPSAppDELogic getDstPSAppDELogic(){
		if(this.dstpsappdelogic != null) return this.dstpsappdelogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSAPPDELOGIC);
		if(value == null){
			return null;
		}
		this.dstpsappdelogic = this.getDstPSAppDataEntityMust().getPSAppDELogic(value, false);
		return this.dstpsappdelogic;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDELogic getDstPSAppDELogicMust(){
		net.ibizsys.model.app.dataentity.IPSAppDELogic value = this.getDstPSAppDELogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体逻辑对象");}
		return value;
	}

	public void setDstPSAppDELogic(net.ibizsys.model.app.dataentity.IPSAppDELogic dstpsappdelogic){
		this.dstpsappdelogic = dstpsappdelogic;
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

	private net.ibizsys.model.dataentity.logic.IPSDELogic dstpsdelogic;

	public net.ibizsys.model.dataentity.logic.IPSDELogic getDstPSDELogic(){
		if(this.dstpsdelogic != null) return this.dstpsdelogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDELOGIC);
		if(value == null){
			return null;
		}
		this.dstpsdelogic = this.getDstPSDataEntityMust().getPSDELogic(value, false);
		return this.dstpsdelogic;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogic getDstPSDELogicMust(){
		net.ibizsys.model.dataentity.logic.IPSDELogic value = this.getDstPSDELogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标实体逻辑对象");}
		return value;
	}

	public void setDstPSDELogic(net.ibizsys.model.dataentity.logic.IPSDELogic dstpsdelogic){
		this.dstpsdelogic = dstpsdelogic;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标逻辑参数对象");}
		return value;
	}

	public void setDstPSDELogicParam(net.ibizsys.model.dataentity.logic.IPSDELogicParam dstpsdelogicparam){
		this.dstpsdelogicparam = dstpsdelogicparam;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity dstpsdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getDstPSDataEntity(){
		if(this.dstpsdataentity != null) return this.dstpsdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.dstpsdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETDSTPSDATAENTITY);
		return this.dstpsdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getDstPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getDstPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标实体对象");}
		return value;
	}

	public void setDstPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity dstpsdataentity){
		this.dstpsdataentity = dstpsdataentity;
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
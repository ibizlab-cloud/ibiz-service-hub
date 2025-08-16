package net.ibizsys.model.dataentity.logic;



public class PSDEDEDataSetLogicImpl extends net.ibizsys.model.dataentity.logic.PSDELogicNodeImpl implements net.ibizsys.model.dataentity.logic.IPSDEDEDataSetLogic{

	public final static String ATTR_GETDSTPSAPPDEDATASET = "getDstPSAppDEDataSet";
	public final static String ATTR_GETDSTPSAPPDATAENTITY = "getDstPSAppDataEntity";
	public final static String ATTR_GETDSTPSDEDATASET = "getDstPSDEDataSet";
	public final static String ATTR_GETDSTPSDELOGICPARAM = "getDstPSDELogicParam";
	public final static String ATTR_GETDSTPSDATAENTITY = "getDstPSDataEntity";
	public final static String ATTR_GETRETPSDELOGICPARAM = "getRetPSDELogicParam";
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

	private net.ibizsys.model.dataentity.ds.IPSDEDataSet dstpsdedataset;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getDstPSDEDataSet(){
		if(this.dstpsdedataset != null) return this.dstpsdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDEDATASET);
		if(value == null){
			return null;
		}
		this.dstpsdedataset = this.getDstPSDataEntityMust().getPSDEDataSet(value, false);
		return this.dstpsdedataset;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getDstPSDEDataSetMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getDstPSDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标实体数据集对象");}
		return value;
	}

	public void setDstPSDEDataSet(net.ibizsys.model.dataentity.ds.IPSDEDataSet dstpsdedataset){
		this.dstpsdedataset = dstpsdedataset;
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
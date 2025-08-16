package net.ibizsys.model.dataentity.logic;



public class PSDEDEDataSyncLogicImpl extends net.ibizsys.model.dataentity.logic.PSDELogicNodeImpl implements net.ibizsys.model.dataentity.logic.IPSDEDEDataSyncLogic{

	public final static String ATTR_GETDSTPSDEDATASYNC = "getDstPSDEDataSync";
	public final static String ATTR_GETDSTPSDELOGICPARAM = "getDstPSDELogicParam";
	public final static String ATTR_GETDSTPSDATAENTITY = "getDstPSDataEntity";
	public final static String ATTR_GETEVENTTYPE = "eventType";
	private net.ibizsys.model.dataentity.datasync.IPSDEDataSync dstpsdedatasync;

	public net.ibizsys.model.dataentity.datasync.IPSDEDataSync getDstPSDEDataSync(){
		if(this.dstpsdedatasync != null) return this.dstpsdedatasync;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDEDATASYNC);
		if(value == null){
			return null;
		}
		this.dstpsdedatasync = this.getDstPSDataEntityMust().getPSDEDataSync(value, false);
		return this.dstpsdedatasync;
	}

	public net.ibizsys.model.dataentity.datasync.IPSDEDataSync getDstPSDEDataSyncMust(){
		net.ibizsys.model.dataentity.datasync.IPSDEDataSync value = this.getDstPSDEDataSync();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标实体数据同步对象");}
		return value;
	}

	public void setDstPSDEDataSync(net.ibizsys.model.dataentity.datasync.IPSDEDataSync dstpsdedatasync){
		this.dstpsdedatasync = dstpsdedatasync;
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


	public int getEventType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEVENTTYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
}
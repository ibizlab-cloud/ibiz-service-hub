package net.ibizsys.model.dataentity.logic;



public class PSDEDEDTSQueueLogicImpl extends net.ibizsys.model.dataentity.logic.PSDELogicNodeImpl implements net.ibizsys.model.dataentity.logic.IPSDEDEDTSQueueLogic{

	public final static String ATTR_GETDSTPSDEDTSQUEUE = "getDstPSDEDTSQueue";
	public final static String ATTR_GETDSTPSDELOGICPARAM = "getDstPSDELogicParam";
	public final static String ATTR_GETDSTPSDATAENTITY = "getDstPSDataEntity";
	private net.ibizsys.model.dataentity.dts.IPSDEDTSQueue dstpsdedtsqueue;

	public net.ibizsys.model.dataentity.dts.IPSDEDTSQueue getDstPSDEDTSQueue(){
		if(this.dstpsdedtsqueue != null) return this.dstpsdedtsqueue;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDEDTSQUEUE);
		if(value == null){
			return null;
		}
		this.dstpsdedtsqueue = this.getDstPSDataEntityMust().getPSDEDTSQueue(value, false);
		return this.dstpsdedtsqueue;
	}

	public net.ibizsys.model.dataentity.dts.IPSDEDTSQueue getDstPSDEDTSQueueMust(){
		net.ibizsys.model.dataentity.dts.IPSDEDTSQueue value = this.getDstPSDEDTSQueue();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标实体异步处理队列对象");}
		return value;
	}

	public void setDstPSDEDTSQueue(net.ibizsys.model.dataentity.dts.IPSDEDTSQueue dstpsdedtsqueue){
		this.dstpsdedtsqueue = dstpsdedtsqueue;
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

}
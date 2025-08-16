package net.ibizsys.model.dataentity.dataflow;



public class PSDEDFDELogicSinkNodeImpl extends net.ibizsys.model.dataentity.dataflow.PSDEDataFlowSinkNodeImpl implements net.ibizsys.model.dataentity.dataflow.IPSDEDFDELogicSinkNode{

	public final static String ATTR_GETDSTPSDELOGIC = "getDstPSDELogic";
	public final static String ATTR_GETDSTPSDATAENTITY = "getDstPSDataEntity";
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标实体处理逻辑对象");}
		return value;
	}

	public void setDstPSDELogic(net.ibizsys.model.dataentity.logic.IPSDELogic dstpsdelogic){
		this.dstpsdelogic = dstpsdelogic;
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
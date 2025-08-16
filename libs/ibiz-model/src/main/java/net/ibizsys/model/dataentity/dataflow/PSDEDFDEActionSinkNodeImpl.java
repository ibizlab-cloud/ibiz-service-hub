package net.ibizsys.model.dataentity.dataflow;



public class PSDEDFDEActionSinkNodeImpl extends net.ibizsys.model.dataentity.dataflow.PSDEDataFlowSinkNodeImpl implements net.ibizsys.model.dataentity.dataflow.IPSDEDFDEActionSinkNode{

	public final static String ATTR_GETDSTPSDEACTION = "getDstPSDEAction";
	public final static String ATTR_GETDSTPSDATAENTITY = "getDstPSDataEntity";
	private net.ibizsys.model.dataentity.action.IPSDEAction dstpsdeaction;

	public net.ibizsys.model.dataentity.action.IPSDEAction getDstPSDEAction(){
		if(this.dstpsdeaction != null) return this.dstpsdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDEACTION);
		if(value == null){
			return null;
		}
		this.dstpsdeaction = this.getDstPSDataEntityMust().getPSDEAction(value, false);
		return this.dstpsdeaction;
	}

	public net.ibizsys.model.dataentity.action.IPSDEAction getDstPSDEActionMust(){
		net.ibizsys.model.dataentity.action.IPSDEAction value = this.getDstPSDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标实体行为对象");}
		return value;
	}

	public void setDstPSDEAction(net.ibizsys.model.dataentity.action.IPSDEAction dstpsdeaction){
		this.dstpsdeaction = dstpsdeaction;
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
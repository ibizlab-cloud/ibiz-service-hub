package net.ibizsys.model.dataentity.dataflow;



public class PSDEDFDEDataFlowSinkNodeImpl extends net.ibizsys.model.dataentity.dataflow.PSDEDataFlowSinkNodeImpl implements net.ibizsys.model.dataentity.dataflow.IPSDEDFDEDataFlowSinkNode{

	public final static String ATTR_GETDSTPSDEDATAFLOW = "getDstPSDEDataFlow";
	public final static String ATTR_GETDSTPSDATAENTITY = "getDstPSDataEntity";
	private net.ibizsys.model.dataentity.dataflow.IPSDEDataFlow dstpsdedataflow;

	public net.ibizsys.model.dataentity.dataflow.IPSDEDataFlow getDstPSDEDataFlow(){
		if(this.dstpsdedataflow != null) return this.dstpsdedataflow;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDEDATAFLOW);
		if(value == null){
			return null;
		}
		this.dstpsdedataflow = this.getDstPSDataEntityMust().getPSDEDataFlow(value, false);
		return this.dstpsdedataflow;
	}

	public net.ibizsys.model.dataentity.dataflow.IPSDEDataFlow getDstPSDEDataFlowMust(){
		net.ibizsys.model.dataentity.dataflow.IPSDEDataFlow value = this.getDstPSDEDataFlow();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标实体数据流逻辑对象");}
		return value;
	}

	public void setDstPSDEDataFlow(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlow dstpsdedataflow){
		this.dstpsdedataflow = dstpsdedataflow;
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
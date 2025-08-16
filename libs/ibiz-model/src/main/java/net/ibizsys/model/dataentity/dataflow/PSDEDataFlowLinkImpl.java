package net.ibizsys.model.dataentity.dataflow;



public class PSDEDataFlowLinkImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowLink{

	public final static String ATTR_GETDSTPSDEDATAFLOWNODE = "getDstPSDEDataFlowNode";
	public final static String ATTR_GETLINKTYPE = "linkType";
	public final static String ATTR_GETSRCPSDEDATAFLOWNODE = "getSrcPSDEDataFlowNode";
	private net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode dstpsdedataflownode;

	public net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode getDstPSDEDataFlowNode(){
		if(this.dstpsdedataflownode != null) return this.dstpsdedataflownode;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDEDATAFLOWNODE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.dataflow.IPSDEDataFlow ipsdedataflow = getParentPSModelObject(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlow.class);
		this.dstpsdedataflownode = ipsdedataflow.getPSDEDataFlowNode(value, false);
		return this.dstpsdedataflownode;
	}

	public net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode getDstPSDEDataFlowNodeMust(){
		net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode value = this.getDstPSDEDataFlowNode();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标数据流节点对象");}
		return value;
	}

	public void setDstPSDEDataFlowNode(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode dstpsdedataflownode){
		this.dstpsdedataflownode = dstpsdedataflownode;
	}


	public java.lang.String getLinkType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLINKTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode srcpsdedataflownode;

	public net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode getSrcPSDEDataFlowNode(){
		if(this.srcpsdedataflownode != null) return this.srcpsdedataflownode;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCPSDEDATAFLOWNODE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.dataflow.IPSDEDataFlow ipsdedataflow = getParentPSModelObject(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlow.class);
		this.srcpsdedataflownode = ipsdedataflow.getPSDEDataFlowNode(value, false);
		return this.srcpsdedataflownode;
	}

	public net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode getSrcPSDEDataFlowNodeMust(){
		net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode value = this.getSrcPSDEDataFlowNode();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定源数据流节点对象");}
		return value;
	}

	public void setSrcPSDEDataFlowNode(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlowNode srcpsdedataflownode){
		this.srcpsdedataflownode = srcpsdedataflownode;
	}

}
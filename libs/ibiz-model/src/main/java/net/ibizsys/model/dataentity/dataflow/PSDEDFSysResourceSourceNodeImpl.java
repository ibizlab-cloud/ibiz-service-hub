package net.ibizsys.model.dataentity.dataflow;



public class PSDEDFSysResourceSourceNodeImpl extends net.ibizsys.model.dataentity.dataflow.PSDEDataFlowSourceNodeImpl implements net.ibizsys.model.dataentity.dataflow.IPSDEDFSysResourceSourceNode{

	public final static String ATTR_GETPSSYSRESOURCE = "getPSSysResource";
	private net.ibizsys.model.res.IPSSysResource pssysresource;

	public net.ibizsys.model.res.IPSSysResource getPSSysResource(){
		if(this.pssysresource != null) return this.pssysresource;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSRESOURCE);
		if(value == null){
			return null;
		}
		this.pssysresource = getPSModelObject(net.ibizsys.model.res.IPSSysResource.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSRESOURCE);
		return this.pssysresource;
	}

	public net.ibizsys.model.res.IPSSysResource getPSSysResourceMust(){
		net.ibizsys.model.res.IPSSysResource value = this.getPSSysResource();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统预置资源");}
		return value;
	}

	public void setPSSysResource(net.ibizsys.model.res.IPSSysResource pssysresource){
		this.pssysresource = pssysresource;
	}

}
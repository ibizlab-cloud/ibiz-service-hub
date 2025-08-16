package net.ibizsys.model.dataentity.dataflow;



public class PSDEDFSortProcessNodeImpl extends net.ibizsys.model.dataentity.dataflow.PSDEDataFlowProcessNodeImpl implements net.ibizsys.model.dataentity.dataflow.IPSDEDFSortProcessNode{

	public final static String ATTR_GETLIMIT = "limit";
	public final static String ATTR_GETSKIP = "skip";

	public int getLimit(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLIMIT);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public int getSkip(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSKIP);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}
}
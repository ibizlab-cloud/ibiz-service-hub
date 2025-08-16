package net.ibizsys.model.dataentity.dataflow;



public class PSDEDFPrepareProcessNodeImpl extends net.ibizsys.model.dataentity.dataflow.PSDEDataFlowProcessNodeImpl implements net.ibizsys.model.dataentity.dataflow.IPSDEDFPrepareProcessNode{

	public final static String ATTR_ISRESELECTCOLUMN = "reselectColumn";

	public boolean isReselectColumn(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISRESELECTCOLUMN);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
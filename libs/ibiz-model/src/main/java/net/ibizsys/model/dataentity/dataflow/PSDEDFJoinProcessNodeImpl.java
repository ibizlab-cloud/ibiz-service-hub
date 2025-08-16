package net.ibizsys.model.dataentity.dataflow;



public class PSDEDFJoinProcessNodeImpl extends net.ibizsys.model.dataentity.dataflow.PSDEDataFlowProcessNodeImpl implements net.ibizsys.model.dataentity.dataflow.IPSDEDFJoinProcessNode{

	public final static String ATTR_GETJOINTYPE = "joinType";
	public final static String ATTR_GETPSDEDFJOINGROUPCOND = "getPSDEDFJoinGroupCond";

	public java.lang.String getJoinType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETJOINTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.dataflow.IPSDEDFJoinGroupCond psdedfjoingroupcond;

	public net.ibizsys.model.dataentity.dataflow.IPSDEDFJoinGroupCond getPSDEDFJoinGroupCond(){
		if(this.psdedfjoingroupcond != null) return this.psdedfjoingroupcond;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDFJOINGROUPCOND);
		if(value == null){
			return null;
		}
		this.psdedfjoingroupcond = getPSModelObject(net.ibizsys.model.dataentity.dataflow.IPSDEDFJoinGroupCond.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDEDFJOINGROUPCOND);
		return this.psdedfjoingroupcond;
	}

	public net.ibizsys.model.dataentity.dataflow.IPSDEDFJoinGroupCond getPSDEDFJoinGroupCondMust(){
		net.ibizsys.model.dataentity.dataflow.IPSDEDFJoinGroupCond value = this.getPSDEDFJoinGroupCond();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定连接模型");}
		return value;
	}

	public void setPSDEDFJoinGroupCond(net.ibizsys.model.dataentity.dataflow.IPSDEDFJoinGroupCond psdedfjoingroupcond){
		this.psdedfjoingroupcond = psdedfjoingroupcond;
	}

}
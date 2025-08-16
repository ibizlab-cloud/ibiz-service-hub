package net.ibizsys.model.dataentity.dataflow;



public class PSDEDFMergeProcessNodeImpl extends net.ibizsys.model.dataentity.dataflow.PSDEDataFlowProcessNodeImpl implements net.ibizsys.model.dataentity.dataflow.IPSDEDFMergeProcessNode{

	public final static String ATTR_GETMERGEFIELD = "mergeField";
	public final static String ATTR_GETMERGETYPE = "mergeType";
	public final static String ATTR_ISCOPYIFNOTEXISTS = "copyIfNotExists";
	public final static String ATTR_ISMERGEINTOFIELD = "mergeIntoField";

	public java.lang.String getMergeField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMERGEFIELD);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMergeType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMERGETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isCopyIfNotExists(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCOPYIFNOTEXISTS);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isMergeIntoField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISMERGEINTOFIELD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
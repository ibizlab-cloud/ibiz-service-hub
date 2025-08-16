package net.ibizsys.model.ba;



public class PSSysBDTableDEImpl extends net.ibizsys.model.ba.PSSysBDTableObjectImpl implements net.ibizsys.model.ba.IPSSysBDTableDE{

	public final static String ATTR_GETBDTABLEDETYPE = "bDTableDEType";
	public final static String ATTR_GETROWKEYFORMAT = "rowKeyFormat";
	public final static String ATTR_GETROWKEYPARAMS = "rowKeyParams";

	public int getBDTableDEType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBDTABLEDETYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getRowKeyFormat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETROWKEYFORMAT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRowKeyParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETROWKEYPARAMS);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
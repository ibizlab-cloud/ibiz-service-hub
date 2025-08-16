package net.ibizsys.model.ba;



public class PSSysBDTableRSImpl extends net.ibizsys.model.ba.PSSysBDSchemeObjectImpl implements net.ibizsys.model.ba.IPSSysBDTableRS{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETMINORCODENAME = "minorCodeName";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMinorCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINORCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
package net.ibizsys.model.ba;



public class PSSysBDPartImpl extends net.ibizsys.model.ba.PSSysBDSchemeObjectImpl implements net.ibizsys.model.ba.IPSSysBDPart{

	public final static String ATTR_GETCODENAME = "codeName";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
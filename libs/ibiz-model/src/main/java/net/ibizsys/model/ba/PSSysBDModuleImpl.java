package net.ibizsys.model.ba;



public class PSSysBDModuleImpl extends net.ibizsys.model.ba.PSSysBDSchemeObjectImpl implements net.ibizsys.model.ba.IPSSysBDModule{

	public final static String ATTR_GETCODENAME = "codeName";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
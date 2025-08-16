package net.ibizsys.model.ba;



public class PSSysBDColSetImpl extends net.ibizsys.model.ba.PSSysBDTableObjectImpl implements net.ibizsys.model.ba.IPSSysBDColSet{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_ISDEFAULT = "default";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getLogicName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isDefault(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDEFAULT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
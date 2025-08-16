package net.ibizsys.model.security;



public class PSSysUserModeImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.security.IPSSysUserMode{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETUSERMODESN = "userModeSN";
	public final static String ATTR_GETUSERMODETAG = "userModeTag";

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

	public java.lang.String getUserModeSN(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERMODESN);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUserModeTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERMODETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
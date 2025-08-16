package net.ibizsys.model.system;



public class PSSysModelGroupImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.system.IPSSysModelGroup{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETGROUPTAG = "groupTag";
	public final static String ATTR_GETGROUPTAG2 = "groupTag2";
	public final static String ATTR_GETGROUPTAG3 = "groupTag3";
	public final static String ATTR_GETGROUPTAG4 = "groupTag4";
	public final static String ATTR_GETPKGCODENAME = "pKGCodeName";
	public final static String ATTR_GETRUNTIMETYPE = "runtimeType";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getGroupTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getGroupTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getGroupTag3(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPTAG3);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getGroupTag4(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPTAG4);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPKGCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPKGCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRuntimeType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRUNTIMETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
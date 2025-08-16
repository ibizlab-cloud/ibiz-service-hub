package net.ibizsys.model.res;



public class PSSysDictCatImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.res.IPSSysDictCat{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDICTCATTAG = "dictCatTag";
	public final static String ATTR_GETDICTCATTAG2 = "dictCatTag2";
	public final static String ATTR_ISUSERDICTCAT = "userDictCat";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDictCatTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDICTCATTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDictCatTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDICTCATTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isUserDictCat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISUSERDICTCAT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
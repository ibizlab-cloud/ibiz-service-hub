package net.ibizsys.model.database;



public class PSSystemDBConfigImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.database.IPSSystemDBConfig{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDBTYPE = "dBType";
	public final static String ATTR_GETNULLVALUEORDERMODE = "nullValueOrderMode";
	public final static String ATTR_GETOBJNAMECASE = "objNameCase";
	public final static String ATTR_ISDEFAULTMODE = "defaultMode";
	public final static String ATTR_ISPUBFKEY = "pubFKey";
	public final static String ATTR_ISPUBINDEX = "pubIndex";
	public final static String ATTR_ISPUBMODEL = "pubModel";
	public final static String ATTR_ISPUBMODELCOMMENT = "pubModelComment";
	public final static String ATTR_ISPUBVIEW = "pubView";

	@Deprecated
	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDBType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDBTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getNullValueOrderMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNULLVALUEORDERMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getObjNameCase(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETOBJNAMECASE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isDefaultMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDEFAULTMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isPubFKey(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISPUBFKEY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isPubIndex(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISPUBINDEX);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isPubModel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISPUBMODEL);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isPubModelComment(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISPUBMODELCOMMENT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isPubView(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISPUBVIEW);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
package net.ibizsys.model;



public abstract class PSSystemObjectImpl extends net.ibizsys.model.PSModelObject2Impl{

	public final static String ATTR_GETDYNAINSTMODE = "dynaInstMode";
	public final static String ATTR_GETDYNAINSTTAG = "dynaInstTag";
	public final static String ATTR_GETDYNAINSTTAG2 = "dynaInstTag2";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_ISDYNAINSTMODEL = "dynaInstModel";

	public int getDynaInstMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAINSTMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getDynaInstTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAINSTTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDynaInstTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAINSTTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDynaModelFilePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMODELFILEPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isDynaInstModel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDYNAINSTMODEL);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
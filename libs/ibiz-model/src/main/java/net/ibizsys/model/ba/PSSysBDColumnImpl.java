package net.ibizsys.model.ba;



public class PSSysBDColumnImpl extends net.ibizsys.model.ba.PSSysBDTableObjectImpl implements net.ibizsys.model.ba.IPSSysBDColumn{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETPREDEFINEDTYPE = "predefinedType";
	public final static String ATTR_GETSTDDATATYPE = "stdDataType";
	public final static String ATTR_GETUNIONKEYVALUE = "unionKeyValue";

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

	public java.lang.String getPredefinedType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPREDEFINEDTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getStdDataType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTDDATATYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getUnionKeyValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNIONKEYVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
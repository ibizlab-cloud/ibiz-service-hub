package net.ibizsys.model;



public class PSModelDataImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.IPSModelData{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCONTENT = "content";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETMODELTAG = "modelTag";
	public final static String ATTR_GETMODELTAG2 = "modelTag2";
	public final static String ATTR_GETREALMODELID = "realModelId";
	public final static String ATTR_GETREALMODELSUBTYPE = "realModelSubType";
	public final static String ATTR_GETREALMODELTYPE = "realModelType";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getContent(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENT);
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

	public java.lang.String getModelTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMODELTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getModelTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMODELTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRealModelId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREALMODELID);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRealModelSubType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREALMODELSUBTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRealModelType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREALMODELTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
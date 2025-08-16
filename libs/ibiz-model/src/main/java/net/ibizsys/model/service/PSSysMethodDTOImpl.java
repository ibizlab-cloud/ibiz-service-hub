package net.ibizsys.model.service;



public class PSSysMethodDTOImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.service.IPSSysMethodDTO{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETPSSYSMETHODDTOFIELDS = "getPSSysMethodDTOFields";
	public final static String ATTR_GETSOURCETYPE = "sourceType";
	public final static String ATTR_GETTAG = "tag";
	public final static String ATTR_GETTAG2 = "tag2";
	public final static String ATTR_GETTYPE = "type";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getDynaModelFilePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMODELFILEPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.service.IPSSysMethodDTOField> pssysmethoddtofields = null;
	public java.util.List<net.ibizsys.model.service.IPSSysMethodDTOField> getPSSysMethodDTOFields(){
		if(this.pssysmethoddtofields == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSMETHODDTOFIELDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.service.IPSSysMethodDTOField> list = new java.util.ArrayList<net.ibizsys.model.service.IPSSysMethodDTOField>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.service.IPSSysMethodDTOField obj = this.getPSModelObject(net.ibizsys.model.service.IPSSysMethodDTOField.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSSYSMETHODDTOFIELDS);
				if(obj!=null)list.add(obj);
			}
			this.pssysmethoddtofields = list;
		}
		return (this.pssysmethoddtofields.size() == 0)? null : this.pssysmethoddtofields;
	}

	public net.ibizsys.model.service.IPSSysMethodDTOField getPSSysMethodDTOField(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.service.IPSSysMethodDTOField.class, this.getPSSysMethodDTOFields(), objKey, bTryMode);
	}
	public void setPSSysMethodDTOFields(java.util.List<net.ibizsys.model.service.IPSSysMethodDTOField> list){
		this.pssysmethoddtofields = list;
	}

	public java.lang.String getSourceType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSOURCETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
package net.ibizsys.model.search;



public class PSSysSearchFieldImpl extends net.ibizsys.model.search.PSSysSearchDocObjectImpl implements net.ibizsys.model.search.IPSSysSearchField{

	public final static String ATTR_GETANALYZER = "analyzer";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDATEFORMAT = "dateFormat";
	public final static String ATTR_GETFIELDPARAMS = "fieldParams";
	public final static String ATTR_GETFIELDTAG = "fieldTag";
	public final static String ATTR_GETFIELDTAG2 = "fieldTag2";
	public final static String ATTR_GETFIELDTYPE = "fieldType";
	public final static String ATTR_GETIGNOREFIELDS = "ignoreFields";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETPATTERN = "pattern";
	public final static String ATTR_GETSEARCHANALYZER = "searchAnalyzer";
	public final static String ATTR_GETSTDDATATYPE = "stdDataType";
	public final static String ATTR_ISFIELDDATA = "fieldData";
	public final static String ATTR_ISINCLUDEINPARENT = "includeInParent";
	public final static String ATTR_ISINDEX = "index";
	public final static String ATTR_ISPKEY = "pKey";
	public final static String ATTR_ISSTORE = "store";

	public java.lang.String getAnalyzer(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETANALYZER);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDateFormat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATEFORMAT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getFieldParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFIELDPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getFieldTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFIELDTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getFieldTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFIELDTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getFieldType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFIELDTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private java.lang.String[] ignorefields = null;
	public java.lang.String[] getIgnoreFields(){
		if(this.ignorefields == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETIGNOREFIELDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.lang.String[] array = new java.lang.String[arrayNode.size()];
			for(int i = 0;i<arrayNode.size();i++) {
				array[i] = arrayNode.get(i).asText();
			}
			this.ignorefields = array;
		}
		return this.ignorefields;
	}

	public java.lang.String getLogicName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPattern(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPATTERN);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSearchAnalyzer(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSEARCHANALYZER);
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

	public boolean isFieldData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISFIELDDATA);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isIncludeInParent(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISINCLUDEINPARENT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isIndex(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISINDEX);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isPKey(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISPKEY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isStore(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSTORE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
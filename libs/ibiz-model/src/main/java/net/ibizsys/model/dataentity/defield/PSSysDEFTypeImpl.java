package net.ibizsys.model.dataentity.defield;



public class PSSysDEFTypeImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.dataentity.defield.IPSSysDEFType{

	public final static String ATTR_GETEDITORHEIGHT = "editorHeight";
	public final static String ATTR_GETEDITORTYPE = "editorType";
	public final static String ATTR_GETEDITORWIDTH = "editorWidth";
	public final static String ATTR_GETGRIDCOLUMNALIGN = "gridColumnAlign";
	public final static String ATTR_GETMAXVALUESTRING = "maxValueString";
	public final static String ATTR_GETMINSTRINGLENGTH = "minStringLength";
	public final static String ATTR_GETMINVALUESTRING = "minValueString";
	public final static String ATTR_GETSEARCHEDITORHEIGHT = "searchEditorHeight";
	public final static String ATTR_GETSEARCHEDITORTYPE = "searchEditorType";
	public final static String ATTR_GETSEARCHEDITORWIDTH = "searchEditorWidth";
	public final static String ATTR_GETSTRINGLENGTH = "stringLength";

	public java.lang.Integer getEditorHeight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEDITORHEIGHT);
		if(value == null){
			return null;
		}
		return value.asInt();
	}

	public java.lang.String getEditorType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEDITORTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.Integer getEditorWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEDITORWIDTH);
		if(value == null){
			return null;
		}
		return value.asInt();
	}

	public java.lang.String getGridColumnAlign(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGRIDCOLUMNALIGN);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMaxValueString(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAXVALUESTRING);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getMinStringLength(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINSTRINGLENGTH);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getMinValueString(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINVALUESTRING);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.Integer getSearchEditorHeight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSEARCHEDITORHEIGHT);
		if(value == null){
			return null;
		}
		return value.asInt();
	}

	@Deprecated
	public java.lang.String getSearchEditorType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSEARCHEDITORTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.Integer getSearchEditorWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSEARCHEDITORWIDTH);
		if(value == null){
			return null;
		}
		return value.asInt();
	}

	public int getStringLength(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTRINGLENGTH);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
}
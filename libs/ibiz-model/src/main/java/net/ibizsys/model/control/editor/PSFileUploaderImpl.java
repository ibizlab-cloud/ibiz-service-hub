package net.ibizsys.model.control.editor;



public class PSFileUploaderImpl extends net.ibizsys.model.control.editor.PSValueItemEditorImpl implements net.ibizsys.model.control.editor.IPSFileUploader{

	public final static String ATTR_GETFILEEXTS = "fileExts";
	public final static String ATTR_GETMAXFILECOUNT = "maxFileCount";
	public final static String ATTR_GETMAXFILESIZE = "maxFileSize";
	public final static String ATTR_GETMINFILECOUNT = "minFileCount";
	public final static String ATTR_GETOSSCAT = "oSSCat";

	public java.lang.String getFileExts(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFILEEXTS);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getMaxFileCount(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAXFILECOUNT);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getMaxFileSize(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAXFILESIZE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getMinFileCount(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINFILECOUNT);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getOSSCat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETOSSCAT);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
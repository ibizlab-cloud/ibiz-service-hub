package net.ibizsys.model.control.editor;



public class PSPictureImpl extends net.ibizsys.model.control.editor.PSFileUploaderImpl implements net.ibizsys.model.control.editor.IPSPicture{

	public final static String ATTR_GETMAXFILECOUNT = "maxFileCount";
	public final static String ATTR_GETOSSCAT = "oSSCat";
	public final static String ATTR_ISRAWCONTENT = "rawContent";

	public int getMaxFileCount(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAXFILECOUNT);
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

	public boolean isRawContent(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISRAWCONTENT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
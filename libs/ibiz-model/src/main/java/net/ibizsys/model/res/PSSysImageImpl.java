package net.ibizsys.model.res;



public class PSSysImageImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.res.IPSSysImage{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCSSCLASS = "cssClass";
	public final static String ATTR_GETCSSCLASSX = "cssClassX";
	public final static String ATTR_GETGLYPH = "glyph";
	public final static String ATTR_GETHEIGHT = "height";
	public final static String ATTR_GETIMAGEPATH = "imagePath";
	public final static String ATTR_GETIMAGEPATHX = "imagePathX";
	public final static String ATTR_GETRAWCONTENT = "rawContent";
	public final static String ATTR_GETWIDTH = "width";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCssClass(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCSSCLASS);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCssClassX(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCSSCLASSX);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getGlyph(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGLYPH);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getHeight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHEIGHT);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getImagePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETIMAGEPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getImagePathX(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETIMAGEPATHX);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRawContent(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRAWCONTENT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWIDTH);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
}
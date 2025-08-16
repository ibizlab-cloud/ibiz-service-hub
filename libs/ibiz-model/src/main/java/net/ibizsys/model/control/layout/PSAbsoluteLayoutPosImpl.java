package net.ibizsys.model.control.layout;



public class PSAbsoluteLayoutPosImpl extends net.ibizsys.model.control.layout.PSLayoutPosImplBase implements net.ibizsys.model.control.layout.IPSAbsoluteLayoutPos{

	public final static String ATTR_GETBOTTOM = "bottom";
	public final static String ATTR_GETLAYOUTPOS = "layoutPos";
	public final static String ATTR_GETLEFT = "left";
	public final static String ATTR_GETRIGHT = "right";
	public final static String ATTR_GETTOP = "top";

	public int getBottom(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBOTTOM);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getLayoutPos(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLAYOUTPOS);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getLeft(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLEFT);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getRight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRIGHT);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getTop(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTOP);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
}
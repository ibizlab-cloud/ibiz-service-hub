package net.ibizsys.model.control.layout;



public abstract class PSLayoutPosImplBase extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.control.layout.IPSLayoutPos{

	public final static String ATTR_GETHALIGNSELF = "hAlignSelf";
	public final static String ATTR_GETHEIGHT = "height";
	public final static String ATTR_GETHEIGHTMODE = "heightMode";
	public final static String ATTR_GETLAYOUT = "layout";
	public final static String ATTR_GETNAME = "name";
	public final static String ATTR_GETSPACINGBOTTOM = "spacingBottom";
	public final static String ATTR_GETSPACINGLEFT = "spacingLeft";
	public final static String ATTR_GETSPACINGRIGHT = "spacingRight";
	public final static String ATTR_GETSPACINGTOP = "spacingTop";
	public final static String ATTR_GETVALIGNSELF = "vAlignSelf";
	public final static String ATTR_GETWIDTH = "width";
	public final static String ATTR_GETWIDTHMODE = "widthMode";

	public java.lang.String getHAlignSelf(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHALIGNSELF);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.Integer getHeight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHEIGHT);
		if(value == null){
			return null;
		}
		return value.asInt();
	}

	public java.lang.String getHeightMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHEIGHTMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getLayout(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLAYOUT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSpacingBottom(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSPACINGBOTTOM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSpacingLeft(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSPACINGLEFT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSpacingRight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSPACINGRIGHT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSpacingTop(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSPACINGTOP);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getVAlignSelf(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALIGNSELF);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.Integer getWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWIDTH);
		if(value == null){
			return null;
		}
		return value.asInt();
	}

	public java.lang.String getWidthMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWIDTHMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
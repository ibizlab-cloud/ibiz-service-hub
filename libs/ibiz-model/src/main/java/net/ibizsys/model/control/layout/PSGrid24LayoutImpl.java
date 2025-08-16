package net.ibizsys.model.control.layout;



public class PSGrid24LayoutImpl extends net.ibizsys.model.control.layout.PSGrid12LayoutImpl{

	public final static String ATTR_GETCOLUMNCOUNT = "columnCount";
	public final static String ATTR_GETLAYOUT = "layout";
	public final static String ATTR_ISENABLECOL12TOCOL24 = "enableCol12ToCol24";

	public int getColumnCount(){
		return 24;
	}

	public java.lang.String getLayout(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLAYOUT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isEnableCol12ToCol24(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLECOL12TOCOL24);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
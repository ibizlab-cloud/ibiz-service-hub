package net.ibizsys.model.control.layout;



public class PSBorderLayoutPosImpl extends net.ibizsys.model.control.layout.PSLayoutPosImplBase implements net.ibizsys.model.control.layout.IPSBorderLayoutPos{

	public final static String ATTR_GETLAYOUTPOS = "layoutPos";

	public java.lang.String getLayoutPos(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLAYOUTPOS);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
package net.ibizsys.model.control.layout;



public class PSTableLayoutImpl extends net.ibizsys.model.control.layout.PSLayoutImplBase implements net.ibizsys.model.control.layout.IPSTableLayout{

	public final static String ATTR_GETLAYOUT = "layout";

	public java.lang.String getLayout(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLAYOUT);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
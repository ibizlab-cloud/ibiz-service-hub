package net.ibizsys.model.control.panel;



public class PSPanelItemSingleLogicImpl extends net.ibizsys.model.control.panel.PSPanelItemLogicImpl implements net.ibizsys.model.control.panel.IPSPanelItemSingleLogic{

	public final static String ATTR_GETCONDOP = "condOp";
	public final static String ATTR_GETDSTMODELFIELD = "dstModelField";
	public final static String ATTR_GETVALUE = "value";

	public java.lang.String getCondOp(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONDOP);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDstModelField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTMODELFIELD);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
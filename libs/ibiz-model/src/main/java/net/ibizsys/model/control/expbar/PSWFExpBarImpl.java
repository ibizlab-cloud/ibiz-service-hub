package net.ibizsys.model.control.expbar;



public class PSWFExpBarImpl extends net.ibizsys.model.control.expbar.PSExpBarImpl implements net.ibizsys.model.control.expbar.IPSWFExpBar{

	public final static String ATTR_GETCODENAME = "codeName";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
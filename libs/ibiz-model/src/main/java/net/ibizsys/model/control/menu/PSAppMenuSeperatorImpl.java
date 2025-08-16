package net.ibizsys.model.control.menu;



public class PSAppMenuSeperatorImpl extends net.ibizsys.model.control.menu.PSAppMenuItemImplBase implements net.ibizsys.model.control.menu.IPSAppMenuItem{

	public final static String ATTR_ISSEPERATOR = "seperator";
	public final static String ATTR_ISSPANMODE = "spanMode";

	public boolean isSeperator(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSEPERATOR);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isSpanMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSPANMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
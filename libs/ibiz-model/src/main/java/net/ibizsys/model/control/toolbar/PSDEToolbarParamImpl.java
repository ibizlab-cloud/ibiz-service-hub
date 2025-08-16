package net.ibizsys.model.control.toolbar;



public class PSDEToolbarParamImpl extends net.ibizsys.model.control.PSControlParamImpl implements net.ibizsys.model.control.toolbar.IPSDEToolbarParam{

	public final static String ATTR_GETOWNER = "owner";

	public java.lang.Object getOwner(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETOWNER);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
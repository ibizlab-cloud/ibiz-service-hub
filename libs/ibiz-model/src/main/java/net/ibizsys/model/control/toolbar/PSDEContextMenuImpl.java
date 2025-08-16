package net.ibizsys.model.control.toolbar;



public class PSDEContextMenuImpl extends net.ibizsys.model.control.toolbar.PSDEToolbarImpl implements net.ibizsys.model.control.toolbar.IPSDEContextMenu{

	public final static String ATTR_GETOWNER = "owner";

	public java.lang.Object getOwner(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETOWNER);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
package net.ibizsys.model.control.grid;



public class PSDEGEIUpdateDetailImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.control.grid.IPSDEGEIUpdateDetail{

	public final static String ATTR_GETNAME = "name";

	public java.lang.String getName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
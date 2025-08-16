package net.ibizsys.model.control.tree;



public class PSDETreeDEFColumnImpl extends net.ibizsys.model.control.tree.PSDETreeColumnImpl implements net.ibizsys.model.control.tree.IPSDETreeDEFColumn{

	public final static String ATTR_GETDATAITEMNAME = "dataItemName";
	public final static String ATTR_GETDEFAULTVALUE = "defaultValue";

	public java.lang.String getDataItemName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATAITEMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDefaultValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
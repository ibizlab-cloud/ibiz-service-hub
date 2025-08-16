package net.ibizsys.model.control.tree;



public class PSDETreeNodeRSNavParamImpl extends net.ibizsys.model.control.tree.PSDETreeNodeRSParamImpl implements net.ibizsys.model.control.tree.IPSDETreeNodeRSNavParam{

	public final static String ATTR_ISRAWVALUE = "rawValue";

	public boolean isRawValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISRAWVALUE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
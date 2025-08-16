package net.ibizsys.model.control.tree;



public class PSDETreeNodeRSParamImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.control.tree.IPSDETreeNodeRSParam{

	public final static String ATTR_GETDESC = "desc";
	public final static String ATTR_GETKEY = "key";
	public final static String ATTR_GETVALUE = "value";

	public java.lang.String getDesc(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDESC);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getKey(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETKEY);
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
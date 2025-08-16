package net.ibizsys.model.control.counter;



public class PSSysCounterRefImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.control.counter.IPSSysCounterRef{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETNAME = "name";
	public final static String ATTR_GETREFMODE = "refMode";
	public final static String ATTR_GETTAG = "tag";
	public final static String ATTR_GETUNIQUETAG = "uniqueTag";

	@Deprecated
	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getRefMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFMODE);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUniqueTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNIQUETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
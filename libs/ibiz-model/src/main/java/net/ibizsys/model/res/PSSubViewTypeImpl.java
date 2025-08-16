package net.ibizsys.model.res;



public class PSSubViewTypeImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.res.IPSSubViewType{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETNAMEMODE = "nameMode";
	public final static String ATTR_GETTYPECODE = "typeCode";
	public final static String ATTR_GETVIEWMODEL = "viewModel";
	public final static String ATTR_GETVIEWTYPE = "viewType";
	public final static String ATTR_ISEXTENDSTYLEONLY = "extendStyleOnly";
	public final static String ATTR_ISREPLACEDEFAULT = "replaceDefault";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getNameMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAMEMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTypeCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTYPECODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getViewModel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVIEWMODEL);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getViewType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVIEWTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isExtendStyleOnly(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISEXTENDSTYLEONLY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isReplaceDefault(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISREPLACEDEFAULT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
package net.ibizsys.model.control;



public class PSControlParamImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.control.IPSControlParam{

	public final static String ATTR_GETCTRLPARAMS = "ctrlParams";
	public final static String ATTR_GETHEIGHT = "height";
	public final static String ATTR_GETNAME = "name";
	public final static String ATTR_GETUSERTAG = "userTag";
	public final static String ATTR_GETUSERTAG2 = "userTag2";
	public final static String ATTR_GETWIDTH = "width";

	public com.fasterxml.jackson.databind.node.ObjectNode getCtrlParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCTRLPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.Double getHeight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHEIGHT);
		if(value == null){
			return null;
		}
		return value.asDouble();
	}

	@Deprecated
	public java.lang.String getName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getUserTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getUserTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.Double getWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWIDTH);
		if(value == null){
			return null;
		}
		return value.asDouble();
	}
}
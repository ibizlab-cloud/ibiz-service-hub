package net.ibizsys.model.res;



public class PSSysPFPluginImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.res.IPSSysPFPlugin
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPLUGINCODE = "pluginCode";
	public final static String ATTR_GETPLUGINMODEL = "pluginModel";
	public final static String ATTR_GETPLUGINPARAMS = "pluginParams";
	public final static String ATTR_GETPLUGINTAG = "pluginTag";
	public final static String ATTR_GETPLUGINTYPE = "pluginType";
	public final static String ATTR_GETRTOBJECTNAME = "rTObjectName";
	public final static String ATTR_GETRTOBJECTSOURCE = "rTObjectSource";
	public final static String ATTR_ISEXTENDSTYLEONLY = "extendStyleOnly";
	public final static String ATTR_ISREPLACEDEFAULT = "replaceDefault";
	public final static String ATTR_ISRUNTIMEOBJECT = "runtimeObject";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getPluginCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPLUGINCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getPluginModel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPLUGINMODEL);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getPluginParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPLUGINPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getPluginTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPLUGINTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPluginType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPLUGINTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRTObjectName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRTOBJECTNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getRTObjectSource(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRTOBJECTSOURCE);
		if(value == null){
			return 0;
		}
		return value.asInt();
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

	public boolean isRuntimeObject(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISRUNTIMEOBJECT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
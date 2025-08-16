package net.ibizsys.model.app.res;



public class PSAppPFPluginRefImpl extends net.ibizsys.model.app.PSApplicationObjectImpl implements net.ibizsys.model.app.res.IPSAppPFPluginRef{

	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSSYSPFPLUGIN = "getPSSysPFPlugin";
	public final static String ATTR_GETPLUGINCODE = "pluginCode";
	public final static String ATTR_GETPLUGINMODEL = "pluginModel";
	public final static String ATTR_GETPLUGINPARAMS = "pluginParams";
	public final static String ATTR_GETPLUGINTYPE = "pluginType";
	public final static String ATTR_GETRTOBJECTNAME = "rTObjectName";
	public final static String ATTR_GETRTOBJECTREPO = "rTObjectRepo";
	public final static String ATTR_GETREFMODE = "refMode";
	public final static String ATTR_GETREFTAG = "refTag";
	public final static String ATTR_GETREFTAG2 = "refTag2";
	public final static String ATTR_GETTEMPLCODE = "templCode";
	public final static String ATTR_GETTEMPLCODE2 = "templCode2";
	public final static String ATTR_GETTEMPLCODE3 = "templCode3";
	public final static String ATTR_GETTEMPLCODE4 = "templCode4";
	public final static String ATTR_ISEXTENDSTYLEONLY = "extendStyleOnly";
	public final static String ATTR_ISREPLACEDEFAULT = "replaceDefault";
	public final static String ATTR_ISRUNTIMEOBJECT = "runtimeObject";

	@Deprecated
	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.res.IPSSysPFPlugin pssyspfplugin;

	public net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin(){
		if(this.pssyspfplugin != null) return this.pssyspfplugin;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSPFPLUGIN);
		if(value == null){
			return null;
		}
		this.pssyspfplugin = getPSModelObject(net.ibizsys.model.res.IPSSysPFPlugin.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSPFPLUGIN);
		return this.pssyspfplugin;
	}

	public net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust(){
		net.ibizsys.model.res.IPSSysPFPlugin value = this.getPSSysPFPlugin();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定前端模板插件");}
		return value;
	}

	public void setPSSysPFPlugin(net.ibizsys.model.res.IPSSysPFPlugin pssyspfplugin){
		this.pssyspfplugin = pssyspfplugin;
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

	public java.lang.String getRTObjectRepo(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRTOBJECTREPO);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRefMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRefTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRefTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTemplCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEMPLCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTemplCode2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEMPLCODE2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTemplCode3(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEMPLCODE3);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTemplCode4(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEMPLCODE4);
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

	public boolean isRuntimeObject(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISRUNTIMEOBJECT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
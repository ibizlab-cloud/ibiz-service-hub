package net.ibizsys.model.res;



public class PSSysSFPluginImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.res.IPSSysSFPlugin
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";
	public final static String ATTR_GETPLUGINCODE = "pluginCode";
	public final static String ATTR_GETPLUGINMODEL = "pluginModel";
	public final static String ATTR_GETPLUGINPARAMS = "pluginParams";
	public final static String ATTR_GETPLUGINTAG = "pluginTag";
	public final static String ATTR_GETPLUGINTAG2 = "pluginTag2";
	public final static String ATTR_GETPLUGINTYPE = "pluginType";
	public final static String ATTR_GETRTOBJECTNAME = "rTObjectName";
	public final static String ATTR_GETRTOBJECTREPO = "rTObjectRepo";
	public final static String ATTR_GETRTOBJECTSOURCE = "rTObjectSource";
	public final static String ATTR_GETTEMPLCODE = "templCode";
	public final static String ATTR_GETTEMPLCODE2 = "templCode2";
	public final static String ATTR_GETTEMPLCODE3 = "templCode3";
	public final static String ATTR_GETTEMPLCODE4 = "templCode4";
	public final static String ATTR_ISLAZYMODE = "lazyMode";
	public final static String ATTR_ISREPLACEDEFAULT = "replaceDefault";
	public final static String ATTR_ISRUNTIMEOBJECT = "runtimeObject";
	public final static String ATTR_ISSINGLEINSTANCE = "singleInstance";
	public final static String ATTR_ISTRYMODE = "tryMode";

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
	private net.ibizsys.model.system.IPSSystemModule pssystemmodule;

	public net.ibizsys.model.system.IPSSystemModule getPSSystemModule(){
		if(this.pssystemmodule != null) return this.pssystemmodule;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSTEMMODULE);
		if(value == null){
			return null;
		}
		this.pssystemmodule = getPSModelObject(net.ibizsys.model.system.IPSSystemModule.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSTEMMODULE);
		return this.pssystemmodule;
	}

	public net.ibizsys.model.system.IPSSystemModule getPSSystemModuleMust(){
		net.ibizsys.model.system.IPSSystemModule value = this.getPSSystemModule();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统模块");}
		return value;
	}

	public void setPSSystemModule(net.ibizsys.model.system.IPSSystemModule pssystemmodule){
		this.pssystemmodule = pssystemmodule;
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

	public java.lang.String getPluginTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPLUGINTAG2);
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

	public java.lang.String getRTObjectRepo(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRTOBJECTREPO);
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

	public boolean isLazyMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISLAZYMODE);
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

	public boolean isSingleInstance(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSINGLEINSTANCE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isTryMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISTRYMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
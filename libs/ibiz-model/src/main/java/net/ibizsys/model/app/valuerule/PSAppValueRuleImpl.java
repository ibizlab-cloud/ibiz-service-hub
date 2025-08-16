package net.ibizsys.model.app.valuerule;



public class PSAppValueRuleImpl extends net.ibizsys.model.app.PSApplicationObjectImpl implements net.ibizsys.model.app.valuerule.IPSAppValueRule{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCUSTOMOBJECT = "customObject";
	public final static String ATTR_GETCUSTOMPARAMS = "customParams";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSSYSPFPLUGIN = "getPSSysPFPlugin";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";
	public final static String ATTR_GETREGEXCODE = "regExCode";
	public final static String ATTR_GETREGEXCODE2 = "regExCode2";
	public final static String ATTR_GETREGEXCODE3 = "regExCode3";
	public final static String ATTR_GETREGEXCODE4 = "regExCode4";
	public final static String ATTR_GETRULEINFO = "ruleInfo";
	public final static String ATTR_GETRULEINFOLANRESTAG = "ruleInfoLanResTag";
	public final static String ATTR_GETRULEINFOPSLANGUAGERES = "getRuleInfoPSLanguageRes";
	public final static String ATTR_GETRULETAG = "ruleTag";
	public final static String ATTR_GETRULETAG2 = "ruleTag2";
	public final static String ATTR_GETRULETYPE = "ruleType";
	public final static String ATTR_GETSCRIPTCODE = "scriptCode";
	public final static String ATTR_GETUNIQUETAG = "uniqueTag";
	public final static String ATTR_ISENABLEBACKEND = "enableBackend";
	public final static String ATTR_ISENABLEFRONT = "enableFront";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getCustomObject(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCUSTOMOBJECT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getCustomParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCUSTOMPARAMS);
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定前端扩展插件");}
		return value;
	}

	public void setPSSysPFPlugin(net.ibizsys.model.res.IPSSysPFPlugin pssyspfplugin){
		this.pssyspfplugin = pssyspfplugin;
	}

	private net.ibizsys.model.res.IPSSysSFPlugin pssyssfplugin;

	public net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin(){
		if(this.pssyssfplugin != null) return this.pssyssfplugin;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSSFPLUGIN);
		if(value == null){
			return null;
		}
		this.pssyssfplugin = getPSModelObject(net.ibizsys.model.res.IPSSysSFPlugin.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSSFPLUGIN);
		return this.pssyssfplugin;
	}

	public net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPluginMust(){
		net.ibizsys.model.res.IPSSysSFPlugin value = this.getPSSysSFPlugin();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定后台扩展插件");}
		return value;
	}

	public void setPSSysSFPlugin(net.ibizsys.model.res.IPSSysSFPlugin pssyssfplugin){
		this.pssyssfplugin = pssyssfplugin;
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


	public java.lang.String getRegExCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREGEXCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRegExCode2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREGEXCODE2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRegExCode3(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREGEXCODE3);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRegExCode4(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREGEXCODE4);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRuleInfo(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRULEINFO);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRuleInfoLanResTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRULEINFOLANRESTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes ruleinfopslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getRuleInfoPSLanguageRes(){
		if(this.ruleinfopslanguageres != null) return this.ruleinfopslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRULEINFOPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.ruleinfopslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETRULEINFOPSLANGUAGERES);
		return this.ruleinfopslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getRuleInfoPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getRuleInfoPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定规则信息语言资源对象");}
		return value;
	}

	public void setRuleInfoPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes ruleinfopslanguageres){
		this.ruleinfopslanguageres = ruleinfopslanguageres;
	}


	public java.lang.String getRuleTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRULETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRuleTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRULETAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRuleType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRULETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getScriptCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSCRIPTCODE);
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

	public boolean isEnableBackend(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEBACKEND);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableFront(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEFRONT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
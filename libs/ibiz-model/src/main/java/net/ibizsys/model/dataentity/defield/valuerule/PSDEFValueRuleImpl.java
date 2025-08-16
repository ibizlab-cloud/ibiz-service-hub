package net.ibizsys.model.dataentity.defield.valuerule;



public class PSDEFValueRuleImpl extends net.ibizsys.model.dataentity.defield.PSDEFieldObjectImpl implements net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETPSDEFVRGROUPCONDITION = "getPSDEFVRGroupCondition";
	public final static String ATTR_GETPSSYSPFPLUGIN = "getPSSysPFPlugin";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETRULEINFO = "ruleInfo";
	public final static String ATTR_GETRULEINFOLANRESTAG = "ruleInfoLanResTag";
	public final static String ATTR_GETRULEINFOPSLANGUAGERES = "getRuleInfoPSLanguageRes";
	public final static String ATTR_GETRULETAG = "ruleTag";
	public final static String ATTR_GETRULETAG2 = "ruleTag2";
	public final static String ATTR_GETSCRIPTCODE = "scriptCode";
	public final static String ATTR_ISCHECKDEFAULT = "checkDefault";
	public final static String ATTR_ISCUSTOMCODE = "customCode";
	public final static String ATTR_ISDEFAULTMODE = "defaultMode";
	public final static String ATTR_ISENABLEBACKEND = "enableBackend";
	public final static String ATTR_ISENABLEFRONT = "enableFront";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRGroupCondition psdefvrgroupcondition;

	public net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRGroupCondition getPSDEFVRGroupCondition(){
		if(this.psdefvrgroupcondition != null) return this.psdefvrgroupcondition;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFVRGROUPCONDITION);
		if(value == null){
			return null;
		}
		this.psdefvrgroupcondition = getPSModelObject(net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRGroupCondition.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDEFVRGROUPCONDITION);
		return this.psdefvrgroupcondition;
	}

	public net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRGroupCondition getPSDEFVRGroupConditionMust(){
		net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRGroupCondition value = this.getPSDEFVRGroupCondition();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体属性值规则条件");}
		return value;
	}

	public void setPSDEFVRGroupCondition(net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRGroupCondition psdefvrgroupcondition){
		this.psdefvrgroupcondition = psdefvrgroupcondition;
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

	public java.lang.String getScriptCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSCRIPTCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isCheckDefault(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCHECKDEFAULT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isCustomCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCUSTOMCODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isDefaultMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDEFAULTMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
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
package net.ibizsys.model.dataentity.defield.valuerule;



public class PSDEFVRConditionImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRCondition{

	public final static String ATTR_GETCONDOP = "condOp";
	public final static String ATTR_GETCONDTAG = "condTag";
	public final static String ATTR_GETCONDTAG2 = "condTag2";
	public final static String ATTR_GETCONDTYPE = "condType";
	public final static String ATTR_GETRULEINFO = "ruleInfo";
	public final static String ATTR_GETRULEINFOLANRESTAG = "ruleInfoLanResTag";
	public final static String ATTR_GETRULEINFOPSLANGUAGERES = "getRuleInfoPSLanguageRes";
	public final static String ATTR_ISKEYCOND = "keyCond";
	public final static String ATTR_ISNOTMODE = "notMode";
	public final static String ATTR_ISTRYMODE = "tryMode";

	@Deprecated
	public java.lang.String getCondOp(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONDOP);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCondTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONDTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCondTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONDTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCondType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONDTYPE);
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


	public boolean isKeyCond(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISKEYCOND);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isNotMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISNOTMODE);
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
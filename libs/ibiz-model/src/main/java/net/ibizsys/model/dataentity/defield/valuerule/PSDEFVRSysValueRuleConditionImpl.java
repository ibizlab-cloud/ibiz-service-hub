package net.ibizsys.model.dataentity.defield.valuerule;



public class PSDEFVRSysValueRuleConditionImpl extends net.ibizsys.model.dataentity.defield.valuerule.PSDEFVRSingleConditionImpl implements net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRSysValueRuleCondition{

	public final static String ATTR_GETPSSYSVALUERULE = "getPSSysValueRule";
	public final static String ATTR_GETRULEINFO = "ruleInfo";
	private net.ibizsys.model.valuerule.IPSSysValueRule pssysvaluerule;

	public net.ibizsys.model.valuerule.IPSSysValueRule getPSSysValueRule(){
		if(this.pssysvaluerule != null) return this.pssysvaluerule;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSVALUERULE);
		if(value == null){
			return null;
		}
		this.pssysvaluerule = getPSModelObject(net.ibizsys.model.valuerule.IPSSysValueRule.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSVALUERULE);
		return this.pssysvaluerule;
	}

	public net.ibizsys.model.valuerule.IPSSysValueRule getPSSysValueRuleMust(){
		net.ibizsys.model.valuerule.IPSSysValueRule value = this.getPSSysValueRule();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统值规则对象");}
		return value;
	}

	public void setPSSysValueRule(net.ibizsys.model.valuerule.IPSSysValueRule pssysvaluerule){
		this.pssysvaluerule = pssysvaluerule;
	}


	public java.lang.String getRuleInfo(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRULEINFO);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
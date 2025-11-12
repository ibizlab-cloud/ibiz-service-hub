package net.ibizsys.model.control.form;



public class PSDEFormItemVRImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.control.form.IPSDEFormItemVR{

	public final static String ATTR_GETCHECKMODE = "checkMode";
	public final static String ATTR_GETMODELSTATE = "modelState";
	public final static String ATTR_GETPSDEFVALUERULE = "getPSDEFValueRule";
	public final static String ATTR_GETPSDEFORMITEMNAME = "getPSDEFormItemName";
	public final static String ATTR_GETPSSYSVALUERULE = "getPSSysValueRule";
	public final static String ATTR_GETVALUERULETYPE = "valueRuleType";

	public int getCheckMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCHECKMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getModelState(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMODELSTATE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule psdefvaluerule;

	public net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule getPSDEFValueRule(){
		if(this.psdefvaluerule != null) return this.psdefvaluerule;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFVALUERULE);
		if(value == null){
			return null;
		}
		this.psdefvaluerule = getPSModelObject(net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDEFVALUERULE);
		return this.psdefvaluerule;
	}

	public net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule getPSDEFValueRuleMust(){
		net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule value = this.getPSDEFValueRule();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定属性值规则 ");}
		return value;
	}

	public void setPSDEFValueRule(net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule psdefvaluerule){
		this.psdefvaluerule = psdefvaluerule;
	}


	public java.lang.String getPSDEFormItemName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFORMITEMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统值规则");}
		return value;
	}

	public void setPSSysValueRule(net.ibizsys.model.valuerule.IPSSysValueRule pssysvaluerule){
		this.pssysvaluerule = pssysvaluerule;
	}


	public java.lang.String getValueRuleType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUERULETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
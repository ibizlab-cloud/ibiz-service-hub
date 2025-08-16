package net.ibizsys.model.dataentity.action;



public class PSDEActionVRImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.action.IPSDEActionVR{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSDEFVALUERULE = "getPSDEFValueRule";
	public final static String ATTR_GETPSDEFIELD = "getPSDEField";
	public final static String ATTR_GETVALUERULETYPE = "valueRuleType";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
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
		this.psdefvaluerule = this.getPSDEFieldMust().getPSDEFValueRule(value, false);
		return this.psdefvaluerule;
	}

	public net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule getPSDEFValueRuleMust(){
		net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule value = this.getPSDEFValueRule();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定属性值规则");}
		return value;
	}

	public void setPSDEFValueRule(net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule psdefvaluerule){
		this.psdefvaluerule = psdefvaluerule;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField psdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getPSDEField(){
		if(this.psdefield != null) return this.psdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdefield = ipsdataentity.getPSDEField(value, false);
		return this.psdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定属性对象");}
		return value;
	}

	public void setPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField psdefield){
		this.psdefield = psdefield;
	}


	public java.lang.String getValueRuleType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUERULETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
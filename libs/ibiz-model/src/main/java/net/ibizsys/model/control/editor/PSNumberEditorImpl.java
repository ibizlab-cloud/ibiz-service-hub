package net.ibizsys.model.control.editor;



public class PSNumberEditorImpl extends net.ibizsys.model.control.PSEditorImpl implements net.ibizsys.model.control.editor.IPSNumberEditor{

	public final static String ATTR_GETMAXVALUE = "maxValue";
	public final static String ATTR_GETMINVALUE = "minValue";
	public final static String ATTR_GETPSSYSVALUERULE = "getPSSysValueRule";
	public final static String ATTR_GETPRECISION = "precision";
	public final static String ATTR_GETSCALE = "scale";

	public java.lang.Double getMaxValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAXVALUE);
		if(value == null){
			return null;
		}
		return value.asDouble();
	}

	public java.lang.Double getMinValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINVALUE);
		if(value == null){
			return null;
		}
		return value.asDouble();
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定值规则");}
		return value;
	}

	public void setPSSysValueRule(net.ibizsys.model.valuerule.IPSSysValueRule pssysvaluerule){
		this.pssysvaluerule = pssysvaluerule;
	}


	@Deprecated
	public java.lang.Integer getPrecision(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPRECISION);
		if(value == null){
			return null;
		}
		return value.asInt();
	}

	public java.lang.Integer getScale(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSCALE);
		if(value == null){
			return null;
		}
		return value.asInt();
	}
}
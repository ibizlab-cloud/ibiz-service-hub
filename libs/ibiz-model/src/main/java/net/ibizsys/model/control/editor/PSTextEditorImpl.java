package net.ibizsys.model.control.editor;



public class PSTextEditorImpl extends net.ibizsys.model.control.PSEditorImpl implements net.ibizsys.model.control.editor.IPSTextEditor{

	public final static String ATTR_GETMAXLENGTH = "maxLength";
	public final static String ATTR_GETMINLENGTH = "minLength";
	public final static String ATTR_GETPSAPPCODELIST = "getPSAppCodeList";
	public final static String ATTR_GETPSSYSVALUERULE = "getPSSysValueRule";
	public final static String ATTR_ISSHOWMAXLENGTH = "showMaxLength";

	public java.lang.Integer getMaxLength(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAXLENGTH);
		if(value == null){
			return null;
		}
		return value.asInt();
	}

	public java.lang.Integer getMinLength(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINLENGTH);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.app.codelist.IPSAppCodeList psappcodelist;

	public net.ibizsys.model.app.codelist.IPSAppCodeList getPSAppCodeList(){
		if(this.psappcodelist != null) return this.psappcodelist;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPCODELIST);
		if(value == null){
			return null;
		}
		this.psappcodelist = getPSModelObject(net.ibizsys.model.app.codelist.IPSAppCodeList.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPCODELIST);
		return this.psappcodelist;
	}

	public net.ibizsys.model.app.codelist.IPSAppCodeList getPSAppCodeListMust(){
		net.ibizsys.model.app.codelist.IPSAppCodeList value = this.getPSAppCodeList();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定阈值应用代码表对象");}
		return value;
	}

	public void setPSAppCodeList(net.ibizsys.model.app.codelist.IPSAppCodeList psappcodelist){
		this.psappcodelist = psappcodelist;
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


	public boolean isShowMaxLength(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSHOWMAXLENGTH);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
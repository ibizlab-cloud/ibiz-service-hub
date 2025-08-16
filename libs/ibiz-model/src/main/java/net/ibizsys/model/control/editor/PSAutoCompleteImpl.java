package net.ibizsys.model.control.editor;



public class PSAutoCompleteImpl extends net.ibizsys.model.control.PSAjaxEditorImpl implements net.ibizsys.model.control.editor.IPSAutoComplete
		,net.ibizsys.model.control.editor.IPSTextEditor{

	public final static String ATTR_GETACMINCHARS = "aCMinChars";
	public final static String ATTR_GETCONTEXTJOSTRING = "contextJOString";
	public final static String ATTR_GETITEMPARAMJO = "itemParamJO";
	public final static String ATTR_GETMAXLENGTH = "maxLength";
	public final static String ATTR_GETMINLENGTH = "minLength";
	public final static String ATTR_GETPSAPPCODELIST = "getPSAppCodeList";
	public final static String ATTR_GETPSAPPDEACMODE = "getPSAppDEACMode";
	public final static String ATTR_GETPSAPPDEDATASET = "getPSAppDEDataSet";
	public final static String ATTR_GETPSAPPDATAENTITY = "getPSAppDataEntity";
	public final static String ATTR_GETPSSYSVALUERULE = "getPSSysValueRule";
	public final static String ATTR_GETPSUIACTIONGROUP = "getPSUIActionGroup";
	public final static String ATTR_GETPARAMJOSTRING = "paramJOString";
	public final static String ATTR_ISENABLEAC = "enableAC";
	public final static String ATTR_ISFORCESELECTION = "forceSelection";
	public final static String ATTR_ISSHOWMAXLENGTH = "showMaxLength";
	public final static String ATTR_ISSHOWTRIGGER = "showTrigger";

	public int getACMinChars(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACMINCHARS);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getContextJOString(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTEXTJOSTRING);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getItemParamJO(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMPARAMJO);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

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

	private net.ibizsys.model.app.dataentity.IPSAppDEACMode psappdeacmode;

	public net.ibizsys.model.app.dataentity.IPSAppDEACMode getPSAppDEACMode(){
		if(this.psappdeacmode != null) return this.psappdeacmode;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEACMODE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.psappdeacmode = ipsappdataentity.getPSAppDEACMode(value, false);
		return this.psappdeacmode;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEACMode getPSAppDEACModeMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEACMode value = this.getPSAppDEACMode();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体自填模式对象");}
		return value;
	}

	public void setPSAppDEACMode(net.ibizsys.model.app.dataentity.IPSAppDEACMode psappdeacmode){
		this.psappdeacmode = psappdeacmode;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEDataSet psappdedataset;

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSet(){
		if(this.psappdedataset != null) return this.psappdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEDATASET);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.psappdedataset = ipsappdataentity.getPSAppDEDataSet(value, false);
		return this.psappdedataset;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSetMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEDataSet value = this.getPSAppDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体结果集对象");}
		return value;
	}

	public void setPSAppDEDataSet(net.ibizsys.model.app.dataentity.IPSAppDEDataSet psappdedataset){
		this.psappdedataset = psappdedataset;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDataEntity psappdataentity;

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity(){
		if(this.psappdataentity != null) return this.psappdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDATAENTITY);
		if(value == null){
			return null;
		}
		this.psappdataentity = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPDATAENTITY);
		return this.psappdataentity;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust(){
		net.ibizsys.model.app.dataentity.IPSAppDataEntity value = this.getPSAppDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体对象");}
		return value;
	}

	public void setPSAppDataEntity(net.ibizsys.model.app.dataentity.IPSAppDataEntity psappdataentity){
		this.psappdataentity = psappdataentity;
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

	private net.ibizsys.model.view.IPSUIActionGroup psuiactiongroup;

	public net.ibizsys.model.view.IPSUIActionGroup getPSUIActionGroup(){
		if(this.psuiactiongroup != null) return this.psuiactiongroup;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSUIACTIONGROUP);
		if(value == null){
			return null;
		}
		this.psuiactiongroup = getPSModelObject(net.ibizsys.model.view.IPSUIActionGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSUIACTIONGROUP);
		return this.psuiactiongroup;
	}

	public net.ibizsys.model.view.IPSUIActionGroup getPSUIActionGroupMust(){
		net.ibizsys.model.view.IPSUIActionGroup value = this.getPSUIActionGroup();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定相关界面行为组");}
		return value;
	}

	public void setPSUIActionGroup(net.ibizsys.model.view.IPSUIActionGroup psuiactiongroup){
		this.psuiactiongroup = psuiactiongroup;
	}


	public java.lang.String getParamJOString(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAMJOSTRING);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isEnableAC(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEAC);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isForceSelection(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISFORCESELECTION);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isShowMaxLength(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSHOWMAXLENGTH);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isShowTrigger(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSHOWTRIGGER);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
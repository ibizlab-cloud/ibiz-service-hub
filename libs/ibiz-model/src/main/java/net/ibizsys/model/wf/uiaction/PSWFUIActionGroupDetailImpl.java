package net.ibizsys.model.wf.uiaction;



public class PSWFUIActionGroupDetailImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.wf.uiaction.IPSWFUIActionGroupDetail
		,net.ibizsys.model.app.wf.IPSAppWFUIActionGroupDetail{

	public final static String ATTR_GETACTIONLEVEL = "actionLevel";
	public final static String ATTR_GETBUTTONSTYLE = "buttonStyle";
	public final static String ATTR_GETCAPPSLANGUAGERES = "getCapPSLanguageRes";
	public final static String ATTR_GETCAPTION = "caption";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDETAILTAG = "detailTag";
	public final static String ATTR_GETDETAILTAG2 = "detailTag2";
	public final static String ATTR_GETENABLESCRIPTCODE = "enableScriptCode";
	public final static String ATTR_GETPSSYSPFPLUGIN = "getPSSysPFPlugin";
	public final static String ATTR_GETPSUIACTION = "getPSUIAction";
	public final static String ATTR_GETTOOLTIP = "tooltip";
	public final static String ATTR_GETTOOLTIPPSLANGUAGERES = "getTooltipPSLanguageRes";
	public final static String ATTR_GETUIACTIONPARAMJO = "uIActionParamJO";
	public final static String ATTR_GETVISIBLESCRIPTCODE = "visibleScriptCode";
	public final static String ATTR_ISADDSEPARATOR = "addSeparator";
	public final static String ATTR_ISSHOWCAPTION = "showCaption";
	public final static String ATTR_ISSHOWICON = "showIcon";

	public int getActionLevel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONLEVEL);
		if(value == null){
			return 100;
		}
		return value.asInt();
	}

	public java.lang.String getButtonStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBUTTONSTYLE);
		if(value == null){
			return "100";
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes cappslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageRes(){
		if(this.cappslanguageres != null) return this.cappslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCAPPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.cappslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETCAPPSLANGUAGERES);
		return this.cappslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getCapPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定标题语言资源对象");}
		return value;
	}

	public void setCapPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes cappslanguageres){
		this.cappslanguageres = cappslanguageres;
	}


	public java.lang.String getCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCAPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDetailTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDETAILTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDetailTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDETAILTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getEnableScriptCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENABLESCRIPTCODE);
		if(value == null){
			return null;
		}
		return value.asText();
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

	private net.ibizsys.model.view.IPSUIAction psuiaction;

	public net.ibizsys.model.view.IPSUIAction getPSUIAction(){
		if(this.psuiaction != null) return this.psuiaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSUIACTION);
		if(value == null){
			return null;
		}
		this.psuiaction = getPSModelObject(net.ibizsys.model.view.IPSUIAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSUIACTION);
		return this.psuiaction;
	}

	public net.ibizsys.model.view.IPSUIAction getPSUIActionMust(){
		net.ibizsys.model.view.IPSUIAction value = this.getPSUIAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定界面行为对象");}
		return value;
	}

	public void setPSUIAction(net.ibizsys.model.view.IPSUIAction psuiaction){
		this.psuiaction = psuiaction;
	}


	public java.lang.String getTooltip(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTOOLTIP);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes tooltippslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageRes(){
		if(this.tooltippslanguageres != null) return this.tooltippslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTOOLTIPPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.tooltippslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETTOOLTIPPSLANGUAGERES);
		return this.tooltippslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getTooltipPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定提示语言资源对象");}
		return value;
	}

	public void setTooltipPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes tooltippslanguageres){
		this.tooltippslanguageres = tooltippslanguageres;
	}


	public com.fasterxml.jackson.databind.node.ObjectNode getUIActionParamJO(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUIACTIONPARAMJO);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getVisibleScriptCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVISIBLESCRIPTCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isAddSeparator(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISADDSEPARATOR);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isShowCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSHOWCAPTION);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isShowIcon(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSHOWICON);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
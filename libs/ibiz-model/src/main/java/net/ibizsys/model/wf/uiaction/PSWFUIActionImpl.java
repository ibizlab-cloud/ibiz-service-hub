package net.ibizsys.model.wf.uiaction;



public class PSWFUIActionImpl extends net.ibizsys.model.view.PSUIActionImpl implements net.ibizsys.model.wf.uiaction.IPSWFUIAction
		,net.ibizsys.model.app.wf.IPSAppWFUIAction{

	public final static String ATTR_GETACTIONLEVEL = "actionLevel";
	public final static String ATTR_GETACTIONTARGET = "actionTarget";
	public final static String ATTR_GETBUTTONSTYLE = "buttonStyle";
	public final static String ATTR_GETCMPSLANGUAGERES = "getCMPSLanguageRes";
	public final static String ATTR_GETCAPPSLANGUAGERES = "getCapPSLanguageRes";
	public final static String ATTR_GETCAPTION = "caption";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCONFIRMMSG = "confirmMsg";
	public final static String ATTR_GETCONTEXTJOSTRING = "contextJOString";
	public final static String ATTR_GETCOUNTERID = "counterId";
	public final static String ATTR_GETDATAACCESSACTION = "dataAccessAction";
	public final static String ATTR_GETDIALOGRESULT = "dialogResult";
	public final static String ATTR_GETFRONTPSAPPVIEW = "getFrontPSAppView";
	public final static String ATTR_GETFRONTPROCESSTYPE = "frontProcessType";
	public final static String ATTR_GETFULLCODENAME = "fullCodeName";
	public final static String ATTR_GETHTMLPAGEURL = "htmlPageUrl";
	public final static String ATTR_GETNEXTPSUIACTION = "getNextPSUIAction";
	public final static String ATTR_GETPSAPPCOUNTER = "getPSAppCounter";
	public final static String ATTR_GETPSAPPDEMETHOD = "getPSAppDEMethod";
	public final static String ATTR_GETPSAPPDATAENTITY = "getPSAppDataEntity";
	public final static String ATTR_GETPSAPPWF = "getPSAppWF";
	public final static String ATTR_GETPSAPPWFVER = "getPSAppWFVer";
	public final static String ATTR_GETPSNAVIGATECONTEXTS = "getPSNavigateContexts";
	public final static String ATTR_GETPSNAVIGATEPARAMS = "getPSNavigateParams";
	public final static String ATTR_GETPSSYSIMAGE = "getPSSysImage";
	public final static String ATTR_GETPSSYSPFPLUGIN = "getPSSysPFPlugin";
	public final static String ATTR_GETPSWORKFLOW = "getPSWorkflow";
	public final static String ATTR_GETPARAMITEM = "paramItem";
	public final static String ATTR_GETPREDEFINEDTYPE = "predefinedType";
	public final static String ATTR_GETREFRESHMODE = "refreshMode";
	public final static String ATTR_GETSMPSLANGUAGERES = "getSMPSLanguageRes";
	public final static String ATTR_GETSCRIPTCODE = "scriptCode";
	public final static String ATTR_GETSUCCESSMSG = "successMsg";
	public final static String ATTR_GETTEXTITEM = "textItem";
	public final static String ATTR_GETTIMEOUT = "timeout";
	public final static String ATTR_GETTOOLTIP = "tooltip";
	public final static String ATTR_GETTOOLTIPPSLANGUAGERES = "getTooltipPSLanguageRes";
	public final static String ATTR_GETUIACTIONMODE = "uIActionMode";
	public final static String ATTR_GETUIACTIONPARAMJO = "uIActionParamJO";
	public final static String ATTR_GETUIACTIONTAG = "uIActionTag";
	public final static String ATTR_GETUIACTIONTYPE = "uIActionType";
	public final static String ATTR_GETUILOGICATTACHMODE = "uILogicAttachMode";
	public final static String ATTR_GETUILOGICTYPE = "uILogicType";
	public final static String ATTR_GETVALUEITEM = "valueItem";
	public final static String ATTR_ISCLOSEEDITVIEW = "closeEditView";
	public final static String ATTR_ISCLOSEPOPUPVIEW = "closePopupView";
	public final static String ATTR_ISENABLECONFIRM = "enableConfirm";
	public final static String ATTR_ISENABLERUNTIMEMODEL = "enableRuntimeModel";
	public final static String ATTR_ISENABLETOGGLEMODE = "enableToggleMode";
	public final static String ATTR_ISGROUP = "group";
	public final static String ATTR_ISRELOADDATA = "reloadData";
	public final static String ATTR_ISSAVETARGETFIRST = "saveTargetFirst";
	public final static String ATTR_ISSHOWBUSYINDICATOR = "showBusyIndicator";

	public int getActionLevel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONLEVEL);
		if(value == null){
			return 100;
		}
		return value.asInt();
	}

	public java.lang.String getActionTarget(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONTARGET);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getButtonStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBUTTONSTYLE);
		if(value == null){
			return "100";
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes cmpslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getCMPSLanguageRes(){
		if(this.cmpslanguageres != null) return this.cmpslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCMPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.cmpslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETCMPSLANGUAGERES);
		return this.cmpslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getCMPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getCMPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定确认信息语言资源");}
		return value;
	}

	public void setCMPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes cmpslanguageres){
		this.cmpslanguageres = cmpslanguageres;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定标题语言资源");}
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

	public java.lang.String getConfirmMsg(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONFIRMMSG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getContextJOString(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTEXTJOSTRING);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getCounterId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOUNTERID);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getDataAccessAction(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATAACCESSACTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDialogResult(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDIALOGRESULT);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.view.IPSAppView frontpsappview;

	public net.ibizsys.model.app.view.IPSAppView getFrontPSAppView(){
		if(this.frontpsappview != null) return this.frontpsappview;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFRONTPSAPPVIEW);
		if(value == null){
			return null;
		}
		this.frontpsappview = getPSModelObject(net.ibizsys.model.app.view.IPSAppView.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETFRONTPSAPPVIEW);
		return this.frontpsappview;
	}

	public net.ibizsys.model.app.view.IPSAppView getFrontPSAppViewMust(){
		net.ibizsys.model.app.view.IPSAppView value = this.getFrontPSAppView();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定前端应用视图");}
		return value;
	}

	public void setFrontPSAppView(net.ibizsys.model.app.view.IPSAppView frontpsappview){
		this.frontpsappview = frontpsappview;
	}


	public java.lang.String getFrontProcessType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFRONTPROCESSTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getFullCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFULLCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getHtmlPageUrl(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHTMLPAGEURL);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.view.IPSUIAction nextpsuiaction;

	public net.ibizsys.model.view.IPSUIAction getNextPSUIAction(){
		if(this.nextpsuiaction != null) return this.nextpsuiaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNEXTPSUIACTION);
		if(value == null){
			return null;
		}
		this.nextpsuiaction = getPSModelObject(net.ibizsys.model.view.IPSUIAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETNEXTPSUIACTION);
		return this.nextpsuiaction;
	}

	public net.ibizsys.model.view.IPSUIAction getNextPSUIActionMust(){
		net.ibizsys.model.view.IPSUIAction value = this.getNextPSUIAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定下一步界面行为");}
		return value;
	}

	public void setNextPSUIAction(net.ibizsys.model.view.IPSUIAction nextpsuiaction){
		this.nextpsuiaction = nextpsuiaction;
	}

	private net.ibizsys.model.app.control.IPSAppCounter psappcounter;

	@Deprecated
	public net.ibizsys.model.app.control.IPSAppCounter getPSAppCounter(){
		if(this.psappcounter != null) return this.psappcounter;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPCOUNTER);
		if(value == null){
			return null;
		}
		this.psappcounter = getPSModelObject(net.ibizsys.model.app.control.IPSAppCounter.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPCOUNTER);
		return this.psappcounter;
	}

	public net.ibizsys.model.app.control.IPSAppCounter getPSAppCounterMust(){
		net.ibizsys.model.app.control.IPSAppCounter value = this.getPSAppCounter();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "[getPSAppCounter]返回空值");}
		return value;
	}

	public void setPSAppCounter(net.ibizsys.model.app.control.IPSAppCounter psappcounter){
		this.psappcounter = psappcounter;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEMethod psappdemethod;

	public net.ibizsys.model.app.dataentity.IPSAppDEMethod getPSAppDEMethod(){
		if(this.psappdemethod != null) return this.psappdemethod;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEMETHOD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.psappdemethod = ipsappdataentity.getPSAppDEMethod(value, false);
		return this.psappdemethod;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEMethod getPSAppDEMethodMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEMethod value = this.getPSAppDEMethod();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体方法");}
		return value;
	}

	public void setPSAppDEMethod(net.ibizsys.model.app.dataentity.IPSAppDEMethod psappdemethod){
		this.psappdemethod = psappdemethod;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDataEntity psappdataentity;

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity(){
		if(this.psappdataentity != null) return this.psappdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDATAENTITY);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.IPSApplication ipsapplication = getParentPSModelObject(net.ibizsys.model.app.IPSApplication.class);
		this.psappdataentity = ipsapplication.getPSAppDataEntity(value, false);
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

	private net.ibizsys.model.app.wf.IPSAppWF psappwf;

	public net.ibizsys.model.app.wf.IPSAppWF getPSAppWF(){
		if(this.psappwf != null) return this.psappwf;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPWF);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.IPSApplication ipsapplication = getParentPSModelObject(net.ibizsys.model.app.IPSApplication.class);
		this.psappwf = ipsapplication.getPSAppWF(value, false);
		return this.psappwf;
	}

	public net.ibizsys.model.app.wf.IPSAppWF getPSAppWFMust(){
		net.ibizsys.model.app.wf.IPSAppWF value = this.getPSAppWF();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用工作流");}
		return value;
	}

	public void setPSAppWF(net.ibizsys.model.app.wf.IPSAppWF psappwf){
		this.psappwf = psappwf;
	}

	private net.ibizsys.model.app.wf.IPSAppWFVer psappwfver;

	public net.ibizsys.model.app.wf.IPSAppWFVer getPSAppWFVer(){
		if(this.psappwfver != null) return this.psappwfver;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPWFVER);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.wf.IPSAppWF ipsappwf = this.getPSAppWFMust();
		this.psappwfver = ipsappwf.getPSAppWFVer(value, false);
		return this.psappwfver;
	}

	public net.ibizsys.model.app.wf.IPSAppWFVer getPSAppWFVerMust(){
		net.ibizsys.model.app.wf.IPSAppWFVer value = this.getPSAppWFVer();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用工作流版本");}
		return value;
	}

	public void setPSAppWFVer(net.ibizsys.model.app.wf.IPSAppWFVer psappwfver){
		this.psappwfver = psappwfver;
	}


	private java.util.List<net.ibizsys.model.control.IPSNavigateContext> psnavigatecontexts = null;
	public java.util.List<net.ibizsys.model.control.IPSNavigateContext> getPSNavigateContexts(){
		if(this.psnavigatecontexts == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSNAVIGATECONTEXTS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.IPSNavigateContext> list = new java.util.ArrayList<net.ibizsys.model.control.IPSNavigateContext>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.IPSNavigateContext obj = this.getPSModelObject(net.ibizsys.model.control.IPSNavigateContext.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSNAVIGATECONTEXTS);
				if(obj!=null)list.add(obj);
			}
			this.psnavigatecontexts = list;
		}
		return (this.psnavigatecontexts.size() == 0)? null : this.psnavigatecontexts;
	}

	public net.ibizsys.model.control.IPSNavigateContext getPSNavigateContext(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.IPSNavigateContext.class, this.getPSNavigateContexts(), objKey, bTryMode);
	}
	public void setPSNavigateContexts(java.util.List<net.ibizsys.model.control.IPSNavigateContext> list){
		this.psnavigatecontexts = list;
	}

	private java.util.List<net.ibizsys.model.control.IPSNavigateParam> psnavigateparams = null;
	public java.util.List<net.ibizsys.model.control.IPSNavigateParam> getPSNavigateParams(){
		if(this.psnavigateparams == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSNAVIGATEPARAMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.IPSNavigateParam> list = new java.util.ArrayList<net.ibizsys.model.control.IPSNavigateParam>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.IPSNavigateParam obj = this.getPSModelObject(net.ibizsys.model.control.IPSNavigateParam.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSNAVIGATEPARAMS);
				if(obj!=null)list.add(obj);
			}
			this.psnavigateparams = list;
		}
		return (this.psnavigateparams.size() == 0)? null : this.psnavigateparams;
	}

	public net.ibizsys.model.control.IPSNavigateParam getPSNavigateParam(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.IPSNavigateParam.class, this.getPSNavigateParams(), objKey, bTryMode);
	}
	public void setPSNavigateParams(java.util.List<net.ibizsys.model.control.IPSNavigateParam> list){
		this.psnavigateparams = list;
	}
	private net.ibizsys.model.res.IPSSysImage pssysimage;

	public net.ibizsys.model.res.IPSSysImage getPSSysImage(){
		if(this.pssysimage != null) return this.pssysimage;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSIMAGE);
		if(value == null){
			return null;
		}
		this.pssysimage = getPSModelObject(net.ibizsys.model.res.IPSSysImage.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSIMAGE);
		return this.pssysimage;
	}

	public net.ibizsys.model.res.IPSSysImage getPSSysImageMust(){
		net.ibizsys.model.res.IPSSysImage value = this.getPSSysImage();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定界面行为图标对象");}
		return value;
	}

	public void setPSSysImage(net.ibizsys.model.res.IPSSysImage pssysimage){
		this.pssysimage = pssysimage;
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

	private net.ibizsys.model.wf.IPSWorkflow psworkflow;

	@Deprecated
	public net.ibizsys.model.wf.IPSWorkflow getPSWorkflow(){
		if(this.psworkflow != null) return this.psworkflow;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSWORKFLOW);
		if(value == null){
			return null;
		}
		this.psworkflow = getPSModelObject(net.ibizsys.model.wf.IPSWorkflow.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSWORKFLOW);
		return this.psworkflow;
	}

	public net.ibizsys.model.wf.IPSWorkflow getPSWorkflowMust(){
		net.ibizsys.model.wf.IPSWorkflow value = this.getPSWorkflow();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "[getPSWorkflow]返回空值");}
		return value;
	}

	public void setPSWorkflow(net.ibizsys.model.wf.IPSWorkflow psworkflow){
		this.psworkflow = psworkflow;
	}


	public java.lang.String getParamItem(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAMITEM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPredefinedType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPREDEFINEDTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getRefreshMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFRESHMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.res.IPSLanguageRes smpslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getSMPSLanguageRes(){
		if(this.smpslanguageres != null) return this.smpslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSMPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.smpslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETSMPSLANGUAGERES);
		return this.smpslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getSMPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getSMPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定成功信息语言资源");}
		return value;
	}

	public void setSMPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes smpslanguageres){
		this.smpslanguageres = smpslanguageres;
	}


	public java.lang.String getScriptCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSCRIPTCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSuccessMsg(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSUCCESSMSG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTextItem(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEXTITEM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public long getTimeout(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTIMEOUT);
		if(value == null){
			return 0l;
		}
		return value.asLong();
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定操作提示语言资源");}
		return value;
	}

	public void setTooltipPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes tooltippslanguageres){
		this.tooltippslanguageres = tooltippslanguageres;
	}


	public java.lang.String getUIActionMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUIACTIONMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getUIActionParamJO(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUIACTIONPARAMJO);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	@Deprecated
	public java.lang.String getUIActionTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUIACTIONTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUIActionType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUIACTIONTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUILogicAttachMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUILOGICATTACHMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUILogicType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUILOGICTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getValueItem(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUEITEM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isCloseEditView(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCLOSEEDITVIEW);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isClosePopupView(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCLOSEPOPUPVIEW);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableConfirm(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLECONFIRM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableRuntimeModel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLERUNTIMEMODEL);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isEnableToggleMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLETOGGLEMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isGroup(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISGROUP);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isReloadData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISRELOADDATA);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isSaveTargetFirst(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSAVETARGETFIRST);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isShowBusyIndicator(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSHOWBUSYINDICATOR);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}
}
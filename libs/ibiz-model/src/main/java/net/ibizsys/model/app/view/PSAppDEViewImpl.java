package net.ibizsys.model.app.view;



public class PSAppDEViewImpl extends net.ibizsys.model.app.view.PSAppViewImpl implements net.ibizsys.model.app.view.IPSAppDEView
		,net.ibizsys.model.app.view.IPSAppDEWFView
		,net.ibizsys.model.app.view.IPSAppDEWFActionView{

	public final static String ATTR_GETACCUSERMODE = "accUserMode";
	public final static String ATTR_GETCAPPSLANGUAGERES = "getCapPSLanguageRes";
	public final static String ATTR_GETCAPTION = "caption";
	public final static String ATTR_GETEXTENDMODE = "extendMode";
	public final static String ATTR_GETFUNCVIEWMODE = "funcViewMode";
	public final static String ATTR_GETFUNCVIEWPARAM = "funcViewParam";
	public final static String ATTR_GETHEIGHT = "height";
	public final static String ATTR_GETOPENMODE = "openMode";
	public final static String ATTR_GETPSAPPCOUNTERREF = "getPSAppCounterRef";
	public final static String ATTR_GETPSAPPWF = "getPSAppWF";
	public final static String ATTR_GETPSAPPWFVER = "getPSAppWFVer";
	public final static String ATTR_GETPSDEVIEWCODENAME = "getPSDEViewCodeName";
	public final static String ATTR_GETPSDEVIEWID = "getPSDEViewId";
	public final static String ATTR_GETPSWFVERSION = "getPSWFVersion";
	public final static String ATTR_GETPSWORKFLOW = "getPSWorkflow";
	public final static String ATTR_GETPARENTPSAPPDATAENTITY = "getParentPSAppDataEntity";
	public final static String ATTR_GETSUBCAPPSLANGUAGERES = "getSubCapPSLanguageRes";
	public final static String ATTR_GETSUBCAPTION = "subCaption";
	public final static String ATTR_GETTEMPMODE = "tempMode";
	public final static String ATTR_GETTITLE = "title";
	public final static String ATTR_GETTITLEPSLANGUAGERES = "getTitlePSLanguageRes";
	public final static String ATTR_GETWFSTEPVALUE = "wFStepValue";
	public final static String ATTR_GETWFUTILTYPE = "wFUtilType";
	public final static String ATTR_GETWIDTH = "width";
	public final static String ATTR_ISENABLEDP = "enableDP";
	public final static String ATTR_ISENABLEWF = "enableWF";
	public final static String ATTR_ISSHOWCAPTIONBAR = "showCaptionBar";
	public final static String ATTR_ISWFIAMODE = "wFIAMode";

	public int getAccUserMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACCUSERMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
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

	@Deprecated
	public int getExtendMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXTENDMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getFuncViewMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFUNCVIEWMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getFuncViewParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFUNCVIEWPARAM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getHeight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHEIGHT);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getOpenMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETOPENMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.control.IPSAppCounterRef psappcounterref;

	public net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRef(){
		if(this.psappcounterref != null) return this.psappcounterref;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPCOUNTERREF);
		if(value == null){
			return null;
		}
		this.psappcounterref = this.getPSAppCounterRef(value, false);
		return this.psappcounterref;
	}

	public net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRefMust(){
		net.ibizsys.model.app.control.IPSAppCounterRef value = this.getPSAppCounterRef();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用计数器引用");}
		return value;
	}

	public void setPSAppCounterRef(net.ibizsys.model.app.control.IPSAppCounterRef psappcounterref){
		this.psappcounterref = psappcounterref;
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
		this.psappwfver = this.getPSAppWFMust().getPSAppWFVer(value, false);
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


	public java.lang.String getPSDEViewCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEVIEWCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPSDEViewId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEVIEWID);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.wf.IPSWFVersion pswfversion;

	public net.ibizsys.model.wf.IPSWFVersion getPSWFVersion(){
		if(this.pswfversion != null) return this.pswfversion;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSWFVERSION);
		if(value == null){
			return null;
		}
		this.pswfversion = getPSModelObject(net.ibizsys.model.wf.IPSWFVersion.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSWFVERSION);
		return this.pswfversion;
	}

	public net.ibizsys.model.wf.IPSWFVersion getPSWFVersionMust(){
		net.ibizsys.model.wf.IPSWFVersion value = this.getPSWFVersion();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定工作流版本对象");}
		return value;
	}

	public void setPSWFVersion(net.ibizsys.model.wf.IPSWFVersion pswfversion){
		this.pswfversion = pswfversion;
	}

	private net.ibizsys.model.wf.IPSWorkflow psworkflow;

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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定工作流对象");}
		return value;
	}

	public void setPSWorkflow(net.ibizsys.model.wf.IPSWorkflow psworkflow){
		this.psworkflow = psworkflow;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDataEntity parentpsappdataentity;

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getParentPSAppDataEntity(){
		if(this.parentpsappdataentity != null) return this.parentpsappdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARENTPSAPPDATAENTITY);
		if(value == null){
			return null;
		}
		this.parentpsappdataentity = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPARENTPSAPPDATAENTITY);
		return this.parentpsappdataentity;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getParentPSAppDataEntityMust(){
		net.ibizsys.model.app.dataentity.IPSAppDataEntity value = this.getParentPSAppDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定父应用实体");}
		return value;
	}

	public void setParentPSAppDataEntity(net.ibizsys.model.app.dataentity.IPSAppDataEntity parentpsappdataentity){
		this.parentpsappdataentity = parentpsappdataentity;
	}

	private net.ibizsys.model.res.IPSLanguageRes subcappslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getSubCapPSLanguageRes(){
		if(this.subcappslanguageres != null) return this.subcappslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSUBCAPPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.subcappslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETSUBCAPPSLANGUAGERES);
		return this.subcappslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getSubCapPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getSubCapPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定子标题语言资源");}
		return value;
	}

	public void setSubCapPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes subcappslanguageres){
		this.subcappslanguageres = subcappslanguageres;
	}


	public java.lang.String getSubCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSUBCAPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getTempMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEMPMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getTitle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTITLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes titlepslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getTitlePSLanguageRes(){
		if(this.titlepslanguageres != null) return this.titlepslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTITLEPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.titlepslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETTITLEPSLANGUAGERES);
		return this.titlepslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getTitlePSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getTitlePSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定抬头语言资源");}
		return value;
	}

	public void setTitlePSLanguageRes(net.ibizsys.model.res.IPSLanguageRes titlepslanguageres){
		this.titlepslanguageres = titlepslanguageres;
	}


	@Deprecated
	public java.lang.String getWFStepValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFSTEPVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getWFUtilType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFUTILTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWIDTH);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public boolean isEnableDP(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEDP);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableWF(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEWF);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isShowCaptionBar(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSHOWCAPTIONBAR);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isWFIAMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISWFIAMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
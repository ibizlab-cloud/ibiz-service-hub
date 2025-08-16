package net.ibizsys.model.app.view;



public class PSAppViewImpl extends net.ibizsys.model.app.PSApplicationObjectImpl implements net.ibizsys.model.app.view.IPSAppView{

	public final static String ATTR_GETACCUSERMODE = "accUserMode";
	public final static String ATTR_GETACCESSKEY = "accessKey";
	public final static String ATTR_GETCAPPSLANGUAGERES = "getCapPSLanguageRes";
	public final static String ATTR_GETCAPTION = "caption";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDYNASYSMODE = "dynaSysMode";
	public final static String ATTR_GETFULLCODENAME = "fullCodeName";
	public final static String ATTR_GETHEIGHT = "height";
	public final static String ATTR_GETMAINMENUALIGN = "mainMenuAlign";
	public final static String ATTR_GETOPENMODE = "openMode";
	public final static String ATTR_GETPSAPPCOUNTERREFS = "getPSAppCounterRefs";
	public final static String ATTR_GETPSAPPDATAENTITY = "getPSAppDataEntity";
	public final static String ATTR_GETPSAPPMODULE = "getPSAppModule";
	public final static String ATTR_GETPSAPPVIEWENGINES = "getPSAppViewEngines";
	public final static String ATTR_GETPSAPPVIEWLOGICS = "getPSAppViewLogics";
	public final static String ATTR_GETPSAPPVIEWMSGGROUP = "getPSAppViewMsgGroup";
	public final static String ATTR_GETPSAPPVIEWNAVCONTEXTS = "getPSAppViewNavContexts";
	public final static String ATTR_GETPSAPPVIEWNAVPARAMS = "getPSAppViewNavParams";
	public final static String ATTR_GETPSAPPVIEWPARAMS = "getPSAppViewParams";
	public final static String ATTR_GETPSAPPVIEWREFS = "getPSAppViewRefs";
	public final static String ATTR_GETPSAPPVIEWUIACTIONS = "getPSAppViewUIActions";
	public final static String ATTR_GETPSCONTROLS = "getPSControls";
	public final static String ATTR_GETPSSYSCSS = "getPSSysCss";
	public final static String ATTR_GETPSSYSIMAGE = "getPSSysImage";
	public final static String ATTR_GETPSSYSPFPLUGIN = "getPSSysPFPlugin";
	public final static String ATTR_GETPSVIEWLAYOUTPANEL = "getPSViewLayoutPanel";
	public final static String ATTR_GETPRIORITY = "priority";
	public final static String ATTR_GETREFFLAG = "refFlag";
	public final static String ATTR_GETREFPSAPPVIEW = "getRefPSAppView";
	public final static String ATTR_GETSUBCAPPSLANGUAGERES = "getSubCapPSLanguageRes";
	public final static String ATTR_GETSUBCAPTION = "subCaption";
	public final static String ATTR_GETTITLE = "title";
	public final static String ATTR_GETTITLEPSLANGUAGERES = "getTitlePSLanguageRes";
	public final static String ATTR_GETVIEWSTYLE = "viewStyle";
	public final static String ATTR_GETVIEWTYPE = "viewType";
	public final static String ATTR_GETWIDTH = "width";
	public final static String ATTR_ISENABLEDP = "enableDP";
	public final static String ATTR_ISENABLEWF = "enableWF";
	public final static String ATTR_ISPICKUPMODE = "pickupMode";
	public final static String ATTR_ISREDIRECTVIEW = "redirectView";
	public final static String ATTR_ISSHOWCAPTIONBAR = "showCaptionBar";

	public int getAccUserMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACCUSERMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getAccessKey(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACCESSKEY);
		if(value == null){
			return null;
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

	public int getDynaSysMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNASYSMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getFullCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFULLCODENAME);
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

	@Deprecated
	public java.lang.String getMainMenuAlign(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAINMENUALIGN);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getOpenMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETOPENMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.app.control.IPSAppCounterRef> psappcounterrefs = null;
	public java.util.List<net.ibizsys.model.app.control.IPSAppCounterRef> getPSAppCounterRefs(){
		if(this.psappcounterrefs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPCOUNTERREFS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.control.IPSAppCounterRef> list = new java.util.ArrayList<net.ibizsys.model.app.control.IPSAppCounterRef>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.control.IPSAppCounterRef obj = this.getPSModelObject(net.ibizsys.model.app.control.IPSAppCounterRef.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPCOUNTERREFS);
				if(obj!=null)list.add(obj);
			}
			this.psappcounterrefs = list;
		}
		return (this.psappcounterrefs.size() == 0)? null : this.psappcounterrefs;
	}

	public net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRef(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.control.IPSAppCounterRef.class, this.getPSAppCounterRefs(), objKey, bTryMode);
	}
	public void setPSAppCounterRefs(java.util.List<net.ibizsys.model.app.control.IPSAppCounterRef> list){
		this.psappcounterrefs = list;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定视图应用实体");}
		return value;
	}

	public void setPSAppDataEntity(net.ibizsys.model.app.dataentity.IPSAppDataEntity psappdataentity){
		this.psappdataentity = psappdataentity;
	}

	private net.ibizsys.model.app.IPSAppModule psappmodule;

	public net.ibizsys.model.app.IPSAppModule getPSAppModule(){
		if(this.psappmodule != null) return this.psappmodule;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPMODULE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.IPSApplication ipsapplication = getParentPSModelObject(net.ibizsys.model.app.IPSApplication.class);
		this.psappmodule = ipsapplication.getPSAppModule(value, false);
		return this.psappmodule;
	}

	public net.ibizsys.model.app.IPSAppModule getPSAppModuleMust(){
		net.ibizsys.model.app.IPSAppModule value = this.getPSAppModule();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用模块");}
		return value;
	}

	public void setPSAppModule(net.ibizsys.model.app.IPSAppModule psappmodule){
		this.psappmodule = psappmodule;
	}


	private java.util.List<net.ibizsys.model.app.view.IPSAppViewEngine> psappviewengines = null;
	public java.util.List<net.ibizsys.model.app.view.IPSAppViewEngine> getPSAppViewEngines(){
		if(this.psappviewengines == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPVIEWENGINES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.view.IPSAppViewEngine> list = new java.util.ArrayList<net.ibizsys.model.app.view.IPSAppViewEngine>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.view.IPSAppViewEngine obj = this.getPSModelObject(net.ibizsys.model.app.view.IPSAppViewEngine.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPVIEWENGINES);
				if(obj!=null)list.add(obj);
			}
			this.psappviewengines = list;
		}
		return (this.psappviewengines.size() == 0)? null : this.psappviewengines;
	}

	public net.ibizsys.model.app.view.IPSAppViewEngine getPSAppViewEngine(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.view.IPSAppViewEngine.class, this.getPSAppViewEngines(), objKey, bTryMode);
	}
	public void setPSAppViewEngines(java.util.List<net.ibizsys.model.app.view.IPSAppViewEngine> list){
		this.psappviewengines = list;
	}

	private java.util.List<net.ibizsys.model.app.view.IPSAppViewLogic> psappviewlogics = null;
	public java.util.List<net.ibizsys.model.app.view.IPSAppViewLogic> getPSAppViewLogics(){
		if(this.psappviewlogics == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPVIEWLOGICS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.view.IPSAppViewLogic> list = new java.util.ArrayList<net.ibizsys.model.app.view.IPSAppViewLogic>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.view.IPSAppViewLogic obj = this.getPSModelObject(net.ibizsys.model.app.view.IPSAppViewLogic.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPVIEWLOGICS);
				if(obj!=null)list.add(obj);
			}
			this.psappviewlogics = list;
		}
		return (this.psappviewlogics.size() == 0)? null : this.psappviewlogics;
	}

	public net.ibizsys.model.app.view.IPSAppViewLogic getPSAppViewLogic(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.view.IPSAppViewLogic.class, this.getPSAppViewLogics(), objKey, bTryMode);
	}
	public void setPSAppViewLogics(java.util.List<net.ibizsys.model.app.view.IPSAppViewLogic> list){
		this.psappviewlogics = list;
	}
	private net.ibizsys.model.app.view.IPSAppViewMsgGroup psappviewmsggroup;

	public net.ibizsys.model.app.view.IPSAppViewMsgGroup getPSAppViewMsgGroup(){
		if(this.psappviewmsggroup != null) return this.psappviewmsggroup;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPVIEWMSGGROUP);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.IPSApplication ipsapplication = getParentPSModelObject(net.ibizsys.model.app.IPSApplication.class);
		this.psappviewmsggroup = ipsapplication.getPSAppViewMsgGroup(value, false);
		return this.psappviewmsggroup;
	}

	public net.ibizsys.model.app.view.IPSAppViewMsgGroup getPSAppViewMsgGroupMust(){
		net.ibizsys.model.app.view.IPSAppViewMsgGroup value = this.getPSAppViewMsgGroup();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用视图消息组");}
		return value;
	}

	public void setPSAppViewMsgGroup(net.ibizsys.model.app.view.IPSAppViewMsgGroup psappviewmsggroup){
		this.psappviewmsggroup = psappviewmsggroup;
	}


	private java.util.List<net.ibizsys.model.app.view.IPSAppViewNavContext> psappviewnavcontexts = null;
	public java.util.List<net.ibizsys.model.app.view.IPSAppViewNavContext> getPSAppViewNavContexts(){
		if(this.psappviewnavcontexts == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPVIEWNAVCONTEXTS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.view.IPSAppViewNavContext> list = new java.util.ArrayList<net.ibizsys.model.app.view.IPSAppViewNavContext>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.view.IPSAppViewNavContext obj = this.getPSModelObject(net.ibizsys.model.app.view.IPSAppViewNavContext.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPVIEWNAVCONTEXTS);
				if(obj!=null)list.add(obj);
			}
			this.psappviewnavcontexts = list;
		}
		return (this.psappviewnavcontexts.size() == 0)? null : this.psappviewnavcontexts;
	}

	public net.ibizsys.model.app.view.IPSAppViewNavContext getPSAppViewNavContext(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.view.IPSAppViewNavContext.class, this.getPSAppViewNavContexts(), objKey, bTryMode);
	}
	public void setPSAppViewNavContexts(java.util.List<net.ibizsys.model.app.view.IPSAppViewNavContext> list){
		this.psappviewnavcontexts = list;
	}

	private java.util.List<net.ibizsys.model.app.view.IPSAppViewNavParam> psappviewnavparams = null;
	public java.util.List<net.ibizsys.model.app.view.IPSAppViewNavParam> getPSAppViewNavParams(){
		if(this.psappviewnavparams == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPVIEWNAVPARAMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.view.IPSAppViewNavParam> list = new java.util.ArrayList<net.ibizsys.model.app.view.IPSAppViewNavParam>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.view.IPSAppViewNavParam obj = this.getPSModelObject(net.ibizsys.model.app.view.IPSAppViewNavParam.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPVIEWNAVPARAMS);
				if(obj!=null)list.add(obj);
			}
			this.psappviewnavparams = list;
		}
		return (this.psappviewnavparams.size() == 0)? null : this.psappviewnavparams;
	}

	public net.ibizsys.model.app.view.IPSAppViewNavParam getPSAppViewNavParam(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.view.IPSAppViewNavParam.class, this.getPSAppViewNavParams(), objKey, bTryMode);
	}
	public void setPSAppViewNavParams(java.util.List<net.ibizsys.model.app.view.IPSAppViewNavParam> list){
		this.psappviewnavparams = list;
	}

	private java.util.List<net.ibizsys.model.app.view.IPSAppViewParam> psappviewparams = null;
	public java.util.List<net.ibizsys.model.app.view.IPSAppViewParam> getPSAppViewParams(){
		if(this.psappviewparams == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPVIEWPARAMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.view.IPSAppViewParam> list = new java.util.ArrayList<net.ibizsys.model.app.view.IPSAppViewParam>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.view.IPSAppViewParam obj = this.getPSModelObject(net.ibizsys.model.app.view.IPSAppViewParam.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPVIEWPARAMS);
				if(obj!=null)list.add(obj);
			}
			this.psappviewparams = list;
		}
		return (this.psappviewparams.size() == 0)? null : this.psappviewparams;
	}

	public net.ibizsys.model.app.view.IPSAppViewParam getPSAppViewParam(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.view.IPSAppViewParam.class, this.getPSAppViewParams(), objKey, bTryMode);
	}
	public void setPSAppViewParams(java.util.List<net.ibizsys.model.app.view.IPSAppViewParam> list){
		this.psappviewparams = list;
	}

	private java.util.List<net.ibizsys.model.app.view.IPSAppViewRef> psappviewrefs = null;
	public java.util.List<net.ibizsys.model.app.view.IPSAppViewRef> getPSAppViewRefs(){
		if(this.psappviewrefs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPVIEWREFS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.view.IPSAppViewRef> list = new java.util.ArrayList<net.ibizsys.model.app.view.IPSAppViewRef>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.view.IPSAppViewRef obj = this.getPSModelObject(net.ibizsys.model.app.view.IPSAppViewRef.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPVIEWREFS);
				if(obj!=null)list.add(obj);
			}
			this.psappviewrefs = list;
		}
		return (this.psappviewrefs.size() == 0)? null : this.psappviewrefs;
	}

	public net.ibizsys.model.app.view.IPSAppViewRef getPSAppViewRef(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.view.IPSAppViewRef.class, this.getPSAppViewRefs(), objKey, bTryMode);
	}
	public void setPSAppViewRefs(java.util.List<net.ibizsys.model.app.view.IPSAppViewRef> list){
		this.psappviewrefs = list;
	}

	private java.util.List<net.ibizsys.model.app.view.IPSAppViewUIAction> psappviewuiactions = null;
	public java.util.List<net.ibizsys.model.app.view.IPSAppViewUIAction> getPSAppViewUIActions(){
		if(this.psappviewuiactions == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPVIEWUIACTIONS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.view.IPSAppViewUIAction> list = new java.util.ArrayList<net.ibizsys.model.app.view.IPSAppViewUIAction>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.view.IPSAppViewUIAction obj = this.getPSModelObject(net.ibizsys.model.app.view.IPSAppViewUIAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPVIEWUIACTIONS);
				if(obj!=null)list.add(obj);
			}
			this.psappviewuiactions = list;
		}
		return (this.psappviewuiactions.size() == 0)? null : this.psappviewuiactions;
	}

	public net.ibizsys.model.app.view.IPSAppViewUIAction getPSAppViewUIAction(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.view.IPSAppViewUIAction.class, this.getPSAppViewUIActions(), objKey, bTryMode);
	}
	public void setPSAppViewUIActions(java.util.List<net.ibizsys.model.app.view.IPSAppViewUIAction> list){
		this.psappviewuiactions = list;
	}

	private java.util.List<net.ibizsys.model.control.IPSControl> pscontrols = null;
	public java.util.List<net.ibizsys.model.control.IPSControl> getPSControls(){
		if(this.pscontrols == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCONTROLS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.IPSControl> list = new java.util.ArrayList<net.ibizsys.model.control.IPSControl>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.IPSControl obj = this.getPSModelObject(net.ibizsys.model.control.IPSControl.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCONTROLS);
				if(obj!=null)list.add(obj);
			}
			this.pscontrols = list;
		}
		return (this.pscontrols.size() == 0)? null : this.pscontrols;
	}

	public net.ibizsys.model.control.IPSControl getPSControl(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.IPSControl.class, this.getPSControls(), objKey, bTryMode);
	}
	public void setPSControls(java.util.List<net.ibizsys.model.control.IPSControl> list){
		this.pscontrols = list;
	}
	private net.ibizsys.model.res.IPSSysCss pssyscss;

	public net.ibizsys.model.res.IPSSysCss getPSSysCss(){
		if(this.pssyscss != null) return this.pssyscss;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSCSS);
		if(value == null){
			return null;
		}
		this.pssyscss = getPSModelObject(net.ibizsys.model.res.IPSSysCss.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSCSS);
		return this.pssyscss;
	}

	public net.ibizsys.model.res.IPSSysCss getPSSysCssMust(){
		net.ibizsys.model.res.IPSSysCss value = this.getPSSysCss();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定界面样式表对象");}
		return value;
	}

	public void setPSSysCss(net.ibizsys.model.res.IPSSysCss pssyscss){
		this.pssyscss = pssyscss;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定图标对象");}
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定前端应用插件");}
		return value;
	}

	public void setPSSysPFPlugin(net.ibizsys.model.res.IPSSysPFPlugin pssyspfplugin){
		this.pssyspfplugin = pssyspfplugin;
	}

	private net.ibizsys.model.control.panel.IPSViewLayoutPanel psviewlayoutpanel;

	public net.ibizsys.model.control.panel.IPSViewLayoutPanel getPSViewLayoutPanel(){
		if(this.psviewlayoutpanel != null) return this.psviewlayoutpanel;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSVIEWLAYOUTPANEL);
		if(value == null){
			return null;
		}
		this.psviewlayoutpanel = getPSModelObject(net.ibizsys.model.control.panel.IPSViewLayoutPanel.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSVIEWLAYOUTPANEL);
		return this.psviewlayoutpanel;
	}

	public net.ibizsys.model.control.panel.IPSViewLayoutPanel getPSViewLayoutPanelMust(){
		net.ibizsys.model.control.panel.IPSViewLayoutPanel value = this.getPSViewLayoutPanel();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定视图布局面板");}
		return value;
	}

	public void setPSViewLayoutPanel(net.ibizsys.model.control.panel.IPSViewLayoutPanel psviewlayoutpanel){
		this.psviewlayoutpanel = psviewlayoutpanel;
	}


	public int getPriority(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPRIORITY);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public boolean getRefFlag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFFLAG);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}
	private net.ibizsys.model.app.view.IPSAppView refpsappview;

	@Deprecated
	public net.ibizsys.model.app.view.IPSAppView getRefPSAppView(){
		if(this.refpsappview != null) return this.refpsappview;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFPSAPPVIEW);
		if(value == null){
			return null;
		}
		this.refpsappview = getPSModelObject(net.ibizsys.model.app.view.IPSAppView.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETREFPSAPPVIEW);
		return this.refpsappview;
	}

	public net.ibizsys.model.app.view.IPSAppView getRefPSAppViewMust(){
		net.ibizsys.model.app.view.IPSAppView value = this.getRefPSAppView();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "[getRefPSAppView]返回空值");}
		return value;
	}

	public void setRefPSAppView(net.ibizsys.model.app.view.IPSAppView refpsappview){
		this.refpsappview = refpsappview;
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


	public java.lang.String getViewStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVIEWSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getViewType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVIEWTYPE);
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

	@Deprecated
	public boolean isEnableWF(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEWF);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isPickupMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISPICKUPMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isRedirectView(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISREDIRECTVIEW);
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
}
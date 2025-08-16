package net.ibizsys.model.app;



public class PSApplicationImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.app.IPSApplication
		,net.ibizsys.model.app.IPSApplicationUI
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETACMINCHARS = "aCMinChars";
	public final static String ATTR_GETALLACCESSKEYS = "allAccessKeys";
	public final static String ATTR_GETALLPSAPPBISCHEMES = "getAllPSAppBISchemes";
	public final static String ATTR_GETALLPSAPPCODELISTS = "getAllPSAppCodeLists";
	public final static String ATTR_GETALLPSAPPCOUNTERS = "getAllPSAppCounters";
	public final static String ATTR_GETALLPSAPPDEFINPUTTIPSETS = "getAllPSAppDEFInputTipSets";
	public final static String ATTR_GETALLPSAPPDERSS = "getAllPSAppDERSs";
	public final static String ATTR_GETALLPSAPPDEUIACTIONGROUPS = "getAllPSAppDEUIActionGroups";
	public final static String ATTR_GETALLPSAPPDEUIACTIONS = "getAllPSAppDEUIActions";
	public final static String ATTR_GETALLPSAPPDATAENTITIES = "getAllPSAppDataEntities";
	public final static String ATTR_GETALLPSAPPEDITORSTYLEREFS = "getAllPSAppEditorStyleRefs";
	public final static String ATTR_GETALLPSAPPFUNCS = "getAllPSAppFuncs";
	public final static String ATTR_GETALLPSAPPLANS = "getAllPSAppLans";
	public final static String ATTR_GETALLPSAPPLOGICS = "getAllPSAppLogics";
	public final static String ATTR_GETALLPSAPPMENUMODELS = "getAllPSAppMenuModels";
	public final static String ATTR_GETALLPSAPPMETHODDTOS = "getAllPSAppMethodDTOs";
	public final static String ATTR_GETALLPSAPPMODULES = "getAllPSAppModules";
	public final static String ATTR_GETALLPSAPPMSGTEMPLS = "getAllPSAppMsgTempls";
	public final static String ATTR_GETALLPSAPPPFPLUGINREFS = "getAllPSAppPFPluginRefs";
	public final static String ATTR_GETALLPSAPPPKGS = "getAllPSAppPkgs";
	public final static String ATTR_GETALLPSAPPPORTLETCATS = "getAllPSAppPortletCats";
	public final static String ATTR_GETALLPSAPPPORTLETS = "getAllPSAppPortlets";
	public final static String ATTR_GETALLPSAPPRESOURCES = "getAllPSAppResources";
	public final static String ATTR_GETALLPSAPPSUBVIEWTYPEREFS = "getAllPSAppSubViewTypeRefs";
	public final static String ATTR_GETALLPSAPPUILOGICS = "getAllPSAppUILogics";
	public final static String ATTR_GETALLPSAPPUISTYLES = "getAllPSAppUIStyles";
	public final static String ATTR_GETALLPSAPPUITHEMES = "getAllPSAppUIThemes";
	public final static String ATTR_GETALLPSAPPUSERMODES = "getAllPSAppUserModes";
	public final static String ATTR_GETALLPSAPPUTILPAGES = "getAllPSAppUtilPages";
	public final static String ATTR_GETALLPSAPPUTILS = "getAllPSAppUtils";
	public final static String ATTR_GETALLPSAPPVIEWMSGGROUPS = "getAllPSAppViewMsgGroups";
	public final static String ATTR_GETALLPSAPPVIEWMSGS = "getAllPSAppViewMsgs";
	public final static String ATTR_GETALLPSAPPVIEWS = "getAllPSAppViews";
	public final static String ATTR_GETALLPSAPPWFS = "getAllPSAppWFs";
	public final static String ATTR_GETALLPSDEOPPRIVS = "getAllPSDEOPPrivs";
	public final static String ATTR_GETALLPSSUBAPPREFS = "getAllPSSubAppRefs";
	public final static String ATTR_GETALLPSSYSTESTPRJS = "getAllPSSysTestPrjs";
	public final static String ATTR_GETAPPFOLDER = "appFolder";
	public final static String ATTR_GETAPPMODE = "appMode";
	public final static String ATTR_GETAPPTAG = "appTag";
	public final static String ATTR_GETAPPTAG2 = "appTag2";
	public final static String ATTR_GETAPPTAG3 = "appTag3";
	public final static String ATTR_GETAPPTAG4 = "appTag4";
	public final static String ATTR_GETAPPTYPE = "appType";
	public final static String ATTR_GETAPPVERSION = "appVersion";
	public final static String ATTR_GETBOTTOMINFO = "bottomInfo";
	public final static String ATTR_GETBUTTONNOPRIVDISPLAYMODE = "buttonNoPrivDisplayMode";
	public final static String ATTR_GETCAPTION = "caption";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDEFAULTAPPVIEWPSSYSCSS = "getDefaultAppViewPSSysCss";
	public final static String ATTR_GETDEFAULTCONTROLSTYLE = "defaultControlStyle";
	public final static String ATTR_GETDEFAULTFLAG = "defaultFlag";
	public final static String ATTR_GETDEFAULTOSSCAT = "defaultOSSCat";
	public final static String ATTR_GETDEFAULTPSAPPINDEXVIEW = "getDefaultPSAppIndexView";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETDYNASYSMODE = "dynaSysMode";
	public final static String ATTR_GETENGINEVER = "engineVer";
	public final static String ATTR_GETFORMITEMEMPTYTEXT = "formItemEmptyText";
	public final static String ATTR_GETFORMITEMNOPRIVDISPLAYMODE = "formItemNoPrivDisplayMode";
	public final static String ATTR_GETGRIDCOLUMNENABLEFILTER = "gridColumnEnableFilter";
	public final static String ATTR_GETGRIDCOLUMNENABLELINK = "gridColumnEnableLink";
	public final static String ATTR_GETGRIDCOLUMNNOPRIVDISPLAYMODE = "gridColumnNoPrivDisplayMode";
	public final static String ATTR_GETGRIDROWACTIVEMODE = "gridRowActiveMode";
	public final static String ATTR_GETHEADERINFO = "headerInfo";
	public final static String ATTR_GETMDCTRLEMPTYTEXT = "mDCtrlEmptyText";
	public final static String ATTR_GETMDCTRLEMPTYTEXTPSLANGUAGERES = "getMDCtrlEmptyTextPSLanguageRes";
	public final static String ATTR_GETMAINMENUALIGN = "mainMenuAlign";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPFSTYLE = "pFStyle";
	public final static String ATTR_GETPFTYPE = "pFType";
	public final static String ATTR_GETPKGCODENAME = "pKGCodeName";
	public final static String ATTR_GETPSAPPLICATIONLOGICS = "getPSApplicationLogics";
	public final static String ATTR_GETPSSYSIMAGE = "getPSSysImage";
	public final static String ATTR_GETPSSYSRESOURCE = "getPSSysResource";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETSERVICECODENAME = "serviceCodeName";
	public final static String ATTR_GETSUBAPPACCESSKEY = "subAppAccessKey";
	public final static String ATTR_GETSUBCAPTION = "subCaption";
	public final static String ATTR_GETSYSCODENAME = "sysCodeName";
	public final static String ATTR_GETTITLE = "title";
	public final static String ATTR_GETUISTYLE = "uIStyle";
	public final static String ATTR_GETVIEWCODENAMEMODE = "viewCodeNameMode";
	public final static String ATTR_ISENABLECOL12TOCOL24 = "enableCol12ToCol24";
	public final static String ATTR_ISENABLEDYNADASHBOARD = "enableDynaDashboard";
	public final static String ATTR_ISENABLEFILTERSTORAGE = "enableFilterStorage";
	public final static String ATTR_ISENABLESERVICEAPIDTO = "enableServiceAPIDTO";
	public final static String ATTR_ISENABLEUACLOGIN = "enableUACLogin";
	public final static String ATTR_ISENABLEUIMODELEX = "enableUIModelEx";
	public final static String ATTR_ISGRIDENABLECUSTOMIZED = "gridEnableCustomized";
	public final static String ATTR_ISGRIDFORCEFIT = "gridForceFit";
	public final static String ATTR_ISMOBILEAPP = "mobileApp";
	public final static String ATTR_ISOUTPUTFORMITEMUPDATEPRIVTAG = "outputFormItemUpdatePrivTag";
	public final static String ATTR_ISUSESERVICEAPI = "useServiceApi";
	public final static String ATTR_ISWFAPPMODE = "wFAppMode";

	@Deprecated
	public int getACMinChars(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACMINCHARS);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	private java.util.List<java.lang.String> allaccesskeys = null;
	public java.util.List<java.lang.String> getAllAccessKeys(){
		if(this.allaccesskeys == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLACCESSKEYS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
			for(int i = 0;i<arrayNode.size();i++) {
				list.add(arrayNode.get(i).asText());
			}
			this.allaccesskeys = list;
		}
		return (this.allaccesskeys.size() == 0)? null : this.allaccesskeys;
	}

	private java.util.List<net.ibizsys.model.app.bi.IPSAppBIScheme> allpsappbischemes = null;
	public java.util.List<net.ibizsys.model.app.bi.IPSAppBIScheme> getAllPSAppBISchemes(){
		if(this.allpsappbischemes == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPBISCHEMES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.bi.IPSAppBIScheme> list = new java.util.ArrayList<net.ibizsys.model.app.bi.IPSAppBIScheme>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.bi.IPSAppBIScheme obj = this.getPSModelObject(net.ibizsys.model.app.bi.IPSAppBIScheme.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPBISCHEMES);
				if(obj!=null)list.add(obj);
			}
			this.allpsappbischemes = list;
		}
		return (this.allpsappbischemes.size() == 0)? null : this.allpsappbischemes;
	}

	public net.ibizsys.model.app.bi.IPSAppBIScheme getPSAppBIScheme(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.bi.IPSAppBIScheme.class, this.getAllPSAppBISchemes(), objKey, bTryMode);
	}
	public void setPSAppBISchemes(java.util.List<net.ibizsys.model.app.bi.IPSAppBIScheme> list){
		this.allpsappbischemes = list;
	}

	private java.util.List<net.ibizsys.model.app.codelist.IPSAppCodeList> allpsappcodelists = null;
	public java.util.List<net.ibizsys.model.app.codelist.IPSAppCodeList> getAllPSAppCodeLists(){
		if(this.allpsappcodelists == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPCODELISTS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.codelist.IPSAppCodeList> list = new java.util.ArrayList<net.ibizsys.model.app.codelist.IPSAppCodeList>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.codelist.IPSAppCodeList obj = this.getPSModelObject(net.ibizsys.model.app.codelist.IPSAppCodeList.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPCODELISTS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappcodelists = list;
		}
		return (this.allpsappcodelists.size() == 0)? null : this.allpsappcodelists;
	}

	public net.ibizsys.model.app.codelist.IPSAppCodeList getPSAppCodeList(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.codelist.IPSAppCodeList.class, this.getAllPSAppCodeLists(), objKey, bTryMode);
	}
	public void setPSAppCodeLists(java.util.List<net.ibizsys.model.app.codelist.IPSAppCodeList> list){
		this.allpsappcodelists = list;
	}

	private java.util.List<net.ibizsys.model.app.control.IPSAppCounter> allpsappcounters = null;
	public java.util.List<net.ibizsys.model.app.control.IPSAppCounter> getAllPSAppCounters(){
		if(this.allpsappcounters == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPCOUNTERS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.control.IPSAppCounter> list = new java.util.ArrayList<net.ibizsys.model.app.control.IPSAppCounter>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.control.IPSAppCounter obj = this.getPSModelObject(net.ibizsys.model.app.control.IPSAppCounter.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPCOUNTERS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappcounters = list;
		}
		return (this.allpsappcounters.size() == 0)? null : this.allpsappcounters;
	}

	public net.ibizsys.model.app.control.IPSAppCounter getPSAppCounter(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.control.IPSAppCounter.class, this.getAllPSAppCounters(), objKey, bTryMode);
	}
	public void setPSAppCounters(java.util.List<net.ibizsys.model.app.control.IPSAppCounter> list){
		this.allpsappcounters = list;
	}

	private java.util.List<net.ibizsys.model.app.res.IPSAppDEFInputTipSet> allpsappdefinputtipsets = null;
	public java.util.List<net.ibizsys.model.app.res.IPSAppDEFInputTipSet> getAllPSAppDEFInputTipSets(){
		if(this.allpsappdefinputtipsets == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPDEFINPUTTIPSETS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.res.IPSAppDEFInputTipSet> list = new java.util.ArrayList<net.ibizsys.model.app.res.IPSAppDEFInputTipSet>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.res.IPSAppDEFInputTipSet obj = this.getPSModelObject(net.ibizsys.model.app.res.IPSAppDEFInputTipSet.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPDEFINPUTTIPSETS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappdefinputtipsets = list;
		}
		return (this.allpsappdefinputtipsets.size() == 0)? null : this.allpsappdefinputtipsets;
	}

	public net.ibizsys.model.app.res.IPSAppDEFInputTipSet getPSAppDEFInputTipSet(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.res.IPSAppDEFInputTipSet.class, this.getAllPSAppDEFInputTipSets(), objKey, bTryMode);
	}
	public void setPSAppDEFInputTipSets(java.util.List<net.ibizsys.model.app.res.IPSAppDEFInputTipSet> list){
		this.allpsappdefinputtipsets = list;
	}

	private java.util.List<net.ibizsys.model.app.dataentity.IPSAppDERS> allpsappderss = null;
	public java.util.List<net.ibizsys.model.app.dataentity.IPSAppDERS> getAllPSAppDERSs(){
		if(this.allpsappderss == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPDERSS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.dataentity.IPSAppDERS> list = new java.util.ArrayList<net.ibizsys.model.app.dataentity.IPSAppDERS>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.dataentity.IPSAppDERS obj = this.getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDERS.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPDERSS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappderss = list;
		}
		return (this.allpsappderss.size() == 0)? null : this.allpsappderss;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDERS getPSAppDERS(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDERS.class, this.getAllPSAppDERSs(), objKey, bTryMode);
	}
	public void setPSAppDERs(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDERS> list){
		this.allpsappderss = list;
	}

	private java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup> allpsappdeuiactiongroups = null;
	public java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup> getAllPSAppDEUIActionGroups(){
		if(this.allpsappdeuiactiongroups == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPDEUIACTIONGROUPS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup> list = new java.util.ArrayList<net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup obj = this.getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPDEUIACTIONGROUPS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappdeuiactiongroups = list;
		}
		return (this.allpsappdeuiactiongroups.size() == 0)? null : this.allpsappdeuiactiongroups;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup getPSAppDEUIActionGroup(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup.class, this.getAllPSAppDEUIActionGroups(), objKey, bTryMode);
	}
	public void setPSAppDEUIActionGroups(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup> list){
		this.allpsappdeuiactiongroups = list;
	}

	private java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUIAction> allpsappdeuiactions = null;
	public java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUIAction> getAllPSAppDEUIActions(){
		if(this.allpsappdeuiactions == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPDEUIACTIONS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUIAction> list = new java.util.ArrayList<net.ibizsys.model.app.dataentity.IPSAppDEUIAction>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.dataentity.IPSAppDEUIAction obj = this.getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEUIAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPDEUIACTIONS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappdeuiactions = list;
		}
		return (this.allpsappdeuiactions.size() == 0)? null : this.allpsappdeuiactions;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEUIAction getPSAppDEUIAction(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEUIAction.class, this.getAllPSAppDEUIActions(), objKey, bTryMode);
	}
	public void setPSAppDEUIActions(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUIAction> list){
		this.allpsappdeuiactions = list;
	}

	private java.util.List<net.ibizsys.model.app.dataentity.IPSAppDataEntity> allpsappdataentities = null;
	public java.util.List<net.ibizsys.model.app.dataentity.IPSAppDataEntity> getAllPSAppDataEntities(){
		if(this.allpsappdataentities == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPDATAENTITIES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.dataentity.IPSAppDataEntity> list = new java.util.ArrayList<net.ibizsys.model.app.dataentity.IPSAppDataEntity>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.dataentity.IPSAppDataEntity obj = this.getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPDATAENTITIES);
				if(obj!=null)list.add(obj);
			}
			this.allpsappdataentities = list;
		}
		return (this.allpsappdataentities.size() == 0)? null : this.allpsappdataentities;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, this.getAllPSAppDataEntities(), objKey, bTryMode);
	}
	public void setPSAppDataEntities(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDataEntity> list){
		this.allpsappdataentities = list;
	}

	private java.util.List<net.ibizsys.model.app.res.IPSAppEditorStyleRef> allpsappeditorstylerefs = null;
	public java.util.List<net.ibizsys.model.app.res.IPSAppEditorStyleRef> getAllPSAppEditorStyleRefs(){
		if(this.allpsappeditorstylerefs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPEDITORSTYLEREFS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.res.IPSAppEditorStyleRef> list = new java.util.ArrayList<net.ibizsys.model.app.res.IPSAppEditorStyleRef>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.res.IPSAppEditorStyleRef obj = this.getPSModelObject(net.ibizsys.model.app.res.IPSAppEditorStyleRef.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPEDITORSTYLEREFS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappeditorstylerefs = list;
		}
		return (this.allpsappeditorstylerefs.size() == 0)? null : this.allpsappeditorstylerefs;
	}

	public net.ibizsys.model.app.res.IPSAppEditorStyleRef getPSAppEditorStyleRef(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.res.IPSAppEditorStyleRef.class, this.getAllPSAppEditorStyleRefs(), objKey, bTryMode);
	}
	public void setPSAppEditorStyleRefs(java.util.List<net.ibizsys.model.app.res.IPSAppEditorStyleRef> list){
		this.allpsappeditorstylerefs = list;
	}

	private java.util.List<net.ibizsys.model.app.func.IPSAppFunc> allpsappfuncs = null;
	public java.util.List<net.ibizsys.model.app.func.IPSAppFunc> getAllPSAppFuncs(){
		if(this.allpsappfuncs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPFUNCS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.func.IPSAppFunc> list = new java.util.ArrayList<net.ibizsys.model.app.func.IPSAppFunc>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.func.IPSAppFunc obj = this.getPSModelObject(net.ibizsys.model.app.func.IPSAppFunc.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPFUNCS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappfuncs = list;
		}
		return (this.allpsappfuncs.size() == 0)? null : this.allpsappfuncs;
	}

	public net.ibizsys.model.app.func.IPSAppFunc getPSAppFunc(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.func.IPSAppFunc.class, this.getAllPSAppFuncs(), objKey, bTryMode);
	}
	public void setPSAppFuncs(java.util.List<net.ibizsys.model.app.func.IPSAppFunc> list){
		this.allpsappfuncs = list;
	}

	private java.util.List<net.ibizsys.model.app.IPSAppLan> allpsapplans = null;
	public java.util.List<net.ibizsys.model.app.IPSAppLan> getAllPSAppLans(){
		if(this.allpsapplans == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPLANS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.IPSAppLan> list = new java.util.ArrayList<net.ibizsys.model.app.IPSAppLan>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.IPSAppLan obj = this.getPSModelObject(net.ibizsys.model.app.IPSAppLan.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPLANS);
				if(obj!=null)list.add(obj);
			}
			this.allpsapplans = list;
		}
		return (this.allpsapplans.size() == 0)? null : this.allpsapplans;
	}

	public net.ibizsys.model.app.IPSAppLan getPSAppLan(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.IPSAppLan.class, this.getAllPSAppLans(), objKey, bTryMode);
	}
	public void setPSAppLans(java.util.List<net.ibizsys.model.app.IPSAppLan> list){
		this.allpsapplans = list;
	}

	private java.util.List<net.ibizsys.model.app.IPSAppLogic> allpsapplogics = null;
	public java.util.List<net.ibizsys.model.app.IPSAppLogic> getAllPSAppLogics(){
		if(this.allpsapplogics == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPLOGICS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.IPSAppLogic> list = new java.util.ArrayList<net.ibizsys.model.app.IPSAppLogic>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.IPSAppLogic obj = this.getPSModelObject(net.ibizsys.model.app.IPSAppLogic.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPLOGICS);
				if(obj!=null)list.add(obj);
			}
			this.allpsapplogics = list;
		}
		return (this.allpsapplogics.size() == 0)? null : this.allpsapplogics;
	}

	public net.ibizsys.model.app.IPSAppLogic getPSAppLogic(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.IPSAppLogic.class, this.getAllPSAppLogics(), objKey, bTryMode);
	}
	public void setPSAppLogics(java.util.List<net.ibizsys.model.app.IPSAppLogic> list){
		this.allpsapplogics = list;
	}

	private java.util.List<net.ibizsys.model.app.appmenu.IPSAppMenuModel> allpsappmenumodels = null;
	public java.util.List<net.ibizsys.model.app.appmenu.IPSAppMenuModel> getAllPSAppMenuModels(){
		if(this.allpsappmenumodels == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPMENUMODELS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.appmenu.IPSAppMenuModel> list = new java.util.ArrayList<net.ibizsys.model.app.appmenu.IPSAppMenuModel>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.appmenu.IPSAppMenuModel obj = this.getPSModelObject(net.ibizsys.model.app.appmenu.IPSAppMenuModel.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPMENUMODELS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappmenumodels = list;
		}
		return (this.allpsappmenumodels.size() == 0)? null : this.allpsappmenumodels;
	}

	public net.ibizsys.model.app.appmenu.IPSAppMenuModel getPSAppMenuModel(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.appmenu.IPSAppMenuModel.class, this.getAllPSAppMenuModels(), objKey, bTryMode);
	}
	public void setPSAppMenuModels(java.util.List<net.ibizsys.model.app.appmenu.IPSAppMenuModel> list){
		this.allpsappmenumodels = list;
	}

	private java.util.List<net.ibizsys.model.app.IPSAppMethodDTO> allpsappmethoddtos = null;
	public java.util.List<net.ibizsys.model.app.IPSAppMethodDTO> getAllPSAppMethodDTOs(){
		if(this.allpsappmethoddtos == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPMETHODDTOS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.IPSAppMethodDTO> list = new java.util.ArrayList<net.ibizsys.model.app.IPSAppMethodDTO>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.IPSAppMethodDTO obj = this.getPSModelObject(net.ibizsys.model.app.IPSAppMethodDTO.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPMETHODDTOS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappmethoddtos = list;
		}
		return (this.allpsappmethoddtos.size() == 0)? null : this.allpsappmethoddtos;
	}

	public net.ibizsys.model.app.IPSAppMethodDTO getPSAppMethodDTO(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.IPSAppMethodDTO.class, this.getAllPSAppMethodDTOs(), objKey, bTryMode);
	}
	public void setPSAppMethodDTOs(java.util.List<net.ibizsys.model.app.IPSAppMethodDTO> list){
		this.allpsappmethoddtos = list;
	}

	private java.util.List<net.ibizsys.model.app.IPSAppModule> allpsappmodules = null;
	public java.util.List<net.ibizsys.model.app.IPSAppModule> getAllPSAppModules(){
		if(this.allpsappmodules == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPMODULES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.IPSAppModule> list = new java.util.ArrayList<net.ibizsys.model.app.IPSAppModule>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.IPSAppModule obj = this.getPSModelObject(net.ibizsys.model.app.IPSAppModule.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPMODULES);
				if(obj!=null)list.add(obj);
			}
			this.allpsappmodules = list;
		}
		return (this.allpsappmodules.size() == 0)? null : this.allpsappmodules;
	}

	public net.ibizsys.model.app.IPSAppModule getPSAppModule(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.IPSAppModule.class, this.getAllPSAppModules(), objKey, bTryMode);
	}
	public void setPSAppModules(java.util.List<net.ibizsys.model.app.IPSAppModule> list){
		this.allpsappmodules = list;
	}

	private java.util.List<net.ibizsys.model.app.msg.IPSAppMsgTempl> allpsappmsgtempls = null;
	public java.util.List<net.ibizsys.model.app.msg.IPSAppMsgTempl> getAllPSAppMsgTempls(){
		if(this.allpsappmsgtempls == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPMSGTEMPLS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.msg.IPSAppMsgTempl> list = new java.util.ArrayList<net.ibizsys.model.app.msg.IPSAppMsgTempl>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.msg.IPSAppMsgTempl obj = this.getPSModelObject(net.ibizsys.model.app.msg.IPSAppMsgTempl.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPMSGTEMPLS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappmsgtempls = list;
		}
		return (this.allpsappmsgtempls.size() == 0)? null : this.allpsappmsgtempls;
	}

	public net.ibizsys.model.app.msg.IPSAppMsgTempl getPSAppMsgTempl(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.msg.IPSAppMsgTempl.class, this.getAllPSAppMsgTempls(), objKey, bTryMode);
	}
	public void setPSAppMsgTempls(java.util.List<net.ibizsys.model.app.msg.IPSAppMsgTempl> list){
		this.allpsappmsgtempls = list;
	}

	private java.util.List<net.ibizsys.model.app.res.IPSAppPFPluginRef> allpsapppfpluginrefs = null;
	public java.util.List<net.ibizsys.model.app.res.IPSAppPFPluginRef> getAllPSAppPFPluginRefs(){
		if(this.allpsapppfpluginrefs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPPFPLUGINREFS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.res.IPSAppPFPluginRef> list = new java.util.ArrayList<net.ibizsys.model.app.res.IPSAppPFPluginRef>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.res.IPSAppPFPluginRef obj = this.getPSModelObject(net.ibizsys.model.app.res.IPSAppPFPluginRef.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPPFPLUGINREFS);
				if(obj!=null)list.add(obj);
			}
			this.allpsapppfpluginrefs = list;
		}
		return (this.allpsapppfpluginrefs.size() == 0)? null : this.allpsapppfpluginrefs;
	}

	public net.ibizsys.model.app.res.IPSAppPFPluginRef getPSAppPFPluginRef(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.res.IPSAppPFPluginRef.class, this.getAllPSAppPFPluginRefs(), objKey, bTryMode);
	}
	public void setPSAppPFPluginRefs(java.util.List<net.ibizsys.model.app.res.IPSAppPFPluginRef> list){
		this.allpsapppfpluginrefs = list;
	}

	private java.util.List<net.ibizsys.model.app.IPSAppPkg> allpsapppkgs = null;
	public java.util.List<net.ibizsys.model.app.IPSAppPkg> getAllPSAppPkgs(){
		if(this.allpsapppkgs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPPKGS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.IPSAppPkg> list = new java.util.ArrayList<net.ibizsys.model.app.IPSAppPkg>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.IPSAppPkg obj = this.getPSModelObject(net.ibizsys.model.app.IPSAppPkg.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPPKGS);
				if(obj!=null)list.add(obj);
			}
			this.allpsapppkgs = list;
		}
		return (this.allpsapppkgs.size() == 0)? null : this.allpsapppkgs;
	}

	public net.ibizsys.model.app.IPSAppPkg getPSAppPkg(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.IPSAppPkg.class, this.getAllPSAppPkgs(), objKey, bTryMode);
	}
	public void setPSAppPkgs(java.util.List<net.ibizsys.model.app.IPSAppPkg> list){
		this.allpsapppkgs = list;
	}

	private java.util.List<net.ibizsys.model.app.control.IPSAppPortletCat> allpsappportletcats = null;
	public java.util.List<net.ibizsys.model.app.control.IPSAppPortletCat> getAllPSAppPortletCats(){
		if(this.allpsappportletcats == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPPORTLETCATS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.control.IPSAppPortletCat> list = new java.util.ArrayList<net.ibizsys.model.app.control.IPSAppPortletCat>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.control.IPSAppPortletCat obj = this.getPSModelObject(net.ibizsys.model.app.control.IPSAppPortletCat.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPPORTLETCATS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappportletcats = list;
		}
		return (this.allpsappportletcats.size() == 0)? null : this.allpsappportletcats;
	}

	public net.ibizsys.model.app.control.IPSAppPortletCat getPSAppPortletCat(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.control.IPSAppPortletCat.class, this.getAllPSAppPortletCats(), objKey, bTryMode);
	}
	public void setPSAppPortletCats(java.util.List<net.ibizsys.model.app.control.IPSAppPortletCat> list){
		this.allpsappportletcats = list;
	}

	private java.util.List<net.ibizsys.model.app.control.IPSAppPortlet> allpsappportlets = null;
	public java.util.List<net.ibizsys.model.app.control.IPSAppPortlet> getAllPSAppPortlets(){
		if(this.allpsappportlets == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPPORTLETS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.control.IPSAppPortlet> list = new java.util.ArrayList<net.ibizsys.model.app.control.IPSAppPortlet>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.control.IPSAppPortlet obj = this.getPSModelObject(net.ibizsys.model.app.control.IPSAppPortlet.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPPORTLETS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappportlets = list;
		}
		return (this.allpsappportlets.size() == 0)? null : this.allpsappportlets;
	}

	public net.ibizsys.model.app.control.IPSAppPortlet getPSAppPortlet(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.control.IPSAppPortlet.class, this.getAllPSAppPortlets(), objKey, bTryMode);
	}
	public void setPSAppPortlets(java.util.List<net.ibizsys.model.app.control.IPSAppPortlet> list){
		this.allpsappportlets = list;
	}

	private java.util.List<net.ibizsys.model.app.IPSAppResource> allpsappresources = null;
	public java.util.List<net.ibizsys.model.app.IPSAppResource> getAllPSAppResources(){
		if(this.allpsappresources == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPRESOURCES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.IPSAppResource> list = new java.util.ArrayList<net.ibizsys.model.app.IPSAppResource>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.IPSAppResource obj = this.getPSModelObject(net.ibizsys.model.app.IPSAppResource.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPRESOURCES);
				if(obj!=null)list.add(obj);
			}
			this.allpsappresources = list;
		}
		return (this.allpsappresources.size() == 0)? null : this.allpsappresources;
	}

	public net.ibizsys.model.app.IPSAppResource getPSAppResource(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.IPSAppResource.class, this.getAllPSAppResources(), objKey, bTryMode);
	}
	public void setPSAppResources(java.util.List<net.ibizsys.model.app.IPSAppResource> list){
		this.allpsappresources = list;
	}

	private java.util.List<net.ibizsys.model.app.res.IPSAppSubViewTypeRef> allpsappsubviewtyperefs = null;
	public java.util.List<net.ibizsys.model.app.res.IPSAppSubViewTypeRef> getAllPSAppSubViewTypeRefs(){
		if(this.allpsappsubviewtyperefs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPSUBVIEWTYPEREFS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.res.IPSAppSubViewTypeRef> list = new java.util.ArrayList<net.ibizsys.model.app.res.IPSAppSubViewTypeRef>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.res.IPSAppSubViewTypeRef obj = this.getPSModelObject(net.ibizsys.model.app.res.IPSAppSubViewTypeRef.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPSUBVIEWTYPEREFS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappsubviewtyperefs = list;
		}
		return (this.allpsappsubviewtyperefs.size() == 0)? null : this.allpsappsubviewtyperefs;
	}

	public net.ibizsys.model.app.res.IPSAppSubViewTypeRef getPSAppSubViewTypeRef(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.res.IPSAppSubViewTypeRef.class, this.getAllPSAppSubViewTypeRefs(), objKey, bTryMode);
	}
	public void setPSAppSubViewTypeRefs(java.util.List<net.ibizsys.model.app.res.IPSAppSubViewTypeRef> list){
		this.allpsappsubviewtyperefs = list;
	}

	private java.util.List<net.ibizsys.model.app.logic.IPSAppUILogic> allpsappuilogics = null;
	public java.util.List<net.ibizsys.model.app.logic.IPSAppUILogic> getAllPSAppUILogics(){
		if(this.allpsappuilogics == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPUILOGICS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.logic.IPSAppUILogic> list = new java.util.ArrayList<net.ibizsys.model.app.logic.IPSAppUILogic>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.logic.IPSAppUILogic obj = this.getPSModelObject(net.ibizsys.model.app.logic.IPSAppUILogic.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPUILOGICS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappuilogics = list;
		}
		return (this.allpsappuilogics.size() == 0)? null : this.allpsappuilogics;
	}

	public net.ibizsys.model.app.logic.IPSAppUILogic getPSAppUILogic(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.logic.IPSAppUILogic.class, this.getAllPSAppUILogics(), objKey, bTryMode);
	}
	public void setPSAppUILogics(java.util.List<net.ibizsys.model.app.logic.IPSAppUILogic> list){
		this.allpsappuilogics = list;
	}

	private java.util.List<net.ibizsys.model.app.IPSAppUIStyle> allpsappuistyles = null;
	public java.util.List<net.ibizsys.model.app.IPSAppUIStyle> getAllPSAppUIStyles(){
		if(this.allpsappuistyles == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPUISTYLES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.IPSAppUIStyle> list = new java.util.ArrayList<net.ibizsys.model.app.IPSAppUIStyle>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.IPSAppUIStyle obj = this.getPSModelObject(net.ibizsys.model.app.IPSAppUIStyle.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPUISTYLES);
				if(obj!=null)list.add(obj);
			}
			this.allpsappuistyles = list;
		}
		return (this.allpsappuistyles.size() == 0)? null : this.allpsappuistyles;
	}

	public net.ibizsys.model.app.IPSAppUIStyle getPSAppUIStyle(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.IPSAppUIStyle.class, this.getAllPSAppUIStyles(), objKey, bTryMode);
	}
	public void setPSAppUIStyles(java.util.List<net.ibizsys.model.app.IPSAppUIStyle> list){
		this.allpsappuistyles = list;
	}

	private java.util.List<net.ibizsys.model.app.theme.IPSAppUITheme> allpsappuithemes = null;
	public java.util.List<net.ibizsys.model.app.theme.IPSAppUITheme> getAllPSAppUIThemes(){
		if(this.allpsappuithemes == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPUITHEMES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.theme.IPSAppUITheme> list = new java.util.ArrayList<net.ibizsys.model.app.theme.IPSAppUITheme>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.theme.IPSAppUITheme obj = this.getPSModelObject(net.ibizsys.model.app.theme.IPSAppUITheme.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPUITHEMES);
				if(obj!=null)list.add(obj);
			}
			this.allpsappuithemes = list;
		}
		return (this.allpsappuithemes.size() == 0)? null : this.allpsappuithemes;
	}

	public net.ibizsys.model.app.theme.IPSAppUITheme getPSAppUITheme(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.theme.IPSAppUITheme.class, this.getAllPSAppUIThemes(), objKey, bTryMode);
	}
	public void setPSAppUIThemes(java.util.List<net.ibizsys.model.app.theme.IPSAppUITheme> list){
		this.allpsappuithemes = list;
	}

	private java.util.List<net.ibizsys.model.app.usermode.IPSAppUserMode> allpsappusermodes = null;
	public java.util.List<net.ibizsys.model.app.usermode.IPSAppUserMode> getAllPSAppUserModes(){
		if(this.allpsappusermodes == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPUSERMODES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.usermode.IPSAppUserMode> list = new java.util.ArrayList<net.ibizsys.model.app.usermode.IPSAppUserMode>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.usermode.IPSAppUserMode obj = this.getPSModelObject(net.ibizsys.model.app.usermode.IPSAppUserMode.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPUSERMODES);
				if(obj!=null)list.add(obj);
			}
			this.allpsappusermodes = list;
		}
		return (this.allpsappusermodes.size() == 0)? null : this.allpsappusermodes;
	}

	public net.ibizsys.model.app.usermode.IPSAppUserMode getPSAppUserMode(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.usermode.IPSAppUserMode.class, this.getAllPSAppUserModes(), objKey, bTryMode);
	}
	public void setPSAppUserModes(java.util.List<net.ibizsys.model.app.usermode.IPSAppUserMode> list){
		this.allpsappusermodes = list;
	}

	private java.util.List<net.ibizsys.model.app.IPSAppUtilPage> allpsapputilpages = null;
	public java.util.List<net.ibizsys.model.app.IPSAppUtilPage> getAllPSAppUtilPages(){
		if(this.allpsapputilpages == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPUTILPAGES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.IPSAppUtilPage> list = new java.util.ArrayList<net.ibizsys.model.app.IPSAppUtilPage>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.IPSAppUtilPage obj = this.getPSModelObject(net.ibizsys.model.app.IPSAppUtilPage.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPUTILPAGES);
				if(obj!=null)list.add(obj);
			}
			this.allpsapputilpages = list;
		}
		return (this.allpsapputilpages.size() == 0)? null : this.allpsapputilpages;
	}

	public net.ibizsys.model.app.IPSAppUtilPage getPSAppUtilPage(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.IPSAppUtilPage.class, this.getAllPSAppUtilPages(), objKey, bTryMode);
	}
	public void setPSAppUtilPages(java.util.List<net.ibizsys.model.app.IPSAppUtilPage> list){
		this.allpsapputilpages = list;
	}

	private java.util.List<net.ibizsys.model.app.util.IPSAppUtil> allpsapputils = null;
	public java.util.List<net.ibizsys.model.app.util.IPSAppUtil> getAllPSAppUtils(){
		if(this.allpsapputils == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPUTILS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.util.IPSAppUtil> list = new java.util.ArrayList<net.ibizsys.model.app.util.IPSAppUtil>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.util.IPSAppUtil obj = this.getPSModelObject(net.ibizsys.model.app.util.IPSAppUtil.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPUTILS);
				if(obj!=null)list.add(obj);
			}
			this.allpsapputils = list;
		}
		return (this.allpsapputils.size() == 0)? null : this.allpsapputils;
	}

	public net.ibizsys.model.app.util.IPSAppUtil getPSAppUtil(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.util.IPSAppUtil.class, this.getAllPSAppUtils(), objKey, bTryMode);
	}
	public void setPSAppUtils(java.util.List<net.ibizsys.model.app.util.IPSAppUtil> list){
		this.allpsapputils = list;
	}

	private java.util.List<net.ibizsys.model.app.view.IPSAppViewMsgGroup> allpsappviewmsggroups = null;
	public java.util.List<net.ibizsys.model.app.view.IPSAppViewMsgGroup> getAllPSAppViewMsgGroups(){
		if(this.allpsappviewmsggroups == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPVIEWMSGGROUPS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.view.IPSAppViewMsgGroup> list = new java.util.ArrayList<net.ibizsys.model.app.view.IPSAppViewMsgGroup>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.view.IPSAppViewMsgGroup obj = this.getPSModelObject(net.ibizsys.model.app.view.IPSAppViewMsgGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPVIEWMSGGROUPS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappviewmsggroups = list;
		}
		return (this.allpsappviewmsggroups.size() == 0)? null : this.allpsappviewmsggroups;
	}

	public net.ibizsys.model.app.view.IPSAppViewMsgGroup getPSAppViewMsgGroup(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.view.IPSAppViewMsgGroup.class, this.getAllPSAppViewMsgGroups(), objKey, bTryMode);
	}
	public void setPSAppViewMsgGroups(java.util.List<net.ibizsys.model.app.view.IPSAppViewMsgGroup> list){
		this.allpsappviewmsggroups = list;
	}

	private java.util.List<net.ibizsys.model.app.view.IPSAppViewMsg> allpsappviewmsgs = null;
	public java.util.List<net.ibizsys.model.app.view.IPSAppViewMsg> getAllPSAppViewMsgs(){
		if(this.allpsappviewmsgs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPVIEWMSGS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.view.IPSAppViewMsg> list = new java.util.ArrayList<net.ibizsys.model.app.view.IPSAppViewMsg>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.view.IPSAppViewMsg obj = this.getPSModelObject(net.ibizsys.model.app.view.IPSAppViewMsg.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPVIEWMSGS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappviewmsgs = list;
		}
		return (this.allpsappviewmsgs.size() == 0)? null : this.allpsappviewmsgs;
	}

	public net.ibizsys.model.app.view.IPSAppViewMsg getPSAppViewMsg(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.view.IPSAppViewMsg.class, this.getAllPSAppViewMsgs(), objKey, bTryMode);
	}
	public void setPSAppViewMsgs(java.util.List<net.ibizsys.model.app.view.IPSAppViewMsg> list){
		this.allpsappviewmsgs = list;
	}

	private java.util.List<net.ibizsys.model.app.view.IPSAppView> allpsappviews = null;
	public java.util.List<net.ibizsys.model.app.view.IPSAppView> getAllPSAppViews(){
		if(this.allpsappviews == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPVIEWS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.view.IPSAppView> list = new java.util.ArrayList<net.ibizsys.model.app.view.IPSAppView>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.view.IPSAppView obj = this.getPSModelObject(net.ibizsys.model.app.view.IPSAppView.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPVIEWS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappviews = list;
		}
		return (this.allpsappviews.size() == 0)? null : this.allpsappviews;
	}

	public net.ibizsys.model.app.view.IPSAppView getPSAppView(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.view.IPSAppView.class, this.getAllPSAppViews(), objKey, bTryMode);
	}
	public void setPSAppViews(java.util.List<net.ibizsys.model.app.view.IPSAppView> list){
		this.allpsappviews = list;
	}

	private java.util.List<net.ibizsys.model.app.wf.IPSAppWF> allpsappwfs = null;
	public java.util.List<net.ibizsys.model.app.wf.IPSAppWF> getAllPSAppWFs(){
		if(this.allpsappwfs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPWFS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.wf.IPSAppWF> list = new java.util.ArrayList<net.ibizsys.model.app.wf.IPSAppWF>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.wf.IPSAppWF obj = this.getPSModelObject(net.ibizsys.model.app.wf.IPSAppWF.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPWFS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappwfs = list;
		}
		return (this.allpsappwfs.size() == 0)? null : this.allpsappwfs;
	}

	public net.ibizsys.model.app.wf.IPSAppWF getPSAppWF(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.wf.IPSAppWF.class, this.getAllPSAppWFs(), objKey, bTryMode);
	}
	public void setPSAppWFs(java.util.List<net.ibizsys.model.app.wf.IPSAppWF> list){
		this.allpsappwfs = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.priv.IPSDEOPPriv> allpsdeopprivs = null;
	public java.util.List<net.ibizsys.model.dataentity.priv.IPSDEOPPriv> getAllPSDEOPPrivs(){
		if(this.allpsdeopprivs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEOPPRIVS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.priv.IPSDEOPPriv> list = new java.util.ArrayList<net.ibizsys.model.dataentity.priv.IPSDEOPPriv>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.priv.IPSDEOPPriv obj = this.getPSModelObject(net.ibizsys.model.dataentity.priv.IPSDEOPPriv.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEOPPRIVS);
				if(obj!=null)list.add(obj);
			}
			this.allpsdeopprivs = list;
		}
		return (this.allpsdeopprivs.size() == 0)? null : this.allpsdeopprivs;
	}

	public net.ibizsys.model.dataentity.priv.IPSDEOPPriv getPSDEOPPriv(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.priv.IPSDEOPPriv.class, this.getAllPSDEOPPrivs(), objKey, bTryMode);
	}
	public void setPSDEOPPrivs(java.util.List<net.ibizsys.model.dataentity.priv.IPSDEOPPriv> list){
		this.allpsdeopprivs = list;
	}

	private java.util.List<net.ibizsys.model.app.IPSSubAppRef> allpssubapprefs = null;
	public java.util.List<net.ibizsys.model.app.IPSSubAppRef> getAllPSSubAppRefs(){
		if(this.allpssubapprefs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSUBAPPREFS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.IPSSubAppRef> list = new java.util.ArrayList<net.ibizsys.model.app.IPSSubAppRef>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.IPSSubAppRef obj = this.getPSModelObject(net.ibizsys.model.app.IPSSubAppRef.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSUBAPPREFS);
				if(obj!=null)list.add(obj);
			}
			this.allpssubapprefs = list;
		}
		return (this.allpssubapprefs.size() == 0)? null : this.allpssubapprefs;
	}

	public net.ibizsys.model.app.IPSSubAppRef getPSSubAppRef(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.IPSSubAppRef.class, this.getAllPSSubAppRefs(), objKey, bTryMode);
	}
	public void setPSSubAppRefs(java.util.List<net.ibizsys.model.app.IPSSubAppRef> list){
		this.allpssubapprefs = list;
	}

	private java.util.List<net.ibizsys.model.testing.IPSSysTestPrj> allpssystestprjs = null;
	public java.util.List<net.ibizsys.model.testing.IPSSysTestPrj> getAllPSSysTestPrjs(){
		if(this.allpssystestprjs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSTESTPRJS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.testing.IPSSysTestPrj> list = new java.util.ArrayList<net.ibizsys.model.testing.IPSSysTestPrj>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.testing.IPSSysTestPrj obj = this.getPSModelObject(net.ibizsys.model.testing.IPSSysTestPrj.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSTESTPRJS);
				if(obj!=null)list.add(obj);
			}
			this.allpssystestprjs = list;
		}
		return (this.allpssystestprjs.size() == 0)? null : this.allpssystestprjs;
	}

	public net.ibizsys.model.testing.IPSSysTestPrj getPSSysTestPrj(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.testing.IPSSysTestPrj.class, this.getAllPSSysTestPrjs(), objKey, bTryMode);
	}
	public void setPSSysTestPrjs(java.util.List<net.ibizsys.model.testing.IPSSysTestPrj> list){
		this.allpssystestprjs = list;
	}

	public java.lang.String getAppFolder(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAPPFOLDER);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAppMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAPPMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAppTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAPPTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAppTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAPPTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAppTag3(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAPPTAG3);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAppTag4(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAPPTAG4);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAppType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAPPTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAppVersion(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAPPVERSION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getBottomInfo(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBOTTOMINFO);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public int getButtonNoPrivDisplayMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBUTTONNOPRIVDISPLAYMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
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
	private net.ibizsys.model.res.IPSSysCss defaultappviewpssyscss;

	public net.ibizsys.model.res.IPSSysCss getDefaultAppViewPSSysCss(){
		if(this.defaultappviewpssyscss != null) return this.defaultappviewpssyscss;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTAPPVIEWPSSYSCSS);
		if(value == null){
			return null;
		}
		this.defaultappviewpssyscss = getPSModelObject(net.ibizsys.model.res.IPSSysCss.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETDEFAULTAPPVIEWPSSYSCSS);
		return this.defaultappviewpssyscss;
	}

	public net.ibizsys.model.res.IPSSysCss getDefaultAppViewPSSysCssMust(){
		net.ibizsys.model.res.IPSSysCss value = this.getDefaultAppViewPSSysCss();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定默认应用视图界面样式");}
		return value;
	}

	public void setDefaultAppViewPSSysCss(net.ibizsys.model.res.IPSSysCss defaultappviewpssyscss){
		this.defaultappviewpssyscss = defaultappviewpssyscss;
	}


	@Deprecated
	public java.lang.String getDefaultControlStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTCONTROLSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean getDefaultFlag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTFLAG);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public java.lang.String getDefaultOSSCat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTOSSCAT);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.view.IPSAppIndexView defaultpsappindexview;

	public net.ibizsys.model.app.view.IPSAppIndexView getDefaultPSAppIndexView(){
		if(this.defaultpsappindexview != null) return this.defaultpsappindexview;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTPSAPPINDEXVIEW);
		if(value == null){
			return null;
		}
		this.defaultpsappindexview = getPSModelObject(net.ibizsys.model.app.view.IPSAppIndexView.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETDEFAULTPSAPPINDEXVIEW);
		return this.defaultpsappindexview;
	}

	public net.ibizsys.model.app.view.IPSAppIndexView getDefaultPSAppIndexViewMust(){
		net.ibizsys.model.app.view.IPSAppIndexView value = this.getDefaultPSAppIndexView();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定启动首页视图");}
		return value;
	}

	public void setDefaultPSAppIndexView(net.ibizsys.model.app.view.IPSAppIndexView defaultpsappindexview){
		this.defaultpsappindexview = defaultpsappindexview;
	}


	public java.lang.String getDynaModelFilePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMODELFILEPATH);
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

	public int getEngineVer(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENGINEVER);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	@Deprecated
	public java.lang.String getFormItemEmptyText(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFORMITEMEMPTYTEXT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public int getFormItemNoPrivDisplayMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFORMITEMNOPRIVDISPLAYMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	@Deprecated
	public int getGridColumnEnableFilter(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGRIDCOLUMNENABLEFILTER);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	@Deprecated
	public int getGridColumnEnableLink(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGRIDCOLUMNENABLELINK);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	@Deprecated
	public int getGridColumnNoPrivDisplayMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGRIDCOLUMNNOPRIVDISPLAYMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	@Deprecated
	public int getGridRowActiveMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGRIDROWACTIVEMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getHeaderInfo(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHEADERINFO);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getMDCtrlEmptyText(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMDCTRLEMPTYTEXT);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes mdctrlemptytextpslanguageres;

	@Deprecated
	public net.ibizsys.model.res.IPSLanguageRes getMDCtrlEmptyTextPSLanguageRes(){
		if(this.mdctrlemptytextpslanguageres != null) return this.mdctrlemptytextpslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMDCTRLEMPTYTEXTPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.mdctrlemptytextpslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETMDCTRLEMPTYTEXTPSLANGUAGERES);
		return this.mdctrlemptytextpslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getMDCtrlEmptyTextPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getMDCtrlEmptyTextPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "[getMDCtrlEmptyTextPSLanguageRes]返回空值");}
		return value;
	}

	public void setMDCtrlEmptyTextPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes mdctrlemptytextpslanguageres){
		this.mdctrlemptytextpslanguageres = mdctrlemptytextpslanguageres;
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
	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getPFStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPFSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPFType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPFTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPKGCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPKGCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.app.IPSApplicationLogic> psapplicationlogics = null;
	public java.util.List<net.ibizsys.model.app.IPSApplicationLogic> getPSApplicationLogics(){
		if(this.psapplicationlogics == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPLICATIONLOGICS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.IPSApplicationLogic> list = new java.util.ArrayList<net.ibizsys.model.app.IPSApplicationLogic>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.IPSApplicationLogic obj = this.getPSModelObject(net.ibizsys.model.app.IPSApplicationLogic.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPLICATIONLOGICS);
				if(obj!=null)list.add(obj);
			}
			this.psapplicationlogics = list;
		}
		return (this.psapplicationlogics.size() == 0)? null : this.psapplicationlogics;
	}

	public net.ibizsys.model.app.IPSApplicationLogic getPSApplicationLogic(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.IPSApplicationLogic.class, this.getPSApplicationLogics(), objKey, bTryMode);
	}
	public void setPSApplicationLogics(java.util.List<net.ibizsys.model.app.IPSApplicationLogic> list){
		this.psapplicationlogics = list;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用默认图标");}
		return value;
	}

	public void setPSSysImage(net.ibizsys.model.res.IPSSysImage pssysimage){
		this.pssysimage = pssysimage;
	}

	private net.ibizsys.model.res.IPSSysResource pssysresource;

	public net.ibizsys.model.res.IPSSysResource getPSSysResource(){
		if(this.pssysresource != null) return this.pssysresource;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSRESOURCE);
		if(value == null){
			return null;
		}
		this.pssysresource = getPSModelObject(net.ibizsys.model.res.IPSSysResource.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSRESOURCE);
		return this.pssysresource;
	}

	public net.ibizsys.model.res.IPSSysResource getPSSysResourceMust(){
		net.ibizsys.model.res.IPSSysResource value = this.getPSSysResource();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定预置资源对象");}
		return value;
	}

	public void setPSSysResource(net.ibizsys.model.res.IPSSysResource pssysresource){
		this.pssysresource = pssysresource;
	}

	private net.ibizsys.model.res.IPSSysSFPlugin pssyssfplugin;

	public net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin(){
		if(this.pssyssfplugin != null) return this.pssyssfplugin;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSSFPLUGIN);
		if(value == null){
			return null;
		}
		this.pssyssfplugin = getPSModelObject(net.ibizsys.model.res.IPSSysSFPlugin.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSSFPLUGIN);
		return this.pssyssfplugin;
	}

	public net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPluginMust(){
		net.ibizsys.model.res.IPSSysSFPlugin value = this.getPSSysSFPlugin();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定后端扩展插件");}
		return value;
	}

	public void setPSSysSFPlugin(net.ibizsys.model.res.IPSSysSFPlugin pssyssfplugin){
		this.pssyssfplugin = pssyssfplugin;
	}


	public java.lang.String getServiceCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERVICECODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSubAppAccessKey(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSUBAPPACCESSKEY);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSubCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSUBCAPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSysCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSYSCODENAME);
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

	@Deprecated
	public java.lang.String getUIStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUISTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getViewCodeNameMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVIEWCODENAMEMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public boolean isEnableCol12ToCol24(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLECOL12TOCOL24);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableDynaDashboard(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEDYNADASHBOARD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableFilterStorage(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEFILTERSTORAGE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableServiceAPIDTO(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLESERVICEAPIDTO);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableUACLogin(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEUACLOGIN);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableUIModelEx(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEUIMODELEX);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isGridEnableCustomized(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISGRIDENABLECUSTOMIZED);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isGridForceFit(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISGRIDFORCEFIT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isMobileApp(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISMOBILEAPP);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isOutputFormItemUpdatePrivTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISOUTPUTFORMITEMUPDATEPRIVTAG);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isUseServiceApi(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISUSESERVICEAPI);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isWFAppMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISWFAPPMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
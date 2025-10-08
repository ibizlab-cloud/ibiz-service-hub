package net.ibizsys.model;



public class PSSystemImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.IPSSystem{

	public final static String ATTR_GETALLPSAPPS = "getAllPSApps";
	public final static String ATTR_GETALLPSCODELISTS = "getAllPSCodeLists";
	public final static String ATTR_GETALLPSDEOPPRIVS = "getAllPSDEOPPrivs";
	public final static String ATTR_GETALLPSDATAENTITIES = "getAllPSDataEntities";
	public final static String ATTR_GETALLPSSUBSYSSERVICEAPIS = "getAllPSSubSysServiceAPIs";
	public final static String ATTR_GETALLPSSYSAIFACTORIES = "getAllPSSysAIFactories";
	public final static String ATTR_GETALLPSSYSACTORS = "getAllPSSysActors";
	public final static String ATTR_GETALLPSSYSBDSCHEMES = "getAllPSSysBDSchemes";
	public final static String ATTR_GETALLPSSYSBISCHEMES = "getAllPSSysBISchemes";
	public final static String ATTR_GETALLPSSYSBACKSERVICES = "getAllPSSysBackServices";
	public final static String ATTR_GETALLPSSYSCONTENTCATS = "getAllPSSysContentCats";
	public final static String ATTR_GETALLPSSYSCOUNTERS = "getAllPSSysCounters";
	public final static String ATTR_GETALLPSSYSDBSCHEMES = "getAllPSSysDBSchemes";
	public final static String ATTR_GETALLPSSYSDBVALUEFUNCS = "getAllPSSysDBValueFuncs";
	public final static String ATTR_GETALLPSSYSDEGROUPS = "getAllPSSysDEGroups";
	public final static String ATTR_GETALLPSSYSDERGROUPS = "getAllPSSysDERGroups";
	public final static String ATTR_GETALLPSSYSDTSQUEUES = "getAllPSSysDTSQueues";
	public final static String ATTR_GETALLPSSYSDATASYNCAGENTS = "getAllPSSysDataSyncAgents";
	public final static String ATTR_GETALLPSSYSDYNAMODELS = "getAllPSSysDynaModels";
	public final static String ATTR_GETALLPSSYSERMAPS = "getAllPSSysERMaps";
	public final static String ATTR_GETALLPSSYSEDITORSTYLES = "getAllPSSysEditorStyles";
	public final static String ATTR_GETALLPSSYSI18NS = "getAllPSSysI18Ns";
	public final static String ATTR_GETALLPSSYSLOGICS = "getAllPSSysLogics";
	public final static String ATTR_GETALLPSSYSMETHODDTOS = "getAllPSSysMethodDTOs";
	public final static String ATTR_GETALLPSSYSMODELGROUPS = "getAllPSSysModelGroups";
	public final static String ATTR_GETALLPSSYSMSGQUEUES = "getAllPSSysMsgQueues";
	public final static String ATTR_GETALLPSSYSMSGTARGETS = "getAllPSSysMsgTargets";
	public final static String ATTR_GETALLPSSYSMSGTEMPLS = "getAllPSSysMsgTempls";
	public final static String ATTR_GETALLPSSYSPDTVIEWS = "getAllPSSysPDTViews";
	public final static String ATTR_GETALLPSSYSREFS = "getAllPSSysRefs";
	public final static String ATTR_GETALLPSSYSREQITEMS = "getAllPSSysReqItems";
	public final static String ATTR_GETALLPSSYSRESOURCES = "getAllPSSysResources";
	public final static String ATTR_GETALLPSSYSSFPLUGINS = "getAllPSSysSFPlugins";
	public final static String ATTR_GETALLPSSYSSFPUBS = "getAllPSSysSFPubs";
	public final static String ATTR_GETALLPSSYSSAMPLEVALUES = "getAllPSSysSampleValues";
	public final static String ATTR_GETALLPSSYSSEARCHSCHEMES = "getAllPSSysSearchSchemes";
	public final static String ATTR_GETALLPSSYSSEQUENCES = "getAllPSSysSequences";
	public final static String ATTR_GETALLPSSYSSERVICEAPIS = "getAllPSSysServiceAPIs";
	public final static String ATTR_GETALLPSSYSTESTDATAS = "getAllPSSysTestDatas";
	public final static String ATTR_GETALLPSSYSTESTPRJS = "getAllPSSysTestPrjs";
	public final static String ATTR_GETALLPSSYSTRANSLATORS = "getAllPSSysTranslators";
	public final static String ATTR_GETALLPSSYSUCMAPS = "getAllPSSysUCMaps";
	public final static String ATTR_GETALLPSSYSUNIRESES = "getAllPSSysUniReses";
	public final static String ATTR_GETALLPSSYSUNISTATES = "getAllPSSysUniStates";
	public final static String ATTR_GETALLPSSYSUSECASES = "getAllPSSysUseCases";
	public final static String ATTR_GETALLPSSYSUSERDRS = "getAllPSSysUserDRs";
	public final static String ATTR_GETALLPSSYSUSERMODES = "getAllPSSysUserModes";
	public final static String ATTR_GETALLPSSYSUSERROLES = "getAllPSSysUserRoles";
	public final static String ATTR_GETALLPSSYSUTILS = "getAllPSSysUtils";
	public final static String ATTR_GETALLPSSYSVALUERULES = "getAllPSSysValueRules";
	public final static String ATTR_GETALLPSSYSTEMDBCONFIGS = "getAllPSSystemDBConfigs";
	public final static String ATTR_GETALLPSSYSTEMMODULES = "getAllPSSystemModules";
	public final static String ATTR_GETALLPSWFROLES = "getAllPSWFRoles";
	public final static String ATTR_GETALLPSWFWORKTIMES = "getAllPSWFWorkTimes";
	public final static String ATTR_GETALLPSWXACCOUNTS = "getAllPSWXAccounts";
	public final static String ATTR_GETALLPSWORKFLOWS = "getAllPSWorkflows";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDEFAULTLANGUAGE = "defaultLanguage";
	public final static String ATTR_GETDEFAULTPSSYSI18N = "getDefaultPSSysI18N";
	public final static String ATTR_GETDEFAULTPSSYSSFPUB = "getDefaultPSSysSFPub";
	public final static String ATTR_GETDEFAULTSCRIPTENGINE = "defaultScriptEngine";
	public final static String ATTR_GETDEPLOYSYSID = "deploySysId";
	public final static String ATTR_GETDEPLOYSYSORGID = "deploySysOrgId";
	public final static String ATTR_GETDEPLOYSYSORGSECTORID = "deploySysOrgSectorId";
	public final static String ATTR_GETDEPLOYSYSTAG = "deploySysTag";
	public final static String ATTR_GETDEPLOYSYSTAG2 = "deploySysTag2";
	public final static String ATTR_GETDEPLOYSYSTYPE = "deploySysType";
	public final static String ATTR_GETDYNAINSTMODE = "dynaInstMode";
	public final static String ATTR_GETDYNAINSTTAG = "dynaInstTag";
	public final static String ATTR_GETDYNAINSTTAG2 = "dynaInstTag2";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETENGINEVER = "engineVer";
	public final static String ATTR_GETINITPSSYSCONTENTS = "getInitPSSysContents";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETPSDEVSLNSYSID = "getPSDevSlnSysId";
	public final static String ATTR_GETPSDYNAMODEL = "getPSDynaModel";
	public final static String ATTR_GETRTOBJECTNAME = "rTObjectName";
	public final static String ATTR_GETROOTPSSYSREQMODULES = "getRootPSSysReqModules";
	public final static String ATTR_GETSAMPLEPSSYSCONTENTS = "getSamplePSSysContents";
	public final static String ATTR_GETSYSTAG = "sysTag";
	public final static String ATTR_GETSYSTAG2 = "sysTag2";
	public final static String ATTR_GETSYSTAG3 = "sysTag3";
	public final static String ATTR_GETSYSTAG4 = "sysTag4";
	public final static String ATTR_GETSYSTYPE = "sysType";
	public final static String ATTR_GETTESTPSSYSCONTENTS = "getTestPSSysContents";
	public final static String ATTR_GETVCNAME = "vCName";

	private java.util.List<net.ibizsys.model.app.IPSApplication> allpsapps = null;
	public java.util.List<net.ibizsys.model.app.IPSApplication> getAllPSApps(){
		if(this.allpsapps == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.IPSApplication> list = new java.util.ArrayList<net.ibizsys.model.app.IPSApplication>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.IPSApplication obj = this.getPSModelObject(net.ibizsys.model.app.IPSApplication.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPS);
				if(obj!=null)list.add(obj);
			}
			this.allpsapps = list;
		}
		return (this.allpsapps.size() == 0)? null : this.allpsapps;
	}

	public net.ibizsys.model.app.IPSApplication getPSApplication(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.IPSApplication.class, this.getAllPSApps(), objKey, bTryMode);
	}
	public void setPSApplications(java.util.List<net.ibizsys.model.app.IPSApplication> list){
		this.allpsapps = list;
	}

	private java.util.List<net.ibizsys.model.codelist.IPSCodeList> allpscodelists = null;
	public java.util.List<net.ibizsys.model.codelist.IPSCodeList> getAllPSCodeLists(){
		if(this.allpscodelists == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSCODELISTS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.codelist.IPSCodeList> list = new java.util.ArrayList<net.ibizsys.model.codelist.IPSCodeList>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.codelist.IPSCodeList obj = this.getPSModelObject(net.ibizsys.model.codelist.IPSCodeList.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSCODELISTS);
				if(obj!=null)list.add(obj);
			}
			this.allpscodelists = list;
		}
		return (this.allpscodelists.size() == 0)? null : this.allpscodelists;
	}

	public net.ibizsys.model.codelist.IPSCodeList getPSCodeList(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.codelist.IPSCodeList.class, this.getAllPSCodeLists(), objKey, bTryMode);
	}
	public void setPSCodeLists(java.util.List<net.ibizsys.model.codelist.IPSCodeList> list){
		this.allpscodelists = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.priv.IPSSysDEOPPriv> allpsdeopprivs = null;
	public java.util.List<net.ibizsys.model.dataentity.priv.IPSSysDEOPPriv> getAllPSDEOPPrivs(){
		if(this.allpsdeopprivs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEOPPRIVS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.priv.IPSSysDEOPPriv> list = new java.util.ArrayList<net.ibizsys.model.dataentity.priv.IPSSysDEOPPriv>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.priv.IPSSysDEOPPriv obj = this.getPSModelObject(net.ibizsys.model.dataentity.priv.IPSSysDEOPPriv.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEOPPRIVS);
				if(obj!=null)list.add(obj);
			}
			this.allpsdeopprivs = list;
		}
		return (this.allpsdeopprivs.size() == 0)? null : this.allpsdeopprivs;
	}

	public net.ibizsys.model.dataentity.priv.IPSSysDEOPPriv getPSSysDEOPPriv(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.priv.IPSSysDEOPPriv.class, this.getAllPSDEOPPrivs(), objKey, bTryMode);
	}
	public void setPSSysDEOPPrivs(java.util.List<net.ibizsys.model.dataentity.priv.IPSSysDEOPPriv> list){
		this.allpsdeopprivs = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.IPSDataEntity> allpsdataentities = null;
	public java.util.List<net.ibizsys.model.dataentity.IPSDataEntity> getAllPSDataEntities(){
		if(this.allpsdataentities == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDATAENTITIES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.IPSDataEntity> list = new java.util.ArrayList<net.ibizsys.model.dataentity.IPSDataEntity>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.IPSDataEntity obj = this.getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDATAENTITIES);
				if(obj!=null)list.add(obj);
			}
			this.allpsdataentities = list;
		}
		return (this.allpsdataentities.size() == 0)? null : this.allpsdataentities;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, this.getAllPSDataEntities(), objKey, bTryMode);
	}
	public void setPSDataEntities(java.util.List<net.ibizsys.model.dataentity.IPSDataEntity> list){
		this.allpsdataentities = list;
	}

	private java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPI> allpssubsysserviceapis = null;
	public java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPI> getAllPSSubSysServiceAPIs(){
		if(this.allpssubsysserviceapis == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSUBSYSSERVICEAPIS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPI> list = new java.util.ArrayList<net.ibizsys.model.service.IPSSubSysServiceAPI>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.service.IPSSubSysServiceAPI obj = this.getPSModelObject(net.ibizsys.model.service.IPSSubSysServiceAPI.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSUBSYSSERVICEAPIS);
				if(obj!=null)list.add(obj);
			}
			this.allpssubsysserviceapis = list;
		}
		return (this.allpssubsysserviceapis.size() == 0)? null : this.allpssubsysserviceapis;
	}

	public net.ibizsys.model.service.IPSSubSysServiceAPI getPSSubSysServiceAPI(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.service.IPSSubSysServiceAPI.class, this.getAllPSSubSysServiceAPIs(), objKey, bTryMode);
	}
	public void setPSSubSysServiceAPIs(java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPI> list){
		this.allpssubsysserviceapis = list;
	}

	private java.util.List<net.ibizsys.model.ai.IPSSysAIFactory> allpssysaifactories = null;
	public java.util.List<net.ibizsys.model.ai.IPSSysAIFactory> getAllPSSysAIFactories(){
		if(this.allpssysaifactories == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSAIFACTORIES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.ai.IPSSysAIFactory> list = new java.util.ArrayList<net.ibizsys.model.ai.IPSSysAIFactory>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.ai.IPSSysAIFactory obj = this.getPSModelObject(net.ibizsys.model.ai.IPSSysAIFactory.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSAIFACTORIES);
				if(obj!=null)list.add(obj);
			}
			this.allpssysaifactories = list;
		}
		return (this.allpssysaifactories.size() == 0)? null : this.allpssysaifactories;
	}

	public net.ibizsys.model.ai.IPSSysAIFactory getPSSysAIFactory(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.ai.IPSSysAIFactory.class, this.getAllPSSysAIFactories(), objKey, bTryMode);
	}
	public void setPSSysAIFactories(java.util.List<net.ibizsys.model.ai.IPSSysAIFactory> list){
		this.allpssysaifactories = list;
	}

	private java.util.List<net.ibizsys.model.uml.IPSSysActor> allpssysactors = null;
	public java.util.List<net.ibizsys.model.uml.IPSSysActor> getAllPSSysActors(){
		if(this.allpssysactors == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSACTORS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.uml.IPSSysActor> list = new java.util.ArrayList<net.ibizsys.model.uml.IPSSysActor>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.uml.IPSSysActor obj = this.getPSModelObject(net.ibizsys.model.uml.IPSSysActor.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSACTORS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysactors = list;
		}
		return (this.allpssysactors.size() == 0)? null : this.allpssysactors;
	}

	public net.ibizsys.model.uml.IPSSysActor getPSSysActor(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.uml.IPSSysActor.class, this.getAllPSSysActors(), objKey, bTryMode);
	}
	public void setPSSysActors(java.util.List<net.ibizsys.model.uml.IPSSysActor> list){
		this.allpssysactors = list;
	}

	private java.util.List<net.ibizsys.model.ba.IPSSysBDScheme> allpssysbdschemes = null;
	public java.util.List<net.ibizsys.model.ba.IPSSysBDScheme> getAllPSSysBDSchemes(){
		if(this.allpssysbdschemes == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSBDSCHEMES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.ba.IPSSysBDScheme> list = new java.util.ArrayList<net.ibizsys.model.ba.IPSSysBDScheme>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.ba.IPSSysBDScheme obj = this.getPSModelObject(net.ibizsys.model.ba.IPSSysBDScheme.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSBDSCHEMES);
				if(obj!=null)list.add(obj);
			}
			this.allpssysbdschemes = list;
		}
		return (this.allpssysbdschemes.size() == 0)? null : this.allpssysbdschemes;
	}

	public net.ibizsys.model.ba.IPSSysBDScheme getPSSysBDScheme(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.ba.IPSSysBDScheme.class, this.getAllPSSysBDSchemes(), objKey, bTryMode);
	}
	public void setPSSysBDSchemes(java.util.List<net.ibizsys.model.ba.IPSSysBDScheme> list){
		this.allpssysbdschemes = list;
	}

	private java.util.List<net.ibizsys.model.bi.IPSSysBIScheme> allpssysbischemes = null;
	public java.util.List<net.ibizsys.model.bi.IPSSysBIScheme> getAllPSSysBISchemes(){
		if(this.allpssysbischemes == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSBISCHEMES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.bi.IPSSysBIScheme> list = new java.util.ArrayList<net.ibizsys.model.bi.IPSSysBIScheme>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.bi.IPSSysBIScheme obj = this.getPSModelObject(net.ibizsys.model.bi.IPSSysBIScheme.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSBISCHEMES);
				if(obj!=null)list.add(obj);
			}
			this.allpssysbischemes = list;
		}
		return (this.allpssysbischemes.size() == 0)? null : this.allpssysbischemes;
	}

	public net.ibizsys.model.bi.IPSSysBIScheme getPSSysBIScheme(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.bi.IPSSysBIScheme.class, this.getAllPSSysBISchemes(), objKey, bTryMode);
	}
	public void setPSSysBISchemes(java.util.List<net.ibizsys.model.bi.IPSSysBIScheme> list){
		this.allpssysbischemes = list;
	}

	private java.util.List<net.ibizsys.model.backservice.IPSSysBackService> allpssysbackservices = null;
	public java.util.List<net.ibizsys.model.backservice.IPSSysBackService> getAllPSSysBackServices(){
		if(this.allpssysbackservices == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSBACKSERVICES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.backservice.IPSSysBackService> list = new java.util.ArrayList<net.ibizsys.model.backservice.IPSSysBackService>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.backservice.IPSSysBackService obj = this.getPSModelObject(net.ibizsys.model.backservice.IPSSysBackService.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSBACKSERVICES);
				if(obj!=null)list.add(obj);
			}
			this.allpssysbackservices = list;
		}
		return (this.allpssysbackservices.size() == 0)? null : this.allpssysbackservices;
	}

	public net.ibizsys.model.backservice.IPSSysBackService getPSSysBackService(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.backservice.IPSSysBackService.class, this.getAllPSSysBackServices(), objKey, bTryMode);
	}
	public void setPSSysBackServices(java.util.List<net.ibizsys.model.backservice.IPSSysBackService> list){
		this.allpssysbackservices = list;
	}

	private java.util.List<net.ibizsys.model.res.IPSSysContentCat> allpssyscontentcats = null;
	public java.util.List<net.ibizsys.model.res.IPSSysContentCat> getAllPSSysContentCats(){
		if(this.allpssyscontentcats == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSCONTENTCATS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.res.IPSSysContentCat> list = new java.util.ArrayList<net.ibizsys.model.res.IPSSysContentCat>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.res.IPSSysContentCat obj = this.getPSModelObject(net.ibizsys.model.res.IPSSysContentCat.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSCONTENTCATS);
				if(obj!=null)list.add(obj);
			}
			this.allpssyscontentcats = list;
		}
		return (this.allpssyscontentcats.size() == 0)? null : this.allpssyscontentcats;
	}

	public net.ibizsys.model.res.IPSSysContentCat getPSSysContentCat(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.res.IPSSysContentCat.class, this.getAllPSSysContentCats(), objKey, bTryMode);
	}
	public void setPSSysContentCats(java.util.List<net.ibizsys.model.res.IPSSysContentCat> list){
		this.allpssyscontentcats = list;
	}

	private java.util.List<net.ibizsys.model.control.counter.IPSSysCounter> allpssyscounters = null;
	public java.util.List<net.ibizsys.model.control.counter.IPSSysCounter> getAllPSSysCounters(){
		if(this.allpssyscounters == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSCOUNTERS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.counter.IPSSysCounter> list = new java.util.ArrayList<net.ibizsys.model.control.counter.IPSSysCounter>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.counter.IPSSysCounter obj = this.getPSModelObject(net.ibizsys.model.control.counter.IPSSysCounter.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSCOUNTERS);
				if(obj!=null)list.add(obj);
			}
			this.allpssyscounters = list;
		}
		return (this.allpssyscounters.size() == 0)? null : this.allpssyscounters;
	}

	public net.ibizsys.model.control.counter.IPSSysCounter getPSSysCounter(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.counter.IPSSysCounter.class, this.getAllPSSysCounters(), objKey, bTryMode);
	}
	public void setPSSysCounters(java.util.List<net.ibizsys.model.control.counter.IPSSysCounter> list){
		this.allpssyscounters = list;
	}

	private java.util.List<net.ibizsys.model.database.IPSSysDBScheme> allpssysdbschemes = null;
	public java.util.List<net.ibizsys.model.database.IPSSysDBScheme> getAllPSSysDBSchemes(){
		if(this.allpssysdbschemes == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSDBSCHEMES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.database.IPSSysDBScheme> list = new java.util.ArrayList<net.ibizsys.model.database.IPSSysDBScheme>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.database.IPSSysDBScheme obj = this.getPSModelObject(net.ibizsys.model.database.IPSSysDBScheme.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSDBSCHEMES);
				if(obj!=null)list.add(obj);
			}
			this.allpssysdbschemes = list;
		}
		return (this.allpssysdbschemes.size() == 0)? null : this.allpssysdbschemes;
	}

	public net.ibizsys.model.database.IPSSysDBScheme getPSSysDBScheme(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.database.IPSSysDBScheme.class, this.getAllPSSysDBSchemes(), objKey, bTryMode);
	}
	public void setPSSysDBSchemes(java.util.List<net.ibizsys.model.database.IPSSysDBScheme> list){
		this.allpssysdbschemes = list;
	}

	private java.util.List<net.ibizsys.model.database.IPSSysDBValueFunc> allpssysdbvaluefuncs = null;
	public java.util.List<net.ibizsys.model.database.IPSSysDBValueFunc> getAllPSSysDBValueFuncs(){
		if(this.allpssysdbvaluefuncs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSDBVALUEFUNCS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.database.IPSSysDBValueFunc> list = new java.util.ArrayList<net.ibizsys.model.database.IPSSysDBValueFunc>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.database.IPSSysDBValueFunc obj = this.getPSModelObject(net.ibizsys.model.database.IPSSysDBValueFunc.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSDBVALUEFUNCS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysdbvaluefuncs = list;
		}
		return (this.allpssysdbvaluefuncs.size() == 0)? null : this.allpssysdbvaluefuncs;
	}

	public net.ibizsys.model.database.IPSSysDBValueFunc getPSSysDBValueFunc(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.database.IPSSysDBValueFunc.class, this.getAllPSSysDBValueFuncs(), objKey, bTryMode);
	}
	public void setPSSysDBValueFuncs(java.util.List<net.ibizsys.model.database.IPSSysDBValueFunc> list){
		this.allpssysdbvaluefuncs = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.IPSSysDEGroup> allpssysdegroups = null;
	public java.util.List<net.ibizsys.model.dataentity.IPSSysDEGroup> getAllPSSysDEGroups(){
		if(this.allpssysdegroups == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSDEGROUPS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.IPSSysDEGroup> list = new java.util.ArrayList<net.ibizsys.model.dataentity.IPSSysDEGroup>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.IPSSysDEGroup obj = this.getPSModelObject(net.ibizsys.model.dataentity.IPSSysDEGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSDEGROUPS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysdegroups = list;
		}
		return (this.allpssysdegroups.size() == 0)? null : this.allpssysdegroups;
	}

	public net.ibizsys.model.dataentity.IPSSysDEGroup getPSSysDEGroup(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.IPSSysDEGroup.class, this.getAllPSSysDEGroups(), objKey, bTryMode);
	}
	public void setPSSysDEGroups(java.util.List<net.ibizsys.model.dataentity.IPSSysDEGroup> list){
		this.allpssysdegroups = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.der.IPSSysDERGroup> allpssysdergroups = null;
	public java.util.List<net.ibizsys.model.dataentity.der.IPSSysDERGroup> getAllPSSysDERGroups(){
		if(this.allpssysdergroups == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSDERGROUPS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.der.IPSSysDERGroup> list = new java.util.ArrayList<net.ibizsys.model.dataentity.der.IPSSysDERGroup>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.der.IPSSysDERGroup obj = this.getPSModelObject(net.ibizsys.model.dataentity.der.IPSSysDERGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSDERGROUPS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysdergroups = list;
		}
		return (this.allpssysdergroups.size() == 0)? null : this.allpssysdergroups;
	}

	public net.ibizsys.model.dataentity.der.IPSSysDERGroup getPSSysDERGroup(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.der.IPSSysDERGroup.class, this.getAllPSSysDERGroups(), objKey, bTryMode);
	}
	public void setPSSysDERGroups(java.util.List<net.ibizsys.model.dataentity.der.IPSSysDERGroup> list){
		this.allpssysdergroups = list;
	}

	private java.util.List<net.ibizsys.model.dts.IPSSysDTSQueue> allpssysdtsqueues = null;
	public java.util.List<net.ibizsys.model.dts.IPSSysDTSQueue> getAllPSSysDTSQueues(){
		if(this.allpssysdtsqueues == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSDTSQUEUES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dts.IPSSysDTSQueue> list = new java.util.ArrayList<net.ibizsys.model.dts.IPSSysDTSQueue>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dts.IPSSysDTSQueue obj = this.getPSModelObject(net.ibizsys.model.dts.IPSSysDTSQueue.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSDTSQUEUES);
				if(obj!=null)list.add(obj);
			}
			this.allpssysdtsqueues = list;
		}
		return (this.allpssysdtsqueues.size() == 0)? null : this.allpssysdtsqueues;
	}

	public net.ibizsys.model.dts.IPSSysDTSQueue getPSSysDTSQueue(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dts.IPSSysDTSQueue.class, this.getAllPSSysDTSQueues(), objKey, bTryMode);
	}
	public void setPSSysDTSQueues(java.util.List<net.ibizsys.model.dts.IPSSysDTSQueue> list){
		this.allpssysdtsqueues = list;
	}

	private java.util.List<net.ibizsys.model.res.IPSSysDataSyncAgent> allpssysdatasyncagents = null;
	public java.util.List<net.ibizsys.model.res.IPSSysDataSyncAgent> getAllPSSysDataSyncAgents(){
		if(this.allpssysdatasyncagents == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSDATASYNCAGENTS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.res.IPSSysDataSyncAgent> list = new java.util.ArrayList<net.ibizsys.model.res.IPSSysDataSyncAgent>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.res.IPSSysDataSyncAgent obj = this.getPSModelObject(net.ibizsys.model.res.IPSSysDataSyncAgent.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSDATASYNCAGENTS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysdatasyncagents = list;
		}
		return (this.allpssysdatasyncagents.size() == 0)? null : this.allpssysdatasyncagents;
	}

	public net.ibizsys.model.res.IPSSysDataSyncAgent getPSSysDataSyncAgent(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.res.IPSSysDataSyncAgent.class, this.getAllPSSysDataSyncAgents(), objKey, bTryMode);
	}
	public void setPSSysDataSyncAgents(java.util.List<net.ibizsys.model.res.IPSSysDataSyncAgent> list){
		this.allpssysdatasyncagents = list;
	}

	private java.util.List<net.ibizsys.model.dynamodel.IPSSysDynaModel> allpssysdynamodels = null;
	public java.util.List<net.ibizsys.model.dynamodel.IPSSysDynaModel> getAllPSSysDynaModels(){
		if(this.allpssysdynamodels == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSDYNAMODELS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dynamodel.IPSSysDynaModel> list = new java.util.ArrayList<net.ibizsys.model.dynamodel.IPSSysDynaModel>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dynamodel.IPSSysDynaModel obj = this.getPSModelObject(net.ibizsys.model.dynamodel.IPSSysDynaModel.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSDYNAMODELS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysdynamodels = list;
		}
		return (this.allpssysdynamodels.size() == 0)? null : this.allpssysdynamodels;
	}

	public net.ibizsys.model.dynamodel.IPSSysDynaModel getPSSysDynaModel(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dynamodel.IPSSysDynaModel.class, this.getAllPSSysDynaModels(), objKey, bTryMode);
	}
	public void setPSSysDynaModels(java.util.List<net.ibizsys.model.dynamodel.IPSSysDynaModel> list){
		this.allpssysdynamodels = list;
	}

	private java.util.List<net.ibizsys.model.er.IPSSysERMap> allpssysermaps = null;
	public java.util.List<net.ibizsys.model.er.IPSSysERMap> getAllPSSysERMaps(){
		if(this.allpssysermaps == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSERMAPS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.er.IPSSysERMap> list = new java.util.ArrayList<net.ibizsys.model.er.IPSSysERMap>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.er.IPSSysERMap obj = this.getPSModelObject(net.ibizsys.model.er.IPSSysERMap.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSERMAPS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysermaps = list;
		}
		return (this.allpssysermaps.size() == 0)? null : this.allpssysermaps;
	}

	public net.ibizsys.model.er.IPSSysERMap getPSSysERMap(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.er.IPSSysERMap.class, this.getAllPSSysERMaps(), objKey, bTryMode);
	}
	public void setPSSysERMaps(java.util.List<net.ibizsys.model.er.IPSSysERMap> list){
		this.allpssysermaps = list;
	}

	private java.util.List<net.ibizsys.model.res.IPSSysEditorStyle> allpssyseditorstyles = null;
	public java.util.List<net.ibizsys.model.res.IPSSysEditorStyle> getAllPSSysEditorStyles(){
		if(this.allpssyseditorstyles == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSEDITORSTYLES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.res.IPSSysEditorStyle> list = new java.util.ArrayList<net.ibizsys.model.res.IPSSysEditorStyle>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.res.IPSSysEditorStyle obj = this.getPSModelObject(net.ibizsys.model.res.IPSSysEditorStyle.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSEDITORSTYLES);
				if(obj!=null)list.add(obj);
			}
			this.allpssyseditorstyles = list;
		}
		return (this.allpssyseditorstyles.size() == 0)? null : this.allpssyseditorstyles;
	}

	public net.ibizsys.model.res.IPSSysEditorStyle getPSSysEditorStyle(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.res.IPSSysEditorStyle.class, this.getAllPSSysEditorStyles(), objKey, bTryMode);
	}
	public void setPSSysEditorStyles(java.util.List<net.ibizsys.model.res.IPSSysEditorStyle> list){
		this.allpssyseditorstyles = list;
	}

	private java.util.List<net.ibizsys.model.res.IPSSysI18N> allpssysi18ns = null;
	public java.util.List<net.ibizsys.model.res.IPSSysI18N> getAllPSSysI18Ns(){
		if(this.allpssysi18ns == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSI18NS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.res.IPSSysI18N> list = new java.util.ArrayList<net.ibizsys.model.res.IPSSysI18N>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.res.IPSSysI18N obj = this.getPSModelObject(net.ibizsys.model.res.IPSSysI18N.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSI18NS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysi18ns = list;
		}
		return (this.allpssysi18ns.size() == 0)? null : this.allpssysi18ns;
	}

	public net.ibizsys.model.res.IPSSysI18N getPSSysI18N(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.res.IPSSysI18N.class, this.getAllPSSysI18Ns(), objKey, bTryMode);
	}
	public void setPSSysI18Ns(java.util.List<net.ibizsys.model.res.IPSSysI18N> list){
		this.allpssysi18ns = list;
	}

	private java.util.List<net.ibizsys.model.res.IPSSysLogic> allpssyslogics = null;
	public java.util.List<net.ibizsys.model.res.IPSSysLogic> getAllPSSysLogics(){
		if(this.allpssyslogics == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSLOGICS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.res.IPSSysLogic> list = new java.util.ArrayList<net.ibizsys.model.res.IPSSysLogic>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.res.IPSSysLogic obj = this.getPSModelObject(net.ibizsys.model.res.IPSSysLogic.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSLOGICS);
				if(obj!=null)list.add(obj);
			}
			this.allpssyslogics = list;
		}
		return (this.allpssyslogics.size() == 0)? null : this.allpssyslogics;
	}

	public net.ibizsys.model.res.IPSSysLogic getPSSysLogic(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.res.IPSSysLogic.class, this.getAllPSSysLogics(), objKey, bTryMode);
	}
	public void setPSSysLogics(java.util.List<net.ibizsys.model.res.IPSSysLogic> list){
		this.allpssyslogics = list;
	}

	private java.util.List<net.ibizsys.model.service.IPSSysMethodDTO> allpssysmethoddtos = null;
	public java.util.List<net.ibizsys.model.service.IPSSysMethodDTO> getAllPSSysMethodDTOs(){
		if(this.allpssysmethoddtos == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSMETHODDTOS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.service.IPSSysMethodDTO> list = new java.util.ArrayList<net.ibizsys.model.service.IPSSysMethodDTO>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.service.IPSSysMethodDTO obj = this.getPSModelObject(net.ibizsys.model.service.IPSSysMethodDTO.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSMETHODDTOS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysmethoddtos = list;
		}
		return (this.allpssysmethoddtos.size() == 0)? null : this.allpssysmethoddtos;
	}

	public net.ibizsys.model.service.IPSSysMethodDTO getPSSysMethodDTO(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.service.IPSSysMethodDTO.class, this.getAllPSSysMethodDTOs(), objKey, bTryMode);
	}
	public void setPSSysMethodDTOs(java.util.List<net.ibizsys.model.service.IPSSysMethodDTO> list){
		this.allpssysmethoddtos = list;
	}

	private java.util.List<net.ibizsys.model.system.IPSSysModelGroup> allpssysmodelgroups = null;
	public java.util.List<net.ibizsys.model.system.IPSSysModelGroup> getAllPSSysModelGroups(){
		if(this.allpssysmodelgroups == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSMODELGROUPS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.system.IPSSysModelGroup> list = new java.util.ArrayList<net.ibizsys.model.system.IPSSysModelGroup>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.system.IPSSysModelGroup obj = this.getPSModelObject(net.ibizsys.model.system.IPSSysModelGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSMODELGROUPS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysmodelgroups = list;
		}
		return (this.allpssysmodelgroups.size() == 0)? null : this.allpssysmodelgroups;
	}

	public net.ibizsys.model.system.IPSSysModelGroup getPSSysModelGroup(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.system.IPSSysModelGroup.class, this.getAllPSSysModelGroups(), objKey, bTryMode);
	}
	public void setPSSysModelGroups(java.util.List<net.ibizsys.model.system.IPSSysModelGroup> list){
		this.allpssysmodelgroups = list;
	}

	private java.util.List<net.ibizsys.model.msg.IPSSysMsgQueue> allpssysmsgqueues = null;
	public java.util.List<net.ibizsys.model.msg.IPSSysMsgQueue> getAllPSSysMsgQueues(){
		if(this.allpssysmsgqueues == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSMSGQUEUES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.msg.IPSSysMsgQueue> list = new java.util.ArrayList<net.ibizsys.model.msg.IPSSysMsgQueue>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.msg.IPSSysMsgQueue obj = this.getPSModelObject(net.ibizsys.model.msg.IPSSysMsgQueue.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSMSGQUEUES);
				if(obj!=null)list.add(obj);
			}
			this.allpssysmsgqueues = list;
		}
		return (this.allpssysmsgqueues.size() == 0)? null : this.allpssysmsgqueues;
	}

	public net.ibizsys.model.msg.IPSSysMsgQueue getPSSysMsgQueue(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.msg.IPSSysMsgQueue.class, this.getAllPSSysMsgQueues(), objKey, bTryMode);
	}
	public void setPSSysMsgQueues(java.util.List<net.ibizsys.model.msg.IPSSysMsgQueue> list){
		this.allpssysmsgqueues = list;
	}

	private java.util.List<net.ibizsys.model.msg.IPSSysMsgTarget> allpssysmsgtars = null;
	public java.util.List<net.ibizsys.model.msg.IPSSysMsgTarget> getAllPSSysMsgTargets(){
		if(this.allpssysmsgtars == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSMSGTARGETS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.msg.IPSSysMsgTarget> list = new java.util.ArrayList<net.ibizsys.model.msg.IPSSysMsgTarget>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.msg.IPSSysMsgTarget obj = this.getPSModelObject(net.ibizsys.model.msg.IPSSysMsgTarget.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSMSGTARGETS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysmsgtars = list;
		}
		return (this.allpssysmsgtars.size() == 0)? null : this.allpssysmsgtars;
	}

	public net.ibizsys.model.msg.IPSSysMsgTarget getPSSysMsgTarget(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.msg.IPSSysMsgTarget.class, this.getAllPSSysMsgTargets(), objKey, bTryMode);
	}
	public void setPSSysMsgTargets(java.util.List<net.ibizsys.model.msg.IPSSysMsgTarget> list){
		this.allpssysmsgtars = list;
	}

	private java.util.List<net.ibizsys.model.msg.IPSSysMsgTempl> allpssysmsgtempls = null;
	public java.util.List<net.ibizsys.model.msg.IPSSysMsgTempl> getAllPSSysMsgTempls(){
		if(this.allpssysmsgtempls == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSMSGTEMPLS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.msg.IPSSysMsgTempl> list = new java.util.ArrayList<net.ibizsys.model.msg.IPSSysMsgTempl>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.msg.IPSSysMsgTempl obj = this.getPSModelObject(net.ibizsys.model.msg.IPSSysMsgTempl.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSMSGTEMPLS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysmsgtempls = list;
		}
		return (this.allpssysmsgtempls.size() == 0)? null : this.allpssysmsgtempls;
	}

	public net.ibizsys.model.msg.IPSSysMsgTempl getPSSysMsgTempl(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.msg.IPSSysMsgTempl.class, this.getAllPSSysMsgTempls(), objKey, bTryMode);
	}
	public void setPSSysMsgTempls(java.util.List<net.ibizsys.model.msg.IPSSysMsgTempl> list){
		this.allpssysmsgtempls = list;
	}

	private java.util.List<net.ibizsys.model.res.IPSSysPDTView> allpssyspdtviews = null;
	public java.util.List<net.ibizsys.model.res.IPSSysPDTView> getAllPSSysPDTViews(){
		if(this.allpssyspdtviews == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSPDTVIEWS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.res.IPSSysPDTView> list = new java.util.ArrayList<net.ibizsys.model.res.IPSSysPDTView>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.res.IPSSysPDTView obj = this.getPSModelObject(net.ibizsys.model.res.IPSSysPDTView.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSPDTVIEWS);
				if(obj!=null)list.add(obj);
			}
			this.allpssyspdtviews = list;
		}
		return (this.allpssyspdtviews.size() == 0)? null : this.allpssyspdtviews;
	}

	public net.ibizsys.model.res.IPSSysPDTView getPSSysPDTView(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.res.IPSSysPDTView.class, this.getAllPSSysPDTViews(), objKey, bTryMode);
	}
	public void setPSSysPDTViews(java.util.List<net.ibizsys.model.res.IPSSysPDTView> list){
		this.allpssyspdtviews = list;
	}

	private java.util.List<net.ibizsys.model.system.IPSSysRef> allpssysrefs = null;
	public java.util.List<net.ibizsys.model.system.IPSSysRef> getAllPSSysRefs(){
		if(this.allpssysrefs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSREFS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.system.IPSSysRef> list = new java.util.ArrayList<net.ibizsys.model.system.IPSSysRef>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.system.IPSSysRef obj = this.getPSModelObject(net.ibizsys.model.system.IPSSysRef.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSREFS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysrefs = list;
		}
		return (this.allpssysrefs.size() == 0)? null : this.allpssysrefs;
	}

	public net.ibizsys.model.system.IPSSysRef getPSSysRef(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.system.IPSSysRef.class, this.getAllPSSysRefs(), objKey, bTryMode);
	}
	public void setPSSysRefs(java.util.List<net.ibizsys.model.system.IPSSysRef> list){
		this.allpssysrefs = list;
	}

	private java.util.List<net.ibizsys.model.requirement.IPSSysReqItem> allpssysreqitems = null;
	public java.util.List<net.ibizsys.model.requirement.IPSSysReqItem> getAllPSSysReqItems(){
		if(this.allpssysreqitems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSREQITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.requirement.IPSSysReqItem> list = new java.util.ArrayList<net.ibizsys.model.requirement.IPSSysReqItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.requirement.IPSSysReqItem obj = this.getPSModelObject(net.ibizsys.model.requirement.IPSSysReqItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSREQITEMS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysreqitems = list;
		}
		return (this.allpssysreqitems.size() == 0)? null : this.allpssysreqitems;
	}

	public net.ibizsys.model.requirement.IPSSysReqItem getPSSysReqItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.requirement.IPSSysReqItem.class, this.getAllPSSysReqItems(), objKey, bTryMode);
	}
	public void setPSSysReqItems(java.util.List<net.ibizsys.model.requirement.IPSSysReqItem> list){
		this.allpssysreqitems = list;
	}

	private java.util.List<net.ibizsys.model.res.IPSSysResource> allpssysresources = null;
	public java.util.List<net.ibizsys.model.res.IPSSysResource> getAllPSSysResources(){
		if(this.allpssysresources == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSRESOURCES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.res.IPSSysResource> list = new java.util.ArrayList<net.ibizsys.model.res.IPSSysResource>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.res.IPSSysResource obj = this.getPSModelObject(net.ibizsys.model.res.IPSSysResource.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSRESOURCES);
				if(obj!=null)list.add(obj);
			}
			this.allpssysresources = list;
		}
		return (this.allpssysresources.size() == 0)? null : this.allpssysresources;
	}

	public net.ibizsys.model.res.IPSSysResource getPSSysResource(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.res.IPSSysResource.class, this.getAllPSSysResources(), objKey, bTryMode);
	}
	public void setPSSysResources(java.util.List<net.ibizsys.model.res.IPSSysResource> list){
		this.allpssysresources = list;
	}

	private java.util.List<net.ibizsys.model.res.IPSSysSFPlugin> allpssyssfplugins = null;
	public java.util.List<net.ibizsys.model.res.IPSSysSFPlugin> getAllPSSysSFPlugins(){
		if(this.allpssyssfplugins == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSSFPLUGINS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.res.IPSSysSFPlugin> list = new java.util.ArrayList<net.ibizsys.model.res.IPSSysSFPlugin>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.res.IPSSysSFPlugin obj = this.getPSModelObject(net.ibizsys.model.res.IPSSysSFPlugin.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSSFPLUGINS);
				if(obj!=null)list.add(obj);
			}
			this.allpssyssfplugins = list;
		}
		return (this.allpssyssfplugins.size() == 0)? null : this.allpssyssfplugins;
	}

	public net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.res.IPSSysSFPlugin.class, this.getAllPSSysSFPlugins(), objKey, bTryMode);
	}
	public void setPSSysSFPlugins(java.util.List<net.ibizsys.model.res.IPSSysSFPlugin> list){
		this.allpssyssfplugins = list;
	}

	private java.util.List<net.ibizsys.model.pub.IPSSysSFPub> allpssyssfpubs = null;
	public java.util.List<net.ibizsys.model.pub.IPSSysSFPub> getAllPSSysSFPubs(){
		if(this.allpssyssfpubs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSSFPUBS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.pub.IPSSysSFPub> list = new java.util.ArrayList<net.ibizsys.model.pub.IPSSysSFPub>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.pub.IPSSysSFPub obj = this.getPSModelObject(net.ibizsys.model.pub.IPSSysSFPub.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSSFPUBS);
				if(obj!=null)list.add(obj);
			}
			this.allpssyssfpubs = list;
		}
		return (this.allpssyssfpubs.size() == 0)? null : this.allpssyssfpubs;
	}

	public net.ibizsys.model.pub.IPSSysSFPub getPSSysSFPub(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.pub.IPSSysSFPub.class, this.getAllPSSysSFPubs(), objKey, bTryMode);
	}
	public void setPSSysSFPubs(java.util.List<net.ibizsys.model.pub.IPSSysSFPub> list){
		this.allpssyssfpubs = list;
	}

	private java.util.List<net.ibizsys.model.res.IPSSysSampleValue> allpssyssamplevalues = null;
	public java.util.List<net.ibizsys.model.res.IPSSysSampleValue> getAllPSSysSampleValues(){
		if(this.allpssyssamplevalues == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSSAMPLEVALUES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.res.IPSSysSampleValue> list = new java.util.ArrayList<net.ibizsys.model.res.IPSSysSampleValue>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.res.IPSSysSampleValue obj = this.getPSModelObject(net.ibizsys.model.res.IPSSysSampleValue.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSSAMPLEVALUES);
				if(obj!=null)list.add(obj);
			}
			this.allpssyssamplevalues = list;
		}
		return (this.allpssyssamplevalues.size() == 0)? null : this.allpssyssamplevalues;
	}

	public net.ibizsys.model.res.IPSSysSampleValue getPSSysSampleValue(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.res.IPSSysSampleValue.class, this.getAllPSSysSampleValues(), objKey, bTryMode);
	}
	public void setPSSysSampleValues(java.util.List<net.ibizsys.model.res.IPSSysSampleValue> list){
		this.allpssyssamplevalues = list;
	}

	private java.util.List<net.ibizsys.model.search.IPSSysSearchScheme> allpssyssearchschemes = null;
	public java.util.List<net.ibizsys.model.search.IPSSysSearchScheme> getAllPSSysSearchSchemes(){
		if(this.allpssyssearchschemes == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSSEARCHSCHEMES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.search.IPSSysSearchScheme> list = new java.util.ArrayList<net.ibizsys.model.search.IPSSysSearchScheme>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.search.IPSSysSearchScheme obj = this.getPSModelObject(net.ibizsys.model.search.IPSSysSearchScheme.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSSEARCHSCHEMES);
				if(obj!=null)list.add(obj);
			}
			this.allpssyssearchschemes = list;
		}
		return (this.allpssyssearchschemes.size() == 0)? null : this.allpssyssearchschemes;
	}

	public net.ibizsys.model.search.IPSSysSearchScheme getPSSysSearchScheme(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.search.IPSSysSearchScheme.class, this.getAllPSSysSearchSchemes(), objKey, bTryMode);
	}
	public void setPSSysSearchSchemes(java.util.List<net.ibizsys.model.search.IPSSysSearchScheme> list){
		this.allpssyssearchschemes = list;
	}

	private java.util.List<net.ibizsys.model.res.IPSSysSequence> allpssyssequences = null;
	public java.util.List<net.ibizsys.model.res.IPSSysSequence> getAllPSSysSequences(){
		if(this.allpssyssequences == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSSEQUENCES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.res.IPSSysSequence> list = new java.util.ArrayList<net.ibizsys.model.res.IPSSysSequence>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.res.IPSSysSequence obj = this.getPSModelObject(net.ibizsys.model.res.IPSSysSequence.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSSEQUENCES);
				if(obj!=null)list.add(obj);
			}
			this.allpssyssequences = list;
		}
		return (this.allpssyssequences.size() == 0)? null : this.allpssyssequences;
	}

	public net.ibizsys.model.res.IPSSysSequence getPSSysSequence(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.res.IPSSysSequence.class, this.getAllPSSysSequences(), objKey, bTryMode);
	}
	public void setPSSysSequences(java.util.List<net.ibizsys.model.res.IPSSysSequence> list){
		this.allpssyssequences = list;
	}

	private java.util.List<net.ibizsys.model.service.IPSSysServiceAPI> allpssysserviceapis = null;
	public java.util.List<net.ibizsys.model.service.IPSSysServiceAPI> getAllPSSysServiceAPIs(){
		if(this.allpssysserviceapis == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSSERVICEAPIS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.service.IPSSysServiceAPI> list = new java.util.ArrayList<net.ibizsys.model.service.IPSSysServiceAPI>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.service.IPSSysServiceAPI obj = this.getPSModelObject(net.ibizsys.model.service.IPSSysServiceAPI.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSSERVICEAPIS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysserviceapis = list;
		}
		return (this.allpssysserviceapis.size() == 0)? null : this.allpssysserviceapis;
	}

	public net.ibizsys.model.service.IPSSysServiceAPI getPSSysServiceAPI(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.service.IPSSysServiceAPI.class, this.getAllPSSysServiceAPIs(), objKey, bTryMode);
	}
	public void setPSSysServiceAPIs(java.util.List<net.ibizsys.model.service.IPSSysServiceAPI> list){
		this.allpssysserviceapis = list;
	}

	private java.util.List<net.ibizsys.model.testing.IPSSysTestData> allpssystestdatas = null;
	public java.util.List<net.ibizsys.model.testing.IPSSysTestData> getAllPSSysTestDatas(){
		if(this.allpssystestdatas == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSTESTDATAS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.testing.IPSSysTestData> list = new java.util.ArrayList<net.ibizsys.model.testing.IPSSysTestData>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.testing.IPSSysTestData obj = this.getPSModelObject(net.ibizsys.model.testing.IPSSysTestData.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSTESTDATAS);
				if(obj!=null)list.add(obj);
			}
			this.allpssystestdatas = list;
		}
		return (this.allpssystestdatas.size() == 0)? null : this.allpssystestdatas;
	}

	public net.ibizsys.model.testing.IPSSysTestData getPSSysTestData(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.testing.IPSSysTestData.class, this.getAllPSSysTestDatas(), objKey, bTryMode);
	}
	public void setPSSysTestData(java.util.List<net.ibizsys.model.testing.IPSSysTestData> list){
		this.allpssystestdatas = list;
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

	private java.util.List<net.ibizsys.model.res.IPSSysTranslator> allpssystranslators = null;
	public java.util.List<net.ibizsys.model.res.IPSSysTranslator> getAllPSSysTranslators(){
		if(this.allpssystranslators == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSTRANSLATORS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.res.IPSSysTranslator> list = new java.util.ArrayList<net.ibizsys.model.res.IPSSysTranslator>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.res.IPSSysTranslator obj = this.getPSModelObject(net.ibizsys.model.res.IPSSysTranslator.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSTRANSLATORS);
				if(obj!=null)list.add(obj);
			}
			this.allpssystranslators = list;
		}
		return (this.allpssystranslators.size() == 0)? null : this.allpssystranslators;
	}

	public net.ibizsys.model.res.IPSSysTranslator getPSSysTranslator(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.res.IPSSysTranslator.class, this.getAllPSSysTranslators(), objKey, bTryMode);
	}
	public void setPSSysTranslators(java.util.List<net.ibizsys.model.res.IPSSysTranslator> list){
		this.allpssystranslators = list;
	}

	private java.util.List<net.ibizsys.model.uml.IPSSysUCMap> allpssysucmaps = null;
	public java.util.List<net.ibizsys.model.uml.IPSSysUCMap> getAllPSSysUCMaps(){
		if(this.allpssysucmaps == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSUCMAPS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.uml.IPSSysUCMap> list = new java.util.ArrayList<net.ibizsys.model.uml.IPSSysUCMap>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.uml.IPSSysUCMap obj = this.getPSModelObject(net.ibizsys.model.uml.IPSSysUCMap.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSUCMAPS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysucmaps = list;
		}
		return (this.allpssysucmaps.size() == 0)? null : this.allpssysucmaps;
	}

	public net.ibizsys.model.uml.IPSSysUCMap getPSSysUCMap(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.uml.IPSSysUCMap.class, this.getAllPSSysUCMaps(), objKey, bTryMode);
	}
	public void setPSSysUCMaps(java.util.List<net.ibizsys.model.uml.IPSSysUCMap> list){
		this.allpssysucmaps = list;
	}

	private java.util.List<net.ibizsys.model.security.IPSSysUniRes> allpssysunireses = null;
	public java.util.List<net.ibizsys.model.security.IPSSysUniRes> getAllPSSysUniReses(){
		if(this.allpssysunireses == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSUNIRESES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.security.IPSSysUniRes> list = new java.util.ArrayList<net.ibizsys.model.security.IPSSysUniRes>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.security.IPSSysUniRes obj = this.getPSModelObject(net.ibizsys.model.security.IPSSysUniRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSUNIRESES);
				if(obj!=null)list.add(obj);
			}
			this.allpssysunireses = list;
		}
		return (this.allpssysunireses.size() == 0)? null : this.allpssysunireses;
	}

	public net.ibizsys.model.security.IPSSysUniRes getPSSysUniRes(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.security.IPSSysUniRes.class, this.getAllPSSysUniReses(), objKey, bTryMode);
	}
	public void setPSSysUniRes(java.util.List<net.ibizsys.model.security.IPSSysUniRes> list){
		this.allpssysunireses = list;
	}

	private java.util.List<net.ibizsys.model.res.IPSSysUniState> allpssysunistates = null;
	public java.util.List<net.ibizsys.model.res.IPSSysUniState> getAllPSSysUniStates(){
		if(this.allpssysunistates == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSUNISTATES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.res.IPSSysUniState> list = new java.util.ArrayList<net.ibizsys.model.res.IPSSysUniState>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.res.IPSSysUniState obj = this.getPSModelObject(net.ibizsys.model.res.IPSSysUniState.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSUNISTATES);
				if(obj!=null)list.add(obj);
			}
			this.allpssysunistates = list;
		}
		return (this.allpssysunistates.size() == 0)? null : this.allpssysunistates;
	}

	public net.ibizsys.model.res.IPSSysUniState getPSSysUniState(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.res.IPSSysUniState.class, this.getAllPSSysUniStates(), objKey, bTryMode);
	}
	public void setPSSysUniStates(java.util.List<net.ibizsys.model.res.IPSSysUniState> list){
		this.allpssysunistates = list;
	}

	private java.util.List<net.ibizsys.model.uml.IPSSysUseCase> allpssysusecases = null;
	public java.util.List<net.ibizsys.model.uml.IPSSysUseCase> getAllPSSysUseCases(){
		if(this.allpssysusecases == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSUSECASES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.uml.IPSSysUseCase> list = new java.util.ArrayList<net.ibizsys.model.uml.IPSSysUseCase>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.uml.IPSSysUseCase obj = this.getPSModelObject(net.ibizsys.model.uml.IPSSysUseCase.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSUSECASES);
				if(obj!=null)list.add(obj);
			}
			this.allpssysusecases = list;
		}
		return (this.allpssysusecases.size() == 0)? null : this.allpssysusecases;
	}

	public net.ibizsys.model.uml.IPSSysUseCase getPSSysUseCase(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.uml.IPSSysUseCase.class, this.getAllPSSysUseCases(), objKey, bTryMode);
	}
	public void setPSSysUseCases(java.util.List<net.ibizsys.model.uml.IPSSysUseCase> list){
		this.allpssysusecases = list;
	}

	private java.util.List<net.ibizsys.model.security.IPSSysUserDR> allpssysuserdrs = null;
	public java.util.List<net.ibizsys.model.security.IPSSysUserDR> getAllPSSysUserDRs(){
		if(this.allpssysuserdrs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSUSERDRS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.security.IPSSysUserDR> list = new java.util.ArrayList<net.ibizsys.model.security.IPSSysUserDR>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.security.IPSSysUserDR obj = this.getPSModelObject(net.ibizsys.model.security.IPSSysUserDR.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSUSERDRS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysuserdrs = list;
		}
		return (this.allpssysuserdrs.size() == 0)? null : this.allpssysuserdrs;
	}

	public net.ibizsys.model.security.IPSSysUserDR getPSSysUserDR(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.security.IPSSysUserDR.class, this.getAllPSSysUserDRs(), objKey, bTryMode);
	}
	public void setPSSysUserDRs(java.util.List<net.ibizsys.model.security.IPSSysUserDR> list){
		this.allpssysuserdrs = list;
	}

	private java.util.List<net.ibizsys.model.security.IPSSysUserMode> allpssysusermodes = null;
	public java.util.List<net.ibizsys.model.security.IPSSysUserMode> getAllPSSysUserModes(){
		if(this.allpssysusermodes == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSUSERMODES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.security.IPSSysUserMode> list = new java.util.ArrayList<net.ibizsys.model.security.IPSSysUserMode>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.security.IPSSysUserMode obj = this.getPSModelObject(net.ibizsys.model.security.IPSSysUserMode.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSUSERMODES);
				if(obj!=null)list.add(obj);
			}
			this.allpssysusermodes = list;
		}
		return (this.allpssysusermodes.size() == 0)? null : this.allpssysusermodes;
	}

	public net.ibizsys.model.security.IPSSysUserMode getPSSysUserMode(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.security.IPSSysUserMode.class, this.getAllPSSysUserModes(), objKey, bTryMode);
	}
	public void setPSSysUserModes(java.util.List<net.ibizsys.model.security.IPSSysUserMode> list){
		this.allpssysusermodes = list;
	}

	private java.util.List<net.ibizsys.model.security.IPSSysUserRole> allpssysuserroles = null;
	public java.util.List<net.ibizsys.model.security.IPSSysUserRole> getAllPSSysUserRoles(){
		if(this.allpssysuserroles == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSUSERROLES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.security.IPSSysUserRole> list = new java.util.ArrayList<net.ibizsys.model.security.IPSSysUserRole>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.security.IPSSysUserRole obj = this.getPSModelObject(net.ibizsys.model.security.IPSSysUserRole.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSUSERROLES);
				if(obj!=null)list.add(obj);
			}
			this.allpssysuserroles = list;
		}
		return (this.allpssysuserroles.size() == 0)? null : this.allpssysuserroles;
	}

	public net.ibizsys.model.security.IPSSysUserRole getPSSysUserRole(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.security.IPSSysUserRole.class, this.getAllPSSysUserRoles(), objKey, bTryMode);
	}
	public void setPSSysUserRoles(java.util.List<net.ibizsys.model.security.IPSSysUserRole> list){
		this.allpssysuserroles = list;
	}

	private java.util.List<net.ibizsys.model.res.IPSSysUtil> allpssysutils = null;
	public java.util.List<net.ibizsys.model.res.IPSSysUtil> getAllPSSysUtils(){
		if(this.allpssysutils == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSUTILS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.res.IPSSysUtil> list = new java.util.ArrayList<net.ibizsys.model.res.IPSSysUtil>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.res.IPSSysUtil obj = this.getPSModelObject(net.ibizsys.model.res.IPSSysUtil.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSUTILS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysutils = list;
		}
		return (this.allpssysutils.size() == 0)? null : this.allpssysutils;
	}

	public net.ibizsys.model.res.IPSSysUtil getPSSysUtil(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.res.IPSSysUtil.class, this.getAllPSSysUtils(), objKey, bTryMode);
	}
	public void setPSSysUtils(java.util.List<net.ibizsys.model.res.IPSSysUtil> list){
		this.allpssysutils = list;
	}

	private java.util.List<net.ibizsys.model.valuerule.IPSSysValueRule> allpssysvaluerules = null;
	public java.util.List<net.ibizsys.model.valuerule.IPSSysValueRule> getAllPSSysValueRules(){
		if(this.allpssysvaluerules == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSVALUERULES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.valuerule.IPSSysValueRule> list = new java.util.ArrayList<net.ibizsys.model.valuerule.IPSSysValueRule>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.valuerule.IPSSysValueRule obj = this.getPSModelObject(net.ibizsys.model.valuerule.IPSSysValueRule.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSVALUERULES);
				if(obj!=null)list.add(obj);
			}
			this.allpssysvaluerules = list;
		}
		return (this.allpssysvaluerules.size() == 0)? null : this.allpssysvaluerules;
	}

	public net.ibizsys.model.valuerule.IPSSysValueRule getPSSysValueRule(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.valuerule.IPSSysValueRule.class, this.getAllPSSysValueRules(), objKey, bTryMode);
	}
	public void setPSSysValueRules(java.util.List<net.ibizsys.model.valuerule.IPSSysValueRule> list){
		this.allpssysvaluerules = list;
	}

	private java.util.List<net.ibizsys.model.database.IPSSystemDBConfig> allpssystemdbconfigs = null;
	public java.util.List<net.ibizsys.model.database.IPSSystemDBConfig> getAllPSSystemDBConfigs(){
		if(this.allpssystemdbconfigs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSTEMDBCONFIGS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.database.IPSSystemDBConfig> list = new java.util.ArrayList<net.ibizsys.model.database.IPSSystemDBConfig>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.database.IPSSystemDBConfig obj = this.getPSModelObject(net.ibizsys.model.database.IPSSystemDBConfig.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSTEMDBCONFIGS);
				if(obj!=null)list.add(obj);
			}
			this.allpssystemdbconfigs = list;
		}
		return (this.allpssystemdbconfigs.size() == 0)? null : this.allpssystemdbconfigs;
	}

	public net.ibizsys.model.database.IPSSystemDBConfig getPSSystemDBConfig(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.database.IPSSystemDBConfig.class, this.getAllPSSystemDBConfigs(), objKey, bTryMode);
	}
	public void setPSSystemDBConfigs(java.util.List<net.ibizsys.model.database.IPSSystemDBConfig> list){
		this.allpssystemdbconfigs = list;
	}

	private java.util.List<net.ibizsys.model.system.IPSSystemModule> allpssystemmodules = null;
	public java.util.List<net.ibizsys.model.system.IPSSystemModule> getAllPSSystemModules(){
		if(this.allpssystemmodules == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSTEMMODULES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.system.IPSSystemModule> list = new java.util.ArrayList<net.ibizsys.model.system.IPSSystemModule>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.system.IPSSystemModule obj = this.getPSModelObject(net.ibizsys.model.system.IPSSystemModule.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSTEMMODULES);
				if(obj!=null)list.add(obj);
			}
			this.allpssystemmodules = list;
		}
		return (this.allpssystemmodules.size() == 0)? null : this.allpssystemmodules;
	}

	public net.ibizsys.model.system.IPSSystemModule getPSSystemModule(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.system.IPSSystemModule.class, this.getAllPSSystemModules(), objKey, bTryMode);
	}
	public void setPSSystemModules(java.util.List<net.ibizsys.model.system.IPSSystemModule> list){
		this.allpssystemmodules = list;
	}

	private java.util.List<net.ibizsys.model.wf.IPSWFRole> allpswfroles = null;
	public java.util.List<net.ibizsys.model.wf.IPSWFRole> getAllPSWFRoles(){
		if(this.allpswfroles == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSWFROLES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.wf.IPSWFRole> list = new java.util.ArrayList<net.ibizsys.model.wf.IPSWFRole>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.wf.IPSWFRole obj = this.getPSModelObject(net.ibizsys.model.wf.IPSWFRole.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSWFROLES);
				if(obj!=null)list.add(obj);
			}
			this.allpswfroles = list;
		}
		return (this.allpswfroles.size() == 0)? null : this.allpswfroles;
	}

	public net.ibizsys.model.wf.IPSWFRole getPSWFRole(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.wf.IPSWFRole.class, this.getAllPSWFRoles(), objKey, bTryMode);
	}
	public void setPSWFRoles(java.util.List<net.ibizsys.model.wf.IPSWFRole> list){
		this.allpswfroles = list;
	}

	private java.util.List<net.ibizsys.model.wf.IPSWFWorkTime> allpswfworktimes = null;
	public java.util.List<net.ibizsys.model.wf.IPSWFWorkTime> getAllPSWFWorkTimes(){
		if(this.allpswfworktimes == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSWFWORKTIMES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.wf.IPSWFWorkTime> list = new java.util.ArrayList<net.ibizsys.model.wf.IPSWFWorkTime>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.wf.IPSWFWorkTime obj = this.getPSModelObject(net.ibizsys.model.wf.IPSWFWorkTime.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSWFWORKTIMES);
				if(obj!=null)list.add(obj);
			}
			this.allpswfworktimes = list;
		}
		return (this.allpswfworktimes.size() == 0)? null : this.allpswfworktimes;
	}

	public net.ibizsys.model.wf.IPSWFWorkTime getPSWFWorkTime(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.wf.IPSWFWorkTime.class, this.getAllPSWFWorkTimes(), objKey, bTryMode);
	}
	public void setPSWFWorkTimes(java.util.List<net.ibizsys.model.wf.IPSWFWorkTime> list){
		this.allpswfworktimes = list;
	}

	private java.util.List<net.ibizsys.model.wx.IPSWXAccount> allpswxaccounts = null;
	public java.util.List<net.ibizsys.model.wx.IPSWXAccount> getAllPSWXAccounts(){
		if(this.allpswxaccounts == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSWXACCOUNTS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.wx.IPSWXAccount> list = new java.util.ArrayList<net.ibizsys.model.wx.IPSWXAccount>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.wx.IPSWXAccount obj = this.getPSModelObject(net.ibizsys.model.wx.IPSWXAccount.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSWXACCOUNTS);
				if(obj!=null)list.add(obj);
			}
			this.allpswxaccounts = list;
		}
		return (this.allpswxaccounts.size() == 0)? null : this.allpswxaccounts;
	}

	public net.ibizsys.model.wx.IPSWXAccount getPSWXAccount(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.wx.IPSWXAccount.class, this.getAllPSWXAccounts(), objKey, bTryMode);
	}
	public void setPSWXAccounts(java.util.List<net.ibizsys.model.wx.IPSWXAccount> list){
		this.allpswxaccounts = list;
	}

	private java.util.List<net.ibizsys.model.wf.IPSWorkflow> allpsworkflows = null;
	public java.util.List<net.ibizsys.model.wf.IPSWorkflow> getAllPSWorkflows(){
		if(this.allpsworkflows == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSWORKFLOWS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.wf.IPSWorkflow> list = new java.util.ArrayList<net.ibizsys.model.wf.IPSWorkflow>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.wf.IPSWorkflow obj = this.getPSModelObject(net.ibizsys.model.wf.IPSWorkflow.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSWORKFLOWS);
				if(obj!=null)list.add(obj);
			}
			this.allpsworkflows = list;
		}
		return (this.allpsworkflows.size() == 0)? null : this.allpsworkflows;
	}

	public net.ibizsys.model.wf.IPSWorkflow getPSWorkflow(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.wf.IPSWorkflow.class, this.getAllPSWorkflows(), objKey, bTryMode);
	}
	public void setPSWorkflows(java.util.List<net.ibizsys.model.wf.IPSWorkflow> list){
		this.allpsworkflows = list;
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDefaultLanguage(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTLANGUAGE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSSysI18N defaultpssysi18n;

	public net.ibizsys.model.res.IPSSysI18N getDefaultPSSysI18N(){
		if(this.defaultpssysi18n != null) return this.defaultpssysi18n;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTPSSYSI18N);
		if(value == null){
			return null;
		}
		this.defaultpssysi18n = getPSModelObject(net.ibizsys.model.res.IPSSysI18N.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETDEFAULTPSSYSI18N);
		return this.defaultpssysi18n;
	}

	public net.ibizsys.model.res.IPSSysI18N getDefaultPSSysI18NMust(){
		net.ibizsys.model.res.IPSSysI18N value = this.getDefaultPSSysI18N();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定默认系统国际化");}
		return value;
	}

	public void setDefaultPSSysI18N(net.ibizsys.model.res.IPSSysI18N defaultpssysi18n){
		this.defaultpssysi18n = defaultpssysi18n;
	}

	private net.ibizsys.model.pub.IPSSysSFPub defaultpssyssfpub;

	public net.ibizsys.model.pub.IPSSysSFPub getDefaultPSSysSFPub(){
		if(this.defaultpssyssfpub != null) return this.defaultpssyssfpub;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTPSSYSSFPUB);
		if(value == null){
			return null;
		}
		this.defaultpssyssfpub = getPSModelObject(net.ibizsys.model.pub.IPSSysSFPub.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETDEFAULTPSSYSSFPUB);
		return this.defaultpssyssfpub;
	}

	public net.ibizsys.model.pub.IPSSysSFPub getDefaultPSSysSFPubMust(){
		net.ibizsys.model.pub.IPSSysSFPub value = this.getDefaultPSSysSFPub();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定默认系统后台发布");}
		return value;
	}

	public void setDefaultPSSysSFPub(net.ibizsys.model.pub.IPSSysSFPub defaultpssyssfpub){
		this.defaultpssyssfpub = defaultpssyssfpub;
	}


	public java.lang.String getDefaultScriptEngine(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTSCRIPTENGINE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDeploySysId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEPLOYSYSID);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDeploySysOrgId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEPLOYSYSORGID);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDeploySysOrgSectorId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEPLOYSYSORGSECTORID);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDeploySysTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEPLOYSYSTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDeploySysTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEPLOYSYSTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDeploySysType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEPLOYSYSTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public int getDynaInstMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAINSTMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	@Deprecated
	public java.lang.String getDynaInstTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAINSTTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getDynaInstTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAINSTTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getDynaModelFilePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMODELFILEPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getEngineVer(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENGINEVER);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	private java.util.List<net.ibizsys.model.res.IPSSysContent> initpssyscontents = null;
	public java.util.List<net.ibizsys.model.res.IPSSysContent> getInitPSSysContents(){
		if(this.initpssyscontents == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINITPSSYSCONTENTS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.res.IPSSysContent> list = new java.util.ArrayList<net.ibizsys.model.res.IPSSysContent>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.res.IPSSysContent obj = this.getPSModelObject(net.ibizsys.model.res.IPSSysContent.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETINITPSSYSCONTENTS);
				if(obj!=null)list.add(obj);
			}
			this.initpssyscontents = list;
		}
		return (this.initpssyscontents.size() == 0)? null : this.initpssyscontents;
	}

	public net.ibizsys.model.res.IPSSysContent getInitPSSysContent(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.res.IPSSysContent.class, this.getInitPSSysContents(), objKey, bTryMode);
	}
	
	public void setInitPSSysContents(java.util.List<net.ibizsys.model.res.IPSSysContent> list){
		this.initpssyscontents = list;
	}

	public java.lang.String getLogicName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPSDevSlnSysId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEVSLNSYSID);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dynamodel.IPSDynaModel psdynamodel;

	public net.ibizsys.model.dynamodel.IPSDynaModel getPSDynaModel(){
		if(this.psdynamodel != null) return this.psdynamodel;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDYNAMODEL);
		if(value == null){
			return null;
		}
		this.psdynamodel = getPSModelObject(net.ibizsys.model.dynamodel.IPSDynaModel.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDYNAMODEL);
		return this.psdynamodel;
	}

	public net.ibizsys.model.dynamodel.IPSDynaModel getPSDynaModelMust(){
		net.ibizsys.model.dynamodel.IPSDynaModel value = this.getPSDynaModel();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定动态模型对象");}
		return value;
	}

	public void setPSDynaModel(net.ibizsys.model.dynamodel.IPSDynaModel psdynamodel){
		this.psdynamodel = psdynamodel;
	}


	public java.lang.String getRTObjectName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRTOBJECTNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.requirement.IPSSysReqModule> rootpssysreqmodules = null;
	public java.util.List<net.ibizsys.model.requirement.IPSSysReqModule> getRootPSSysReqModules(){
		if(this.rootpssysreqmodules == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETROOTPSSYSREQMODULES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.requirement.IPSSysReqModule> list = new java.util.ArrayList<net.ibizsys.model.requirement.IPSSysReqModule>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.requirement.IPSSysReqModule obj = this.getPSModelObject(net.ibizsys.model.requirement.IPSSysReqModule.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETROOTPSSYSREQMODULES);
				if(obj!=null)list.add(obj);
			}
			this.rootpssysreqmodules = list;
		}
		return (this.rootpssysreqmodules.size() == 0)? null : this.rootpssysreqmodules;
	}

	public net.ibizsys.model.requirement.IPSSysReqModule getRootPSSysReqModule(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.requirement.IPSSysReqModule.class, this.getRootPSSysReqModules(), objKey, bTryMode);
	}
	
	public void setRootPSSysReqModules(java.util.List<net.ibizsys.model.requirement.IPSSysReqModule> list){
		this.rootpssysreqmodules = list;
	}

	private java.util.List<net.ibizsys.model.res.IPSSysContent> samplepssyscontents = null;
	public java.util.List<net.ibizsys.model.res.IPSSysContent> getSamplePSSysContents(){
		if(this.samplepssyscontents == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSAMPLEPSSYSCONTENTS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.res.IPSSysContent> list = new java.util.ArrayList<net.ibizsys.model.res.IPSSysContent>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.res.IPSSysContent obj = this.getPSModelObject(net.ibizsys.model.res.IPSSysContent.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETSAMPLEPSSYSCONTENTS);
				if(obj!=null)list.add(obj);
			}
			this.samplepssyscontents = list;
		}
		return (this.samplepssyscontents.size() == 0)? null : this.samplepssyscontents;
	}

	public net.ibizsys.model.res.IPSSysContent getSamplePSSysContent(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.res.IPSSysContent.class, this.getSamplePSSysContents(), objKey, bTryMode);
	}
	
	public void setSamplePSSysContents(java.util.List<net.ibizsys.model.res.IPSSysContent> list){
		this.samplepssyscontents = list;
	}

	public java.lang.String getSysTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSYSTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSysTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSYSTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSysTag3(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSYSTAG3);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSysTag4(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSYSTAG4);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSysType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSYSTYPE);
		if(value == null){
			return "DEVSYS";
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.res.IPSSysContent> testpssyscontents = null;
	public java.util.List<net.ibizsys.model.res.IPSSysContent> getTestPSSysContents(){
		if(this.testpssyscontents == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTESTPSSYSCONTENTS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.res.IPSSysContent> list = new java.util.ArrayList<net.ibizsys.model.res.IPSSysContent>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.res.IPSSysContent obj = this.getPSModelObject(net.ibizsys.model.res.IPSSysContent.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETTESTPSSYSCONTENTS);
				if(obj!=null)list.add(obj);
			}
			this.testpssyscontents = list;
		}
		return (this.testpssyscontents.size() == 0)? null : this.testpssyscontents;
	}

	public net.ibizsys.model.res.IPSSysContent getTestPSSysContent(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.res.IPSSysContent.class, this.getTestPSSysContents(), objKey, bTryMode);
	}
	
	public void setTestPSSysContents(java.util.List<net.ibizsys.model.res.IPSSysContent> list){
		this.testpssyscontents = list;
	}

	public java.lang.String getVCName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVCNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
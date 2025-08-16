package net.ibizsys.model.dataentity;



public class PSDataEntityImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.dataentity.IPSDataEntity
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETALLPSDEACMODES = "getAllPSDEACModes";
	public final static String ATTR_GETALLPSDEACTIONGROUPS = "getAllPSDEActionGroups";
	public final static String ATTR_GETALLPSDEACTIONS = "getAllPSDEActions";
	public final static String ATTR_GETALLPSDEDBCONFIGS = "getAllPSDEDBConfigs";
	public final static String ATTR_GETALLPSDEDBINDICES = "getAllPSDEDBIndices";
	public final static String ATTR_GETALLPSDEDBTABLES = "getAllPSDEDBTables";
	public final static String ATTR_GETALLPSDEDRGROUPS = "getAllPSDEDRGroups";
	public final static String ATTR_GETALLPSDEDRITEMS = "getAllPSDEDRItems";
	public final static String ATTR_GETALLPSDEDTSQUEUES = "getAllPSDEDTSQueues";
	public final static String ATTR_GETALLPSDEDATAEXPORTS = "getAllPSDEDataExports";
	public final static String ATTR_GETALLPSDEDATAFLOWS = "getAllPSDEDataFlows";
	public final static String ATTR_GETALLPSDEDATAIMPORTS = "getAllPSDEDataImports";
	public final static String ATTR_GETALLPSDEDATAQUERIES = "getAllPSDEDataQueries";
	public final static String ATTR_GETALLPSDEDATARELATIONS = "getAllPSDEDataRelations";
	public final static String ATTR_GETALLPSDEDATASETS = "getAllPSDEDataSets";
	public final static String ATTR_GETALLPSDEDATASYNCS = "getAllPSDEDataSyncs";
	public final static String ATTR_GETALLPSDEFGROUPS = "getAllPSDEFGroups";
	public final static String ATTR_GETALLPSDEFIELDS = "getAllPSDEFields";
	public final static String ATTR_GETALLPSDEGROUPS = "getAllPSDEGroups";
	public final static String ATTR_GETALLPSDELOGICS = "getAllPSDELogics";
	public final static String ATTR_GETALLPSDEMSLOGICS = "getAllPSDEMSLogics";
	public final static String ATTR_GETALLPSDEMAINSTATES = "getAllPSDEMainStates";
	public final static String ATTR_GETALLPSDEMAPS = "getAllPSDEMaps";
	public final static String ATTR_GETALLPSDEMETHODDTOS = "getAllPSDEMethodDTOs";
	public final static String ATTR_GETALLPSDENOTIFIES = "getAllPSDENotifies";
	public final static String ATTR_GETALLPSDEOPPRIVS = "getAllPSDEOPPrivs";
	public final static String ATTR_GETALLPSDEPRINTS = "getAllPSDEPrints";
	public final static String ATTR_GETALLPSDERGROUPS = "getAllPSDERGroups";
	public final static String ATTR_GETALLPSDEREPORTS = "getAllPSDEReports";
	public final static String ATTR_GETALLPSDESEARCHES = "getAllPSDESearches";
	public final static String ATTR_GETALLPSDEUNISTATES = "getAllPSDEUniStates";
	public final static String ATTR_GETALLPSDEUSERROLES = "getAllPSDEUserRoles";
	public final static String ATTR_GETALLPSDEUTILS = "getAllPSDEUtils";
	public final static String ATTR_GETALLPSDEWFS = "getAllPSDEWFs";
	public final static String ATTR_GETALLPSMODELDATAS = "getAllPSModelDatas";
	public final static String ATTR_GETALLPSSYSTESTCASES = "getAllPSSysTestCases";
	public final static String ATTR_GETALLPSSYSTESTDATAS = "getAllPSSysTestDatas";
	public final static String ATTR_GETAUDITMODE = "auditMode";
	public final static String ATTR_GETBIZTAG = "bizTag";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDETAG = "dETag";
	public final static String ATTR_GETDETAG2 = "dETag2";
	public final static String ATTR_GETDETYPE = "dEType";
	public final static String ATTR_GETDSLINK = "dSLink";
	public final static String ATTR_GETDATAACCCTRLARCH = "dataAccCtrlArch";
	public final static String ATTR_GETDATAACCCTRLMODE = "dataAccCtrlMode";
	public final static String ATTR_GETDATACHANGELOGMODE = "dataChangeLogMode";
	public final static String ATTR_GETDATAIMPEXPMODE = "dataImpExpMode";
	public final static String ATTR_GETDEFAULTPSDEDATAQUERY = "getDefaultPSDEDataQuery";
	public final static String ATTR_GETDEFAULTPSDEDATASET = "getDefaultPSDEDataSet";
	public final static String ATTR_GETDEFAULTPSDEFILTERDTO = "getDefaultPSDEFilterDTO";
	public final static String ATTR_GETDEFAULTPSDEMETHODDTO = "getDefaultPSDEMethodDTO";
	public final static String ATTR_GETDYNAINSTMODE = "dynaInstMode";
	public final static String ATTR_GETDYNAINSTTAG = "dynaInstTag";
	public final static String ATTR_GETDYNAINSTTAG2 = "dynaInstTag2";
	public final static String ATTR_GETDYNASYSMODE = "dynaSysMode";
	public final static String ATTR_GETENABLEACTIONS = "enableActions";
	public final static String ATTR_GETENABLEUIACTIONS = "enableUIActions";
	public final static String ATTR_GETENABLEVIEWLEVEL = "enableViewLevel";
	public final static String ATTR_GETENTITYCACHETIMEOUT = "entityCacheTimeout";
	public final static String ATTR_GETEXTENDMODE = "extendMode";
	public final static String ATTR_GETINDEXDETYPE = "indexDEType";
	public final static String ATTR_GETINDEXTYPEPSDEFIELD = "getIndexTypePSDEField";
	public final static String ATTR_GETINHERITPSDATAENTITY = "getInheritPSDataEntity";
	public final static String ATTR_GETINVALIDLOGICVALUE = "invalidLogicValue";
	public final static String ATTR_GETKEYNAMEPSDEFIELD = "getKeyNamePSDEField";
	public final static String ATTR_GETKEYPSDEFIELD = "getKeyPSDEField";
	public final static String ATTR_GETLNPSLANGUAGERES = "getLNPSLanguageRes";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETLOGICVALIDPSDEFIELD = "getLogicValidPSDEField";
	public final static String ATTR_GETMAINSTATEPSDEFIELDS = "getMainStatePSDEFields";
	public final static String ATTR_GETMAJORPSDEFIELD = "getMajorPSDEField";
	public final static String ATTR_GETMAJORPSDERS = "getMajorPSDERs";
	public final static String ATTR_GETMINORPSDERS = "getMinorPSDERs";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETORGIDPSDEFIELD = "getOrgIdPSDEField";
	public final static String ATTR_GETPSDERINHERIT = "getPSDERInherit";
	public final static String ATTR_GETPSSUBSYSSERVICEAPI = "getPSSubSysServiceAPI";
	public final static String ATTR_GETPSSUBSYSSERVICEAPIDE = "getPSSubSysServiceAPIDE";
	public final static String ATTR_GETPSSYSBDSCHEME = "getPSSysBDScheme";
	public final static String ATTR_GETPSSYSDBSCHEME = "getPSSysDBScheme";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";
	public final static String ATTR_GETSAASDCIDCOLUMNNAME = "saaSDCIdColumnName";
	public final static String ATTR_GETSAASDATAIDCOLUMNNAME = "saaSDataIdColumnName";
	public final static String ATTR_GETSAASMODE = "saaSMode";
	public final static String ATTR_GETSERVICEAPICLIENTID = "serviceAPIClientId";
	public final static String ATTR_GETSERVICEAPIMODE = "serviceAPIMode";
	public final static String ATTR_GETSERVICECODENAME = "serviceCodeName";
	public final static String ATTR_GETSTORAGEMODE = "storageMode";
	public final static String ATTR_GETSYSTEMTAG = "systemTag";
	public final static String ATTR_GETTABLENAME = "tableName";
	public final static String ATTR_GETTEMPDATAHOLDER = "tempDataHolder";
	public final static String ATTR_GETUNIONKEYMODE = "unionKeyMode";
	public final static String ATTR_GETUNIONKEYPARAM = "unionKeyParam";
	public final static String ATTR_GETUNIONKEYVALUEPSDEFIELDS = "getUnionKeyValuePSDEFields";
	public final static String ATTR_GETVALIDLOGICVALUE = "validLogicValue";
	public final static String ATTR_GETVIEW2NAME = "view2Name";
	public final static String ATTR_GETVIEW3NAME = "view3Name";
	public final static String ATTR_GETVIEW4NAME = "view4Name";
	public final static String ATTR_GETVIEWNAME = "viewName";
	public final static String ATTR_GETVIEWPSDEDATAQUERY = "getViewPSDEDataQuery";
	public final static String ATTR_GETVIRTUALMODE = "virtualMode";
	public final static String ATTR_ISENABLEAPISTORAGE = "enableAPIStorage";
	public final static String ATTR_ISENABLECREATE = "enableCreate";
	public final static String ATTR_ISENABLEDATAVER = "enableDataVer";
	public final static String ATTR_ISENABLEENTITYCACHE = "enableEntityCache";
	public final static String ATTR_ISENABLEMODIFY = "enableModify";
	public final static String ATTR_ISENABLEMULTIDS = "enableMultiDS";
	public final static String ATTR_ISENABLEMULTIFORM = "enableMultiForm";
	public final static String ATTR_ISENABLEMULTISTORAGE = "enableMultiStorage";
	public final static String ATTR_ISENABLENOSQLSTORAGE = "enableNoSQLStorage";
	public final static String ATTR_ISENABLEREMOVE = "enableRemove";
	public final static String ATTR_ISENABLESQLSTORAGE = "enableSQLStorage";
	public final static String ATTR_ISENABLETEMPDATA = "enableTempData";
	public final static String ATTR_ISENABLETEMPDATABACKEND = "enableTempDataBackend";
	public final static String ATTR_ISENABLETEMPDATAFRONT = "enableTempDataFront";
	public final static String ATTR_ISLOGICVALID = "logicValid";
	public final static String ATTR_ISSUBSYSASCLOUD = "subSysAsCloud";
	public final static String ATTR_ISSUBSYSDE = "subSysDE";
	public final static String ATTR_ISVIRTUAL = "virtual";

	private java.util.List<net.ibizsys.model.dataentity.ac.IPSDEACMode> allpsdeacmodes = null;
	public java.util.List<net.ibizsys.model.dataentity.ac.IPSDEACMode> getAllPSDEACModes(){
		if(this.allpsdeacmodes == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEACMODES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.ac.IPSDEACMode> list = new java.util.ArrayList<net.ibizsys.model.dataentity.ac.IPSDEACMode>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.ac.IPSDEACMode obj = this.getPSModelObject(net.ibizsys.model.dataentity.ac.IPSDEACMode.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEACMODES);
				if(obj!=null)list.add(obj);
			}
			this.allpsdeacmodes = list;
		}
		return (this.allpsdeacmodes.size() == 0)? null : this.allpsdeacmodes;
	}

	public net.ibizsys.model.dataentity.ac.IPSDEACMode getPSDEACMode(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.ac.IPSDEACMode.class, this.getAllPSDEACModes(), objKey, bTryMode);
	}
	public void setPSDEACModes(java.util.List<net.ibizsys.model.dataentity.ac.IPSDEACMode> list){
		this.allpsdeacmodes = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionGroup> allpsdeactiongroups = null;
	public java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionGroup> getAllPSDEActionGroups(){
		if(this.allpsdeactiongroups == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEACTIONGROUPS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionGroup> list = new java.util.ArrayList<net.ibizsys.model.dataentity.action.IPSDEActionGroup>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.action.IPSDEActionGroup obj = this.getPSModelObject(net.ibizsys.model.dataentity.action.IPSDEActionGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEACTIONGROUPS);
				if(obj!=null)list.add(obj);
			}
			this.allpsdeactiongroups = list;
		}
		return (this.allpsdeactiongroups.size() == 0)? null : this.allpsdeactiongroups;
	}

	public net.ibizsys.model.dataentity.action.IPSDEActionGroup getPSDEActionGroup(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.action.IPSDEActionGroup.class, this.getAllPSDEActionGroups(), objKey, bTryMode);
	}
	public void setPSDEActionGroups(java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionGroup> list){
		this.allpsdeactiongroups = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.action.IPSDEAction> allpsdeactions = null;
	public java.util.List<net.ibizsys.model.dataentity.action.IPSDEAction> getAllPSDEActions(){
		if(this.allpsdeactions == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEACTIONS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.action.IPSDEAction> list = new java.util.ArrayList<net.ibizsys.model.dataentity.action.IPSDEAction>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.action.IPSDEAction obj = this.getPSModelObject(net.ibizsys.model.dataentity.action.IPSDEAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEACTIONS);
				if(obj!=null)list.add(obj);
			}
			this.allpsdeactions = list;
		}
		return (this.allpsdeactions.size() == 0)? null : this.allpsdeactions;
	}

	public net.ibizsys.model.dataentity.action.IPSDEAction getPSDEAction(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.action.IPSDEAction.class, this.getAllPSDEActions(), objKey, bTryMode);
	}
	public void setPSDEActions(java.util.List<net.ibizsys.model.dataentity.action.IPSDEAction> list){
		this.allpsdeactions = list;
	}

	private java.util.List<net.ibizsys.model.database.IPSDEDBConfig> allpsdedbconfigs = null;
	public java.util.List<net.ibizsys.model.database.IPSDEDBConfig> getAllPSDEDBConfigs(){
		if(this.allpsdedbconfigs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEDBCONFIGS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.database.IPSDEDBConfig> list = new java.util.ArrayList<net.ibizsys.model.database.IPSDEDBConfig>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.database.IPSDEDBConfig obj = this.getPSModelObject(net.ibizsys.model.database.IPSDEDBConfig.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEDBCONFIGS);
				if(obj!=null)list.add(obj);
			}
			this.allpsdedbconfigs = list;
		}
		return (this.allpsdedbconfigs.size() == 0)? null : this.allpsdedbconfigs;
	}

	public net.ibizsys.model.database.IPSDEDBConfig getPSDEDBConfig(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.database.IPSDEDBConfig.class, this.getAllPSDEDBConfigs(), objKey, bTryMode);
	}
	public void setPSDEDBConfigs(java.util.List<net.ibizsys.model.database.IPSDEDBConfig> list){
		this.allpsdedbconfigs = list;
	}

	private java.util.List<net.ibizsys.model.database.IPSDEDBIndex> allpsdedbindices = null;
	public java.util.List<net.ibizsys.model.database.IPSDEDBIndex> getAllPSDEDBIndices(){
		if(this.allpsdedbindices == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEDBINDICES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.database.IPSDEDBIndex> list = new java.util.ArrayList<net.ibizsys.model.database.IPSDEDBIndex>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.database.IPSDEDBIndex obj = this.getPSModelObject(net.ibizsys.model.database.IPSDEDBIndex.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEDBINDICES);
				if(obj!=null)list.add(obj);
			}
			this.allpsdedbindices = list;
		}
		return (this.allpsdedbindices.size() == 0)? null : this.allpsdedbindices;
	}

	public net.ibizsys.model.database.IPSDEDBIndex getPSDEDBIndex(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.database.IPSDEDBIndex.class, this.getAllPSDEDBIndices(), objKey, bTryMode);
	}
	public void setPSDEDBIndices(java.util.List<net.ibizsys.model.database.IPSDEDBIndex> list){
		this.allpsdedbindices = list;
	}

	private java.util.List<net.ibizsys.model.database.IPSDEDBTable> allpsdedbtables = null;
	public java.util.List<net.ibizsys.model.database.IPSDEDBTable> getAllPSDEDBTables(){
		if(this.allpsdedbtables == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEDBTABLES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.database.IPSDEDBTable> list = new java.util.ArrayList<net.ibizsys.model.database.IPSDEDBTable>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.database.IPSDEDBTable obj = this.getPSModelObject(net.ibizsys.model.database.IPSDEDBTable.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEDBTABLES);
				if(obj!=null)list.add(obj);
			}
			this.allpsdedbtables = list;
		}
		return (this.allpsdedbtables.size() == 0)? null : this.allpsdedbtables;
	}

	public net.ibizsys.model.database.IPSDEDBTable getPSDEDBTable(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.database.IPSDEDBTable.class, this.getAllPSDEDBTables(), objKey, bTryMode);
	}
	public void setPSDEDBTables(java.util.List<net.ibizsys.model.database.IPSDEDBTable> list){
		this.allpsdedbtables = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.dr.IPSDEDRGroup> allpsdedrgroups = null;
	public java.util.List<net.ibizsys.model.dataentity.dr.IPSDEDRGroup> getAllPSDEDRGroups(){
		if(this.allpsdedrgroups == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEDRGROUPS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.dr.IPSDEDRGroup> list = new java.util.ArrayList<net.ibizsys.model.dataentity.dr.IPSDEDRGroup>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.dr.IPSDEDRGroup obj = this.getPSModelObject(net.ibizsys.model.dataentity.dr.IPSDEDRGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEDRGROUPS);
				if(obj!=null)list.add(obj);
			}
			this.allpsdedrgroups = list;
		}
		return (this.allpsdedrgroups.size() == 0)? null : this.allpsdedrgroups;
	}

	public net.ibizsys.model.dataentity.dr.IPSDEDRGroup getPSDEDRGroup(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.dr.IPSDEDRGroup.class, this.getAllPSDEDRGroups(), objKey, bTryMode);
	}
	public void setPSDEDRGroups(java.util.List<net.ibizsys.model.dataentity.dr.IPSDEDRGroup> list){
		this.allpsdedrgroups = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.dr.IPSDEDRItem> allpsdedritems = null;
	public java.util.List<net.ibizsys.model.dataentity.dr.IPSDEDRItem> getAllPSDEDRItems(){
		if(this.allpsdedritems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEDRITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.dr.IPSDEDRItem> list = new java.util.ArrayList<net.ibizsys.model.dataentity.dr.IPSDEDRItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.dr.IPSDEDRItem obj = this.getPSModelObject(net.ibizsys.model.dataentity.dr.IPSDEDRItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEDRITEMS);
				if(obj!=null)list.add(obj);
			}
			this.allpsdedritems = list;
		}
		return (this.allpsdedritems.size() == 0)? null : this.allpsdedritems;
	}

	public net.ibizsys.model.dataentity.dr.IPSDEDRItem getPSDEDRItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.dr.IPSDEDRItem.class, this.getAllPSDEDRItems(), objKey, bTryMode);
	}
	public void setPSDEDRItems(java.util.List<net.ibizsys.model.dataentity.dr.IPSDEDRItem> list){
		this.allpsdedritems = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.dts.IPSDEDTSQueue> allpsdedtsqueues = null;
	public java.util.List<net.ibizsys.model.dataentity.dts.IPSDEDTSQueue> getAllPSDEDTSQueues(){
		if(this.allpsdedtsqueues == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEDTSQUEUES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.dts.IPSDEDTSQueue> list = new java.util.ArrayList<net.ibizsys.model.dataentity.dts.IPSDEDTSQueue>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.dts.IPSDEDTSQueue obj = this.getPSModelObject(net.ibizsys.model.dataentity.dts.IPSDEDTSQueue.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEDTSQUEUES);
				if(obj!=null)list.add(obj);
			}
			this.allpsdedtsqueues = list;
		}
		return (this.allpsdedtsqueues.size() == 0)? null : this.allpsdedtsqueues;
	}

	public net.ibizsys.model.dataentity.dts.IPSDEDTSQueue getPSDEDTSQueue(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.dts.IPSDEDTSQueue.class, this.getAllPSDEDTSQueues(), objKey, bTryMode);
	}
	public void setPSDEDTSQueues(java.util.List<net.ibizsys.model.dataentity.dts.IPSDEDTSQueue> list){
		this.allpsdedtsqueues = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.dataexport.IPSDEDataExport> allpsdedataexports = null;
	public java.util.List<net.ibizsys.model.dataentity.dataexport.IPSDEDataExport> getAllPSDEDataExports(){
		if(this.allpsdedataexports == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEDATAEXPORTS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.dataexport.IPSDEDataExport> list = new java.util.ArrayList<net.ibizsys.model.dataentity.dataexport.IPSDEDataExport>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.dataexport.IPSDEDataExport obj = this.getPSModelObject(net.ibizsys.model.dataentity.dataexport.IPSDEDataExport.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEDATAEXPORTS);
				if(obj!=null)list.add(obj);
			}
			this.allpsdedataexports = list;
		}
		return (this.allpsdedataexports.size() == 0)? null : this.allpsdedataexports;
	}

	public net.ibizsys.model.dataentity.dataexport.IPSDEDataExport getPSDEDataExport(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.dataexport.IPSDEDataExport.class, this.getAllPSDEDataExports(), objKey, bTryMode);
	}
	public void setPSDEDataExports(java.util.List<net.ibizsys.model.dataentity.dataexport.IPSDEDataExport> list){
		this.allpsdedataexports = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.dataflow.IPSDEDataFlow> allpsdedataflows = null;
	public java.util.List<net.ibizsys.model.dataentity.dataflow.IPSDEDataFlow> getAllPSDEDataFlows(){
		if(this.allpsdedataflows == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEDATAFLOWS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.dataflow.IPSDEDataFlow> list = new java.util.ArrayList<net.ibizsys.model.dataentity.dataflow.IPSDEDataFlow>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.dataflow.IPSDEDataFlow obj = this.getPSModelObject(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlow.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEDATAFLOWS);
				if(obj!=null)list.add(obj);
			}
			this.allpsdedataflows = list;
		}
		return (this.allpsdedataflows.size() == 0)? null : this.allpsdedataflows;
	}

	public net.ibizsys.model.dataentity.dataflow.IPSDEDataFlow getPSDEDataFlow(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlow.class, this.getAllPSDEDataFlows(), objKey, bTryMode);
	}
	public void setPSDEDataFlows(java.util.List<net.ibizsys.model.dataentity.dataflow.IPSDEDataFlow> list){
		this.allpsdedataflows = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.dataimport.IPSDEDataImport> allpsdedataimports = null;
	public java.util.List<net.ibizsys.model.dataentity.dataimport.IPSDEDataImport> getAllPSDEDataImports(){
		if(this.allpsdedataimports == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEDATAIMPORTS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.dataimport.IPSDEDataImport> list = new java.util.ArrayList<net.ibizsys.model.dataentity.dataimport.IPSDEDataImport>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.dataimport.IPSDEDataImport obj = this.getPSModelObject(net.ibizsys.model.dataentity.dataimport.IPSDEDataImport.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEDATAIMPORTS);
				if(obj!=null)list.add(obj);
			}
			this.allpsdedataimports = list;
		}
		return (this.allpsdedataimports.size() == 0)? null : this.allpsdedataimports;
	}

	public net.ibizsys.model.dataentity.dataimport.IPSDEDataImport getPSDEDataImport(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.dataimport.IPSDEDataImport.class, this.getAllPSDEDataImports(), objKey, bTryMode);
	}
	public void setPSDEDataImports(java.util.List<net.ibizsys.model.dataentity.dataimport.IPSDEDataImport> list){
		this.allpsdedataimports = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataQuery> allpsdedataqueries = null;
	public java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataQuery> getAllPSDEDataQueries(){
		if(this.allpsdedataqueries == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEDATAQUERIES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataQuery> list = new java.util.ArrayList<net.ibizsys.model.dataentity.ds.IPSDEDataQuery>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.ds.IPSDEDataQuery obj = this.getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDataQuery.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEDATAQUERIES);
				if(obj!=null)list.add(obj);
			}
			this.allpsdedataqueries = list;
		}
		return (this.allpsdedataqueries.size() == 0)? null : this.allpsdedataqueries;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataQuery getPSDEDataQuery(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDataQuery.class, this.getAllPSDEDataQueries(), objKey, bTryMode);
	}
	public void setPSDEDataQueries(java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataQuery> list){
		this.allpsdedataqueries = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.dr.IPSDEDataRelation> allpsdedatarelations = null;
	public java.util.List<net.ibizsys.model.dataentity.dr.IPSDEDataRelation> getAllPSDEDataRelations(){
		if(this.allpsdedatarelations == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEDATARELATIONS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.dr.IPSDEDataRelation> list = new java.util.ArrayList<net.ibizsys.model.dataentity.dr.IPSDEDataRelation>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.dr.IPSDEDataRelation obj = this.getPSModelObject(net.ibizsys.model.dataentity.dr.IPSDEDataRelation.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEDATARELATIONS);
				if(obj!=null)list.add(obj);
			}
			this.allpsdedatarelations = list;
		}
		return (this.allpsdedatarelations.size() == 0)? null : this.allpsdedatarelations;
	}

	public net.ibizsys.model.dataentity.dr.IPSDEDataRelation getPSDEDataRelation(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.dr.IPSDEDataRelation.class, this.getAllPSDEDataRelations(), objKey, bTryMode);
	}
	public void setPSDEDataRelations(java.util.List<net.ibizsys.model.dataentity.dr.IPSDEDataRelation> list){
		this.allpsdedatarelations = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataSet> allpsdedatasets = null;
	public java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataSet> getAllPSDEDataSets(){
		if(this.allpsdedatasets == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEDATASETS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataSet> list = new java.util.ArrayList<net.ibizsys.model.dataentity.ds.IPSDEDataSet>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.ds.IPSDEDataSet obj = this.getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEDATASETS);
				if(obj!=null)list.add(obj);
			}
			this.allpsdedatasets = list;
		}
		return (this.allpsdedatasets.size() == 0)? null : this.allpsdedatasets;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, this.getAllPSDEDataSets(), objKey, bTryMode);
	}
	public void setPSDEDataSets(java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataSet> list){
		this.allpsdedatasets = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.datasync.IPSDEDataSync> allpsdedatasyncs = null;
	public java.util.List<net.ibizsys.model.dataentity.datasync.IPSDEDataSync> getAllPSDEDataSyncs(){
		if(this.allpsdedatasyncs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEDATASYNCS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.datasync.IPSDEDataSync> list = new java.util.ArrayList<net.ibizsys.model.dataentity.datasync.IPSDEDataSync>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.datasync.IPSDEDataSync obj = this.getPSModelObject(net.ibizsys.model.dataentity.datasync.IPSDEDataSync.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEDATASYNCS);
				if(obj!=null)list.add(obj);
			}
			this.allpsdedatasyncs = list;
		}
		return (this.allpsdedatasyncs.size() == 0)? null : this.allpsdedatasyncs;
	}

	public net.ibizsys.model.dataentity.datasync.IPSDEDataSync getPSDEDataSync(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.datasync.IPSDEDataSync.class, this.getAllPSDEDataSyncs(), objKey, bTryMode);
	}
	public void setPSDEDataSyncs(java.util.List<net.ibizsys.model.dataentity.datasync.IPSDEDataSync> list){
		this.allpsdedatasyncs = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.defield.IPSDEFGroup> allpsdefgroups = null;
	public java.util.List<net.ibizsys.model.dataentity.defield.IPSDEFGroup> getAllPSDEFGroups(){
		if(this.allpsdefgroups == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEFGROUPS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.defield.IPSDEFGroup> list = new java.util.ArrayList<net.ibizsys.model.dataentity.defield.IPSDEFGroup>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.defield.IPSDEFGroup obj = this.getPSModelObject(net.ibizsys.model.dataentity.defield.IPSDEFGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEFGROUPS);
				if(obj!=null)list.add(obj);
			}
			this.allpsdefgroups = list;
		}
		return (this.allpsdefgroups.size() == 0)? null : this.allpsdefgroups;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEFGroup getPSDEFGroup(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.defield.IPSDEFGroup.class, this.getAllPSDEFGroups(), objKey, bTryMode);
	}
	public void setPSDEFGroups(java.util.List<net.ibizsys.model.dataentity.defield.IPSDEFGroup> list){
		this.allpsdefgroups = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.defield.IPSDEField> allpsdefields = null;
	public java.util.List<net.ibizsys.model.dataentity.defield.IPSDEField> getAllPSDEFields(){
		if(this.allpsdefields == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEFIELDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.defield.IPSDEField> list = new java.util.ArrayList<net.ibizsys.model.dataentity.defield.IPSDEField>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.defield.IPSDEField obj = this.getPSModelObject(net.ibizsys.model.dataentity.defield.IPSDEField.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEFIELDS);
				if(obj!=null)list.add(obj);
			}
			this.allpsdefields = list;
		}
		return (this.allpsdefields.size() == 0)? null : this.allpsdefields;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getPSDEField(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.defield.IPSDEField.class, this.getAllPSDEFields(), objKey, bTryMode);
	}
	public void setPSDEFields(java.util.List<net.ibizsys.model.dataentity.defield.IPSDEField> list){
		this.allpsdefields = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.IPSDEGroup> allpsdegroups = null;
	public java.util.List<net.ibizsys.model.dataentity.IPSDEGroup> getAllPSDEGroups(){
		if(this.allpsdegroups == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEGROUPS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.IPSDEGroup> list = new java.util.ArrayList<net.ibizsys.model.dataentity.IPSDEGroup>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.IPSDEGroup obj = this.getPSModelObject(net.ibizsys.model.dataentity.IPSDEGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEGROUPS);
				if(obj!=null)list.add(obj);
			}
			this.allpsdegroups = list;
		}
		return (this.allpsdegroups.size() == 0)? null : this.allpsdegroups;
	}

	public net.ibizsys.model.dataentity.IPSDEGroup getPSDEGroup(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.IPSDEGroup.class, this.getAllPSDEGroups(), objKey, bTryMode);
	}
	public void setPSDEGroups(java.util.List<net.ibizsys.model.dataentity.IPSDEGroup> list){
		this.allpsdegroups = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogic> allpsdelogics = null;
	public java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogic> getAllPSDELogics(){
		if(this.allpsdelogics == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDELOGICS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogic> list = new java.util.ArrayList<net.ibizsys.model.dataentity.logic.IPSDELogic>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.logic.IPSDELogic obj = this.getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDELogic.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDELOGICS);
				if(obj!=null)list.add(obj);
			}
			this.allpsdelogics = list;
		}
		return (this.allpsdelogics.size() == 0)? null : this.allpsdelogics;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogic getPSDELogic(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDELogic.class, this.getAllPSDELogics(), objKey, bTryMode);
	}
	public void setPSDELogics(java.util.List<net.ibizsys.model.dataentity.logic.IPSDELogic> list){
		this.allpsdelogics = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.logic.IPSDEMSLogic> allpsdemslogics = null;
	public java.util.List<net.ibizsys.model.dataentity.logic.IPSDEMSLogic> getAllPSDEMSLogics(){
		if(this.allpsdemslogics == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEMSLOGICS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.logic.IPSDEMSLogic> list = new java.util.ArrayList<net.ibizsys.model.dataentity.logic.IPSDEMSLogic>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.logic.IPSDEMSLogic obj = this.getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEMSLogic.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEMSLOGICS);
				if(obj!=null)list.add(obj);
			}
			this.allpsdemslogics = list;
		}
		return (this.allpsdemslogics.size() == 0)? null : this.allpsdemslogics;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEMSLogic getPSDEMSLogic(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.logic.IPSDEMSLogic.class, this.getAllPSDEMSLogics(), objKey, bTryMode);
	}
	public void setPSDEMSLogics(java.util.List<net.ibizsys.model.dataentity.logic.IPSDEMSLogic> list){
		this.allpsdemslogics = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.mainstate.IPSDEMainState> allpsdemainstates = null;
	public java.util.List<net.ibizsys.model.dataentity.mainstate.IPSDEMainState> getAllPSDEMainStates(){
		if(this.allpsdemainstates == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEMAINSTATES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.mainstate.IPSDEMainState> list = new java.util.ArrayList<net.ibizsys.model.dataentity.mainstate.IPSDEMainState>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.mainstate.IPSDEMainState obj = this.getPSModelObject(net.ibizsys.model.dataentity.mainstate.IPSDEMainState.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEMAINSTATES);
				if(obj!=null)list.add(obj);
			}
			this.allpsdemainstates = list;
		}
		return (this.allpsdemainstates.size() == 0)? null : this.allpsdemainstates;
	}

	public net.ibizsys.model.dataentity.mainstate.IPSDEMainState getPSDEMainState(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.mainstate.IPSDEMainState.class, this.getAllPSDEMainStates(), objKey, bTryMode);
	}
	public void setPSDEMainStates(java.util.List<net.ibizsys.model.dataentity.mainstate.IPSDEMainState> list){
		this.allpsdemainstates = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.datamap.IPSDEMap> allpsdemaps = null;
	public java.util.List<net.ibizsys.model.dataentity.datamap.IPSDEMap> getAllPSDEMaps(){
		if(this.allpsdemaps == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEMAPS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.datamap.IPSDEMap> list = new java.util.ArrayList<net.ibizsys.model.dataentity.datamap.IPSDEMap>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.datamap.IPSDEMap obj = this.getPSModelObject(net.ibizsys.model.dataentity.datamap.IPSDEMap.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEMAPS);
				if(obj!=null)list.add(obj);
			}
			this.allpsdemaps = list;
		}
		return (this.allpsdemaps.size() == 0)? null : this.allpsdemaps;
	}

	public net.ibizsys.model.dataentity.datamap.IPSDEMap getPSDEMap(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.datamap.IPSDEMap.class, this.getAllPSDEMaps(), objKey, bTryMode);
	}
	public void setPSDEMaps(java.util.List<net.ibizsys.model.dataentity.datamap.IPSDEMap> list){
		this.allpsdemaps = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.service.IPSDEMethodDTO> allpsdemethoddtos = null;
	public java.util.List<net.ibizsys.model.dataentity.service.IPSDEMethodDTO> getAllPSDEMethodDTOs(){
		if(this.allpsdemethoddtos == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEMETHODDTOS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.service.IPSDEMethodDTO> list = new java.util.ArrayList<net.ibizsys.model.dataentity.service.IPSDEMethodDTO>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.service.IPSDEMethodDTO obj = this.getPSModelObject(net.ibizsys.model.dataentity.service.IPSDEMethodDTO.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEMETHODDTOS);
				if(obj!=null)list.add(obj);
			}
			this.allpsdemethoddtos = list;
		}
		return (this.allpsdemethoddtos.size() == 0)? null : this.allpsdemethoddtos;
	}

	public net.ibizsys.model.dataentity.service.IPSDEMethodDTO getPSDEMethodDTO(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.service.IPSDEMethodDTO.class, this.getAllPSDEMethodDTOs(), objKey, bTryMode);
	}
	public void setPSDEMethodDTOs(java.util.List<net.ibizsys.model.dataentity.service.IPSDEMethodDTO> list){
		this.allpsdemethoddtos = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.notify.IPSDENotify> allpsdenotifies = null;
	public java.util.List<net.ibizsys.model.dataentity.notify.IPSDENotify> getAllPSDENotifies(){
		if(this.allpsdenotifies == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDENOTIFIES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.notify.IPSDENotify> list = new java.util.ArrayList<net.ibizsys.model.dataentity.notify.IPSDENotify>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.notify.IPSDENotify obj = this.getPSModelObject(net.ibizsys.model.dataentity.notify.IPSDENotify.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDENOTIFIES);
				if(obj!=null)list.add(obj);
			}
			this.allpsdenotifies = list;
		}
		return (this.allpsdenotifies.size() == 0)? null : this.allpsdenotifies;
	}

	public net.ibizsys.model.dataentity.notify.IPSDENotify getPSDENotify(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.notify.IPSDENotify.class, this.getAllPSDENotifies(), objKey, bTryMode);
	}
	public void setPSDENotifies(java.util.List<net.ibizsys.model.dataentity.notify.IPSDENotify> list){
		this.allpsdenotifies = list;
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

	private java.util.List<net.ibizsys.model.dataentity.print.IPSDEPrint> allpsdeprints = null;
	public java.util.List<net.ibizsys.model.dataentity.print.IPSDEPrint> getAllPSDEPrints(){
		if(this.allpsdeprints == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEPRINTS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.print.IPSDEPrint> list = new java.util.ArrayList<net.ibizsys.model.dataentity.print.IPSDEPrint>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.print.IPSDEPrint obj = this.getPSModelObject(net.ibizsys.model.dataentity.print.IPSDEPrint.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEPRINTS);
				if(obj!=null)list.add(obj);
			}
			this.allpsdeprints = list;
		}
		return (this.allpsdeprints.size() == 0)? null : this.allpsdeprints;
	}

	public net.ibizsys.model.dataentity.print.IPSDEPrint getPSDEPrint(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.print.IPSDEPrint.class, this.getAllPSDEPrints(), objKey, bTryMode);
	}
	public void setPSDEPrints(java.util.List<net.ibizsys.model.dataentity.print.IPSDEPrint> list){
		this.allpsdeprints = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.der.IPSDERGroup> allpsdergroups = null;
	public java.util.List<net.ibizsys.model.dataentity.der.IPSDERGroup> getAllPSDERGroups(){
		if(this.allpsdergroups == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDERGROUPS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.der.IPSDERGroup> list = new java.util.ArrayList<net.ibizsys.model.dataentity.der.IPSDERGroup>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.der.IPSDERGroup obj = this.getPSModelObject(net.ibizsys.model.dataentity.der.IPSDERGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDERGROUPS);
				if(obj!=null)list.add(obj);
			}
			this.allpsdergroups = list;
		}
		return (this.allpsdergroups.size() == 0)? null : this.allpsdergroups;
	}

	public net.ibizsys.model.dataentity.der.IPSDERGroup getPSDERGroup(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.der.IPSDERGroup.class, this.getAllPSDERGroups(), objKey, bTryMode);
	}
	public void setPSDERGroups(java.util.List<net.ibizsys.model.dataentity.der.IPSDERGroup> list){
		this.allpsdergroups = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.report.IPSDEReport> allpsdereports = null;
	public java.util.List<net.ibizsys.model.dataentity.report.IPSDEReport> getAllPSDEReports(){
		if(this.allpsdereports == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEREPORTS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.report.IPSDEReport> list = new java.util.ArrayList<net.ibizsys.model.dataentity.report.IPSDEReport>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.report.IPSDEReport obj = this.getPSModelObject(net.ibizsys.model.dataentity.report.IPSDEReport.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEREPORTS);
				if(obj!=null)list.add(obj);
			}
			this.allpsdereports = list;
		}
		return (this.allpsdereports.size() == 0)? null : this.allpsdereports;
	}

	public net.ibizsys.model.dataentity.report.IPSDEReport getPSDEReport(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.report.IPSDEReport.class, this.getAllPSDEReports(), objKey, bTryMode);
	}
	public void setPSDEReports(java.util.List<net.ibizsys.model.dataentity.report.IPSDEReport> list){
		this.allpsdereports = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.search.IPSDESearch> allpsdesearches = null;
	public java.util.List<net.ibizsys.model.dataentity.search.IPSDESearch> getAllPSDESearches(){
		if(this.allpsdesearches == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDESEARCHES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.search.IPSDESearch> list = new java.util.ArrayList<net.ibizsys.model.dataentity.search.IPSDESearch>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.search.IPSDESearch obj = this.getPSModelObject(net.ibizsys.model.dataentity.search.IPSDESearch.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDESEARCHES);
				if(obj!=null)list.add(obj);
			}
			this.allpsdesearches = list;
		}
		return (this.allpsdesearches.size() == 0)? null : this.allpsdesearches;
	}

	public net.ibizsys.model.dataentity.search.IPSDESearch getPSDESearch(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.search.IPSDESearch.class, this.getAllPSDESearches(), objKey, bTryMode);
	}
	public void setPSDESearches(java.util.List<net.ibizsys.model.dataentity.search.IPSDESearch> list){
		this.allpsdesearches = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.unistate.IPSDEUniState> allpsdeunistates = null;
	public java.util.List<net.ibizsys.model.dataentity.unistate.IPSDEUniState> getAllPSDEUniStates(){
		if(this.allpsdeunistates == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEUNISTATES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.unistate.IPSDEUniState> list = new java.util.ArrayList<net.ibizsys.model.dataentity.unistate.IPSDEUniState>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.unistate.IPSDEUniState obj = this.getPSModelObject(net.ibizsys.model.dataentity.unistate.IPSDEUniState.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEUNISTATES);
				if(obj!=null)list.add(obj);
			}
			this.allpsdeunistates = list;
		}
		return (this.allpsdeunistates.size() == 0)? null : this.allpsdeunistates;
	}

	public net.ibizsys.model.dataentity.unistate.IPSDEUniState getPSDEUniState(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.unistate.IPSDEUniState.class, this.getAllPSDEUniStates(), objKey, bTryMode);
	}
	public void setPSDEUniStates(java.util.List<net.ibizsys.model.dataentity.unistate.IPSDEUniState> list){
		this.allpsdeunistates = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.priv.IPSDEUserRole> allpsdeuserroles = null;
	public java.util.List<net.ibizsys.model.dataentity.priv.IPSDEUserRole> getAllPSDEUserRoles(){
		if(this.allpsdeuserroles == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEUSERROLES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.priv.IPSDEUserRole> list = new java.util.ArrayList<net.ibizsys.model.dataentity.priv.IPSDEUserRole>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.priv.IPSDEUserRole obj = this.getPSModelObject(net.ibizsys.model.dataentity.priv.IPSDEUserRole.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEUSERROLES);
				if(obj!=null)list.add(obj);
			}
			this.allpsdeuserroles = list;
		}
		return (this.allpsdeuserroles.size() == 0)? null : this.allpsdeuserroles;
	}

	public net.ibizsys.model.dataentity.priv.IPSDEUserRole getPSDEUserRole(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.priv.IPSDEUserRole.class, this.getAllPSDEUserRoles(), objKey, bTryMode);
	}
	public void setPSDEUserRoles(java.util.List<net.ibizsys.model.dataentity.priv.IPSDEUserRole> list){
		this.allpsdeuserroles = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.util.IPSDEUtil> allpsdeutils = null;
	public java.util.List<net.ibizsys.model.dataentity.util.IPSDEUtil> getAllPSDEUtils(){
		if(this.allpsdeutils == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEUTILS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.util.IPSDEUtil> list = new java.util.ArrayList<net.ibizsys.model.dataentity.util.IPSDEUtil>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.util.IPSDEUtil obj = this.getPSModelObject(net.ibizsys.model.dataentity.util.IPSDEUtil.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEUTILS);
				if(obj!=null)list.add(obj);
			}
			this.allpsdeutils = list;
		}
		return (this.allpsdeutils.size() == 0)? null : this.allpsdeutils;
	}

	public net.ibizsys.model.dataentity.util.IPSDEUtil getPSDEUtil(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.util.IPSDEUtil.class, this.getAllPSDEUtils(), objKey, bTryMode);
	}
	public void setPSDEUtils(java.util.List<net.ibizsys.model.dataentity.util.IPSDEUtil> list){
		this.allpsdeutils = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.wf.IPSDEWF> allpsdewfs = null;
	public java.util.List<net.ibizsys.model.dataentity.wf.IPSDEWF> getAllPSDEWFs(){
		if(this.allpsdewfs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEWFS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.wf.IPSDEWF> list = new java.util.ArrayList<net.ibizsys.model.dataentity.wf.IPSDEWF>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.wf.IPSDEWF obj = this.getPSModelObject(net.ibizsys.model.dataentity.wf.IPSDEWF.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEWFS);
				if(obj!=null)list.add(obj);
			}
			this.allpsdewfs = list;
		}
		return (this.allpsdewfs.size() == 0)? null : this.allpsdewfs;
	}

	public net.ibizsys.model.dataentity.wf.IPSDEWF getPSDEWF(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.wf.IPSDEWF.class, this.getAllPSDEWFs(), objKey, bTryMode);
	}
	public void setPSDEWFs(java.util.List<net.ibizsys.model.dataentity.wf.IPSDEWF> list){
		this.allpsdewfs = list;
	}

	private java.util.List<net.ibizsys.model.IPSModelData> allpsmodeldatas = null;
	public java.util.List<net.ibizsys.model.IPSModelData> getAllPSModelDatas(){
		if(this.allpsmodeldatas == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSMODELDATAS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.IPSModelData> list = new java.util.ArrayList<net.ibizsys.model.IPSModelData>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.IPSModelData obj = this.getPSModelObject(net.ibizsys.model.IPSModelData.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSMODELDATAS);
				if(obj!=null)list.add(obj);
			}
			this.allpsmodeldatas = list;
		}
		return (this.allpsmodeldatas.size() == 0)? null : this.allpsmodeldatas;
	}

	public net.ibizsys.model.IPSModelData getPSModelData(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.IPSModelData.class, this.getAllPSModelDatas(), objKey, bTryMode);
	}
	public void setPSModelData(java.util.List<net.ibizsys.model.IPSModelData> list){
		this.allpsmodeldatas = list;
	}

	private java.util.List<net.ibizsys.model.testing.IPSSysTestCase> allpssystestcases = null;
	public java.util.List<net.ibizsys.model.testing.IPSSysTestCase> getAllPSSysTestCases(){
		if(this.allpssystestcases == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSTESTCASES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.testing.IPSSysTestCase> list = new java.util.ArrayList<net.ibizsys.model.testing.IPSSysTestCase>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.testing.IPSSysTestCase obj = this.getPSModelObject(net.ibizsys.model.testing.IPSSysTestCase.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSTESTCASES);
				if(obj!=null)list.add(obj);
			}
			this.allpssystestcases = list;
		}
		return (this.allpssystestcases.size() == 0)? null : this.allpssystestcases;
	}

	public net.ibizsys.model.testing.IPSSysTestCase getPSSysTestCase(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.testing.IPSSysTestCase.class, this.getAllPSSysTestCases(), objKey, bTryMode);
	}
	public void setPSSysTestCases(java.util.List<net.ibizsys.model.testing.IPSSysTestCase> list){
		this.allpssystestcases = list;
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

	public int getAuditMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAUDITMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getBizTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBIZTAG);
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

	public java.lang.String getDETag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDETag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDETAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getDEType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDETYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getDSLink(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSLINK);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getDataAccCtrlArch(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATAACCCTRLARCH);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getDataAccCtrlMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATAACCCTRLMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getDataChangeLogMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATACHANGELOGMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getDataImpExpMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATAIMPEXPMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.ds.IPSDEDataQuery defaultpsdedataquery;

	public net.ibizsys.model.dataentity.ds.IPSDEDataQuery getDefaultPSDEDataQuery(){
		if(this.defaultpsdedataquery != null) return this.defaultpsdedataquery;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTPSDEDATAQUERY);
		if(value == null){
			return null;
		}
		this.defaultpsdedataquery = this.getPSDEDataQuery(value, false);
		return this.defaultpsdedataquery;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataQuery getDefaultPSDEDataQueryMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataQuery value = this.getDefaultPSDEDataQuery();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定默认实体数据查询");}
		return value;
	}

	public void setDefaultPSDEDataQuery(net.ibizsys.model.dataentity.ds.IPSDEDataQuery defaultpsdedataquery){
		this.defaultpsdedataquery = defaultpsdedataquery;
	}

	private net.ibizsys.model.dataentity.ds.IPSDEDataSet defaultpsdedataset;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getDefaultPSDEDataSet(){
		if(this.defaultpsdedataset != null) return this.defaultpsdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTPSDEDATASET);
		if(value == null){
			return null;
		}
		this.defaultpsdedataset = this.getPSDEDataSet(value, false);
		return this.defaultpsdedataset;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getDefaultPSDEDataSetMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getDefaultPSDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定默认实体数据集合");}
		return value;
	}

	public void setDefaultPSDEDataSet(net.ibizsys.model.dataentity.ds.IPSDEDataSet defaultpsdedataset){
		this.defaultpsdedataset = defaultpsdedataset;
	}

	private net.ibizsys.model.dataentity.ds.IPSDEFilterDTO defaultpsdefilterdto;

	public net.ibizsys.model.dataentity.ds.IPSDEFilterDTO getDefaultPSDEFilterDTO(){
		if(this.defaultpsdefilterdto != null) return this.defaultpsdefilterdto;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTPSDEFILTERDTO);
		if(value == null){
			return null;
		}
		this.defaultpsdefilterdto = (net.ibizsys.model.dataentity.ds.IPSDEFilterDTO) this.getPSDEMethodDTO(value, false);
		return this.defaultpsdefilterdto;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEFilterDTO getDefaultPSDEFilterDTOMust(){
		net.ibizsys.model.dataentity.ds.IPSDEFilterDTO value = this.getDefaultPSDEFilterDTO();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定默认实体过滤器DTO");}
		return value;
	}

	public void setDefaultPSDEFilterDTO(net.ibizsys.model.dataentity.ds.IPSDEFilterDTO defaultpsdefilterdto){
		this.defaultpsdefilterdto = defaultpsdefilterdto;
	}

	private net.ibizsys.model.dataentity.service.IPSDEMethodDTO defaultpsdemethoddto;

	public net.ibizsys.model.dataentity.service.IPSDEMethodDTO getDefaultPSDEMethodDTO(){
		if(this.defaultpsdemethoddto != null) return this.defaultpsdemethoddto;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTPSDEMETHODDTO);
		if(value == null){
			return null;
		}
		this.defaultpsdemethoddto = this.getPSDEMethodDTO(value, false);
		return this.defaultpsdemethoddto;
	}

	public net.ibizsys.model.dataentity.service.IPSDEMethodDTO getDefaultPSDEMethodDTOMust(){
		net.ibizsys.model.dataentity.service.IPSDEMethodDTO value = this.getDefaultPSDEMethodDTO();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定默认实体方法DTO");}
		return value;
	}

	public void setDefaultPSDEMethodDTO(net.ibizsys.model.dataentity.service.IPSDEMethodDTO defaultpsdemethoddto){
		this.defaultpsdemethoddto = defaultpsdemethoddto;
	}


	public int getDynaInstMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAINSTMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getDynaInstTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAINSTTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDynaInstTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAINSTTAG2);
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

	public int getEnableActions(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENABLEACTIONS);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getEnableUIActions(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENABLEUIACTIONS);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getEnableViewLevel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENABLEVIEWLEVEL);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getEntityCacheTimeout(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENTITYCACHETIMEOUT);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public int getExtendMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXTENDMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getIndexDEType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINDEXDETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField indextypepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getIndexTypePSDEField(){
		if(this.indextypepsdefield != null) return this.indextypepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINDEXTYPEPSDEFIELD);
		if(value == null){
			return null;
		}
		this.indextypepsdefield = this.getPSDEField(value, false);
		return this.indextypepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getIndexTypePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getIndexTypePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定索引类型属性");}
		return value;
	}

	public void setIndexTypePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField indextypepsdefield){
		this.indextypepsdefield = indextypepsdefield;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity inheritpsdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getInheritPSDataEntity(){
		if(this.inheritpsdataentity != null) return this.inheritpsdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINHERITPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.inheritpsdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETINHERITPSDATAENTITY);
		return this.inheritpsdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getInheritPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getInheritPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定继承实体对象");}
		return value;
	}

	public void setInheritPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity inheritpsdataentity){
		this.inheritpsdataentity = inheritpsdataentity;
	}


	public java.lang.String getInvalidLogicValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINVALIDLOGICVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField keynamepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getKeyNamePSDEField(){
		if(this.keynamepsdefield != null) return this.keynamepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETKEYNAMEPSDEFIELD);
		if(value == null){
			return null;
		}
		this.keynamepsdefield = this.getPSDEField(value, false);
		return this.keynamepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getKeyNamePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getKeyNamePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定键名属性");}
		return value;
	}

	public void setKeyNamePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField keynamepsdefield){
		this.keynamepsdefield = keynamepsdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField keypsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getKeyPSDEField(){
		if(this.keypsdefield != null) return this.keypsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETKEYPSDEFIELD);
		if(value == null){
			return null;
		}
		this.keypsdefield = this.getPSDEField(value, false);
		return this.keypsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getKeyPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getKeyPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定主键属性");}
		return value;
	}

	public void setKeyPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField keypsdefield){
		this.keypsdefield = keypsdefield;
	}

	private net.ibizsys.model.res.IPSLanguageRes lnpslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getLNPSLanguageRes(){
		if(this.lnpslanguageres != null) return this.lnpslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLNPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.lnpslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETLNPSLANGUAGERES);
		return this.lnpslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getLNPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getLNPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定逻辑名称语言资源");}
		return value;
	}

	public void setLNPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes lnpslanguageres){
		this.lnpslanguageres = lnpslanguageres;
	}


	public java.lang.String getLogicName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField logicvalidpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getLogicValidPSDEField(){
		if(this.logicvalidpsdefield != null) return this.logicvalidpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICVALIDPSDEFIELD);
		if(value == null){
			return null;
		}
		this.logicvalidpsdefield = this.getPSDEField(value, false);
		return this.logicvalidpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getLogicValidPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getLogicValidPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定逻辑有效属性");}
		return value;
	}

	public void setLogicValidPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField logicvalidpsdefield){
		this.logicvalidpsdefield = logicvalidpsdefield;
	}


	private java.util.List<net.ibizsys.model.dataentity.defield.IPSDEField> mainstatepsdefields = null;
	public java.util.List<net.ibizsys.model.dataentity.defield.IPSDEField> getMainStatePSDEFields(){
		if(this.mainstatepsdefields == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAINSTATEPSDEFIELDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.defield.IPSDEField> list = new java.util.ArrayList<net.ibizsys.model.dataentity.defield.IPSDEField>();
			for(int i = 0;i<arrayNode.size();i++) {
				list.add(this.getPSDEField((com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i), false));
			}
			this.mainstatepsdefields = list;
		}
		return (this.mainstatepsdefields.size() == 0)? null : this.mainstatepsdefields;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getMainStatePSDEField(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.defield.IPSDEField.class, this.getMainStatePSDEFields(), objKey, bTryMode);
	}
	
	public void setMainStatePSDEFields(java.util.List<net.ibizsys.model.dataentity.defield.IPSDEField> list){
		this.mainstatepsdefields = list;
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField majorpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getMajorPSDEField(){
		if(this.majorpsdefield != null) return this.majorpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAJORPSDEFIELD);
		if(value == null){
			return null;
		}
		this.majorpsdefield = this.getPSDEField(value, false);
		return this.majorpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getMajorPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getMajorPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定主信息属性");}
		return value;
	}

	public void setMajorPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField majorpsdefield){
		this.majorpsdefield = majorpsdefield;
	}


	private java.util.List<net.ibizsys.model.dataentity.der.IPSDERBase> majorpsders = null;
	public java.util.List<net.ibizsys.model.dataentity.der.IPSDERBase> getMajorPSDERs(){
		if(this.majorpsders == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAJORPSDERS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.der.IPSDERBase> list = new java.util.ArrayList<net.ibizsys.model.dataentity.der.IPSDERBase>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.der.IPSDERBase obj = this.getPSModelObject(net.ibizsys.model.dataentity.der.IPSDERBase.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETMAJORPSDERS);
				if(obj!=null)list.add(obj);
			}
			this.majorpsders = list;
		}
		return (this.majorpsders.size() == 0)? null : this.majorpsders;
	}

	public net.ibizsys.model.dataentity.der.IPSDERBase getMajorPSDERBase(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.der.IPSDERBase.class, this.getMajorPSDERs(), objKey, bTryMode);
	}
	
	public void setMajorPSDERBases(java.util.List<net.ibizsys.model.dataentity.der.IPSDERBase> list){
		this.majorpsders = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.der.IPSDERBase> minorpsders = null;
	public java.util.List<net.ibizsys.model.dataentity.der.IPSDERBase> getMinorPSDERs(){
		if(this.minorpsders == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINORPSDERS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.der.IPSDERBase> list = new java.util.ArrayList<net.ibizsys.model.dataentity.der.IPSDERBase>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.der.IPSDERBase obj = this.getPSModelObject(net.ibizsys.model.dataentity.der.IPSDERBase.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETMINORPSDERS);
				if(obj!=null)list.add(obj);
			}
			this.minorpsders = list;
		}
		return (this.minorpsders.size() == 0)? null : this.minorpsders;
	}

	public net.ibizsys.model.dataentity.der.IPSDERBase getMinorPSDERBase(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.der.IPSDERBase.class, this.getMinorPSDERs(), objKey, bTryMode);
	}
	
	public void setMinorPSDERBases(java.util.List<net.ibizsys.model.dataentity.der.IPSDERBase> list){
		this.minorpsders = list;
	}

	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 99999;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField orgidpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getOrgIdPSDEField(){
		if(this.orgidpsdefield != null) return this.orgidpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORGIDPSDEFIELD);
		if(value == null){
			return null;
		}
		this.orgidpsdefield = this.getPSDEField(value, false);
		return this.orgidpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getOrgIdPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getOrgIdPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定组织标识属性");}
		return value;
	}

	public void setOrgIdPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField orgidpsdefield){
		this.orgidpsdefield = orgidpsdefield;
	}

	private net.ibizsys.model.dataentity.der.IPSDERInherit psderinherit;

	public net.ibizsys.model.dataentity.der.IPSDERInherit getPSDERInherit(){
		if(this.psderinherit != null) return this.psderinherit;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDERINHERIT);
		if(value == null){
			return null;
		}
		this.psderinherit = getPSModelObject(net.ibizsys.model.dataentity.der.IPSDERInherit.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDERINHERIT);
		return this.psderinherit;
	}

	public net.ibizsys.model.dataentity.der.IPSDERInherit getPSDERInheritMust(){
		net.ibizsys.model.dataentity.der.IPSDERInherit value = this.getPSDERInherit();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定继承关系对象");}
		return value;
	}

	public void setPSDERInherit(net.ibizsys.model.dataentity.der.IPSDERInherit psderinherit){
		this.psderinherit = psderinherit;
	}

	private net.ibizsys.model.service.IPSSubSysServiceAPI pssubsysserviceapi;

	public net.ibizsys.model.service.IPSSubSysServiceAPI getPSSubSysServiceAPI(){
		if(this.pssubsysserviceapi != null) return this.pssubsysserviceapi;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSUBSYSSERVICEAPI);
		if(value == null){
			return null;
		}
		this.pssubsysserviceapi = getPSModelObject(net.ibizsys.model.service.IPSSubSysServiceAPI.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSUBSYSSERVICEAPI);
		return this.pssubsysserviceapi;
	}

	public net.ibizsys.model.service.IPSSubSysServiceAPI getPSSubSysServiceAPIMust(){
		net.ibizsys.model.service.IPSSubSysServiceAPI value = this.getPSSubSysServiceAPI();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定子系统服务接口");}
		return value;
	}

	public void setPSSubSysServiceAPI(net.ibizsys.model.service.IPSSubSysServiceAPI pssubsysserviceapi){
		this.pssubsysserviceapi = pssubsysserviceapi;
	}

	private net.ibizsys.model.service.IPSSubSysServiceAPIDE pssubsysserviceapide;

	public net.ibizsys.model.service.IPSSubSysServiceAPIDE getPSSubSysServiceAPIDE(){
		if(this.pssubsysserviceapide != null) return this.pssubsysserviceapide;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSUBSYSSERVICEAPIDE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.service.IPSSubSysServiceAPI ipssubsysserviceapi = this.getPSSubSysServiceAPIMust();
		this.pssubsysserviceapide = ipssubsysserviceapi.getPSSubSysServiceAPIDE(value, false);
		return this.pssubsysserviceapide;
	}

	public net.ibizsys.model.service.IPSSubSysServiceAPIDE getPSSubSysServiceAPIDEMust(){
		net.ibizsys.model.service.IPSSubSysServiceAPIDE value = this.getPSSubSysServiceAPIDE();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定子系统服务接口实体");}
		return value;
	}

	public void setPSSubSysServiceAPIDE(net.ibizsys.model.service.IPSSubSysServiceAPIDE pssubsysserviceapide){
		this.pssubsysserviceapide = pssubsysserviceapide;
	}

	private net.ibizsys.model.ba.IPSSysBDScheme pssysbdscheme;

	public net.ibizsys.model.ba.IPSSysBDScheme getPSSysBDScheme(){
		if(this.pssysbdscheme != null) return this.pssysbdscheme;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSBDSCHEME);
		if(value == null){
			return null;
		}
		this.pssysbdscheme = getPSModelObject(net.ibizsys.model.ba.IPSSysBDScheme.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSBDSCHEME);
		return this.pssysbdscheme;
	}

	public net.ibizsys.model.ba.IPSSysBDScheme getPSSysBDSchemeMust(){
		net.ibizsys.model.ba.IPSSysBDScheme value = this.getPSSysBDScheme();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定默认大数据库体系");}
		return value;
	}

	public void setPSSysBDScheme(net.ibizsys.model.ba.IPSSysBDScheme pssysbdscheme){
		this.pssysbdscheme = pssysbdscheme;
	}

	private net.ibizsys.model.database.IPSSysDBScheme pssysdbscheme;

	public net.ibizsys.model.database.IPSSysDBScheme getPSSysDBScheme(){
		if(this.pssysdbscheme != null) return this.pssysdbscheme;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSDBSCHEME);
		if(value == null){
			return null;
		}
		this.pssysdbscheme = getPSModelObject(net.ibizsys.model.database.IPSSysDBScheme.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSDBSCHEME);
		return this.pssysdbscheme;
	}

	public net.ibizsys.model.database.IPSSysDBScheme getPSSysDBSchemeMust(){
		net.ibizsys.model.database.IPSSysDBScheme value = this.getPSSysDBScheme();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定关系数据库架构");}
		return value;
	}

	public void setPSSysDBScheme(net.ibizsys.model.database.IPSSysDBScheme pssysdbscheme){
		this.pssysdbscheme = pssysdbscheme;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定后台扩展插件");}
		return value;
	}

	public void setPSSysSFPlugin(net.ibizsys.model.res.IPSSysSFPlugin pssyssfplugin){
		this.pssyssfplugin = pssyssfplugin;
	}

	private net.ibizsys.model.system.IPSSystemModule pssystemmodule;

	public net.ibizsys.model.system.IPSSystemModule getPSSystemModule(){
		if(this.pssystemmodule != null) return this.pssystemmodule;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSTEMMODULE);
		if(value == null){
			return null;
		}
		this.pssystemmodule = getPSModelObject(net.ibizsys.model.system.IPSSystemModule.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSTEMMODULE);
		return this.pssystemmodule;
	}

	public net.ibizsys.model.system.IPSSystemModule getPSSystemModuleMust(){
		net.ibizsys.model.system.IPSSystemModule value = this.getPSSystemModule();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统模块");}
		return value;
	}

	public void setPSSystemModule(net.ibizsys.model.system.IPSSystemModule pssystemmodule){
		this.pssystemmodule = pssystemmodule;
	}


	public java.lang.String getSaaSDCIdColumnName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSAASDCIDCOLUMNNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSaaSDataIdColumnName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSAASDATAIDCOLUMNNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getSaaSMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSAASMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getServiceAPIClientId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERVICEAPICLIENTID);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getServiceAPIMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERVICEAPIMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getServiceCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERVICECODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getStorageMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTORAGEMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getSystemTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSYSTEMTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTableName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTABLENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getTempDataHolder(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEMPDATAHOLDER);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getUnionKeyMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNIONKEYMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUnionKeyParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNIONKEYPARAM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.dataentity.defield.IPSDEField> unionkeyvaluepsdefields = null;
	public java.util.List<net.ibizsys.model.dataentity.defield.IPSDEField> getUnionKeyValuePSDEFields(){
		if(this.unionkeyvaluepsdefields == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNIONKEYVALUEPSDEFIELDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.defield.IPSDEField> list = new java.util.ArrayList<net.ibizsys.model.dataentity.defield.IPSDEField>();
			for(int i = 0;i<arrayNode.size();i++) {
				list.add(this.getPSDEField((com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i), false));
			}
			this.unionkeyvaluepsdefields = list;
		}
		return (this.unionkeyvaluepsdefields.size() == 0)? null : this.unionkeyvaluepsdefields;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getUnionKeyValuePSDEField(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.defield.IPSDEField.class, this.getUnionKeyValuePSDEFields(), objKey, bTryMode);
	}
	
	public void setUnionKeyValuePSDEFields(java.util.List<net.ibizsys.model.dataentity.defield.IPSDEField> list){
		this.unionkeyvaluepsdefields = list;
	}

	public java.lang.String getValidLogicValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALIDLOGICVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getView2Name(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVIEW2NAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getView3Name(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVIEW3NAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getView4Name(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVIEW4NAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getViewName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVIEWNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.ds.IPSDEDataQuery viewpsdedataquery;

	public net.ibizsys.model.dataentity.ds.IPSDEDataQuery getViewPSDEDataQuery(){
		if(this.viewpsdedataquery != null) return this.viewpsdedataquery;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVIEWPSDEDATAQUERY);
		if(value == null){
			return null;
		}
		this.viewpsdedataquery = this.getPSDEDataQuery(value, false);
		return this.viewpsdedataquery;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataQuery getViewPSDEDataQueryMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataQuery value = this.getViewPSDEDataQuery();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定默认实体视图数据查询");}
		return value;
	}

	public void setViewPSDEDataQuery(net.ibizsys.model.dataentity.ds.IPSDEDataQuery viewpsdedataquery){
		this.viewpsdedataquery = viewpsdedataquery;
	}


	public int getVirtualMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVIRTUALMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public boolean isEnableAPIStorage(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEAPISTORAGE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableCreate(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLECREATE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableDataVer(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEDATAVER);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableEntityCache(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEENTITYCACHE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableModify(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEMODIFY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableMultiDS(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEMULTIDS);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableMultiForm(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEMULTIFORM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableMultiStorage(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEMULTISTORAGE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableNoSQLStorage(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLENOSQLSTORAGE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableRemove(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEREMOVE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableSQLStorage(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLESQLSTORAGE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableTempData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLETEMPDATA);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableTempDataBackend(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLETEMPDATABACKEND);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableTempDataFront(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLETEMPDATAFRONT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isLogicValid(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISLOGICVALID);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isSubSysAsCloud(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSUBSYSASCLOUD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isSubSysDE(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSUBSYSDE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isVirtual(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISVIRTUAL);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
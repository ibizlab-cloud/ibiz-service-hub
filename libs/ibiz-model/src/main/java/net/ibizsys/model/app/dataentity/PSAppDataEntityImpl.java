package net.ibizsys.model.app.dataentity;



public class PSAppDataEntityImpl extends net.ibizsys.model.app.PSApplicationObjectImpl implements net.ibizsys.model.app.dataentity.IPSAppDataEntity{

	public final static String ATTR_GETALLPSAPPDEACMODES = "getAllPSAppDEACModes";
	public final static String ATTR_GETALLPSAPPDEACTIONS = "getAllPSAppDEActions";
	public final static String ATTR_GETALLPSAPPDEDATAEXPORTS = "getAllPSAppDEDataExports";
	public final static String ATTR_GETALLPSAPPDEDATAIMPORTS = "getAllPSAppDEDataImports";
	public final static String ATTR_GETALLPSAPPDEDATASETS = "getAllPSAppDEDataSets";
	public final static String ATTR_GETALLPSAPPDEFIELDS = "getAllPSAppDEFields";
	public final static String ATTR_GETALLPSAPPDELOGICS = "getAllPSAppDELogics";
	public final static String ATTR_GETALLPSAPPDEMAPS = "getAllPSAppDEMaps";
	public final static String ATTR_GETALLPSAPPDEMETHODDTOS = "getAllPSAppDEMethodDTOs";
	public final static String ATTR_GETALLPSAPPDEMETHODS = "getAllPSAppDEMethods";
	public final static String ATTR_GETALLPSAPPDEPRINTS = "getAllPSAppDEPrints";
	public final static String ATTR_GETALLPSAPPDEUIACTIONGROUPS = "getAllPSAppDEUIActionGroups";
	public final static String ATTR_GETALLPSAPPDEUIACTIONS = "getAllPSAppDEUIActions";
	public final static String ATTR_GETALLPSAPPDEUILOGICS = "getAllPSAppDEUILogics";
	public final static String ATTR_GETALLPSAPPPORTLETCATS = "getAllPSAppPortletCats";
	public final static String ATTR_GETALLPSAPPVIEWS = "getAllPSAppViews";
	public final static String ATTR_GETALLPSDEMAINSTATES = "getAllPSDEMainStates";
	public final static String ATTR_GETALLPSDEOPPRIVS = "getAllPSDEOPPrivs";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCODENAME2 = "codeName2";
	public final static String ATTR_GETDEAPICODENAME = "dEAPICodeName";
	public final static String ATTR_GETDEAPICODENAME2 = "dEAPICodeName2";
	public final static String ATTR_GETDEAPITAG = "dEAPITag";
	public final static String ATTR_GETDECODENAME = "dECodeName";
	public final static String ATTR_GETDEFGROUPMODE = "dEFGroupMode";
	public final static String ATTR_GETDEFULLTAG = "dEFullTag";
	public final static String ATTR_GETDENAME = "dEName";
	public final static String ATTR_GETDATAACCCTRLARCH = "dataAccCtrlArch";
	public final static String ATTR_GETDATAACCCTRLMODE = "dataAccCtrlMode";
	public final static String ATTR_GETDATATYPEPSAPPDEFIELD = "getDataTypePSAppDEField";
	public final static String ATTR_GETDEFAULTPSAPPDEDATAEXPORT = "getDefaultPSAppDEDataExport";
	public final static String ATTR_GETDEFAULTPSAPPDEDATAIMPORT = "getDefaultPSAppDEDataImport";
	public final static String ATTR_GETDEFAULTPSAPPDEPRINT = "getDefaultPSAppDEPrint";
	public final static String ATTR_GETDYNAINSTTAG = "dynaInstTag";
	public final static String ATTR_GETDYNASYSMODE = "dynaSysMode";
	public final static String ATTR_GETENABLEUIACTIONS = "enableUIActions";
	public final static String ATTR_GETFORMTYPEPSAPPDEFIELD = "getFormTypePSAppDEField";
	public final static String ATTR_GETINDEXTYPEPSAPPDEFIELD = "getIndexTypePSAppDEField";
	public final static String ATTR_GETKEYPSAPPDEFIELD = "getKeyPSAppDEField";
	public final static String ATTR_GETLNPSLANGUAGERES = "getLNPSLanguageRes";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETMAINSTATEPSAPPDEFIELDS = "getMainStatePSAppDEFields";
	public final static String ATTR_GETMAJORPSAPPDEFIELD = "getMajorPSAppDEField";
	public final static String ATTR_GETMINORPSAPPDERSS = "getMinorPSAppDERSs";
	public final static String ATTR_GETORGIDPSAPPDEFIELD = "getOrgIdPSAppDEField";
	public final static String ATTR_GETPSAPPMODULE = "getPSAppModule";
	public final static String ATTR_GETPSDENAME = "getPSDEName";
	public final static String ATTR_GETPSDER1N = "getPSDER1N";
	public final static String ATTR_GETPSDESERVICEAPI = "getPSDEServiceAPI";
	public final static String ATTR_GETPSDATAENTITY = "getPSDataEntity";
	public final static String ATTR_GETPSSYSIMAGE = "getPSSysImage";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSSERVICEAPI = "getPSSysServiceAPI";
	public final static String ATTR_GETQUICKSEARCHPSAPPDEFIELDS = "getQuickSearchPSAppDEFields";
	public final static String ATTR_GETREQUESTPATHS = "requestPaths";
	public final static String ATTR_GETSTORAGEMODE = "storageMode";
	public final static String ATTR_GETSYSAPITAG = "sysAPITag";
	public final static String ATTR_GETUNIONKEYVALUEPSAPPDEFIELDS = "getUnionKeyValuePSAppDEFields";
	public final static String ATTR_ISDEFAULTMODE = "defaultMode";
	public final static String ATTR_ISENABLEDEMAINSTATE = "enableDEMainState";
	public final static String ATTR_ISENABLEFILTERACTIONS = "enableFilterActions";
	public final static String ATTR_ISENABLETEMPDATA = "enableTempData";
	public final static String ATTR_ISENABLEUICREATE = "enableUICreate";
	public final static String ATTR_ISENABLEUIMODIFY = "enableUIModify";
	public final static String ATTR_ISENABLEUIREMOVE = "enableUIRemove";
	public final static String ATTR_ISENABLEWFACTIONS = "enableWFActions";
	public final static String ATTR_ISMAJOR = "major";

	private java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEACMode> allpsappdeacmodes = null;
	public java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEACMode> getAllPSAppDEACModes(){
		if(this.allpsappdeacmodes == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPDEACMODES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEACMode> list = new java.util.ArrayList<net.ibizsys.model.app.dataentity.IPSAppDEACMode>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.dataentity.IPSAppDEACMode obj = this.getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEACMode.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPDEACMODES);
				if(obj!=null)list.add(obj);
			}
			this.allpsappdeacmodes = list;
		}
		return (this.allpsappdeacmodes.size() == 0)? null : this.allpsappdeacmodes;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEACMode getPSAppDEACMode(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEACMode.class, this.getAllPSAppDEACModes(), objKey, bTryMode);
	}
	public void setPSAppDEACModes(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEACMode> list){
		this.allpsappdeacmodes = list;
	}

	private java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEAction> allpsappdeactions = null;
	public java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEAction> getAllPSAppDEActions(){
		if(this.allpsappdeactions == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPDEACTIONS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEAction> list = new java.util.ArrayList<net.ibizsys.model.app.dataentity.IPSAppDEAction>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.dataentity.IPSAppDEAction obj = this.getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPDEACTIONS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappdeactions = list;
		}
		return (this.allpsappdeactions.size() == 0)? null : this.allpsappdeactions;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEAction getPSAppDEAction(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEAction.class, this.getAllPSAppDEActions(), objKey, bTryMode);
	}
	public void setPSAppDEActions(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEAction> list){
		this.allpsappdeactions = list;
	}

	private java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEDataExport> allpsappdedataexports = null;
	public java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEDataExport> getAllPSAppDEDataExports(){
		if(this.allpsappdedataexports == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPDEDATAEXPORTS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEDataExport> list = new java.util.ArrayList<net.ibizsys.model.app.dataentity.IPSAppDEDataExport>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.dataentity.IPSAppDEDataExport obj = this.getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEDataExport.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPDEDATAEXPORTS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappdedataexports = list;
		}
		return (this.allpsappdedataexports.size() == 0)? null : this.allpsappdedataexports;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEDataExport getPSAppDEDataExport(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEDataExport.class, this.getAllPSAppDEDataExports(), objKey, bTryMode);
	}
	public void setPSAppDEDataExports(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEDataExport> list){
		this.allpsappdedataexports = list;
	}

	private java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEDataImport> allpsappdedataimports = null;
	public java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEDataImport> getAllPSAppDEDataImports(){
		if(this.allpsappdedataimports == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPDEDATAIMPORTS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEDataImport> list = new java.util.ArrayList<net.ibizsys.model.app.dataentity.IPSAppDEDataImport>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.dataentity.IPSAppDEDataImport obj = this.getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEDataImport.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPDEDATAIMPORTS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappdedataimports = list;
		}
		return (this.allpsappdedataimports.size() == 0)? null : this.allpsappdedataimports;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEDataImport getPSAppDEDataImport(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEDataImport.class, this.getAllPSAppDEDataImports(), objKey, bTryMode);
	}
	public void setPSAppDEDataImports(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEDataImport> list){
		this.allpsappdedataimports = list;
	}

	private java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEDataSet> allpsappdedatasets = null;
	public java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEDataSet> getAllPSAppDEDataSets(){
		if(this.allpsappdedatasets == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPDEDATASETS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEDataSet> list = new java.util.ArrayList<net.ibizsys.model.app.dataentity.IPSAppDEDataSet>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.dataentity.IPSAppDEDataSet obj = this.getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEDataSet.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPDEDATASETS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappdedatasets = list;
		}
		return (this.allpsappdedatasets.size() == 0)? null : this.allpsappdedatasets;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSet(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEDataSet.class, this.getAllPSAppDEDataSets(), objKey, bTryMode);
	}
	public void setPSAppDEDataSets(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEDataSet> list){
		this.allpsappdedatasets = list;
	}

	private java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEField> allpsappdefields = null;
	public java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEField> getAllPSAppDEFields(){
		if(this.allpsappdefields == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPDEFIELDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEField> list = new java.util.ArrayList<net.ibizsys.model.app.dataentity.IPSAppDEField>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.dataentity.IPSAppDEField obj = this.getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEField.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPDEFIELDS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappdefields = list;
		}
		return (this.allpsappdefields.size() == 0)? null : this.allpsappdefields;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getPSAppDEField(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEField.class, this.getAllPSAppDEFields(), objKey, bTryMode);
	}
	public void setPSAppDEFields(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEField> list){
		this.allpsappdefields = list;
	}

	private java.util.List<net.ibizsys.model.app.dataentity.IPSAppDELogic> allpsappdelogics = null;
	public java.util.List<net.ibizsys.model.app.dataentity.IPSAppDELogic> getAllPSAppDELogics(){
		if(this.allpsappdelogics == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPDELOGICS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.dataentity.IPSAppDELogic> list = new java.util.ArrayList<net.ibizsys.model.app.dataentity.IPSAppDELogic>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.dataentity.IPSAppDELogic obj = this.getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDELogic.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPDELOGICS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappdelogics = list;
		}
		return (this.allpsappdelogics.size() == 0)? null : this.allpsappdelogics;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDELogic getPSAppDELogic(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDELogic.class, this.getAllPSAppDELogics(), objKey, bTryMode);
	}
	public void setPSAppDELogics(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDELogic> list){
		this.allpsappdelogics = list;
	}

	private java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMap> allpsappdemaps = null;
	public java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMap> getAllPSAppDEMaps(){
		if(this.allpsappdemaps == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPDEMAPS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMap> list = new java.util.ArrayList<net.ibizsys.model.app.dataentity.IPSAppDEMap>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.dataentity.IPSAppDEMap obj = this.getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEMap.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPDEMAPS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappdemaps = list;
		}
		return (this.allpsappdemaps.size() == 0)? null : this.allpsappdemaps;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEMap getPSAppDEMap(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEMap.class, this.getAllPSAppDEMaps(), objKey, bTryMode);
	}
	public void setPSAppDEMaps(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMap> list){
		this.allpsappdemaps = list;
	}

	private java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO> allpsappdemethoddtos = null;
	public java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO> getAllPSAppDEMethodDTOs(){
		if(this.allpsappdemethoddtos == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPDEMETHODDTOS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO> list = new java.util.ArrayList<net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO obj = this.getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPDEMETHODDTOS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappdemethoddtos = list;
		}
		return (this.allpsappdemethoddtos.size() == 0)? null : this.allpsappdemethoddtos;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO getPSAppDEMethodDTO(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO.class, this.getAllPSAppDEMethodDTOs(), objKey, bTryMode);
	}
	public void setPSAppDEMethodDTOs(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMethodDTO> list){
		this.allpsappdemethoddtos = list;
	}

	private java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMethod> allpsappdemethods = null;
	public java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMethod> getAllPSAppDEMethods(){
		if(this.allpsappdemethods == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPDEMETHODS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMethod> list = new java.util.ArrayList<net.ibizsys.model.app.dataentity.IPSAppDEMethod>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.dataentity.IPSAppDEMethod obj = this.getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEMethod.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPDEMETHODS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappdemethods = list;
		}
		return (this.allpsappdemethods.size() == 0)? null : this.allpsappdemethods;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEMethod getPSAppDEMethod(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEMethod.class, this.getAllPSAppDEMethods(), objKey, bTryMode);
	}
	public void setPSAppDEMethods(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEMethod> list){
		this.allpsappdemethods = list;
	}

	private java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEPrint> allpsappdeprints = null;
	public java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEPrint> getAllPSAppDEPrints(){
		if(this.allpsappdeprints == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPDEPRINTS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEPrint> list = new java.util.ArrayList<net.ibizsys.model.app.dataentity.IPSAppDEPrint>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.dataentity.IPSAppDEPrint obj = this.getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEPrint.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPDEPRINTS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappdeprints = list;
		}
		return (this.allpsappdeprints.size() == 0)? null : this.allpsappdeprints;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEPrint getPSAppDEPrint(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEPrint.class, this.getAllPSAppDEPrints(), objKey, bTryMode);
	}
	public void setPSAppDEPrints(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEPrint> list){
		this.allpsappdeprints = list;
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

	private java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUILogic> allpsappdeuilogics = null;
	public java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUILogic> getAllPSAppDEUILogics(){
		if(this.allpsappdeuilogics == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSAPPDEUILOGICS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUILogic> list = new java.util.ArrayList<net.ibizsys.model.app.dataentity.IPSAppDEUILogic>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.dataentity.IPSAppDEUILogic obj = this.getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEUILogic.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSAPPDEUILOGICS);
				if(obj!=null)list.add(obj);
			}
			this.allpsappdeuilogics = list;
		}
		return (this.allpsappdeuilogics.size() == 0)? null : this.allpsappdeuilogics;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEUILogic getPSAppDEUILogic(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEUILogic.class, this.getAllPSAppDEUILogics(), objKey, bTryMode);
	}
	public void setPSAppDEUILogics(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEUILogic> list){
		this.allpsappdeuilogics = list;
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

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCodeName2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDEAPICodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEAPICODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDEAPICodeName2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEAPICODENAME2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDEAPITag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEAPITAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDECodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDECODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDEFGroupMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFGROUPMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDEFullTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFULLTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDEName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDENAME);
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
	private net.ibizsys.model.app.dataentity.IPSAppDEField datatypepsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getDataTypePSAppDEField(){
		if(this.datatypepsappdefield != null) return this.datatypepsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATATYPEPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.datatypepsappdefield = this.getPSAppDEField(value, false);
		return this.datatypepsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getDataTypePSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getDataTypePSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定数据类型应用实体属性");}
		return value;
	}

	public void setDataTypePSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField datatypepsappdefield){
		this.datatypepsappdefield = datatypepsappdefield;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEDataExport defaultpsappdedataexport;

	public net.ibizsys.model.app.dataentity.IPSAppDEDataExport getDefaultPSAppDEDataExport(){
		if(this.defaultpsappdedataexport != null) return this.defaultpsappdedataexport;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTPSAPPDEDATAEXPORT);
		if(value == null){
			return null;
		}
		this.defaultpsappdedataexport = this.getPSAppDEDataExport(value, false);
		return this.defaultpsappdedataexport;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEDataExport getDefaultPSAppDEDataExportMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEDataExport value = this.getDefaultPSAppDEDataExport();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定默认实体数据导入");}
		return value;
	}

	public void setDefaultPSAppDEDataExport(net.ibizsys.model.app.dataentity.IPSAppDEDataExport defaultpsappdedataexport){
		this.defaultpsappdedataexport = defaultpsappdedataexport;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEDataImport defaultpsappdedataimport;

	public net.ibizsys.model.app.dataentity.IPSAppDEDataImport getDefaultPSAppDEDataImport(){
		if(this.defaultpsappdedataimport != null) return this.defaultpsappdedataimport;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTPSAPPDEDATAIMPORT);
		if(value == null){
			return null;
		}
		this.defaultpsappdedataimport = this.getPSAppDEDataImport(value, false);
		return this.defaultpsappdedataimport;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEDataImport getDefaultPSAppDEDataImportMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEDataImport value = this.getDefaultPSAppDEDataImport();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定默认实体数据导入");}
		return value;
	}

	public void setDefaultPSAppDEDataImport(net.ibizsys.model.app.dataentity.IPSAppDEDataImport defaultpsappdedataimport){
		this.defaultpsappdedataimport = defaultpsappdedataimport;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEPrint defaultpsappdeprint;

	public net.ibizsys.model.app.dataentity.IPSAppDEPrint getDefaultPSAppDEPrint(){
		if(this.defaultpsappdeprint != null) return this.defaultpsappdeprint;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTPSAPPDEPRINT);
		if(value == null){
			return null;
		}
		this.defaultpsappdeprint = this.getPSAppDEPrint(value, false);
		return this.defaultpsappdeprint;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEPrint getDefaultPSAppDEPrintMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEPrint value = this.getDefaultPSAppDEPrint();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定默认实体打印");}
		return value;
	}

	public void setDefaultPSAppDEPrint(net.ibizsys.model.app.dataentity.IPSAppDEPrint defaultpsappdeprint){
		this.defaultpsappdeprint = defaultpsappdeprint;
	}


	public java.lang.String getDynaInstTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAINSTTAG);
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

	public int getEnableUIActions(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENABLEUIACTIONS);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField formtypepsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getFormTypePSAppDEField(){
		if(this.formtypepsappdefield != null) return this.formtypepsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFORMTYPEPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.formtypepsappdefield = this.getPSAppDEField(value, false);
		return this.formtypepsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getFormTypePSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getFormTypePSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定表单类型应用实体属性");}
		return value;
	}

	public void setFormTypePSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField formtypepsappdefield){
		this.formtypepsappdefield = formtypepsappdefield;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField indextypepsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getIndexTypePSAppDEField(){
		if(this.indextypepsappdefield != null) return this.indextypepsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINDEXTYPEPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.indextypepsappdefield = this.getPSAppDEField(value, false);
		return this.indextypepsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getIndexTypePSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getIndexTypePSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定索引类型应用实体属性");}
		return value;
	}

	public void setIndexTypePSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField indextypepsappdefield){
		this.indextypepsappdefield = indextypepsappdefield;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField keypsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getKeyPSAppDEField(){
		if(this.keypsappdefield != null) return this.keypsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETKEYPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.keypsappdefield = this.getPSAppDEField(value, false);
		return this.keypsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getKeyPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getKeyPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定主键属性");}
		return value;
	}

	public void setKeyPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField keypsappdefield){
		this.keypsappdefield = keypsappdefield;
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

	private java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEField> mainstatepsappdefields = null;
	public java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEField> getMainStatePSAppDEFields(){
		if(this.mainstatepsappdefields == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAINSTATEPSAPPDEFIELDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEField> list = new java.util.ArrayList<net.ibizsys.model.app.dataentity.IPSAppDEField>();
			for(int i = 0;i<arrayNode.size();i++) {
				list.add(this.getPSAppDEField((com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i), false));
			}
			this.mainstatepsappdefields = list;
		}
		return (this.mainstatepsappdefields.size() == 0)? null : this.mainstatepsappdefields;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getMainStatePSAppDEField(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEField.class, this.getMainStatePSAppDEFields(), objKey, bTryMode);
	}
	
	public void setMainStatePSAppDEFields(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEField> list){
		this.mainstatepsappdefields = list;
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField majorpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getMajorPSAppDEField(){
		if(this.majorpsappdefield != null) return this.majorpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAJORPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.majorpsappdefield = this.getPSAppDEField(value, false);
		return this.majorpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getMajorPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getMajorPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定主信息属性");}
		return value;
	}

	public void setMajorPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField majorpsappdefield){
		this.majorpsappdefield = majorpsappdefield;
	}


	private java.util.List<net.ibizsys.model.app.dataentity.IPSAppDERS> minorpsappderss = null;
	public java.util.List<net.ibizsys.model.app.dataentity.IPSAppDERS> getMinorPSAppDERSs(){
		if(this.minorpsappderss == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINORPSAPPDERSS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.dataentity.IPSAppDERS> list = new java.util.ArrayList<net.ibizsys.model.app.dataentity.IPSAppDERS>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.dataentity.IPSAppDERS obj = this.getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDERS.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETMINORPSAPPDERSS);
				if(obj!=null)list.add(obj);
			}
			this.minorpsappderss = list;
		}
		return (this.minorpsappderss.size() == 0)? null : this.minorpsappderss;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDERS getMinorPSAppDERS(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDERS.class, this.getMinorPSAppDERSs(), objKey, bTryMode);
	}
	
	public void setMinorPSAppDERs(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDERS> list){
		this.minorpsappderss = list;
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField orgidpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getOrgIdPSAppDEField(){
		if(this.orgidpsappdefield != null) return this.orgidpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORGIDPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.orgidpsappdefield = this.getPSAppDEField(value, false);
		return this.orgidpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getOrgIdPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getOrgIdPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定组织标识应用实体属性");}
		return value;
	}

	public void setOrgIdPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField orgidpsappdefield){
		this.orgidpsappdefield = orgidpsappdefield;
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


	public java.lang.String getPSDEName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.der.IPSDER1N psder1n;

	public net.ibizsys.model.dataentity.der.IPSDER1N getPSDER1N(){
		if(this.psder1n != null) return this.psder1n;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDER1N);
		if(value == null){
			return null;
		}
		this.psder1n = getPSModelObject(net.ibizsys.model.dataentity.der.IPSDER1N.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDER1N);
		return this.psder1n;
	}

	public net.ibizsys.model.dataentity.der.IPSDER1N getPSDER1NMust(){
		net.ibizsys.model.dataentity.der.IPSDER1N value = this.getPSDER1N();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定控制实体关系");}
		return value;
	}

	public void setPSDER1N(net.ibizsys.model.dataentity.der.IPSDER1N psder1n){
		this.psder1n = psder1n;
	}

	private net.ibizsys.model.dataentity.service.IPSDEServiceAPI psdeserviceapi;

	public net.ibizsys.model.dataentity.service.IPSDEServiceAPI getPSDEServiceAPI(){
		if(this.psdeserviceapi != null) return this.psdeserviceapi;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDESERVICEAPI);
		if(value == null){
			return null;
		}
		this.psdeserviceapi = this.getPSSysServiceAPIMust().getPSDEServiceAPI(value, false);
		return this.psdeserviceapi;
	}

	public net.ibizsys.model.dataentity.service.IPSDEServiceAPI getPSDEServiceAPIMust(){
		net.ibizsys.model.dataentity.service.IPSDEServiceAPI value = this.getPSDEServiceAPI();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体服务接口");}
		return value;
	}

	public void setPSDEServiceAPI(net.ibizsys.model.dataentity.service.IPSDEServiceAPI psdeserviceapi){
		this.psdeserviceapi = psdeserviceapi;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity psdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity(){
		if(this.psdataentity != null) return this.psdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.psdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDATAENTITY);
		return this.psdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体对象");}
		return value;
	}

	public void setPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity psdataentity){
		this.psdataentity = psdataentity;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统图片资源");}
		return value;
	}

	public void setPSSysImage(net.ibizsys.model.res.IPSSysImage pssysimage){
		this.pssysimage = pssysimage;
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

	private net.ibizsys.model.service.IPSSysServiceAPI pssysserviceapi;

	public net.ibizsys.model.service.IPSSysServiceAPI getPSSysServiceAPI(){
		if(this.pssysserviceapi != null) return this.pssysserviceapi;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSSERVICEAPI);
		if(value == null){
			return null;
		}
		this.pssysserviceapi = getPSModelObject(net.ibizsys.model.service.IPSSysServiceAPI.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSSERVICEAPI);
		return this.pssysserviceapi;
	}

	public net.ibizsys.model.service.IPSSysServiceAPI getPSSysServiceAPIMust(){
		net.ibizsys.model.service.IPSSysServiceAPI value = this.getPSSysServiceAPI();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定服务接口");}
		return value;
	}

	public void setPSSysServiceAPI(net.ibizsys.model.service.IPSSysServiceAPI pssysserviceapi){
		this.pssysserviceapi = pssysserviceapi;
	}


	private java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEField> quicksearchpsappdefields = null;
	public java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEField> getQuickSearchPSAppDEFields(){
		if(this.quicksearchpsappdefields == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETQUICKSEARCHPSAPPDEFIELDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEField> list = new java.util.ArrayList<net.ibizsys.model.app.dataentity.IPSAppDEField>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.dataentity.IPSAppDEField obj = this.getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEField.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETQUICKSEARCHPSAPPDEFIELDS);
				if(obj!=null)list.add(obj);
			}
			this.quicksearchpsappdefields = list;
		}
		return (this.quicksearchpsappdefields.size() == 0)? null : this.quicksearchpsappdefields;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getQuickSearchPSAppDEField(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEField.class, this.getQuickSearchPSAppDEFields(), objKey, bTryMode);
	}
	
	public void setQuickSearchPSAppDEFields(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEField> list){
		this.quicksearchpsappdefields = list;
	}
	private java.lang.String[] requestpaths = null;
	public java.lang.String[] getRequestPaths(){
		if(this.requestpaths == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREQUESTPATHS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.lang.String[] array = new java.lang.String[arrayNode.size()];
			for(int i = 0;i<arrayNode.size();i++) {
				array[i] = arrayNode.get(i).asText();
			}
			this.requestpaths = array;
		}
		return this.requestpaths;
	}

	public int getStorageMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTORAGEMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getSysAPITag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSYSAPITAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEField> unionkeyvaluepsappdefields = null;
	public java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEField> getUnionKeyValuePSAppDEFields(){
		if(this.unionkeyvaluepsappdefields == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNIONKEYVALUEPSAPPDEFIELDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEField> list = new java.util.ArrayList<net.ibizsys.model.app.dataentity.IPSAppDEField>();
			for(int i = 0;i<arrayNode.size();i++) {
				list.add(this.getPSAppDEField((com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i), false));
			}
			this.unionkeyvaluepsappdefields = list;
		}
		return (this.unionkeyvaluepsappdefields.size() == 0)? null : this.unionkeyvaluepsappdefields;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getUnionKeyValuePSAppDEField(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEField.class, this.getUnionKeyValuePSAppDEFields(), objKey, bTryMode);
	}
	
	public void setUnionKeyValuePSAppDEFields(java.util.List<net.ibizsys.model.app.dataentity.IPSAppDEField> list){
		this.unionkeyvaluepsappdefields = list;
	}

	public boolean isDefaultMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDEFAULTMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableDEMainState(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEDEMAINSTATE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableFilterActions(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEFILTERACTIONS);
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

	public boolean isEnableUICreate(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEUICREATE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableUIModify(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEUIMODIFY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableUIRemove(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEUIREMOVE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableWFActions(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEWFACTIONS);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isMajor(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISMAJOR);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
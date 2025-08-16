package net.ibizsys.model.dataentity.ds;



public class PSDEDataSetImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.ds.IPSDEDataSet
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETACTIONHOLDER = "actionHolder";
	public final static String ATTR_GETACTIVEDATAPSDELOGIC = "getActiveDataPSDELogic";
	public final static String ATTR_GETCACHESCOPE = "cacheScope";
	public final static String ATTR_GETCACHETIMEOUT = "cacheTimeout";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCUSTOMDRMODE = "customDRMode";
	public final static String ATTR_GETCUSTOMDRMODE2 = "customDRMode2";
	public final static String ATTR_GETCUSTOMDRMODE2PARAM = "customDRMode2Param";
	public final static String ATTR_GETCUSTOMDRMODEPARAM = "customDRModeParam";
	public final static String ATTR_GETDATASETOPTION = "dataSetOption";
	public final static String ATTR_GETDATASETPARAMS = "dataSetParams";
	public final static String ATTR_GETDATASETTAG = "dataSetTag";
	public final static String ATTR_GETDATASETTAG2 = "dataSetTag2";
	public final static String ATTR_GETDATASETTAG3 = "dataSetTag3";
	public final static String ATTR_GETDATASETTAG4 = "dataSetTag4";
	public final static String ATTR_GETDATASETTYPE = "dataSetType";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETEXTENDMODE = "extendMode";
	public final static String ATTR_GETGROUPMODE = "groupMode";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETMAJORSORTDIR = "majorSortDir";
	public final static String ATTR_GETMAJORSORTPSDEFIELD = "getMajorSortPSDEField";
	public final static String ATTR_GETMAXROWCOUNT = "maxRowCount";
	public final static String ATTR_GETMINORSORTDIR = "minorSortDir";
	public final static String ATTR_GETMINORSORTPSDEFIELD = "getMinorSortPSDEField";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETORGDR = "orgDR";
	public final static String ATTR_GETPOTIME = "pOTime";
	public final static String ATTR_GETPSCODELIST = "getPSCodeList";
	public final static String ATTR_GETPSDEDATAQUERIES = "getPSDEDataQueries";
	public final static String ATTR_GETPSDEDATASETGROUPPARAMS = "getPSDEDataSetGroupParams";
	public final static String ATTR_GETPSDEDATASETINPUT = "getPSDEDataSetInput";
	public final static String ATTR_GETPSDEDATASETPARAMS = "getPSDEDataSetParams";
	public final static String ATTR_GETPSDEDATASETRETURN = "getPSDEDataSetReturn";
	public final static String ATTR_GETPSDEFGROUP = "getPSDEFGroup";
	public final static String ATTR_GETPSDELOGIC = "getPSDELogic";
	public final static String ATTR_GETPSDEOPPRIV = "getPSDEOPPriv";
	public final static String ATTR_GETPSDERAGGDATA = "getPSDERAggData";
	public final static String ATTR_GETPSSUBSYSSERVICEAPIDEMETHOD = "getPSSubSysServiceAPIDEMethod";
	public final static String ATTR_GETPSSYSPFPLUGIN = "getPSSysPFPlugin";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSUNISTATE = "getPSSysUniState";
	public final static String ATTR_GETPSSYSUSERDR = "getPSSysUserDR";
	public final static String ATTR_GETPSSYSUSERDR2 = "getPSSysUserDR2";
	public final static String ATTR_GETPAGESIZE = "pageSize";
	public final static String ATTR_GETPARAMMODE = "paramMode";
	public final static String ATTR_GETPREDEFINEDTYPE = "predefinedType";
	public final static String ATTR_GETREQUESTMETHOD = "requestMethod";
	public final static String ATTR_GETREQUESTPATH = "requestPath";
	public final static String ATTR_GETSCRIPTCODE = "scriptCode";
	public final static String ATTR_GETSECBC = "secBC";
	public final static String ATTR_GETSECDR = "secDR";
	public final static String ATTR_GETUNIONMODE = "unionMode";
	public final static String ATTR_GETUSERDRACTION = "userDRAction";
	public final static String ATTR_GETVIEWLEVEL = "viewLevel";
	public final static String ATTR_ISCUSTOMPARAM = "customParam";
	public final static String ATTR_ISDEFAULTMODE = "defaultMode";
	public final static String ATTR_ISENABLEAUDIT = "enableAudit";
	public final static String ATTR_ISENABLEBACKEND = "enableBackend";
	public final static String ATTR_ISENABLECACHE = "enableCache";
	public final static String ATTR_ISENABLEFRONT = "enableFront";
	public final static String ATTR_ISENABLEGROUP = "enableGroup";
	public final static String ATTR_ISENABLEORGDR = "enableOrgDR";
	public final static String ATTR_ISENABLESECBC = "enableSecBC";
	public final static String ATTR_ISENABLESECDR = "enableSecDR";
	public final static String ATTR_ISENABLETEMPDATA = "enableTempData";
	public final static String ATTR_ISENABLEUSERDR = "enableUserDR";
	public final static String ATTR_ISVALID = "valid";

	public int getActionHolder(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONHOLDER);
		if(value == null){
			return 3;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.logic.IPSDELogic activedatapsdelogic;

	public net.ibizsys.model.dataentity.logic.IPSDELogic getActiveDataPSDELogic(){
		if(this.activedatapsdelogic != null) return this.activedatapsdelogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIVEDATAPSDELOGIC);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.activedatapsdelogic = ipsdataentity.getPSDELogic(value, false);
		return this.activedatapsdelogic;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogic getActiveDataPSDELogicMust(){
		net.ibizsys.model.dataentity.logic.IPSDELogic value = this.getActiveDataPSDELogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定当前数据转换逻辑");}
		return value;
	}

	public void setActiveDataPSDELogic(net.ibizsys.model.dataentity.logic.IPSDELogic activedatapsdelogic){
		this.activedatapsdelogic = activedatapsdelogic;
	}


	public java.lang.String getCacheScope(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCACHESCOPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getCacheTimeout(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCACHETIMEOUT);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getCustomDRMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCUSTOMDRMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getCustomDRMode2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCUSTOMDRMODE2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCustomDRMode2Param(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCUSTOMDRMODE2PARAM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCustomDRModeParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCUSTOMDRMODEPARAM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getDataSetOption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATASETOPTION);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getDataSetParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATASETPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getDataSetTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATASETTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDataSetTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATASETTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDataSetTag3(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATASETTAG3);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDataSetTag4(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATASETTAG4);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDataSetType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATASETTYPE);
		if(value == null){
			return "DATAQUERY";
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

	public int getExtendMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXTENDMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getGroupMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getLogicName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMajorSortDir(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAJORSORTDIR);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField majorsortpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getMajorSortPSDEField(){
		if(this.majorsortpsdefield != null) return this.majorsortpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAJORSORTPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.majorsortpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.majorsortpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getMajorSortPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getMajorSortPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定默认主排序属性");}
		return value;
	}

	public void setMajorSortPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField majorsortpsdefield){
		this.majorsortpsdefield = majorsortpsdefield;
	}


	public int getMaxRowCount(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAXROWCOUNT);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public java.lang.String getMinorSortDir(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINORSORTDIR);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField minorsortpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getMinorSortPSDEField(){
		if(this.minorsortpsdefield != null) return this.minorsortpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINORSORTPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.minorsortpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.minorsortpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getMinorSortPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getMinorSortPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定默认从排序属性");}
		return value;
	}

	public void setMinorSortPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField minorsortpsdefield){
		this.minorsortpsdefield = minorsortpsdefield;
	}


	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 99999;
		}
		return value.asInt();
	}

	public long getOrgDR(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORGDR);
		if(value == null){
			return 0;
		}
		return value.asLong();
	}

	public int getPOTime(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPOTIME);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}
	private net.ibizsys.model.codelist.IPSCodeList pscodelist;

	public net.ibizsys.model.codelist.IPSCodeList getPSCodeList(){
		if(this.pscodelist != null) return this.pscodelist;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCODELIST);
		if(value == null){
			return null;
		}
		this.pscodelist = getPSModelObject(net.ibizsys.model.codelist.IPSCodeList.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSCODELIST);
		return this.pscodelist;
	}

	public net.ibizsys.model.codelist.IPSCodeList getPSCodeListMust(){
		net.ibizsys.model.codelist.IPSCodeList value = this.getPSCodeList();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定代码表对象");}
		return value;
	}

	public void setPSCodeList(net.ibizsys.model.codelist.IPSCodeList pscodelist){
		this.pscodelist = pscodelist;
	}


	private java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataQuery> psdedataqueries = null;
	public java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataQuery> getPSDEDataQueries(){
		if(this.psdedataqueries == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATAQUERIES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataQuery> list = new java.util.ArrayList<net.ibizsys.model.dataentity.ds.IPSDEDataQuery>();
			net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
			for(int i = 0;i<arrayNode.size();i++) {
				list.add(ipsdataentity.getPSDEDataQuery((com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i), false));
			}
			this.psdedataqueries = list;
		}
		return (this.psdedataqueries.size() == 0)? null : this.psdedataqueries;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataQuery getPSDEDataQuery(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDataQuery.class, this.getPSDEDataQueries(), objKey, bTryMode);
	}
	public void setPSDEDataQueries(java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataQuery> list){
		this.psdedataqueries = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataSetGroupParam> psdedatasetgroupparams = null;
	public java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataSetGroupParam> getPSDEDataSetGroupParams(){
		if(this.psdedatasetgroupparams == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATASETGROUPPARAMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataSetGroupParam> list = new java.util.ArrayList<net.ibizsys.model.dataentity.ds.IPSDEDataSetGroupParam>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.ds.IPSDEDataSetGroupParam obj = this.getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDataSetGroupParam.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEDATASETGROUPPARAMS);
				if(obj!=null)list.add(obj);
			}
			this.psdedatasetgroupparams = list;
		}
		return (this.psdedatasetgroupparams.size() == 0)? null : this.psdedatasetgroupparams;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSetGroupParam getPSDEDataSetGroupParam(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDataSetGroupParam.class, this.getPSDEDataSetGroupParams(), objKey, bTryMode);
	}
	public void setPSDEDataSetGroupParams(java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataSetGroupParam> list){
		this.psdedatasetgroupparams = list;
	}
	private net.ibizsys.model.dataentity.ds.IPSDEDataSetInput psdedatasetinput;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSetInput getPSDEDataSetInput(){
		if(this.psdedatasetinput != null) return this.psdedatasetinput;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATASETINPUT);
		if(value == null){
			return null;
		}
		this.psdedatasetinput = getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDataSetInput.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDEDATASETINPUT);
		return this.psdedatasetinput;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSetInput getPSDEDataSetInputMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSetInput value = this.getPSDEDataSetInput();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定调用输入对象");}
		return value;
	}

	public void setPSDEDataSetInput(net.ibizsys.model.dataentity.ds.IPSDEDataSetInput psdedatasetinput){
		this.psdedatasetinput = psdedatasetinput;
	}


	private java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataSetParam> psdedatasetparams = null;
	public java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataSetParam> getPSDEDataSetParams(){
		if(this.psdedatasetparams == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATASETPARAMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataSetParam> list = new java.util.ArrayList<net.ibizsys.model.dataentity.ds.IPSDEDataSetParam>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.ds.IPSDEDataSetParam obj = this.getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDataSetParam.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEDATASETPARAMS);
				if(obj!=null)list.add(obj);
			}
			this.psdedatasetparams = list;
		}
		return (this.psdedatasetparams.size() == 0)? null : this.psdedatasetparams;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSetParam getPSDEDataSetParam(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDataSetParam.class, this.getPSDEDataSetParams(), objKey, bTryMode);
	}
	public void setPSDEDataSetParams(java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDataSetParam> list){
		this.psdedatasetparams = list;
	}
	private net.ibizsys.model.dataentity.ds.IPSDEDataSetReturn psdedatasetreturn;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSetReturn getPSDEDataSetReturn(){
		if(this.psdedatasetreturn != null) return this.psdedatasetreturn;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATASETRETURN);
		if(value == null){
			return null;
		}
		this.psdedatasetreturn = getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDataSetReturn.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDEDATASETRETURN);
		return this.psdedatasetreturn;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSetReturn getPSDEDataSetReturnMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSetReturn value = this.getPSDEDataSetReturn();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定调用返回对象");}
		return value;
	}

	public void setPSDEDataSetReturn(net.ibizsys.model.dataentity.ds.IPSDEDataSetReturn psdedatasetreturn){
		this.psdedatasetreturn = psdedatasetreturn;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEFGroup psdefgroup;

	public net.ibizsys.model.dataentity.defield.IPSDEFGroup getPSDEFGroup(){
		if(this.psdefgroup != null) return this.psdefgroup;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFGROUP);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdefgroup = ipsdataentity.getPSDEFGroup(value, false);
		return this.psdefgroup;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEFGroup getPSDEFGroupMust(){
		net.ibizsys.model.dataentity.defield.IPSDEFGroup value = this.getPSDEFGroup();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定属性组对象");}
		return value;
	}

	public void setPSDEFGroup(net.ibizsys.model.dataentity.defield.IPSDEFGroup psdefgroup){
		this.psdefgroup = psdefgroup;
	}

	private net.ibizsys.model.dataentity.logic.IPSDELogic psdelogic;

	public net.ibizsys.model.dataentity.logic.IPSDELogic getPSDELogic(){
		if(this.psdelogic != null) return this.psdelogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDELOGIC);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdelogic = ipsdataentity.getPSDELogic(value, false);
		return this.psdelogic;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogic getPSDELogicMust(){
		net.ibizsys.model.dataentity.logic.IPSDELogic value = this.getPSDELogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体处理逻辑");}
		return value;
	}

	public void setPSDELogic(net.ibizsys.model.dataentity.logic.IPSDELogic psdelogic){
		this.psdelogic = psdelogic;
	}

	private net.ibizsys.model.dataentity.priv.IPSDEOPPriv psdeoppriv;

	public net.ibizsys.model.dataentity.priv.IPSDEOPPriv getPSDEOPPriv(){
		if(this.psdeoppriv != null) return this.psdeoppriv;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEOPPRIV);
		if(value == null){
			return null;
		}
		this.psdeoppriv = getPSModelObject(net.ibizsys.model.dataentity.priv.IPSDEOPPriv.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDEOPPRIV);
		return this.psdeoppriv;
	}

	public net.ibizsys.model.dataentity.priv.IPSDEOPPriv getPSDEOPPrivMust(){
		net.ibizsys.model.dataentity.priv.IPSDEOPPriv value = this.getPSDEOPPriv();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定服务访问操作标识");}
		return value;
	}

	public void setPSDEOPPriv(net.ibizsys.model.dataentity.priv.IPSDEOPPriv psdeoppriv){
		this.psdeoppriv = psdeoppriv;
	}

	private net.ibizsys.model.dataentity.der.IPSDERAggData psderaggdata;

	public net.ibizsys.model.dataentity.der.IPSDERAggData getPSDERAggData(){
		if(this.psderaggdata != null) return this.psderaggdata;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDERAGGDATA);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psderaggdata = (net.ibizsys.model.dataentity.der.IPSDERAggData)ipsdataentity.getMajorPSDERBase(value, false);
		return this.psderaggdata;
	}

	public net.ibizsys.model.dataentity.der.IPSDERAggData getPSDERAggDataMust(){
		net.ibizsys.model.dataentity.der.IPSDERAggData value = this.getPSDERAggData();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定聚合数据关系");}
		return value;
	}

	public void setPSDERAggData(net.ibizsys.model.dataentity.der.IPSDERAggData psderaggdata){
		this.psderaggdata = psderaggdata;
	}

	private net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod pssubsysserviceapidemethod;

	public net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod getPSSubSysServiceAPIDEMethod(){
		if(this.pssubsysserviceapidemethod != null) return this.pssubsysserviceapidemethod;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSUBSYSSERVICEAPIDEMETHOD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.pssubsysserviceapidemethod = ipsdataentity.getPSSubSysServiceAPIDEMust().getPSSubSysServiceAPIDEMethod(value, false);
		return this.pssubsysserviceapidemethod;
	}

	public net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod getPSSubSysServiceAPIDEMethodMust(){
		net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod value = this.getPSSubSysServiceAPIDEMethod();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定子系统实体接口方法");}
		return value;
	}

	public void setPSSubSysServiceAPIDEMethod(net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod pssubsysserviceapidemethod){
		this.pssubsysserviceapidemethod = pssubsysserviceapidemethod;
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

	private net.ibizsys.model.res.IPSSysUniState pssysunistate;

	public net.ibizsys.model.res.IPSSysUniState getPSSysUniState(){
		if(this.pssysunistate != null) return this.pssysunistate;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSUNISTATE);
		if(value == null){
			return null;
		}
		this.pssysunistate = getPSModelObject(net.ibizsys.model.res.IPSSysUniState.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSUNISTATE);
		return this.pssysunistate;
	}

	public net.ibizsys.model.res.IPSSysUniState getPSSysUniStateMust(){
		net.ibizsys.model.res.IPSSysUniState value = this.getPSSysUniState();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定缓存统一状态对象");}
		return value;
	}

	public void setPSSysUniState(net.ibizsys.model.res.IPSSysUniState pssysunistate){
		this.pssysunistate = pssysunistate;
	}

	private net.ibizsys.model.security.IPSSysUserDR pssysuserdr;

	public net.ibizsys.model.security.IPSSysUserDR getPSSysUserDR(){
		if(this.pssysuserdr != null) return this.pssysuserdr;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSUSERDR);
		if(value == null){
			return null;
		}
		this.pssysuserdr = getPSModelObject(net.ibizsys.model.security.IPSSysUserDR.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSUSERDR);
		return this.pssysuserdr;
	}

	public net.ibizsys.model.security.IPSSysUserDR getPSSysUserDRMust(){
		net.ibizsys.model.security.IPSSysUserDR value = this.getPSSysUserDR();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定用户数据范围对象");}
		return value;
	}

	public void setPSSysUserDR(net.ibizsys.model.security.IPSSysUserDR pssysuserdr){
		this.pssysuserdr = pssysuserdr;
	}

	private net.ibizsys.model.security.IPSSysUserDR pssysuserdr2;

	public net.ibizsys.model.security.IPSSysUserDR getPSSysUserDR2(){
		if(this.pssysuserdr2 != null) return this.pssysuserdr2;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSUSERDR2);
		if(value == null){
			return null;
		}
		this.pssysuserdr2 = getPSModelObject(net.ibizsys.model.security.IPSSysUserDR.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSUSERDR2);
		return this.pssysuserdr2;
	}

	public net.ibizsys.model.security.IPSSysUserDR getPSSysUserDR2Must(){
		net.ibizsys.model.security.IPSSysUserDR value = this.getPSSysUserDR2();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定用户数据范围对象2");}
		return value;
	}

	public void setPSSysUserDR2(net.ibizsys.model.security.IPSSysUserDR pssysuserdr2){
		this.pssysuserdr2 = pssysuserdr2;
	}


	public int getPageSize(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPAGESIZE);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public int getParamMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAMMODE);
		if(value == null){
			return 1;
		}
		return value.asInt();
	}

	public java.lang.String getPredefinedType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPREDEFINEDTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getRequestMethod(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREQUESTMETHOD);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getRequestPath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREQUESTPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getScriptCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSCRIPTCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSecBC(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSECBC);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public long getSecDR(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSECDR);
		if(value == null){
			return 0;
		}
		return value.asLong();
	}

	public java.lang.String getUnionMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNIONMODE);
		if(value == null){
			return "UNION";
		}
		return value.asText();
	}

	public java.lang.String getUserDRAction(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERDRACTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getViewLevel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVIEWLEVEL);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public boolean isCustomParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCUSTOMPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isDefaultMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDEFAULTMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableAudit(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEAUDIT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableBackend(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEBACKEND);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableCache(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLECACHE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableFront(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEFRONT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableGroup(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEGROUP);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableOrgDR(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEORGDR);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableSecBC(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLESECBC);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableSecDR(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLESECDR);
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

	public boolean isEnableUserDR(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEUSERDR);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isValid(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISVALID);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}
}
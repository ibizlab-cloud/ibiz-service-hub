package net.ibizsys.model.dataentity.defield;



public class PSDEFieldImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.defield.IPSDEField
		,net.ibizsys.model.dataentity.IPSDataEntityObject{

	public final static String ATTR_GETALLPSDEFDTCOLUMNS = "getAllPSDEFDTColumns";
	public final static String ATTR_GETALLPSDEFSEARCHMODES = "getAllPSDEFSearchModes";
	public final static String ATTR_GETALLPSDEFUIMODES = "getAllPSDEFUIModes";
	public final static String ATTR_GETALLPSDEFVALUERULES = "getAllPSDEFValueRules";
	public final static String ATTR_GETAUDITINFOFORMAT = "auditInfoFormat";
	public final static String ATTR_GETBIZTAG = "bizTag";
	public final static String ATTR_GETCHECKPSDEFLOGIC = "getCheckPSDEFLogic";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCOMPUTEEXPRESSION = "computeExpression";
	public final static String ATTR_GETCOMPUTEPSDEFLOGIC = "getComputePSDEFLogic";
	public final static String ATTR_GETDBVALUEINSERTMODE = "dBValueInsertMode";
	public final static String ATTR_GETDBVALUEUPDATEMODE = "dBValueUpdateMode";
	public final static String ATTR_GETDEFTYPE = "dEFType";
	public final static String ATTR_GETDEMSFIELDMODE = "dEMSFieldMode";
	public final static String ATTR_GETDATATYPE = "dataType";
	public final static String ATTR_GETDEFAULTPSDEFSEARCHMODE = "getDefaultPSDEFSearchMode";
	public final static String ATTR_GETDEFAULTVALUE = "defaultValue";
	public final static String ATTR_GETDEFAULTVALUEPSDEFLOGIC = "getDefaultValuePSDEFLogic";
	public final static String ATTR_GETDEFAULTVALUETYPE = "defaultValueType";
	public final static String ATTR_GETDUPCHECKMODE = "dupCheckMode";
	public final static String ATTR_GETDUPCHECKPSDEFIELDS = "getDupCheckPSDEFields";
	public final static String ATTR_GETDUPCHECKVALUES = "dupCheckValues";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETEXTENDMODE = "extendMode";
	public final static String ATTR_GETFIELDTAG = "fieldTag";
	public final static String ATTR_GETFIELDTAG2 = "fieldTag2";
	public final static String ATTR_GETIMPORTORDER = "importOrder";
	public final static String ATTR_GETIMPORTTAG = "importTag";
	public final static String ATTR_GETINLINEPSCODELIST = "getInlinePSCodeList";
	public final static String ATTR_GETJSONFORMAT = "jsonFormat";
	public final static String ATTR_GETLNPSLANGUAGERES = "getLNPSLanguageRes";
	public final static String ATTR_GETLENGTH = "length";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETMAXVALUESTRING = "maxValueString";
	public final static String ATTR_GETMEMO = "memo";
	public final static String ATTR_GETMINSTRINGLENGTH = "minStringLength";
	public final static String ATTR_GETMINVALUESTRING = "minValueString";
	public final static String ATTR_GETNULLVALUEORDERMODE = "nullValueOrderMode";
	public final static String ATTR_GETONCHANGEPSDEFLOGIC = "getOnChangePSDEFLogic";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSCODELIST = "getPSCodeList";
	public final static String ATTR_GETPSDEDBTABLE = "getPSDEDBTable";
	public final static String ATTR_GETPSSYSDBCOLUMN = "getPSSysDBColumn";
	public final static String ATTR_GETPSSYSSEQUENCE = "getPSSysSequence";
	public final static String ATTR_GETPSSYSTRANSLATOR = "getPSSysTranslator";
	public final static String ATTR_GETPRECISION = "precision";
	public final static String ATTR_GETPREDEFINEDTYPE = "predefinedType";
	public final static String ATTR_GETPREDEFINEDTYPEPARAM = "predefinedTypeParam";
	public final static String ATTR_GETQUERYOPTION = "queryOption";
	public final static String ATTR_GETSCALE = "scale";
	public final static String ATTR_GETSEQUENCEMODE = "sequenceMode";
	public final static String ATTR_GETSERVICECODENAME = "serviceCodeName";
	public final static String ATTR_GETSTDDATATYPE = "stdDataType";
	public final static String ATTR_GETSTRINGCASE = "stringCase";
	public final static String ATTR_GETSTRINGLENGTH = "stringLength";
	public final static String ATTR_GETTRANSLATORMODE = "translatorMode";
	public final static String ATTR_GETUNIONKEYVALUE = "unionKeyValue";
	public final static String ATTR_GETUSER2PSDEFLOGIC = "getUser2PSDEFLogic";
	public final static String ATTR_GETUSER3PSDEFLOGIC = "getUser3PSDEFLogic";
	public final static String ATTR_GETUSER4PSDEFLOGIC = "getUser4PSDEFLogic";
	public final static String ATTR_GETUSERPSDEFLOGIC = "getUserPSDEFLogic";
	public final static String ATTR_GETVALUEFORMAT = "valueFormat";
	public final static String ATTR_GETVALUEPSDEFIELD = "getValuePSDEField";
	public final static String ATTR_GETVIEWLEVEL = "viewLevel";
	public final static String ATTR_ISALLOWEMPTY = "allowEmpty";
	public final static String ATTR_ISCHECKRECURSION = "checkRecursion";
	public final static String ATTR_ISDATATYPEDEFIELD = "dataTypeDEField";
	public final static String ATTR_ISDYNASTORAGEDEFIELD = "dynaStorageDEField";
	public final static String ATTR_ISENABLEAUDIT = "enableAudit";
	public final static String ATTR_ISENABLECREATE = "enableCreate";
	public final static String ATTR_ISENABLEDBAUTOVALUE = "enableDBAutoValue";
	public final static String ATTR_ISENABLEMODIFY = "enableModify";
	public final static String ATTR_ISENABLEPRIVILEGE = "enablePrivilege";
	public final static String ATTR_ISENABLEQUICKSEARCH = "enableQuickSearch";
	public final static String ATTR_ISENABLEUICREATE = "enableUICreate";
	public final static String ATTR_ISENABLEUIMODIFY = "enableUIModify";
	public final static String ATTR_ISFORMULADEFIELD = "formulaDEField";
	public final static String ATTR_ISINDEXTYPEDEFIELD = "indexTypeDEField";
	public final static String ATTR_ISINHERITDEFIELD = "inheritDEField";
	public final static String ATTR_ISKEYDEFIELD = "keyDEField";
	public final static String ATTR_ISKEYNAMEDEFIELD = "keyNameDEField";
	public final static String ATTR_ISLINKDEFIELD = "linkDEField";
	public final static String ATTR_ISMAJORDEFIELD = "majorDEField";
	public final static String ATTR_ISMULTIFORMDEFIELD = "multiFormDEField";
	public final static String ATTR_ISPASTERESET = "pasteReset";
	public final static String ATTR_ISPHISICALDEFIELD = "phisicalDEField";
	public final static String ATTR_ISQUERYCOLUMN = "queryColumn";
	public final static String ATTR_ISSYSTEMRESERVER = "systemReserver";
	public final static String ATTR_ISUIASSISTDEFIELD = "uIAssistDEField";
	public final static String ATTR_ISUNITAGFIELD = "uniTagField";
	
	private String lowerCaseName = null;
	public String getLowerCaseName(){
		if(this.lowerCaseName == null){
			this.lowerCaseName = this.getName().toLowerCase();
		}
		return this.lowerCaseName;
	}

	private java.util.List<net.ibizsys.model.database.IPSDEFDTColumn> allpsdefdtcolumns = null;
	public java.util.List<net.ibizsys.model.database.IPSDEFDTColumn> getAllPSDEFDTColumns(){
		if(this.allpsdefdtcolumns == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEFDTCOLUMNS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.database.IPSDEFDTColumn> list = new java.util.ArrayList<net.ibizsys.model.database.IPSDEFDTColumn>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.database.IPSDEFDTColumn obj = this.getPSModelObject(net.ibizsys.model.database.IPSDEFDTColumn.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEFDTCOLUMNS);
				if(obj!=null)list.add(obj);
			}
			this.allpsdefdtcolumns = list;
		}
		return (this.allpsdefdtcolumns.size() == 0)? null : this.allpsdefdtcolumns;
	}

	public net.ibizsys.model.database.IPSDEFDTColumn getPSDEFDTColumn(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.database.IPSDEFDTColumn.class, this.getAllPSDEFDTColumns(), objKey, bTryMode);
	}
	public void setPSDEFDTColumns(java.util.List<net.ibizsys.model.database.IPSDEFDTColumn> list){
		this.allpsdefdtcolumns = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.defield.IPSDEFSearchMode> allpsdefsearchmodes = null;
	public java.util.List<net.ibizsys.model.dataentity.defield.IPSDEFSearchMode> getAllPSDEFSearchModes(){
		if(this.allpsdefsearchmodes == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEFSEARCHMODES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.defield.IPSDEFSearchMode> list = new java.util.ArrayList<net.ibizsys.model.dataentity.defield.IPSDEFSearchMode>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.defield.IPSDEFSearchMode obj = this.getPSModelObject(net.ibizsys.model.dataentity.defield.IPSDEFSearchMode.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEFSEARCHMODES);
				if(obj!=null)list.add(obj);
			}
			this.allpsdefsearchmodes = list;
		}
		return (this.allpsdefsearchmodes.size() == 0)? null : this.allpsdefsearchmodes;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEFSearchMode getPSDEFSearchMode(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.defield.IPSDEFSearchMode.class, this.getAllPSDEFSearchModes(), objKey, bTryMode);
	}
	public void setPSDEFSearchModes(java.util.List<net.ibizsys.model.dataentity.defield.IPSDEFSearchMode> list){
		this.allpsdefsearchmodes = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.defield.IPSDEFUIMode> allpsdefuimodes = null;
	public java.util.List<net.ibizsys.model.dataentity.defield.IPSDEFUIMode> getAllPSDEFUIModes(){
		if(this.allpsdefuimodes == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEFUIMODES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.defield.IPSDEFUIMode> list = new java.util.ArrayList<net.ibizsys.model.dataentity.defield.IPSDEFUIMode>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.defield.IPSDEFUIMode obj = this.getPSModelObject(net.ibizsys.model.dataentity.defield.IPSDEFUIMode.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEFUIMODES);
				if(obj!=null)list.add(obj);
			}
			this.allpsdefuimodes = list;
		}
		return (this.allpsdefuimodes.size() == 0)? null : this.allpsdefuimodes;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEFUIMode getPSDEFUIMode(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.defield.IPSDEFUIMode.class, this.getAllPSDEFUIModes(), objKey, bTryMode);
	}
	public void setPSDEFUIModes(java.util.List<net.ibizsys.model.dataentity.defield.IPSDEFUIMode> list){
		this.allpsdefuimodes = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule> allpsdefvaluerules = null;
	public java.util.List<net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule> getAllPSDEFValueRules(){
		if(this.allpsdefvaluerules == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSDEFVALUERULES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule> list = new java.util.ArrayList<net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule obj = this.getPSModelObject(net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSDEFVALUERULES);
				if(obj!=null)list.add(obj);
			}
			this.allpsdefvaluerules = list;
		}
		return (this.allpsdefvaluerules.size() == 0)? null : this.allpsdefvaluerules;
	}

	public net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule getPSDEFValueRule(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule.class, this.getAllPSDEFValueRules(), objKey, bTryMode);
	}
	public void setPSDEFValueRules(java.util.List<net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule> list){
		this.allpsdefvaluerules = list;
	}

	public java.lang.String getAuditInfoFormat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAUDITINFOFORMAT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getBizTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBIZTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.logic.IPSDEFLogic checkpsdeflogic;

	public net.ibizsys.model.dataentity.logic.IPSDEFLogic getCheckPSDEFLogic(){
		if(this.checkpsdeflogic != null) return this.checkpsdeflogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCHECKPSDEFLOGIC);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.checkpsdeflogic = (net.ibizsys.model.dataentity.logic.IPSDEFLogic)ipsdataentity.getPSDELogic(value, false);
		return this.checkpsdeflogic;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEFLogic getCheckPSDEFLogicMust(){
		net.ibizsys.model.dataentity.logic.IPSDEFLogic value = this.getCheckPSDEFLogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定值检查逻辑");}
		return value;
	}

	public void setCheckPSDEFLogic(net.ibizsys.model.dataentity.logic.IPSDEFLogic checkpsdeflogic){
		this.checkpsdeflogic = checkpsdeflogic;
	}


	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getComputeExpression(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOMPUTEEXPRESSION);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.logic.IPSDEFLogic computepsdeflogic;

	public net.ibizsys.model.dataentity.logic.IPSDEFLogic getComputePSDEFLogic(){
		if(this.computepsdeflogic != null) return this.computepsdeflogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOMPUTEPSDEFLOGIC);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.computepsdeflogic = (net.ibizsys.model.dataentity.logic.IPSDEFLogic)ipsdataentity.getPSDELogic(value, false);
		return this.computepsdeflogic;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEFLogic getComputePSDEFLogicMust(){
		net.ibizsys.model.dataentity.logic.IPSDEFLogic value = this.getComputePSDEFLogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定值计算逻辑");}
		return value;
	}

	public void setComputePSDEFLogic(net.ibizsys.model.dataentity.logic.IPSDEFLogic computepsdeflogic){
		this.computepsdeflogic = computepsdeflogic;
	}


	public java.lang.String getDBValueInsertMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDBVALUEINSERTMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDBValueUpdateMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDBVALUEUPDATEMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getDEFType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFTYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getDEMSFieldMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEMSFIELDMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDataType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATATYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEFSearchMode defaultpsdefsearchmode;

	public net.ibizsys.model.dataentity.defield.IPSDEFSearchMode getDefaultPSDEFSearchMode(){
		if(this.defaultpsdefsearchmode != null) return this.defaultpsdefsearchmode;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTPSDEFSEARCHMODE);
		if(value == null){
			return null;
		}
		this.defaultpsdefsearchmode = this.getPSDEFSearchMode(value, false);
		return this.defaultpsdefsearchmode;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEFSearchMode getDefaultPSDEFSearchModeMust(){
		net.ibizsys.model.dataentity.defield.IPSDEFSearchMode value = this.getDefaultPSDEFSearchMode();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定默认属性搜索模式");}
		return value;
	}

	public void setDefaultPSDEFSearchMode(net.ibizsys.model.dataentity.defield.IPSDEFSearchMode defaultpsdefsearchmode){
		this.defaultpsdefsearchmode = defaultpsdefsearchmode;
	}


	public java.lang.String getDefaultValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.logic.IPSDEFLogic defaultvaluepsdeflogic;

	public net.ibizsys.model.dataentity.logic.IPSDEFLogic getDefaultValuePSDEFLogic(){
		if(this.defaultvaluepsdeflogic != null) return this.defaultvaluepsdeflogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTVALUEPSDEFLOGIC);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.defaultvaluepsdeflogic = (net.ibizsys.model.dataentity.logic.IPSDEFLogic)ipsdataentity.getPSDELogic(value, false);
		return this.defaultvaluepsdeflogic;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEFLogic getDefaultValuePSDEFLogicMust(){
		net.ibizsys.model.dataentity.logic.IPSDEFLogic value = this.getDefaultValuePSDEFLogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定默认值逻辑");}
		return value;
	}

	public void setDefaultValuePSDEFLogic(net.ibizsys.model.dataentity.logic.IPSDEFLogic defaultvaluepsdeflogic){
		this.defaultvaluepsdeflogic = defaultvaluepsdeflogic;
	}


	public java.lang.String getDefaultValueType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTVALUETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDupCheckMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDUPCHECKMODE);
		if(value == null){
			return "NONE";
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.dataentity.defield.IPSDEField> dupcheckpsdefields = null;
	public java.util.List<net.ibizsys.model.dataentity.defield.IPSDEField> getDupCheckPSDEFields(){
		if(this.dupcheckpsdefields == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDUPCHECKPSDEFIELDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.defield.IPSDEField> list = new java.util.ArrayList<net.ibizsys.model.dataentity.defield.IPSDEField>();
			net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
			for(int i = 0;i<arrayNode.size();i++) {
				list.add(ipsdataentity.getPSDEField((com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i), false));
			}
			this.dupcheckpsdefields = list;
		}
		return (this.dupcheckpsdefields.size() == 0)? null : this.dupcheckpsdefields;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getDupCheckPSDEField(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.defield.IPSDEField.class, this.getDupCheckPSDEFields(), objKey, bTryMode);
	}
	
	public void setDupCheckPSDEFields(java.util.List<net.ibizsys.model.dataentity.defield.IPSDEField> list){
		this.dupcheckpsdefields = list;
	}
	private java.lang.String[] dupcheckvalues = null;
	public java.lang.String[] getDupCheckValues(){
		if(this.dupcheckvalues == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDUPCHECKVALUES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.lang.String[] array = new java.lang.String[arrayNode.size()];
			for(int i = 0;i<arrayNode.size();i++) {
				array[i] = arrayNode.get(i).asText();
			}
			this.dupcheckvalues = array;
		}
		return this.dupcheckvalues;
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

	public java.lang.String getFieldTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFIELDTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getFieldTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFIELDTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getImportOrder(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETIMPORTORDER);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getImportTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETIMPORTTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.codelist.IPSCodeList inlinepscodelist;

	public net.ibizsys.model.codelist.IPSCodeList getInlinePSCodeList(){
		if(this.inlinepscodelist != null) return this.inlinepscodelist;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINLINEPSCODELIST);
		if(value == null){
			return null;
		}
		this.inlinepscodelist = getPSModelObject(net.ibizsys.model.codelist.IPSCodeList.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETINLINEPSCODELIST);
		return this.inlinepscodelist;
	}

	public net.ibizsys.model.codelist.IPSCodeList getInlinePSCodeListMust(){
		net.ibizsys.model.codelist.IPSCodeList value = this.getInlinePSCodeList();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定代码表（运行时内联）");}
		return value;
	}

	public void setInlinePSCodeList(net.ibizsys.model.codelist.IPSCodeList inlinepscodelist){
		this.inlinepscodelist = inlinepscodelist;
	}


	public java.lang.String getJsonFormat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETJSONFORMAT);
		if(value == null){
			return null;
		}
		return value.asText();
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


	public int getLength(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLENGTH);
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

	public java.lang.String getMaxValueString(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAXVALUESTRING);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getMemo(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMEMO);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getMinStringLength(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINSTRINGLENGTH);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getMinValueString(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINVALUESTRING);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getNullValueOrderMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNULLVALUEORDERMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.logic.IPSDEFLogic onchangepsdeflogic;

	public net.ibizsys.model.dataentity.logic.IPSDEFLogic getOnChangePSDEFLogic(){
		if(this.onchangepsdeflogic != null) return this.onchangepsdeflogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETONCHANGEPSDEFLOGIC);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.onchangepsdeflogic = (net.ibizsys.model.dataentity.logic.IPSDEFLogic)ipsdataentity.getPSDELogic(value, false);
		return this.onchangepsdeflogic;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEFLogic getOnChangePSDEFLogicMust(){
		net.ibizsys.model.dataentity.logic.IPSDEFLogic value = this.getOnChangePSDEFLogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定值变更逻辑");}
		return value;
	}

	public void setOnChangePSDEFLogic(net.ibizsys.model.dataentity.logic.IPSDEFLogic onchangepsdeflogic){
		this.onchangepsdeflogic = onchangepsdeflogic;
	}


	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 0;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定属性代码表");}
		return value;
	}

	public void setPSCodeList(net.ibizsys.model.codelist.IPSCodeList pscodelist){
		this.pscodelist = pscodelist;
	}

	private net.ibizsys.model.database.IPSDEDBTable psdedbtable;

	public net.ibizsys.model.database.IPSDEDBTable getPSDEDBTable(){
		if(this.psdedbtable != null) return this.psdedbtable;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDBTABLE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdedbtable = ipsdataentity.getPSDEDBTable(value, false);
		return this.psdedbtable;
	}

	public net.ibizsys.model.database.IPSDEDBTable getPSDEDBTableMust(){
		net.ibizsys.model.database.IPSDEDBTable value = this.getPSDEDBTable();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体数据表对象");}
		return value;
	}

	public void setPSDEDBTable(net.ibizsys.model.database.IPSDEDBTable psdedbtable){
		this.psdedbtable = psdedbtable;
	}

	private net.ibizsys.model.database.IPSSysDBColumn pssysdbcolumn;

	public net.ibizsys.model.database.IPSSysDBColumn getPSSysDBColumn(){
		if(this.pssysdbcolumn != null) return this.pssysdbcolumn;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSDBCOLUMN);
		if(value == null){
			return null;
		}
		this.pssysdbcolumn = this.getPSDEDBTableMust().getPSSysDBTableMust().getPSSysDBColumn(value, false);
		return this.pssysdbcolumn;
	}

	public net.ibizsys.model.database.IPSSysDBColumn getPSSysDBColumnMust(){
		net.ibizsys.model.database.IPSSysDBColumn value = this.getPSSysDBColumn();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定关系数据库列对象");}
		return value;
	}

	public void setPSSysDBColumn(net.ibizsys.model.database.IPSSysDBColumn pssysdbcolumn){
		this.pssysdbcolumn = pssysdbcolumn;
	}

	private net.ibizsys.model.res.IPSSysSequence pssyssequence;

	public net.ibizsys.model.res.IPSSysSequence getPSSysSequence(){
		if(this.pssyssequence != null) return this.pssyssequence;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSSEQUENCE);
		if(value == null){
			return null;
		}
		this.pssyssequence = getPSModelObject(net.ibizsys.model.res.IPSSysSequence.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSSEQUENCE);
		return this.pssyssequence;
	}

	public net.ibizsys.model.res.IPSSysSequence getPSSysSequenceMust(){
		net.ibizsys.model.res.IPSSysSequence value = this.getPSSysSequence();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统值序列");}
		return value;
	}

	public void setPSSysSequence(net.ibizsys.model.res.IPSSysSequence pssyssequence){
		this.pssyssequence = pssyssequence;
	}

	private net.ibizsys.model.res.IPSSysTranslator pssystranslator;

	public net.ibizsys.model.res.IPSSysTranslator getPSSysTranslator(){
		if(this.pssystranslator != null) return this.pssystranslator;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSTRANSLATOR);
		if(value == null){
			return null;
		}
		this.pssystranslator = getPSModelObject(net.ibizsys.model.res.IPSSysTranslator.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSTRANSLATOR);
		return this.pssystranslator;
	}

	public net.ibizsys.model.res.IPSSysTranslator getPSSysTranslatorMust(){
		net.ibizsys.model.res.IPSSysTranslator value = this.getPSSysTranslator();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统值转换器");}
		return value;
	}

	public void setPSSysTranslator(net.ibizsys.model.res.IPSSysTranslator pssystranslator){
		this.pssystranslator = pssystranslator;
	}


	@Deprecated
	public int getPrecision(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPRECISION);
		if(value == null){
			return 0;
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

	public java.lang.String getPredefinedTypeParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPREDEFINEDTYPEPARAM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getQueryOption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETQUERYOPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getScale(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSCALE);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public java.lang.String getSequenceMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSEQUENCEMODE);
		if(value == null){
			return "NONE";
		}
		return value.asText();
	}

	public java.lang.String getServiceCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERVICECODENAME);
		if(value == null){
			return this.getCodeName();
		}
		return value.asText();
	}

	public int getStdDataType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTDDATATYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getStringCase(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTRINGCASE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getStringLength(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTRINGLENGTH);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getTranslatorMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTRANSLATORMODE);
		if(value == null){
			return "NONE";
		}
		return value.asText();
	}

	public java.lang.String getUnionKeyValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNIONKEYVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.logic.IPSDEFLogic user2psdeflogic;

	public net.ibizsys.model.dataentity.logic.IPSDEFLogic getUser2PSDEFLogic(){
		if(this.user2psdeflogic != null) return this.user2psdeflogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSER2PSDEFLOGIC);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.user2psdeflogic = (net.ibizsys.model.dataentity.logic.IPSDEFLogic)ipsdataentity.getPSDELogic(value, false);
		return this.user2psdeflogic;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEFLogic getUser2PSDEFLogicMust(){
		net.ibizsys.model.dataentity.logic.IPSDEFLogic value = this.getUser2PSDEFLogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定用户自定义逻辑2");}
		return value;
	}

	public void setUser2PSDEFLogic(net.ibizsys.model.dataentity.logic.IPSDEFLogic user2psdeflogic){
		this.user2psdeflogic = user2psdeflogic;
	}

	private net.ibizsys.model.dataentity.logic.IPSDEFLogic user3psdeflogic;

	public net.ibizsys.model.dataentity.logic.IPSDEFLogic getUser3PSDEFLogic(){
		if(this.user3psdeflogic != null) return this.user3psdeflogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSER3PSDEFLOGIC);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.user3psdeflogic = (net.ibizsys.model.dataentity.logic.IPSDEFLogic)ipsdataentity.getPSDELogic(value, false);
		return this.user3psdeflogic;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEFLogic getUser3PSDEFLogicMust(){
		net.ibizsys.model.dataentity.logic.IPSDEFLogic value = this.getUser3PSDEFLogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定用户自定义逻辑3");}
		return value;
	}

	public void setUser3PSDEFLogic(net.ibizsys.model.dataentity.logic.IPSDEFLogic user3psdeflogic){
		this.user3psdeflogic = user3psdeflogic;
	}

	private net.ibizsys.model.dataentity.logic.IPSDEFLogic user4psdeflogic;

	public net.ibizsys.model.dataentity.logic.IPSDEFLogic getUser4PSDEFLogic(){
		if(this.user4psdeflogic != null) return this.user4psdeflogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSER4PSDEFLOGIC);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.user4psdeflogic = (net.ibizsys.model.dataentity.logic.IPSDEFLogic)ipsdataentity.getPSDELogic(value, false);
		return this.user4psdeflogic;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEFLogic getUser4PSDEFLogicMust(){
		net.ibizsys.model.dataentity.logic.IPSDEFLogic value = this.getUser4PSDEFLogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定用户自定义逻辑4");}
		return value;
	}

	public void setUser4PSDEFLogic(net.ibizsys.model.dataentity.logic.IPSDEFLogic user4psdeflogic){
		this.user4psdeflogic = user4psdeflogic;
	}

	private net.ibizsys.model.dataentity.logic.IPSDEFLogic userpsdeflogic;

	public net.ibizsys.model.dataentity.logic.IPSDEFLogic getUserPSDEFLogic(){
		if(this.userpsdeflogic != null) return this.userpsdeflogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERPSDEFLOGIC);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.userpsdeflogic = (net.ibizsys.model.dataentity.logic.IPSDEFLogic)ipsdataentity.getPSDELogic(value, false);
		return this.userpsdeflogic;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEFLogic getUserPSDEFLogicMust(){
		net.ibizsys.model.dataentity.logic.IPSDEFLogic value = this.getUserPSDEFLogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定用户自定义逻辑");}
		return value;
	}

	public void setUserPSDEFLogic(net.ibizsys.model.dataentity.logic.IPSDEFLogic userpsdeflogic){
		this.userpsdeflogic = userpsdeflogic;
	}


	public java.lang.String getValueFormat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUEFORMAT);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField valuepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getValuePSDEField(){
		if(this.valuepsdefield != null) return this.valuepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.valuepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.valuepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getValuePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getValuePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定值项属性");}
		return value;
	}

	public void setValuePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField valuepsdefield){
		this.valuepsdefield = valuepsdefield;
	}


	public int getViewLevel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVIEWLEVEL);
		if(value == null){
			return 1;
		}
		return value.asInt();
	}

	public boolean isAllowEmpty(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISALLOWEMPTY);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}

	public boolean isCheckRecursion(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCHECKRECURSION);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isDataTypeDEField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDATATYPEDEFIELD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isDynaStorageDEField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDYNASTORAGEDEFIELD);
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

	public boolean isEnableCreate(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLECREATE);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}

	public boolean isEnableDBAutoValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEDBAUTOVALUE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableModify(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEMODIFY);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}

	public boolean isEnablePrivilege(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEPRIVILEGE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableQuickSearch(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEQUICKSEARCH);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableUICreate(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEUICREATE);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}

	public boolean isEnableUIModify(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEUIMODIFY);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isFormulaDEField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISFORMULADEFIELD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isIndexTypeDEField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISINDEXTYPEDEFIELD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isInheritDEField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISINHERITDEFIELD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isKeyDEField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISKEYDEFIELD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isKeyNameDEField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISKEYNAMEDEFIELD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isLinkDEField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISLINKDEFIELD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isMajorDEField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISMAJORDEFIELD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isMultiFormDEField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISMULTIFORMDEFIELD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isPasteReset(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISPASTERESET);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isPhisicalDEField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISPHISICALDEFIELD);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}

	public boolean isQueryColumn(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISQUERYCOLUMN);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}

	public boolean isSystemReserver(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSYSTEMRESERVER);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isUIAssistDEField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISUIASSISTDEFIELD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isUniTagField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISUNITAGFIELD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
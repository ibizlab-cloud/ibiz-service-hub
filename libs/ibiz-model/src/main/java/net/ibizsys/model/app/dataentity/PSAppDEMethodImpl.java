package net.ibizsys.model.app.dataentity;



public class PSAppDEMethodImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.app.dataentity.IPSAppDEMethod
		,net.ibizsys.model.app.dataentity.IPSAppDEAction
		,net.ibizsys.model.app.dataentity.IPSAppDEDataSet{

	public final static String ATTR_GETADPSDEDQCONDITIONS = "getADPSDEDQConditions";
	public final static String ATTR_GETACTIONMODE = "actionMode";
	public final static String ATTR_GETACTIONNAME = "actionName";
	public final static String ATTR_GETACTIONTAG = "actionTag";
	public final static String ATTR_GETACTIONTYPE = "actionType";
	public final static String ATTR_GETAFTERCODE = "afterCode";
	public final static String ATTR_GETBATCHACTIONMODE = "batchActionMode";
	public final static String ATTR_GETBEFORECODE = "beforeCode";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCODENAME2 = "codeName2";
	public final static String ATTR_GETDATASETNAME = "dataSetName";
	public final static String ATTR_GETDATASETTAG = "dataSetTag";
	public final static String ATTR_GETDATASETTYPE = "dataSetType";
	public final static String ATTR_GETMETHODTYPE = "methodType";
	public final static String ATTR_GETPSAPPCODELIST = "getPSAppCodeList";
	public final static String ATTR_GETPSAPPDELOGIC = "getPSAppDELogic";
	public final static String ATTR_GETPSAPPDEMETHODINPUT = "getPSAppDEMethodInput";
	public final static String ATTR_GETPSAPPDEMETHODRETURN = "getPSAppDEMethodReturn";
	public final static String ATTR_GETPSDEACTION = "getPSDEAction";
	public final static String ATTR_GETPSDEDQGROUPCONDITIONS = "getPSDEDQGroupConditions";
	public final static String ATTR_GETPSDEDATASET = "getPSDEDataSet";
	public final static String ATTR_GETPSDEOPPRIV = "getPSDEOPPriv";
	public final static String ATTR_GETPSDESERVICEAPIMETHOD = "getPSDEServiceAPIMethod";
	public final static String ATTR_GETPSSYSPFPLUGIN = "getPSSysPFPlugin";
	public final static String ATTR_GETPREDEFINEDTYPE = "predefinedType";
	public final static String ATTR_GETREQUESTFIELD = "requestField";
	public final static String ATTR_GETREQUESTFULLPATHS = "requestFullPaths";
	public final static String ATTR_GETREQUESTMETHOD = "requestMethod";
	public final static String ATTR_GETREQUESTPARAMTYPE = "requestParamType";
	public final static String ATTR_GETREQUESTPATH = "requestPath";
	public final static String ATTR_GETSCRIPTCODE = "scriptCode";
	public final static String ATTR_GETTEMPDATAMODE = "tempDataMode";
	public final static String ATTR_ISASYNCACTION = "asyncAction";
	public final static String ATTR_ISBUILTINMETHOD = "builtinMethod";
	public final static String ATTR_ISCUSTOMCODE = "customCode";
	public final static String ATTR_ISENABLEBATCHACTION = "enableBatchAction";
	public final static String ATTR_ISENABLETESTMETHOD = "enableTestMethod";
	public final static String ATTR_ISNEEDRESOURCEKEY = "needResourceKey";
	public final static String ATTR_ISNOSERVICECODENAME = "noServiceCodeName";

	private java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQCondition> adpsdedqconditions = null;
	public java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQCondition> getADPSDEDQConditions(){
		if(this.adpsdedqconditions == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETADPSDEDQCONDITIONS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQCondition> list = new java.util.ArrayList<net.ibizsys.model.dataentity.ds.IPSDEDQCondition>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.ds.IPSDEDQCondition obj = this.getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDQCondition.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETADPSDEDQCONDITIONS);
				if(obj!=null)list.add(obj);
			}
			this.adpsdedqconditions = list;
		}
		return (this.adpsdedqconditions.size() == 0)? null : this.adpsdedqconditions;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDQCondition getADPSDEDQCondition(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDQCondition.class, this.getADPSDEDQConditions(), objKey, bTryMode);
	}
	
	public void setADPSDEDQConditions(java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQCondition> list){
		this.adpsdedqconditions = list;
	}

	public java.lang.String getActionMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getActionName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getActionTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getActionType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONTYPE);
		if(value == null){
			return "REMOTE";
		}
		return value.asText();
	}

	public java.lang.String getAfterCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAFTERCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getBatchActionMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBATCHACTIONMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getBeforeCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBEFORECODE);
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

	public java.lang.String getCodeName2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDataSetName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATASETNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDataSetTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATASETTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDataSetType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATASETTYPE);
		if(value == null){
			return "REMOTE";
		}
		return value.asText();
	}

	public java.lang.String getMethodType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMETHODTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.codelist.IPSAppCodeList psappcodelist;

	public net.ibizsys.model.app.codelist.IPSAppCodeList getPSAppCodeList(){
		if(this.psappcodelist != null) return this.psappcodelist;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPCODELIST);
		if(value == null){
			return null;
		}
		this.psappcodelist = getPSModelObject(net.ibizsys.model.app.codelist.IPSAppCodeList.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPCODELIST);
		return this.psappcodelist;
	}

	public net.ibizsys.model.app.codelist.IPSAppCodeList getPSAppCodeListMust(){
		net.ibizsys.model.app.codelist.IPSAppCodeList value = this.getPSAppCodeList();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用代码表");}
		return value;
	}

	public void setPSAppCodeList(net.ibizsys.model.app.codelist.IPSAppCodeList psappcodelist){
		this.psappcodelist = psappcodelist;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDELogic psappdelogic;

	public net.ibizsys.model.app.dataentity.IPSAppDELogic getPSAppDELogic(){
		if(this.psappdelogic != null) return this.psappdelogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDELOGIC);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = getParentPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class);
		this.psappdelogic = ipsappdataentity.getPSAppDELogic(value, false);
		return this.psappdelogic;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDELogic getPSAppDELogicMust(){
		net.ibizsys.model.app.dataentity.IPSAppDELogic value = this.getPSAppDELogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体处理逻辑");}
		return value;
	}

	public void setPSAppDELogic(net.ibizsys.model.app.dataentity.IPSAppDELogic psappdelogic){
		this.psappdelogic = psappdelogic;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEMethodInput psappdemethodinput;

	public net.ibizsys.model.app.dataentity.IPSAppDEMethodInput getPSAppDEMethodInput(){
		if(this.psappdemethodinput != null) return this.psappdemethodinput;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEMETHODINPUT);
		if(value == null){
			return null;
		}
		this.psappdemethodinput = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEMethodInput.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPDEMETHODINPUT);
		return this.psappdemethodinput;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEMethodInput getPSAppDEMethodInputMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEMethodInput value = this.getPSAppDEMethodInput();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定方法输入对象");}
		return value;
	}

	public void setPSAppDEMethodInput(net.ibizsys.model.app.dataentity.IPSAppDEMethodInput psappdemethodinput){
		this.psappdemethodinput = psappdemethodinput;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEMethodReturn psappdemethodreturn;

	public net.ibizsys.model.app.dataentity.IPSAppDEMethodReturn getPSAppDEMethodReturn(){
		if(this.psappdemethodreturn != null) return this.psappdemethodreturn;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEMETHODRETURN);
		if(value == null){
			return null;
		}
		this.psappdemethodreturn = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEMethodReturn.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPDEMETHODRETURN);
		return this.psappdemethodreturn;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEMethodReturn getPSAppDEMethodReturnMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEMethodReturn value = this.getPSAppDEMethodReturn();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定方法返回对象");}
		return value;
	}

	public void setPSAppDEMethodReturn(net.ibizsys.model.app.dataentity.IPSAppDEMethodReturn psappdemethodreturn){
		this.psappdemethodreturn = psappdemethodreturn;
	}

	private net.ibizsys.model.dataentity.action.IPSDEAction psdeaction;

	public net.ibizsys.model.dataentity.action.IPSDEAction getPSDEAction(){
		if(this.psdeaction != null) return this.psdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = getParentPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class);
		this.psdeaction = ipsappdataentity.getPSDataEntityMust().getPSDEAction(value, false);
		return this.psdeaction;
	}

	public net.ibizsys.model.dataentity.action.IPSDEAction getPSDEActionMust(){
		net.ibizsys.model.dataentity.action.IPSDEAction value = this.getPSDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体行为");}
		return value;
	}

	public void setPSDEAction(net.ibizsys.model.dataentity.action.IPSDEAction psdeaction){
		this.psdeaction = psdeaction;
	}


	private java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition> psdedqgroupconditions = null;
	public java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition> getPSDEDQGroupConditions(){
		if(this.psdedqgroupconditions == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDQGROUPCONDITIONS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition> list = new java.util.ArrayList<net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition obj = this.getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEDQGROUPCONDITIONS);
				if(obj!=null)list.add(obj);
			}
			this.psdedqgroupconditions = list;
		}
		return (this.psdedqgroupconditions.size() == 0)? null : this.psdedqgroupconditions;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition getPSDEDQGroupCondition(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition.class, this.getPSDEDQGroupConditions(), objKey, bTryMode);
	}
	public void setPSDEDQGroupConditions(java.util.List<net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition> list){
		this.psdedqgroupconditions = list;
	}
	private net.ibizsys.model.dataentity.ds.IPSDEDataSet psdedataset;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet(){
		if(this.psdedataset != null) return this.psdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATASET);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = getParentPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class);
		this.psdedataset = ipsappdataentity.getPSDataEntityMust().getPSDEDataSet(value, false);
		return this.psdedataset;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getPSDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体数据集合");}
		return value;
	}

	public void setPSDEDataSet(net.ibizsys.model.dataentity.ds.IPSDEDataSet psdedataset){
		this.psdedataset = psdedataset;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定默认操作标识");}
		return value;
	}

	public void setPSDEOPPriv(net.ibizsys.model.dataentity.priv.IPSDEOPPriv psdeoppriv){
		this.psdeoppriv = psdeoppriv;
	}

	private net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod psdeserviceapimethod;

	public net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod getPSDEServiceAPIMethod(){
		if(this.psdeserviceapimethod != null) return this.psdeserviceapimethod;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDESERVICEAPIMETHOD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = getParentPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class);
		this.psdeserviceapimethod = ipsappdataentity.getPSDEServiceAPIMust().getPSDEServiceAPIMethod(value, false);
		return this.psdeserviceapimethod;
	}

	public net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod getPSDEServiceAPIMethodMust(){
		net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod value = this.getPSDEServiceAPIMethod();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定服务接口方法");}
		return value;
	}

	public void setPSDEServiceAPIMethod(net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod psdeserviceapimethod){
		this.psdeserviceapimethod = psdeserviceapimethod;
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


	public java.lang.String getPredefinedType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPREDEFINEDTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRequestField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREQUESTFIELD);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private java.lang.String[] requestfullpaths = null;
	public java.lang.String[] getRequestFullPaths(){
		if(this.requestfullpaths == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREQUESTFULLPATHS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.lang.String[] array = new java.lang.String[arrayNode.size()];
			for(int i = 0;i<arrayNode.size();i++) {
				array[i] = arrayNode.get(i).asText();
			}
			this.requestfullpaths = array;
		}
		return this.requestfullpaths;
	}

	public java.lang.String getRequestMethod(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREQUESTMETHOD);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getRequestParamType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREQUESTPARAMTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

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

	public int getTempDataMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEMPDATAMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public boolean isAsyncAction(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISASYNCACTION);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isBuiltinMethod(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISBUILTINMETHOD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isCustomCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCUSTOMCODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableBatchAction(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEBATCHACTION);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableTestMethod(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLETESTMETHOD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isNeedResourceKey(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISNEEDRESOURCEKEY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isNoServiceCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISNOSERVICECODENAME);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
package net.ibizsys.model.dataentity.action;



public class PSDEActionImplBase extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.action.IPSDEAction
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETACTIONHOLDER = "actionHolder";
	public final static String ATTR_GETACTIONMODE = "actionMode";
	public final static String ATTR_GETACTIONPARAMS = "actionParams";
	public final static String ATTR_GETACTIONTAG = "actionTag";
	public final static String ATTR_GETACTIONTAG2 = "actionTag2";
	public final static String ATTR_GETACTIONTAG3 = "actionTag3";
	public final static String ATTR_GETACTIONTAG4 = "actionTag4";
	public final static String ATTR_GETACTIONTYPE = "actionType";
	public final static String ATTR_GETAFTERPSDEACTIONLOGICS = "getAfterPSDEActionLogics";
	public final static String ATTR_GETBATCHACTIONMODE = "batchActionMode";
	public final static String ATTR_GETBEFOREPSDEACTIONLOGICS = "getBeforePSDEActionLogics";
	public final static String ATTR_GETCACHETIMEOUT = "cacheTimeout";
	public final static String ATTR_GETCHECKPSDEACTIONLOGICS = "getCheckPSDEActionLogics";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDATAACCESSACTION = "dataAccessAction";
	public final static String ATTR_GETEXTENDMODE = "extendMode";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPOTIME = "pOTime";
	public final static String ATTR_GETPSDEACTIONINPUT = "getPSDEActionInput";
	public final static String ATTR_GETPSDEACTIONPARAMS = "getPSDEActionParams";
	public final static String ATTR_GETPSDEACTIONRETURN = "getPSDEActionReturn";
	public final static String ATTR_GETPSDEACTIONVRS = "getPSDEActionVRs";
	public final static String ATTR_GETPSDEOPPRIV = "getPSDEOPPriv";
	public final static String ATTR_GETPSSUBSYSSERVICEAPIDEMETHOD = "getPSSubSysServiceAPIDEMethod";
	public final static String ATTR_GETPSSYSPFPLUGIN = "getPSSysPFPlugin";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSTESTCASES = "getPSSysTestCases";
	public final static String ATTR_GETPSSYSUNISTATE = "getPSSysUniState";
	public final static String ATTR_GETPARAMMODE = "paramMode";
	public final static String ATTR_GETPREDEFINEDTYPE = "predefinedType";
	public final static String ATTR_GETPREDEFINEDTYPEPARAM = "predefinedTypeParam";
	public final static String ATTR_GETPREPARELASTMODE = "prepareLastMode";
	public final static String ATTR_GETPREPAREPSDEACTIONLOGICS = "getPreparePSDEActionLogics";
	public final static String ATTR_GETREALPSDEACTION = "getRealPSDEAction";
	public final static String ATTR_GETREQUESTFIELD = "requestField";
	public final static String ATTR_GETREQUESTMETHOD = "requestMethod";
	public final static String ATTR_GETREQUESTPARAMTYPE = "requestParamType";
	public final static String ATTR_GETREQUESTPATH = "requestPath";
	public final static String ATTR_GETSYNCEVENT = "syncEvent";
	public final static String ATTR_GETTEMPDATAMODE = "tempDataMode";
	public final static String ATTR_GETTESTACTIONMODE = "testActionMode";
	public final static String ATTR_GETTIMEOUT = "timeOut";
	public final static String ATTR_GETTRANSACTIONMODE = "transactionMode";
	public final static String ATTR_ISASYNCACTION = "asyncAction";
	public final static String ATTR_ISBATCHACTION = "batchAction";
	public final static String ATTR_ISBUILTINACTION = "builtinAction";
	public final static String ATTR_ISCUSTOMPARAM = "customParam";
	public final static String ATTR_ISENABLEAUDIT = "enableAudit";
	public final static String ATTR_ISENABLEBACKEND = "enableBackend";
	public final static String ATTR_ISENABLECACHE = "enableCache";
	public final static String ATTR_ISENABLEFRONT = "enableFront";
	public final static String ATTR_ISENABLETEMPDATA = "enableTempData";
	public final static String ATTR_ISPREPARELAST = "prepareLast";
	public final static String ATTR_ISVALID = "valid";

	public int getActionHolder(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONHOLDER);
		if(value == null){
			return 3;
		}
		return value.asInt();
	}

	public java.lang.String getActionMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getActionParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getActionTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getActionTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getActionTag3(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONTAG3);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getActionTag4(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONTAG4);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getActionType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionLogic> afterpsdeactionlogics = null;
	public java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionLogic> getAfterPSDEActionLogics(){
		if(this.afterpsdeactionlogics == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAFTERPSDEACTIONLOGICS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionLogic> list = new java.util.ArrayList<net.ibizsys.model.dataentity.action.IPSDEActionLogic>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.action.IPSDEActionLogic obj = this.getPSModelObject(net.ibizsys.model.dataentity.action.IPSDEActionLogic.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETAFTERPSDEACTIONLOGICS);
				if(obj!=null)list.add(obj);
			}
			this.afterpsdeactionlogics = list;
		}
		return (this.afterpsdeactionlogics.size() == 0)? null : this.afterpsdeactionlogics;
	}

	public net.ibizsys.model.dataentity.action.IPSDEActionLogic getAfterPSDEActionLogic(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.action.IPSDEActionLogic.class, this.getAfterPSDEActionLogics(), objKey, bTryMode);
	}
	
	public void setAfterPSDEActionLogics(java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionLogic> list){
		this.afterpsdeactionlogics = list;
	}

	public int getBatchActionMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBATCHACTIONMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	private java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionLogic> beforepsdeactionlogics = null;
	public java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionLogic> getBeforePSDEActionLogics(){
		if(this.beforepsdeactionlogics == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBEFOREPSDEACTIONLOGICS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionLogic> list = new java.util.ArrayList<net.ibizsys.model.dataentity.action.IPSDEActionLogic>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.action.IPSDEActionLogic obj = this.getPSModelObject(net.ibizsys.model.dataentity.action.IPSDEActionLogic.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETBEFOREPSDEACTIONLOGICS);
				if(obj!=null)list.add(obj);
			}
			this.beforepsdeactionlogics = list;
		}
		return (this.beforepsdeactionlogics.size() == 0)? null : this.beforepsdeactionlogics;
	}

	public net.ibizsys.model.dataentity.action.IPSDEActionLogic getBeforePSDEActionLogic(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.action.IPSDEActionLogic.class, this.getBeforePSDEActionLogics(), objKey, bTryMode);
	}
	
	public void setBeforePSDEActionLogics(java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionLogic> list){
		this.beforepsdeactionlogics = list;
	}

	public int getCacheTimeout(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCACHETIMEOUT);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	private java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionLogic> checkpsdeactionlogics = null;
	public java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionLogic> getCheckPSDEActionLogics(){
		if(this.checkpsdeactionlogics == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCHECKPSDEACTIONLOGICS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionLogic> list = new java.util.ArrayList<net.ibizsys.model.dataentity.action.IPSDEActionLogic>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.action.IPSDEActionLogic obj = this.getPSModelObject(net.ibizsys.model.dataentity.action.IPSDEActionLogic.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETCHECKPSDEACTIONLOGICS);
				if(obj!=null)list.add(obj);
			}
			this.checkpsdeactionlogics = list;
		}
		return (this.checkpsdeactionlogics.size() == 0)? null : this.checkpsdeactionlogics;
	}

	public net.ibizsys.model.dataentity.action.IPSDEActionLogic getCheckPSDEActionLogic(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.action.IPSDEActionLogic.class, this.getCheckPSDEActionLogics(), objKey, bTryMode);
	}
	
	public void setCheckPSDEActionLogics(java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionLogic> list){
		this.checkpsdeactionlogics = list;
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDataAccessAction(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATAACCESSACTION);
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

	public java.lang.String getLogicName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 99999;
		}
		return value.asInt();
	}

	public int getPOTime(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPOTIME);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.action.IPSDEActionInput psdeactioninput;

	public net.ibizsys.model.dataentity.action.IPSDEActionInput getPSDEActionInput(){
		if(this.psdeactioninput != null) return this.psdeactioninput;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEACTIONINPUT);
		if(value == null){
			return null;
		}
		this.psdeactioninput = getPSModelObject(net.ibizsys.model.dataentity.action.IPSDEActionInput.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDEACTIONINPUT);
		return this.psdeactioninput;
	}

	public net.ibizsys.model.dataentity.action.IPSDEActionInput getPSDEActionInputMust(){
		net.ibizsys.model.dataentity.action.IPSDEActionInput value = this.getPSDEActionInput();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定调用输入对象");}
		return value;
	}

	public void setPSDEActionInput(net.ibizsys.model.dataentity.action.IPSDEActionInput psdeactioninput){
		this.psdeactioninput = psdeactioninput;
	}


	private java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionParam> psdeactionparams = null;
	public java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionParam> getPSDEActionParams(){
		if(this.psdeactionparams == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEACTIONPARAMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionParam> list = new java.util.ArrayList<net.ibizsys.model.dataentity.action.IPSDEActionParam>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.action.IPSDEActionParam obj = this.getPSModelObject(net.ibizsys.model.dataentity.action.IPSDEActionParam.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEACTIONPARAMS);
				if(obj!=null)list.add(obj);
			}
			this.psdeactionparams = list;
		}
		return (this.psdeactionparams.size() == 0)? null : this.psdeactionparams;
	}

	public net.ibizsys.model.dataentity.action.IPSDEActionParam getPSDEActionParam(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.action.IPSDEActionParam.class, this.getPSDEActionParams(), objKey, bTryMode);
	}
	public void setPSDEActionParams(java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionParam> list){
		this.psdeactionparams = list;
	}
	private net.ibizsys.model.dataentity.action.IPSDEActionReturn psdeactionreturn;

	public net.ibizsys.model.dataentity.action.IPSDEActionReturn getPSDEActionReturn(){
		if(this.psdeactionreturn != null) return this.psdeactionreturn;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEACTIONRETURN);
		if(value == null){
			return null;
		}
		this.psdeactionreturn = getPSModelObject(net.ibizsys.model.dataentity.action.IPSDEActionReturn.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDEACTIONRETURN);
		return this.psdeactionreturn;
	}

	public net.ibizsys.model.dataentity.action.IPSDEActionReturn getPSDEActionReturnMust(){
		net.ibizsys.model.dataentity.action.IPSDEActionReturn value = this.getPSDEActionReturn();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定调用返回对象");}
		return value;
	}

	public void setPSDEActionReturn(net.ibizsys.model.dataentity.action.IPSDEActionReturn psdeactionreturn){
		this.psdeactionreturn = psdeactionreturn;
	}


	private java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionVR> psdeactionvrs = null;
	public java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionVR> getPSDEActionVRs(){
		if(this.psdeactionvrs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEACTIONVRS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionVR> list = new java.util.ArrayList<net.ibizsys.model.dataentity.action.IPSDEActionVR>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.action.IPSDEActionVR obj = this.getPSModelObject(net.ibizsys.model.dataentity.action.IPSDEActionVR.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEACTIONVRS);
				if(obj!=null)list.add(obj);
			}
			this.psdeactionvrs = list;
		}
		return (this.psdeactionvrs.size() == 0)? null : this.psdeactionvrs;
	}

	public net.ibizsys.model.dataentity.action.IPSDEActionVR getPSDEActionVR(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.action.IPSDEActionVR.class, this.getPSDEActionVRs(), objKey, bTryMode);
	}
	public void setPSDEActionVRs(java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionVR> list){
		this.psdeactionvrs = list;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体访问操作标识");}
		return value;
	}

	public void setPSDEOPPriv(net.ibizsys.model.dataentity.priv.IPSDEOPPriv psdeoppriv){
		this.psdeoppriv = psdeoppriv;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定外部服务接口方法");}
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定后台扩展插件");}
		return value;
	}

	public void setPSSysSFPlugin(net.ibizsys.model.res.IPSSysSFPlugin pssyssfplugin){
		this.pssyssfplugin = pssyssfplugin;
	}


	private java.util.List<net.ibizsys.model.testing.IPSSysTestCase> pssystestcases = null;
	public java.util.List<net.ibizsys.model.testing.IPSSysTestCase> getPSSysTestCases(){
		if(this.pssystestcases == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSTESTCASES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.testing.IPSSysTestCase> list = new java.util.ArrayList<net.ibizsys.model.testing.IPSSysTestCase>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.testing.IPSSysTestCase obj = this.getPSModelObject(net.ibizsys.model.testing.IPSSysTestCase.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSSYSTESTCASES);
				if(obj!=null)list.add(obj);
			}
			this.pssystestcases = list;
		}
		return (this.pssystestcases.size() == 0)? null : this.pssystestcases;
	}

	public net.ibizsys.model.testing.IPSSysTestCase getPSSysTestCase(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.testing.IPSSysTestCase.class, this.getPSSysTestCases(), objKey, bTryMode);
	}
	public void setPSSysTestCases(java.util.List<net.ibizsys.model.testing.IPSSysTestCase> list){
		this.pssystestcases = list;
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

	public java.lang.String getPredefinedTypeParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPREDEFINEDTYPEPARAM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getPrepareLastMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPREPARELASTMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	private java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionLogic> preparepsdeactionlogics = null;
	public java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionLogic> getPreparePSDEActionLogics(){
		if(this.preparepsdeactionlogics == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPREPAREPSDEACTIONLOGICS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionLogic> list = new java.util.ArrayList<net.ibizsys.model.dataentity.action.IPSDEActionLogic>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.action.IPSDEActionLogic obj = this.getPSModelObject(net.ibizsys.model.dataentity.action.IPSDEActionLogic.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPREPAREPSDEACTIONLOGICS);
				if(obj!=null)list.add(obj);
			}
			this.preparepsdeactionlogics = list;
		}
		return (this.preparepsdeactionlogics.size() == 0)? null : this.preparepsdeactionlogics;
	}

	public net.ibizsys.model.dataentity.action.IPSDEActionLogic getPreparePSDEActionLogic(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.action.IPSDEActionLogic.class, this.getPreparePSDEActionLogics(), objKey, bTryMode);
	}
	
	public void setPreparePSDEActionLogics(java.util.List<net.ibizsys.model.dataentity.action.IPSDEActionLogic> list){
		this.preparepsdeactionlogics = list;
	}
	private net.ibizsys.model.dataentity.action.IPSDEAction realpsdeaction;

	public net.ibizsys.model.dataentity.action.IPSDEAction getRealPSDEAction(){
		if(this.realpsdeaction != null) return this.realpsdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREALPSDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.realpsdeaction = ipsdataentity.getPSDEAction(value, false);
		return this.realpsdeaction;
	}

	public net.ibizsys.model.dataentity.action.IPSDEAction getRealPSDEActionMust(){
		net.ibizsys.model.dataentity.action.IPSDEAction value = this.getRealPSDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实际执行行为");}
		return value;
	}

	public void setRealPSDEAction(net.ibizsys.model.dataentity.action.IPSDEAction realpsdeaction){
		this.realpsdeaction = realpsdeaction;
	}


	public java.lang.String getRequestField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREQUESTFIELD);
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

	public java.lang.String getRequestParamType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREQUESTPARAMTYPE);
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

	public int getSyncEvent(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSYNCEVENT);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public int getTempDataMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEMPDATAMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getTestActionMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTESTACTIONMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getTimeOut(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTIMEOUT);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public java.lang.String getTransactionMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTRANSACTIONMODE);
		if(value == null){
			return "DEFAULT";
		}
		return value.asText();
	}

	public boolean isAsyncAction(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISASYNCACTION);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isBatchAction(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISBATCHACTION);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isBuiltinAction(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISBUILTINACTION);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isCustomParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCUSTOMPARAM);
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
			return true;
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
			return true;
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

	public boolean isPrepareLast(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISPREPARELAST);
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
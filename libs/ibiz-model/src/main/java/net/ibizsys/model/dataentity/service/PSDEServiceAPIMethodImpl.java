package net.ibizsys.model.dataentity.service;



public class PSDEServiceAPIMethodImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod{

	public final static String ATTR_GETACTIONTYPE = "actionType";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCODENAME2 = "codeName2";
	public final static String ATTR_GETDATAACCESSACTION = "dataAccessAction";
	public final static String ATTR_GETEXTENDMODE = "extendMode";
	public final static String ATTR_GETMETHODPARAM = "methodParam";
	public final static String ATTR_GETMETHODPARAM2 = "methodParam2";
	public final static String ATTR_GETMETHODTYPE = "methodType";
	public final static String ATTR_GETPSDEACTION = "getPSDEAction";
	public final static String ATTR_GETPSDEDATASET = "getPSDEDataSet";
	public final static String ATTR_GETPSDESERVICEAPIMETHODINPUT = "getPSDEServiceAPIMethodInput";
	public final static String ATTR_GETPSDESERVICEAPIMETHODRETURN = "getPSDEServiceAPIMethodReturn";
	public final static String ATTR_GETPSSUBSYSSERVICEAPIDEMETHOD = "getPSSubSysServiceAPIDEMethod";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPARENTKEYMODE = "parentKeyMode";
	public final static String ATTR_GETREQUESTFIELD = "requestField";
	public final static String ATTR_GETREQUESTMETHOD = "requestMethod";
	public final static String ATTR_GETREQUESTPARAMTYPE = "requestParamType";
	public final static String ATTR_GETREQUESTPATH = "requestPath";
	public final static String ATTR_GETRETURNVALUETYPE = "returnValueType";
	public final static String ATTR_GETTEMPDATAMODE = "tempDataMode";
	public final static String ATTR_GETUNIQUETAG = "uniqueTag";
	public final static String ATTR_ISENABLETESTMETHOD = "enableTestMethod";
	public final static String ATTR_ISNEEDRESOURCEKEY = "needResourceKey";
	public final static String ATTR_ISNOSERVICECODENAME = "noServiceCodeName";

	public java.lang.String getActionType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONTYPE);
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

	public java.lang.String getDataAccessAction(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATAACCESSACTION);
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

	public java.lang.String getMethodParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMETHODPARAM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMethodParam2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMETHODPARAM2);
		if(value == null){
			return null;
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
	private net.ibizsys.model.dataentity.action.IPSDEAction psdeaction;

	public net.ibizsys.model.dataentity.action.IPSDEAction getPSDEAction(){
		if(this.psdeaction != null) return this.psdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.service.IPSDEServiceAPI ipsdeserviceapi = getParentPSModelObject(net.ibizsys.model.dataentity.service.IPSDEServiceAPI.class);
		this.psdeaction = ipsdeserviceapi.getPSDataEntityMust().getPSDEAction(value, false);
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

	private net.ibizsys.model.dataentity.ds.IPSDEDataSet psdedataset;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet(){
		if(this.psdedataset != null) return this.psdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATASET);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.service.IPSDEServiceAPI ipsdeserviceapi = getParentPSModelObject(net.ibizsys.model.dataentity.service.IPSDEServiceAPI.class);
		this.psdedataset = ipsdeserviceapi.getPSDataEntityMust().getPSDEDataSet(value, false);
		return this.psdedataset;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getPSDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定数据集合");}
		return value;
	}

	public void setPSDEDataSet(net.ibizsys.model.dataentity.ds.IPSDEDataSet psdedataset){
		this.psdedataset = psdedataset;
	}

	private net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethodInput psdeserviceapimethodinput;

	public net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethodInput getPSDEServiceAPIMethodInput(){
		if(this.psdeserviceapimethodinput != null) return this.psdeserviceapimethodinput;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDESERVICEAPIMETHODINPUT);
		if(value == null){
			return null;
		}
		this.psdeserviceapimethodinput = getPSModelObject(net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethodInput.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDESERVICEAPIMETHODINPUT);
		return this.psdeserviceapimethodinput;
	}

	public net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethodInput getPSDEServiceAPIMethodInputMust(){
		net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethodInput value = this.getPSDEServiceAPIMethodInput();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定方法输入对象");}
		return value;
	}

	public void setPSDEServiceAPIMethodInput(net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethodInput psdeserviceapimethodinput){
		this.psdeserviceapimethodinput = psdeserviceapimethodinput;
	}

	private net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethodReturn psdeserviceapimethodreturn;

	public net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethodReturn getPSDEServiceAPIMethodReturn(){
		if(this.psdeserviceapimethodreturn != null) return this.psdeserviceapimethodreturn;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDESERVICEAPIMETHODRETURN);
		if(value == null){
			return null;
		}
		this.psdeserviceapimethodreturn = getPSModelObject(net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethodReturn.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDESERVICEAPIMETHODRETURN);
		return this.psdeserviceapimethodreturn;
	}

	public net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethodReturn getPSDEServiceAPIMethodReturnMust(){
		net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethodReturn value = this.getPSDEServiceAPIMethodReturn();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定方法返回对象");}
		return value;
	}

	public void setPSDEServiceAPIMethodReturn(net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethodReturn psdeserviceapimethodreturn){
		this.psdeserviceapimethodreturn = psdeserviceapimethodreturn;
	}

	private net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod pssubsysserviceapidemethod;

	public net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod getPSSubSysServiceAPIDEMethod(){
		if(this.pssubsysserviceapidemethod != null) return this.pssubsysserviceapidemethod;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSUBSYSSERVICEAPIDEMETHOD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.service.IPSDEServiceAPI ipsdeserviceapi = getParentPSModelObject(net.ibizsys.model.dataentity.service.IPSDEServiceAPI.class);
		this.pssubsysserviceapidemethod = ipsdeserviceapi.getPSDataEntityMust().getPSSubSysServiceAPIDEMust().getPSSubSysServiceAPIDEMethod(value, false);
		return this.pssubsysserviceapidemethod;
	}

	public net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod getPSSubSysServiceAPIDEMethodMust(){
		net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod value = this.getPSSubSysServiceAPIDEMethod();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定重定向外部服务接口实体方法");}
		return value;
	}

	public void setPSSubSysServiceAPIDEMethod(net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod pssubsysserviceapidemethod){
		this.pssubsysserviceapidemethod = pssubsysserviceapidemethod;
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


	public java.lang.String getParentKeyMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARENTKEYMODE);
		if(value == null){
			return "DEFAULT";
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

	public java.lang.String getReturnValueType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRETURNVALUETYPE);
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

	public java.lang.String getUniqueTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNIQUETAG);
		if(value == null){
			return null;
		}
		return value.asText();
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
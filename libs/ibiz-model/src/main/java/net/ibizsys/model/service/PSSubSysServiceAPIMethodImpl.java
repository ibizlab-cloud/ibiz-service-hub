package net.ibizsys.model.service;



public class PSSubSysServiceAPIMethodImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod
		,net.ibizsys.model.service.IPSSubSysServiceAPIMethod{

	public final static String ATTR_GETACTIONTYPE = "actionType";
	public final static String ATTR_GETAFTERCODE = "afterCode";
	public final static String ATTR_GETBODYCONTENTTYPE = "bodyContentType";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCODENAME2 = "codeName2";
	public final static String ATTR_GETINPSSUBSYSSERVICEAPIDE = "getInPSSubSysServiceAPIDE";
	public final static String ATTR_GETKEYFIELD = "keyField";
	public final static String ATTR_GETMETHODPARAM = "methodParam";
	public final static String ATTR_GETMETHODPARAM2 = "methodParam2";
	public final static String ATTR_GETMETHODSCRIPTCODE = "methodScriptCode";
	public final static String ATTR_GETMETHODTAG = "methodTag";
	public final static String ATTR_GETMETHODTAG2 = "methodTag2";
	public final static String ATTR_GETMETHODTYPE = "methodType";
	public final static String ATTR_GETOUTPSSUBSYSSERVICEAPIDE = "getOutPSSubSysServiceAPIDE";
	public final static String ATTR_GETPSDECODENAME = "getPSDECodeName";
	public final static String ATTR_GETPSDELOGICNAME = "getPSDELogicName";
	public final static String ATTR_GETPSDENAME = "getPSDEName";
	public final static String ATTR_GETPSSUBSYSSERVICEAPIDE = "getPSSubSysServiceAPIDE";
	public final static String ATTR_GETPSSUBSYSSERVICEAPIMETHODINPUT = "getPSSubSysServiceAPIMethodInput";
	public final static String ATTR_GETPSSUBSYSSERVICEAPIMETHODRETURN = "getPSSubSysServiceAPIMethodReturn";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETREQUESTFIELD = "requestField";
	public final static String ATTR_GETREQUESTMETHOD = "requestMethod";
	public final static String ATTR_GETREQUESTPARAMTYPE = "requestParamType";
	public final static String ATTR_GETREQUESTPATH = "requestPath";
	public final static String ATTR_GETRETURNVALUETYPE = "returnValueType";
	public final static String ATTR_GETUNIQUETAG = "uniqueTag";
	public final static String ATTR_ISAUTOPATH = "autoPath";
	public final static String ATTR_ISNEEDRESOURCEKEY = "needResourceKey";
	public final static String ATTR_ISNOSERVICECODENAME = "noServiceCodeName";

	public java.lang.String getActionType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONTYPE);
		if(value == null){
			return null;
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

	public java.lang.String getBodyContentType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBODYCONTENTTYPE);
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
	private net.ibizsys.model.service.IPSSubSysServiceAPIDE inpssubsysserviceapide;

	public net.ibizsys.model.service.IPSSubSysServiceAPIDE getInPSSubSysServiceAPIDE(){
		if(this.inpssubsysserviceapide != null) return this.inpssubsysserviceapide;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINPSSUBSYSSERVICEAPIDE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.service.IPSSubSysServiceAPI ipssubsysserviceapi = getParentPSModelObject(net.ibizsys.model.service.IPSSubSysServiceAPI.class);
		this.inpssubsysserviceapide = ipssubsysserviceapi.getPSSubSysServiceAPIDE(value, false);
		return this.inpssubsysserviceapide;
	}

	public net.ibizsys.model.service.IPSSubSysServiceAPIDE getInPSSubSysServiceAPIDEMust(){
		net.ibizsys.model.service.IPSSubSysServiceAPIDE value = this.getInPSSubSysServiceAPIDE();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定输入对象");}
		return value;
	}


	public java.lang.String getKeyField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETKEYFIELD);
		if(value == null){
			return null;
		}
		return value.asText();
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

	public java.lang.String getMethodScriptCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMETHODSCRIPTCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMethodTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMETHODTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMethodTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMETHODTAG2);
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
	private net.ibizsys.model.service.IPSSubSysServiceAPIDE outpssubsysserviceapide;

	public net.ibizsys.model.service.IPSSubSysServiceAPIDE getOutPSSubSysServiceAPIDE(){
		if(this.outpssubsysserviceapide != null) return this.outpssubsysserviceapide;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETOUTPSSUBSYSSERVICEAPIDE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.service.IPSSubSysServiceAPI ipssubsysserviceapi = getParentPSModelObject(net.ibizsys.model.service.IPSSubSysServiceAPI.class);
		this.outpssubsysserviceapide = ipssubsysserviceapi.getPSSubSysServiceAPIDE(value, false);
		return this.outpssubsysserviceapide;
	}

	public net.ibizsys.model.service.IPSSubSysServiceAPIDE getOutPSSubSysServiceAPIDEMust(){
		net.ibizsys.model.service.IPSSubSysServiceAPIDE value = this.getOutPSSubSysServiceAPIDE();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定输出对象");}
		return value;
	}


	public java.lang.String getPSDECodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDECODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPSDELogicName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDELOGICNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPSDEName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.service.IPSSubSysServiceAPIDE pssubsysserviceapide;

	public net.ibizsys.model.service.IPSSubSysServiceAPIDE getPSSubSysServiceAPIDE(){
		if(this.pssubsysserviceapide != null) return this.pssubsysserviceapide;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSUBSYSSERVICEAPIDE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.service.IPSSubSysServiceAPI ipssubsysserviceapi = getParentPSModelObject(net.ibizsys.model.service.IPSSubSysServiceAPI.class);
		this.pssubsysserviceapide = ipssubsysserviceapi.getPSSubSysServiceAPIDE(value, false);
		return this.pssubsysserviceapide;
	}

	public net.ibizsys.model.service.IPSSubSysServiceAPIDE getPSSubSysServiceAPIDEMust(){
		net.ibizsys.model.service.IPSSubSysServiceAPIDE value = this.getPSSubSysServiceAPIDE();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定外部接口实体对象");}
		return value;
	}

	private net.ibizsys.model.service.IPSSubSysServiceAPIMethodInput pssubsysserviceapimethodinput;

	public net.ibizsys.model.service.IPSSubSysServiceAPIMethodInput getPSSubSysServiceAPIMethodInput(){
		if(this.pssubsysserviceapimethodinput != null) return this.pssubsysserviceapimethodinput;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSUBSYSSERVICEAPIMETHODINPUT);
		if(value == null){
			return null;
		}
		this.pssubsysserviceapimethodinput = getPSModelObject(net.ibizsys.model.service.IPSSubSysServiceAPIMethodInput.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSUBSYSSERVICEAPIMETHODINPUT);
		return this.pssubsysserviceapimethodinput;
	}

	public net.ibizsys.model.service.IPSSubSysServiceAPIMethodInput getPSSubSysServiceAPIMethodInputMust(){
		net.ibizsys.model.service.IPSSubSysServiceAPIMethodInput value = this.getPSSubSysServiceAPIMethodInput();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定方法输入对象");}
		return value;
	}

	private net.ibizsys.model.service.IPSSubSysServiceAPIMethodReturn pssubsysserviceapimethodreturn;

	public net.ibizsys.model.service.IPSSubSysServiceAPIMethodReturn getPSSubSysServiceAPIMethodReturn(){
		if(this.pssubsysserviceapimethodreturn != null) return this.pssubsysserviceapimethodreturn;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSUBSYSSERVICEAPIMETHODRETURN);
		if(value == null){
			return null;
		}
		this.pssubsysserviceapimethodreturn = getPSModelObject(net.ibizsys.model.service.IPSSubSysServiceAPIMethodReturn.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSUBSYSSERVICEAPIMETHODRETURN);
		return this.pssubsysserviceapimethodreturn;
	}

	public net.ibizsys.model.service.IPSSubSysServiceAPIMethodReturn getPSSubSysServiceAPIMethodReturnMust(){
		net.ibizsys.model.service.IPSSubSysServiceAPIMethodReturn value = this.getPSSubSysServiceAPIMethodReturn();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定方法返回对象");}
		return value;
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

	public java.lang.String getUniqueTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNIQUETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isAutoPath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISAUTOPATH);
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
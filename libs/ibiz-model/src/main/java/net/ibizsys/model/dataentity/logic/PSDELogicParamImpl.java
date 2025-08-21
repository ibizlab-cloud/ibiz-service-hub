package net.ibizsys.model.dataentity.logic;



public class PSDELogicParamImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.logic.IPSDELogicParam
		,net.ibizsys.model.app.dataentity.IPSAppDELogicParam{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDEFAULTVALUE = "defaultValue";
	public final static String ATTR_GETDEFAULTVALUETYPE = "defaultValueType";
	public final static String ATTR_GETFILETYPE = "fileType";
	public final static String ATTR_GETFILEURL = "fileUrl";
	public final static String ATTR_GETLOGICNAME = "logicName";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSTRANSLATOR = "getPSSysTranslator";
	public final static String ATTR_GETPARAMPSAPPDATAENTITY = "getParamPSAppDataEntity";
	public final static String ATTR_GETPARAMPSDATAENTITY = "getParamPSDataEntity";
	public final static String ATTR_GETPARAMTAG = "paramTag";
	public final static String ATTR_GETPARAMTAG2 = "paramTag2";
	public final static String ATTR_GETPARAMS = "params";
	public final static String ATTR_GETSTDDATATYPE = "stdDataType";
	public final static String ATTR_ISAPPCONTEXTPARAM = "appContextParam";
	public final static String ATTR_ISAPPGLOBALPARAM = "appGlobalParam";
	public final static String ATTR_ISCHATCOMPLETIONREQUESTPARAM = "chatCompletionRequestParam";
	public final static String ATTR_ISCHATCOMPLETIONRESULTPARAM = "chatCompletionResultParam";
	public final static String ATTR_ISCLONEPARAM = "cloneParam";
	public final static String ATTR_ISDEFAULT = "default";
	public final static String ATTR_ISENTITYLISTPARAM = "entityListParam";
	public final static String ATTR_ISENTITYMAPPARAM = "entityMapParam";
	public final static String ATTR_ISENTITYPAGEPARAM = "entityPageParam";
	public final static String ATTR_ISENTITYPARAM = "entityParam";
	public final static String ATTR_ISENVPARAM = "envParam";
	public final static String ATTR_ISFILELISTPARAM = "fileListParam";
	public final static String ATTR_ISFILEPARAM = "fileParam";
	public final static String ATTR_ISFILTERPARAM = "filterParam";
	public final static String ATTR_ISLASTPARAM = "lastParam";
	public final static String ATTR_ISLASTRETURNPARAM = "lastReturnParam";
	public final static String ATTR_ISORIGINENTITY = "originEntity";
	public final static String ATTR_ISSESSIONPARAM = "sessionParam";
	public final static String ATTR_ISSIMPLELISTPARAM = "simpleListParam";
	public final static String ATTR_ISSIMPLEPARAM = "simpleParam";
	public final static String ATTR_ISWEBCONTEXTPARAM = "webContextParam";
	public final static String ATTR_ISWEBRESPONSEPARAM = "webResponseParam";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDefaultValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDefaultValueType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTVALUETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getFileType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFILETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getFileUrl(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFILEURL);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getLogicName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICNAME);
		if(value == null){
			return null;
		}
		return value.asText();
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定值转换器对象");}
		return value;
	}

	public void setPSSysTranslator(net.ibizsys.model.res.IPSSysTranslator pssystranslator){
		this.pssystranslator = pssystranslator;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDataEntity parampsappdataentity;

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getParamPSAppDataEntity(){
		if(this.parampsappdataentity != null) return this.parampsappdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAMPSAPPDATAENTITY);
		if(value == null){
			return null;
		}
		this.parampsappdataentity = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPARAMPSAPPDATAENTITY);
		return this.parampsappdataentity;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getParamPSAppDataEntityMust(){
		net.ibizsys.model.app.dataentity.IPSAppDataEntity value = this.getParamPSAppDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定参数应用实体对象");}
		return value;
	}

	public void setParamPSAppDataEntity(net.ibizsys.model.app.dataentity.IPSAppDataEntity parampsappdataentity){
		this.parampsappdataentity = parampsappdataentity;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity parampsdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getParamPSDataEntity(){
		if(this.parampsdataentity != null) return this.parampsdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAMPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.parampsdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPARAMPSDATAENTITY);
		return this.parampsdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getParamPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getParamPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定参数实体对象");}
		return value;
	}

	public void setParamPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity parampsdataentity){
		this.parampsdataentity = parampsdataentity;
	}


	public java.lang.String getParamTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAMTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getParamTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAMTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public int getStdDataType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTDDATATYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public boolean isAppContextParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISAPPCONTEXTPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isAppGlobalParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISAPPGLOBALPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isChatCompletionRequestParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCHATCOMPLETIONREQUESTPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isChatCompletionResultParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCHATCOMPLETIONRESULTPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isCloneParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCLONEPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isDefault(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDEFAULT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEntityListParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENTITYLISTPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEntityMapParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENTITYMAPPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEntityPageParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENTITYPAGEPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEntityParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENTITYPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnvParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENVPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isFileListParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISFILELISTPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isFileParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISFILEPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isFilterParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISFILTERPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isLastParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISLASTPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isLastReturnParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISLASTRETURNPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isOriginEntity(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISORIGINENTITY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isSessionParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSESSIONPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isSimpleListParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSIMPLELISTPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isSimpleParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSIMPLEPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isWebContextParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISWEBCONTEXTPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isWebResponseParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISWEBRESPONSEPARAM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
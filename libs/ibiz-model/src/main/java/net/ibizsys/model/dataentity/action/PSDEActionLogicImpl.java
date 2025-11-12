package net.ibizsys.model.dataentity.action;



public class PSDEActionLogicImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.action.IPSDEActionLogic{

	public final static String ATTR_GETACTIONLOGICTYPE = "actionLogicType";
	public final static String ATTR_GETATTACHMODE = "attachMode";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDATASYNCEVENT = "dataSyncEvent";
	public final static String ATTR_GETDSTPSDE = "getDstPSDE";
	public final static String ATTR_GETDSTPSDEACTION = "getDstPSDEAction";
	public final static String ATTR_GETDSTPSDEDATASET = "getDstPSDEDataSet";
	public final static String ATTR_GETDSTPSDELOGIC = "getDstPSDELogic";
	public final static String ATTR_GETERRORCODE = "errorCode";
	public final static String ATTR_GETERRORINFO = "errorInfo";
	public final static String ATTR_GETERRORINFOPSLANGUAGERES = "getErrorInfoPSLanguageRes";
	public final static String ATTR_GETEXCEPTIONOBJ = "exceptionObj";
	public final static String ATTR_GETLOGICPARAMS = "logicParams";
	public final static String ATTR_GETMAJORPSDER = "getMajorPSDER";
	public final static String ATTR_GETPSDEDATASYNC = "getPSDEDataSync";
	public final static String ATTR_GETPSDEFVALUERULE = "getPSDEFValueRule";
	public final static String ATTR_GETPSDEFIELD = "getPSDEField";
	public final static String ATTR_GETPSDELOGIC = "getPSDELogic";
	public final static String ATTR_GETPSDEMAINSTATE = "getPSDEMainState";
	public final static String ATTR_GETPSDENOTIFY = "getPSDENotify";
	public final static String ATTR_GETPSSYSLOGIC = "getPSSysLogic";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSSEQUENCE = "getPSSysSequence";
	public final static String ATTR_GETPSSYSTRANSLATOR = "getPSSysTranslator";
	public final static String ATTR_GETPREPARELASTMODE = "prepareLastMode";
	public final static String ATTR_GETSCRIPTCODE = "scriptCode";
	public final static String ATTR_ISCLONEPARAM = "cloneParam";
	public final static String ATTR_ISENABLEBACKEND = "enableBackend";
	public final static String ATTR_ISIGNOREEXCEPTION = "ignoreException";
	public final static String ATTR_ISINTERNALLOGIC = "internalLogic";
	public final static String ATTR_ISPREPARELAST = "prepareLast";
	public final static String ATTR_ISVALID = "valid";

	public int getActionLogicType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONLOGICTYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getAttachMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETATTACHMODE);
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

	public int getDataSyncEvent(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATASYNCEVENT);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.IPSDataEntity dstpsde;

	public net.ibizsys.model.dataentity.IPSDataEntity getDstPSDE(){
		if(this.dstpsde != null) return this.dstpsde;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDE);
		if(value == null){
			return null;
		}
		this.dstpsde = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETDSTPSDE);
		return this.dstpsde;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getDstPSDEMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getDstPSDE();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标实体");}
		return value;
	}

	public void setDstPSDE(net.ibizsys.model.dataentity.IPSDataEntity dstpsde){
		this.dstpsde = dstpsde;
	}

	private net.ibizsys.model.dataentity.action.IPSDEAction dstpsdeaction;

	public net.ibizsys.model.dataentity.action.IPSDEAction getDstPSDEAction(){
		if(this.dstpsdeaction != null) return this.dstpsdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDEACTION);
		if(value == null){
			return null;
		}
		this.dstpsdeaction = this.getDstPSDEMust().getPSDEAction(value, false);
		return this.dstpsdeaction;
	}

	public net.ibizsys.model.dataentity.action.IPSDEAction getDstPSDEActionMust(){
		net.ibizsys.model.dataentity.action.IPSDEAction value = this.getDstPSDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标实体行为");}
		return value;
	}

	public void setDstPSDEAction(net.ibizsys.model.dataentity.action.IPSDEAction dstpsdeaction){
		this.dstpsdeaction = dstpsdeaction;
	}

	private net.ibizsys.model.dataentity.ds.IPSDEDataSet dstpsdedataset;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getDstPSDEDataSet(){
		if(this.dstpsdedataset != null) return this.dstpsdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDEDATASET);
		if(value == null){
			return null;
		}
		this.dstpsdedataset = this.getDstPSDEMust().getPSDEDataSet(value, false);
		return this.dstpsdedataset;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getDstPSDEDataSetMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getDstPSDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标实体数据集");}
		return value;
	}

	public void setDstPSDEDataSet(net.ibizsys.model.dataentity.ds.IPSDEDataSet dstpsdedataset){
		this.dstpsdedataset = dstpsdedataset;
	}

	private net.ibizsys.model.dataentity.logic.IPSDELogic dstpsdelogic;

	public net.ibizsys.model.dataentity.logic.IPSDELogic getDstPSDELogic(){
		if(this.dstpsdelogic != null) return this.dstpsdelogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSTPSDELOGIC);
		if(value == null){
			return null;
		}
		this.dstpsdelogic = this.getDstPSDEMust().getPSDELogic(value, false);
		return this.dstpsdelogic;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogic getDstPSDELogicMust(){
		net.ibizsys.model.dataentity.logic.IPSDELogic value = this.getDstPSDELogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标实体逻辑");}
		return value;
	}

	public void setDstPSDELogic(net.ibizsys.model.dataentity.logic.IPSDELogic dstpsdelogic){
		this.dstpsdelogic = dstpsdelogic;
	}


	public int getErrorCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETERRORCODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getErrorInfo(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETERRORINFO);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes errorinfopslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getErrorInfoPSLanguageRes(){
		if(this.errorinfopslanguageres != null) return this.errorinfopslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETERRORINFOPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.errorinfopslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETERRORINFOPSLANGUAGERES);
		return this.errorinfopslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getErrorInfoPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getErrorInfoPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定错误信息语言资源对象");}
		return value;
	}

	public void setErrorInfoPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes errorinfopslanguageres){
		this.errorinfopslanguageres = errorinfopslanguageres;
	}


	public java.lang.String getExceptionObj(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXCEPTIONOBJ);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getLogicParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGICPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}
	private net.ibizsys.model.dataentity.der.IPSDERBase majorpsder;

	public net.ibizsys.model.dataentity.der.IPSDERBase getMajorPSDER(){
		if(this.majorpsder != null) return this.majorpsder;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAJORPSDER);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.majorpsder = ipsdataentity.getMajorPSDERBase(value, false);
		return this.majorpsder;
	}

	public net.ibizsys.model.dataentity.der.IPSDERBase getMajorPSDERMust(){
		net.ibizsys.model.dataentity.der.IPSDERBase value = this.getMajorPSDER();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定主控关系");}
		return value;
	}

	public void setMajorPSDER(net.ibizsys.model.dataentity.der.IPSDERBase majorpsder){
		this.majorpsder = majorpsder;
	}

	private net.ibizsys.model.dataentity.datasync.IPSDEDataSync psdedatasync;

	public net.ibizsys.model.dataentity.datasync.IPSDEDataSync getPSDEDataSync(){
		if(this.psdedatasync != null) return this.psdedatasync;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATASYNC);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdedatasync = ipsdataentity.getPSDEDataSync(value, false);
		return this.psdedatasync;
	}

	public net.ibizsys.model.dataentity.datasync.IPSDEDataSync getPSDEDataSyncMust(){
		net.ibizsys.model.dataentity.datasync.IPSDEDataSync value = this.getPSDEDataSync();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体数据同步");}
		return value;
	}

	public void setPSDEDataSync(net.ibizsys.model.dataentity.datasync.IPSDEDataSync psdedatasync){
		this.psdedatasync = psdedatasync;
	}

	private net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule psdefvaluerule;

	public net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule getPSDEFValueRule(){
		if(this.psdefvaluerule != null) return this.psdefvaluerule;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFVALUERULE);
		if(value == null){
			return null;
		}
		this.psdefvaluerule = this.getPSDEFieldMust().getPSDEFValueRule(value, false);
		return this.psdefvaluerule;
	}

	public net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule getPSDEFValueRuleMust(){
		net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule value = this.getPSDEFValueRule();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定属性值规则");}
		return value;
	}

	public void setPSDEFValueRule(net.ibizsys.model.dataentity.defield.valuerule.IPSDEFValueRule psdefvaluerule){
		this.psdefvaluerule = psdefvaluerule;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField psdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getPSDEField(){
		if(this.psdefield != null) return this.psdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdefield = ipsdataentity.getPSDEField(value, false);
		return this.psdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定属性对象");}
		return value;
	}

	public void setPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField psdefield){
		this.psdefield = psdefield;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体逻辑");}
		return value;
	}

	public void setPSDELogic(net.ibizsys.model.dataentity.logic.IPSDELogic psdelogic){
		this.psdelogic = psdelogic;
	}

	private net.ibizsys.model.dataentity.mainstate.IPSDEMainState psdemainstate;

	public net.ibizsys.model.dataentity.mainstate.IPSDEMainState getPSDEMainState(){
		if(this.psdemainstate != null) return this.psdemainstate;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEMAINSTATE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdemainstate = ipsdataentity.getPSDEMainState(value, false);
		return this.psdemainstate;
	}

	public net.ibizsys.model.dataentity.mainstate.IPSDEMainState getPSDEMainStateMust(){
		net.ibizsys.model.dataentity.mainstate.IPSDEMainState value = this.getPSDEMainState();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体主状态");}
		return value;
	}

	public void setPSDEMainState(net.ibizsys.model.dataentity.mainstate.IPSDEMainState psdemainstate){
		this.psdemainstate = psdemainstate;
	}

	private net.ibizsys.model.dataentity.notify.IPSDENotify psdenotify;

	public net.ibizsys.model.dataentity.notify.IPSDENotify getPSDENotify(){
		if(this.psdenotify != null) return this.psdenotify;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDENOTIFY);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdenotify = ipsdataentity.getPSDENotify(value, false);
		return this.psdenotify;
	}

	public net.ibizsys.model.dataentity.notify.IPSDENotify getPSDENotifyMust(){
		net.ibizsys.model.dataentity.notify.IPSDENotify value = this.getPSDENotify();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体通知");}
		return value;
	}

	public void setPSDENotify(net.ibizsys.model.dataentity.notify.IPSDENotify psdenotify){
		this.psdenotify = psdenotify;
	}

	private net.ibizsys.model.res.IPSSysLogic pssyslogic;

	public net.ibizsys.model.res.IPSSysLogic getPSSysLogic(){
		if(this.pssyslogic != null) return this.pssyslogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSLOGIC);
		if(value == null){
			return null;
		}
		this.pssyslogic = getPSModelObject(net.ibizsys.model.res.IPSSysLogic.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSLOGIC);
		return this.pssyslogic;
	}

	public net.ibizsys.model.res.IPSSysLogic getPSSysLogicMust(){
		net.ibizsys.model.res.IPSSysLogic value = this.getPSSysLogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统预置逻辑");}
		return value;
	}

	public void setPSSysLogic(net.ibizsys.model.res.IPSSysLogic pssyslogic){
		this.pssyslogic = pssyslogic;
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


	public int getPrepareLastMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPREPARELASTMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getScriptCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSCRIPTCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isCloneParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCLONEPARAM);
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

	public boolean isIgnoreException(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISIGNOREEXCEPTION);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isInternalLogic(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISINTERNALLOGIC);
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
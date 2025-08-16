package net.ibizsys.model.dataentity.wf;



public class PSDEWFImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.wf.IPSDEWF{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETENTITYSTATEPSCODELIST = "getEntityStatePSCodeList";
	public final static String ATTR_GETENTITYWFCANCELSTATE = "entityWFCancelState";
	public final static String ATTR_GETENTITYWFERRORSTATE = "entityWFErrorState";
	public final static String ATTR_GETENTITYWFFINISHSTATE = "entityWFFinishState";
	public final static String ATTR_GETENTITYWFSTATE = "entityWFState";
	public final static String ATTR_GETERRORPSDEMAINSTATE = "getErrorPSDEMainState";
	public final static String ATTR_GETFINISHPSDEACTION = "getFinishPSDEAction";
	public final static String ATTR_GETFINISHPSDEMAINSTATE = "getFinishPSDEMainState";
	public final static String ATTR_GETINITPSDEACTION = "getInitPSDEAction";
	public final static String ATTR_GETMYWFDATACAPPSLANGUAGERES = "getMyWFDataCapPSLanguageRes";
	public final static String ATTR_GETMYWFDATACAPTION = "myWFDataCaption";
	public final static String ATTR_GETMYWFWORKCAPPSLANGUAGERES = "getMyWFWorkCapPSLanguageRes";
	public final static String ATTR_GETMYWFWORKCAPTION = "myWFWorkCaption";
	public final static String ATTR_GETPSWORKFLOW = "getPSWorkflow";
	public final static String ATTR_GETPWFINSTPSDEFIELD = "getPWFInstPSDEField";
	public final static String ATTR_GETPROCESSPSDEMAINSTATE = "getProcessPSDEMainState";
	public final static String ATTR_GETPROXYDATAPSDEFIELD = "getProxyDataPSDEField";
	public final static String ATTR_GETPROXYMODULEPSDEFIELD = "getProxyModulePSDEField";
	public final static String ATTR_GETUDSTATEPSDEFIELD = "getUDStatePSDEField";
	public final static String ATTR_GETWFACTORSPSDEFIELD = "getWFActorsPSDEField";
	public final static String ATTR_GETWFCATCODE = "wFCatCode";
	public final static String ATTR_GETWFINSTPSDEFIELD = "getWFInstPSDEField";
	public final static String ATTR_GETWFMODE = "wFMode";
	public final static String ATTR_GETWFPROXYMODE = "wFProxyMode";
	public final static String ATTR_GETWFRETPSDEFIELD = "getWFRetPSDEField";
	public final static String ATTR_GETWFSTARTNAME = "wFStartName";
	public final static String ATTR_GETWFSTATEPSDEFIELD = "getWFStatePSDEField";
	public final static String ATTR_GETWFSTEPPSCODELIST = "getWFStepPSCodeList";
	public final static String ATTR_GETWFSTEPPSDEFIELD = "getWFStepPSDEField";
	public final static String ATTR_GETWFVERPSDEFIELD = "getWFVerPSDEField";
	public final static String ATTR_GETWORKFLOWPSDEFIELD = "getWorkflowPSDEField";
	public final static String ATTR_ISDEFAULTMODE = "defaultMode";
	public final static String ATTR_ISENABLEUSERSTART = "enableUserStart";
	public final static String ATTR_ISUSEWFPROXYAPP = "useWFProxyApp";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.codelist.IPSCodeList entitystatepscodelist;

	public net.ibizsys.model.codelist.IPSCodeList getEntityStatePSCodeList(){
		if(this.entitystatepscodelist != null) return this.entitystatepscodelist;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENTITYSTATEPSCODELIST);
		if(value == null){
			return null;
		}
		this.entitystatepscodelist = getPSModelObject(net.ibizsys.model.codelist.IPSCodeList.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETENTITYSTATEPSCODELIST);
		return this.entitystatepscodelist;
	}

	public net.ibizsys.model.codelist.IPSCodeList getEntityStatePSCodeListMust(){
		net.ibizsys.model.codelist.IPSCodeList value = this.getEntityStatePSCodeList();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定用户数据状态代码表");}
		return value;
	}

	public void setEntityStatePSCodeList(net.ibizsys.model.codelist.IPSCodeList entitystatepscodelist){
		this.entitystatepscodelist = entitystatepscodelist;
	}


	public java.lang.String getEntityWFCancelState(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENTITYWFCANCELSTATE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getEntityWFErrorState(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENTITYWFERRORSTATE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getEntityWFFinishState(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENTITYWFFINISHSTATE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getEntityWFState(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENTITYWFSTATE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.mainstate.IPSDEMainState errorpsdemainstate;

	public net.ibizsys.model.dataentity.mainstate.IPSDEMainState getErrorPSDEMainState(){
		if(this.errorpsdemainstate != null) return this.errorpsdemainstate;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETERRORPSDEMAINSTATE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.errorpsdemainstate = ipsdataentity.getPSDEMainState(value, false);
		return this.errorpsdemainstate;
	}

	public net.ibizsys.model.dataentity.mainstate.IPSDEMainState getErrorPSDEMainStateMust(){
		net.ibizsys.model.dataentity.mainstate.IPSDEMainState value = this.getErrorPSDEMainState();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定错误跳转主状态");}
		return value;
	}

	public void setErrorPSDEMainState(net.ibizsys.model.dataentity.mainstate.IPSDEMainState errorpsdemainstate){
		this.errorpsdemainstate = errorpsdemainstate;
	}

	private net.ibizsys.model.dataentity.action.IPSDEAction finishpsdeaction;

	public net.ibizsys.model.dataentity.action.IPSDEAction getFinishPSDEAction(){
		if(this.finishpsdeaction != null) return this.finishpsdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFINISHPSDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.finishpsdeaction = ipsdataentity.getPSDEAction(value, false);
		return this.finishpsdeaction;
	}

	public net.ibizsys.model.dataentity.action.IPSDEAction getFinishPSDEActionMust(){
		net.ibizsys.model.dataentity.action.IPSDEAction value = this.getFinishPSDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定流程完成实体行为");}
		return value;
	}

	public void setFinishPSDEAction(net.ibizsys.model.dataentity.action.IPSDEAction finishpsdeaction){
		this.finishpsdeaction = finishpsdeaction;
	}

	private net.ibizsys.model.dataentity.mainstate.IPSDEMainState finishpsdemainstate;

	public net.ibizsys.model.dataentity.mainstate.IPSDEMainState getFinishPSDEMainState(){
		if(this.finishpsdemainstate != null) return this.finishpsdemainstate;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFINISHPSDEMAINSTATE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.finishpsdemainstate = ipsdataentity.getPSDEMainState(value, false);
		return this.finishpsdemainstate;
	}

	public net.ibizsys.model.dataentity.mainstate.IPSDEMainState getFinishPSDEMainStateMust(){
		net.ibizsys.model.dataentity.mainstate.IPSDEMainState value = this.getFinishPSDEMainState();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定完成跳转主状态");}
		return value;
	}

	public void setFinishPSDEMainState(net.ibizsys.model.dataentity.mainstate.IPSDEMainState finishpsdemainstate){
		this.finishpsdemainstate = finishpsdemainstate;
	}

	private net.ibizsys.model.dataentity.action.IPSDEAction initpsdeaction;

	public net.ibizsys.model.dataentity.action.IPSDEAction getInitPSDEAction(){
		if(this.initpsdeaction != null) return this.initpsdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINITPSDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.initpsdeaction = ipsdataentity.getPSDEAction(value, false);
		return this.initpsdeaction;
	}

	public net.ibizsys.model.dataentity.action.IPSDEAction getInitPSDEActionMust(){
		net.ibizsys.model.dataentity.action.IPSDEAction value = this.getInitPSDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定流程初始化实体行为");}
		return value;
	}

	public void setInitPSDEAction(net.ibizsys.model.dataentity.action.IPSDEAction initpsdeaction){
		this.initpsdeaction = initpsdeaction;
	}

	private net.ibizsys.model.res.IPSLanguageRes mywfdatacappslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getMyWFDataCapPSLanguageRes(){
		if(this.mywfdatacappslanguageres != null) return this.mywfdatacappslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMYWFDATACAPPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.mywfdatacappslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETMYWFDATACAPPSLANGUAGERES);
		return this.mywfdatacappslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getMyWFDataCapPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getMyWFDataCapPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定我的数据标题语言资源");}
		return value;
	}

	public void setMyWFDataCapPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes mywfdatacappslanguageres){
		this.mywfdatacappslanguageres = mywfdatacappslanguageres;
	}


	public java.lang.String getMyWFDataCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMYWFDATACAPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes mywfworkcappslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getMyWFWorkCapPSLanguageRes(){
		if(this.mywfworkcappslanguageres != null) return this.mywfworkcappslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMYWFWORKCAPPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.mywfworkcappslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETMYWFWORKCAPPSLANGUAGERES);
		return this.mywfworkcappslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getMyWFWorkCapPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getMyWFWorkCapPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定我的工作标题语言资源");}
		return value;
	}

	public void setMyWFWorkCapPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes mywfworkcappslanguageres){
		this.mywfworkcappslanguageres = mywfworkcappslanguageres;
	}


	public java.lang.String getMyWFWorkCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMYWFWORKCAPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.wf.IPSWorkflow psworkflow;

	public net.ibizsys.model.wf.IPSWorkflow getPSWorkflow(){
		if(this.psworkflow != null) return this.psworkflow;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSWORKFLOW);
		if(value == null){
			return null;
		}
		this.psworkflow = getPSModelObject(net.ibizsys.model.wf.IPSWorkflow.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSWORKFLOW);
		return this.psworkflow;
	}

	public net.ibizsys.model.wf.IPSWorkflow getPSWorkflowMust(){
		net.ibizsys.model.wf.IPSWorkflow value = this.getPSWorkflow();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定工作流对象");}
		return value;
	}

	public void setPSWorkflow(net.ibizsys.model.wf.IPSWorkflow psworkflow){
		this.psworkflow = psworkflow;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField pwfinstpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getPWFInstPSDEField(){
		if(this.pwfinstpsdefield != null) return this.pwfinstpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPWFINSTPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.pwfinstpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.pwfinstpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getPWFInstPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getPWFInstPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定父流程实例属性");}
		return value;
	}

	public void setPWFInstPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField pwfinstpsdefield){
		this.pwfinstpsdefield = pwfinstpsdefield;
	}

	private net.ibizsys.model.dataentity.mainstate.IPSDEMainState processpsdemainstate;

	public net.ibizsys.model.dataentity.mainstate.IPSDEMainState getProcessPSDEMainState(){
		if(this.processpsdemainstate != null) return this.processpsdemainstate;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPROCESSPSDEMAINSTATE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.processpsdemainstate = ipsdataentity.getPSDEMainState(value, false);
		return this.processpsdemainstate;
	}

	public net.ibizsys.model.dataentity.mainstate.IPSDEMainState getProcessPSDEMainStateMust(){
		net.ibizsys.model.dataentity.mainstate.IPSDEMainState value = this.getProcessPSDEMainState();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定处理中主状态");}
		return value;
	}

	public void setProcessPSDEMainState(net.ibizsys.model.dataentity.mainstate.IPSDEMainState processpsdemainstate){
		this.processpsdemainstate = processpsdemainstate;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField proxydatapsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getProxyDataPSDEField(){
		if(this.proxydatapsdefield != null) return this.proxydatapsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPROXYDATAPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.proxydatapsdefield = ipsdataentity.getPSDEField(value, false);
		return this.proxydatapsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getProxyDataPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getProxyDataPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定代理数据存储属性");}
		return value;
	}

	public void setProxyDataPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField proxydatapsdefield){
		this.proxydatapsdefield = proxydatapsdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField proxymodulepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getProxyModulePSDEField(){
		if(this.proxymodulepsdefield != null) return this.proxymodulepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPROXYMODULEPSDEFIELD);
		if(value == null){
			return null;
		}
		this.proxymodulepsdefield = getPSModelObject(net.ibizsys.model.dataentity.defield.IPSDEField.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPROXYMODULEPSDEFIELD);
		return this.proxymodulepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getProxyModulePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getProxyModulePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定代理模块存储属性");}
		return value;
	}

	public void setProxyModulePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField proxymodulepsdefield){
		this.proxymodulepsdefield = proxymodulepsdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField udstatepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getUDStatePSDEField(){
		if(this.udstatepsdefield != null) return this.udstatepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUDSTATEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.udstatepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.udstatepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getUDStatePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getUDStatePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定用户状态属性");}
		return value;
	}

	public void setUDStatePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField udstatepsdefield){
		this.udstatepsdefield = udstatepsdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField wfactorspsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getWFActorsPSDEField(){
		if(this.wfactorspsdefield != null) return this.wfactorspsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFACTORSPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.wfactorspsdefield = ipsdataentity.getPSDEField(value, false);
		return this.wfactorspsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getWFActorsPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getWFActorsPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定流程操作者属性");}
		return value;
	}

	public void setWFActorsPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField wfactorspsdefield){
		this.wfactorspsdefield = wfactorspsdefield;
	}


	@Deprecated
	public java.lang.String getWFCatCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFCATCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField wfinstpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getWFInstPSDEField(){
		if(this.wfinstpsdefield != null) return this.wfinstpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFINSTPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.wfinstpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.wfinstpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getWFInstPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getWFInstPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定流程实例属性");}
		return value;
	}

	public void setWFInstPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField wfinstpsdefield){
		this.wfinstpsdefield = wfinstpsdefield;
	}


	public java.lang.String getWFMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getWFProxyMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFPROXYMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField wfretpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getWFRetPSDEField(){
		if(this.wfretpsdefield != null) return this.wfretpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFRETPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.wfretpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.wfretpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getWFRetPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getWFRetPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定嵌入流程返回值存放属性");}
		return value;
	}

	public void setWFRetPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField wfretpsdefield){
		this.wfretpsdefield = wfretpsdefield;
	}


	public java.lang.String getWFStartName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFSTARTNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField wfstatepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getWFStatePSDEField(){
		if(this.wfstatepsdefield != null) return this.wfstatepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFSTATEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.wfstatepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.wfstatepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getWFStatePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getWFStatePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定流程状态属性");}
		return value;
	}

	public void setWFStatePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField wfstatepsdefield){
		this.wfstatepsdefield = wfstatepsdefield;
	}

	private net.ibizsys.model.codelist.IPSCodeList wfsteppscodelist;

	public net.ibizsys.model.codelist.IPSCodeList getWFStepPSCodeList(){
		if(this.wfsteppscodelist != null) return this.wfsteppscodelist;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFSTEPPSCODELIST);
		if(value == null){
			return null;
		}
		this.wfsteppscodelist = getPSModelObject(net.ibizsys.model.codelist.IPSCodeList.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETWFSTEPPSCODELIST);
		return this.wfsteppscodelist;
	}

	public net.ibizsys.model.codelist.IPSCodeList getWFStepPSCodeListMust(){
		net.ibizsys.model.codelist.IPSCodeList value = this.getWFStepPSCodeList();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定流程步骤代码表");}
		return value;
	}

	public void setWFStepPSCodeList(net.ibizsys.model.codelist.IPSCodeList wfsteppscodelist){
		this.wfsteppscodelist = wfsteppscodelist;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField wfsteppsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getWFStepPSDEField(){
		if(this.wfsteppsdefield != null) return this.wfsteppsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFSTEPPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.wfsteppsdefield = ipsdataentity.getPSDEField(value, false);
		return this.wfsteppsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getWFStepPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getWFStepPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定流程步骤属性");}
		return value;
	}

	public void setWFStepPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField wfsteppsdefield){
		this.wfsteppsdefield = wfsteppsdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField wfverpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getWFVerPSDEField(){
		if(this.wfverpsdefield != null) return this.wfverpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFVERPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.wfverpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.wfverpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getWFVerPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getWFVerPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定流程版本存放属性");}
		return value;
	}

	public void setWFVerPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField wfverpsdefield){
		this.wfverpsdefield = wfverpsdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField workflowpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getWorkflowPSDEField(){
		if(this.workflowpsdefield != null) return this.workflowpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWORKFLOWPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.workflowpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.workflowpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getWorkflowPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getWorkflowPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定工作流存放属性");}
		return value;
	}

	public void setWorkflowPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField workflowpsdefield){
		this.workflowpsdefield = workflowpsdefield;
	}


	public boolean isDefaultMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDEFAULTMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableUserStart(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEUSERSTART);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isUseWFProxyApp(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISUSEWFPROXYAPP);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
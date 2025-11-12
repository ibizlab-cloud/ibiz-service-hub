package net.ibizsys.model.dts;



public class PSSysDTSQueueImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.dts.IPSSysDTSQueue{

	public final static String ATTR_GETCANCELPSDEACTION = "getCancelPSDEAction";
	public final static String ATTR_GETCANCELTIMEOUT = "cancelTimeout";
	public final static String ATTR_GETCANCELLEDSTATE = "cancelledState";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCONFIRMPSDEACTION = "getConfirmPSDEAction";
	public final static String ATTR_GETCREATEDSTATE = "createdState";
	public final static String ATTR_GETERRORPSDEFIELD = "getErrorPSDEField";
	public final static String ATTR_GETFAILEDSTATE = "failedState";
	public final static String ATTR_GETFINISHEDSTATE = "finishedState";
	public final static String ATTR_GETHISTORYPSDATAENTITY = "getHistoryPSDataEntity";
	public final static String ATTR_GETPSDATAENTITY = "getPSDataEntity";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";
	public final static String ATTR_GETPROCESSINGSTATE = "processingState";
	public final static String ATTR_GETPUSHPSDEACTION = "getPushPSDEAction";
	public final static String ATTR_GETREFRESHPSDEACTION = "getRefreshPSDEAction";
	public final static String ATTR_GETREFRESHTIMER = "refreshTimer";
	public final static String ATTR_GETSTATEPSDEFIELD = "getStatePSDEField";
	public final static String ATTR_GETTIMEPSDEFIELD = "getTimePSDEField";
	private net.ibizsys.model.dataentity.action.IPSDEAction cancelpsdeaction;

	public net.ibizsys.model.dataentity.action.IPSDEAction getCancelPSDEAction(){
		if(this.cancelpsdeaction != null) return this.cancelpsdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCANCELPSDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.cancelpsdeaction = ipsdataentity.getPSDEAction(value, false);
		return this.cancelpsdeaction;
	}

	public net.ibizsys.model.dataentity.action.IPSDEAction getCancelPSDEActionMust(){
		net.ibizsys.model.dataentity.action.IPSDEAction value = this.getCancelPSDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定取消操作实体行为");}
		return value;
	}

	public void setCancelPSDEAction(net.ibizsys.model.dataentity.action.IPSDEAction cancelpsdeaction){
		this.cancelpsdeaction = cancelpsdeaction;
	}


	public int getCancelTimeout(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCANCELTIMEOUT);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public java.lang.String getCancelledState(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCANCELLEDSTATE);
		if(value == null){
			return "41";
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
	private net.ibizsys.model.dataentity.action.IPSDEAction confirmpsdeaction;

	public net.ibizsys.model.dataentity.action.IPSDEAction getConfirmPSDEAction(){
		if(this.confirmpsdeaction != null) return this.confirmpsdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONFIRMPSDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.confirmpsdeaction = ipsdataentity.getPSDEAction(value, false);
		return this.confirmpsdeaction;
	}

	public net.ibizsys.model.dataentity.action.IPSDEAction getConfirmPSDEActionMust(){
		net.ibizsys.model.dataentity.action.IPSDEAction value = this.getConfirmPSDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定确认操作实体行为");}
		return value;
	}

	public void setConfirmPSDEAction(net.ibizsys.model.dataentity.action.IPSDEAction confirmpsdeaction){
		this.confirmpsdeaction = confirmpsdeaction;
	}


	public java.lang.String getCreatedState(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCREATEDSTATE);
		if(value == null){
			return "10";
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField errorpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getErrorPSDEField(){
		if(this.errorpsdefield != null) return this.errorpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETERRORPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.errorpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.errorpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getErrorPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getErrorPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定错误属性对象");}
		return value;
	}

	public void setErrorPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField errorpsdefield){
		this.errorpsdefield = errorpsdefield;
	}


	public java.lang.String getFailedState(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFAILEDSTATE);
		if(value == null){
			return "40";
		}
		return value.asText();
	}

	public java.lang.String getFinishedState(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFINISHEDSTATE);
		if(value == null){
			return "30";
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.IPSDataEntity historypsdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getHistoryPSDataEntity(){
		if(this.historypsdataentity != null) return this.historypsdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHISTORYPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.historypsdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETHISTORYPSDATAENTITY);
		return this.historypsdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getHistoryPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getHistoryPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定历史数据实体对象");}
		return value;
	}

	public void setHistoryPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity historypsdataentity){
		this.historypsdataentity = historypsdataentity;
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

	private net.ibizsys.model.system.IPSSystemModule pssystemmodule;

	public net.ibizsys.model.system.IPSSystemModule getPSSystemModule(){
		if(this.pssystemmodule != null) return this.pssystemmodule;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSTEMMODULE);
		if(value == null){
			return null;
		}
		this.pssystemmodule = getPSModelObject(net.ibizsys.model.system.IPSSystemModule.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSTEMMODULE);
		return this.pssystemmodule;
	}

	public net.ibizsys.model.system.IPSSystemModule getPSSystemModuleMust(){
		net.ibizsys.model.system.IPSSystemModule value = this.getPSSystemModule();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统模块");}
		return value;
	}

	public void setPSSystemModule(net.ibizsys.model.system.IPSSystemModule pssystemmodule){
		this.pssystemmodule = pssystemmodule;
	}


	public java.lang.String getProcessingState(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPROCESSINGSTATE);
		if(value == null){
			return "20";
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.action.IPSDEAction pushpsdeaction;

	public net.ibizsys.model.dataentity.action.IPSDEAction getPushPSDEAction(){
		if(this.pushpsdeaction != null) return this.pushpsdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPUSHPSDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.pushpsdeaction = ipsdataentity.getPSDEAction(value, false);
		return this.pushpsdeaction;
	}

	public net.ibizsys.model.dataentity.action.IPSDEAction getPushPSDEActionMust(){
		net.ibizsys.model.dataentity.action.IPSDEAction value = this.getPushPSDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定推送实体行为");}
		return value;
	}

	public void setPushPSDEAction(net.ibizsys.model.dataentity.action.IPSDEAction pushpsdeaction){
		this.pushpsdeaction = pushpsdeaction;
	}

	private net.ibizsys.model.dataentity.action.IPSDEAction refreshpsdeaction;

	public net.ibizsys.model.dataentity.action.IPSDEAction getRefreshPSDEAction(){
		if(this.refreshpsdeaction != null) return this.refreshpsdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFRESHPSDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.refreshpsdeaction = ipsdataentity.getPSDEAction(value, false);
		return this.refreshpsdeaction;
	}

	public net.ibizsys.model.dataentity.action.IPSDEAction getRefreshPSDEActionMust(){
		net.ibizsys.model.dataentity.action.IPSDEAction value = this.getRefreshPSDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定刷新实体行为");}
		return value;
	}

	public void setRefreshPSDEAction(net.ibizsys.model.dataentity.action.IPSDEAction refreshpsdeaction){
		this.refreshpsdeaction = refreshpsdeaction;
	}


	public int getRefreshTimer(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFRESHTIMER);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField statepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getStatePSDEField(){
		if(this.statepsdefield != null) return this.statepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTATEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.statepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.statepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getStatePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getStatePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定状态属性对象");}
		return value;
	}

	public void setStatePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField statepsdefield){
		this.statepsdefield = statepsdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField timepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getTimePSDEField(){
		if(this.timepsdefield != null) return this.timepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTIMEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.timepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.timepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getTimePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getTimePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定时间属性对象");}
		return value;
	}

	public void setTimePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField timepsdefield){
		this.timepsdefield = timepsdefield;
	}

}
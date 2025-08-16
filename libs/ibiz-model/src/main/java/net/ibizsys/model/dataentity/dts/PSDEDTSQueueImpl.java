package net.ibizsys.model.dataentity.dts;



public class PSDEDTSQueueImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.dts.IPSDEDTSQueue
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETCANCELPSDEACTION = "getCancelPSDEAction";
	public final static String ATTR_GETCANCELTIMEOUT = "cancelTimeout";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCONFIRMPSDEACTION = "getConfirmPSDEAction";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSSYSDTSQUEUE = "getPSSysDTSQueue";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPUSHPSDEACTION = "getPushPSDEAction";
	public final static String ATTR_GETREFRESHPSDEACTION = "getRefreshPSDEAction";
	public final static String ATTR_GETREFRESHTIMER = "refreshTimer";
	public final static String ATTR_ISDEFAULT = "default";
	private net.ibizsys.model.dataentity.action.IPSDEAction cancelpsdeaction;

	public net.ibizsys.model.dataentity.action.IPSDEAction getCancelPSDEAction(){
		if(this.cancelpsdeaction != null) return this.cancelpsdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCANCELPSDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
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
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
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


	@Deprecated
	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dts.IPSSysDTSQueue pssysdtsqueue;

	public net.ibizsys.model.dts.IPSSysDTSQueue getPSSysDTSQueue(){
		if(this.pssysdtsqueue != null) return this.pssysdtsqueue;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSDTSQUEUE);
		if(value == null){
			return null;
		}
		this.pssysdtsqueue = getPSModelObject(net.ibizsys.model.dts.IPSSysDTSQueue.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSDTSQUEUE);
		return this.pssysdtsqueue;
	}

	public net.ibizsys.model.dts.IPSSysDTSQueue getPSSysDTSQueueMust(){
		net.ibizsys.model.dts.IPSSysDTSQueue value = this.getPSSysDTSQueue();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统异步处理队列");}
		return value;
	}

	public void setPSSysDTSQueue(net.ibizsys.model.dts.IPSSysDTSQueue pssysdtsqueue){
		this.pssysdtsqueue = pssysdtsqueue;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定后端模板插件对象");}
		return value;
	}

	public void setPSSysSFPlugin(net.ibizsys.model.res.IPSSysSFPlugin pssyssfplugin){
		this.pssyssfplugin = pssyssfplugin;
	}

	private net.ibizsys.model.dataentity.action.IPSDEAction pushpsdeaction;

	public net.ibizsys.model.dataentity.action.IPSDEAction getPushPSDEAction(){
		if(this.pushpsdeaction != null) return this.pushpsdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPUSHPSDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
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
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
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

	public boolean isDefault(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDEFAULT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
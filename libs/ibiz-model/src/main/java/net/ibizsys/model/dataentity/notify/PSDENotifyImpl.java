package net.ibizsys.model.dataentity.notify;



public class PSDENotifyImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.notify.IPSDENotify
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETBEGINTIMEPSDEFIELD = "getBeginTimePSDEField";
	public final static String ATTR_GETCHECKTIMER = "checkTimer";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCUSTOMCOND = "customCond";
	public final static String ATTR_GETENDTIMEPSDEFIELD = "getEndTimePSDEField";
	public final static String ATTR_GETEVENTMODEL = "eventModel";
	public final static String ATTR_GETEVENTS = "events";
	public final static String ATTR_GETFIELDS = "fields";
	public final static String ATTR_GETFILTERMODEL = "filterModel";
	public final static String ATTR_GETMSGTYPE = "msgType";
	public final static String ATTR_GETNOTIFYEND = "notifyEnd";
	public final static String ATTR_GETNOTIFYSTART = "notifyStart";
	public final static String ATTR_GETNOTIFYSUBTYPE = "notifySubType";
	public final static String ATTR_GETNOTIFYTAG = "notifyTag";
	public final static String ATTR_GETNOTIFYTAG2 = "notifyTag2";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSDEDATASET = "getPSDEDataSet";
	public final static String ATTR_GETPSDENOTIFYTARGETS = "getPSDENotifyTargets";
	public final static String ATTR_GETPSSYSMSGQUEUE = "getPSSysMsgQueue";
	public final static String ATTR_GETPSSYSMSGTEMPL = "getPSSysMsgTempl";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETTASKMODE = "taskMode";
	public final static String ATTR_GETTHREADMODE = "threadMode";
	public final static String ATTR_ISIGNOREEXCEPTION = "ignoreException";
	public final static String ATTR_ISTEMPLATE = "template";
	public final static String ATTR_ISTIMERMODE = "timerMode";
	public final static String ATTR_ISVALID = "valid";
	private net.ibizsys.model.dataentity.defield.IPSDEField begintimepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getBeginTimePSDEField(){
		if(this.begintimepsdefield != null) return this.begintimepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBEGINTIMEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.begintimepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.begintimepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getBeginTimePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getBeginTimePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定开始时间值存储属性");}
		return value;
	}

	public void setBeginTimePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField begintimepsdefield){
		this.begintimepsdefield = begintimepsdefield;
	}


	public int getCheckTimer(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCHECKTIMER);
		if(value == null){
			return 0;
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

	public java.lang.String getCustomCond(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCUSTOMCOND);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField endtimepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getEndTimePSDEField(){
		if(this.endtimepsdefield != null) return this.endtimepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENDTIMEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.endtimepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.endtimepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getEndTimePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getEndTimePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定结束时间值存储属性");}
		return value;
	}

	public void setEndTimePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField endtimepsdefield){
		this.endtimepsdefield = endtimepsdefield;
	}


	public java.lang.String getEventModel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEVENTMODEL);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getEvents(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEVENTS);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getFields(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFIELDS);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getFilterModel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFILTERMODEL);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getMsgType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMSGTYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getNotifyEnd(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNOTIFYEND);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getNotifyStart(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNOTIFYSTART);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getNotifySubType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNOTIFYSUBTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getNotifyTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNOTIFYTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getNotifyTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNOTIFYTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.ds.IPSDEDataSet psdedataset;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet(){
		if(this.psdedataset != null) return this.psdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATASET);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdedataset = ipsdataentity.getPSDEDataSet(value, false);
		return this.psdedataset;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getPSDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定数据集");}
		return value;
	}

	public void setPSDEDataSet(net.ibizsys.model.dataentity.ds.IPSDEDataSet psdedataset){
		this.psdedataset = psdedataset;
	}


	private java.util.List<net.ibizsys.model.dataentity.notify.IPSDENotifyTarget> psdenotifytars = null;
	public java.util.List<net.ibizsys.model.dataentity.notify.IPSDENotifyTarget> getPSDENotifyTargets(){
		if(this.psdenotifytars == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDENOTIFYTARGETS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.notify.IPSDENotifyTarget> list = new java.util.ArrayList<net.ibizsys.model.dataentity.notify.IPSDENotifyTarget>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.notify.IPSDENotifyTarget obj = this.getPSModelObject(net.ibizsys.model.dataentity.notify.IPSDENotifyTarget.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDENOTIFYTARGETS);
				if(obj!=null)list.add(obj);
			}
			this.psdenotifytars = list;
		}
		return (this.psdenotifytars.size() == 0)? null : this.psdenotifytars;
	}

	public net.ibizsys.model.dataentity.notify.IPSDENotifyTarget getPSDENotifyTarget(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.notify.IPSDENotifyTarget.class, this.getPSDENotifyTargets(), objKey, bTryMode);
	}
	public void setPSDENotifyTargets(java.util.List<net.ibizsys.model.dataentity.notify.IPSDENotifyTarget> list){
		this.psdenotifytars = list;
	}
	private net.ibizsys.model.msg.IPSSysMsgQueue pssysmsgqueue;

	public net.ibizsys.model.msg.IPSSysMsgQueue getPSSysMsgQueue(){
		if(this.pssysmsgqueue != null) return this.pssysmsgqueue;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSMSGQUEUE);
		if(value == null){
			return null;
		}
		this.pssysmsgqueue = getPSModelObject(net.ibizsys.model.msg.IPSSysMsgQueue.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSMSGQUEUE);
		return this.pssysmsgqueue;
	}

	public net.ibizsys.model.msg.IPSSysMsgQueue getPSSysMsgQueueMust(){
		net.ibizsys.model.msg.IPSSysMsgQueue value = this.getPSSysMsgQueue();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统消息队列");}
		return value;
	}

	public void setPSSysMsgQueue(net.ibizsys.model.msg.IPSSysMsgQueue pssysmsgqueue){
		this.pssysmsgqueue = pssysmsgqueue;
	}

	private net.ibizsys.model.msg.IPSSysMsgTempl pssysmsgtempl;

	public net.ibizsys.model.msg.IPSSysMsgTempl getPSSysMsgTempl(){
		if(this.pssysmsgtempl != null) return this.pssysmsgtempl;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSMSGTEMPL);
		if(value == null){
			return null;
		}
		this.pssysmsgtempl = getPSModelObject(net.ibizsys.model.msg.IPSSysMsgTempl.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSMSGTEMPL);
		return this.pssysmsgtempl;
	}

	public net.ibizsys.model.msg.IPSSysMsgTempl getPSSysMsgTemplMust(){
		net.ibizsys.model.msg.IPSSysMsgTempl value = this.getPSSysMsgTempl();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统消息模板");}
		return value;
	}

	public void setPSSysMsgTempl(net.ibizsys.model.msg.IPSSysMsgTempl pssysmsgtempl){
		this.pssysmsgtempl = pssysmsgtempl;
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


	public int getTaskMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTASKMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getThreadMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTHREADMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public boolean isIgnoreException(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISIGNOREEXCEPTION);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isTemplate(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISTEMPLATE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isTimerMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISTIMERMODE);
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
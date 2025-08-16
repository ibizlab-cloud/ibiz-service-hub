package net.ibizsys.model.msg;



public class PSSysMsgQueueImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.msg.IPSSysMsgQueue{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCONTENTPSDEFIELD = "getContentPSDEField";
	public final static String ATTR_GETDDCONTENTPSDEFIELD = "getDDContentPSDEField";
	public final static String ATTR_GETFILEPSDEFIELD = "getFilePSDEField";
	public final static String ATTR_GETIMCONTENTPSDEFIELD = "getIMContentPSDEField";
	public final static String ATTR_GETMOBTASKURLPSDEFIELD = "getMobTaskUrlPSDEField";
	public final static String ATTR_GETMSGQUEUEPARAMS = "msgQueueParams";
	public final static String ATTR_GETMSGQUEUETAG = "msgQueueTag";
	public final static String ATTR_GETMSGQUEUETAG2 = "msgQueueTag2";
	public final static String ATTR_GETMSGQUEUETYPE = "msgQueueType";
	public final static String ATTR_GETMSGTYPEPSDEFIELD = "getMsgTypePSDEField";
	public final static String ATTR_GETPSDATAENTITY = "getPSDataEntity";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSUTIL = "getPSSysUtil";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";
	public final static String ATTR_GETSMSCONTENTPSDEFIELD = "getSMSContentPSDEField";
	public final static String ATTR_GETSENDTIMEPSDEFIELD = "getSendTimePSDEField";
	public final static String ATTR_GETSTATEPSDEFIELD = "getStatePSDEField";
	public final static String ATTR_GETTAG2PSDEFIELD = "getTag2PSDEField";
	public final static String ATTR_GETTAGPSDEFIELD = "getTagPSDEField";
	public final static String ATTR_GETTARGETPSDEFIELD = "getTargetPSDEField";
	public final static String ATTR_GETTARGETTYPEPSDEFIELD = "getTargetTypePSDEField";
	public final static String ATTR_GETTASKURLPSDEFIELD = "getTaskUrlPSDEField";
	public final static String ATTR_GETTITLEPSDEFIELD = "getTitlePSDEField";
	public final static String ATTR_GETWXCONTENTPSDEFIELD = "getWXContentPSDEField";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField contentpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getContentPSDEField(){
		if(this.contentpsdefield != null) return this.contentpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.contentpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.contentpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getContentPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getContentPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定消息内容值存储属性");}
		return value;
	}

	public void setContentPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField contentpsdefield){
		this.contentpsdefield = contentpsdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField ddcontentpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getDDContentPSDEField(){
		if(this.ddcontentpsdefield != null) return this.ddcontentpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDDCONTENTPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.ddcontentpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.ddcontentpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getDDContentPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getDDContentPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定钉钉消息内容值存储属性");}
		return value;
	}

	public void setDDContentPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField ddcontentpsdefield){
		this.ddcontentpsdefield = ddcontentpsdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField filepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getFilePSDEField(){
		if(this.filepsdefield != null) return this.filepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFILEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.filepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.filepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getFilePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getFilePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定文件值存储属性");}
		return value;
	}

	public void setFilePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField filepsdefield){
		this.filepsdefield = filepsdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField imcontentpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getIMContentPSDEField(){
		if(this.imcontentpsdefield != null) return this.imcontentpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETIMCONTENTPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.imcontentpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.imcontentpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getIMContentPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getIMContentPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定即时消息内容值存储属性");}
		return value;
	}

	public void setIMContentPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField imcontentpsdefield){
		this.imcontentpsdefield = imcontentpsdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField mobtaskurlpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getMobTaskUrlPSDEField(){
		if(this.mobtaskurlpsdefield != null) return this.mobtaskurlpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMOBTASKURLPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.mobtaskurlpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.mobtaskurlpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getMobTaskUrlPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getMobTaskUrlPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定移动端任务操作路径值存储属性");}
		return value;
	}

	public void setMobTaskUrlPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField mobtaskurlpsdefield){
		this.mobtaskurlpsdefield = mobtaskurlpsdefield;
	}


	public com.fasterxml.jackson.databind.node.ObjectNode getMsgQueueParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMSGQUEUEPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getMsgQueueTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMSGQUEUETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMsgQueueTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMSGQUEUETAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMsgQueueType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMSGQUEUETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField msgtypepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getMsgTypePSDEField(){
		if(this.msgtypepsdefield != null) return this.msgtypepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMSGTYPEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.msgtypepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.msgtypepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getMsgTypePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getMsgTypePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定消息类型值存储属性");}
		return value;
	}

	public void setMsgTypePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField msgtypepsdefield){
		this.msgtypepsdefield = msgtypepsdefield;
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

	private net.ibizsys.model.res.IPSSysUtil pssysutil;

	public net.ibizsys.model.res.IPSSysUtil getPSSysUtil(){
		if(this.pssysutil != null) return this.pssysutil;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSUTIL);
		if(value == null){
			return null;
		}
		this.pssysutil = getPSModelObject(net.ibizsys.model.res.IPSSysUtil.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSUTIL);
		return this.pssysutil;
	}

	public net.ibizsys.model.res.IPSSysUtil getPSSysUtilMust(){
		net.ibizsys.model.res.IPSSysUtil value = this.getPSSysUtil();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定相关系统功能组件");}
		return value;
	}

	public void setPSSysUtil(net.ibizsys.model.res.IPSSysUtil pssysutil){
		this.pssysutil = pssysutil;
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

	private net.ibizsys.model.dataentity.defield.IPSDEField smscontentpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getSMSContentPSDEField(){
		if(this.smscontentpsdefield != null) return this.smscontentpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSMSCONTENTPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.smscontentpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.smscontentpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getSMSContentPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getSMSContentPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定短消息内容值存储属性");}
		return value;
	}

	public void setSMSContentPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField smscontentpsdefield){
		this.smscontentpsdefield = smscontentpsdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField sendtimepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getSendTimePSDEField(){
		if(this.sendtimepsdefield != null) return this.sendtimepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSENDTIMEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.sendtimepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.sendtimepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getSendTimePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getSendTimePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定消息发送时间值存储属性");}
		return value;
	}

	public void setSendTimePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField sendtimepsdefield){
		this.sendtimepsdefield = sendtimepsdefield;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定消息状态值存储属性");}
		return value;
	}

	public void setStatePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField statepsdefield){
		this.statepsdefield = statepsdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField tag2psdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getTag2PSDEField(){
		if(this.tag2psdefield != null) return this.tag2psdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTAG2PSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.tag2psdefield = ipsdataentity.getPSDEField(value, false);
		return this.tag2psdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getTag2PSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getTag2PSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定消息标记2值存储属性");}
		return value;
	}

	public void setTag2PSDEField(net.ibizsys.model.dataentity.defield.IPSDEField tag2psdefield){
		this.tag2psdefield = tag2psdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField tagpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getTagPSDEField(){
		if(this.tagpsdefield != null) return this.tagpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTAGPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.tagpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.tagpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getTagPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getTagPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定消息标记值存储属性");}
		return value;
	}

	public void setTagPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField tagpsdefield){
		this.tagpsdefield = tagpsdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField tarpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getTargetPSDEField(){
		if(this.tarpsdefield != null) return this.tarpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTARGETPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.tarpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.tarpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getTargetPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getTargetPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标标识值存储属性");}
		return value;
	}

	public void setTargetPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField tarpsdefield){
		this.tarpsdefield = tarpsdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField tartypepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getTargetTypePSDEField(){
		if(this.tartypepsdefield != null) return this.tartypepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTARGETTYPEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.tartypepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.tartypepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getTargetTypePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getTargetTypePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标类型值存储属性");}
		return value;
	}

	public void setTargetTypePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField tartypepsdefield){
		this.tartypepsdefield = tartypepsdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField taskurlpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getTaskUrlPSDEField(){
		if(this.taskurlpsdefield != null) return this.taskurlpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTASKURLPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.taskurlpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.taskurlpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getTaskUrlPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getTaskUrlPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定任务操作路径值存储属性");}
		return value;
	}

	public void setTaskUrlPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField taskurlpsdefield){
		this.taskurlpsdefield = taskurlpsdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField titlepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getTitlePSDEField(){
		if(this.titlepsdefield != null) return this.titlepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTITLEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.titlepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.titlepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getTitlePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getTitlePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定消息标题值存储属性");}
		return value;
	}

	public void setTitlePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField titlepsdefield){
		this.titlepsdefield = titlepsdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField wxcontentpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getWXContentPSDEField(){
		if(this.wxcontentpsdefield != null) return this.wxcontentpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWXCONTENTPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.wxcontentpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.wxcontentpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getWXContentPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getWXContentPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定微信消息内容值存储属性");}
		return value;
	}

	public void setWXContentPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField wxcontentpsdefield){
		this.wxcontentpsdefield = wxcontentpsdefield;
	}

}
package net.ibizsys.model.msg;



public class PSSysMsgTemplImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.msg.IPSSysMsgTempl{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCONTENT = "content";
	public final static String ATTR_GETCONTENTPSDEFIELD = "getContentPSDEField";
	public final static String ATTR_GETCONTENTPSLANGUAGERES = "getContentPSLanguageRes";
	public final static String ATTR_GETCONTENTTYPE = "contentType";
	public final static String ATTR_GETCONTENTTYPEPSDEFIELD = "getContentTypePSDEField";
	public final static String ATTR_GETDDCONTENT = "dDContent";
	public final static String ATTR_GETDDCONTENTPSDEFIELD = "getDDContentPSDEField";
	public final static String ATTR_GETDDPSLANGUAGERES = "getDDPSLanguageRes";
	public final static String ATTR_GETIMCONTENT = "iMContent";
	public final static String ATTR_GETIMCONTENTPSDEFIELD = "getIMContentPSDEField";
	public final static String ATTR_GETIMPSLANGUAGERES = "getIMPSLanguageRes";
	public final static String ATTR_GETLANPSDEFIELD = "getLanPSDEField";
	public final static String ATTR_GETMOBTASKURL = "mobTaskUrl";
	public final static String ATTR_GETMOBTASKURLPSDEFIELD = "getMobTaskUrlPSDEField";
	public final static String ATTR_GETMSGTEMPLPARAMS = "msgTemplParams";
	public final static String ATTR_GETMSGTEMPLTAG = "msgTemplTag";
	public final static String ATTR_GETMSGTEMPLTAG2 = "msgTemplTag2";
	public final static String ATTR_GETMSGTEMPLTYPE = "msgTemplType";
	public final static String ATTR_GETPSDEDATASET = "getPSDEDataSet";
	public final static String ATTR_GETPSDATAENTITY = "getPSDataEntity";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";
	public final static String ATTR_GETSMSCONTENT = "sMSContent";
	public final static String ATTR_GETSMSCONTENTPSDEFIELD = "getSMSContentPSDEField";
	public final static String ATTR_GETSMSPSLANGUAGERES = "getSMSPSLanguageRes";
	public final static String ATTR_GETSCRIPTCODE = "scriptCode";
	public final static String ATTR_GETSCRIPTMODE = "scriptMode";
	public final static String ATTR_GETSUBPSLANGUAGERES = "getSubPSLanguageRes";
	public final static String ATTR_GETSUBJECT = "subject";
	public final static String ATTR_GETSUBJECTPSDEFIELD = "getSubjectPSDEField";
	public final static String ATTR_GETTASKURL = "taskUrl";
	public final static String ATTR_GETTASKURLPSDEFIELD = "getTaskUrlPSDEField";
	public final static String ATTR_GETTEMPLENGINE = "templEngine";
	public final static String ATTR_GETTEMPLTAGPSDEFIELD = "getTemplTagPSDEField";
	public final static String ATTR_GETUSER2PSDEFIELD = "getUser2PSDEField";
	public final static String ATTR_GETUSERPSDEFIELD = "getUserPSDEField";
	public final static String ATTR_GETWXCONTENT = "wXContent";
	public final static String ATTR_GETWXCONTENTPSDEFIELD = "getWXContentPSDEField";
	public final static String ATTR_GETWXPSLANGUAGERES = "getWXPSLanguageRes";
	public final static String ATTR_ISMAILGROUPSEND = "mailGroupSend";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getContent(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENT);
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定模板内容值存储属性");}
		return value;
	}

	public void setContentPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField contentpsdefield){
		this.contentpsdefield = contentpsdefield;
	}

	private net.ibizsys.model.res.IPSLanguageRes contentpslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getContentPSLanguageRes(){
		if(this.contentpslanguageres != null) return this.contentpslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.contentpslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETCONTENTPSLANGUAGERES);
		return this.contentpslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getContentPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getContentPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定内容多语言资源对象");}
		return value;
	}

	public void setContentPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes contentpslanguageres){
		this.contentpslanguageres = contentpslanguageres;
	}


	public java.lang.String getContentType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField contenttypepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getContentTypePSDEField(){
		if(this.contenttypepsdefield != null) return this.contenttypepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTTYPEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.contenttypepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.contenttypepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getContentTypePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getContentTypePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定内容类型值存储属性");}
		return value;
	}

	public void setContentTypePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField contenttypepsdefield){
		this.contenttypepsdefield = contenttypepsdefield;
	}


	public java.lang.String getDDContent(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDDCONTENT);
		if(value == null){
			return null;
		}
		return value.asText();
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定钉钉消息模板内容值存储属性");}
		return value;
	}

	public void setDDContentPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField ddcontentpsdefield){
		this.ddcontentpsdefield = ddcontentpsdefield;
	}

	private net.ibizsys.model.res.IPSLanguageRes ddpslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getDDPSLanguageRes(){
		if(this.ddpslanguageres != null) return this.ddpslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDDPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.ddpslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETDDPSLANGUAGERES);
		return this.ddpslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getDDPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getDDPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定钉钉内容多语言资源对象");}
		return value;
	}

	public void setDDPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes ddpslanguageres){
		this.ddpslanguageres = ddpslanguageres;
	}


	public java.lang.String getIMContent(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETIMCONTENT);
		if(value == null){
			return null;
		}
		return value.asText();
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定即时消息模板内容值存储属性");}
		return value;
	}

	public void setIMContentPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField imcontentpsdefield){
		this.imcontentpsdefield = imcontentpsdefield;
	}

	private net.ibizsys.model.res.IPSLanguageRes impslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getIMPSLanguageRes(){
		if(this.impslanguageres != null) return this.impslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETIMPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.impslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETIMPSLANGUAGERES);
		return this.impslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getIMPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getIMPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定即时消息多语言资源对象");}
		return value;
	}

	public void setIMPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes impslanguageres){
		this.impslanguageres = impslanguageres;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField lanpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getLanPSDEField(){
		if(this.lanpsdefield != null) return this.lanpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLANPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.lanpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.lanpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getLanPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getLanPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定语言值存储属性");}
		return value;
	}

	public void setLanPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField lanpsdefield){
		this.lanpsdefield = lanpsdefield;
	}


	public java.lang.String getMobTaskUrl(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMOBTASKURL);
		if(value == null){
			return null;
		}
		return value.asText();
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定移动端任务路径值存储属性");}
		return value;
	}

	public void setMobTaskUrlPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField mobtaskurlpsdefield){
		this.mobtaskurlpsdefield = mobtaskurlpsdefield;
	}


	public com.fasterxml.jackson.databind.node.ObjectNode getMsgTemplParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMSGTEMPLPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getMsgTemplTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMSGTEMPLTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMsgTemplTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMSGTEMPLTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMsgTemplType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMSGTEMPLTYPE);
		if(value == null){
			return "STATIC";
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.ds.IPSDEDataSet psdedataset;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet(){
		if(this.psdedataset != null) return this.psdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATASET);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.psdedataset = ipsdataentity.getPSDEDataSet(value, false);
		return this.psdedataset;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getPSDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标数据集");}
		return value;
	}

	public void setPSDEDataSet(net.ibizsys.model.dataentity.ds.IPSDEDataSet psdedataset){
		this.psdedataset = psdedataset;
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


	public java.lang.String getSMSContent(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSMSCONTENT);
		if(value == null){
			return null;
		}
		return value.asText();
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定短消息模板内容值存储属性");}
		return value;
	}

	public void setSMSContentPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField smscontentpsdefield){
		this.smscontentpsdefield = smscontentpsdefield;
	}

	private net.ibizsys.model.res.IPSLanguageRes smspslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getSMSPSLanguageRes(){
		if(this.smspslanguageres != null) return this.smspslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSMSPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.smspslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETSMSPSLANGUAGERES);
		return this.smspslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getSMSPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getSMSPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定短消息多语言资源对象");}
		return value;
	}

	public void setSMSPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes smspslanguageres){
		this.smspslanguageres = smspslanguageres;
	}


	public java.lang.String getScriptCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSCRIPTCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getScriptMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSCRIPTMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.res.IPSLanguageRes subpslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getSubPSLanguageRes(){
		if(this.subpslanguageres != null) return this.subpslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSUBPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.subpslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETSUBPSLANGUAGERES);
		return this.subpslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getSubPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getSubPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定标题多语言资源对象");}
		return value;
	}

	public void setSubPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes subpslanguageres){
		this.subpslanguageres = subpslanguageres;
	}


	public java.lang.String getSubject(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSUBJECT);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField subjectpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getSubjectPSDEField(){
		if(this.subjectpsdefield != null) return this.subjectpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSUBJECTPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.subjectpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.subjectpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getSubjectPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getSubjectPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定标题值存储属性");}
		return value;
	}

	public void setSubjectPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField subjectpsdefield){
		this.subjectpsdefield = subjectpsdefield;
	}


	public java.lang.String getTaskUrl(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTASKURL);
		if(value == null){
			return null;
		}
		return value.asText();
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定任务路径值存储属性");}
		return value;
	}

	public void setTaskUrlPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField taskurlpsdefield){
		this.taskurlpsdefield = taskurlpsdefield;
	}


	public java.lang.String getTemplEngine(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEMPLENGINE);
		if(value == null){
			return "FREEMARKER";
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField templtagpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getTemplTagPSDEField(){
		if(this.templtagpsdefield != null) return this.templtagpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEMPLTAGPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.templtagpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.templtagpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getTemplTagPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getTemplTagPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定模板标记值存储属性");}
		return value;
	}

	public void setTemplTagPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField templtagpsdefield){
		this.templtagpsdefield = templtagpsdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField user2psdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getUser2PSDEField(){
		if(this.user2psdefield != null) return this.user2psdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSER2PSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.user2psdefield = ipsdataentity.getPSDEField(value, false);
		return this.user2psdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getUser2PSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getUser2PSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定用户自定义2值存储属性");}
		return value;
	}

	public void setUser2PSDEField(net.ibizsys.model.dataentity.defield.IPSDEField user2psdefield){
		this.user2psdefield = user2psdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField userpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getUserPSDEField(){
		if(this.userpsdefield != null) return this.userpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.userpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.userpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getUserPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getUserPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定用户自定义值存储属性");}
		return value;
	}

	public void setUserPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField userpsdefield){
		this.userpsdefield = userpsdefield;
	}


	public java.lang.String getWXContent(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWXCONTENT);
		if(value == null){
			return null;
		}
		return value.asText();
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定微信消息模板内容值存储属性");}
		return value;
	}

	public void setWXContentPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField wxcontentpsdefield){
		this.wxcontentpsdefield = wxcontentpsdefield;
	}

	private net.ibizsys.model.res.IPSLanguageRes wxpslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getWXPSLanguageRes(){
		if(this.wxpslanguageres != null) return this.wxpslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWXPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.wxpslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETWXPSLANGUAGERES);
		return this.wxpslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getWXPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getWXPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定微信内容多语言资源对象");}
		return value;
	}

	public void setWXPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes wxpslanguageres){
		this.wxpslanguageres = wxpslanguageres;
	}


	public boolean isMailGroupSend(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISMAILGROUPSEND);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
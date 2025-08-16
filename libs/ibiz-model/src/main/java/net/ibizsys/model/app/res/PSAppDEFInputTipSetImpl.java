package net.ibizsys.model.app.res;



public class PSAppDEFInputTipSetImpl extends net.ibizsys.model.app.PSApplicationObjectImpl implements net.ibizsys.model.app.res.IPSAppDEFInputTipSet{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCONTENTPSAPPDEFIELD = "getContentPSAppDEField";
	public final static String ATTR_GETDYNAINSTMODE = "dynaInstMode";
	public final static String ATTR_GETDYNAINSTTAG = "dynaInstTag";
	public final static String ATTR_GETDYNAINSTTAG2 = "dynaInstTag2";
	public final static String ATTR_GETENABLECLOSEPSAPPDEFIELD = "getEnableClosePSAppDEField";
	public final static String ATTR_GETLINKPSAPPDEFIELD = "getLinkPSAppDEField";
	public final static String ATTR_GETMEMO = "memo";
	public final static String ATTR_GETPSAPPDEDATASET = "getPSAppDEDataSet";
	public final static String ATTR_GETPSAPPDATAENTITY = "getPSAppDataEntity";
	public final static String ATTR_GETPSSYSPFPLUGIN = "getPSSysPFPlugin";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";
	public final static String ATTR_GETUNIQUETAG = "uniqueTag";
	public final static String ATTR_GETUNIQUETAGPSAPPDEFIELD = "getUniqueTagPSAppDEField";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField contentpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getContentPSAppDEField(){
		if(this.contentpsappdefield != null) return this.contentpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.contentpsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.contentpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getContentPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getContentPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定内容应用实体属性");}
		return value;
	}

	public void setContentPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField contentpsappdefield){
		this.contentpsappdefield = contentpsappdefield;
	}


	public int getDynaInstMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAINSTMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getDynaInstTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAINSTTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDynaInstTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAINSTTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField enableclosepsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getEnableClosePSAppDEField(){
		if(this.enableclosepsappdefield != null) return this.enableclosepsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENABLECLOSEPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.enableclosepsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.enableclosepsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getEnableClosePSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getEnableClosePSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定关闭标志应用实体属性");}
		return value;
	}

	public void setEnableClosePSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField enableclosepsappdefield){
		this.enableclosepsappdefield = enableclosepsappdefield;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField linkpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getLinkPSAppDEField(){
		if(this.linkpsappdefield != null) return this.linkpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLINKPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.linkpsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.linkpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getLinkPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getLinkPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定链接应用实体属性");}
		return value;
	}

	public void setLinkPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField linkpsappdefield){
		this.linkpsappdefield = linkpsappdefield;
	}


	@Deprecated
	public java.lang.String getMemo(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMEMO);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEDataSet psappdedataset;

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSet(){
		if(this.psappdedataset != null) return this.psappdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEDATASET);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.psappdedataset = ipsappdataentity.getPSAppDEDataSet(value, false);
		return this.psappdedataset;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSetMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEDataSet value = this.getPSAppDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体数据集合");}
		return value;
	}

	public void setPSAppDEDataSet(net.ibizsys.model.app.dataentity.IPSAppDEDataSet psappdedataset){
		this.psappdedataset = psappdedataset;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDataEntity psappdataentity;

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity(){
		if(this.psappdataentity != null) return this.psappdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDATAENTITY);
		if(value == null){
			return null;
		}
		this.psappdataentity = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPDATAENTITY);
		return this.psappdataentity;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust(){
		net.ibizsys.model.app.dataentity.IPSAppDataEntity value = this.getPSAppDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体");}
		return value;
	}

	public void setPSAppDataEntity(net.ibizsys.model.app.dataentity.IPSAppDataEntity psappdataentity){
		this.psappdataentity = psappdataentity;
	}

	private net.ibizsys.model.res.IPSSysPFPlugin pssyspfplugin;

	public net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin(){
		if(this.pssyspfplugin != null) return this.pssyspfplugin;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSPFPLUGIN);
		if(value == null){
			return null;
		}
		this.pssyspfplugin = getPSModelObject(net.ibizsys.model.res.IPSSysPFPlugin.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSPFPLUGIN);
		return this.pssyspfplugin;
	}

	public net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust(){
		net.ibizsys.model.res.IPSSysPFPlugin value = this.getPSSysPFPlugin();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定前端扩展插件");}
		return value;
	}

	public void setPSSysPFPlugin(net.ibizsys.model.res.IPSSysPFPlugin pssyspfplugin){
		this.pssyspfplugin = pssyspfplugin;
	}

	private net.ibizsys.model.res.IPSSysSFPlugin pssyssfplugin;

	@Deprecated
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "[getPSSysSFPlugin]返回空值");}
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


	public java.lang.String getUniqueTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNIQUETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField uniquetagpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getUniqueTagPSAppDEField(){
		if(this.uniquetagpsappdefield != null) return this.uniquetagpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNIQUETAGPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.uniquetagpsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.uniquetagpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getUniqueTagPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getUniqueTagPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定唯一标记应用实体属性");}
		return value;
	}

	public void setUniqueTagPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField uniquetagpsappdefield){
		this.uniquetagpsappdefield = uniquetagpsappdefield;
	}

}
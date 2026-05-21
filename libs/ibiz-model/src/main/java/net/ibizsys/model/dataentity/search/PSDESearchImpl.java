package net.ibizsys.model.dataentity.search;



public class PSDESearchImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.search.IPSDESearch{

	public final static String ATTR_GETDETAG = "dETag";
	public final static String ATTR_GETDETAG2 = "dETag2";
	public final static String ATTR_GETLOGPSDATAENTITY = "getLogPSDataEntity";
	public final static String ATTR_GETPSDEDATASET = "getPSDEDataSet";
	public final static String ATTR_GETPSSYSMSGTEMPL = "getPSSysMsgTempl";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSSEARCHDE = "getPSSysSearchDE";
	public final static String ATTR_GETPSSYSSEARCHSCHEME = "getPSSysSearchScheme";
	public final static String ATTR_GETSTATEPSDEFIELD = "getStatePSDEField";
	public final static String ATTR_GETTHREADMODE = "threadMode";
	public final static String ATTR_ISENABLEUNIONKEYVALUE = "enableUnionKeyValue";
	public final static String ATTR_ISNOSQLSTORAGE = "noSQLStorage";
	public final static String ATTR_ISTIMERMODE = "timerMode";

	public java.lang.String getDETag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDETag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDETAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.IPSDataEntity logpsdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getLogPSDataEntity(){
		if(this.logpsdataentity != null) return this.logpsdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLOGPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.logpsdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETLOGPSDATAENTITY);
		return this.logpsdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getLogPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getLogPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定日志存储实体对象");}
		return value;
	}

	public void setLogPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity logpsdataentity){
		this.logpsdataentity = logpsdataentity;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定文档模板");}
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

	private net.ibizsys.model.search.IPSSysSearchDE pssyssearchde;

	public net.ibizsys.model.search.IPSSysSearchDE getPSSysSearchDE(){
		if(this.pssyssearchde != null) return this.pssyssearchde;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSSEARCHDE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.search.IPSSysSearchScheme ipssyssearchscheme = this.getPSSysSearchSchemeMust();
		this.pssyssearchde = ipssyssearchscheme.getPSSysSearchDE(value, false);
		return this.pssyssearchde;
	}

	public net.ibizsys.model.search.IPSSysSearchDE getPSSysSearchDEMust(){
		net.ibizsys.model.search.IPSSysSearchDE value = this.getPSSysSearchDE();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定全文检索实体");}
		return value;
	}

	public void setPSSysSearchDE(net.ibizsys.model.search.IPSSysSearchDE pssyssearchde){
		this.pssyssearchde = pssyssearchde;
	}

	private net.ibizsys.model.search.IPSSysSearchScheme pssyssearchscheme;

	public net.ibizsys.model.search.IPSSysSearchScheme getPSSysSearchScheme(){
		if(this.pssyssearchscheme != null) return this.pssyssearchscheme;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSSEARCHSCHEME);
		if(value == null){
			return null;
		}
		this.pssyssearchscheme = getPSModelObject(net.ibizsys.model.search.IPSSysSearchScheme.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSSEARCHSCHEME);
		return this.pssyssearchscheme;
	}

	public net.ibizsys.model.search.IPSSysSearchScheme getPSSysSearchSchemeMust(){
		net.ibizsys.model.search.IPSSysSearchScheme value = this.getPSSysSearchScheme();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定全文检索体系");}
		return value;
	}

	public void setPSSysSearchScheme(net.ibizsys.model.search.IPSSysSearchScheme pssyssearchscheme){
		this.pssyssearchscheme = pssyssearchscheme;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField statepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getStatePSDEField(){
		if(this.statepsdefield != null) return this.statepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTATEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.statepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.statepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getStatePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getStatePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定状态值存储属性");}
		return value;
	}

	public void setStatePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField statepsdefield){
		this.statepsdefield = statepsdefield;
	}


	public int getThreadMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTHREADMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public boolean isEnableUnionKeyValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEUNIONKEYVALUE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isNoSQLStorage(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISNOSQLSTORAGE);
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
}
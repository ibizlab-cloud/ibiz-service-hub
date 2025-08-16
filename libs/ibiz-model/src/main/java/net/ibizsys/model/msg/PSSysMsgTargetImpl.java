package net.ibizsys.model.msg;



public class PSSysMsgTargetImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.msg.IPSSysMsgTarget{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETMSGTARGETPARAMS = "msgTargetParams";
	public final static String ATTR_GETMSGTARGETTAG = "msgTargetTag";
	public final static String ATTR_GETMSGTARGETTAG2 = "msgTargetTag2";
	public final static String ATTR_GETMSGTARGETTYPE = "msgTargetType";
	public final static String ATTR_GETPSDEDATASET = "getPSDEDataSet";
	public final static String ATTR_GETPSDATAENTITY = "getPSDataEntity";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSUTIL = "getPSSysUtil";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";
	public final static String ATTR_GETTARGETPSDEFIELD = "getTargetPSDEField";
	public final static String ATTR_GETTARGETTYPEPSDEFIELD = "getTargetTypePSDEField";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getMsgTargetParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMSGTARGETPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getMsgTargetTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMSGTARGETTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMsgTargetTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMSGTARGETTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMsgTargetType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMSGTARGETTYPE);
		if(value == null){
			return null;
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

}
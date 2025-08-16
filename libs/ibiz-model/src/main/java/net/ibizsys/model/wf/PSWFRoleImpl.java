package net.ibizsys.model.wf;



public class PSWFRoleImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.wf.IPSWFRole
		,net.ibizsys.model.wf.IPSWFDEDataSetRole{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETPSDEDATASET = "getPSDEDataSet";
	public final static String ATTR_GETPSDATAENTITY = "getPSDataEntity";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";
	public final static String ATTR_GETUNIQUETAG = "uniqueTag";
	public final static String ATTR_GETUSERDATA = "userData";
	public final static String ATTR_GETUSERDATA2 = "userData2";
	public final static String ATTR_GETWFROLESN = "wFRoleSN";
	public final static String ATTR_GETWFROLETYPE = "wFRoleType";
	public final static String ATTR_GETWFUSERIDPSDEF = "getWFUserIdPSDEF";
	public final static String ATTR_GETWFUSERNAMEPSDEF = "getWFUserNamePSDEF";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定数据源数据集合");}
		return value;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定数据源实体对象");}
		return value;
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


	public java.lang.String getUniqueTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNIQUETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUserData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERDATA);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUserData2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERDATA2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getWFRoleSN(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFROLESN);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getWFRoleType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFROLETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField wfuseridpsdef;

	public net.ibizsys.model.dataentity.defield.IPSDEField getWFUserIdPSDEF(){
		if(this.wfuseridpsdef != null) return this.wfuseridpsdef;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFUSERIDPSDEF);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.wfuseridpsdef = ipsdataentity.getPSDEField(value, false);
		return this.wfuseridpsdef;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getWFUserIdPSDEFMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getWFUserIdPSDEF();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定流程用户标识存储属性");}
		return value;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField wfusernamepsdef;

	public net.ibizsys.model.dataentity.defield.IPSDEField getWFUserNamePSDEF(){
		if(this.wfusernamepsdef != null) return this.wfusernamepsdef;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFUSERNAMEPSDEF);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.wfusernamepsdef = ipsdataentity.getPSDEField(value, false);
		return this.wfusernamepsdef;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getWFUserNamePSDEFMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getWFUserNamePSDEF();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定流程用户名称存储属性");}
		return value;
	}

}
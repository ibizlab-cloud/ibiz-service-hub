package net.ibizsys.model.security;



public class PSSysUserRoleImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.security.IPSSysUserRole{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDEFAULTUSER = "defaultUser";
	public final static String ATTR_GETPSDEDATASET = "getPSDEDataSet";
	public final static String ATTR_GETPSDATAENTITY = "getPSDataEntity";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSUSERROLEDATAS = "getPSSysUserRoleDatas";
	public final static String ATTR_GETPSSYSUSERROLERESES = "getPSSysUserRoleReses";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";
	public final static String ATTR_GETROLETAG = "roleTag";
	public final static String ATTR_GETROLETAGPSDEFIELD = "getRoleTagPSDEField";
	public final static String ATTR_GETROLETYPE = "roleType";
	public final static String ATTR_GETUNIRESTAGS = "uniResTags";
	public final static String ATTR_GETUSERIDPSDEFIELD = "getUserIdPSDEField";
	public final static String ATTR_ISGLOBALROLE = "globalRole";
	public final static String ATTR_ISSYSTEMRESERVED = "systemReserved";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDefaultUser(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTUSER);
		if(value == null){
			return "NONE";
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
		this.psdedataset = this.getPSDataEntityMust().getPSDEDataSet(value, false);
		return this.psdedataset;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getPSDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体数据集对象");}
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


	private java.util.List<net.ibizsys.model.security.IPSSysUserRoleData> pssysuserroledatas = null;
	public java.util.List<net.ibizsys.model.security.IPSSysUserRoleData> getPSSysUserRoleDatas(){
		if(this.pssysuserroledatas == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSUSERROLEDATAS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.security.IPSSysUserRoleData> list = new java.util.ArrayList<net.ibizsys.model.security.IPSSysUserRoleData>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.security.IPSSysUserRoleData obj = this.getPSModelObject(net.ibizsys.model.security.IPSSysUserRoleData.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSSYSUSERROLEDATAS);
				if(obj!=null)list.add(obj);
			}
			this.pssysuserroledatas = list;
		}
		return (this.pssysuserroledatas.size() == 0)? null : this.pssysuserroledatas;
	}

	public net.ibizsys.model.security.IPSSysUserRoleData getPSSysUserRoleData(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.security.IPSSysUserRoleData.class, this.getPSSysUserRoleDatas(), objKey, bTryMode);
	}
	public void setPSSysUserRoleData(java.util.List<net.ibizsys.model.security.IPSSysUserRoleData> list){
		this.pssysuserroledatas = list;
	}

	private java.util.List<net.ibizsys.model.security.IPSSysUserRoleRes> pssysuserrolereses = null;
	public java.util.List<net.ibizsys.model.security.IPSSysUserRoleRes> getPSSysUserRoleReses(){
		if(this.pssysuserrolereses == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSUSERROLERESES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.security.IPSSysUserRoleRes> list = new java.util.ArrayList<net.ibizsys.model.security.IPSSysUserRoleRes>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.security.IPSSysUserRoleRes obj = this.getPSModelObject(net.ibizsys.model.security.IPSSysUserRoleRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSSYSUSERROLERESES);
				if(obj!=null)list.add(obj);
			}
			this.pssysuserrolereses = list;
		}
		return (this.pssysuserrolereses.size() == 0)? null : this.pssysuserrolereses;
	}

	public net.ibizsys.model.security.IPSSysUserRoleRes getPSSysUserRoleRes(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.security.IPSSysUserRoleRes.class, this.getPSSysUserRoleReses(), objKey, bTryMode);
	}
	public void setPSSysUserRoleRes(java.util.List<net.ibizsys.model.security.IPSSysUserRoleRes> list){
		this.pssysuserrolereses = list;
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


	public java.lang.String getRoleTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETROLETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField roletagpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getRoleTagPSDEField(){
		if(this.roletagpsdefield != null) return this.roletagpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETROLETAGPSDEFIELD);
		if(value == null){
			return null;
		}
		this.roletagpsdefield = this.getPSDataEntityMust().getPSDEField(value, false);
		return this.roletagpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getRoleTagPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getRoleTagPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定角色标记实体属性对象");}
		return value;
	}

	public void setRoleTagPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField roletagpsdefield){
		this.roletagpsdefield = roletagpsdefield;
	}


	public java.lang.String getRoleType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETROLETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<java.lang.String> unirestags = null;
	public java.util.List<java.lang.String> getUniResTags(){
		if(this.unirestags == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNIRESTAGS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
			for(int i = 0;i<arrayNode.size();i++) {
				list.add(arrayNode.get(i).asText());
			}
			this.unirestags = list;
		}
		return (this.unirestags.size() == 0)? null : this.unirestags;
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField useridpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getUserIdPSDEField(){
		if(this.useridpsdefield != null) return this.useridpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERIDPSDEFIELD);
		if(value == null){
			return null;
		}
		this.useridpsdefield = this.getPSDataEntityMust().getPSDEField(value, false);
		return this.useridpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getUserIdPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getUserIdPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定用户标识实体属性对象");}
		return value;
	}

	public void setUserIdPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField useridpsdefield){
		this.useridpsdefield = useridpsdefield;
	}


	public boolean isGlobalRole(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISGLOBALROLE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isSystemReserved(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSYSTEMRESERVED);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
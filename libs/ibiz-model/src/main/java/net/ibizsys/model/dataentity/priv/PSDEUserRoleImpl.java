package net.ibizsys.model.dataentity.priv;



public class PSDEUserRoleImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.priv.IPSDEUserRole
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCUSTOMCOND = "customCond";
	public final static String ATTR_GETCUSTOMDRMODE = "customDRMode";
	public final static String ATTR_GETCUSTOMDRMODE2 = "customDRMode2";
	public final static String ATTR_GETCUSTOMDRMODE2PARAM = "customDRMode2Param";
	public final static String ATTR_GETCUSTOMDRMODEPARAM = "customDRModeParam";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETORGDR = "orgDR";
	public final static String ATTR_GETPSDEDATASET = "getPSDEDataSet";
	public final static String ATTR_GETPSDEFGROUP = "getPSDEFGroup";
	public final static String ATTR_GETPSDEUSERROLEOPPRIVS = "getPSDEUserRoleOPPrivs";
	public final static String ATTR_GETPSSYSUSERDR = "getPSSysUserDR";
	public final static String ATTR_GETPSSYSUSERDR2 = "getPSSysUserDR2";
	public final static String ATTR_GETROLETAG = "roleTag";
	public final static String ATTR_GETSECBC = "secBC";
	public final static String ATTR_GETSECDR = "secDR";
	public final static String ATTR_GETUSERDRACTION = "userDRAction";
	public final static String ATTR_ISALLDATA = "allData";
	public final static String ATTR_ISDEFAULTMODE = "defaultMode";
	public final static String ATTR_ISENABLEORGDR = "enableOrgDR";
	public final static String ATTR_ISENABLESECBC = "enableSecBC";
	public final static String ATTR_ISENABLESECDR = "enableSecDR";
	public final static String ATTR_ISENABLEUSERDR = "enableUserDR";
	public final static String ATTR_ISSYSTEMRESERVED = "systemReserved";

	@Deprecated
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

	public java.lang.String getCustomDRMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCUSTOMDRMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCustomDRMode2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCUSTOMDRMODE2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCustomDRMode2Param(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCUSTOMDRMODE2PARAM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCustomDRModeParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCUSTOMDRMODEPARAM);
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

	public long getOrgDR(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORGDR);
		if(value == null){
			return 0;
		}
		return value.asLong();
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体数据集");}
		return value;
	}

	public void setPSDEDataSet(net.ibizsys.model.dataentity.ds.IPSDEDataSet psdedataset){
		this.psdedataset = psdedataset;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEFGroup psdefgroup;

	public net.ibizsys.model.dataentity.defield.IPSDEFGroup getPSDEFGroup(){
		if(this.psdefgroup != null) return this.psdefgroup;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFGROUP);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.psdefgroup = ipsdataentity.getPSDEFGroup(value, false);
		return this.psdefgroup;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEFGroup getPSDEFGroupMust(){
		net.ibizsys.model.dataentity.defield.IPSDEFGroup value = this.getPSDEFGroup();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定访问属性组");}
		return value;
	}

	public void setPSDEFGroup(net.ibizsys.model.dataentity.defield.IPSDEFGroup psdefgroup){
		this.psdefgroup = psdefgroup;
	}


	private java.util.List<net.ibizsys.model.dataentity.priv.IPSDEUserRoleOPPriv> psdeuserroleopprivs = null;
	public java.util.List<net.ibizsys.model.dataentity.priv.IPSDEUserRoleOPPriv> getPSDEUserRoleOPPrivs(){
		if(this.psdeuserroleopprivs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEUSERROLEOPPRIVS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.priv.IPSDEUserRoleOPPriv> list = new java.util.ArrayList<net.ibizsys.model.dataentity.priv.IPSDEUserRoleOPPriv>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.priv.IPSDEUserRoleOPPriv obj = this.getPSModelObject(net.ibizsys.model.dataentity.priv.IPSDEUserRoleOPPriv.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEUSERROLEOPPRIVS);
				if(obj!=null)list.add(obj);
			}
			this.psdeuserroleopprivs = list;
		}
		return (this.psdeuserroleopprivs.size() == 0)? null : this.psdeuserroleopprivs;
	}

	public net.ibizsys.model.dataentity.priv.IPSDEUserRoleOPPriv getPSDEUserRoleOPPriv(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.priv.IPSDEUserRoleOPPriv.class, this.getPSDEUserRoleOPPrivs(), objKey, bTryMode);
	}
	public void setPSDEUserRoleOPPrivs(java.util.List<net.ibizsys.model.dataentity.priv.IPSDEUserRoleOPPriv> list){
		this.psdeuserroleopprivs = list;
	}
	private net.ibizsys.model.security.IPSSysUserDR pssysuserdr;

	public net.ibizsys.model.security.IPSSysUserDR getPSSysUserDR(){
		if(this.pssysuserdr != null) return this.pssysuserdr;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSUSERDR);
		if(value == null){
			return null;
		}
		net.ibizsys.model.IPSSystem ipssystem = getParentPSModelObject(net.ibizsys.model.IPSSystem.class);
		this.pssysuserdr = ipssystem.getPSSysUserDR(value, false);
		return this.pssysuserdr;
	}

	public net.ibizsys.model.security.IPSSysUserDR getPSSysUserDRMust(){
		net.ibizsys.model.security.IPSSysUserDR value = this.getPSSysUserDR();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定用户数据范围对象");}
		return value;
	}

	public void setPSSysUserDR(net.ibizsys.model.security.IPSSysUserDR pssysuserdr){
		this.pssysuserdr = pssysuserdr;
	}

	private net.ibizsys.model.security.IPSSysUserDR pssysuserdr2;

	public net.ibizsys.model.security.IPSSysUserDR getPSSysUserDR2(){
		if(this.pssysuserdr2 != null) return this.pssysuserdr2;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSUSERDR2);
		if(value == null){
			return null;
		}
		net.ibizsys.model.IPSSystem ipssystem = getParentPSModelObject(net.ibizsys.model.IPSSystem.class);
		this.pssysuserdr2 = ipssystem.getPSSysUserDR(value, false);
		return this.pssysuserdr2;
	}

	public net.ibizsys.model.security.IPSSysUserDR getPSSysUserDR2Must(){
		net.ibizsys.model.security.IPSSysUserDR value = this.getPSSysUserDR2();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定用户数据范围对象2");}
		return value;
	}

	public void setPSSysUserDR2(net.ibizsys.model.security.IPSSysUserDR pssysuserdr2){
		this.pssysuserdr2 = pssysuserdr2;
	}


	public java.lang.String getRoleTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETROLETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSecBC(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSECBC);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public long getSecDR(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSECDR);
		if(value == null){
			return 0;
		}
		return value.asLong();
	}

	public java.lang.String getUserDRAction(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERDRACTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isAllData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISALLDATA);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isDefaultMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDEFAULTMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableOrgDR(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEORGDR);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableSecBC(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLESECBC);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableSecDR(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLESECDR);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableUserDR(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEUSERDR);
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
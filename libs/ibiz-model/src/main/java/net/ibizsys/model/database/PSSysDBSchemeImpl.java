package net.ibizsys.model.database;



public class PSSysDBSchemeImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.database.IPSSysDBScheme{

	public final static String ATTR_GETALLPSSYSDBTABLES = "getAllPSSysDBTables";
	public final static String ATTR_GETAUTHACCESSTOKENURL = "authAccessTokenUrl";
	public final static String ATTR_GETAUTHCLIENTID = "authClientId";
	public final static String ATTR_GETAUTHCLIENTSECRET = "authClientSecret";
	public final static String ATTR_GETAUTHMODE = "authMode";
	public final static String ATTR_GETAUTHPARAM = "authParam";
	public final static String ATTR_GETAUTHPARAM2 = "authParam2";
	public final static String ATTR_GETAUTHTIMEOUT = "authTimeout";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCODENAME2 = "codeName2";
	public final static String ATTR_GETDBINSTTAG = "dBInstTag";
	public final static String ATTR_GETDBOBJNAMECASE = "dBObjNameCase";
	public final static String ATTR_GETDSLINK = "dSLink";
	public final static String ATTR_GETPSSYSMODELGROUP = "getPSSysModelGroup";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";
	public final static String ATTR_GETSAASDCIDCOLUMNNAME = "saaSDCIdColumnName";
	public final static String ATTR_GETSAASDATAIDCOLUMNNAME = "saaSDataIdColumnName";
	public final static String ATTR_GETSCHEMETAG = "schemeTag";
	public final static String ATTR_GETSCHEMETAG2 = "schemeTag2";
	public final static String ATTR_GETSERVICEPARAM = "serviceParam";
	public final static String ATTR_GETSERVICEPARAM2 = "serviceParam2";
	public final static String ATTR_GETSERVICEPATH = "servicePath";
	public final static String ATTR_ISAUTOEXTENDMODEL = "autoExtendModel";
	public final static String ATTR_ISEXISTINGMODEL = "existingModel";
	public final static String ATTR_ISPUBINDEX = "pubIndex";

	private java.util.List<net.ibizsys.model.database.IPSSysDBTable> allpssysdbtables = null;
	public java.util.List<net.ibizsys.model.database.IPSSysDBTable> getAllPSSysDBTables(){
		if(this.allpssysdbtables == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSDBTABLES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.database.IPSSysDBTable> list = new java.util.ArrayList<net.ibizsys.model.database.IPSSysDBTable>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.database.IPSSysDBTable obj = this.getPSModelObject(net.ibizsys.model.database.IPSSysDBTable.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSDBTABLES);
				if(obj!=null)list.add(obj);
			}
			this.allpssysdbtables = list;
		}
		return (this.allpssysdbtables.size() == 0)? null : this.allpssysdbtables;
	}

	public net.ibizsys.model.database.IPSSysDBTable getPSSysDBTable(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.database.IPSSysDBTable.class, this.getAllPSSysDBTables(), objKey, bTryMode);
	}
	public void setPSSysDBTables(java.util.List<net.ibizsys.model.database.IPSSysDBTable> list){
		this.allpssysdbtables = list;
	}

	@Deprecated
	public java.lang.String getAuthAccessTokenUrl(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAUTHACCESSTOKENURL);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAuthClientId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAUTHCLIENTID);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAuthClientSecret(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAUTHCLIENTSECRET);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAuthMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAUTHMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAuthParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAUTHPARAM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAuthParam2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAUTHPARAM2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public int getAuthTimeout(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAUTHTIMEOUT);
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

	public java.lang.String getCodeName2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDBInstTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDBINSTTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDBObjNameCase(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDBOBJNAMECASE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDSLink(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDSLINK);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.system.IPSSysModelGroup pssysmodelgroup;

	public net.ibizsys.model.system.IPSSysModelGroup getPSSysModelGroup(){
		if(this.pssysmodelgroup != null) return this.pssysmodelgroup;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSMODELGROUP);
		if(value == null){
			return null;
		}
		this.pssysmodelgroup = getPSModelObject(net.ibizsys.model.system.IPSSysModelGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSMODELGROUP);
		return this.pssysmodelgroup;
	}

	public net.ibizsys.model.system.IPSSysModelGroup getPSSysModelGroupMust(){
		net.ibizsys.model.system.IPSSysModelGroup value = this.getPSSysModelGroup();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统模型组");}
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


	public java.lang.String getSaaSDCIdColumnName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSAASDCIDCOLUMNNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSaaSDataIdColumnName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSAASDATAIDCOLUMNNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSchemeTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSCHEMETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSchemeTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSCHEMETAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getServiceParam(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERVICEPARAM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getServiceParam2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERVICEPARAM2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getServicePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERVICEPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isAutoExtendModel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISAUTOEXTENDMODEL);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isExistingModel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISEXISTINGMODEL);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isPubIndex(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISPUBINDEX);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
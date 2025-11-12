package net.ibizsys.model.search;



public class PSSysSearchSchemeImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.search.IPSSysSearchScheme{

	public final static String ATTR_GETALLPSSYSSEARCHDES = "getAllPSSysSearchDEs";
	public final static String ATTR_GETALLPSSYSSEARCHDOCS = "getAllPSSysSearchDocs";
	public final static String ATTR_GETAUTHACCESSTOKENURL = "authAccessTokenUrl";
	public final static String ATTR_GETAUTHCLIENTID = "authClientId";
	public final static String ATTR_GETAUTHCLIENTSECRET = "authClientSecret";
	public final static String ATTR_GETAUTHMODE = "authMode";
	public final static String ATTR_GETAUTHPARAM = "authParam";
	public final static String ATTR_GETAUTHPARAM2 = "authParam2";
	public final static String ATTR_GETAUTHTIMEOUT = "authTimeout";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDBOBJNAMECASE = "dBObjNameCase";
	public final static String ATTR_GETDEFAULTDOCREPLICAS = "defaultDocReplicas";
	public final static String ATTR_GETDEFAULTDOCSHARDS = "defaultDocShards";
	public final static String ATTR_GETPSSYSMODELGROUP = "getPSSysModelGroup";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";
	public final static String ATTR_GETSCHEMETAG = "schemeTag";
	public final static String ATTR_GETSCHEMETAG2 = "schemeTag2";
	public final static String ATTR_GETSEARCHENGINETYPE = "searchEngineType";
	public final static String ATTR_GETSERVICEPARAM = "serviceParam";
	public final static String ATTR_GETSERVICEPARAM2 = "serviceParam2";
	public final static String ATTR_GETSERVICEPATH = "servicePath";

	private java.util.List<net.ibizsys.model.search.IPSSysSearchDE> allpssyssearchdes = null;
	public java.util.List<net.ibizsys.model.search.IPSSysSearchDE> getAllPSSysSearchDEs(){
		if(this.allpssyssearchdes == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSSEARCHDES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.search.IPSSysSearchDE> list = new java.util.ArrayList<net.ibizsys.model.search.IPSSysSearchDE>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.search.IPSSysSearchDE obj = this.getPSModelObject(net.ibizsys.model.search.IPSSysSearchDE.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSSEARCHDES);
				if(obj!=null)list.add(obj);
			}
			this.allpssyssearchdes = list;
		}
		return (this.allpssyssearchdes.size() == 0)? null : this.allpssyssearchdes;
	}

	public net.ibizsys.model.search.IPSSysSearchDE getPSSysSearchDE(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.search.IPSSysSearchDE.class, this.getAllPSSysSearchDEs(), objKey, bTryMode);
	}
	public void setPSSysSearchDEs(java.util.List<net.ibizsys.model.search.IPSSysSearchDE> list){
		this.allpssyssearchdes = list;
	}

	private java.util.List<net.ibizsys.model.search.IPSSysSearchDoc> allpssyssearchdocs = null;
	public java.util.List<net.ibizsys.model.search.IPSSysSearchDoc> getAllPSSysSearchDocs(){
		if(this.allpssyssearchdocs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSSEARCHDOCS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.search.IPSSysSearchDoc> list = new java.util.ArrayList<net.ibizsys.model.search.IPSSysSearchDoc>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.search.IPSSysSearchDoc obj = this.getPSModelObject(net.ibizsys.model.search.IPSSysSearchDoc.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSSEARCHDOCS);
				if(obj!=null)list.add(obj);
			}
			this.allpssyssearchdocs = list;
		}
		return (this.allpssyssearchdocs.size() == 0)? null : this.allpssyssearchdocs;
	}

	public net.ibizsys.model.search.IPSSysSearchDoc getPSSysSearchDoc(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.search.IPSSysSearchDoc.class, this.getAllPSSysSearchDocs(), objKey, bTryMode);
	}
	public void setPSSysSearchDocs(java.util.List<net.ibizsys.model.search.IPSSysSearchDoc> list){
		this.allpssyssearchdocs = list;
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

	public java.lang.String getDBObjNameCase(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDBOBJNAMECASE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getDefaultDocReplicas(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTDOCREPLICAS);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getDefaultDocShards(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTDOCSHARDS);
		if(value == null){
			return 0;
		}
		return value.asInt();
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

	public void setPSSysModelGroup(net.ibizsys.model.system.IPSSysModelGroup pssysmodelgroup){
		this.pssysmodelgroup = pssysmodelgroup;
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

	public java.lang.String getSearchEngineType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSEARCHENGINETYPE);
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
}
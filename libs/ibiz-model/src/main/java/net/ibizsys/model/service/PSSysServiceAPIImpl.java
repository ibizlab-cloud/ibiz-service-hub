package net.ibizsys.model.service;



public class PSSysServiceAPIImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.service.IPSSysServiceAPI
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETAPICODENAMEMODE = "aPICodeNameMode";
	public final static String ATTR_GETAPILEVEL = "aPILevel";
	public final static String ATTR_GETAPIMODE = "aPIMode";
	public final static String ATTR_GETAPITAG = "aPITag";
	public final static String ATTR_GETAPITAG2 = "aPITag2";
	public final static String ATTR_GETAPITYPE = "aPIType";
	public final static String ATTR_GETAPIVERSION = "aPIVersion";
	public final static String ATTR_GETAUTHCHECKTOKENURL = "authCheckTokenUrl";
	public final static String ATTR_GETAUTHCLIENTID = "authClientId";
	public final static String ATTR_GETAUTHCLIENTSECRET = "authClientSecret";
	public final static String ATTR_GETAUTHMODE = "authMode";
	public final static String ATTR_GETAUTHPARAM = "authParam";
	public final static String ATTR_GETAUTHPARAM2 = "authParam2";
	public final static String ATTR_GETAUTHPARAM3 = "authParam3";
	public final static String ATTR_GETAUTHPARAM4 = "authParam4";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETHANDLER = "handler";
	public final static String ATTR_GETHTTPPORT = "httpPort";
	public final static String ATTR_GETIGNOREAUTHPATTERNS = "ignoreAuthPatterns";
	public final static String ATTR_GETNAMINGSERVICE = "namingService";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETOUTPSSYSTRANSLATOR = "getOutPSSysTranslator";
	public final static String ATTR_GETPSDESERVICEAPIRSS = "getPSDEServiceAPIRSs";
	public final static String ATTR_GETPSDESERVICEAPIS = "getPSDEServiceAPIs";
	public final static String ATTR_GETPSSYSRESOURCE = "getPSSysResource";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSTESTPRJS = "getPSSysTestPrjs";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";
	public final static String ATTR_GETPREDEFINEDTYPE = "predefinedType";
	public final static String ATTR_GETSERVICECODENAME = "serviceCodeName";
	public final static String ATTR_GETSERVICEPARAM = "serviceParam";
	public final static String ATTR_GETSERVICEPARAM2 = "serviceParam2";
	public final static String ATTR_GETSERVICEPARAM3 = "serviceParam3";
	public final static String ATTR_GETSERVICEPARAM4 = "serviceParam4";
	public final static String ATTR_GETSERVICETYPE = "serviceType";
	public final static String ATTR_ISCLOUDADMINLEVEL = "cloudAdminLevel";
	public final static String ATTR_ISCORELEVEL = "coreLevel";
	public final static String ATTR_ISDCADMINLEVEL = "dCAdminLevel";
	public final static String ATTR_ISENABLEGATEWAY = "enableGateway";
	public final static String ATTR_ISENABLESERVICEAPIDTO = "enableServiceAPIDTO";
	public final static String ATTR_ISUSERLEVEL = "userLevel";

	public java.lang.String getAPICodeNameMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAPICODENAMEMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getAPILevel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAPILEVEL);
		if(value == null){
			return 3;
		}
		return value.asInt();
	}

	public int getAPIMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAPIMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getAPITag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAPITAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAPITag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAPITAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAPIType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAPITYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getAPIVersion(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAPIVERSION);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getAuthCheckTokenUrl(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAUTHCHECKTOKENURL);
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

	public java.lang.String getAuthParam3(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAUTHPARAM3);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAuthParam4(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAUTHPARAM4);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getHandler(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHANDLER);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getHttpPort(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHTTPPORT);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	private java.util.List<java.lang.String> ignoreauthpatterns = null;
	public java.util.List<java.lang.String> getIgnoreAuthPatterns(){
		if(this.ignoreauthpatterns == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETIGNOREAUTHPATTERNS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
			for(int i = 0;i<arrayNode.size();i++) {
				list.add(arrayNode.get(i).asText());
			}
			this.ignoreauthpatterns = list;
		}
		return (this.ignoreauthpatterns.size() == 0)? null : this.ignoreauthpatterns;
	}

	public java.lang.String getNamingService(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAMINGSERVICE);
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
	private net.ibizsys.model.res.IPSSysTranslator outpssystranslator;

	public net.ibizsys.model.res.IPSSysTranslator getOutPSSysTranslator(){
		if(this.outpssystranslator != null) return this.outpssystranslator;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETOUTPSSYSTRANSLATOR);
		if(value == null){
			return null;
		}
		this.outpssystranslator = getPSModelObject(net.ibizsys.model.res.IPSSysTranslator.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETOUTPSSYSTRANSLATOR);
		return this.outpssystranslator;
	}

	public net.ibizsys.model.res.IPSSysTranslator getOutPSSysTranslatorMust(){
		net.ibizsys.model.res.IPSSysTranslator value = this.getOutPSSysTranslator();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定输出值转换器");}
		return value;
	}

	public void setOutPSSysTranslator(net.ibizsys.model.res.IPSSysTranslator outpssystranslator){
		this.outpssystranslator = outpssystranslator;
	}


	private java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS> psdeserviceapirss = null;
	public java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS> getPSDEServiceAPIRSs(){
		if(this.psdeserviceapirss == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDESERVICEAPIRSS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS> list = new java.util.ArrayList<net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS obj = this.getPSModelObject(net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDESERVICEAPIRSS);
				if(obj!=null)list.add(obj);
			}
			this.psdeserviceapirss = list;
		}
		return (this.psdeserviceapirss.size() == 0)? null : this.psdeserviceapirss;
	}

	public net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS getPSDEServiceAPIRS(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS.class, this.getPSDEServiceAPIRSs(), objKey, bTryMode);
	}
	public void setPSDEServiceAPIRSs(java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPIRS> list){
		this.psdeserviceapirss = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPI> psdeserviceapis = null;
	public java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPI> getPSDEServiceAPIs(){
		if(this.psdeserviceapis == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDESERVICEAPIS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPI> list = new java.util.ArrayList<net.ibizsys.model.dataentity.service.IPSDEServiceAPI>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.service.IPSDEServiceAPI obj = this.getPSModelObject(net.ibizsys.model.dataentity.service.IPSDEServiceAPI.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDESERVICEAPIS);
				if(obj!=null)list.add(obj);
			}
			this.psdeserviceapis = list;
		}
		return (this.psdeserviceapis.size() == 0)? null : this.psdeserviceapis;
	}

	public net.ibizsys.model.dataentity.service.IPSDEServiceAPI getPSDEServiceAPI(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.service.IPSDEServiceAPI.class, this.getPSDEServiceAPIs(), objKey, bTryMode);
	}
	public void setPSDEServiceAPIs(java.util.List<net.ibizsys.model.dataentity.service.IPSDEServiceAPI> list){
		this.psdeserviceapis = list;
	}
	private net.ibizsys.model.res.IPSSysResource pssysresource;

	public net.ibizsys.model.res.IPSSysResource getPSSysResource(){
		if(this.pssysresource != null) return this.pssysresource;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSRESOURCE);
		if(value == null){
			return null;
		}
		this.pssysresource = getPSModelObject(net.ibizsys.model.res.IPSSysResource.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSRESOURCE);
		return this.pssysresource;
	}

	public net.ibizsys.model.res.IPSSysResource getPSSysResourceMust(){
		net.ibizsys.model.res.IPSSysResource value = this.getPSSysResource();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统资源对象");}
		return value;
	}

	public void setPSSysResource(net.ibizsys.model.res.IPSSysResource pssysresource){
		this.pssysresource = pssysresource;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定后端扩展插件");}
		return value;
	}

	public void setPSSysSFPlugin(net.ibizsys.model.res.IPSSysSFPlugin pssyssfplugin){
		this.pssyssfplugin = pssyssfplugin;
	}


	private java.util.List<net.ibizsys.model.testing.IPSSysTestPrj> pssystestprjs = null;
	public java.util.List<net.ibizsys.model.testing.IPSSysTestPrj> getPSSysTestPrjs(){
		if(this.pssystestprjs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSTESTPRJS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.testing.IPSSysTestPrj> list = new java.util.ArrayList<net.ibizsys.model.testing.IPSSysTestPrj>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.testing.IPSSysTestPrj obj = this.getPSModelObject(net.ibizsys.model.testing.IPSSysTestPrj.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSSYSTESTPRJS);
				if(obj!=null)list.add(obj);
			}
			this.pssystestprjs = list;
		}
		return (this.pssystestprjs.size() == 0)? null : this.pssystestprjs;
	}

	public net.ibizsys.model.testing.IPSSysTestPrj getPSSysTestPrj(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.testing.IPSSysTestPrj.class, this.getPSSysTestPrjs(), objKey, bTryMode);
	}
	public void setPSSysTestPrjs(java.util.List<net.ibizsys.model.testing.IPSSysTestPrj> list){
		this.pssystestprjs = list;
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


	public java.lang.String getPredefinedType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPREDEFINEDTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getServiceCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERVICECODENAME);
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

	public java.lang.String getServiceParam3(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERVICEPARAM3);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getServiceParam4(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERVICEPARAM4);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getServiceType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERVICETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isCloudAdminLevel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCLOUDADMINLEVEL);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isCoreLevel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCORELEVEL);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isDCAdminLevel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDCADMINLEVEL);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableGateway(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEGATEWAY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableServiceAPIDTO(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLESERVICEAPIDTO);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isUserLevel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISUSERLEVEL);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
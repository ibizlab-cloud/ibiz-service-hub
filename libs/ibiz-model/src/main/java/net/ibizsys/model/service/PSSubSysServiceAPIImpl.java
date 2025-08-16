package net.ibizsys.model.service;



public class PSSubSysServiceAPIImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.service.IPSSubSysServiceAPI{

	public final static String ATTR_GETAPICODENAMEMODE = "aPICodeNameMode";
	public final static String ATTR_GETAPISOURCE = "aPISource";
	public final static String ATTR_GETAPITAG = "aPITag";
	public final static String ATTR_GETAPITAG2 = "aPITag2";
	public final static String ATTR_GETAPITYPE = "aPIType";
	public final static String ATTR_GETALLPSSUBSYSSERVICEAPIDERSS = "getAllPSSubSysServiceAPIDERSs";
	public final static String ATTR_GETALLPSSUBSYSSERVICEAPIDES = "getAllPSSubSysServiceAPIDEs";
	public final static String ATTR_GETALLPSSUBSYSSERVICEAPIDTOS = "getAllPSSubSysServiceAPIDTOs";
	public final static String ATTR_GETAUTHACCESSTOKENURL = "authAccessTokenUrl";
	public final static String ATTR_GETAUTHCLIENTID = "authClientId";
	public final static String ATTR_GETAUTHCLIENTSECRET = "authClientSecret";
	public final static String ATTR_GETAUTHMODE = "authMode";
	public final static String ATTR_GETAUTHPARAM = "authParam";
	public final static String ATTR_GETAUTHPARAM2 = "authParam2";
	public final static String ATTR_GETAUTHPARAM3 = "authParam3";
	public final static String ATTR_GETAUTHPARAM4 = "authParam4";
	public final static String ATTR_GETAUTHSCRIPTCODE = "authScriptCode";
	public final static String ATTR_GETAUTHTIMEOUT = "authTimeout";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETHANDLER = "handler";
	public final static String ATTR_GETHEADERPARAMS = "headerParams";
	public final static String ATTR_GETMETHODSCRIPTCODE = "methodScriptCode";
	public final static String ATTR_GETPSOPENAPI3SCHEMA = "getPSOpenAPI3Schema";
	public final static String ATTR_GETPSSYSRESOURCE = "getPSSysResource";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";
	public final static String ATTR_GETPREDEFINEDTYPE = "predefinedType";
	public final static String ATTR_GETSERVICECODENAME = "serviceCodeName";
	public final static String ATTR_GETSERVICEPARAM = "serviceParam";
	public final static String ATTR_GETSERVICEPARAM2 = "serviceParam2";
	public final static String ATTR_GETSERVICEPARAM3 = "serviceParam3";
	public final static String ATTR_GETSERVICEPARAM4 = "serviceParam4";
	public final static String ATTR_GETSERVICEPATH = "servicePath";
	public final static String ATTR_GETSERVICETYPE = "serviceType";
	public final static String ATTR_ISENABLESERVICEAPIDTO = "enableServiceAPIDTO";

	public java.lang.String getAPICodeNameMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAPICODENAMEMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAPISource(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAPISOURCE);
		if(value == null){
			return null;
		}
		return value.asText();
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

	private java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDERS> allpssubsysserviceapiderss = null;
	public java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDERS> getAllPSSubSysServiceAPIDERSs(){
		if(this.allpssubsysserviceapiderss == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSUBSYSSERVICEAPIDERSS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDERS> list = new java.util.ArrayList<net.ibizsys.model.service.IPSSubSysServiceAPIDERS>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.service.IPSSubSysServiceAPIDERS obj = this.getPSModelObject(net.ibizsys.model.service.IPSSubSysServiceAPIDERS.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSUBSYSSERVICEAPIDERSS);
				if(obj!=null)list.add(obj);
			}
			this.allpssubsysserviceapiderss = list;
		}
		return (this.allpssubsysserviceapiderss.size() == 0)? null : this.allpssubsysserviceapiderss;
	}

	public net.ibizsys.model.service.IPSSubSysServiceAPIDERS getPSSubSysServiceAPIDERS(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.service.IPSSubSysServiceAPIDERS.class, this.getAllPSSubSysServiceAPIDERSs(), objKey, bTryMode);
	}
	public void setPSSubSysServiceAPIDERs(java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDERS> list){
		this.allpssubsysserviceapiderss = list;
	}

	private java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDE> allpssubsysserviceapides = null;
	public java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDE> getAllPSSubSysServiceAPIDEs(){
		if(this.allpssubsysserviceapides == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSUBSYSSERVICEAPIDES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDE> list = new java.util.ArrayList<net.ibizsys.model.service.IPSSubSysServiceAPIDE>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.service.IPSSubSysServiceAPIDE obj = this.getPSModelObject(net.ibizsys.model.service.IPSSubSysServiceAPIDE.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSUBSYSSERVICEAPIDES);
				if(obj!=null)list.add(obj);
			}
			this.allpssubsysserviceapides = list;
		}
		return (this.allpssubsysserviceapides.size() == 0)? null : this.allpssubsysserviceapides;
	}

	public net.ibizsys.model.service.IPSSubSysServiceAPIDE getPSSubSysServiceAPIDE(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.service.IPSSubSysServiceAPIDE.class, this.getAllPSSubSysServiceAPIDEs(), objKey, bTryMode);
	}
	public void setPSSubSysServiceAPIDEs(java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDE> list){
		this.allpssubsysserviceapides = list;
	}

	private java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDTO> allpssubsysserviceapidtos = null;
	public java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDTO> getAllPSSubSysServiceAPIDTOs(){
		if(this.allpssubsysserviceapidtos == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSUBSYSSERVICEAPIDTOS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDTO> list = new java.util.ArrayList<net.ibizsys.model.service.IPSSubSysServiceAPIDTO>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.service.IPSSubSysServiceAPIDTO obj = this.getPSModelObject(net.ibizsys.model.service.IPSSubSysServiceAPIDTO.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSUBSYSSERVICEAPIDTOS);
				if(obj!=null)list.add(obj);
			}
			this.allpssubsysserviceapidtos = list;
		}
		return (this.allpssubsysserviceapidtos.size() == 0)? null : this.allpssubsysserviceapidtos;
	}

	public net.ibizsys.model.service.IPSSubSysServiceAPIDTO getPSSubSysServiceAPIDTO(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.service.IPSSubSysServiceAPIDTO.class, this.getAllPSSubSysServiceAPIDTOs(), objKey, bTryMode);
	}
	public void setPSSubSysServiceAPIDTOs(java.util.List<net.ibizsys.model.service.IPSSubSysServiceAPIDTO> list){
		this.allpssubsysserviceapidtos = list;
	}

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

	public java.lang.String getAuthScriptCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAUTHSCRIPTCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getAuthTimeout(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAUTHTIMEOUT);
		if(value == null){
			return -1;
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

	public java.lang.String getHandler(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHANDLER);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getHeaderParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHEADERPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getMethodScriptCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMETHODSCRIPTCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.service.openapi.IPSOpenAPI3Schema psopenapi3schema;

	public net.ibizsys.model.service.openapi.IPSOpenAPI3Schema getPSOpenAPI3Schema(){
		if(this.psopenapi3schema != null) return this.psopenapi3schema;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSOPENAPI3SCHEMA);
		if(value == null){
			return null;
		}
		this.psopenapi3schema = getPSModelObject(net.ibizsys.model.service.openapi.IPSOpenAPI3Schema.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSOPENAPI3SCHEMA);
		return this.psopenapi3schema;
	}

	public net.ibizsys.model.service.openapi.IPSOpenAPI3Schema getPSOpenAPI3SchemaMust(){
		net.ibizsys.model.service.openapi.IPSOpenAPI3Schema value = this.getPSOpenAPI3Schema();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定OpenAPI3 Schema");}
		return value;
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

	public java.lang.String getServicePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERVICEPATH);
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

	public boolean isEnableServiceAPIDTO(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLESERVICEAPIDTO);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
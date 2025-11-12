package net.ibizsys.model.ba;



public class PSSysBDSchemeImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.ba.IPSSysBDScheme{

	public final static String ATTR_GETALLPSSYSBDMODULES = "getAllPSSysBDModules";
	public final static String ATTR_GETALLPSSYSBDPARTS = "getAllPSSysBDParts";
	public final static String ATTR_GETALLPSSYSBDTABLERSS = "getAllPSSysBDTableRSs";
	public final static String ATTR_GETALLPSSYSBDTABLES = "getAllPSSysBDTables";
	public final static String ATTR_GETAUTHACCESSTOKENURL = "authAccessTokenUrl";
	public final static String ATTR_GETAUTHCLIENTID = "authClientId";
	public final static String ATTR_GETAUTHCLIENTSECRET = "authClientSecret";
	public final static String ATTR_GETAUTHMODE = "authMode";
	public final static String ATTR_GETAUTHPARAM = "authParam";
	public final static String ATTR_GETAUTHPARAM2 = "authParam2";
	public final static String ATTR_GETAUTHTIMEOUT = "authTimeout";
	public final static String ATTR_GETBDTYPE = "bDType";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDBOBJNAMECASE = "dBObjNameCase";
	public final static String ATTR_GETPSSYSMODELGROUP = "getPSSysModelGroup";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";
	public final static String ATTR_GETSCHEMETAG = "schemeTag";
	public final static String ATTR_GETSCHEMETAG2 = "schemeTag2";
	public final static String ATTR_GETSERVICEPARAM = "serviceParam";
	public final static String ATTR_GETSERVICEPARAM2 = "serviceParam2";
	public final static String ATTR_GETSERVICEPATH = "servicePath";
	public final static String ATTR_ISDEFAULTMODE = "defaultMode";

	private java.util.List<net.ibizsys.model.ba.IPSSysBDModule> allpssysbdmodules = null;
	public java.util.List<net.ibizsys.model.ba.IPSSysBDModule> getAllPSSysBDModules(){
		if(this.allpssysbdmodules == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSBDMODULES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.ba.IPSSysBDModule> list = new java.util.ArrayList<net.ibizsys.model.ba.IPSSysBDModule>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.ba.IPSSysBDModule obj = this.getPSModelObject(net.ibizsys.model.ba.IPSSysBDModule.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSBDMODULES);
				if(obj!=null)list.add(obj);
			}
			this.allpssysbdmodules = list;
		}
		return (this.allpssysbdmodules.size() == 0)? null : this.allpssysbdmodules;
	}

	public net.ibizsys.model.ba.IPSSysBDModule getPSSysBDModule(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.ba.IPSSysBDModule.class, this.getAllPSSysBDModules(), objKey, bTryMode);
	}
	public void setPSSysBDModules(java.util.List<net.ibizsys.model.ba.IPSSysBDModule> list){
		this.allpssysbdmodules = list;
	}

	private java.util.List<net.ibizsys.model.ba.IPSSysBDPart> allpssysbdparts = null;
	public java.util.List<net.ibizsys.model.ba.IPSSysBDPart> getAllPSSysBDParts(){
		if(this.allpssysbdparts == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSBDPARTS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.ba.IPSSysBDPart> list = new java.util.ArrayList<net.ibizsys.model.ba.IPSSysBDPart>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.ba.IPSSysBDPart obj = this.getPSModelObject(net.ibizsys.model.ba.IPSSysBDPart.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSBDPARTS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysbdparts = list;
		}
		return (this.allpssysbdparts.size() == 0)? null : this.allpssysbdparts;
	}

	public net.ibizsys.model.ba.IPSSysBDPart getPSSysBDPart(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.ba.IPSSysBDPart.class, this.getAllPSSysBDParts(), objKey, bTryMode);
	}
	public void setPSSysBDParts(java.util.List<net.ibizsys.model.ba.IPSSysBDPart> list){
		this.allpssysbdparts = list;
	}

	private java.util.List<net.ibizsys.model.ba.IPSSysBDTableRS> allpssysbdtablerss = null;
	public java.util.List<net.ibizsys.model.ba.IPSSysBDTableRS> getAllPSSysBDTableRSs(){
		if(this.allpssysbdtablerss == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSBDTABLERSS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.ba.IPSSysBDTableRS> list = new java.util.ArrayList<net.ibizsys.model.ba.IPSSysBDTableRS>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.ba.IPSSysBDTableRS obj = this.getPSModelObject(net.ibizsys.model.ba.IPSSysBDTableRS.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSBDTABLERSS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysbdtablerss = list;
		}
		return (this.allpssysbdtablerss.size() == 0)? null : this.allpssysbdtablerss;
	}

	public net.ibizsys.model.ba.IPSSysBDTableRS getPSSysBDTableRS(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.ba.IPSSysBDTableRS.class, this.getAllPSSysBDTableRSs(), objKey, bTryMode);
	}
	public void setPSSysBDTableRs(java.util.List<net.ibizsys.model.ba.IPSSysBDTableRS> list){
		this.allpssysbdtablerss = list;
	}

	private java.util.List<net.ibizsys.model.ba.IPSSysBDTable> allpssysbdtables = null;
	public java.util.List<net.ibizsys.model.ba.IPSSysBDTable> getAllPSSysBDTables(){
		if(this.allpssysbdtables == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSBDTABLES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.ba.IPSSysBDTable> list = new java.util.ArrayList<net.ibizsys.model.ba.IPSSysBDTable>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.ba.IPSSysBDTable obj = this.getPSModelObject(net.ibizsys.model.ba.IPSSysBDTable.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSBDTABLES);
				if(obj!=null)list.add(obj);
			}
			this.allpssysbdtables = list;
		}
		return (this.allpssysbdtables.size() == 0)? null : this.allpssysbdtables;
	}

	public net.ibizsys.model.ba.IPSSysBDTable getPSSysBDTable(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.ba.IPSSysBDTable.class, this.getAllPSSysBDTables(), objKey, bTryMode);
	}
	public void setPSSysBDTables(java.util.List<net.ibizsys.model.ba.IPSSysBDTable> list){
		this.allpssysbdtables = list;
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

	public java.lang.String getBDType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBDTYPE);
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

	public java.lang.String getDBObjNameCase(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDBOBJNAMECASE);
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

	public boolean isDefaultMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDEFAULTMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
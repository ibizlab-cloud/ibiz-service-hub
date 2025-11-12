package net.ibizsys.model.bi;



public class PSSysBISchemeImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.bi.IPSSysBIScheme{

	public final static String ATTR_GETALLPSSYSBIAGGTABLES = "getAllPSSysBIAggTables";
	public final static String ATTR_GETALLPSSYSBICUBES = "getAllPSSysBICubes";
	public final static String ATTR_GETALLPSSYSBIDIMENSIONS = "getAllPSSysBIDimensions";
	public final static String ATTR_GETALLPSSYSBIREPORTS = "getAllPSSysBIReports";
	public final static String ATTR_GETAUTHACCESSTOKENURL = "authAccessTokenUrl";
	public final static String ATTR_GETAUTHCLIENTID = "authClientId";
	public final static String ATTR_GETAUTHCLIENTSECRET = "authClientSecret";
	public final static String ATTR_GETAUTHMODE = "authMode";
	public final static String ATTR_GETAUTHPARAM = "authParam";
	public final static String ATTR_GETAUTHPARAM2 = "authParam2";
	public final static String ATTR_GETAUTHTIMEOUT = "authTimeout";
	public final static String ATTR_GETBIENGINETYPE = "bIEngineType";
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
	public final static String ATTR_GETUNIQUETAG = "uniqueTag";

	private java.util.List<net.ibizsys.model.bi.IPSSysBIAggTable> allpssysbiaggtables = null;
	public java.util.List<net.ibizsys.model.bi.IPSSysBIAggTable> getAllPSSysBIAggTables(){
		if(this.allpssysbiaggtables == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSBIAGGTABLES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.bi.IPSSysBIAggTable> list = new java.util.ArrayList<net.ibizsys.model.bi.IPSSysBIAggTable>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.bi.IPSSysBIAggTable obj = this.getPSModelObject(net.ibizsys.model.bi.IPSSysBIAggTable.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSBIAGGTABLES);
				if(obj!=null)list.add(obj);
			}
			this.allpssysbiaggtables = list;
		}
		return (this.allpssysbiaggtables.size() == 0)? null : this.allpssysbiaggtables;
	}

	public net.ibizsys.model.bi.IPSSysBIAggTable getPSSysBIAggTable(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.bi.IPSSysBIAggTable.class, this.getAllPSSysBIAggTables(), objKey, bTryMode);
	}
	public void setPSSysBIAggTables(java.util.List<net.ibizsys.model.bi.IPSSysBIAggTable> list){
		this.allpssysbiaggtables = list;
	}

	private java.util.List<net.ibizsys.model.bi.IPSSysBICube> allpssysbicubes = null;
	public java.util.List<net.ibizsys.model.bi.IPSSysBICube> getAllPSSysBICubes(){
		if(this.allpssysbicubes == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSBICUBES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.bi.IPSSysBICube> list = new java.util.ArrayList<net.ibizsys.model.bi.IPSSysBICube>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.bi.IPSSysBICube obj = this.getPSModelObject(net.ibizsys.model.bi.IPSSysBICube.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSBICUBES);
				if(obj!=null)list.add(obj);
			}
			this.allpssysbicubes = list;
		}
		return (this.allpssysbicubes.size() == 0)? null : this.allpssysbicubes;
	}

	public net.ibizsys.model.bi.IPSSysBICube getPSSysBICube(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.bi.IPSSysBICube.class, this.getAllPSSysBICubes(), objKey, bTryMode);
	}
	public void setPSSysBICubes(java.util.List<net.ibizsys.model.bi.IPSSysBICube> list){
		this.allpssysbicubes = list;
	}

	private java.util.List<net.ibizsys.model.bi.IPSSysBIDimension> allpssysbidimensions = null;
	public java.util.List<net.ibizsys.model.bi.IPSSysBIDimension> getAllPSSysBIDimensions(){
		if(this.allpssysbidimensions == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSBIDIMENSIONS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.bi.IPSSysBIDimension> list = new java.util.ArrayList<net.ibizsys.model.bi.IPSSysBIDimension>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.bi.IPSSysBIDimension obj = this.getPSModelObject(net.ibizsys.model.bi.IPSSysBIDimension.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSBIDIMENSIONS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysbidimensions = list;
		}
		return (this.allpssysbidimensions.size() == 0)? null : this.allpssysbidimensions;
	}

	public net.ibizsys.model.bi.IPSSysBIDimension getPSSysBIDimension(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.bi.IPSSysBIDimension.class, this.getAllPSSysBIDimensions(), objKey, bTryMode);
	}
	public void setPSSysBIDimensions(java.util.List<net.ibizsys.model.bi.IPSSysBIDimension> list){
		this.allpssysbidimensions = list;
	}

	private java.util.List<net.ibizsys.model.bi.IPSSysBIReport> allpssysbireports = null;
	public java.util.List<net.ibizsys.model.bi.IPSSysBIReport> getAllPSSysBIReports(){
		if(this.allpssysbireports == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLPSSYSBIREPORTS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.bi.IPSSysBIReport> list = new java.util.ArrayList<net.ibizsys.model.bi.IPSSysBIReport>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.bi.IPSSysBIReport obj = this.getPSModelObject(net.ibizsys.model.bi.IPSSysBIReport.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETALLPSSYSBIREPORTS);
				if(obj!=null)list.add(obj);
			}
			this.allpssysbireports = list;
		}
		return (this.allpssysbireports.size() == 0)? null : this.allpssysbireports;
	}

	public net.ibizsys.model.bi.IPSSysBIReport getPSSysBIReport(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.bi.IPSSysBIReport.class, this.getAllPSSysBIReports(), objKey, bTryMode);
	}
	public void setPSSysBIReports(java.util.List<net.ibizsys.model.bi.IPSSysBIReport> list){
		this.allpssysbireports = list;
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

	public java.lang.String getBIEngineType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBIENGINETYPE);
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

	public java.lang.String getUniqueTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNIQUETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}
package net.ibizsys.model.res;



public class PSSysUtilImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.res.IPSSysUtil
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETAUTHACCESSTOKENURL = "authAccessTokenUrl";
	public final static String ATTR_GETAUTHCLIENTID = "authClientId";
	public final static String ATTR_GETAUTHCLIENTSECRET = "authClientSecret";
	public final static String ATTR_GETAUTHMODE = "authMode";
	public final static String ATTR_GETAUTHPARAM = "authParam";
	public final static String ATTR_GETAUTHPARAM2 = "authParam2";
	public final static String ATTR_GETAUTHTIMEOUT = "authTimeout";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETEXTENDMODE = "extendMode";
	public final static String ATTR_GETINPSSYSDATASYNCAGENT = "getInPSSysDataSyncAgent";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETOUTPSSYSDATASYNCAGENT = "getOutPSSysDataSyncAgent";
	public final static String ATTR_GETOUTPSSYSRESOURCE = "getOutPSSysResource";
	public final static String ATTR_GETPSSUBSYSSERVICEAPI = "getPSSubSysServiceAPI";
	public final static String ATTR_GETPSSYSDEGROUP = "getPSSysDEGroup";
	public final static String ATTR_GETPSSYSMODELGROUP = "getPSSysModelGroup";
	public final static String ATTR_GETPSSYSRESOURCE = "getPSSysResource";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";
	public final static String ATTR_GETRTOBJECTNAME = "rTObjectName";
	public final static String ATTR_GETSERVICEPARAM = "serviceParam";
	public final static String ATTR_GETSERVICEPARAM2 = "serviceParam2";
	public final static String ATTR_GETSERVICEPATH = "servicePath";
	public final static String ATTR_GETUTILPSDE = "getUtilPSDE";
	public final static String ATTR_GETUTILPSDE10 = "getUtilPSDE10";
	public final static String ATTR_GETUTILPSDE10NAME = "utilPSDE10Name";
	public final static String ATTR_GETUTILPSDE11 = "getUtilPSDE11";
	public final static String ATTR_GETUTILPSDE12 = "getUtilPSDE12";
	public final static String ATTR_GETUTILPSDE13 = "getUtilPSDE13";
	public final static String ATTR_GETUTILPSDE14 = "getUtilPSDE14";
	public final static String ATTR_GETUTILPSDE15 = "getUtilPSDE15";
	public final static String ATTR_GETUTILPSDE16 = "getUtilPSDE16";
	public final static String ATTR_GETUTILPSDE17 = "getUtilPSDE17";
	public final static String ATTR_GETUTILPSDE18 = "getUtilPSDE18";
	public final static String ATTR_GETUTILPSDE19 = "getUtilPSDE19";
	public final static String ATTR_GETUTILPSDE2 = "getUtilPSDE2";
	public final static String ATTR_GETUTILPSDE20 = "getUtilPSDE20";
	public final static String ATTR_GETUTILPSDE2NAME = "utilPSDE2Name";
	public final static String ATTR_GETUTILPSDE3 = "getUtilPSDE3";
	public final static String ATTR_GETUTILPSDE3NAME = "utilPSDE3Name";
	public final static String ATTR_GETUTILPSDE4 = "getUtilPSDE4";
	public final static String ATTR_GETUTILPSDE4NAME = "utilPSDE4Name";
	public final static String ATTR_GETUTILPSDE5 = "getUtilPSDE5";
	public final static String ATTR_GETUTILPSDE5NAME = "utilPSDE5Name";
	public final static String ATTR_GETUTILPSDE6 = "getUtilPSDE6";
	public final static String ATTR_GETUTILPSDE6NAME = "utilPSDE6Name";
	public final static String ATTR_GETUTILPSDE7 = "getUtilPSDE7";
	public final static String ATTR_GETUTILPSDE7NAME = "utilPSDE7Name";
	public final static String ATTR_GETUTILPSDE8 = "getUtilPSDE8";
	public final static String ATTR_GETUTILPSDE8NAME = "utilPSDE8Name";
	public final static String ATTR_GETUTILPSDE9 = "getUtilPSDE9";
	public final static String ATTR_GETUTILPSDE9NAME = "utilPSDE9Name";
	public final static String ATTR_GETUTILPSDENAME = "utilPSDEName";
	public final static String ATTR_GETUTILPARAMS = "utilParams";
	public final static String ATTR_GETUTILTAG = "utilTag";
	public final static String ATTR_GETUTILTAG2 = "utilTag2";
	public final static String ATTR_GETUTILTYPE = "utilType";
	public final static String ATTR_ISREGTOSYS = "regToSys";
	public final static String ATTR_ISTRYMODE = "tryMode";

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

	@Deprecated
	public int getExtendMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXTENDMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.res.IPSSysDataSyncAgent inpssysdatasyncagent;

	public net.ibizsys.model.res.IPSSysDataSyncAgent getInPSSysDataSyncAgent(){
		if(this.inpssysdatasyncagent != null) return this.inpssysdatasyncagent;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINPSSYSDATASYNCAGENT);
		if(value == null){
			return null;
		}
		this.inpssysdatasyncagent = getPSModelObject(net.ibizsys.model.res.IPSSysDataSyncAgent.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETINPSSYSDATASYNCAGENT);
		return this.inpssysdatasyncagent;
	}

	public net.ibizsys.model.res.IPSSysDataSyncAgent getInPSSysDataSyncAgentMust(){
		net.ibizsys.model.res.IPSSysDataSyncAgent value = this.getInPSSysDataSyncAgent();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定输入系统数据同步代理对象");}
		return value;
	}

	public void setInPSSysDataSyncAgent(net.ibizsys.model.res.IPSSysDataSyncAgent inpssysdatasyncagent){
		this.inpssysdatasyncagent = inpssysdatasyncagent;
	}


	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 99999;
		}
		return value.asInt();
	}
	private net.ibizsys.model.res.IPSSysDataSyncAgent outpssysdatasyncagent;

	public net.ibizsys.model.res.IPSSysDataSyncAgent getOutPSSysDataSyncAgent(){
		if(this.outpssysdatasyncagent != null) return this.outpssysdatasyncagent;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETOUTPSSYSDATASYNCAGENT);
		if(value == null){
			return null;
		}
		this.outpssysdatasyncagent = getPSModelObject(net.ibizsys.model.res.IPSSysDataSyncAgent.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETOUTPSSYSDATASYNCAGENT);
		return this.outpssysdatasyncagent;
	}

	public net.ibizsys.model.res.IPSSysDataSyncAgent getOutPSSysDataSyncAgentMust(){
		net.ibizsys.model.res.IPSSysDataSyncAgent value = this.getOutPSSysDataSyncAgent();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定输出系统数据同步代理对象");}
		return value;
	}

	public void setOutPSSysDataSyncAgent(net.ibizsys.model.res.IPSSysDataSyncAgent outpssysdatasyncagent){
		this.outpssysdatasyncagent = outpssysdatasyncagent;
	}

	private net.ibizsys.model.res.IPSSysResource outpssysresource;

	public net.ibizsys.model.res.IPSSysResource getOutPSSysResource(){
		if(this.outpssysresource != null) return this.outpssysresource;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETOUTPSSYSRESOURCE);
		if(value == null){
			return null;
		}
		this.outpssysresource = getPSModelObject(net.ibizsys.model.res.IPSSysResource.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETOUTPSSYSRESOURCE);
		return this.outpssysresource;
	}

	public net.ibizsys.model.res.IPSSysResource getOutPSSysResourceMust(){
		net.ibizsys.model.res.IPSSysResource value = this.getOutPSSysResource();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定输出系统资源对象");}
		return value;
	}

	public void setOutPSSysResource(net.ibizsys.model.res.IPSSysResource outpssysresource){
		this.outpssysresource = outpssysresource;
	}

	private net.ibizsys.model.service.IPSSubSysServiceAPI pssubsysserviceapi;

	public net.ibizsys.model.service.IPSSubSysServiceAPI getPSSubSysServiceAPI(){
		if(this.pssubsysserviceapi != null) return this.pssubsysserviceapi;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSUBSYSSERVICEAPI);
		if(value == null){
			return null;
		}
		this.pssubsysserviceapi = getPSModelObject(net.ibizsys.model.service.IPSSubSysServiceAPI.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSUBSYSSERVICEAPI);
		return this.pssubsysserviceapi;
	}

	public net.ibizsys.model.service.IPSSubSysServiceAPI getPSSubSysServiceAPIMust(){
		net.ibizsys.model.service.IPSSubSysServiceAPI value = this.getPSSubSysServiceAPI();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定外部服务接口");}
		return value;
	}

	public void setPSSubSysServiceAPI(net.ibizsys.model.service.IPSSubSysServiceAPI pssubsysserviceapi){
		this.pssubsysserviceapi = pssubsysserviceapi;
	}

	private net.ibizsys.model.dataentity.IPSSysDEGroup pssysdegroup;

	public net.ibizsys.model.dataentity.IPSSysDEGroup getPSSysDEGroup(){
		if(this.pssysdegroup != null) return this.pssysdegroup;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSDEGROUP);
		if(value == null){
			return null;
		}
		this.pssysdegroup = getPSModelObject(net.ibizsys.model.dataentity.IPSSysDEGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSDEGROUP);
		return this.pssysdegroup;
	}

	public net.ibizsys.model.dataentity.IPSSysDEGroup getPSSysDEGroupMust(){
		net.ibizsys.model.dataentity.IPSSysDEGroup value = this.getPSSysDEGroup();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统实体组");}
		return value;
	}

	public void setPSSysDEGroup(net.ibizsys.model.dataentity.IPSSysDEGroup pssysdegroup){
		this.pssysdegroup = pssysdegroup;
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


	public java.lang.String getRTObjectName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRTOBJECTNAME);
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
	private net.ibizsys.model.dataentity.IPSDataEntity utilpsde;

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE(){
		if(this.utilpsde != null) return this.utilpsde;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE);
		if(value == null){
			return null;
		}
		this.utilpsde = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETUTILPSDE);
		return this.utilpsde;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDEMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getUtilPSDE();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定功能实体");}
		return value;
	}

	public void setUtilPSDE(net.ibizsys.model.dataentity.IPSDataEntity utilpsde){
		this.utilpsde = utilpsde;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity utilpsde10;

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE10(){
		if(this.utilpsde10 != null) return this.utilpsde10;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE10);
		if(value == null){
			return null;
		}
		this.utilpsde10 = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETUTILPSDE10);
		return this.utilpsde10;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE10Must(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getUtilPSDE10();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定功能实体10");}
		return value;
	}

	public void setUtilPSDE10(net.ibizsys.model.dataentity.IPSDataEntity utilpsde10){
		this.utilpsde10 = utilpsde10;
	}


	public java.lang.String getUtilPSDE10Name(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE10NAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.IPSDataEntity utilpsde11;

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE11(){
		if(this.utilpsde11 != null) return this.utilpsde11;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE11);
		if(value == null){
			return null;
		}
		this.utilpsde11 = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETUTILPSDE11);
		return this.utilpsde11;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE11Must(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getUtilPSDE11();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定功能实体11");}
		return value;
	}

	public void setUtilPSDE11(net.ibizsys.model.dataentity.IPSDataEntity utilpsde11){
		this.utilpsde11 = utilpsde11;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity utilpsde12;

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE12(){
		if(this.utilpsde12 != null) return this.utilpsde12;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE12);
		if(value == null){
			return null;
		}
		this.utilpsde12 = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETUTILPSDE12);
		return this.utilpsde12;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE12Must(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getUtilPSDE12();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定功能实体12");}
		return value;
	}

	public void setUtilPSDE12(net.ibizsys.model.dataentity.IPSDataEntity utilpsde12){
		this.utilpsde12 = utilpsde12;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity utilpsde13;

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE13(){
		if(this.utilpsde13 != null) return this.utilpsde13;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE13);
		if(value == null){
			return null;
		}
		this.utilpsde13 = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETUTILPSDE13);
		return this.utilpsde13;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE13Must(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getUtilPSDE13();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定功能实体13");}
		return value;
	}

	public void setUtilPSDE13(net.ibizsys.model.dataentity.IPSDataEntity utilpsde13){
		this.utilpsde13 = utilpsde13;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity utilpsde14;

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE14(){
		if(this.utilpsde14 != null) return this.utilpsde14;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE14);
		if(value == null){
			return null;
		}
		this.utilpsde14 = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETUTILPSDE14);
		return this.utilpsde14;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE14Must(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getUtilPSDE14();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定功能实体14");}
		return value;
	}

	public void setUtilPSDE14(net.ibizsys.model.dataentity.IPSDataEntity utilpsde14){
		this.utilpsde14 = utilpsde14;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity utilpsde15;

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE15(){
		if(this.utilpsde15 != null) return this.utilpsde15;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE15);
		if(value == null){
			return null;
		}
		this.utilpsde15 = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETUTILPSDE15);
		return this.utilpsde15;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE15Must(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getUtilPSDE15();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定功能实体15");}
		return value;
	}

	public void setUtilPSDE15(net.ibizsys.model.dataentity.IPSDataEntity utilpsde15){
		this.utilpsde15 = utilpsde15;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity utilpsde16;

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE16(){
		if(this.utilpsde16 != null) return this.utilpsde16;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE16);
		if(value == null){
			return null;
		}
		this.utilpsde16 = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETUTILPSDE16);
		return this.utilpsde16;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE16Must(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getUtilPSDE16();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定功能实体16");}
		return value;
	}

	public void setUtilPSDE16(net.ibizsys.model.dataentity.IPSDataEntity utilpsde16){
		this.utilpsde16 = utilpsde16;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity utilpsde17;

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE17(){
		if(this.utilpsde17 != null) return this.utilpsde17;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE17);
		if(value == null){
			return null;
		}
		this.utilpsde17 = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETUTILPSDE17);
		return this.utilpsde17;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE17Must(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getUtilPSDE17();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定功能实体17");}
		return value;
	}

	public void setUtilPSDE17(net.ibizsys.model.dataentity.IPSDataEntity utilpsde17){
		this.utilpsde17 = utilpsde17;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity utilpsde18;

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE18(){
		if(this.utilpsde18 != null) return this.utilpsde18;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE18);
		if(value == null){
			return null;
		}
		this.utilpsde18 = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETUTILPSDE18);
		return this.utilpsde18;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE18Must(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getUtilPSDE18();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定功能实体18");}
		return value;
	}

	public void setUtilPSDE18(net.ibizsys.model.dataentity.IPSDataEntity utilpsde18){
		this.utilpsde18 = utilpsde18;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity utilpsde19;

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE19(){
		if(this.utilpsde19 != null) return this.utilpsde19;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE19);
		if(value == null){
			return null;
		}
		this.utilpsde19 = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETUTILPSDE19);
		return this.utilpsde19;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE19Must(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getUtilPSDE19();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定功能实体19");}
		return value;
	}

	public void setUtilPSDE19(net.ibizsys.model.dataentity.IPSDataEntity utilpsde19){
		this.utilpsde19 = utilpsde19;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity utilpsde2;

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE2(){
		if(this.utilpsde2 != null) return this.utilpsde2;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE2);
		if(value == null){
			return null;
		}
		this.utilpsde2 = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETUTILPSDE2);
		return this.utilpsde2;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE2Must(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getUtilPSDE2();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定功能实体2");}
		return value;
	}

	public void setUtilPSDE2(net.ibizsys.model.dataentity.IPSDataEntity utilpsde2){
		this.utilpsde2 = utilpsde2;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity utilpsde20;

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE20(){
		if(this.utilpsde20 != null) return this.utilpsde20;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE20);
		if(value == null){
			return null;
		}
		this.utilpsde20 = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETUTILPSDE20);
		return this.utilpsde20;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE20Must(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getUtilPSDE20();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定功能实体20");}
		return value;
	}

	public void setUtilPSDE20(net.ibizsys.model.dataentity.IPSDataEntity utilpsde20){
		this.utilpsde20 = utilpsde20;
	}


	public java.lang.String getUtilPSDE2Name(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE2NAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.IPSDataEntity utilpsde3;

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE3(){
		if(this.utilpsde3 != null) return this.utilpsde3;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE3);
		if(value == null){
			return null;
		}
		this.utilpsde3 = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETUTILPSDE3);
		return this.utilpsde3;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE3Must(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getUtilPSDE3();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定功能实体3");}
		return value;
	}

	public void setUtilPSDE3(net.ibizsys.model.dataentity.IPSDataEntity utilpsde3){
		this.utilpsde3 = utilpsde3;
	}


	public java.lang.String getUtilPSDE3Name(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE3NAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.IPSDataEntity utilpsde4;

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE4(){
		if(this.utilpsde4 != null) return this.utilpsde4;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE4);
		if(value == null){
			return null;
		}
		this.utilpsde4 = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETUTILPSDE4);
		return this.utilpsde4;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE4Must(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getUtilPSDE4();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定功能实体4");}
		return value;
	}

	public void setUtilPSDE4(net.ibizsys.model.dataentity.IPSDataEntity utilpsde4){
		this.utilpsde4 = utilpsde4;
	}


	public java.lang.String getUtilPSDE4Name(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE4NAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.IPSDataEntity utilpsde5;

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE5(){
		if(this.utilpsde5 != null) return this.utilpsde5;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE5);
		if(value == null){
			return null;
		}
		this.utilpsde5 = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETUTILPSDE5);
		return this.utilpsde5;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE5Must(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getUtilPSDE5();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定功能实体5");}
		return value;
	}

	public void setUtilPSDE5(net.ibizsys.model.dataentity.IPSDataEntity utilpsde5){
		this.utilpsde5 = utilpsde5;
	}


	public java.lang.String getUtilPSDE5Name(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE5NAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.IPSDataEntity utilpsde6;

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE6(){
		if(this.utilpsde6 != null) return this.utilpsde6;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE6);
		if(value == null){
			return null;
		}
		this.utilpsde6 = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETUTILPSDE6);
		return this.utilpsde6;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE6Must(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getUtilPSDE6();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定功能实体6");}
		return value;
	}

	public void setUtilPSDE6(net.ibizsys.model.dataentity.IPSDataEntity utilpsde6){
		this.utilpsde6 = utilpsde6;
	}


	public java.lang.String getUtilPSDE6Name(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE6NAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.IPSDataEntity utilpsde7;

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE7(){
		if(this.utilpsde7 != null) return this.utilpsde7;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE7);
		if(value == null){
			return null;
		}
		this.utilpsde7 = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETUTILPSDE7);
		return this.utilpsde7;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE7Must(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getUtilPSDE7();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定功能实体7");}
		return value;
	}

	public void setUtilPSDE7(net.ibizsys.model.dataentity.IPSDataEntity utilpsde7){
		this.utilpsde7 = utilpsde7;
	}


	public java.lang.String getUtilPSDE7Name(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE7NAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.IPSDataEntity utilpsde8;

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE8(){
		if(this.utilpsde8 != null) return this.utilpsde8;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE8);
		if(value == null){
			return null;
		}
		this.utilpsde8 = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETUTILPSDE8);
		return this.utilpsde8;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE8Must(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getUtilPSDE8();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定功能实体8");}
		return value;
	}

	public void setUtilPSDE8(net.ibizsys.model.dataentity.IPSDataEntity utilpsde8){
		this.utilpsde8 = utilpsde8;
	}


	public java.lang.String getUtilPSDE8Name(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE8NAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.IPSDataEntity utilpsde9;

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE9(){
		if(this.utilpsde9 != null) return this.utilpsde9;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE9);
		if(value == null){
			return null;
		}
		this.utilpsde9 = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETUTILPSDE9);
		return this.utilpsde9;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getUtilPSDE9Must(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getUtilPSDE9();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定功能实体9");}
		return value;
	}

	public void setUtilPSDE9(net.ibizsys.model.dataentity.IPSDataEntity utilpsde9){
		this.utilpsde9 = utilpsde9;
	}


	public java.lang.String getUtilPSDE9Name(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDE9NAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUtilPSDEName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPSDENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getUtilParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getUtilTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUtilTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUtilType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUTILTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isRegToSys(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISREGTOSYS);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isTryMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISTRYMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
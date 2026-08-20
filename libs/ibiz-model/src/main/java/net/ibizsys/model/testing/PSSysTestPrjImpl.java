package net.ibizsys.model.testing;



public class PSSysTestPrjImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.testing.IPSSysTestPrj{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETMEMO = "memo";
	public final static String ATTR_GETPSAPPLICATION = "getPSApplication";
	public final static String ATTR_GETPSSYSRESOURCE = "getPSSysResource";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSSERVICEAPI = "getPSSysServiceAPI";
	public final static String ATTR_GETPSSYSTESTMODULES = "getPSSysTestModules";
	public final static String ATTR_GETPSSYSUNIRES = "getPSSysUniRes";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";
	public final static String ATTR_GETPRJPARAMS = "prjParams";
	public final static String ATTR_GETPRJTAG = "prjTag";
	public final static String ATTR_GETPRJTAG2 = "prjTag2";
	public final static String ATTR_GETPRJTYPE = "prjType";
	public final static String ATTR_GETSERVICECODENAME = "serviceCodeName";
	public final static String ATTR_GETSERVICEPARAM = "serviceParam";
	public final static String ATTR_GETSERVICEPARAM2 = "serviceParam2";
	public final static String ATTR_GETSERVICEPATH = "servicePath";
	public final static String ATTR_GETTESTTOOL = "testTool";
	public final static String ATTR_GETTOOLPARAMS = "toolParams";
	public final static String ATTR_ISENABLESERVICEAPI = "enableServiceAPI";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMemo(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMEMO);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.IPSApplication psapplication;

	public net.ibizsys.model.app.IPSApplication getPSApplication(){
		if(this.psapplication != null) return this.psapplication;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPLICATION);
		if(value == null){
			return null;
		}
		this.psapplication = getPSModelObject(net.ibizsys.model.app.IPSApplication.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPLICATION);
		return this.psapplication;
	}

	public net.ibizsys.model.app.IPSApplication getPSApplicationMust(){
		net.ibizsys.model.app.IPSApplication value = this.getPSApplication();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统应用");}
		return value;
	}

	public void setPSApplication(net.ibizsys.model.app.IPSApplication psapplication){
		this.psapplication = psapplication;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统资源");}
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

	private net.ibizsys.model.service.IPSSysServiceAPI pssysserviceapi;

	public net.ibizsys.model.service.IPSSysServiceAPI getPSSysServiceAPI(){
		if(this.pssysserviceapi != null) return this.pssysserviceapi;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSSERVICEAPI);
		if(value == null){
			return null;
		}
		this.pssysserviceapi = getPSModelObject(net.ibizsys.model.service.IPSSysServiceAPI.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSSERVICEAPI);
		return this.pssysserviceapi;
	}

	public net.ibizsys.model.service.IPSSysServiceAPI getPSSysServiceAPIMust(){
		net.ibizsys.model.service.IPSSysServiceAPI value = this.getPSSysServiceAPI();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统服务接口");}
		return value;
	}

	public void setPSSysServiceAPI(net.ibizsys.model.service.IPSSysServiceAPI pssysserviceapi){
		this.pssysserviceapi = pssysserviceapi;
	}


	private java.util.List<net.ibizsys.model.testing.IPSSysTestModule> pssystestmodules = null;
	public java.util.List<net.ibizsys.model.testing.IPSSysTestModule> getPSSysTestModules(){
		if(this.pssystestmodules == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSTESTMODULES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.testing.IPSSysTestModule> list = new java.util.ArrayList<net.ibizsys.model.testing.IPSSysTestModule>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.testing.IPSSysTestModule obj = this.getPSModelObject(net.ibizsys.model.testing.IPSSysTestModule.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSSYSTESTMODULES);
				if(obj!=null)list.add(obj);
			}
			this.pssystestmodules = list;
		}
		return (this.pssystestmodules.size() == 0)? null : this.pssystestmodules;
	}

	public net.ibizsys.model.testing.IPSSysTestModule getPSSysTestModule(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.testing.IPSSysTestModule.class, this.getPSSysTestModules(), objKey, bTryMode);
	}
	public void setPSSysTestModules(java.util.List<net.ibizsys.model.testing.IPSSysTestModule> list){
		this.pssystestmodules = list;
	}
	private net.ibizsys.model.security.IPSSysUniRes pssysunires;

	public net.ibizsys.model.security.IPSSysUniRes getPSSysUniRes(){
		if(this.pssysunires != null) return this.pssysunires;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSUNIRES);
		if(value == null){
			return null;
		}
		this.pssysunires = getPSModelObject(net.ibizsys.model.security.IPSSysUniRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSUNIRES);
		return this.pssysunires;
	}

	public net.ibizsys.model.security.IPSSysUniRes getPSSysUniResMust(){
		net.ibizsys.model.security.IPSSysUniRes value = this.getPSSysUniRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定访问统一资源");}
		return value;
	}

	public void setPSSysUniRes(net.ibizsys.model.security.IPSSysUniRes pssysunires){
		this.pssysunires = pssysunires;
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


	public com.fasterxml.jackson.databind.node.ObjectNode getPrjParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPRJPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getPrjTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPRJTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPrjTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPRJTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPrjType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPRJTYPE);
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

	public java.lang.String getServicePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERVICEPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTestTool(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTESTTOOL);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getToolParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTOOLPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public boolean isEnableServiceAPI(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLESERVICEAPI);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
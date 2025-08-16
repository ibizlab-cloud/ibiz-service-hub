package net.ibizsys.model.backservice;



public class PSSysBackServiceImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.backservice.IPSSysBackService{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCONTAINERTAG = "containerTag";
	public final static String ATTR_GETPSDEACTION = "getPSDEAction";
	public final static String ATTR_GETPSDEDATASET = "getPSDEDataSet";
	public final static String ATTR_GETPSDATAENTITY = "getPSDataEntity";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";
	public final static String ATTR_GETPREDEFINEDTYPE = "predefinedType";
	public final static String ATTR_GETSERVICECONTAINER = "serviceContainer";
	public final static String ATTR_GETSERVICEHANDLER = "serviceHandler";
	public final static String ATTR_GETSERVICEORDER = "serviceOrder";
	public final static String ATTR_GETSERVICEPARAMS = "serviceParams";
	public final static String ATTR_GETSERVICEPOLICY = "servicePolicy";
	public final static String ATTR_GETSERVICEPOLICY2 = "servicePolicy2";
	public final static String ATTR_GETSERVICETAG = "serviceTag";
	public final static String ATTR_GETSERVICETAG2 = "serviceTag2";
	public final static String ATTR_GETSTARTMODE = "startMode";
	public final static String ATTR_GETTASKTYPE = "taskType";
	public final static String ATTR_GETTIMERPOLICY = "timerPolicy";
	public final static String ATTR_ISLOCALMODE = "localMode";
	public final static String ATTR_ISSTANDALONE = "standalone";
	public final static String ATTR_ISTIMERMODE = "timerMode";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getContainerTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTAINERTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.action.IPSDEAction psdeaction;

	public net.ibizsys.model.dataentity.action.IPSDEAction getPSDEAction(){
		if(this.psdeaction != null) return this.psdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.psdeaction = ipsdataentity.getPSDEAction(value, false);
		return this.psdeaction;
	}

	public net.ibizsys.model.dataentity.action.IPSDEAction getPSDEActionMust(){
		net.ibizsys.model.dataentity.action.IPSDEAction value = this.getPSDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定调用实体行为");}
		return value;
	}

	private net.ibizsys.model.dataentity.ds.IPSDEDataSet psdedataset;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet(){
		if(this.psdedataset != null) return this.psdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATASET);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.psdedataset = ipsdataentity.getPSDEDataSet(value, false);
		return this.psdedataset;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getPSDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目标数据集");}
		return value;
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


	public java.lang.String getPredefinedType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPREDEFINEDTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getServiceContainer(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERVICECONTAINER);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getServiceHandler(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERVICEHANDLER);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getServiceOrder(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERVICEORDER);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getServiceParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERVICEPARAMS);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getServicePolicy(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERVICEPOLICY);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getServicePolicy2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERVICEPOLICY2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getServiceTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERVICETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getServiceTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSERVICETAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getStartMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTARTMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTaskType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTASKTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTimerPolicy(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTIMERPOLICY);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isLocalMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISLOCALMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isStandalone(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSTANDALONE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isTimerMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISTIMERMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
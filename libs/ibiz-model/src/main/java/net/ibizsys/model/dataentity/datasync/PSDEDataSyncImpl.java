package net.ibizsys.model.dataentity.datasync;



public class PSDEDataSyncImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.datasync.IPSDEDataSync
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETEVENTTYPE = "eventType";
	public final static String ATTR_GETIMPORTPSDEACTION = "getImportPSDEAction";
	public final static String ATTR_GETINPSDEDATASET = "getInPSDEDataSet";
	public final static String ATTR_GETINPSSYSDATASYNCAGENT = "getInPSSysDataSyncAgent";
	public final static String ATTR_GETINSCRIPTCODE = "inScriptCode";
	public final static String ATTR_GETINTESTPSDEACTION = "getInTestPSDEAction";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETOUTPSDEDATASET = "getOutPSDEDataSet";
	public final static String ATTR_GETOUTPSSYSDATASYNCAGENT = "getOutPSSysDataSyncAgent";
	public final static String ATTR_GETOUTSCRIPTCODE = "outScriptCode";
	public final static String ATTR_GETOUTTESTPSDEACTION = "getOutTestPSDEAction";
	public final static String ATTR_GETOUTPUTMODE = "outputMode";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETSYNCDIR = "syncDir";
	public final static String ATTR_GETSYNCTAG = "syncTag";
	public final static String ATTR_ISEXPORTFULL = "exportFull";
	public final static String ATTR_ISINCUSTOMCODE = "inCustomCode";
	public final static String ATTR_ISINMODE = "inMode";
	public final static String ATTR_ISOUTCUSTOMCODE = "outCustomCode";
	public final static String ATTR_ISVALID = "valid";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getEventType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEVENTTYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.action.IPSDEAction importpsdeaction;

	public net.ibizsys.model.dataentity.action.IPSDEAction getImportPSDEAction(){
		if(this.importpsdeaction != null) return this.importpsdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETIMPORTPSDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.importpsdeaction = ipsdataentity.getPSDEAction(value, false);
		return this.importpsdeaction;
	}

	public net.ibizsys.model.dataentity.action.IPSDEAction getImportPSDEActionMust(){
		net.ibizsys.model.dataentity.action.IPSDEAction value = this.getImportPSDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定导入实体行为");}
		return value;
	}

	public void setImportPSDEAction(net.ibizsys.model.dataentity.action.IPSDEAction importpsdeaction){
		this.importpsdeaction = importpsdeaction;
	}

	private net.ibizsys.model.dataentity.ds.IPSDEDataSet inpsdedataset;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getInPSDEDataSet(){
		if(this.inpsdedataset != null) return this.inpsdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINPSDEDATASET);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.inpsdedataset = ipsdataentity.getPSDEDataSet(value, false);
		return this.inpsdedataset;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getInPSDEDataSetMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getInPSDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定输入数据集合");}
		return value;
	}

	public void setInPSDEDataSet(net.ibizsys.model.dataentity.ds.IPSDEDataSet inpsdedataset){
		this.inpsdedataset = inpsdedataset;
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


	public java.lang.String getInScriptCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINSCRIPTCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.action.IPSDEAction intestpsdeaction;

	public net.ibizsys.model.dataentity.action.IPSDEAction getInTestPSDEAction(){
		if(this.intestpsdeaction != null) return this.intestpsdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINTESTPSDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.intestpsdeaction = ipsdataentity.getPSDEAction(value, false);
		return this.intestpsdeaction;
	}

	public net.ibizsys.model.dataentity.action.IPSDEAction getInTestPSDEActionMust(){
		net.ibizsys.model.dataentity.action.IPSDEAction value = this.getInTestPSDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定输入判断实体行为");}
		return value;
	}

	public void setInTestPSDEAction(net.ibizsys.model.dataentity.action.IPSDEAction intestpsdeaction){
		this.intestpsdeaction = intestpsdeaction;
	}


	@Deprecated
	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.ds.IPSDEDataSet outpsdedataset;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getOutPSDEDataSet(){
		if(this.outpsdedataset != null) return this.outpsdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETOUTPSDEDATASET);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.outpsdedataset = ipsdataentity.getPSDEDataSet(value, false);
		return this.outpsdedataset;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getOutPSDEDataSetMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getOutPSDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定输出数据集合");}
		return value;
	}

	public void setOutPSDEDataSet(net.ibizsys.model.dataentity.ds.IPSDEDataSet outpsdedataset){
		this.outpsdedataset = outpsdedataset;
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


	public java.lang.String getOutScriptCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETOUTSCRIPTCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.action.IPSDEAction outtestpsdeaction;

	public net.ibizsys.model.dataentity.action.IPSDEAction getOutTestPSDEAction(){
		if(this.outtestpsdeaction != null) return this.outtestpsdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETOUTTESTPSDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.outtestpsdeaction = ipsdataentity.getPSDEAction(value, false);
		return this.outtestpsdeaction;
	}

	public net.ibizsys.model.dataentity.action.IPSDEAction getOutTestPSDEActionMust(){
		net.ibizsys.model.dataentity.action.IPSDEAction value = this.getOutTestPSDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定输出判断实体行为");}
		return value;
	}

	public void setOutTestPSDEAction(net.ibizsys.model.dataentity.action.IPSDEAction outtestpsdeaction){
		this.outtestpsdeaction = outtestpsdeaction;
	}


	public int getOutputMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETOUTPUTMODE);
		if(value == null){
			return 1;
		}
		return value.asInt();
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


	public java.lang.String getSyncDir(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSYNCDIR);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getSyncTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSYNCTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isExportFull(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISEXPORTFULL);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isInCustomCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISINCUSTOMCODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isInMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISINMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isOutCustomCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISOUTCUSTOMCODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isValid(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISVALID);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}
}
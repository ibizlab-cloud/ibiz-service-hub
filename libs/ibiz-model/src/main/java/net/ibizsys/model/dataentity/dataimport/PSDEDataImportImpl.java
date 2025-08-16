package net.ibizsys.model.dataentity.dataimport;



public class PSDEDataImportImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.dataimport.IPSDEDataImport
		,net.ibizsys.model.app.dataentity.IPSAppDEDataImport
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETBATCHSIZE = "batchSize";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCREATEDATAACCESSACTION = "createDataAccessAction";
	public final static String ATTR_GETCREATEPSAPPDEACTION = "getCreatePSAppDEAction";
	public final static String ATTR_GETCREATEPSDEACTION = "getCreatePSDEAction";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETIMPPARAMS = "impParams";
	public final static String ATTR_GETIMPTAG = "impTag";
	public final static String ATTR_GETIMPTAG2 = "impTag2";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPOTIME = "pOTime";
	public final static String ATTR_GETPSDEDATAIMPORTITEMS = "getPSDEDataImportItems";
	public final static String ATTR_GETPSSYSPFPLUGIN = "getPSSysPFPlugin";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETUPDATEDATAACCESSACTION = "updateDataAccessAction";
	public final static String ATTR_GETUPDATEPSAPPDEACTION = "getUpdatePSAppDEAction";
	public final static String ATTR_GETUPDATEPSDEACTION = "getUpdatePSDEAction";
	public final static String ATTR_ISDEFAULTMODE = "defaultMode";
	public final static String ATTR_ISENABLEBACKEND = "enableBackend";
	public final static String ATTR_ISENABLECUSTOMIZED = "enableCustomized";
	public final static String ATTR_ISENABLEFRONT = "enableFront";
	public final static String ATTR_ISIGNOREERROR = "ignoreError";
	public final static String ATTR_ISVALID = "valid";

	public int getBatchSize(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBATCHSIZE);
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

	public java.lang.String getCreateDataAccessAction(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCREATEDATAACCESSACTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEAction createpsappdeaction;

	public net.ibizsys.model.app.dataentity.IPSAppDEAction getCreatePSAppDEAction(){
		if(this.createpsappdeaction != null) return this.createpsappdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCREATEPSAPPDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = getParentPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class);
		this.createpsappdeaction = ipsappdataentity.getPSAppDEAction(value, false);
		return this.createpsappdeaction;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEAction getCreatePSAppDEActionMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEAction value = this.getCreatePSAppDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定建立应用实体行为");}
		return value;
	}

	public void setCreatePSAppDEAction(net.ibizsys.model.app.dataentity.IPSAppDEAction createpsappdeaction){
		this.createpsappdeaction = createpsappdeaction;
	}

	private net.ibizsys.model.dataentity.action.IPSDEAction createpsdeaction;

	public net.ibizsys.model.dataentity.action.IPSDEAction getCreatePSDEAction(){
		if(this.createpsdeaction != null) return this.createpsdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCREATEPSDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.createpsdeaction = ipsdataentity.getPSDEAction(value, false);
		return this.createpsdeaction;
	}

	public net.ibizsys.model.dataentity.action.IPSDEAction getCreatePSDEActionMust(){
		net.ibizsys.model.dataentity.action.IPSDEAction value = this.getCreatePSDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定建立数据行为");}
		return value;
	}

	public void setCreatePSDEAction(net.ibizsys.model.dataentity.action.IPSDEAction createpsdeaction){
		this.createpsdeaction = createpsdeaction;
	}


	@Deprecated
	public java.lang.String getDynaModelFilePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMODELFILEPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getImpParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETIMPPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getImpTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETIMPTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getImpTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETIMPTAG2);
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

	public int getPOTime(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPOTIME);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	private java.util.List<net.ibizsys.model.dataentity.dataimport.IPSDEDataImportItem> psdedataimportitems = null;
	public java.util.List<net.ibizsys.model.dataentity.dataimport.IPSDEDataImportItem> getPSDEDataImportItems(){
		if(this.psdedataimportitems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATAIMPORTITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.dataimport.IPSDEDataImportItem> list = new java.util.ArrayList<net.ibizsys.model.dataentity.dataimport.IPSDEDataImportItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.dataimport.IPSDEDataImportItem obj = this.getPSModelObject(net.ibizsys.model.dataentity.dataimport.IPSDEDataImportItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEDATAIMPORTITEMS);
				if(obj!=null)list.add(obj);
			}
			this.psdedataimportitems = list;
		}
		return (this.psdedataimportitems.size() == 0)? null : this.psdedataimportitems;
	}

	public net.ibizsys.model.dataentity.dataimport.IPSDEDataImportItem getPSDEDataImportItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.dataimport.IPSDEDataImportItem.class, this.getPSDEDataImportItems(), objKey, bTryMode);
	}
	public void setPSDEDataImportItems(java.util.List<net.ibizsys.model.dataentity.dataimport.IPSDEDataImportItem> list){
		this.psdedataimportitems = list;
	}
	private net.ibizsys.model.res.IPSSysPFPlugin pssyspfplugin;

	public net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPlugin(){
		if(this.pssyspfplugin != null) return this.pssyspfplugin;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSPFPLUGIN);
		if(value == null){
			return null;
		}
		this.pssyspfplugin = getPSModelObject(net.ibizsys.model.res.IPSSysPFPlugin.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSPFPLUGIN);
		return this.pssyspfplugin;
	}

	public net.ibizsys.model.res.IPSSysPFPlugin getPSSysPFPluginMust(){
		net.ibizsys.model.res.IPSSysPFPlugin value = this.getPSSysPFPlugin();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定前端扩展插件");}
		return value;
	}

	public void setPSSysPFPlugin(net.ibizsys.model.res.IPSSysPFPlugin pssyspfplugin){
		this.pssyspfplugin = pssyspfplugin;
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


	public java.lang.String getUpdateDataAccessAction(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUPDATEDATAACCESSACTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEAction updatepsappdeaction;

	public net.ibizsys.model.app.dataentity.IPSAppDEAction getUpdatePSAppDEAction(){
		if(this.updatepsappdeaction != null) return this.updatepsappdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUPDATEPSAPPDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = getParentPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class);
		this.updatepsappdeaction = ipsappdataentity.getPSAppDEAction(value, false);
		return this.updatepsappdeaction;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEAction getUpdatePSAppDEActionMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEAction value = this.getUpdatePSAppDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定更新应用实体行为");}
		return value;
	}

	public void setUpdatePSAppDEAction(net.ibizsys.model.app.dataentity.IPSAppDEAction updatepsappdeaction){
		this.updatepsappdeaction = updatepsappdeaction;
	}

	private net.ibizsys.model.dataentity.action.IPSDEAction updatepsdeaction;

	public net.ibizsys.model.dataentity.action.IPSDEAction getUpdatePSDEAction(){
		if(this.updatepsdeaction != null) return this.updatepsdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUPDATEPSDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.updatepsdeaction = ipsdataentity.getPSDEAction(value, false);
		return this.updatepsdeaction;
	}

	public net.ibizsys.model.dataentity.action.IPSDEAction getUpdatePSDEActionMust(){
		net.ibizsys.model.dataentity.action.IPSDEAction value = this.getUpdatePSDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定更新数据行为");}
		return value;
	}

	public void setUpdatePSDEAction(net.ibizsys.model.dataentity.action.IPSDEAction updatepsdeaction){
		this.updatepsdeaction = updatepsdeaction;
	}


	public boolean isDefaultMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDEFAULTMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableBackend(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEBACKEND);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableCustomized(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLECUSTOMIZED);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableFront(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEFRONT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isIgnoreError(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISIGNOREERROR);
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
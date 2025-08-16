package net.ibizsys.model.res;



public class PSSysUniStateImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.res.IPSSysUniState{

	public final static String ATTR_GETCACHECAT = "cacheCat";
	public final static String ATTR_GETCACHETIMEOUT = "cacheTimeout";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETFOLDER2PSDEFIELD = "getFolder2PSDEField";
	public final static String ATTR_GETFOLDER3PSDEFIELD = "getFolder3PSDEField";
	public final static String ATTR_GETFOLDER4PSDEFIELD = "getFolder4PSDEField";
	public final static String ATTR_GETFOLDER5PSDEFIELD = "getFolder5PSDEField";
	public final static String ATTR_GETFOLDER6PSDEFIELD = "getFolder6PSDEField";
	public final static String ATTR_GETFOLDER7PSDEFIELD = "getFolder7PSDEField";
	public final static String ATTR_GETFOLDER8PSDEFIELD = "getFolder8PSDEField";
	public final static String ATTR_GETFOLDERPSDEFIELD = "getFolderPSDEField";
	public final static String ATTR_GETINITPSDELOGIC = "getInitPSDELogic";
	public final static String ATTR_GETKEYPSDEFIELD = "getKeyPSDEField";
	public final static String ATTR_GETMONITORFORMAT = "monitorFormat";
	public final static String ATTR_GETONCHANGEPSDELOGIC = "getOnChangePSDELogic";
	public final static String ATTR_GETONDELETEPSDELOGIC = "getOnDeletePSDELogic";
	public final static String ATTR_GETPSDEDATASET = "getPSDEDataSet";
	public final static String ATTR_GETPSDATAENTITY = "getPSDataEntity";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";
	public final static String ATTR_GETPATHFORMAT = "pathFormat";
	public final static String ATTR_GETRELOADTIMER = "reloadTimer";
	public final static String ATTR_GETSTATE2PSDEFIELD = "getState2PSDEField";
	public final static String ATTR_GETSTATE3PSDEFIELD = "getState3PSDEField";
	public final static String ATTR_GETSTATE4PSDEFIELD = "getState4PSDEField";
	public final static String ATTR_GETSTATE5PSDEFIELD = "getState5PSDEField";
	public final static String ATTR_GETSTATE6PSDEFIELD = "getState6PSDEField";
	public final static String ATTR_GETSTATE7PSDEFIELD = "getState7PSDEField";
	public final static String ATTR_GETSTATE8PSDEFIELD = "getState8PSDEField";
	public final static String ATTR_GETSTATEPSDEFIELD = "getStatePSDEField";
	public final static String ATTR_GETUNISTATEMODE = "uniStateMode";
	public final static String ATTR_GETUNISTATEPARAMS = "uniStateParams";
	public final static String ATTR_GETUNISTATETAG = "uniStateTag";
	public final static String ATTR_GETUNISTATETAG2 = "uniStateTag2";
	public final static String ATTR_GETUNISTATETYPE = "uniStateType";
	public final static String ATTR_GETUNIQUETAG = "uniqueTag";
	public final static String ATTR_ISALLDATA = "allData";
	public final static String ATTR_ISDELETEASUPDATE = "deleteAsUpdate";

	public java.lang.String getCacheCat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCACHECAT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getCacheTimeout(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCACHETIMEOUT);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	@Deprecated
	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField folder2psdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getFolder2PSDEField(){
		if(this.folder2psdefield != null) return this.folder2psdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFOLDER2PSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.folder2psdefield = ipsdataentity.getPSDEField(value, false);
		return this.folder2psdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getFolder2PSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getFolder2PSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目录2属性");}
		return value;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField folder3psdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getFolder3PSDEField(){
		if(this.folder3psdefield != null) return this.folder3psdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFOLDER3PSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.folder3psdefield = ipsdataentity.getPSDEField(value, false);
		return this.folder3psdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getFolder3PSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getFolder3PSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目录3属性");}
		return value;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField folder4psdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getFolder4PSDEField(){
		if(this.folder4psdefield != null) return this.folder4psdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFOLDER4PSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.folder4psdefield = ipsdataentity.getPSDEField(value, false);
		return this.folder4psdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getFolder4PSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getFolder4PSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目录4属性");}
		return value;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField folder5psdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getFolder5PSDEField(){
		if(this.folder5psdefield != null) return this.folder5psdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFOLDER5PSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.folder5psdefield = ipsdataentity.getPSDEField(value, false);
		return this.folder5psdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getFolder5PSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getFolder5PSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目录5属性");}
		return value;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField folder6psdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getFolder6PSDEField(){
		if(this.folder6psdefield != null) return this.folder6psdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFOLDER6PSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.folder6psdefield = ipsdataentity.getPSDEField(value, false);
		return this.folder6psdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getFolder6PSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getFolder6PSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目录6属性");}
		return value;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField folder7psdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getFolder7PSDEField(){
		if(this.folder7psdefield != null) return this.folder7psdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFOLDER7PSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.folder7psdefield = ipsdataentity.getPSDEField(value, false);
		return this.folder7psdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getFolder7PSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getFolder7PSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目录7属性");}
		return value;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField folder8psdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getFolder8PSDEField(){
		if(this.folder8psdefield != null) return this.folder8psdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFOLDER8PSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.folder8psdefield = ipsdataentity.getPSDEField(value, false);
		return this.folder8psdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getFolder8PSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getFolder8PSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目录8属性");}
		return value;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField folderpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getFolderPSDEField(){
		if(this.folderpsdefield != null) return this.folderpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFOLDERPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.folderpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.folderpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getFolderPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getFolderPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定目录属性");}
		return value;
	}

	private net.ibizsys.model.dataentity.logic.IPSDELogic initpsdelogic;

	public net.ibizsys.model.dataentity.logic.IPSDELogic getInitPSDELogic(){
		if(this.initpsdelogic != null) return this.initpsdelogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINITPSDELOGIC);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.initpsdelogic = ipsdataentity.getPSDELogic(value, false);
		return this.initpsdelogic;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogic getInitPSDELogicMust(){
		net.ibizsys.model.dataentity.logic.IPSDELogic value = this.getInitPSDELogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定初始化逻辑");}
		return value;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField keypsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getKeyPSDEField(){
		if(this.keypsdefield != null) return this.keypsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETKEYPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.keypsdefield = ipsdataentity.getPSDEField(value, false);
		return this.keypsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getKeyPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getKeyPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定标识属性");}
		return value;
	}


	public java.lang.String getMonitorFormat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMONITORFORMAT);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.logic.IPSDELogic onchangepsdelogic;

	public net.ibizsys.model.dataentity.logic.IPSDELogic getOnChangePSDELogic(){
		if(this.onchangepsdelogic != null) return this.onchangepsdelogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETONCHANGEPSDELOGIC);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.onchangepsdelogic = ipsdataentity.getPSDELogic(value, false);
		return this.onchangepsdelogic;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogic getOnChangePSDELogicMust(){
		net.ibizsys.model.dataentity.logic.IPSDELogic value = this.getOnChangePSDELogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定变更逻辑");}
		return value;
	}

	private net.ibizsys.model.dataentity.logic.IPSDELogic ondeletepsdelogic;

	public net.ibizsys.model.dataentity.logic.IPSDELogic getOnDeletePSDELogic(){
		if(this.ondeletepsdelogic != null) return this.ondeletepsdelogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETONDELETEPSDELOGIC);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.ondeletepsdelogic = ipsdataentity.getPSDELogic(value, false);
		return this.ondeletepsdelogic;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogic getOnDeletePSDELogicMust(){
		net.ibizsys.model.dataentity.logic.IPSDELogic value = this.getOnDeletePSDELogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定删除逻辑");}
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定预载数据集");}
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体");}
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定后端模板插件对象");}
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


	public java.lang.String getPathFormat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPATHFORMAT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getReloadTimer(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRELOADTIMER);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField state2psdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getState2PSDEField(){
		if(this.state2psdefield != null) return this.state2psdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTATE2PSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.state2psdefield = ipsdataentity.getPSDEField(value, false);
		return this.state2psdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getState2PSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getState2PSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定状态2属性");}
		return value;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField state3psdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getState3PSDEField(){
		if(this.state3psdefield != null) return this.state3psdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTATE3PSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.state3psdefield = ipsdataentity.getPSDEField(value, false);
		return this.state3psdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getState3PSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getState3PSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定状态3属性");}
		return value;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField state4psdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getState4PSDEField(){
		if(this.state4psdefield != null) return this.state4psdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTATE4PSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.state4psdefield = ipsdataentity.getPSDEField(value, false);
		return this.state4psdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getState4PSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getState4PSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定状态4属性");}
		return value;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField state5psdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getState5PSDEField(){
		if(this.state5psdefield != null) return this.state5psdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTATE5PSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.state5psdefield = ipsdataentity.getPSDEField(value, false);
		return this.state5psdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getState5PSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getState5PSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定状态5属性");}
		return value;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField state6psdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getState6PSDEField(){
		if(this.state6psdefield != null) return this.state6psdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTATE6PSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.state6psdefield = ipsdataentity.getPSDEField(value, false);
		return this.state6psdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getState6PSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getState6PSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定状态6属性");}
		return value;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField state7psdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getState7PSDEField(){
		if(this.state7psdefield != null) return this.state7psdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTATE7PSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.state7psdefield = ipsdataentity.getPSDEField(value, false);
		return this.state7psdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getState7PSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getState7PSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定状态7属性");}
		return value;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField state8psdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getState8PSDEField(){
		if(this.state8psdefield != null) return this.state8psdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTATE8PSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.state8psdefield = ipsdataentity.getPSDEField(value, false);
		return this.state8psdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getState8PSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getState8PSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定状态8属性");}
		return value;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField statepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getStatePSDEField(){
		if(this.statepsdefield != null) return this.statepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTATEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.statepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.statepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getStatePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getStatePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定状态属性");}
		return value;
	}


	public java.lang.String getUniStateMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNISTATEMODE);
		if(value == null){
			return "DEFAULT";
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getUniStateParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNISTATEPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getUniStateTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNISTATETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUniStateTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNISTATETAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUniStateType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNISTATETYPE);
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

	public boolean isAllData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISALLDATA);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isDeleteAsUpdate(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDELETEASUPDATE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
package net.ibizsys.model.dataentity.print;



public class PSDEPrintImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.print.IPSDEPrint
		,net.ibizsys.model.app.dataentity.IPSAppDEPrint
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCONTENTTYPE = "contentType";
	public final static String ATTR_GETCONTENTTYPEPSDEFIELD = "getContentTypePSDEField";
	public final static String ATTR_GETDATAACCESSACTION = "dataAccessAction";
	public final static String ATTR_GETDETAILPSDE = "getDetailPSDE";
	public final static String ATTR_GETDETAILPSDEDATASET = "getDetailPSDEDataSet";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETDYNAMICMODE = "dynamicMode";
	public final static String ATTR_GETEXTENDMODE = "extendMode";
	public final static String ATTR_GETGETDATAPSDEACTION = "getGetDataPSDEAction";
	public final static String ATTR_GETGETDATAPSDEOPPRIV = "getGetDataPSDEOPPriv";
	public final static String ATTR_GETNAMEPSDEFIELD = "getNamePSDEField";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPOTIME = "pOTime";
	public final static String ATTR_GETPSSYSPFPLUGIN = "getPSSysPFPlugin";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPRINTCONTEXTID = "printContextId";
	public final static String ATTR_GETPRINTPARAMS = "printParams";
	public final static String ATTR_GETPRINTTAG = "printTag";
	public final static String ATTR_GETPRINTTAG2 = "printTag2";
	public final static String ATTR_GETREPORTFILE = "reportFile";
	public final static String ATTR_GETREPORTMODEL = "reportModel";
	public final static String ATTR_GETREPORTMODELPSDEFIELD = "getReportModelPSDEField";
	public final static String ATTR_GETREPORTTYPE = "reportType";
	public final static String ATTR_GETREPORTTYPEPSDEFIELD = "getReportTypePSDEField";
	public final static String ATTR_GETREPORTUIMODEL = "reportUIModel";
	public final static String ATTR_GETSOURCEPSDEDATASET = "getSourcePSDEDataSet";
	public final static String ATTR_GETSOURCEPSDATAENTITY = "getSourcePSDataEntity";
	public final static String ATTR_GETUNIQUETAGPSDEFIELD = "getUniqueTagPSDEField";
	public final static String ATTR_ISDEFAULTMODE = "defaultMode";
	public final static String ATTR_ISENABLECOLPRIV = "enableColPriv";
	public final static String ATTR_ISENABLELOG = "enableLog";
	public final static String ATTR_ISENABLEMULITPRINT = "enableMulitPrint";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getContentType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField contenttypepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getContentTypePSDEField(){
		if(this.contenttypepsdefield != null) return this.contenttypepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTTYPEPSDEFIELD);
		if(value == null){
			return null;
		}
		this.contenttypepsdefield = this.getSourcePSDataEntityMust().getPSDEField(value, false);
		return this.contenttypepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getContentTypePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getContentTypePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定内容类型值属性对象");}
		return value;
	}

	public void setContentTypePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField contenttypepsdefield){
		this.contenttypepsdefield = contenttypepsdefield;
	}


	public java.lang.String getDataAccessAction(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATAACCESSACTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.IPSDataEntity detailpsde;

	public net.ibizsys.model.dataentity.IPSDataEntity getDetailPSDE(){
		if(this.detailpsde != null) return this.detailpsde;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDETAILPSDE);
		if(value == null){
			return null;
		}
		this.detailpsde = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETDETAILPSDE);
		return this.detailpsde;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getDetailPSDEMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getDetailPSDE();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定明细数据实体对象");}
		return value;
	}

	public void setDetailPSDE(net.ibizsys.model.dataentity.IPSDataEntity detailpsde){
		this.detailpsde = detailpsde;
	}

	private net.ibizsys.model.dataentity.ds.IPSDEDataSet detailpsdedataset;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getDetailPSDEDataSet(){
		if(this.detailpsdedataset != null) return this.detailpsdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDETAILPSDEDATASET);
		if(value == null){
			return null;
		}
		this.detailpsdedataset = this.getDetailPSDEMust().getPSDEDataSet(value, false);
		return this.detailpsdedataset;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getDetailPSDEDataSetMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getDetailPSDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定明细数据实体数据集对象");}
		return value;
	}

	public void setDetailPSDEDataSet(net.ibizsys.model.dataentity.ds.IPSDEDataSet detailpsdedataset){
		this.detailpsdedataset = detailpsdedataset;
	}


	@Deprecated
	public java.lang.String getDynaModelFilePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMODELFILEPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getDynamicMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMICMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	@Deprecated
	public int getExtendMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEXTENDMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.action.IPSDEAction getdatapsdeaction;

	public net.ibizsys.model.dataentity.action.IPSDEAction getGetDataPSDEAction(){
		if(this.getdatapsdeaction != null) return this.getdatapsdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGETDATAPSDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = getParentPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class);
		this.getdatapsdeaction = ipsdataentity.getPSDEAction(value, false);
		return this.getdatapsdeaction;
	}

	public net.ibizsys.model.dataentity.action.IPSDEAction getGetDataPSDEActionMust(){
		net.ibizsys.model.dataentity.action.IPSDEAction value = this.getGetDataPSDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定获取数据实体行为");}
		return value;
	}

	public void setGetDataPSDEAction(net.ibizsys.model.dataentity.action.IPSDEAction getdatapsdeaction){
		this.getdatapsdeaction = getdatapsdeaction;
	}

	private net.ibizsys.model.dataentity.priv.IPSDEOPPriv getdatapsdeoppriv;

	public net.ibizsys.model.dataentity.priv.IPSDEOPPriv getGetDataPSDEOPPriv(){
		if(this.getdatapsdeoppriv != null) return this.getdatapsdeoppriv;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGETDATAPSDEOPPRIV);
		if(value == null){
			return null;
		}
		this.getdatapsdeoppriv = getPSModelObject(net.ibizsys.model.dataentity.priv.IPSDEOPPriv.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETGETDATAPSDEOPPRIV);
		return this.getdatapsdeoppriv;
	}

	public net.ibizsys.model.dataentity.priv.IPSDEOPPriv getGetDataPSDEOPPrivMust(){
		net.ibizsys.model.dataentity.priv.IPSDEOPPriv value = this.getGetDataPSDEOPPriv();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定获取数据实体操作标识");}
		return value;
	}

	public void setGetDataPSDEOPPriv(net.ibizsys.model.dataentity.priv.IPSDEOPPriv getdatapsdeoppriv){
		this.getdatapsdeoppriv = getdatapsdeoppriv;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField namepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getNamePSDEField(){
		if(this.namepsdefield != null) return this.namepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAMEPSDEFIELD);
		if(value == null){
			return null;
		}
		this.namepsdefield = this.getSourcePSDataEntityMust().getPSDEField(value, false);
		return this.namepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getNamePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getNamePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定名称值属性对象");}
		return value;
	}

	public void setNamePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField namepsdefield){
		this.namepsdefield = namepsdefield;
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


	public java.lang.String getPrintContextId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPRINTCONTEXTID);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getPrintParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPRINTPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getPrintTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPRINTTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPrintTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPRINTTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getReportFile(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREPORTFILE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getReportModel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREPORTMODEL);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField reportmodelpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getReportModelPSDEField(){
		if(this.reportmodelpsdefield != null) return this.reportmodelpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREPORTMODELPSDEFIELD);
		if(value == null){
			return null;
		}
		this.reportmodelpsdefield = this.getSourcePSDataEntityMust().getPSDEField(value, false);
		return this.reportmodelpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getReportModelPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getReportModelPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定报表模型值属性对象");}
		return value;
	}

	public void setReportModelPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField reportmodelpsdefield){
		this.reportmodelpsdefield = reportmodelpsdefield;
	}


	public java.lang.String getReportType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREPORTTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField reporttypepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getReportTypePSDEField(){
		if(this.reporttypepsdefield != null) return this.reporttypepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREPORTTYPEPSDEFIELD);
		if(value == null){
			return null;
		}
		this.reporttypepsdefield = this.getSourcePSDataEntityMust().getPSDEField(value, false);
		return this.reporttypepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getReportTypePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getReportTypePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定报表类型值属性对象");}
		return value;
	}

	public void setReportTypePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField reporttypepsdefield){
		this.reporttypepsdefield = reporttypepsdefield;
	}


	public java.lang.String getReportUIModel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREPORTUIMODEL);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.ds.IPSDEDataSet sourcepsdedataset;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getSourcePSDEDataSet(){
		if(this.sourcepsdedataset != null) return this.sourcepsdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSOURCEPSDEDATASET);
		if(value == null){
			return null;
		}
		this.sourcepsdedataset = this.getSourcePSDataEntityMust().getPSDEDataSet(value, false);
		return this.sourcepsdedataset;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getSourcePSDEDataSetMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getSourcePSDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定数据源数据集对象");}
		return value;
	}

	public void setSourcePSDEDataSet(net.ibizsys.model.dataentity.ds.IPSDEDataSet sourcepsdedataset){
		this.sourcepsdedataset = sourcepsdedataset;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity sourcepsdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getSourcePSDataEntity(){
		if(this.sourcepsdataentity != null) return this.sourcepsdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSOURCEPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.sourcepsdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETSOURCEPSDATAENTITY);
		return this.sourcepsdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getSourcePSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getSourcePSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定数据源实体对象");}
		return value;
	}

	public void setSourcePSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity sourcepsdataentity){
		this.sourcepsdataentity = sourcepsdataentity;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField uniquetagpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getUniqueTagPSDEField(){
		if(this.uniquetagpsdefield != null) return this.uniquetagpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNIQUETAGPSDEFIELD);
		if(value == null){
			return null;
		}
		this.uniquetagpsdefield = this.getSourcePSDataEntityMust().getPSDEField(value, false);
		return this.uniquetagpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getUniqueTagPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getUniqueTagPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定唯一标记值属性对象");}
		return value;
	}

	public void setUniqueTagPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField uniquetagpsdefield){
		this.uniquetagpsdefield = uniquetagpsdefield;
	}


	public boolean isDefaultMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDEFAULTMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableColPriv(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLECOLPRIV);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableLog(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLELOG);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableMulitPrint(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEMULITPRINT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
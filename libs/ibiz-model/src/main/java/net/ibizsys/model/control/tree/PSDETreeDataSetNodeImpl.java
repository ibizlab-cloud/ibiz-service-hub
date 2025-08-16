package net.ibizsys.model.control.tree;



public class PSDETreeDataSetNodeImpl extends net.ibizsys.model.control.tree.PSDETreeNodeImplBase implements net.ibizsys.model.control.tree.IPSDETreeDataSetNode{

	public final static String ATTR_GETCHILDCNTPSAPPDEFIELD = "getChildCntPSAppDEField";
	public final static String ATTR_GETCLSPSAPPDEFIELD = "getClsPSAppDEField";
	public final static String ATTR_GETCUSTOMCOND = "customCond";
	public final static String ATTR_GETDATA2PSAPPDEFIELD = "getData2PSAppDEField";
	public final static String ATTR_GETDATANAME = "dataName";
	public final static String ATTR_GETDATAPSAPPDEFIELD = "getDataPSAppDEField";
	public final static String ATTR_GETDATASOURCETYPE = "dataSourceType";
	public final static String ATTR_GETFILTERPSAPPDEDATASET = "getFilterPSAppDEDataSet";
	public final static String ATTR_GETICONPSAPPDEFIELD = "getIconPSAppDEField";
	public final static String ATTR_GETIDPSAPPDEFIELD = "getIdPSAppDEField";
	public final static String ATTR_GETLEAFFLAGPSAPPDEFIELD = "getLeafFlagPSAppDEField";
	public final static String ATTR_GETLINKPSAPPDEFIELD = "getLinkPSAppDEField";
	public final static String ATTR_GETMAXSIZE = "maxSize";
	public final static String ATTR_GETMOVEDATAACCESSACTION = "moveDataAccessAction";
	public final static String ATTR_GETMOVEPSAPPDEACTION = "getMovePSAppDEAction";
	public final static String ATTR_GETMOVEPSDEOPPRIV = "getMovePSDEOPPriv";
	public final static String ATTR_GETPSAPPDEACTION = "getPSAppDEAction";
	public final static String ATTR_GETPSAPPDEDATASET = "getPSAppDEDataSet";
	public final static String ATTR_GETPSAPPDELOGIC = "getPSAppDELogic";
	public final static String ATTR_GETPSAPPDATAENTITY = "getPSAppDataEntity";
	public final static String ATTR_GETPAGINGSIZE = "pagingSize";
	public final static String ATTR_GETREMOVEDATAACCESSACTION = "removeDataAccessAction";
	public final static String ATTR_GETREMOVEPSAPPDEACTION = "getRemovePSAppDEAction";
	public final static String ATTR_GETREMOVEPSDEOPPRIV = "getRemovePSDEOPPriv";
	public final static String ATTR_GETSCRIPTCODE = "scriptCode";
	public final static String ATTR_GETSHAPECLSPSAPPDEFIELD = "getShapeClsPSAppDEField";
	public final static String ATTR_GETSORTDIR = "sortDir";
	public final static String ATTR_GETSORTPSAPPDEFIELD = "getSortPSAppDEField";
	public final static String ATTR_GETTEXTFORMAT = "textFormat";
	public final static String ATTR_GETTEXTPSAPPDEFIELD = "getTextPSAppDEField";
	public final static String ATTR_GETTIPSPSAPPDEFIELD = "getTipsPSAppDEField";
	public final static String ATTR_GETUPDATEDATAACCESSACTION = "updateDataAccessAction";
	public final static String ATTR_GETUPDATEPSAPPDEACTION = "getUpdatePSAppDEAction";
	public final static String ATTR_GETUPDATEPSDEOPPRIV = "getUpdatePSDEOPPriv";
	public final static String ATTR_ISAPPENDCAPTION = "appendCaption";
	public final static String ATTR_ISDISTINCTMODE = "distinctMode";
	public final static String ATTR_ISENABLEPAGING = "enablePaging";
	private net.ibizsys.model.app.dataentity.IPSAppDEField childcntpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getChildCntPSAppDEField(){
		if(this.childcntpsappdefield != null) return this.childcntpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCHILDCNTPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.childcntpsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.childcntpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getChildCntPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getChildCntPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定节点计数值应用实体属性");}
		return value;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField clspsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getClsPSAppDEField(){
		if(this.clspsappdefield != null) return this.clspsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCLSPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.clspsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.clspsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getClsPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getClsPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定节点样式表值应用实体属性");}
		return value;
	}


	public java.lang.String getCustomCond(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCUSTOMCOND);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField data2psappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getData2PSAppDEField(){
		if(this.data2psappdefield != null) return this.data2psappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATA2PSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.data2psappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.data2psappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getData2PSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getData2PSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定数据值2应用实体属性");}
		return value;
	}


	public java.lang.String getDataName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATANAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField datapsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getDataPSAppDEField(){
		if(this.datapsappdefield != null) return this.datapsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATAPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.datapsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.datapsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getDataPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getDataPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定数据值应用实体属性");}
		return value;
	}


	public java.lang.String getDataSourceType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATASOURCETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEDataSet filterpsappdedataset;

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getFilterPSAppDEDataSet(){
		if(this.filterpsappdedataset != null) return this.filterpsappdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFILTERPSAPPDEDATASET);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.filterpsappdedataset = ipsappdataentity.getPSAppDEDataSet(value, false);
		return this.filterpsappdedataset;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getFilterPSAppDEDataSetMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEDataSet value = this.getFilterPSAppDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定过滤应用实体结果集对象");}
		return value;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField iconpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getIconPSAppDEField(){
		if(this.iconpsappdefield != null) return this.iconpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETICONPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.iconpsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.iconpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getIconPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getIconPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定节点图标值应用实体属性");}
		return value;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField idpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getIdPSAppDEField(){
		if(this.idpsappdefield != null) return this.idpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETIDPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.idpsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.idpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getIdPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getIdPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定节点标识值应用实体属性");}
		return value;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField leafflagpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getLeafFlagPSAppDEField(){
		if(this.leafflagpsappdefield != null) return this.leafflagpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLEAFFLAGPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.leafflagpsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.leafflagpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getLeafFlagPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getLeafFlagPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定叶节点标识值应用实体属性");}
		return value;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField linkpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getLinkPSAppDEField(){
		if(this.linkpsappdefield != null) return this.linkpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLINKPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.linkpsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.linkpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getLinkPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getLinkPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定链接值应用实体属性");}
		return value;
	}


	public int getMaxSize(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAXSIZE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getMoveDataAccessAction(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMOVEDATAACCESSACTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEAction movepsappdeaction;

	public net.ibizsys.model.app.dataentity.IPSAppDEAction getMovePSAppDEAction(){
		if(this.movepsappdeaction != null) return this.movepsappdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMOVEPSAPPDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.movepsappdeaction = ipsappdataentity.getPSAppDEAction(value, false);
		return this.movepsappdeaction;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEAction getMovePSAppDEActionMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEAction value = this.getMovePSAppDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定移动数据应用实体行为");}
		return value;
	}

	private net.ibizsys.model.dataentity.priv.IPSDEOPPriv movepsdeoppriv;

	public net.ibizsys.model.dataentity.priv.IPSDEOPPriv getMovePSDEOPPriv(){
		if(this.movepsdeoppriv != null) return this.movepsdeoppriv;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMOVEPSDEOPPRIV);
		if(value == null){
			return null;
		}
		this.movepsdeoppriv = getPSModelObject(net.ibizsys.model.dataentity.priv.IPSDEOPPriv.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETMOVEPSDEOPPRIV);
		return this.movepsdeoppriv;
	}

	public net.ibizsys.model.dataentity.priv.IPSDEOPPriv getMovePSDEOPPrivMust(){
		net.ibizsys.model.dataentity.priv.IPSDEOPPriv value = this.getMovePSDEOPPriv();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定移动要求操作标识");}
		return value;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEAction psappdeaction;

	public net.ibizsys.model.app.dataentity.IPSAppDEAction getPSAppDEAction(){
		if(this.psappdeaction != null) return this.psappdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.psappdeaction = ipsappdataentity.getPSAppDEAction(value, false);
		return this.psappdeaction;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEAction getPSAppDEActionMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEAction value = this.getPSAppDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体行为对象");}
		return value;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEDataSet psappdedataset;

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSet(){
		if(this.psappdedataset != null) return this.psappdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDEDATASET);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.psappdedataset = ipsappdataentity.getPSAppDEDataSet(value, false);
		return this.psappdedataset;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getPSAppDEDataSetMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEDataSet value = this.getPSAppDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体结果集对象");}
		return value;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDELogic psappdelogic;

	public net.ibizsys.model.app.dataentity.IPSAppDELogic getPSAppDELogic(){
		if(this.psappdelogic != null) return this.psappdelogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDELOGIC);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.psappdelogic = ipsappdataentity.getPSAppDELogic(value, false);
		return this.psappdelogic;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDELogic getPSAppDELogicMust(){
		net.ibizsys.model.app.dataentity.IPSAppDELogic value = this.getPSAppDELogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体逻辑对象");}
		return value;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDataEntity psappdataentity;

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntity(){
		if(this.psappdataentity != null) return this.psappdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPDATAENTITY);
		if(value == null){
			return null;
		}
		this.psappdataentity = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPDATAENTITY);
		return this.psappdataentity;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getPSAppDataEntityMust(){
		net.ibizsys.model.app.dataentity.IPSAppDataEntity value = this.getPSAppDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体对象");}
		return value;
	}


	public int getPagingSize(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPAGINGSIZE);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public java.lang.String getRemoveDataAccessAction(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREMOVEDATAACCESSACTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEAction removepsappdeaction;

	public net.ibizsys.model.app.dataentity.IPSAppDEAction getRemovePSAppDEAction(){
		if(this.removepsappdeaction != null) return this.removepsappdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREMOVEPSAPPDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.removepsappdeaction = ipsappdataentity.getPSAppDEAction(value, false);
		return this.removepsappdeaction;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEAction getRemovePSAppDEActionMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEAction value = this.getRemovePSAppDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定删除数据应用实体行为");}
		return value;
	}

	private net.ibizsys.model.dataentity.priv.IPSDEOPPriv removepsdeoppriv;

	public net.ibizsys.model.dataentity.priv.IPSDEOPPriv getRemovePSDEOPPriv(){
		if(this.removepsdeoppriv != null) return this.removepsdeoppriv;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREMOVEPSDEOPPRIV);
		if(value == null){
			return null;
		}
		this.removepsdeoppriv = getPSModelObject(net.ibizsys.model.dataentity.priv.IPSDEOPPriv.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETREMOVEPSDEOPPRIV);
		return this.removepsdeoppriv;
	}

	public net.ibizsys.model.dataentity.priv.IPSDEOPPriv getRemovePSDEOPPrivMust(){
		net.ibizsys.model.dataentity.priv.IPSDEOPPriv value = this.getRemovePSDEOPPriv();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定删除要求操作标识");}
		return value;
	}


	public java.lang.String getScriptCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSCRIPTCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField shapeclspsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getShapeClsPSAppDEField(){
		if(this.shapeclspsappdefield != null) return this.shapeclspsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSHAPECLSPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.shapeclspsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.shapeclspsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getShapeClsPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getShapeClsPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定图形样式应用实体属性");}
		return value;
	}


	public java.lang.String getSortDir(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSORTDIR);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField sortpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getSortPSAppDEField(){
		if(this.sortpsappdefield != null) return this.sortpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSORTPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.sortpsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.sortpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getSortPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getSortPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定节点排序值应用实体属性");}
		return value;
	}


	public java.lang.String getTextFormat(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEXTFORMAT);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField textpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getTextPSAppDEField(){
		if(this.textpsappdefield != null) return this.textpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEXTPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.textpsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.textpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getTextPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getTextPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定节点文本值属性对象");}
		return value;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField tipspsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getTipsPSAppDEField(){
		if(this.tipspsappdefield != null) return this.tipspsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTIPSPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.tipspsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.tipspsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getTipsPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getTipsPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定节点提示值应用实体属性");}
		return value;
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
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.updatepsappdeaction = ipsappdataentity.getPSAppDEAction(value, false);
		return this.updatepsappdeaction;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEAction getUpdatePSAppDEActionMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEAction value = this.getUpdatePSAppDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定更新数据应用实体行为");}
		return value;
	}

	private net.ibizsys.model.dataentity.priv.IPSDEOPPriv updatepsdeoppriv;

	public net.ibizsys.model.dataentity.priv.IPSDEOPPriv getUpdatePSDEOPPriv(){
		if(this.updatepsdeoppriv != null) return this.updatepsdeoppriv;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUPDATEPSDEOPPRIV);
		if(value == null){
			return null;
		}
		this.updatepsdeoppriv = getPSModelObject(net.ibizsys.model.dataentity.priv.IPSDEOPPriv.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETUPDATEPSDEOPPRIV);
		return this.updatepsdeoppriv;
	}

	public net.ibizsys.model.dataentity.priv.IPSDEOPPriv getUpdatePSDEOPPrivMust(){
		net.ibizsys.model.dataentity.priv.IPSDEOPPriv value = this.getUpdatePSDEOPPriv();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定更新要求操作标识");}
		return value;
	}


	public boolean isAppendCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISAPPENDCAPTION);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isDistinctMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDISTINCTMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnablePaging(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEPAGING);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
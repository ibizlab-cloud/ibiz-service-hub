package net.ibizsys.model.control.calendar;



public class PSSysCalendarItemImpl extends net.ibizsys.model.control.PSControlItemImpl2 implements net.ibizsys.model.control.calendar.IPSSysCalendarItem
		,net.ibizsys.model.control.IPSControlXDataContainer
		,net.ibizsys.model.control.IPSControlMDObject{

	public final static String ATTR_GETBKCOLOR = "bKColor";
	public final static String ATTR_GETBKCOLORPSAPPDEFIELD = "getBKColorPSAppDEField";
	public final static String ATTR_GETBEGINTIMEPSAPPDEFIELD = "getBeginTimePSAppDEField";
	public final static String ATTR_GETCLSPSAPPDEFIELD = "getClsPSAppDEField";
	public final static String ATTR_GETCOLOR = "color";
	public final static String ATTR_GETCOLORPSAPPDEFIELD = "getColorPSAppDEField";
	public final static String ATTR_GETCONTENTPSAPPDEFIELD = "getContentPSAppDEField";
	public final static String ATTR_GETCREATEPSAPPDEACTION = "getCreatePSAppDEAction";
	public final static String ATTR_GETCREATEPSDEOPPRIV = "getCreatePSDEOPPriv";
	public final static String ATTR_GETCUSTOMCOND = "customCond";
	public final static String ATTR_GETDATA2PSAPPDEFIELD = "getData2PSAppDEField";
	public final static String ATTR_GETDATAPSAPPDEFIELD = "getDataPSAppDEField";
	public final static String ATTR_GETDEFAULTPSUIACTION = "getDefaultPSUIAction";
	public final static String ATTR_GETDYNACLASS = "dynaClass";
	public final static String ATTR_GETENDTIMEPSAPPDEFIELD = "getEndTimePSAppDEField";
	public final static String ATTR_GETICONPSAPPDEFIELD = "getIconPSAppDEField";
	public final static String ATTR_GETIDPSAPPDEFIELD = "getIdPSAppDEField";
	public final static String ATTR_GETITEMSTYLE = "itemStyle";
	public final static String ATTR_GETITEMTYPE = "itemType";
	public final static String ATTR_GETLEVELPSAPPDEFIELD = "getLevelPSAppDEField";
	public final static String ATTR_GETLINKPSAPPDEFIELD = "getLinkPSAppDEField";
	public final static String ATTR_GETMAXSIZE = "maxSize";
	public final static String ATTR_GETMODELOBJ = "modelObj";
	public final static String ATTR_GETNAMEPSLANGUAGERES = "getNamePSLanguageRes";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSAPPDEDATASET = "getPSAppDEDataSet";
	public final static String ATTR_GETPSAPPDATAENTITY = "getPSAppDataEntity";
	public final static String ATTR_GETPSDECONTEXTMENU = "getPSDEContextMenu";
	public final static String ATTR_GETPSLAYOUTPANEL = "getPSLayoutPanel";
	public final static String ATTR_GETPSSYSCSS = "getPSSysCss";
	public final static String ATTR_GETPSSYSIMAGE = "getPSSysImage";
	public final static String ATTR_GETPSSYSPFPLUGIN = "getPSSysPFPlugin";
	public final static String ATTR_GETPSUIACTION = "getPSUIAction";
	public final static String ATTR_GETREMOVEPSAPPDEACTION = "getRemovePSAppDEAction";
	public final static String ATTR_GETREMOVEPSDEOPPRIV = "getRemovePSDEOPPriv";
	public final static String ATTR_GETTAG2PSAPPDEFIELD = "getTag2PSAppDEField";
	public final static String ATTR_GETTAGPSAPPDEFIELD = "getTagPSAppDEField";
	public final static String ATTR_GETTEXTPSAPPDEFIELD = "getTextPSAppDEField";
	public final static String ATTR_GETTIPSPSAPPDEFIELD = "getTipsPSAppDEField";
	public final static String ATTR_GETUPDATEPSAPPDEACTION = "getUpdatePSAppDEAction";
	public final static String ATTR_GETUPDATEPSDEOPPRIV = "getUpdatePSDEOPPriv";
	public final static String ATTR_ISENABLEEDIT = "enableEdit";
	public final static String ATTR_ISENABLEEDITDATA = "enableEditData";
	public final static String ATTR_ISENABLEEXPORT = "enableExport";
	public final static String ATTR_ISENABLEFILTER = "enableFilter";
	public final static String ATTR_ISENABLEIMPORT = "enableImport";
	public final static String ATTR_ISENABLENEWDATA = "enableNewData";
	public final static String ATTR_ISENABLEQUICKCREATE = "enableQuickCreate";
	public final static String ATTR_ISENABLEQUICKSEARCH = "enableQuickSearch";
	public final static String ATTR_ISENABLEREMOVEDATA = "enableRemoveData";
	public final static String ATTR_ISENABLESEARCH = "enableSearch";
	public final static String ATTR_ISENABLEVIEWDATA = "enableViewData";
	public final static String ATTR_ISLOADDEFAULT = "loadDefault";
	public final static String ATTR_ISPICKUPMODE = "pickupMode";
	public final static String ATTR_ISREADONLY = "readOnly";

	public java.lang.String getBKColor(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBKCOLOR);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField bkcolorpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getBKColorPSAppDEField(){
		if(this.bkcolorpsappdefield != null) return this.bkcolorpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBKCOLORPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.bkcolorpsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.bkcolorpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getBKColorPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getBKColorPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定背景颜色应用实体属性");}
		return value;
	}

	public void setBKColorPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField bkcolorpsappdefield){
		this.bkcolorpsappdefield = bkcolorpsappdefield;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField begintimepsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getBeginTimePSAppDEField(){
		if(this.begintimepsappdefield != null) return this.begintimepsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBEGINTIMEPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.begintimepsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.begintimepsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getBeginTimePSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getBeginTimePSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定开始时间应用实体属性");}
		return value;
	}

	public void setBeginTimePSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField begintimepsappdefield){
		this.begintimepsappdefield = begintimepsappdefield;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定项样式表值应用实体属性");}
		return value;
	}

	public void setClsPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField clspsappdefield){
		this.clspsappdefield = clspsappdefield;
	}


	public java.lang.String getColor(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOLOR);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField colorpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getColorPSAppDEField(){
		if(this.colorpsappdefield != null) return this.colorpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOLORPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.colorpsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.colorpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getColorPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getColorPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定文本颜色应用实体属性");}
		return value;
	}

	public void setColorPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField colorpsappdefield){
		this.colorpsappdefield = colorpsappdefield;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField contentpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getContentPSAppDEField(){
		if(this.contentpsappdefield != null) return this.contentpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.contentpsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.contentpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getContentPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getContentPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定内容应用实体属性");}
		return value;
	}

	public void setContentPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField contentpsappdefield){
		this.contentpsappdefield = contentpsappdefield;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEAction createpsappdeaction;

	public net.ibizsys.model.app.dataentity.IPSAppDEAction getCreatePSAppDEAction(){
		if(this.createpsappdeaction != null) return this.createpsappdeaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCREATEPSAPPDEACTION);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.createpsappdeaction = ipsappdataentity.getPSAppDEAction(value, false);
		return this.createpsappdeaction;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEAction getCreatePSAppDEActionMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEAction value = this.getCreatePSAppDEAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定建立数据应用实体行为");}
		return value;
	}

	public void setCreatePSAppDEAction(net.ibizsys.model.app.dataentity.IPSAppDEAction createpsappdeaction){
		this.createpsappdeaction = createpsappdeaction;
	}

	private net.ibizsys.model.dataentity.priv.IPSDEOPPriv createpsdeoppriv;

	public net.ibizsys.model.dataentity.priv.IPSDEOPPriv getCreatePSDEOPPriv(){
		if(this.createpsdeoppriv != null) return this.createpsdeoppriv;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCREATEPSDEOPPRIV);
		if(value == null){
			return null;
		}
		this.createpsdeoppriv = getPSModelObject(net.ibizsys.model.dataentity.priv.IPSDEOPPriv.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETCREATEPSDEOPPRIV);
		return this.createpsdeoppriv;
	}

	public net.ibizsys.model.dataentity.priv.IPSDEOPPriv getCreatePSDEOPPrivMust(){
		net.ibizsys.model.dataentity.priv.IPSDEOPPriv value = this.getCreatePSDEOPPriv();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定建立要求操作标识");}
		return value;
	}

	public void setCreatePSDEOPPriv(net.ibizsys.model.dataentity.priv.IPSDEOPPriv createpsdeoppriv){
		this.createpsdeoppriv = createpsdeoppriv;
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

	public void setData2PSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField data2psappdefield){
		this.data2psappdefield = data2psappdefield;
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

	public void setDataPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField datapsappdefield){
		this.datapsappdefield = datapsappdefield;
	}

	private net.ibizsys.model.app.view.IPSAppViewUIAction defaultpsuiaction;

	public net.ibizsys.model.app.view.IPSAppViewUIAction getDefaultPSUIAction(){
		if(this.defaultpsuiaction != null) return this.defaultpsuiaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTPSUIACTION);
		if(value == null){
			return null;
		}
		this.defaultpsuiaction = getPSModelObject(net.ibizsys.model.app.view.IPSAppViewUIAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETDEFAULTPSUIACTION);
		return this.defaultpsuiaction;
	}

	public net.ibizsys.model.app.view.IPSAppViewUIAction getDefaultPSUIActionMust(){
		net.ibizsys.model.app.view.IPSAppViewUIAction value = this.getDefaultPSUIAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定日历项默认行为");}
		return value;
	}

	public void setDefaultPSUIAction(net.ibizsys.model.app.view.IPSAppViewUIAction defaultpsuiaction){
		this.defaultpsuiaction = defaultpsuiaction;
	}


	public java.lang.String getDynaClass(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNACLASS);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField endtimepsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getEndTimePSAppDEField(){
		if(this.endtimepsappdefield != null) return this.endtimepsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENDTIMEPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.endtimepsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.endtimepsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getEndTimePSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getEndTimePSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定结束时间应用实体属性");}
		return value;
	}

	public void setEndTimePSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField endtimepsappdefield){
		this.endtimepsappdefield = endtimepsappdefield;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定项图标值应用实体属性");}
		return value;
	}

	public void setIconPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField iconpsappdefield){
		this.iconpsappdefield = iconpsappdefield;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定项标识值应用实体属性");}
		return value;
	}

	public void setIdPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField idpsappdefield){
		this.idpsappdefield = idpsappdefield;
	}


	public java.lang.String getItemStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getItemType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField levelpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getLevelPSAppDEField(){
		if(this.levelpsappdefield != null) return this.levelpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLEVELPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.levelpsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.levelpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getLevelPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getLevelPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定级别应用实体属性");}
		return value;
	}

	public void setLevelPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField levelpsappdefield){
		this.levelpsappdefield = levelpsappdefield;
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

	public void setLinkPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField linkpsappdefield){
		this.linkpsappdefield = linkpsappdefield;
	}


	public int getMaxSize(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAXSIZE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getModelObj(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMODELOBJ);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes namepslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getNamePSLanguageRes(){
		if(this.namepslanguageres != null) return this.namepslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAMEPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.namepslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETNAMEPSLANGUAGERES);
		return this.namepslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getNamePSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getNamePSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定名称语言资源");}
		return value;
	}

	public void setNamePSLanguageRes(net.ibizsys.model.res.IPSLanguageRes namepslanguageres){
		this.namepslanguageres = namepslanguageres;
	}


	@Deprecated
	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 0;
		}
		return value.asInt();
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体数据集");}
		return value;
	}

	public void setPSAppDEDataSet(net.ibizsys.model.app.dataentity.IPSAppDEDataSet psappdedataset){
		this.psappdedataset = psappdedataset;
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

	public void setPSAppDataEntity(net.ibizsys.model.app.dataentity.IPSAppDataEntity psappdataentity){
		this.psappdataentity = psappdataentity;
	}

	private net.ibizsys.model.control.toolbar.IPSDEContextMenu psdecontextmenu;

	public net.ibizsys.model.control.toolbar.IPSDEContextMenu getPSDEContextMenu(){
		if(this.psdecontextmenu != null) return this.psdecontextmenu;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDECONTEXTMENU);
		if(value == null){
			return null;
		}
		this.psdecontextmenu = getPSModelObject(net.ibizsys.model.control.toolbar.IPSDEContextMenu.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDECONTEXTMENU);
		return this.psdecontextmenu;
	}

	public net.ibizsys.model.control.toolbar.IPSDEContextMenu getPSDEContextMenuMust(){
		net.ibizsys.model.control.toolbar.IPSDEContextMenu value = this.getPSDEContextMenu();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定上下文菜单对象");}
		return value;
	}

	public void setPSDEContextMenu(net.ibizsys.model.control.toolbar.IPSDEContextMenu psdecontextmenu){
		this.psdecontextmenu = psdecontextmenu;
	}

	private net.ibizsys.model.control.panel.IPSLayoutPanel pslayoutpanel;

	public net.ibizsys.model.control.panel.IPSLayoutPanel getPSLayoutPanel(){
		if(this.pslayoutpanel != null) return this.pslayoutpanel;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSLAYOUTPANEL);
		if(value == null){
			return null;
		}
		this.pslayoutpanel = getPSModelObject(net.ibizsys.model.control.panel.IPSLayoutPanel.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSLAYOUTPANEL);
		return this.pslayoutpanel;
	}

	public net.ibizsys.model.control.panel.IPSLayoutPanel getPSLayoutPanelMust(){
		net.ibizsys.model.control.panel.IPSLayoutPanel value = this.getPSLayoutPanel();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定项布局面板");}
		return value;
	}

	public void setPSLayoutPanel(net.ibizsys.model.control.panel.IPSLayoutPanel pslayoutpanel){
		this.pslayoutpanel = pslayoutpanel;
	}

	private net.ibizsys.model.res.IPSSysCss pssyscss;

	public net.ibizsys.model.res.IPSSysCss getPSSysCss(){
		if(this.pssyscss != null) return this.pssyscss;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSCSS);
		if(value == null){
			return null;
		}
		this.pssyscss = getPSModelObject(net.ibizsys.model.res.IPSSysCss.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSCSS);
		return this.pssyscss;
	}

	public net.ibizsys.model.res.IPSSysCss getPSSysCssMust(){
		net.ibizsys.model.res.IPSSysCss value = this.getPSSysCss();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定项界面样式表");}
		return value;
	}

	public void setPSSysCss(net.ibizsys.model.res.IPSSysCss pssyscss){
		this.pssyscss = pssyscss;
	}

	private net.ibizsys.model.res.IPSSysImage pssysimage;

	public net.ibizsys.model.res.IPSSysImage getPSSysImage(){
		if(this.pssysimage != null) return this.pssysimage;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSIMAGE);
		if(value == null){
			return null;
		}
		this.pssysimage = getPSModelObject(net.ibizsys.model.res.IPSSysImage.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSIMAGE);
		return this.pssysimage;
	}

	public net.ibizsys.model.res.IPSSysImage getPSSysImageMust(){
		net.ibizsys.model.res.IPSSysImage value = this.getPSSysImage();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定项图标资源对象");}
		return value;
	}

	public void setPSSysImage(net.ibizsys.model.res.IPSSysImage pssysimage){
		this.pssysimage = pssysimage;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定前端模板插件");}
		return value;
	}

	public void setPSSysPFPlugin(net.ibizsys.model.res.IPSSysPFPlugin pssyspfplugin){
		this.pssyspfplugin = pssyspfplugin;
	}

	private net.ibizsys.model.view.IPSUIAction psuiaction;

	public net.ibizsys.model.view.IPSUIAction getPSUIAction(){
		if(this.psuiaction != null) return this.psuiaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSUIACTION);
		if(value == null){
			return null;
		}
		this.psuiaction = getPSModelObject(net.ibizsys.model.view.IPSUIAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSUIACTION);
		return this.psuiaction;
	}

	public net.ibizsys.model.view.IPSUIAction getPSUIActionMust(){
		net.ibizsys.model.view.IPSUIAction value = this.getPSUIAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定日历项默认行为");}
		return value;
	}

	public void setPSUIAction(net.ibizsys.model.view.IPSUIAction psuiaction){
		this.psuiaction = psuiaction;
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

	public void setRemovePSAppDEAction(net.ibizsys.model.app.dataentity.IPSAppDEAction removepsappdeaction){
		this.removepsappdeaction = removepsappdeaction;
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

	public void setRemovePSDEOPPriv(net.ibizsys.model.dataentity.priv.IPSDEOPPriv removepsdeoppriv){
		this.removepsdeoppriv = removepsdeoppriv;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField tag2psappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getTag2PSAppDEField(){
		if(this.tag2psappdefield != null) return this.tag2psappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTAG2PSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.tag2psappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.tag2psappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getTag2PSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getTag2PSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定标记值2应用实体属性");}
		return value;
	}

	public void setTag2PSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField tag2psappdefield){
		this.tag2psappdefield = tag2psappdefield;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField tagpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getTagPSAppDEField(){
		if(this.tagpsappdefield != null) return this.tagpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTAGPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.tagpsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.tagpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getTagPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getTagPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定标记值应用实体属性");}
		return value;
	}

	public void setTagPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField tagpsappdefield){
		this.tagpsappdefield = tagpsappdefield;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定项文本值应用实体属性");}
		return value;
	}

	public void setTextPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField textpsappdefield){
		this.textpsappdefield = textpsappdefield;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定提示应用实体属性");}
		return value;
	}

	public void setTipsPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField tipspsappdefield){
		this.tipspsappdefield = tipspsappdefield;
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

	public void setUpdatePSAppDEAction(net.ibizsys.model.app.dataentity.IPSAppDEAction updatepsappdeaction){
		this.updatepsappdeaction = updatepsappdeaction;
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

	public void setUpdatePSDEOPPriv(net.ibizsys.model.dataentity.priv.IPSDEOPPriv updatepsdeoppriv){
		this.updatepsdeoppriv = updatepsdeoppriv;
	}


	public boolean isEnableEdit(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEEDIT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isEnableEditData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEEDITDATA);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isEnableExport(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEEXPORT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isEnableFilter(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEFILTER);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isEnableImport(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEIMPORT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isEnableNewData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLENEWDATA);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableQuickCreate(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEQUICKCREATE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isEnableQuickSearch(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEQUICKSEARCH);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isEnableRemoveData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEREMOVEDATA);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isEnableSearch(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLESEARCH);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isEnableViewData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEVIEWDATA);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isLoadDefault(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISLOADDEFAULT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isPickupMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISPICKUPMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isReadOnly(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISREADONLY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
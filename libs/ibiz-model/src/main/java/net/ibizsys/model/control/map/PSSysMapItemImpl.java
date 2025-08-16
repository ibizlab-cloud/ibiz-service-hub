package net.ibizsys.model.control.map;



public class PSSysMapItemImpl extends net.ibizsys.model.control.PSControlItemImpl2 implements net.ibizsys.model.control.map.IPSSysMapItem
		,net.ibizsys.model.control.IPSControlXDataContainer{

	public final static String ATTR_GETALTITUDEPSAPPDEFIELD = "getAltitudePSAppDEField";
	public final static String ATTR_GETBKCOLOR = "bKColor";
	public final static String ATTR_GETBKCOLORPSAPPDEFIELD = "getBKColorPSAppDEField";
	public final static String ATTR_GETBORDERCOLOR = "borderColor";
	public final static String ATTR_GETBORDERWIDTH = "borderWidth";
	public final static String ATTR_GETCLSPSAPPDEFIELD = "getClsPSAppDEField";
	public final static String ATTR_GETCOLOR = "color";
	public final static String ATTR_GETCOLORPSAPPDEFIELD = "getColorPSAppDEField";
	public final static String ATTR_GETCONTENTPSAPPDEFIELD = "getContentPSAppDEField";
	public final static String ATTR_GETCUSTOMCOND = "customCond";
	public final static String ATTR_GETDATA2PSAPPDEFIELD = "getData2PSAppDEField";
	public final static String ATTR_GETDATAPSAPPDEFIELD = "getDataPSAppDEField";
	public final static String ATTR_GETDYNACLASS = "dynaClass";
	public final static String ATTR_GETGROUPPSAPPDEFIELD = "getGroupPSAppDEField";
	public final static String ATTR_GETICONPSAPPDEFIELD = "getIconPSAppDEField";
	public final static String ATTR_GETIDPSAPPDEFIELD = "getIdPSAppDEField";
	public final static String ATTR_GETITEMSTYLE = "itemStyle";
	public final static String ATTR_GETITEMTYPE = "itemType";
	public final static String ATTR_GETLATITUDEPSAPPDEFIELD = "getLatitudePSAppDEField";
	public final static String ATTR_GETLINKPSAPPDEFIELD = "getLinkPSAppDEField";
	public final static String ATTR_GETLONGITUDEPSAPPDEFIELD = "getLongitudePSAppDEField";
	public final static String ATTR_GETMAXSIZE = "maxSize";
	public final static String ATTR_GETMODELOBJ = "modelObj";
	public final static String ATTR_GETNAMEPSLANGUAGERES = "getNamePSLanguageRes";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETORDERVALUEPSAPPDEFIELD = "getOrderValuePSAppDEField";
	public final static String ATTR_GETPSAPPDEDATASET = "getPSAppDEDataSet";
	public final static String ATTR_GETPSAPPDATAENTITY = "getPSAppDataEntity";
	public final static String ATTR_GETPSDECONTEXTMENU = "getPSDEContextMenu";
	public final static String ATTR_GETPSSYSCSS = "getPSSysCss";
	public final static String ATTR_GETPSSYSIMAGE = "getPSSysImage";
	public final static String ATTR_GETRADIUS = "radius";
	public final static String ATTR_GETREMOVEPSAPPDEACTION = "getRemovePSAppDEAction";
	public final static String ATTR_GETREMOVEPSDEOPPRIV = "getRemovePSDEOPPriv";
	public final static String ATTR_GETSHAPECLSPSAPPDEFIELD = "getShapeClsPSAppDEField";
	public final static String ATTR_GETSHAPEDYNACLASS = "shapeDynaClass";
	public final static String ATTR_GETSHAPEPSSYSCSS = "getShapePSSysCss";
	public final static String ATTR_GETTAG2PSAPPDEFIELD = "getTag2PSAppDEField";
	public final static String ATTR_GETTAGPSAPPDEFIELD = "getTagPSAppDEField";
	public final static String ATTR_GETTEXTPSAPPDEFIELD = "getTextPSAppDEField";
	public final static String ATTR_GETTIMEPSAPPDEFIELD = "getTimePSAppDEField";
	public final static String ATTR_GETTIPSPSAPPDEFIELD = "getTipsPSAppDEField";
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
	private net.ibizsys.model.app.dataentity.IPSAppDEField altitudepsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getAltitudePSAppDEField(){
		if(this.altitudepsappdefield != null) return this.altitudepsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALTITUDEPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.altitudepsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.altitudepsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getAltitudePSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getAltitudePSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定高度值应用实体属性");}
		return value;
	}


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


	public java.lang.String getBorderColor(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBORDERCOLOR);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getBorderWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBORDERWIDTH);
		if(value == null){
			return 0;
		}
		return value.asInt();
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


	public java.lang.String getDynaClass(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNACLASS);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField grouppsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getGroupPSAppDEField(){
		if(this.grouppsappdefield != null) return this.grouppsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.grouppsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.grouppsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getGroupPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getGroupPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定分组值应用实体属性");}
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定项图标值应用实体属性");}
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定项标识值应用实体属性");}
		return value;
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
	private net.ibizsys.model.app.dataentity.IPSAppDEField latitudepsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getLatitudePSAppDEField(){
		if(this.latitudepsappdefield != null) return this.latitudepsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLATITUDEPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.latitudepsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.latitudepsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getLatitudePSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getLatitudePSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定维度值应用实体属性");}
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

	private net.ibizsys.model.app.dataentity.IPSAppDEField longitudepsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getLongitudePSAppDEField(){
		if(this.longitudepsappdefield != null) return this.longitudepsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLONGITUDEPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.longitudepsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.longitudepsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getLongitudePSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getLongitudePSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定经度值应用实体属性");}
		return value;
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


	@Deprecated
	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField ordervaluepsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getOrderValuePSAppDEField(){
		if(this.ordervaluepsappdefield != null) return this.ordervaluepsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUEPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.ordervaluepsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.ordervaluepsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getOrderValuePSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getOrderValuePSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定排序值应用实体属性");}
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体数据集");}
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定项图标对象");}
		return value;
	}


	public int getRadius(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRADIUS);
		if(value == null){
			return 0;
		}
		return value.asInt();
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


	public java.lang.String getShapeDynaClass(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSHAPEDYNACLASS);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSSysCss shapepssyscss;

	public net.ibizsys.model.res.IPSSysCss getShapePSSysCss(){
		if(this.shapepssyscss != null) return this.shapepssyscss;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSHAPEPSSYSCSS);
		if(value == null){
			return null;
		}
		this.shapepssyscss = getPSModelObject(net.ibizsys.model.res.IPSSysCss.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETSHAPEPSSYSCSS);
		return this.shapepssyscss;
	}

	public net.ibizsys.model.res.IPSSysCss getShapePSSysCssMust(){
		net.ibizsys.model.res.IPSSysCss value = this.getShapePSSysCss();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定图形界面样式表");}
		return value;
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

	private net.ibizsys.model.app.dataentity.IPSAppDEField timepsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getTimePSAppDEField(){
		if(this.timepsappdefield != null) return this.timepsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTIMEPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.app.dataentity.IPSAppDataEntity ipsappdataentity = this.getPSAppDataEntityMust();
		this.timepsappdefield = ipsappdataentity.getPSAppDEField(value, false);
		return this.timepsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getTimePSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getTimePSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定时间应用实体属性");}
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定提示应用实体属性");}
		return value;
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
package net.ibizsys.model.codelist;



public class PSCodeListImpl extends net.ibizsys.model.codelist.PSCodeItemImpl implements net.ibizsys.model.codelist.IPSCodeList{

	public final static String ATTR_GETALLTEXT = "allText";
	public final static String ATTR_GETALLTEXTPSLANGUAGERES = "getAllTextPSLanguageRes";
	public final static String ATTR_GETBKCOLORPSDEFIELD = "getBKColorPSDEField";
	public final static String ATTR_GETBEGINVALUEPSDEFIELD = "getBeginValuePSDEField";
	public final static String ATTR_GETCACHETIMEOUT = "cacheTimeout";
	public final static String ATTR_GETCLSPSDEFIELD = "getClsPSDEField";
	public final static String ATTR_GETCODELISTTAG = "codeListTag";
	public final static String ATTR_GETCODELISTTYPE = "codeListType";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCOLOR = "color";
	public final static String ATTR_GETCOLORPSDEFIELD = "getColorPSDEField";
	public final static String ATTR_GETCUSTOMCOND = "customCond";
	public final static String ATTR_GETDATAPSDEFIELD = "getDataPSDEField";
	public final static String ATTR_GETDISABLEPSDEFIELD = "getDisablePSDEField";
	public final static String ATTR_GETDYNAINSTMODE = "dynaInstMode";
	public final static String ATTR_GETDYNAINSTTAG = "dynaInstTag";
	public final static String ATTR_GETDYNAINSTTAG2 = "dynaInstTag2";
	public final static String ATTR_GETDYNAMODELFILEPATH = "dynaModelFilePath";
	public final static String ATTR_GETDYNASYSMODE = "dynaSysMode";
	public final static String ATTR_GETEMPTYTEXT = "emptyText";
	public final static String ATTR_GETEMPTYTEXTPSLANGUAGERES = "getEmptyTextPSLanguageRes";
	public final static String ATTR_GETENDVALUEPSDEFIELD = "getEndValuePSDEField";
	public final static String ATTR_GETICONCLS = "iconCls";
	public final static String ATTR_GETICONCLSPSDEFIELD = "getIconClsPSDEField";
	public final static String ATTR_GETICONCLSX = "iconClsX";
	public final static String ATTR_GETICONCLSXPSDEFIELD = "getIconClsXPSDEField";
	public final static String ATTR_GETICONPATH = "iconPath";
	public final static String ATTR_GETICONPATHX = "iconPathX";
	public final static String ATTR_GETICONPATHXPSDEFIELD = "getIconPathXPSDEField";
	public final static String ATTR_GETINCBEGINVALUEMODE = "incBeginValueMode";
	public final static String ATTR_GETINCENDVALUEMODE = "incEndValueMode";
	public final static String ATTR_GETMEMO = "memo";
	public final static String ATTR_GETMINORSORTDIR = "minorSortDir";
	public final static String ATTR_GETMINORSORTPSDEFIELD = "getMinorSortPSDEField";
	public final static String ATTR_GETNAME = "name";
	public final static String ATTR_GETORMODE = "orMode";
	public final static String ATTR_GETPSCODELISTTEMPLID = "getPSCodeListTemplId";
	public final static String ATTR_GETPSDEDATASET = "getPSDEDataSet";
	public final static String ATTR_GETPSDEMSLOGIC = "getPSDEMSLogic";
	public final static String ATTR_GETPSDATAENTITY = "getPSDataEntity";
	public final static String ATTR_GETPSSYSPFPLUGIN = "getPSSysPFPlugin";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";
	public final static String ATTR_GETPVALUEPSDEFIELD = "getPValuePSDEField";
	public final static String ATTR_GETPREDEFINEDTYPE = "predefinedType";
	public final static String ATTR_GETREFFLAG = "refFlag";
	public final static String ATTR_GETSYSTEMTAG = "systemTag";
	public final static String ATTR_GETTEXT = "text";
	public final static String ATTR_GETTEXTCLS = "textCls";
	public final static String ATTR_GETTEXTPSDEFIELD = "getTextPSDEField";
	public final static String ATTR_GETTEXTSEPARATOR = "textSeparator";
	public final static String ATTR_GETUSERDATA = "userData";
	public final static String ATTR_GETUSERDATA2 = "userData2";
	public final static String ATTR_GETVALUE = "value";
	public final static String ATTR_GETVALUEPSDEFIELD = "getValuePSDEField";
	public final static String ATTR_GETVALUESEPARATOR = "valueSeparator";
	public final static String ATTR_ISCODEITEMVALUENUMBER = "codeItemValueNumber";
	public final static String ATTR_ISDISABLESELECT = "disableSelect";
	public final static String ATTR_ISENABLECACHE = "enableCache";
	public final static String ATTR_ISMODULEINSTCODELIST = "moduleInstCodeList";
	public final static String ATTR_ISSUBSYSASCLOUD = "subSysAsCloud";
	public final static String ATTR_ISSUBSYSCODELIST = "subSysCodeList";
	public final static String ATTR_ISTHRESHOLDGROUP = "thresholdGroup";
	public final static String ATTR_ISUSERSCOPE = "userScope";

	public java.lang.String getAllText(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLTEXT);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes alltextpslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getAllTextPSLanguageRes(){
		if(this.alltextpslanguageres != null) return this.alltextpslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALLTEXTPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.alltextpslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETALLTEXTPSLANGUAGERES);
		return this.alltextpslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getAllTextPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getAllTextPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定全部显示文本语言资源");}
		return value;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField bkcolorpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getBKColorPSDEField(){
		if(this.bkcolorpsdefield != null) return this.bkcolorpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBKCOLORPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.bkcolorpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.bkcolorpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getBKColorPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getBKColorPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定背景颜色属性");}
		return value;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField beginvaluepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getBeginValuePSDEField(){
		if(this.beginvaluepsdefield != null) return this.beginvaluepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBEGINVALUEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.beginvaluepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.beginvaluepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getBeginValuePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getBeginValuePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定开始值属性");}
		return value;
	}


	public int getCacheTimeout(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCACHETIMEOUT);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField clspsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getClsPSDEField(){
		if(this.clspsdefield != null) return this.clspsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCLSPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.clspsdefield = ipsdataentity.getPSDEField(value, false);
		return this.clspsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getClsPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getClsPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定项样式属性");}
		return value;
	}


	public java.lang.String getCodeListTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODELISTTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCodeListType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODELISTTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getColor(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOLOR);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField colorpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getColorPSDEField(){
		if(this.colorpsdefield != null) return this.colorpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOLORPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.colorpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.colorpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getColorPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getColorPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定前景颜色属性");}
		return value;
	}


	public java.lang.String getCustomCond(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCUSTOMCOND);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField datapsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getDataPSDEField(){
		if(this.datapsdefield != null) return this.datapsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATAPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.datapsdefield = ipsdataentity.getPSDEField(value, false);
		return this.datapsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getDataPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getDataPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定数据属性");}
		return value;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField disablepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getDisablePSDEField(){
		if(this.disablepsdefield != null) return this.disablepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDISABLEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.disablepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.disablepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getDisablePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getDisablePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定禁用值属性");}
		return value;
	}


	public int getDynaInstMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAINSTMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getDynaInstTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAINSTTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDynaInstTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAINSTTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDynaModelFilePath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMODELFILEPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getDynaSysMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNASYSMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getEmptyText(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEMPTYTEXT);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes emptytextpslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getEmptyTextPSLanguageRes(){
		if(this.emptytextpslanguageres != null) return this.emptytextpslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEMPTYTEXTPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.emptytextpslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETEMPTYTEXTPSLANGUAGERES);
		return this.emptytextpslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getEmptyTextPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getEmptyTextPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定空白显示文本语言资源");}
		return value;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField endvaluepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getEndValuePSDEField(){
		if(this.endvaluepsdefield != null) return this.endvaluepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENDVALUEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.endvaluepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.endvaluepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getEndValuePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getEndValuePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定结束值属性");}
		return value;
	}


	@Deprecated
	public java.lang.String getIconCls(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETICONCLS);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField iconclspsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getIconClsPSDEField(){
		if(this.iconclspsdefield != null) return this.iconclspsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETICONCLSPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.iconclspsdefield = ipsdataentity.getPSDEField(value, false);
		return this.iconclspsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getIconClsPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getIconClsPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定图标样式属性");}
		return value;
	}


	@Deprecated
	public java.lang.String getIconClsX(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETICONCLSX);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField iconclsxpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getIconClsXPSDEField(){
		if(this.iconclsxpsdefield != null) return this.iconclsxpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETICONCLSXPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.iconclsxpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.iconclsxpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getIconClsXPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getIconClsXPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定图标样式(x)属性");}
		return value;
	}


	@Deprecated
	public java.lang.String getIconPath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETICONPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getIconPathX(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETICONPATHX);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField iconpathxpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getIconPathXPSDEField(){
		if(this.iconpathxpsdefield != null) return this.iconpathxpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETICONPATHXPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.iconpathxpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.iconpathxpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getIconPathXPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getIconPathXPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定图标路径(x)属性");}
		return value;
	}


	public int getIncBeginValueMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINCBEGINVALUEMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getIncEndValueMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINCENDVALUEMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	@Deprecated
	public java.lang.String getMemo(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMEMO);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMinorSortDir(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINORSORTDIR);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField minorsortpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getMinorSortPSDEField(){
		if(this.minorsortpsdefield != null) return this.minorsortpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINORSORTPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.minorsortpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.minorsortpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getMinorSortPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getMinorSortPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定默认排序属性");}
		return value;
	}


	public java.lang.String getName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getOrMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPSCodeListTemplId(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCODELISTTEMPLID);
		if(value == null){
			return null;
		}
		return value.asText();
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体数据集对象");}
		return value;
	}

	private net.ibizsys.model.dataentity.logic.IPSDEMSLogic psdemslogic;

	public net.ibizsys.model.dataentity.logic.IPSDEMSLogic getPSDEMSLogic(){
		if(this.psdemslogic != null) return this.psdemslogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEMSLOGIC);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.psdemslogic = ipsdataentity.getPSDEMSLogic(value, false);
		return this.psdemslogic;
	}

	public net.ibizsys.model.dataentity.logic.IPSDEMSLogic getPSDEMSLogicMust(){
		net.ibizsys.model.dataentity.logic.IPSDEMSLogic value = this.getPSDEMSLogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体主状态逻辑对象");}
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

	private net.ibizsys.model.dataentity.defield.IPSDEField pvaluepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getPValuePSDEField(){
		if(this.pvaluepsdefield != null) return this.pvaluepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPVALUEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.pvaluepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.pvaluepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getPValuePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getPValuePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定父值属性");}
		return value;
	}


	public java.lang.String getPredefinedType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPREDEFINEDTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean getRefFlag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFFLAG);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public java.lang.String getSystemTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSYSTEMTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getText(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEXT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getTextCls(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEXTCLS);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField textpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getTextPSDEField(){
		if(this.textpsdefield != null) return this.textpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEXTPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.textpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.textpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getTextPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getTextPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定显示文本属性");}
		return value;
	}


	public java.lang.String getTextSeparator(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEXTSEPARATOR);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUserData(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERDATA);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUserData2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUSERDATA2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField valuepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getValuePSDEField(){
		if(this.valuepsdefield != null) return this.valuepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.valuepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.valuepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getValuePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getValuePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定值属性");}
		return value;
	}


	public java.lang.String getValueSeparator(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVALUESEPARATOR);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isCodeItemValueNumber(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCODEITEMVALUENUMBER);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isDisableSelect(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDISABLESELECT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableCache(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLECACHE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isModuleInstCodeList(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISMODULEINSTCODELIST);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isSubSysAsCloud(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSUBSYSASCLOUD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isSubSysCodeList(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSUBSYSCODELIST);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isThresholdGroup(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISTHRESHOLDGROUP);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isUserScope(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISUSERSCOPE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
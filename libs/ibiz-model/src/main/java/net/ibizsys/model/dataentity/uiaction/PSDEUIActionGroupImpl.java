package net.ibizsys.model.dataentity.uiaction;



public class PSDEUIActionGroupImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup
		,net.ibizsys.model.app.dataentity.IPSAppDEUIActionGroup{

	public final static String ATTR_GETACTIONLEVELPSAPPDEFIELD = "getActionLevelPSAppDEField";
	public final static String ATTR_GETACTIONLEVELPSDEFIELD = "getActionLevelPSDEField";
	public final static String ATTR_GETBUTTONSTYLEPSAPPDEFIELD = "getButtonStylePSAppDEField";
	public final static String ATTR_GETBUTTONSTYLEPSDEFIELD = "getButtonStylePSDEField";
	public final static String ATTR_GETCLSPSAPPDEFIELD = "getClsPSAppDEField";
	public final static String ATTR_GETCLSPSDEFIELD = "getClsPSDEField";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDETAILPSAPPDEDATASET = "getDetailPSAppDEDataSet";
	public final static String ATTR_GETDETAILPSAPPDATAENTITY = "getDetailPSAppDataEntity";
	public final static String ATTR_GETDETAILPSDEDATASET = "getDetailPSDEDataSet";
	public final static String ATTR_GETDETAILPSDATAENTITY = "getDetailPSDataEntity";
	public final static String ATTR_GETDYNAMICMODE = "dynamicMode";
	public final static String ATTR_GETENABLESCRIPTPSAPPDEFIELD = "getEnableScriptPSAppDEField";
	public final static String ATTR_GETENABLESCRIPTPSDEFIELD = "getEnableScriptPSDEField";
	public final static String ATTR_GETGROUPTAG = "groupTag";
	public final static String ATTR_GETGROUPTAG2 = "groupTag2";
	public final static String ATTR_GETGROUPTAG3 = "groupTag3";
	public final static String ATTR_GETGROUPTAG4 = "groupTag4";
	public final static String ATTR_GETICONCLSPSAPPDEFIELD = "getIconClsPSAppDEField";
	public final static String ATTR_GETICONCLSPSDEFIELD = "getIconClsPSDEField";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSAPPDATAENTITY = "getPSAppDataEntity";
	public final static String ATTR_GETPSUIACTIONGROUPDETAILS = "getPSUIActionGroupDetails";
	public final static String ATTR_GETTEXTPSAPPDEFIELD = "getTextPSAppDEField";
	public final static String ATTR_GETTEXTPSDEFIELD = "getTextPSDEField";
	public final static String ATTR_GETTIPSPSAPPDEFIELD = "getTipsPSAppDEField";
	public final static String ATTR_GETTIPSPSDEFIELD = "getTipsPSDEField";
	public final static String ATTR_GETUIACTIONTAGPSAPPDEFIELD = "getUIActionTagPSAppDEField";
	public final static String ATTR_GETUIACTIONTAGPSDEFIELD = "getUIActionTagPSDEField";
	public final static String ATTR_GETUNIQUETAG = "uniqueTag";
	public final static String ATTR_GETVISIBLESCRIPTPSAPPDEFIELD = "getVisibleScriptPSAppDEField";
	public final static String ATTR_GETVISIBLESCRIPTPSDEFIELD = "getVisibleScriptPSDEField";
	private net.ibizsys.model.app.dataentity.IPSAppDEField actionlevelpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getActionLevelPSAppDEField(){
		if(this.actionlevelpsappdefield != null) return this.actionlevelpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONLEVELPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.actionlevelpsappdefield = this.getDetailPSAppDataEntityMust().getPSAppDEField(value, false);
		return this.actionlevelpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getActionLevelPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getActionLevelPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定成员行为级别应用实体属性对象");}
		return value;
	}

	public void setActionLevelPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField actionlevelpsappdefield){
		this.actionlevelpsappdefield = actionlevelpsappdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField actionlevelpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getActionLevelPSDEField(){
		if(this.actionlevelpsdefield != null) return this.actionlevelpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONLEVELPSDEFIELD);
		if(value == null){
			return null;
		}
		this.actionlevelpsdefield = this.getDetailPSDataEntityMust().getPSDEField(value, false);
		return this.actionlevelpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getActionLevelPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getActionLevelPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定成员行为级别实体属性对象");}
		return value;
	}

	public void setActionLevelPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField actionlevelpsdefield){
		this.actionlevelpsdefield = actionlevelpsdefield;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField buttonstylepsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getButtonStylePSAppDEField(){
		if(this.buttonstylepsappdefield != null) return this.buttonstylepsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBUTTONSTYLEPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.buttonstylepsappdefield = this.getDetailPSAppDataEntityMust().getPSAppDEField(value, false);
		return this.buttonstylepsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getButtonStylePSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getButtonStylePSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定成员按钮样式应用实体属性对象");}
		return value;
	}

	public void setButtonStylePSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField buttonstylepsappdefield){
		this.buttonstylepsappdefield = buttonstylepsappdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField buttonstylepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getButtonStylePSDEField(){
		if(this.buttonstylepsdefield != null) return this.buttonstylepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBUTTONSTYLEPSDEFIELD);
		if(value == null){
			return null;
		}
		this.buttonstylepsdefield = this.getDetailPSDataEntityMust().getPSDEField(value, false);
		return this.buttonstylepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getButtonStylePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getButtonStylePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定成员按钮样式实体属性对象");}
		return value;
	}

	public void setButtonStylePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField buttonstylepsdefield){
		this.buttonstylepsdefield = buttonstylepsdefield;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField clspsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getClsPSAppDEField(){
		if(this.clspsappdefield != null) return this.clspsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCLSPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.clspsappdefield = this.getDetailPSAppDataEntityMust().getPSAppDEField(value, false);
		return this.clspsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getClsPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getClsPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定成员样式表提示应用实体属性对象");}
		return value;
	}

	public void setClsPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField clspsappdefield){
		this.clspsappdefield = clspsappdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField clspsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getClsPSDEField(){
		if(this.clspsdefield != null) return this.clspsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCLSPSDEFIELD);
		if(value == null){
			return null;
		}
		this.clspsdefield = this.getDetailPSDataEntityMust().getPSDEField(value, false);
		return this.clspsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getClsPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getClsPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定成员样式表提示实体属性对象");}
		return value;
	}

	public void setClsPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField clspsdefield){
		this.clspsdefield = clspsdefield;
	}


	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEDataSet detailpsappdedataset;

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getDetailPSAppDEDataSet(){
		if(this.detailpsappdedataset != null) return this.detailpsappdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDETAILPSAPPDEDATASET);
		if(value == null){
			return null;
		}
		this.detailpsappdedataset = this.getDetailPSAppDataEntityMust().getPSAppDEDataSet(value, false);
		return this.detailpsappdedataset;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getDetailPSAppDEDataSetMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEDataSet value = this.getDetailPSAppDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定成员数据应用实体数据集对象");}
		return value;
	}

	public void setDetailPSAppDEDataSet(net.ibizsys.model.app.dataentity.IPSAppDEDataSet detailpsappdedataset){
		this.detailpsappdedataset = detailpsappdedataset;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDataEntity detailpsappdataentity;

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getDetailPSAppDataEntity(){
		if(this.detailpsappdataentity != null) return this.detailpsappdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDETAILPSAPPDATAENTITY);
		if(value == null){
			return null;
		}
		this.detailpsappdataentity = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETDETAILPSAPPDATAENTITY);
		return this.detailpsappdataentity;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getDetailPSAppDataEntityMust(){
		net.ibizsys.model.app.dataentity.IPSAppDataEntity value = this.getDetailPSAppDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定成员数据应用实体对象");}
		return value;
	}

	public void setDetailPSAppDataEntity(net.ibizsys.model.app.dataentity.IPSAppDataEntity detailpsappdataentity){
		this.detailpsappdataentity = detailpsappdataentity;
	}

	private net.ibizsys.model.dataentity.ds.IPSDEDataSet detailpsdedataset;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getDetailPSDEDataSet(){
		if(this.detailpsdedataset != null) return this.detailpsdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDETAILPSDEDATASET);
		if(value == null){
			return null;
		}
		this.detailpsdedataset = this.getDetailPSDataEntityMust().getPSDEDataSet(value, false);
		return this.detailpsdedataset;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getDetailPSDEDataSetMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getDetailPSDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定成员数据实体数据集对象");}
		return value;
	}

	public void setDetailPSDEDataSet(net.ibizsys.model.dataentity.ds.IPSDEDataSet detailpsdedataset){
		this.detailpsdedataset = detailpsdedataset;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity detailpsdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getDetailPSDataEntity(){
		if(this.detailpsdataentity != null) return this.detailpsdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDETAILPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.detailpsdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETDETAILPSDATAENTITY);
		return this.detailpsdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getDetailPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getDetailPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定成员数据实体对象");}
		return value;
	}

	public void setDetailPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity detailpsdataentity){
		this.detailpsdataentity = detailpsdataentity;
	}


	public int getDynamicMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMICMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField enablescriptpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getEnableScriptPSAppDEField(){
		if(this.enablescriptpsappdefield != null) return this.enablescriptpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENABLESCRIPTPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.enablescriptpsappdefield = this.getDetailPSAppDataEntityMust().getPSAppDEField(value, false);
		return this.enablescriptpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getEnableScriptPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getEnableScriptPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定成员启用脚本应用实体属性对象");}
		return value;
	}

	public void setEnableScriptPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField enablescriptpsappdefield){
		this.enablescriptpsappdefield = enablescriptpsappdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField enablescriptpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getEnableScriptPSDEField(){
		if(this.enablescriptpsdefield != null) return this.enablescriptpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENABLESCRIPTPSDEFIELD);
		if(value == null){
			return null;
		}
		this.enablescriptpsdefield = this.getDetailPSDataEntityMust().getPSDEField(value, false);
		return this.enablescriptpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getEnableScriptPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getEnableScriptPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定成员启用脚本实体属性对象");}
		return value;
	}

	public void setEnableScriptPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField enablescriptpsdefield){
		this.enablescriptpsdefield = enablescriptpsdefield;
	}


	public java.lang.String getGroupTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getGroupTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getGroupTag3(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPTAG3);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getGroupTag4(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPTAG4);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField iconclspsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getIconClsPSAppDEField(){
		if(this.iconclspsappdefield != null) return this.iconclspsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETICONCLSPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.iconclspsappdefield = this.getDetailPSAppDataEntityMust().getPSAppDEField(value, false);
		return this.iconclspsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getIconClsPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getIconClsPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定成员图标样式表应用实体属性对象");}
		return value;
	}

	public void setIconClsPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField iconclspsappdefield){
		this.iconclspsappdefield = iconclspsappdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField iconclspsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getIconClsPSDEField(){
		if(this.iconclspsdefield != null) return this.iconclspsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETICONCLSPSDEFIELD);
		if(value == null){
			return null;
		}
		this.iconclspsdefield = this.getDetailPSDataEntityMust().getPSDEField(value, false);
		return this.iconclspsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getIconClsPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getIconClsPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定成员图标样式表实体属性对象");}
		return value;
	}

	public void setIconClsPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField iconclspsdefield){
		this.iconclspsdefield = iconclspsdefield;
	}


	@Deprecated
	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 0;
		}
		return value.asInt();
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用实体");}
		return value;
	}

	public void setPSAppDataEntity(net.ibizsys.model.app.dataentity.IPSAppDataEntity psappdataentity){
		this.psappdataentity = psappdataentity;
	}


	private java.util.List<net.ibizsys.model.view.IPSUIActionGroupDetail> psuiactiongroupdetails = null;
	public java.util.List<net.ibizsys.model.view.IPSUIActionGroupDetail> getPSUIActionGroupDetails(){
		if(this.psuiactiongroupdetails == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSUIACTIONGROUPDETAILS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.view.IPSUIActionGroupDetail> list = new java.util.ArrayList<net.ibizsys.model.view.IPSUIActionGroupDetail>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.view.IPSUIActionGroupDetail obj = this.getPSModelObject(net.ibizsys.model.view.IPSUIActionGroupDetail.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSUIACTIONGROUPDETAILS);
				if(obj!=null)list.add(obj);
			}
			this.psuiactiongroupdetails = list;
		}
		return (this.psuiactiongroupdetails.size() == 0)? null : this.psuiactiongroupdetails;
	}

	public net.ibizsys.model.view.IPSUIActionGroupDetail getPSUIActionGroupDetail(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.view.IPSUIActionGroupDetail.class, this.getPSUIActionGroupDetails(), objKey, bTryMode);
	}
	public void setPSUIActionGroupDetails(java.util.List<net.ibizsys.model.view.IPSUIActionGroupDetail> list){
		this.psuiactiongroupdetails = list;
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField textpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getTextPSAppDEField(){
		if(this.textpsappdefield != null) return this.textpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEXTPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.textpsappdefield = this.getDetailPSAppDataEntityMust().getPSAppDEField(value, false);
		return this.textpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getTextPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getTextPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定成员文本应用实体属性对象");}
		return value;
	}

	public void setTextPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField textpsappdefield){
		this.textpsappdefield = textpsappdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField textpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getTextPSDEField(){
		if(this.textpsdefield != null) return this.textpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEXTPSDEFIELD);
		if(value == null){
			return null;
		}
		this.textpsdefield = this.getDetailPSDataEntityMust().getPSDEField(value, false);
		return this.textpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getTextPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getTextPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定成员文本实体属性对象");}
		return value;
	}

	public void setTextPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField textpsdefield){
		this.textpsdefield = textpsdefield;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField tipspsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getTipsPSAppDEField(){
		if(this.tipspsappdefield != null) return this.tipspsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTIPSPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.tipspsappdefield = this.getDetailPSAppDataEntityMust().getPSAppDEField(value, false);
		return this.tipspsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getTipsPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getTipsPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定成员提示应用实体属性对象");}
		return value;
	}

	public void setTipsPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField tipspsappdefield){
		this.tipspsappdefield = tipspsappdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField tipspsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getTipsPSDEField(){
		if(this.tipspsdefield != null) return this.tipspsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTIPSPSDEFIELD);
		if(value == null){
			return null;
		}
		this.tipspsdefield = this.getDetailPSDataEntityMust().getPSDEField(value, false);
		return this.tipspsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getTipsPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getTipsPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定成员提示实体属性对象");}
		return value;
	}

	public void setTipsPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField tipspsdefield){
		this.tipspsdefield = tipspsdefield;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField uiactiontagpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getUIActionTagPSAppDEField(){
		if(this.uiactiontagpsappdefield != null) return this.uiactiontagpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUIACTIONTAGPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.uiactiontagpsappdefield = this.getDetailPSAppDataEntityMust().getPSAppDEField(value, false);
		return this.uiactiontagpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getUIActionTagPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getUIActionTagPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定成员界面行为标记应用实体属性对象");}
		return value;
	}

	public void setUIActionTagPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField uiactiontagpsappdefield){
		this.uiactiontagpsappdefield = uiactiontagpsappdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField uiactiontagpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getUIActionTagPSDEField(){
		if(this.uiactiontagpsdefield != null) return this.uiactiontagpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUIACTIONTAGPSDEFIELD);
		if(value == null){
			return null;
		}
		this.uiactiontagpsdefield = this.getDetailPSDataEntityMust().getPSDEField(value, false);
		return this.uiactiontagpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getUIActionTagPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getUIActionTagPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定成员界面行为标记实体属性对象");}
		return value;
	}

	public void setUIActionTagPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField uiactiontagpsdefield){
		this.uiactiontagpsdefield = uiactiontagpsdefield;
	}


	public java.lang.String getUniqueTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNIQUETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField visiblescriptpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getVisibleScriptPSAppDEField(){
		if(this.visiblescriptpsappdefield != null) return this.visiblescriptpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVISIBLESCRIPTPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.visiblescriptpsappdefield = this.getDetailPSAppDataEntityMust().getPSAppDEField(value, false);
		return this.visiblescriptpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getVisibleScriptPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getVisibleScriptPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定成员显示脚本应用实体属性对象");}
		return value;
	}

	public void setVisibleScriptPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField visiblescriptpsappdefield){
		this.visiblescriptpsappdefield = visiblescriptpsappdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField visiblescriptpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getVisibleScriptPSDEField(){
		if(this.visiblescriptpsdefield != null) return this.visiblescriptpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVISIBLESCRIPTPSDEFIELD);
		if(value == null){
			return null;
		}
		this.visiblescriptpsdefield = this.getDetailPSDataEntityMust().getPSDEField(value, false);
		return this.visiblescriptpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getVisibleScriptPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getVisibleScriptPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定成员显示脚本实体属性对象");}
		return value;
	}

	public void setVisibleScriptPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField visiblescriptpsdefield){
		this.visiblescriptpsdefield = visiblescriptpsdefield;
	}

}
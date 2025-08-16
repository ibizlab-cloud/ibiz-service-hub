package net.ibizsys.model.control.grid;



public class PSDEGridImpl extends net.ibizsys.model.control.PSMDAjaxControlContainerImpl2 implements net.ibizsys.model.control.grid.IPSDEGrid{

	public final static String ATTR_GETAGGMODE = "aggMode";
	public final static String ATTR_GETAGGPSAPPDEDATASET = "getAggPSAppDEDataSet";
	public final static String ATTR_GETAGGPSAPPDATAENTITY = "getAggPSAppDataEntity";
	public final static String ATTR_GETAGGPSLAYOUTPANEL = "getAggPSLayoutPanel";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCOLUMNENABLEFILTER = "columnEnableFilter";
	public final static String ATTR_GETCOLUMNENABLELINK = "columnEnableLink";
	public final static String ATTR_GETCREATEPSCONTROLACTION = "getCreatePSControlAction";
	public final static String ATTR_GETEMPTYTEXT = "emptyText";
	public final static String ATTR_GETEMPTYTEXTPSLANGUAGERES = "getEmptyTextPSLanguageRes";
	public final static String ATTR_GETFROZENFIRSTCOLUMN = "frozenFirstColumn";
	public final static String ATTR_GETFROZENLASTCOLUMN = "frozenLastColumn";
	public final static String ATTR_GETGETDRAFTFROMPSCONTROLACTION = "getGetDraftFromPSControlAction";
	public final static String ATTR_GETGETDRAFTPSCONTROLACTION = "getGetDraftPSControlAction";
	public final static String ATTR_GETGETPSCONTROLACTION = "getGetPSControlAction";
	public final static String ATTR_GETGRIDSTYLE = "gridStyle";
	public final static String ATTR_GETGROUPMODE = "groupMode";
	public final static String ATTR_GETGROUPPSAPPDEFIELD = "getGroupPSAppDEField";
	public final static String ATTR_GETGROUPPSCODELIST = "getGroupPSCodeList";
	public final static String ATTR_GETGROUPPSDEFIELD = "getGroupPSDEField";
	public final static String ATTR_GETGROUPSTYLE = "groupStyle";
	public final static String ATTR_GETGROUPTEXTPSAPPDEFIELD = "getGroupTextPSAppDEField";
	public final static String ATTR_GETGROUPTEXTPSDEFIELD = "getGroupTextPSDEField";
	public final static String ATTR_GETMINORSORTDIR = "minorSortDir";
	public final static String ATTR_GETMINORSORTPSAPPDEFIELD = "getMinorSortPSAppDEField";
	public final static String ATTR_GETMOVEPSCONTROLACTION = "getMovePSControlAction";
	public final static String ATTR_GETORDERVALUEPSAPPDEFIELD = "getOrderValuePSAppDEField";
	public final static String ATTR_GETPSDEGRIDCOLUMNS = "getPSDEGridColumns";
	public final static String ATTR_GETPSDEGRIDDATAITEMS = "getPSDEGridDataItems";
	public final static String ATTR_GETPSDEGRIDEDITITEMUPDATES = "getPSDEGridEditItemUpdates";
	public final static String ATTR_GETPSDEGRIDEDITITEMVRS = "getPSDEGridEditItemVRs";
	public final static String ATTR_GETPSDEGRIDEDITITEMS = "getPSDEGridEditItems";
	public final static String ATTR_GETPAGINGMODE = "pagingMode";
	public final static String ATTR_GETPAGINGSIZE = "pagingSize";
	public final static String ATTR_GETREMOVEPSCONTROLACTION = "getRemovePSControlAction";
	public final static String ATTR_GETSORTMODE = "sortMode";
	public final static String ATTR_GETUPDATEPSCONTROLACTION = "getUpdatePSControlAction";
	public final static String ATTR_HASWFDATAITEMS = "hasWFDataItems";
	public final static String ATTR_ISENABLECOLFILTER = "enableColFilter";
	public final static String ATTR_ISENABLECUSTOMIZED = "enableCustomized";
	public final static String ATTR_ISENABLEGROUP = "enableGroup";
	public final static String ATTR_ISENABLEPAGINGBAR = "enablePagingBar";
	public final static String ATTR_ISENABLEROWEDIT = "enableRowEdit";
	public final static String ATTR_ISENABLEROWEDITCHANGEDONLY = "enableRowEditChangedOnly";
	public final static String ATTR_ISENABLEROWEDITORDER = "enableRowEditOrder";
	public final static String ATTR_ISENABLEROWNEW = "enableRowNew";
	public final static String ATTR_ISFORCEFIT = "forceFit";
	public final static String ATTR_ISHIDEHEADER = "hideHeader";
	public final static String ATTR_ISNOSORT = "noSort";
	public final static String ATTR_ISSINGLESELECT = "singleSelect";

	public java.lang.String getAggMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAGGMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEDataSet aggpsappdedataset;

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getAggPSAppDEDataSet(){
		if(this.aggpsappdedataset != null) return this.aggpsappdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAGGPSAPPDEDATASET);
		if(value == null){
			return null;
		}
		this.aggpsappdedataset = this.getAggPSAppDataEntityMust().getPSAppDEDataSet(value, false);
		return this.aggpsappdedataset;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getAggPSAppDEDataSetMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEDataSet value = this.getAggPSAppDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定聚合服务应用实体数据集");}
		return value;
	}

	public void setAggPSAppDEDataSet(net.ibizsys.model.app.dataentity.IPSAppDEDataSet aggpsappdedataset){
		this.aggpsappdedataset = aggpsappdedataset;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDataEntity aggpsappdataentity;

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getAggPSAppDataEntity(){
		if(this.aggpsappdataentity != null) return this.aggpsappdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAGGPSAPPDATAENTITY);
		if(value == null){
			return null;
		}
		this.aggpsappdataentity = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETAGGPSAPPDATAENTITY);
		return this.aggpsappdataentity;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getAggPSAppDataEntityMust(){
		net.ibizsys.model.app.dataentity.IPSAppDataEntity value = this.getAggPSAppDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定聚合服务应用实体对象");}
		return value;
	}

	public void setAggPSAppDataEntity(net.ibizsys.model.app.dataentity.IPSAppDataEntity aggpsappdataentity){
		this.aggpsappdataentity = aggpsappdataentity;
	}

	private net.ibizsys.model.control.panel.IPSLayoutPanel aggpslayoutpanel;

	public net.ibizsys.model.control.panel.IPSLayoutPanel getAggPSLayoutPanel(){
		if(this.aggpslayoutpanel != null) return this.aggpslayoutpanel;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAGGPSLAYOUTPANEL);
		if(value == null){
			return null;
		}
		this.aggpslayoutpanel = getPSModelObject(net.ibizsys.model.control.panel.IPSLayoutPanel.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETAGGPSLAYOUTPANEL);
		return this.aggpslayoutpanel;
	}

	public net.ibizsys.model.control.panel.IPSLayoutPanel getAggPSLayoutPanelMust(){
		net.ibizsys.model.control.panel.IPSLayoutPanel value = this.getAggPSLayoutPanel();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定聚合数据布局面板");}
		return value;
	}

	public void setAggPSLayoutPanel(net.ibizsys.model.control.panel.IPSLayoutPanel aggpslayoutpanel){
		this.aggpslayoutpanel = aggpslayoutpanel;
	}


	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getColumnEnableFilter(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOLUMNENABLEFILTER);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getColumnEnableLink(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOLUMNENABLELINK);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.control.IPSControlAction createpscontrolaction;

	public net.ibizsys.model.control.IPSControlAction getCreatePSControlAction(){
		if(this.createpscontrolaction != null) return this.createpscontrolaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCREATEPSCONTROLACTION);
		if(value == null){
			return null;
		}
		this.createpscontrolaction = getPSModelObject(net.ibizsys.model.control.IPSControlAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETCREATEPSCONTROLACTION);
		return this.createpscontrolaction;
	}

	public net.ibizsys.model.control.IPSControlAction getCreatePSControlActionMust(){
		net.ibizsys.model.control.IPSControlAction value = this.getCreatePSControlAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定建立数据行为");}
		return value;
	}

	public void setCreatePSControlAction(net.ibizsys.model.control.IPSControlAction createpscontrolaction){
		this.createpscontrolaction = createpscontrolaction;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定无值内容语言资源");}
		return value;
	}

	public void setEmptyTextPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes emptytextpslanguageres){
		this.emptytextpslanguageres = emptytextpslanguageres;
	}


	public int getFrozenFirstColumn(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFROZENFIRSTCOLUMN);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getFrozenLastColumn(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFROZENLASTCOLUMN);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.control.IPSControlAction getdraftfrompscontrolaction;

	public net.ibizsys.model.control.IPSControlAction getGetDraftFromPSControlAction(){
		if(this.getdraftfrompscontrolaction != null) return this.getdraftfrompscontrolaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGETDRAFTFROMPSCONTROLACTION);
		if(value == null){
			return null;
		}
		this.getdraftfrompscontrolaction = getPSModelObject(net.ibizsys.model.control.IPSControlAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETGETDRAFTFROMPSCONTROLACTION);
		return this.getdraftfrompscontrolaction;
	}

	public net.ibizsys.model.control.IPSControlAction getGetDraftFromPSControlActionMust(){
		net.ibizsys.model.control.IPSControlAction value = this.getGetDraftFromPSControlAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定获取草稿数据行为（拷贝）");}
		return value;
	}

	public void setGetDraftFromPSControlAction(net.ibizsys.model.control.IPSControlAction getdraftfrompscontrolaction){
		this.getdraftfrompscontrolaction = getdraftfrompscontrolaction;
	}

	private net.ibizsys.model.control.IPSControlAction getdraftpscontrolaction;

	public net.ibizsys.model.control.IPSControlAction getGetDraftPSControlAction(){
		if(this.getdraftpscontrolaction != null) return this.getdraftpscontrolaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGETDRAFTPSCONTROLACTION);
		if(value == null){
			return null;
		}
		this.getdraftpscontrolaction = getPSModelObject(net.ibizsys.model.control.IPSControlAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETGETDRAFTPSCONTROLACTION);
		return this.getdraftpscontrolaction;
	}

	public net.ibizsys.model.control.IPSControlAction getGetDraftPSControlActionMust(){
		net.ibizsys.model.control.IPSControlAction value = this.getGetDraftPSControlAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定获取草稿数据行为");}
		return value;
	}

	public void setGetDraftPSControlAction(net.ibizsys.model.control.IPSControlAction getdraftpscontrolaction){
		this.getdraftpscontrolaction = getdraftpscontrolaction;
	}

	private net.ibizsys.model.control.IPSControlAction getpscontrolaction;

	public net.ibizsys.model.control.IPSControlAction getGetPSControlAction(){
		if(this.getpscontrolaction != null) return this.getpscontrolaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGETPSCONTROLACTION);
		if(value == null){
			return null;
		}
		this.getpscontrolaction = getPSModelObject(net.ibizsys.model.control.IPSControlAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETGETPSCONTROLACTION);
		return this.getpscontrolaction;
	}

	public net.ibizsys.model.control.IPSControlAction getGetPSControlActionMust(){
		net.ibizsys.model.control.IPSControlAction value = this.getGetPSControlAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定获取数据行为");}
		return value;
	}

	public void setGetPSControlAction(net.ibizsys.model.control.IPSControlAction getpscontrolaction){
		this.getpscontrolaction = getpscontrolaction;
	}


	public java.lang.String getGridStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGRIDSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getGroupMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPMODE);
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
		this.grouppsappdefield = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEField.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETGROUPPSAPPDEFIELD);
		return this.grouppsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getGroupPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getGroupPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定分组应用实体属性");}
		return value;
	}

	public void setGroupPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField grouppsappdefield){
		this.grouppsappdefield = grouppsappdefield;
	}

	private net.ibizsys.model.codelist.IPSCodeList grouppscodelist;

	public net.ibizsys.model.codelist.IPSCodeList getGroupPSCodeList(){
		if(this.grouppscodelist != null) return this.grouppscodelist;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPPSCODELIST);
		if(value == null){
			return null;
		}
		this.grouppscodelist = getPSModelObject(net.ibizsys.model.codelist.IPSCodeList.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETGROUPPSCODELIST);
		return this.grouppscodelist;
	}

	public net.ibizsys.model.codelist.IPSCodeList getGroupPSCodeListMust(){
		net.ibizsys.model.codelist.IPSCodeList value = this.getGroupPSCodeList();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定分组代码表");}
		return value;
	}

	public void setGroupPSCodeList(net.ibizsys.model.codelist.IPSCodeList grouppscodelist){
		this.grouppscodelist = grouppscodelist;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField grouppsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getGroupPSDEField(){
		if(this.grouppsdefield != null) return this.grouppsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPPSDEFIELD);
		if(value == null){
			return null;
		}
		this.grouppsdefield = getPSModelObject(net.ibizsys.model.dataentity.defield.IPSDEField.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETGROUPPSDEFIELD);
		return this.grouppsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getGroupPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getGroupPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定分组实体属性");}
		return value;
	}

	public void setGroupPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField grouppsdefield){
		this.grouppsdefield = grouppsdefield;
	}


	public java.lang.String getGroupStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPSTYLE);
		if(value == null){
			return "DEFAULT";
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField grouptextpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getGroupTextPSAppDEField(){
		if(this.grouptextpsappdefield != null) return this.grouptextpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPTEXTPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.grouptextpsappdefield = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEField.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETGROUPTEXTPSAPPDEFIELD);
		return this.grouptextpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getGroupTextPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getGroupTextPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定分组应用实体属性");}
		return value;
	}

	public void setGroupTextPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField grouptextpsappdefield){
		this.grouptextpsappdefield = grouptextpsappdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField grouptextpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getGroupTextPSDEField(){
		if(this.grouptextpsdefield != null) return this.grouptextpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPTEXTPSDEFIELD);
		if(value == null){
			return null;
		}
		this.grouptextpsdefield = getPSModelObject(net.ibizsys.model.dataentity.defield.IPSDEField.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETGROUPTEXTPSDEFIELD);
		return this.grouptextpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getGroupTextPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getGroupTextPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定分组文本实体属性");}
		return value;
	}

	public void setGroupTextPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField grouptextpsdefield){
		this.grouptextpsdefield = grouptextpsdefield;
	}


	public java.lang.String getMinorSortDir(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINORSORTDIR);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField minorsortpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getMinorSortPSAppDEField(){
		if(this.minorsortpsappdefield != null) return this.minorsortpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINORSORTPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.minorsortpsappdefield = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEField.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETMINORSORTPSAPPDEFIELD);
		return this.minorsortpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getMinorSortPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getMinorSortPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定附加排序应用实体属性");}
		return value;
	}

	public void setMinorSortPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField minorsortpsappdefield){
		this.minorsortpsappdefield = minorsortpsappdefield;
	}

	private net.ibizsys.model.control.IPSControlAction movepscontrolaction;

	public net.ibizsys.model.control.IPSControlAction getMovePSControlAction(){
		if(this.movepscontrolaction != null) return this.movepscontrolaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMOVEPSCONTROLACTION);
		if(value == null){
			return null;
		}
		this.movepscontrolaction = getPSModelObject(net.ibizsys.model.control.IPSControlAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETMOVEPSCONTROLACTION);
		return this.movepscontrolaction;
	}

	public net.ibizsys.model.control.IPSControlAction getMovePSControlActionMust(){
		net.ibizsys.model.control.IPSControlAction value = this.getMovePSControlAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定移动数据行为");}
		return value;
	}

	public void setMovePSControlAction(net.ibizsys.model.control.IPSControlAction movepscontrolaction){
		this.movepscontrolaction = movepscontrolaction;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField ordervaluepsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getOrderValuePSAppDEField(){
		if(this.ordervaluepsappdefield != null) return this.ordervaluepsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUEPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.ordervaluepsappdefield = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEField.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETORDERVALUEPSAPPDEFIELD);
		return this.ordervaluepsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getOrderValuePSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getOrderValuePSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定排序值应用实体属性");}
		return value;
	}

	public void setOrderValuePSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField ordervaluepsappdefield){
		this.ordervaluepsappdefield = ordervaluepsappdefield;
	}


	private java.util.List<net.ibizsys.model.control.grid.IPSDEGridColumn> psdegridcolumns = null;
	public java.util.List<net.ibizsys.model.control.grid.IPSDEGridColumn> getPSDEGridColumns(){
		if(this.psdegridcolumns == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEGRIDCOLUMNS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.grid.IPSDEGridColumn> list = new java.util.ArrayList<net.ibizsys.model.control.grid.IPSDEGridColumn>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.grid.IPSDEGridColumn obj = this.getPSModelObject(net.ibizsys.model.control.grid.IPSDEGridColumn.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEGRIDCOLUMNS);
				if(obj!=null)list.add(obj);
			}
			this.psdegridcolumns = list;
		}
		return (this.psdegridcolumns.size() == 0)? null : this.psdegridcolumns;
	}

	public net.ibizsys.model.control.grid.IPSDEGridColumn getPSDEGridColumn(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.grid.IPSDEGridColumn.class, this.getPSDEGridColumns(), objKey, bTryMode);
	}
	public void setPSDEGridColumns(java.util.List<net.ibizsys.model.control.grid.IPSDEGridColumn> list){
		this.psdegridcolumns = list;
	}

	private java.util.List<net.ibizsys.model.control.grid.IPSDEGridDataItem> psdegriddataitems = null;
	public java.util.List<net.ibizsys.model.control.grid.IPSDEGridDataItem> getPSDEGridDataItems(){
		if(this.psdegriddataitems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEGRIDDATAITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.grid.IPSDEGridDataItem> list = new java.util.ArrayList<net.ibizsys.model.control.grid.IPSDEGridDataItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.grid.IPSDEGridDataItem obj = this.getPSModelObject(net.ibizsys.model.control.grid.IPSDEGridDataItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEGRIDDATAITEMS);
				if(obj!=null)list.add(obj);
			}
			this.psdegriddataitems = list;
		}
		return (this.psdegriddataitems.size() == 0)? null : this.psdegriddataitems;
	}

	public net.ibizsys.model.control.grid.IPSDEGridDataItem getPSDEGridDataItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.grid.IPSDEGridDataItem.class, this.getPSDEGridDataItems(), objKey, bTryMode);
	}
	public void setPSDEGridDataItems(java.util.List<net.ibizsys.model.control.grid.IPSDEGridDataItem> list){
		this.psdegriddataitems = list;
	}

	private java.util.List<net.ibizsys.model.control.grid.IPSDEGridEditItemUpdate> psdegridedititemupdates = null;
	public java.util.List<net.ibizsys.model.control.grid.IPSDEGridEditItemUpdate> getPSDEGridEditItemUpdates(){
		if(this.psdegridedititemupdates == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEGRIDEDITITEMUPDATES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.grid.IPSDEGridEditItemUpdate> list = new java.util.ArrayList<net.ibizsys.model.control.grid.IPSDEGridEditItemUpdate>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.grid.IPSDEGridEditItemUpdate obj = this.getPSModelObject(net.ibizsys.model.control.grid.IPSDEGridEditItemUpdate.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEGRIDEDITITEMUPDATES);
				if(obj!=null)list.add(obj);
			}
			this.psdegridedititemupdates = list;
		}
		return (this.psdegridedititemupdates.size() == 0)? null : this.psdegridedititemupdates;
	}

	public net.ibizsys.model.control.grid.IPSDEGridEditItemUpdate getPSDEGridEditItemUpdate(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.grid.IPSDEGridEditItemUpdate.class, this.getPSDEGridEditItemUpdates(), objKey, bTryMode);
	}
	public void setPSDEGridEditItemUpdates(java.util.List<net.ibizsys.model.control.grid.IPSDEGridEditItemUpdate> list){
		this.psdegridedititemupdates = list;
	}

	private java.util.List<net.ibizsys.model.control.grid.IPSDEGridEditItemVR> psdegridedititemvrs = null;
	public java.util.List<net.ibizsys.model.control.grid.IPSDEGridEditItemVR> getPSDEGridEditItemVRs(){
		if(this.psdegridedititemvrs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEGRIDEDITITEMVRS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.grid.IPSDEGridEditItemVR> list = new java.util.ArrayList<net.ibizsys.model.control.grid.IPSDEGridEditItemVR>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.grid.IPSDEGridEditItemVR obj = this.getPSModelObject(net.ibizsys.model.control.grid.IPSDEGridEditItemVR.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEGRIDEDITITEMVRS);
				if(obj!=null)list.add(obj);
			}
			this.psdegridedititemvrs = list;
		}
		return (this.psdegridedititemvrs.size() == 0)? null : this.psdegridedititemvrs;
	}

	public net.ibizsys.model.control.grid.IPSDEGridEditItemVR getPSDEGridEditItemVR(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.grid.IPSDEGridEditItemVR.class, this.getPSDEGridEditItemVRs(), objKey, bTryMode);
	}
	public void setPSDEGridEditItemVRs(java.util.List<net.ibizsys.model.control.grid.IPSDEGridEditItemVR> list){
		this.psdegridedititemvrs = list;
	}

	private java.util.List<net.ibizsys.model.control.grid.IPSDEGridEditItem> psdegridedititems = null;
	public java.util.List<net.ibizsys.model.control.grid.IPSDEGridEditItem> getPSDEGridEditItems(){
		if(this.psdegridedititems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEGRIDEDITITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.grid.IPSDEGridEditItem> list = new java.util.ArrayList<net.ibizsys.model.control.grid.IPSDEGridEditItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.grid.IPSDEGridEditItem obj = this.getPSModelObject(net.ibizsys.model.control.grid.IPSDEGridEditItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEGRIDEDITITEMS);
				if(obj!=null)list.add(obj);
			}
			this.psdegridedititems = list;
		}
		return (this.psdegridedititems.size() == 0)? null : this.psdegridedititems;
	}

	public net.ibizsys.model.control.grid.IPSDEGridEditItem getPSDEGridEditItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.grid.IPSDEGridEditItem.class, this.getPSDEGridEditItems(), objKey, bTryMode);
	}
	public void setPSDEGridEditItems(java.util.List<net.ibizsys.model.control.grid.IPSDEGridEditItem> list){
		this.psdegridedititems = list;
	}

	public int getPagingMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPAGINGMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getPagingSize(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPAGINGSIZE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.control.IPSControlAction removepscontrolaction;

	public net.ibizsys.model.control.IPSControlAction getRemovePSControlAction(){
		if(this.removepscontrolaction != null) return this.removepscontrolaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREMOVEPSCONTROLACTION);
		if(value == null){
			return null;
		}
		this.removepscontrolaction = getPSModelObject(net.ibizsys.model.control.IPSControlAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETREMOVEPSCONTROLACTION);
		return this.removepscontrolaction;
	}

	public net.ibizsys.model.control.IPSControlAction getRemovePSControlActionMust(){
		net.ibizsys.model.control.IPSControlAction value = this.getRemovePSControlAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定删除数据行为");}
		return value;
	}

	public void setRemovePSControlAction(net.ibizsys.model.control.IPSControlAction removepscontrolaction){
		this.removepscontrolaction = removepscontrolaction;
	}


	public java.lang.String getSortMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSORTMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.control.IPSControlAction updatepscontrolaction;

	public net.ibizsys.model.control.IPSControlAction getUpdatePSControlAction(){
		if(this.updatepscontrolaction != null) return this.updatepscontrolaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUPDATEPSCONTROLACTION);
		if(value == null){
			return null;
		}
		this.updatepscontrolaction = getPSModelObject(net.ibizsys.model.control.IPSControlAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETUPDATEPSCONTROLACTION);
		return this.updatepscontrolaction;
	}

	public net.ibizsys.model.control.IPSControlAction getUpdatePSControlActionMust(){
		net.ibizsys.model.control.IPSControlAction value = this.getUpdatePSControlAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定更新数据行为");}
		return value;
	}

	public void setUpdatePSControlAction(net.ibizsys.model.control.IPSControlAction updatepscontrolaction){
		this.updatepscontrolaction = updatepscontrolaction;
	}


	public boolean hasWFDataItems(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_HASWFDATAITEMS);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableColFilter(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLECOLFILTER);
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

	public boolean isEnableGroup(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEGROUP);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnablePagingBar(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEPAGINGBAR);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableRowEdit(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEROWEDIT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableRowEditChangedOnly(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEROWEDITCHANGEDONLY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableRowEditOrder(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEROWEDITORDER);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableRowNew(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEROWNEW);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isForceFit(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISFORCEFIT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isHideHeader(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISHIDEHEADER);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isNoSort(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISNOSORT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isSingleSelect(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSINGLESELECT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
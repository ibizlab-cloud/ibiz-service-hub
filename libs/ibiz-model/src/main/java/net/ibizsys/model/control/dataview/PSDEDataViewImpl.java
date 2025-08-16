package net.ibizsys.model.control.dataview;



public class PSDEDataViewImpl extends net.ibizsys.model.control.PSMDAjaxControlContainerImpl2 implements net.ibizsys.model.control.dataview.IPSDEDataView{

	public final static String ATTR_GETCARDCOLLG = "cardColLG";
	public final static String ATTR_GETCARDCOLMD = "cardColMD";
	public final static String ATTR_GETCARDCOLSM = "cardColSM";
	public final static String ATTR_GETCARDCOLXS = "cardColXS";
	public final static String ATTR_GETCARDHEIGHT = "cardHeight";
	public final static String ATTR_GETCARDWIDTH = "cardWidth";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETEMPTYTEXT = "emptyText";
	public final static String ATTR_GETEMPTYTEXTPSLANGUAGERES = "getEmptyTextPSLanguageRes";
	public final static String ATTR_GETGROUPCOLLG = "groupColLG";
	public final static String ATTR_GETGROUPCOLMD = "groupColMD";
	public final static String ATTR_GETGROUPCOLSM = "groupColSM";
	public final static String ATTR_GETGROUPCOLXS = "groupColXS";
	public final static String ATTR_GETGROUPHEIGHT = "groupHeight";
	public final static String ATTR_GETGROUPLAYOUT = "groupLayout";
	public final static String ATTR_GETGROUPMODE = "groupMode";
	public final static String ATTR_GETGROUPMOVEPSCONTROLACTION = "getGroupMovePSControlAction";
	public final static String ATTR_GETGROUPPSAPPDEFIELD = "getGroupPSAppDEField";
	public final static String ATTR_GETGROUPPSAPPDATAENTITY = "getGroupPSAppDataEntity";
	public final static String ATTR_GETGROUPPSCODELIST = "getGroupPSCodeList";
	public final static String ATTR_GETGROUPPSSYSCSS = "getGroupPSSysCss";
	public final static String ATTR_GETGROUPPSSYSPFPLUGIN = "getGroupPSSysPFPlugin";
	public final static String ATTR_GETGROUPPSUIACTIONGROUP = "getGroupPSUIActionGroup";
	public final static String ATTR_GETGROUPSTYLE = "groupStyle";
	public final static String ATTR_GETGROUPTEXTPSAPPDEFIELD = "getGroupTextPSAppDEField";
	public final static String ATTR_GETGROUPTEXTPSDEFIELD = "getGroupTextPSDEField";
	public final static String ATTR_GETGROUPWIDTH = "groupWidth";
	public final static String ATTR_GETITEMPSLAYOUTPANEL = "getItemPSLayoutPanel";
	public final static String ATTR_GETITEMPSSYSCSS = "getItemPSSysCss";
	public final static String ATTR_GETITEMPSSYSPFPLUGIN = "getItemPSSysPFPlugin";
	public final static String ATTR_GETMINORSORTDIR = "minorSortDir";
	public final static String ATTR_GETMINORSORTPSAPPDEFIELD = "getMinorSortPSAppDEField";
	public final static String ATTR_GETORDERVALUEPSAPPDEFIELD = "getOrderValuePSAppDEField";
	public final static String ATTR_GETPSDEDATAVIEWDATAITEMS = "getPSDEDataViewDataItems";
	public final static String ATTR_GETPSDEDATAVIEWITEMS = "getPSDEDataViewItems";
	public final static String ATTR_GETPAGINGMODE = "pagingMode";
	public final static String ATTR_GETPAGINGSIZE = "pagingSize";
	public final static String ATTR_HASWFDATAITEMS = "hasWFDataItems";
	public final static String ATTR_ISAPPENDDEITEMS = "appendDEItems";
	public final static String ATTR_ISENABLECARDEDIT = "enableCardEdit";
	public final static String ATTR_ISENABLECARDEDITGROUP = "enableCardEditGroup";
	public final static String ATTR_ISENABLECARDEDITORDER = "enableCardEditOrder";
	public final static String ATTR_ISENABLECARDNEW = "enableCardNew";
	public final static String ATTR_ISENABLEGROUP = "enableGroup";
	public final static String ATTR_ISENABLEPAGINGBAR = "enablePagingBar";
	public final static String ATTR_ISNOSORT = "noSort";
	public final static String ATTR_ISSINGLESELECT = "singleSelect";

	public int getCardColLG(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCARDCOLLG);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public int getCardColMD(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCARDCOLMD);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public int getCardColSM(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCARDCOLSM);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public int getCardColXS(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCARDCOLXS);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public int getCardHeight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCARDHEIGHT);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getCardWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCARDWIDTH);
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


	public int getGroupColLG(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPCOLLG);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public int getGroupColMD(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPCOLMD);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public int getGroupColSM(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPCOLSM);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public int getGroupColXS(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPCOLXS);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}

	public int getGroupHeight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPHEIGHT);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getGroupLayout(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPLAYOUT);
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
	private net.ibizsys.model.control.IPSControlAction groupmovepscontrolaction;

	public net.ibizsys.model.control.IPSControlAction getGroupMovePSControlAction(){
		if(this.groupmovepscontrolaction != null) return this.groupmovepscontrolaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPMOVEPSCONTROLACTION);
		if(value == null){
			return null;
		}
		this.groupmovepscontrolaction = this.getPSControlHandlerMust().getPSControlHandlerAction(value, false);
		return this.groupmovepscontrolaction;
	}

	public net.ibizsys.model.control.IPSControlAction getGroupMovePSControlActionMust(){
		net.ibizsys.model.control.IPSControlAction value = this.getGroupMovePSControlAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定分组移动数据行为");}
		return value;
	}

	public void setGroupMovePSControlAction(net.ibizsys.model.control.IPSControlAction groupmovepscontrolaction){
		this.groupmovepscontrolaction = groupmovepscontrolaction;
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

	private net.ibizsys.model.app.dataentity.IPSAppDataEntity grouppsappdataentity;

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getGroupPSAppDataEntity(){
		if(this.grouppsappdataentity != null) return this.grouppsappdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPPSAPPDATAENTITY);
		if(value == null){
			return null;
		}
		this.grouppsappdataentity = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETGROUPPSAPPDATAENTITY);
		return this.grouppsappdataentity;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getGroupPSAppDataEntityMust(){
		net.ibizsys.model.app.dataentity.IPSAppDataEntity value = this.getGroupPSAppDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定分组应用实体对象");}
		return value;
	}

	public void setGroupPSAppDataEntity(net.ibizsys.model.app.dataentity.IPSAppDataEntity grouppsappdataentity){
		this.grouppsappdataentity = grouppsappdataentity;
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

	private net.ibizsys.model.res.IPSSysCss grouppssyscss;

	public net.ibizsys.model.res.IPSSysCss getGroupPSSysCss(){
		if(this.grouppssyscss != null) return this.grouppssyscss;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPPSSYSCSS);
		if(value == null){
			return null;
		}
		this.grouppssyscss = getPSModelObject(net.ibizsys.model.res.IPSSysCss.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETGROUPPSSYSCSS);
		return this.grouppssyscss;
	}

	public net.ibizsys.model.res.IPSSysCss getGroupPSSysCssMust(){
		net.ibizsys.model.res.IPSSysCss value = this.getGroupPSSysCss();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定分组默认界面样式");}
		return value;
	}

	public void setGroupPSSysCss(net.ibizsys.model.res.IPSSysCss grouppssyscss){
		this.grouppssyscss = grouppssyscss;
	}

	private net.ibizsys.model.res.IPSSysPFPlugin grouppssyspfplugin;

	public net.ibizsys.model.res.IPSSysPFPlugin getGroupPSSysPFPlugin(){
		if(this.grouppssyspfplugin != null) return this.grouppssyspfplugin;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPPSSYSPFPLUGIN);
		if(value == null){
			return null;
		}
		this.grouppssyspfplugin = getPSModelObject(net.ibizsys.model.res.IPSSysPFPlugin.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETGROUPPSSYSPFPLUGIN);
		return this.grouppssyspfplugin;
	}

	public net.ibizsys.model.res.IPSSysPFPlugin getGroupPSSysPFPluginMust(){
		net.ibizsys.model.res.IPSSysPFPlugin value = this.getGroupPSSysPFPlugin();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定分组绘制插件");}
		return value;
	}

	public void setGroupPSSysPFPlugin(net.ibizsys.model.res.IPSSysPFPlugin grouppssyspfplugin){
		this.grouppssyspfplugin = grouppssyspfplugin;
	}

	private net.ibizsys.model.view.IPSUIActionGroup grouppsuiactiongroup;

	public net.ibizsys.model.view.IPSUIActionGroup getGroupPSUIActionGroup(){
		if(this.grouppsuiactiongroup != null) return this.grouppsuiactiongroup;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPPSUIACTIONGROUP);
		if(value == null){
			return null;
		}
		this.grouppsuiactiongroup = getPSModelObject(net.ibizsys.model.view.IPSUIActionGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETGROUPPSUIACTIONGROUP);
		return this.grouppsuiactiongroup;
	}

	public net.ibizsys.model.view.IPSUIActionGroup getGroupPSUIActionGroupMust(){
		net.ibizsys.model.view.IPSUIActionGroup value = this.getGroupPSUIActionGroup();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定分组界面行为组");}
		return value;
	}

	public void setGroupPSUIActionGroup(net.ibizsys.model.view.IPSUIActionGroup grouppsuiactiongroup){
		this.grouppsuiactiongroup = grouppsuiactiongroup;
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


	public int getGroupWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPWIDTH);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.control.panel.IPSLayoutPanel itempslayoutpanel;

	public net.ibizsys.model.control.panel.IPSLayoutPanel getItemPSLayoutPanel(){
		if(this.itempslayoutpanel != null) return this.itempslayoutpanel;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMPSLAYOUTPANEL);
		if(value == null){
			return null;
		}
		this.itempslayoutpanel = getPSModelObject(net.ibizsys.model.control.panel.IPSLayoutPanel.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETITEMPSLAYOUTPANEL);
		return this.itempslayoutpanel;
	}

	public net.ibizsys.model.control.panel.IPSLayoutPanel getItemPSLayoutPanelMust(){
		net.ibizsys.model.control.panel.IPSLayoutPanel value = this.getItemPSLayoutPanel();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定项布局面板");}
		return value;
	}

	public void setItemPSLayoutPanel(net.ibizsys.model.control.panel.IPSLayoutPanel itempslayoutpanel){
		this.itempslayoutpanel = itempslayoutpanel;
	}

	private net.ibizsys.model.res.IPSSysCss itempssyscss;

	public net.ibizsys.model.res.IPSSysCss getItemPSSysCss(){
		if(this.itempssyscss != null) return this.itempssyscss;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMPSSYSCSS);
		if(value == null){
			return null;
		}
		this.itempssyscss = getPSModelObject(net.ibizsys.model.res.IPSSysCss.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETITEMPSSYSCSS);
		return this.itempssyscss;
	}

	public net.ibizsys.model.res.IPSSysCss getItemPSSysCssMust(){
		net.ibizsys.model.res.IPSSysCss value = this.getItemPSSysCss();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定项默认界面样式");}
		return value;
	}

	public void setItemPSSysCss(net.ibizsys.model.res.IPSSysCss itempssyscss){
		this.itempssyscss = itempssyscss;
	}

	private net.ibizsys.model.res.IPSSysPFPlugin itempssyspfplugin;

	public net.ibizsys.model.res.IPSSysPFPlugin getItemPSSysPFPlugin(){
		if(this.itempssyspfplugin != null) return this.itempssyspfplugin;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMPSSYSPFPLUGIN);
		if(value == null){
			return null;
		}
		this.itempssyspfplugin = getPSModelObject(net.ibizsys.model.res.IPSSysPFPlugin.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETITEMPSSYSPFPLUGIN);
		return this.itempssyspfplugin;
	}

	public net.ibizsys.model.res.IPSSysPFPlugin getItemPSSysPFPluginMust(){
		net.ibizsys.model.res.IPSSysPFPlugin value = this.getItemPSSysPFPlugin();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定项绘制插件");}
		return value;
	}

	public void setItemPSSysPFPlugin(net.ibizsys.model.res.IPSSysPFPlugin itempssyspfplugin){
		this.itempssyspfplugin = itempssyspfplugin;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定默认排序应用实体属性");}
		return value;
	}

	public void setMinorSortPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField minorsortpsappdefield){
		this.minorsortpsappdefield = minorsortpsappdefield;
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


	private java.util.List<net.ibizsys.model.control.dataview.IPSDEDataViewDataItem> psdedataviewdataitems = null;
	public java.util.List<net.ibizsys.model.control.dataview.IPSDEDataViewDataItem> getPSDEDataViewDataItems(){
		if(this.psdedataviewdataitems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATAVIEWDATAITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.dataview.IPSDEDataViewDataItem> list = new java.util.ArrayList<net.ibizsys.model.control.dataview.IPSDEDataViewDataItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.dataview.IPSDEDataViewDataItem obj = this.getPSModelObject(net.ibizsys.model.control.dataview.IPSDEDataViewDataItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEDATAVIEWDATAITEMS);
				if(obj!=null)list.add(obj);
			}
			this.psdedataviewdataitems = list;
		}
		return (this.psdedataviewdataitems.size() == 0)? null : this.psdedataviewdataitems;
	}

	public net.ibizsys.model.control.dataview.IPSDEDataViewDataItem getPSDEDataViewDataItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.dataview.IPSDEDataViewDataItem.class, this.getPSDEDataViewDataItems(), objKey, bTryMode);
	}
	public void setPSDEDataViewDataItems(java.util.List<net.ibizsys.model.control.dataview.IPSDEDataViewDataItem> list){
		this.psdedataviewdataitems = list;
	}

	private java.util.List<net.ibizsys.model.control.dataview.IPSDEDataViewItem> psdedataviewitems = null;
	public java.util.List<net.ibizsys.model.control.dataview.IPSDEDataViewItem> getPSDEDataViewItems(){
		if(this.psdedataviewitems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATAVIEWITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.dataview.IPSDEDataViewItem> list = new java.util.ArrayList<net.ibizsys.model.control.dataview.IPSDEDataViewItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.dataview.IPSDEDataViewItem obj = this.getPSModelObject(net.ibizsys.model.control.dataview.IPSDEDataViewItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEDATAVIEWITEMS);
				if(obj!=null)list.add(obj);
			}
			this.psdedataviewitems = list;
		}
		return (this.psdedataviewitems.size() == 0)? null : this.psdedataviewitems;
	}

	public net.ibizsys.model.control.dataview.IPSDEDataViewItem getPSDEDataViewItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.dataview.IPSDEDataViewItem.class, this.getPSDEDataViewItems(), objKey, bTryMode);
	}
	public void setPSDEDataViewItems(java.util.List<net.ibizsys.model.control.dataview.IPSDEDataViewItem> list){
		this.psdedataviewitems = list;
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

	public boolean hasWFDataItems(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_HASWFDATAITEMS);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isAppendDEItems(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISAPPENDDEITEMS);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableCardEdit(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLECARDEDIT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableCardEditGroup(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLECARDEDITGROUP);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableCardEditOrder(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLECARDEDITORDER);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableCardNew(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLECARDNEW);
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
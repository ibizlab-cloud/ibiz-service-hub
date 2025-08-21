package net.ibizsys.model.control.list;



public class PSDEListImpl extends net.ibizsys.model.control.list.PSListImpl implements net.ibizsys.model.control.list.IPSDEList{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETEMPTYTEXT = "emptyText";
	public final static String ATTR_GETEMPTYTEXTPSLANGUAGERES = "getEmptyTextPSLanguageRes";
	public final static String ATTR_GETGROUPMODE = "groupMode";
	public final static String ATTR_GETGROUPPSAPPDEFIELD = "getGroupPSAppDEField";
	public final static String ATTR_GETGROUPPSCODELIST = "getGroupPSCodeList";
	public final static String ATTR_GETGROUPPSSYSCSS = "getGroupPSSysCss";
	public final static String ATTR_GETGROUPPSSYSPFPLUGIN = "getGroupPSSysPFPlugin";
	public final static String ATTR_GETGROUPPSUIACTIONGROUP = "getGroupPSUIActionGroup";
	public final static String ATTR_GETGROUPSTYLE = "groupStyle";
	public final static String ATTR_GETGROUPTEXTPSAPPDEFIELD = "getGroupTextPSAppDEField";
	public final static String ATTR_GETGROUPTEXTPSDEFIELD = "getGroupTextPSDEField";
	public final static String ATTR_GETITEMPSLAYOUTPANEL = "getItemPSLayoutPanel";
	public final static String ATTR_GETMINORSORTDIR = "minorSortDir";
	public final static String ATTR_GETMINORSORTPSAPPDEFIELD = "getMinorSortPSAppDEField";
	public final static String ATTR_GETMOBLISTSTYLE = "mobListStyle";
	public final static String ATTR_GETORDERVALUEPSAPPDEFIELD = "getOrderValuePSAppDEField";
	public final static String ATTR_GETPSDELISTDATAITEMS = "getPSDEListDataItems";
	public final static String ATTR_GETPSDELISTITEMS = "getPSDEListItems";
	public final static String ATTR_GETPAGINGMODE = "pagingMode";
	public final static String ATTR_GETPAGINGSIZE = "pagingSize";
	public final static String ATTR_GETSWIMLANEPSAPPDEFIELD = "getSwimlanePSAppDEField";
	public final static String ATTR_GETSWIMLANEPSCODELIST = "getSwimlanePSCodeList";
	public final static String ATTR_HASWFDATAITEMS = "hasWFDataItems";
	public final static String ATTR_ISENABLEGROUP = "enableGroup";
	public final static String ATTR_ISENABLEPAGINGBAR = "enablePagingBar";
	public final static String ATTR_ISENABLEROWEDIT = "enableRowEdit";
	public final static String ATTR_ISENABLEROWEDITGROUP = "enableRowEditGroup";
	public final static String ATTR_ISENABLEROWEDITORDER = "enableRowEditOrder";
	public final static String ATTR_ISENABLEROWNEW = "enableRowNew";
	public final static String ATTR_ISNOSORT = "noSort";
	public final static String ATTR_ISSHOWHEADER = "showHeader";
	public final static String ATTR_ISSINGLESELECT = "singleSelect";

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


	public java.lang.String getMobListStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMOBLISTSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
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


	private java.util.List<net.ibizsys.model.control.list.IPSDEListDataItem> psdelistdataitems = null;
	public java.util.List<net.ibizsys.model.control.list.IPSDEListDataItem> getPSDEListDataItems(){
		if(this.psdelistdataitems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDELISTDATAITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.list.IPSDEListDataItem> list = new java.util.ArrayList<net.ibizsys.model.control.list.IPSDEListDataItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.list.IPSDEListDataItem obj = this.getPSModelObject(net.ibizsys.model.control.list.IPSDEListDataItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDELISTDATAITEMS);
				if(obj!=null)list.add(obj);
			}
			this.psdelistdataitems = list;
		}
		return (this.psdelistdataitems.size() == 0)? null : this.psdelistdataitems;
	}

	public net.ibizsys.model.control.list.IPSDEListDataItem getPSDEListDataItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.list.IPSDEListDataItem.class, this.getPSDEListDataItems(), objKey, bTryMode);
	}
	public void setPSDEListDataItems(java.util.List<net.ibizsys.model.control.list.IPSDEListDataItem> list){
		this.psdelistdataitems = list;
	}

	private java.util.List<net.ibizsys.model.control.list.IPSDEListItem> psdelistitems = null;
	public java.util.List<net.ibizsys.model.control.list.IPSDEListItem> getPSDEListItems(){
		if(this.psdelistitems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDELISTITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.list.IPSDEListItem> list = new java.util.ArrayList<net.ibizsys.model.control.list.IPSDEListItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.list.IPSDEListItem obj = this.getPSModelObject(net.ibizsys.model.control.list.IPSDEListItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDELISTITEMS);
				if(obj!=null)list.add(obj);
			}
			this.psdelistitems = list;
		}
		return (this.psdelistitems.size() == 0)? null : this.psdelistitems;
	}

	public net.ibizsys.model.control.list.IPSDEListItem getPSDEListItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.list.IPSDEListItem.class, this.getPSDEListItems(), objKey, bTryMode);
	}
	public void setPSDEListItems(java.util.List<net.ibizsys.model.control.list.IPSDEListItem> list){
		this.psdelistitems = list;
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
	private net.ibizsys.model.app.dataentity.IPSAppDEField swimlanepsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getSwimlanePSAppDEField(){
		if(this.swimlanepsappdefield != null) return this.swimlanepsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSWIMLANEPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.swimlanepsappdefield = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEField.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETSWIMLANEPSAPPDEFIELD);
		return this.swimlanepsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getSwimlanePSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getSwimlanePSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定泳道应用实体属性");}
		return value;
	}

	public void setSwimlanePSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField swimlanepsappdefield){
		this.swimlanepsappdefield = swimlanepsappdefield;
	}

	private net.ibizsys.model.codelist.IPSCodeList swimlanepscodelist;

	public net.ibizsys.model.codelist.IPSCodeList getSwimlanePSCodeList(){
		if(this.swimlanepscodelist != null) return this.swimlanepscodelist;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSWIMLANEPSCODELIST);
		if(value == null){
			return null;
		}
		this.swimlanepscodelist = getPSModelObject(net.ibizsys.model.codelist.IPSCodeList.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETSWIMLANEPSCODELIST);
		return this.swimlanepscodelist;
	}

	public net.ibizsys.model.codelist.IPSCodeList getSwimlanePSCodeListMust(){
		net.ibizsys.model.codelist.IPSCodeList value = this.getSwimlanePSCodeList();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定泳道代码表");}
		return value;
	}

	public void setSwimlanePSCodeList(net.ibizsys.model.codelist.IPSCodeList swimlanepscodelist){
		this.swimlanepscodelist = swimlanepscodelist;
	}


	public boolean hasWFDataItems(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_HASWFDATAITEMS);
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

	public boolean isEnableRowEditGroup(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEROWEDITGROUP);
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

	public boolean isNoSort(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISNOSORT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isShowHeader(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSHOWHEADER);
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
package net.ibizsys.model.control.calendar;



public class PSSysCalendarImpl extends net.ibizsys.model.control.calendar.PSCalendarImpl implements net.ibizsys.model.control.calendar.IPSSysCalendar{

	public final static String ATTR_GETCALENDARSTYLE = "calendarStyle";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETEMPTYTEXT = "emptyText";
	public final static String ATTR_GETEMPTYTEXTPSLANGUAGERES = "getEmptyTextPSLanguageRes";
	public final static String ATTR_GETGROUPHEIGHT = "groupHeight";
	public final static String ATTR_GETGROUPLAYOUT = "groupLayout";
	public final static String ATTR_GETGROUPMODE = "groupMode";
	public final static String ATTR_GETGROUPPSAPPDEFIELD = "getGroupPSAppDEField";
	public final static String ATTR_GETGROUPPSCODELIST = "getGroupPSCodeList";
	public final static String ATTR_GETGROUPPSSYSCSS = "getGroupPSSysCss";
	public final static String ATTR_GETGROUPPSSYSPFPLUGIN = "getGroupPSSysPFPlugin";
	public final static String ATTR_GETGROUPTEXTPSAPPDEFIELD = "getGroupTextPSAppDEField";
	public final static String ATTR_GETGROUPTEXTPSDEFIELD = "getGroupTextPSDEField";
	public final static String ATTR_GETGROUPWIDTH = "groupWidth";
	public final static String ATTR_GETLEGENDPOS = "legendPos";
	public final static String ATTR_GETPSSYSCALENDARITEMS = "getPSSysCalendarItems";
	public final static String ATTR_HASWFDATAITEMS = "hasWFDataItems";
	public final static String ATTR_ISENABLEEDIT = "enableEdit";
	public final static String ATTR_ISENABLEGROUP = "enableGroup";

	public java.lang.String getCalendarStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCALENDARSTYLE);
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

	public java.lang.String getLegendPos(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLEGENDPOS);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.control.calendar.IPSSysCalendarItem> pssyscalendaritems = null;
	public java.util.List<net.ibizsys.model.control.calendar.IPSSysCalendarItem> getPSSysCalendarItems(){
		if(this.pssyscalendaritems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSCALENDARITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.calendar.IPSSysCalendarItem> list = new java.util.ArrayList<net.ibizsys.model.control.calendar.IPSSysCalendarItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.calendar.IPSSysCalendarItem obj = this.getPSModelObject(net.ibizsys.model.control.calendar.IPSSysCalendarItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSSYSCALENDARITEMS);
				if(obj!=null)list.add(obj);
			}
			this.pssyscalendaritems = list;
		}
		return (this.pssyscalendaritems.size() == 0)? null : this.pssyscalendaritems;
	}

	public net.ibizsys.model.control.calendar.IPSSysCalendarItem getPSSysCalendarItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.calendar.IPSSysCalendarItem.class, this.getPSSysCalendarItems(), objKey, bTryMode);
	}
	public void setPSSysCalendarItems(java.util.List<net.ibizsys.model.control.calendar.IPSSysCalendarItem> list){
		this.pssyscalendaritems = list;
	}

	@Deprecated
	public boolean hasWFDataItems(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_HASWFDATAITEMS);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableEdit(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEEDIT);
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
}
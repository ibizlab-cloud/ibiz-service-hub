package net.ibizsys.model.app;



public class PSApplicationUIImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.app.IPSApplicationUI{

	public final static String ATTR_GETACMINCHARS = "aCMinChars";
	public final static String ATTR_GETBUTTONNOPRIVDISPLAYMODE = "buttonNoPrivDisplayMode";
	public final static String ATTR_GETDEFAULTAPPVIEWPSSYSCSS = "getDefaultAppViewPSSysCss";
	public final static String ATTR_GETDEFAULTCONTROLSTYLE = "defaultControlStyle";
	public final static String ATTR_GETFORMITEMEMPTYTEXT = "formItemEmptyText";
	public final static String ATTR_GETFORMITEMNOPRIVDISPLAYMODE = "formItemNoPrivDisplayMode";
	public final static String ATTR_GETGRIDCOLUMNENABLEFILTER = "gridColumnEnableFilter";
	public final static String ATTR_GETGRIDCOLUMNENABLELINK = "gridColumnEnableLink";
	public final static String ATTR_GETGRIDCOLUMNNOPRIVDISPLAYMODE = "gridColumnNoPrivDisplayMode";
	public final static String ATTR_GETGRIDROWACTIVEMODE = "gridRowActiveMode";
	public final static String ATTR_GETMDCTRLEMPTYTEXT = "mDCtrlEmptyText";
	public final static String ATTR_GETMDCTRLEMPTYTEXTPSLANGUAGERES = "getMDCtrlEmptyTextPSLanguageRes";
	public final static String ATTR_GETMAINMENUALIGN = "mainMenuAlign";
	public final static String ATTR_GETNAME = "name";
	public final static String ATTR_GETPFSTYLE = "pFStyle";
	public final static String ATTR_GETPFTYPE = "pFType";
	public final static String ATTR_GETUISTYLE = "uIStyle";
	public final static String ATTR_ISENABLECOL12TOCOL24 = "enableCol12ToCol24";
	public final static String ATTR_ISENABLEDYNADASHBOARD = "enableDynaDashboard";
	public final static String ATTR_ISENABLEFILTERSTORAGE = "enableFilterStorage";
	public final static String ATTR_ISENABLEUIMODELEX = "enableUIModelEx";
	public final static String ATTR_ISGRIDENABLECUSTOMIZED = "gridEnableCustomized";
	public final static String ATTR_ISGRIDFORCEFIT = "gridForceFit";
	public final static String ATTR_ISOUTPUTFORMITEMUPDATEPRIVTAG = "outputFormItemUpdatePrivTag";

	public int getACMinChars(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACMINCHARS);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getButtonNoPrivDisplayMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBUTTONNOPRIVDISPLAYMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.res.IPSSysCss defaultappviewpssyscss;

	public net.ibizsys.model.res.IPSSysCss getDefaultAppViewPSSysCss(){
		if(this.defaultappviewpssyscss != null) return this.defaultappviewpssyscss;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTAPPVIEWPSSYSCSS);
		if(value == null){
			return null;
		}
		this.defaultappviewpssyscss = getPSModelObject(net.ibizsys.model.res.IPSSysCss.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETDEFAULTAPPVIEWPSSYSCSS);
		return this.defaultappviewpssyscss;
	}

	public net.ibizsys.model.res.IPSSysCss getDefaultAppViewPSSysCssMust(){
		net.ibizsys.model.res.IPSSysCss value = this.getDefaultAppViewPSSysCss();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定默认应用视图界面样式");}
		return value;
	}

	public void setDefaultAppViewPSSysCss(net.ibizsys.model.res.IPSSysCss defaultappviewpssyscss){
		this.defaultappviewpssyscss = defaultappviewpssyscss;
	}


	public java.lang.String getDefaultControlStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTCONTROLSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getFormItemEmptyText(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFORMITEMEMPTYTEXT);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getFormItemNoPrivDisplayMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFORMITEMNOPRIVDISPLAYMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getGridColumnEnableFilter(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGRIDCOLUMNENABLEFILTER);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getGridColumnEnableLink(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGRIDCOLUMNENABLELINK);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getGridColumnNoPrivDisplayMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGRIDCOLUMNNOPRIVDISPLAYMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getGridRowActiveMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGRIDROWACTIVEMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getMDCtrlEmptyText(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMDCTRLEMPTYTEXT);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes mdctrlemptytextpslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getMDCtrlEmptyTextPSLanguageRes(){
		if(this.mdctrlemptytextpslanguageres != null) return this.mdctrlemptytextpslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMDCTRLEMPTYTEXTPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.mdctrlemptytextpslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETMDCTRLEMPTYTEXTPSLANGUAGERES);
		return this.mdctrlemptytextpslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getMDCtrlEmptyTextPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getMDCtrlEmptyTextPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定多数据部件默认无值内容语言资源");}
		return value;
	}

	public void setMDCtrlEmptyTextPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes mdctrlemptytextpslanguageres){
		this.mdctrlemptytextpslanguageres = mdctrlemptytextpslanguageres;
	}


	public java.lang.String getMainMenuAlign(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAINMENUALIGN);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPFStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPFSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPFType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPFTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getUIStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUISTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isEnableCol12ToCol24(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLECOL12TOCOL24);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableDynaDashboard(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEDYNADASHBOARD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableFilterStorage(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEFILTERSTORAGE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableUIModelEx(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEUIMODELEX);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isGridEnableCustomized(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISGRIDENABLECUSTOMIZED);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isGridForceFit(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISGRIDFORCEFIT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isOutputFormItemUpdatePrivTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISOUTPUTFORMITEMUPDATEPRIVTAG);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
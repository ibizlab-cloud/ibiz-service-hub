package net.ibizsys.model.control.dashboard;



public class PSDBPortletPartImpl extends net.ibizsys.model.control.PSAjaxControlContainerImpl implements net.ibizsys.model.control.dashboard.IPSDBPortletPart{

	public final static String ATTR_GETACTIONGROUPEXTRACTMODE = "actionGroupExtractMode";
	public final static String ATTR_GETCONTENTPSCONTROL = "getContentPSControl";
	public final static String ATTR_GETDYNACLASS = "dynaClass";
	public final static String ATTR_GETHEIGHT = "height";
	public final static String ATTR_GETPSLAYOUTPOS = "getPSLayoutPos";
	public final static String ATTR_GETPSSYSIMAGE = "getPSSysImage";
	public final static String ATTR_GETPSSYSUNIRES = "getPSSysUniRes";
	public final static String ATTR_GETPSUIACTIONGROUP = "getPSUIActionGroup";
	public final static String ATTR_GETPORTLETTYPE = "portletType";
	public final static String ATTR_GETTITLE = "title";
	public final static String ATTR_GETTITLEBARCLOSEMODE = "titleBarCloseMode";
	public final static String ATTR_GETTITLEPSLANGUAGERES = "getTitlePSLanguageRes";
	public final static String ATTR_ISENABLEANCHOR = "enableAnchor";
	public final static String ATTR_ISSHOWTITLEBAR = "showTitleBar";

	public java.lang.String getActionGroupExtractMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONGROUPEXTRACTMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.control.IPSControl contentpscontrol;

	public net.ibizsys.model.control.IPSControl getContentPSControl(){
		if(this.contentpscontrol != null) return this.contentpscontrol;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTPSCONTROL);
		if(value == null){
			return null;
		}
		this.contentpscontrol = this.getPSControl(value, false);
		return this.contentpscontrol;
	}

	public net.ibizsys.model.control.IPSControl getContentPSControlMust(){
		net.ibizsys.model.control.IPSControl value = this.getContentPSControl();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定内容部件");}
		return value;
	}


	public java.lang.String getDynaClass(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNACLASS);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public double getHeight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHEIGHT);
		if(value == null){
			return 0.0;
		}
		return value.asDouble();
	}
	private net.ibizsys.model.control.layout.IPSLayoutPos pslayoutpos;

	public net.ibizsys.model.control.layout.IPSLayoutPos getPSLayoutPos(){
		if(this.pslayoutpos != null) return this.pslayoutpos;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSLAYOUTPOS);
		if(value == null){
			return null;
		}
		this.pslayoutpos = getPSModelObject(net.ibizsys.model.control.layout.IPSLayoutPos.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSLAYOUTPOS);
		return this.pslayoutpos;
	}

	public net.ibizsys.model.control.layout.IPSLayoutPos getPSLayoutPosMust(){
		net.ibizsys.model.control.layout.IPSLayoutPos value = this.getPSLayoutPos();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定部件位置");}
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统图片");}
		return value;
	}

	private net.ibizsys.model.security.IPSSysUniRes pssysunires;

	public net.ibizsys.model.security.IPSSysUniRes getPSSysUniRes(){
		if(this.pssysunires != null) return this.pssysunires;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSUNIRES);
		if(value == null){
			return null;
		}
		this.pssysunires = getPSModelObject(net.ibizsys.model.security.IPSSysUniRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSUNIRES);
		return this.pssysunires;
	}

	public net.ibizsys.model.security.IPSSysUniRes getPSSysUniResMust(){
		net.ibizsys.model.security.IPSSysUniRes value = this.getPSSysUniRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统统一资源");}
		return value;
	}

	private net.ibizsys.model.view.IPSUIActionGroup psuiactiongroup;

	public net.ibizsys.model.view.IPSUIActionGroup getPSUIActionGroup(){
		if(this.psuiactiongroup != null) return this.psuiactiongroup;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSUIACTIONGROUP);
		if(value == null){
			return null;
		}
		this.psuiactiongroup = getPSModelObject(net.ibizsys.model.view.IPSUIActionGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSUIACTIONGROUP);
		return this.psuiactiongroup;
	}

	public net.ibizsys.model.view.IPSUIActionGroup getPSUIActionGroupMust(){
		net.ibizsys.model.view.IPSUIActionGroup value = this.getPSUIActionGroup();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定界面行为组对象");}
		return value;
	}


	public java.lang.String getPortletType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPORTLETTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getTitle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTITLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getTitleBarCloseMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTITLEBARCLOSEMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.res.IPSLanguageRes titlepslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getTitlePSLanguageRes(){
		if(this.titlepslanguageres != null) return this.titlepslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTITLEPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.titlepslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETTITLEPSLANGUAGERES);
		return this.titlepslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getTitlePSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getTitlePSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定抬头语言资源");}
		return value;
	}


	public boolean isEnableAnchor(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEANCHOR);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isShowTitleBar(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSHOWTITLEBAR);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
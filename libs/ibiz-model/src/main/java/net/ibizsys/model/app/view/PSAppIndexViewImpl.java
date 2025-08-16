package net.ibizsys.model.app.view;



public class PSAppIndexViewImpl extends net.ibizsys.model.app.view.PSAppViewImpl implements net.ibizsys.model.app.view.IPSAppIndexView{

	public final static String ATTR_GETAPPICONPATH = "appIconPath";
	public final static String ATTR_GETAPPICONPATH2 = "appIconPath2";
	public final static String ATTR_GETAPPSWITCHMODE = "appSwitchMode";
	public final static String ATTR_GETBOTTOMINFO = "bottomInfo";
	public final static String ATTR_GETCAPTION = "caption";
	public final static String ATTR_GETDEFPSAPPVIEW = "getDefPSAppView";
	public final static String ATTR_GETHEADERINFO = "headerInfo";
	public final static String ATTR_GETMAINMENUALIGN = "mainMenuAlign";
	public final static String ATTR_GETPSSYSIMAGE = "getPSSysImage";
	public final static String ATTR_GETPORTALPSAPPCOUNTERREF = "getPortalPSAppCounterRef";
	public final static String ATTR_GETSUBCAPTION = "subCaption";
	public final static String ATTR_GETTITLE = "title";
	public final static String ATTR_ISBLANKMODE = "blankMode";
	public final static String ATTR_ISDEFAULTPAGE = "defaultPage";
	public final static String ATTR_ISENABLEAPPSWITCH = "enableAppSwitch";
	public final static String ATTR_ISENABLEDP = "enableDP";
	public final static String ATTR_ISENABLEWF = "enableWF";

	public java.lang.String getAppIconPath(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAPPICONPATH);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAppIconPath2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAPPICONPATH2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getAppSwitchMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAPPSWITCHMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getBottomInfo(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBOTTOMINFO);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCAPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.view.IPSAppView defpsappview;

	public net.ibizsys.model.app.view.IPSAppView getDefPSAppView(){
		if(this.defpsappview != null) return this.defpsappview;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFPSAPPVIEW);
		if(value == null){
			return null;
		}
		this.defpsappview = getPSModelObject(net.ibizsys.model.app.view.IPSAppView.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETDEFPSAPPVIEW);
		return this.defpsappview;
	}

	public net.ibizsys.model.app.view.IPSAppView getDefPSAppViewMust(){
		net.ibizsys.model.app.view.IPSAppView value = this.getDefPSAppView();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定默认内容视图");}
		return value;
	}

	public void setDefPSAppView(net.ibizsys.model.app.view.IPSAppView defpsappview){
		this.defpsappview = defpsappview;
	}


	public java.lang.String getHeaderInfo(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETHEADERINFO);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMainMenuAlign(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAINMENUALIGN);
		if(value == null){
			return null;
		}
		return value.asText();
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定图标对象");}
		return value;
	}

	public void setPSSysImage(net.ibizsys.model.res.IPSSysImage pssysimage){
		this.pssysimage = pssysimage;
	}

	private net.ibizsys.model.app.control.IPSAppCounterRef portalpsappcounterref;

	public net.ibizsys.model.app.control.IPSAppCounterRef getPortalPSAppCounterRef(){
		if(this.portalpsappcounterref != null) return this.portalpsappcounterref;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPORTALPSAPPCOUNTERREF);
		if(value == null){
			return null;
		}
		this.portalpsappcounterref = getPSModelObject(net.ibizsys.model.app.control.IPSAppCounterRef.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPORTALPSAPPCOUNTERREF);
		return this.portalpsappcounterref;
	}

	public net.ibizsys.model.app.control.IPSAppCounterRef getPortalPSAppCounterRefMust(){
		net.ibizsys.model.app.control.IPSAppCounterRef value = this.getPortalPSAppCounterRef();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定门户应用计数器引用");}
		return value;
	}

	public void setPortalPSAppCounterRef(net.ibizsys.model.app.control.IPSAppCounterRef portalpsappcounterref){
		this.portalpsappcounterref = portalpsappcounterref;
	}


	public java.lang.String getSubCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSUBCAPTION);
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

	public boolean isBlankMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISBLANKMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isDefaultPage(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDEFAULTPAGE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableAppSwitch(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEAPPSWITCH);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableDP(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEDP);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isEnableWF(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEWF);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
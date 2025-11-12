package net.ibizsys.model.control.toolbar;



public class PSDETBUIActionItemImpl extends net.ibizsys.model.control.toolbar.PSDEToolbarItemImpl implements net.ibizsys.model.control.toolbar.IPSDETBUIActionItem
		,net.ibizsys.model.control.toolbar.IPSDECMUIActionItem{

	public final static String ATTR_GETACTIONLEVEL = "actionLevel";
	public final static String ATTR_GETBORDERSTYLE = "borderStyle";
	public final static String ATTR_GETBUTTONSTYLE = "buttonStyle";
	public final static String ATTR_GETCAPPSLANGUAGERES = "getCapPSLanguageRes";
	public final static String ATTR_GETGROUPEXTRACTMODE = "groupExtractMode";
	public final static String ATTR_GETNOPRIVDISPLAYMODE = "noPrivDisplayMode";
	public final static String ATTR_GETPSAPPCOUNTERREF = "getPSAppCounterRef";
	public final static String ATTR_GETPSAPPVIEWUIACTION = "getPSAppViewUIAction";
	public final static String ATTR_GETPSDETOOLBARITEMS = "getPSDEToolbarItems";
	public final static String ATTR_GETPSSYSIMAGE = "getPSSysImage";
	public final static String ATTR_GETPSUIACTION = "getPSUIAction";
	public final static String ATTR_GETTOOLTIP = "tooltip";
	public final static String ATTR_GETTOOLTIPPSLANGUAGERES = "getTooltipPSLanguageRes";
	public final static String ATTR_GETUIACTIONPARAMJO = "uIActionParamJO";
	public final static String ATTR_GETUIACTIONTARGET = "uIActionTarget";
	public final static String ATTR_GETXDATACONTROLNAME = "xDataControlName";
	public final static String ATTR_ISENABLETOGGLEMODE = "enableToggleMode";
	public final static String ATTR_ISHIDDENITEM = "hiddenItem";
	public final static String ATTR_ISSAVETARGETFIRST = "saveTargetFirst";
	public final static String ATTR_ISVALID = "valid";

	public int getActionLevel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONLEVEL);
		if(value == null){
			return 100;
		}
		return value.asInt();
	}

	public java.lang.String getBorderStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBORDERSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getButtonStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBUTTONSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes cappslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageRes(){
		if(this.cappslanguageres != null) return this.cappslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCAPPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.cappslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETCAPPSLANGUAGERES);
		return this.cappslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getCapPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定标题语言资源");}
		return value;
	}

	public void setCapPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes cappslanguageres){
		this.cappslanguageres = cappslanguageres;
	}


	public java.lang.String getGroupExtractMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPEXTRACTMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getNoPrivDisplayMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNOPRIVDISPLAYMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.app.control.IPSAppCounterRef psappcounterref;

	@Deprecated
	public net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRef(){
		if(this.psappcounterref != null) return this.psappcounterref;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPCOUNTERREF);
		if(value == null){
			return null;
		}
		this.psappcounterref = getPSModelObject(net.ibizsys.model.app.control.IPSAppCounterRef.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPCOUNTERREF);
		return this.psappcounterref;
	}

	public net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRefMust(){
		net.ibizsys.model.app.control.IPSAppCounterRef value = this.getPSAppCounterRef();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "[getPSAppCounterRef]返回空值");}
		return value;
	}

	public void setPSAppCounterRef(net.ibizsys.model.app.control.IPSAppCounterRef psappcounterref){
		this.psappcounterref = psappcounterref;
	}

	private net.ibizsys.model.app.view.IPSAppViewUIAction psappviewuiaction;

	public net.ibizsys.model.app.view.IPSAppViewUIAction getPSAppViewUIAction(){
		if(this.psappviewuiaction != null) return this.psappviewuiaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPVIEWUIACTION);
		if(value == null){
			return null;
		}
		this.psappviewuiaction = getPSModelObject(net.ibizsys.model.app.view.IPSAppViewUIAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPVIEWUIACTION);
		return this.psappviewuiaction;
	}

	public net.ibizsys.model.app.view.IPSAppViewUIAction getPSAppViewUIActionMust(){
		net.ibizsys.model.app.view.IPSAppViewUIAction value = this.getPSAppViewUIAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用视图界面行为");}
		return value;
	}

	public void setPSAppViewUIAction(net.ibizsys.model.app.view.IPSAppViewUIAction psappviewuiaction){
		this.psappviewuiaction = psappviewuiaction;
	}


	private java.util.List<net.ibizsys.model.control.toolbar.IPSDEToolbarItem> psdetoolbaritems = null;
	public java.util.List<net.ibizsys.model.control.toolbar.IPSDEToolbarItem> getPSDEToolbarItems(){
		if(this.psdetoolbaritems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDETOOLBARITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.toolbar.IPSDEToolbarItem> list = new java.util.ArrayList<net.ibizsys.model.control.toolbar.IPSDEToolbarItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.toolbar.IPSDEToolbarItem obj = this.getPSModelObject(net.ibizsys.model.control.toolbar.IPSDEToolbarItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDETOOLBARITEMS);
				if(obj!=null)list.add(obj);
			}
			this.psdetoolbaritems = list;
		}
		return (this.psdetoolbaritems.size() == 0)? null : this.psdetoolbaritems;
	}

	public net.ibizsys.model.control.toolbar.IPSDEToolbarItem getPSDEToolbarItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.toolbar.IPSDEToolbarItem.class, this.getPSDEToolbarItems(), objKey, bTryMode);
	}
	public void setPSDEToolbarItems(java.util.List<net.ibizsys.model.control.toolbar.IPSDEToolbarItem> list){
		this.psdetoolbaritems = list;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定图标资源对象");}
		return value;
	}

	public void setPSSysImage(net.ibizsys.model.res.IPSSysImage pssysimage){
		this.pssysimage = pssysimage;
	}

	private net.ibizsys.model.view.IPSUIAction psuiaction;

	public net.ibizsys.model.view.IPSUIAction getPSUIAction(){
		if(this.psuiaction != null) return this.psuiaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSUIACTION);
		if(value == null){
			return null;
		}
		this.psuiaction = getPSModelObject(net.ibizsys.model.view.IPSUIAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSUIACTION);
		return this.psuiaction;
	}

	public net.ibizsys.model.view.IPSUIAction getPSUIActionMust(){
		net.ibizsys.model.view.IPSUIAction value = this.getPSUIAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定界面行为对象");}
		return value;
	}

	public void setPSUIAction(net.ibizsys.model.view.IPSUIAction psuiaction){
		this.psuiaction = psuiaction;
	}


	public java.lang.String getTooltip(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTOOLTIP);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes tooltippslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageRes(){
		if(this.tooltippslanguageres != null) return this.tooltippslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTOOLTIPPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.tooltippslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETTOOLTIPPSLANGUAGERES);
		return this.tooltippslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getTooltipPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getTooltipPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定提示语言资源");}
		return value;
	}

	public void setTooltipPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes tooltippslanguageres){
		this.tooltippslanguageres = tooltippslanguageres;
	}


	@Deprecated
	public com.fasterxml.jackson.databind.node.ObjectNode getUIActionParamJO(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUIACTIONPARAMJO);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getUIActionTarget(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUIACTIONTARGET);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getXDataControlName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETXDATACONTROLNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isEnableToggleMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLETOGGLEMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isHiddenItem(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISHIDDENITEM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	@Deprecated
	public boolean isSaveTargetFirst(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSAVETARGETFIRST);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isValid(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISVALID);
		if(value == null){
			return true;
		}
		return value.asBoolean();
	}
}
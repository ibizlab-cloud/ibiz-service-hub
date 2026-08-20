package net.ibizsys.model.control.menu;



public class PSAppMenuImpl extends net.ibizsys.model.control.PSAjaxControlImpl implements net.ibizsys.model.control.menu.IPSAppMenu{

	public final static String ATTR_GETAPPFUNCTAGPSAPPDEFIELD = "getAppFuncTagPSAppDEField";
	public final static String ATTR_GETAPPMENUSTYLE = "appMenuStyle";
	public final static String ATTR_GETCLSPSAPPDEFIELD = "getClsPSAppDEField";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDYNAMICMODE = "dynamicMode";
	public final static String ATTR_GETENABLESCRIPTPSAPPDEFIELD = "getEnableScriptPSAppDEField";
	public final static String ATTR_GETICONCLSPSAPPDEFIELD = "getIconClsPSAppDEField";
	public final static String ATTR_GETITEMPSAPPDEDATASET = "getItemPSAppDEDataSet";
	public final static String ATTR_GETITEMPSAPPDATAENTITY = "getItemPSAppDataEntity";
	public final static String ATTR_GETLAYOUTMODE = "layoutMode";
	public final static String ATTR_GETPSAPPCOUNTERREF = "getPSAppCounterRef";
	public final static String ATTR_GETPSAPPMENUITEMS = "getPSAppMenuItems";
	public final static String ATTR_GETPSLAYOUT = "getPSLayout";
	public final static String ATTR_GETTEXTPSAPPDEFIELD = "getTextPSAppDEField";
	public final static String ATTR_GETTIPSPSAPPDEFIELD = "getTipsPSAppDEField";
	public final static String ATTR_GETVISIBLESCRIPTPSAPPDEFIELD = "getVisibleScriptPSAppDEField";
	public final static String ATTR_ISENABLECUSTOMIZED = "enableCustomized";
	private net.ibizsys.model.app.dataentity.IPSAppDEField appfunctagpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getAppFuncTagPSAppDEField(){
		if(this.appfunctagpsappdefield != null) return this.appfunctagpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAPPFUNCTAGPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.appfunctagpsappdefield = this.getItemPSAppDataEntityMust().getPSAppDEField(value, false);
		return this.appfunctagpsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getAppFuncTagPSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getAppFuncTagPSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定成员应用功能标记应用实体属性对象");}
		return value;
	}

	public void setAppFuncTagPSAppDEField(net.ibizsys.model.app.dataentity.IPSAppDEField appfunctagpsappdefield){
		this.appfunctagpsappdefield = appfunctagpsappdefield;
	}


	public java.lang.String getAppMenuStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAPPMENUSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.dataentity.IPSAppDEField clspsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getClsPSAppDEField(){
		if(this.clspsappdefield != null) return this.clspsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCLSPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.clspsappdefield = this.getItemPSAppDataEntityMust().getPSAppDEField(value, false);
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


	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
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
		this.enablescriptpsappdefield = this.getItemPSAppDataEntityMust().getPSAppDEField(value, false);
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

	private net.ibizsys.model.app.dataentity.IPSAppDEField iconclspsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getIconClsPSAppDEField(){
		if(this.iconclspsappdefield != null) return this.iconclspsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETICONCLSPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.iconclspsappdefield = this.getItemPSAppDataEntityMust().getPSAppDEField(value, false);
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

	private net.ibizsys.model.app.dataentity.IPSAppDEDataSet itempsappdedataset;

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getItemPSAppDEDataSet(){
		if(this.itempsappdedataset != null) return this.itempsappdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMPSAPPDEDATASET);
		if(value == null){
			return null;
		}
		this.itempsappdedataset = this.getItemPSAppDataEntityMust().getPSAppDEDataSet(value, false);
		return this.itempsappdedataset;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEDataSet getItemPSAppDEDataSetMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEDataSet value = this.getItemPSAppDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定成员数据应用实体数据集对象");}
		return value;
	}

	public void setItemPSAppDEDataSet(net.ibizsys.model.app.dataentity.IPSAppDEDataSet itempsappdedataset){
		this.itempsappdedataset = itempsappdedataset;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDataEntity itempsappdataentity;

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getItemPSAppDataEntity(){
		if(this.itempsappdataentity != null) return this.itempsappdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETITEMPSAPPDATAENTITY);
		if(value == null){
			return null;
		}
		this.itempsappdataentity = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETITEMPSAPPDATAENTITY);
		return this.itempsappdataentity;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDataEntity getItemPSAppDataEntityMust(){
		net.ibizsys.model.app.dataentity.IPSAppDataEntity value = this.getItemPSAppDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定成员数据应用实体对象");}
		return value;
	}

	public void setItemPSAppDataEntity(net.ibizsys.model.app.dataentity.IPSAppDataEntity itempsappdataentity){
		this.itempsappdataentity = itempsappdataentity;
	}


	public java.lang.String getLayoutMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETLAYOUTMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.control.IPSAppCounterRef psappcounterref;

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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用计数器引用");}
		return value;
	}

	public void setPSAppCounterRef(net.ibizsys.model.app.control.IPSAppCounterRef psappcounterref){
		this.psappcounterref = psappcounterref;
	}


	private java.util.List<net.ibizsys.model.control.menu.IPSAppMenuItem> psappmenuitems = null;
	public java.util.List<net.ibizsys.model.control.menu.IPSAppMenuItem> getPSAppMenuItems(){
		if(this.psappmenuitems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPMENUITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.menu.IPSAppMenuItem> list = new java.util.ArrayList<net.ibizsys.model.control.menu.IPSAppMenuItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.menu.IPSAppMenuItem obj = this.getPSModelObject(net.ibizsys.model.control.menu.IPSAppMenuItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPMENUITEMS);
				if(obj!=null)list.add(obj);
			}
			this.psappmenuitems = list;
		}
		return (this.psappmenuitems.size() == 0)? null : this.psappmenuitems;
	}

	public net.ibizsys.model.control.menu.IPSAppMenuItem getPSAppMenuItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.menu.IPSAppMenuItem.class, this.getPSAppMenuItems(), objKey, bTryMode);
	}
	public void setPSAppMenuItems(java.util.List<net.ibizsys.model.control.menu.IPSAppMenuItem> list){
		this.psappmenuitems = list;
	}
	private net.ibizsys.model.control.layout.IPSLayout pslayout;

	public net.ibizsys.model.control.layout.IPSLayout getPSLayout(){
		if(this.pslayout != null) return this.pslayout;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSLAYOUT);
		if(value == null){
			return null;
		}
		this.pslayout = getPSModelObject(net.ibizsys.model.control.layout.IPSLayout.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSLAYOUT);
		return this.pslayout;
	}

	public net.ibizsys.model.control.layout.IPSLayout getPSLayoutMust(){
		net.ibizsys.model.control.layout.IPSLayout value = this.getPSLayout();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定菜单布局对象");}
		return value;
	}

	public void setPSLayout(net.ibizsys.model.control.layout.IPSLayout pslayout){
		this.pslayout = pslayout;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField textpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getTextPSAppDEField(){
		if(this.textpsappdefield != null) return this.textpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEXTPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.textpsappdefield = this.getItemPSAppDataEntityMust().getPSAppDEField(value, false);
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

	private net.ibizsys.model.app.dataentity.IPSAppDEField tipspsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getTipsPSAppDEField(){
		if(this.tipspsappdefield != null) return this.tipspsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTIPSPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.tipspsappdefield = this.getItemPSAppDataEntityMust().getPSAppDEField(value, false);
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

	private net.ibizsys.model.app.dataentity.IPSAppDEField visiblescriptpsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getVisibleScriptPSAppDEField(){
		if(this.visiblescriptpsappdefield != null) return this.visiblescriptpsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVISIBLESCRIPTPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.visiblescriptpsappdefield = this.getItemPSAppDataEntityMust().getPSAppDEField(value, false);
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


	public boolean isEnableCustomized(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLECUSTOMIZED);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
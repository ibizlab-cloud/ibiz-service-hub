package net.ibizsys.model.control.drctrl;



public class PSDEDRCtrlImpl extends net.ibizsys.model.control.PSAjaxControlContainerImpl implements net.ibizsys.model.control.drctrl.IPSDEDRCtrl{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDATARELATIONTAG = "dataRelationTag";
	public final static String ATTR_GETEDITITEMCAPPSLANGUAGERES = "getEditItemCapPSLanguageRes";
	public final static String ATTR_GETEDITITEMCAPTION = "editItemCaption";
	public final static String ATTR_GETEDITITEMPSSYSIMAGE = "getEditItemPSSysImage";
	public final static String ATTR_GETFORMPSAPPVIEW = "getFormPSAppView";
	public final static String ATTR_GETPSAPPCOUNTERREF = "getPSAppCounterRef";
	public final static String ATTR_GETPSAPPVIEWREFS = "getPSAppViewRefs";
	public final static String ATTR_GETPSDEDRCTRLITEMS = "getPSDEDRCtrlItems";
	public final static String ATTR_GETUNIQUETAG = "uniqueTag";
	public final static String ATTR_ISENABLECUSTOMIZED = "enableCustomized";
	public final static String ATTR_ISHIDEEDITITEM = "hideEditItem";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getDataRelationTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATARELATIONTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes edititemcappslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getEditItemCapPSLanguageRes(){
		if(this.edititemcappslanguageres != null) return this.edititemcappslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEDITITEMCAPPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.edititemcappslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETEDITITEMCAPPSLANGUAGERES);
		return this.edititemcappslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getEditItemCapPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getEditItemCapPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定编辑项标题语言资源");}
		return value;
	}

	public void setEditItemCapPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes edititemcappslanguageres){
		this.edititemcappslanguageres = edititemcappslanguageres;
	}


	public java.lang.String getEditItemCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEDITITEMCAPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSSysImage edititempssysimage;

	public net.ibizsys.model.res.IPSSysImage getEditItemPSSysImage(){
		if(this.edititempssysimage != null) return this.edititempssysimage;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEDITITEMPSSYSIMAGE);
		if(value == null){
			return null;
		}
		this.edititempssysimage = getPSModelObject(net.ibizsys.model.res.IPSSysImage.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETEDITITEMPSSYSIMAGE);
		return this.edititempssysimage;
	}

	public net.ibizsys.model.res.IPSSysImage getEditItemPSSysImageMust(){
		net.ibizsys.model.res.IPSSysImage value = this.getEditItemPSSysImage();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定编辑项图标");}
		return value;
	}

	public void setEditItemPSSysImage(net.ibizsys.model.res.IPSSysImage edititempssysimage){
		this.edititempssysimage = edititempssysimage;
	}

	private net.ibizsys.model.app.view.IPSAppView formpsappview;

	public net.ibizsys.model.app.view.IPSAppView getFormPSAppView(){
		if(this.formpsappview != null) return this.formpsappview;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFORMPSAPPVIEW);
		if(value == null){
			return null;
		}
		this.formpsappview = getPSModelObject(net.ibizsys.model.app.view.IPSAppView.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETFORMPSAPPVIEW);
		return this.formpsappview;
	}

	public net.ibizsys.model.app.view.IPSAppView getFormPSAppViewMust(){
		net.ibizsys.model.app.view.IPSAppView value = this.getFormPSAppView();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定表单视图对象");}
		return value;
	}

	public void setFormPSAppView(net.ibizsys.model.app.view.IPSAppView formpsappview){
		this.formpsappview = formpsappview;
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


	private java.util.List<net.ibizsys.model.app.view.IPSAppViewRef> psappviewrefs = null;
	public java.util.List<net.ibizsys.model.app.view.IPSAppViewRef> getPSAppViewRefs(){
		if(this.psappviewrefs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPVIEWREFS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.view.IPSAppViewRef> list = new java.util.ArrayList<net.ibizsys.model.app.view.IPSAppViewRef>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.view.IPSAppViewRef obj = this.getPSModelObject(net.ibizsys.model.app.view.IPSAppViewRef.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPVIEWREFS);
				if(obj!=null)list.add(obj);
			}
			this.psappviewrefs = list;
		}
		return (this.psappviewrefs.size() == 0)? null : this.psappviewrefs;
	}

	public net.ibizsys.model.app.view.IPSAppViewRef getPSAppViewRef(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.view.IPSAppViewRef.class, this.getPSAppViewRefs(), objKey, bTryMode);
	}
	public void setPSAppViewRefs(java.util.List<net.ibizsys.model.app.view.IPSAppViewRef> list){
		this.psappviewrefs = list;
	}

	private java.util.List<net.ibizsys.model.control.drctrl.IPSDEDRCtrlItem> psdedrctrlitems = null;
	public java.util.List<net.ibizsys.model.control.drctrl.IPSDEDRCtrlItem> getPSDEDRCtrlItems(){
		if(this.psdedrctrlitems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDRCTRLITEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.drctrl.IPSDEDRCtrlItem> list = new java.util.ArrayList<net.ibizsys.model.control.drctrl.IPSDEDRCtrlItem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.drctrl.IPSDEDRCtrlItem obj = this.getPSModelObject(net.ibizsys.model.control.drctrl.IPSDEDRCtrlItem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEDRCTRLITEMS);
				if(obj!=null)list.add(obj);
			}
			this.psdedrctrlitems = list;
		}
		return (this.psdedrctrlitems.size() == 0)? null : this.psdedrctrlitems;
	}

	public net.ibizsys.model.control.drctrl.IPSDEDRCtrlItem getPSDEDRCtrlItem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.drctrl.IPSDEDRCtrlItem.class, this.getPSDEDRCtrlItems(), objKey, bTryMode);
	}
	public void setPSDEDRCtrlItems(java.util.List<net.ibizsys.model.control.drctrl.IPSDEDRCtrlItem> list){
		this.psdedrctrlitems = list;
	}

	public java.lang.String getUniqueTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNIQUETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isEnableCustomized(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLECUSTOMIZED);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isHideEditItem(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISHIDEEDITITEM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
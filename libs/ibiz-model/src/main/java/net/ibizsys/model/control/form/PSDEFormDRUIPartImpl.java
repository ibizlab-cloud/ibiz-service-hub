package net.ibizsys.model.control.form;



public class PSDEFormDRUIPartImpl extends net.ibizsys.model.control.form.PSDEFormDetailImpl implements net.ibizsys.model.control.form.IPSDEFormDRUIPart{

	public final static String ATTR_GETDRITEMTAG = "dRItemTag";
	public final static String ATTR_GETMASKINFO = "maskInfo";
	public final static String ATTR_GETMASKMODE = "maskMode";
	public final static String ATTR_GETMASKPSLANGUAGERES = "getMaskPSLanguageRes";
	public final static String ATTR_GETPSAPPVIEW = "getPSAppView";
	public final static String ATTR_GETPSDEFORMITEMUPDATE = "getPSDEFormItemUpdate";
	public final static String ATTR_GETPSNAVIGATECONTEXTS = "getPSNavigateContexts";
	public final static String ATTR_GETPSNAVIGATEPARAMS = "getPSNavigateParams";
	public final static String ATTR_GETPARAMITEM = "paramItem";
	public final static String ATTR_GETPARENTDATAJO = "parentDataJO";
	public final static String ATTR_GETREFRESHITEMS = "refreshItems";
	public final static String ATTR_ISNEEDSAVE = "needSave";
	public final static String ATTR_ISREFRESHITEMSSETPARAMONLY = "refreshItemsSetParamOnly";

	public java.lang.String getDRItemTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDRITEMTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMaskInfo(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMASKINFO);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getMaskMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMASKMODE);
		if(value == null){
			return -1;
		}
		return value.asInt();
	}
	private net.ibizsys.model.res.IPSLanguageRes maskpslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getMaskPSLanguageRes(){
		if(this.maskpslanguageres != null) return this.maskpslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMASKPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.maskpslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETMASKPSLANGUAGERES);
		return this.maskpslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getMaskPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getMaskPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定遮罩信息语言资源");}
		return value;
	}

	public void setMaskPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes maskpslanguageres){
		this.maskpslanguageres = maskpslanguageres;
	}

	private net.ibizsys.model.app.view.IPSAppView psappview;

	public net.ibizsys.model.app.view.IPSAppView getPSAppView(){
		if(this.psappview != null) return this.psappview;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPVIEW);
		if(value == null){
			return null;
		}
		this.psappview = getPSModelObject(net.ibizsys.model.app.view.IPSAppView.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPVIEW);
		return this.psappview;
	}

	public net.ibizsys.model.app.view.IPSAppView getPSAppViewMust(){
		net.ibizsys.model.app.view.IPSAppView value = this.getPSAppView();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定嵌入视图");}
		return value;
	}

	public void setPSAppView(net.ibizsys.model.app.view.IPSAppView psappview){
		this.psappview = psappview;
	}

	private net.ibizsys.model.control.form.IPSDEFormItemUpdate psdeformitemupdate;

	public net.ibizsys.model.control.form.IPSDEFormItemUpdate getPSDEFormItemUpdate(){
		if(this.psdeformitemupdate != null) return this.psdeformitemupdate;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFORMITEMUPDATE);
		if(value == null){
			return null;
		}
		net.ibizsys.model.control.form.IPSDEForm ipsdeform = getParentPSModelObject(net.ibizsys.model.control.form.IPSDEForm.class);
		this.psdeformitemupdate = ipsdeform.getPSDEFormItemUpdate(value, false);
		return this.psdeformitemupdate;
	}

	public net.ibizsys.model.control.form.IPSDEFormItemUpdate getPSDEFormItemUpdateMust(){
		net.ibizsys.model.control.form.IPSDEFormItemUpdate value = this.getPSDEFormItemUpdate();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定调用表单项更新");}
		return value;
	}

	public void setPSDEFormItemUpdate(net.ibizsys.model.control.form.IPSDEFormItemUpdate psdeformitemupdate){
		this.psdeformitemupdate = psdeformitemupdate;
	}


	private java.util.List<net.ibizsys.model.control.IPSNavigateContext> psnavigatecontexts = null;
	public java.util.List<net.ibizsys.model.control.IPSNavigateContext> getPSNavigateContexts(){
		if(this.psnavigatecontexts == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSNAVIGATECONTEXTS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.IPSNavigateContext> list = new java.util.ArrayList<net.ibizsys.model.control.IPSNavigateContext>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.IPSNavigateContext obj = this.getPSModelObject(net.ibizsys.model.control.IPSNavigateContext.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSNAVIGATECONTEXTS);
				if(obj!=null)list.add(obj);
			}
			this.psnavigatecontexts = list;
		}
		return (this.psnavigatecontexts.size() == 0)? null : this.psnavigatecontexts;
	}

	public net.ibizsys.model.control.IPSNavigateContext getPSNavigateContext(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.IPSNavigateContext.class, this.getPSNavigateContexts(), objKey, bTryMode);
	}
	public void setPSNavigateContexts(java.util.List<net.ibizsys.model.control.IPSNavigateContext> list){
		this.psnavigatecontexts = list;
	}

	private java.util.List<net.ibizsys.model.control.IPSNavigateParam> psnavigateparams = null;
	public java.util.List<net.ibizsys.model.control.IPSNavigateParam> getPSNavigateParams(){
		if(this.psnavigateparams == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSNAVIGATEPARAMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.IPSNavigateParam> list = new java.util.ArrayList<net.ibizsys.model.control.IPSNavigateParam>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.IPSNavigateParam obj = this.getPSModelObject(net.ibizsys.model.control.IPSNavigateParam.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSNAVIGATEPARAMS);
				if(obj!=null)list.add(obj);
			}
			this.psnavigateparams = list;
		}
		return (this.psnavigateparams.size() == 0)? null : this.psnavigateparams;
	}

	public net.ibizsys.model.control.IPSNavigateParam getPSNavigateParam(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.IPSNavigateParam.class, this.getPSNavigateParams(), objKey, bTryMode);
	}
	public void setPSNavigateParams(java.util.List<net.ibizsys.model.control.IPSNavigateParam> list){
		this.psnavigateparams = list;
	}

	public java.lang.String getParamItem(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAMITEM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getParentDataJO(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARENTDATAJO);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getRefreshItems(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREFRESHITEMS);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isNeedSave(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISNEEDSAVE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isRefreshItemsSetParamOnly(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISREFRESHITEMSSETPARAMONLY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
package net.ibizsys.model.control.form;



public class PSDEFormButtonImpl extends net.ibizsys.model.control.form.PSDEFormDetailImpl implements net.ibizsys.model.control.form.IPSDEFormButton{

	public final static String ATTR_GETACTIONTYPE = "actionType";
	public final static String ATTR_GETBORDERSTYLE = "borderStyle";
	public final static String ATTR_GETBUTTONSTYLE = "buttonStyle";
	public final static String ATTR_GETCAPTIONITEMNAME = "captionItemName";
	public final static String ATTR_GETICONALIGN = "iconAlign";
	public final static String ATTR_GETINLINEPSUIACTION = "getInlinePSUIAction";
	public final static String ATTR_GETPSAPPCOUNTERREF = "getPSAppCounterRef";
	public final static String ATTR_GETPSAPPVIEWUIACTION = "getPSAppViewUIAction";
	public final static String ATTR_GETPSDEFORMITEMUPDATE = "getPSDEFormItemUpdate";
	public final static String ATTR_GETPSNAVIGATECONTEXTS = "getPSNavigateContexts";
	public final static String ATTR_GETPSNAVIGATEPARAMS = "getPSNavigateParams";
	public final static String ATTR_GETPSUIACTION = "getPSUIAction";
	public final static String ATTR_GETPARAMPICKUPPSAPPVIEW = "getParamPickupPSAppView";
	public final static String ATTR_GETPARAMVIEWPARAMJO = "paramViewParamJO";
	public final static String ATTR_GETTOOLTIP = "tooltip";
	public final static String ATTR_GETUIACTIONPARAMJO = "uIActionParamJO";
	public final static String ATTR_GETUIACTIONTARGET = "uIActionTarget";
	public final static String ATTR_GETXDATACONTROLNAME = "xDataControlName";
	public final static String ATTR_ISSAVETARGETFIRST = "saveTargetFirst";

	public java.lang.String getActionType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIONTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
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
			return "DEFAULT";
		}
		return value.asText();
	}

	public java.lang.String getCaptionItemName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCAPTIONITEMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getIconAlign(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETICONALIGN);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.view.IPSUIAction inlinepsuiaction;

	public net.ibizsys.model.view.IPSUIAction getInlinePSUIAction(){
		if(this.inlinepsuiaction != null) return this.inlinepsuiaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINLINEPSUIACTION);
		if(value == null){
			return null;
		}
		this.inlinepsuiaction = getPSModelObject(net.ibizsys.model.view.IPSUIAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETINLINEPSUIACTION);
		return this.inlinepsuiaction;
	}

	public net.ibizsys.model.view.IPSUIAction getInlinePSUIActionMust(){
		net.ibizsys.model.view.IPSUIAction value = this.getInlinePSUIAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定界面行为（运行时内联）");}
		return value;
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定调用界面行为");}
		return value;
	}

	private net.ibizsys.model.app.view.IPSAppView parampickuppsappview;

	public net.ibizsys.model.app.view.IPSAppView getParamPickupPSAppView(){
		if(this.parampickuppsappview != null) return this.parampickuppsappview;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAMPICKUPPSAPPVIEW);
		if(value == null){
			return null;
		}
		this.parampickuppsappview = getPSModelObject(net.ibizsys.model.app.view.IPSAppView.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPARAMPICKUPPSAPPVIEW);
		return this.parampickuppsappview;
	}

	public net.ibizsys.model.app.view.IPSAppView getParamPickupPSAppViewMust(){
		net.ibizsys.model.app.view.IPSAppView value = this.getParamPickupPSAppView();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定参数选择视图");}
		return value;
	}


	public com.fasterxml.jackson.databind.node.ObjectNode getParamViewParamJO(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARAMVIEWPARAMJO);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getTooltip(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTOOLTIP);
		if(value == null){
			return null;
		}
		return value.asText();
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

	@Deprecated
	public boolean isSaveTargetFirst(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSAVETARGETFIRST);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
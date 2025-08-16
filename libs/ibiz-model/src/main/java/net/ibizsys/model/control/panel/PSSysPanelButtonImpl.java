package net.ibizsys.model.control.panel;



public class PSSysPanelButtonImpl extends net.ibizsys.model.control.panel.PSSysPanelItemImpl implements net.ibizsys.model.control.panel.IPSSysPanelButton{

	public final static String ATTR_GETACTIONTYPE = "actionType";
	public final static String ATTR_GETBORDERSTYLE = "borderStyle";
	public final static String ATTR_GETBUTTONCSSSTYLE = "buttonCssStyle";
	public final static String ATTR_GETBUTTONHEIGHT = "buttonHeight";
	public final static String ATTR_GETBUTTONSTYLE = "buttonStyle";
	public final static String ATTR_GETBUTTONTYPE = "buttonType";
	public final static String ATTR_GETBUTTONWIDTH = "buttonWidth";
	public final static String ATTR_GETCAPTIONITEMNAME = "captionItemName";
	public final static String ATTR_GETCSSSTYLE = "cssStyle";
	public final static String ATTR_GETICONALIGN = "iconAlign";
	public final static String ATTR_GETINLINEPSUIACTION = "getInlinePSUIAction";
	public final static String ATTR_GETPSAPPCOUNTERREF = "getPSAppCounterRef";
	public final static String ATTR_GETPSAPPVIEWUIACTION = "getPSAppViewUIAction";
	public final static String ATTR_GETPSUIACTION = "getPSUIAction";
	public final static String ATTR_GETRENDERMODE = "renderMode";
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

	public java.lang.String getButtonCssStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBUTTONCSSSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public double getButtonHeight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBUTTONHEIGHT);
		if(value == null){
			return 0.0;
		}
		return value.asDouble();
	}

	public java.lang.String getButtonStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBUTTONSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getButtonType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBUTTONTYPE);
		if(value == null){
			return "PANELBUTTON";
		}
		return value.asText();
	}

	public double getButtonWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETBUTTONWIDTH);
		if(value == null){
			return 0.0;
		}
		return value.asDouble();
	}

	public java.lang.String getCaptionItemName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCAPTIONITEMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getCssStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCSSSTYLE);
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


	public java.lang.String getRenderMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETRENDERMODE);
		if(value == null){
			return "BUTTON";
		}
		return value.asText();
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
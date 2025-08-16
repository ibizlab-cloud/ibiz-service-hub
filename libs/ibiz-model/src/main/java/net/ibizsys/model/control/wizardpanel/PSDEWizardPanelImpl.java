package net.ibizsys.model.control.wizardpanel;



public class PSDEWizardPanelImpl extends net.ibizsys.model.control.PSAjaxControlContainerImpl implements net.ibizsys.model.control.wizardpanel.IPSDEWizardPanel{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETFINISHPSCONTROLACTION = "getFinishPSControlAction";
	public final static String ATTR_GETINITPSCONTROLACTION = "getInitPSControlAction";
	public final static String ATTR_GETPSCONTROLS = "getPSControls";
	public final static String ATTR_GETPSDEEDITFORMS = "getPSDEEditForms";
	public final static String ATTR_GETPSDEWIZARD = "getPSDEWizard";
	public final static String ATTR_GETSTATEPSAPPDEFIELD = "getStatePSAppDEField";
	public final static String ATTR_GETWIZARDSTYLE = "wizardStyle";
	public final static String ATTR_ISSHOWACTIONBAR = "showActionBar";
	public final static String ATTR_ISSHOWSTEPBAR = "showStepBar";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.control.IPSControlAction finishpscontrolaction;

	public net.ibizsys.model.control.IPSControlAction getFinishPSControlAction(){
		if(this.finishpscontrolaction != null) return this.finishpscontrolaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFINISHPSCONTROLACTION);
		if(value == null){
			return null;
		}
		this.finishpscontrolaction = this.getPSControlHandlerMust().getPSControlHandlerAction(value, false);
		return this.finishpscontrolaction;
	}

	public net.ibizsys.model.control.IPSControlAction getFinishPSControlActionMust(){
		net.ibizsys.model.control.IPSControlAction value = this.getFinishPSControlAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定完成行为");}
		return value;
	}

	private net.ibizsys.model.control.IPSControlAction initpscontrolaction;

	public net.ibizsys.model.control.IPSControlAction getInitPSControlAction(){
		if(this.initpscontrolaction != null) return this.initpscontrolaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETINITPSCONTROLACTION);
		if(value == null){
			return null;
		}
		this.initpscontrolaction = this.getPSControlHandlerMust().getPSControlHandlerAction(value, false);
		return this.initpscontrolaction;
	}

	public net.ibizsys.model.control.IPSControlAction getInitPSControlActionMust(){
		net.ibizsys.model.control.IPSControlAction value = this.getInitPSControlAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定初始化行为");}
		return value;
	}


	private java.util.List<net.ibizsys.model.control.IPSControl> pscontrols = null;
	public java.util.List<net.ibizsys.model.control.IPSControl> getPSControls(){
		if(this.pscontrols == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCONTROLS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.IPSControl> list = new java.util.ArrayList<net.ibizsys.model.control.IPSControl>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.IPSControl obj = this.getPSModelObject(net.ibizsys.model.control.IPSControl.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCONTROLS);
				if(obj!=null)list.add(obj);
			}
			this.pscontrols = list;
		}
		return (this.pscontrols.size() == 0)? null : this.pscontrols;
	}

	public net.ibizsys.model.control.IPSControl getPSControl(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.IPSControl.class, this.getPSControls(), objKey, bTryMode);
	}
	public void setPSControls(java.util.List<net.ibizsys.model.control.IPSControl> list){
		this.pscontrols = list;
	}

	private java.util.List<net.ibizsys.model.control.form.IPSDEEditForm> psdeeditforms = null;
	public java.util.List<net.ibizsys.model.control.form.IPSDEEditForm> getPSDEEditForms(){
		if(this.psdeeditforms == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEEDITFORMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.form.IPSDEEditForm> list = new java.util.ArrayList<net.ibizsys.model.control.form.IPSDEEditForm>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.form.IPSDEEditForm obj = this.getPSModelObject(net.ibizsys.model.control.form.IPSDEEditForm.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEEDITFORMS);
				if(obj!=null)list.add(obj);
			}
			this.psdeeditforms = list;
		}
		return (this.psdeeditforms.size() == 0)? null : this.psdeeditforms;
	}

	public net.ibizsys.model.control.form.IPSDEEditForm getPSDEEditForm(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.form.IPSDEEditForm.class, this.getPSDEEditForms(), objKey, bTryMode);
	}
	public void setPSDEEditForms(java.util.List<net.ibizsys.model.control.form.IPSDEEditForm> list){
		this.psdeeditforms = list;
	}
	private net.ibizsys.model.dataentity.wizard.IPSDEWizard psdewizard;

	public net.ibizsys.model.dataentity.wizard.IPSDEWizard getPSDEWizard(){
		if(this.psdewizard != null) return this.psdewizard;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEWIZARD);
		if(value == null){
			return null;
		}
		this.psdewizard = getPSModelObject(net.ibizsys.model.dataentity.wizard.IPSDEWizard.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDEWIZARD);
		return this.psdewizard;
	}

	public net.ibizsys.model.dataentity.wizard.IPSDEWizard getPSDEWizardMust(){
		net.ibizsys.model.dataentity.wizard.IPSDEWizard value = this.getPSDEWizard();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体向导对象");}
		return value;
	}

	private net.ibizsys.model.app.dataentity.IPSAppDEField statepsappdefield;

	public net.ibizsys.model.app.dataentity.IPSAppDEField getStatePSAppDEField(){
		if(this.statepsappdefield != null) return this.statepsappdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTATEPSAPPDEFIELD);
		if(value == null){
			return null;
		}
		this.statepsappdefield = getPSModelObject(net.ibizsys.model.app.dataentity.IPSAppDEField.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETSTATEPSAPPDEFIELD);
		return this.statepsappdefield;
	}

	public net.ibizsys.model.app.dataentity.IPSAppDEField getStatePSAppDEFieldMust(){
		net.ibizsys.model.app.dataentity.IPSAppDEField value = this.getStatePSAppDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定状态应用实体属性");}
		return value;
	}


	public java.lang.String getWizardStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWIZARDSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isShowActionBar(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSHOWACTIONBAR);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isShowStepBar(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSHOWSTEPBAR);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
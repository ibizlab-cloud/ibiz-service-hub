package net.ibizsys.model.control.form;



public class PSDEEditFormImpl extends net.ibizsys.model.control.form.PSDEFormImpl implements net.ibizsys.model.control.form.IPSDEEditForm
		,net.ibizsys.model.control.form.IPSDEWizardEditForm
		,net.ibizsys.model.control.form.IPSWFEditForm{

	public final static String ATTR_GETACTIVEDATAFIELD = "activeDataField";
	public final static String ATTR_GETAUTOSAVEMODE = "autoSaveMode";
	public final static String ATTR_GETCREATEPSCONTROLACTION = "getCreatePSControlAction";
	public final static String ATTR_GETDATATYPE = "dataType";
	public final static String ATTR_GETGETDRAFTFROMPSCONTROLACTION = "getGetDraftFromPSControlAction";
	public final static String ATTR_GETGETDRAFTPSCONTROLACTION = "getGetDraftPSControlAction";
	public final static String ATTR_GETGETPSCONTROLACTION = "getGetPSControlAction";
	public final static String ATTR_GETGOBACKPSCONTROLACTION = "getGoBackPSControlAction";
	public final static String ATTR_GETNAVBARPSSYSCSS = "getNavBarPSSysCss";
	public final static String ATTR_GETNAVBARPOS = "navBarPos";
	public final static String ATTR_GETNAVBARSTYLE = "navBarStyle";
	public final static String ATTR_GETNAVBARWIDTH = "navBarWidth";
	public final static String ATTR_GETNAVBARHEIGHT = "navbarHeight";
	public final static String ATTR_GETPSAPPCOUNTERREF = "getPSAppCounterRef";
	public final static String ATTR_GETPSCONTROLNAVCONTEXTS = "getPSControlNavContexts";
	public final static String ATTR_GETPSCONTROLNAVPARAMS = "getPSControlNavParams";
	public final static String ATTR_GETPSDEWIZARDFORM = "getPSDEWizardForm";
	public final static String ATTR_GETREMOVEPSCONTROLACTION = "getRemovePSControlAction";
	public final static String ATTR_GETUPDATEPSCONTROLACTION = "getUpdatePSControlAction";
	public final static String ATTR_GETWFSTARTPSCONTROLACTION = "getWFStartPSControlAction";
	public final static String ATTR_GETWFSUBMITPSCONTROLACTION = "getWFSubmitPSControlAction";
	public final static String ATTR_ISACTIVEDATAMODE = "activeDataMode";
	public final static String ATTR_ISENABLEAUTOSAVE = "enableAutoSave";
	public final static String ATTR_ISENABLECUSTOMIZED = "enableCustomized";
	public final static String ATTR_ISINFOFORMMODE = "infoFormMode";
	public final static String ATTR_ISREADONLY = "readOnly";
	public final static String ATTR_ISSHOWFORMNAVBAR = "showFormNavBar";

	public java.lang.String getActiveDataField(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETACTIVEDATAFIELD);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getAutoSaveMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAUTOSAVEMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}
	private net.ibizsys.model.control.IPSControlAction createpscontrolaction;

	public net.ibizsys.model.control.IPSControlAction getCreatePSControlAction(){
		if(this.createpscontrolaction != null) return this.createpscontrolaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCREATEPSCONTROLACTION);
		if(value == null){
			return null;
		}
		this.createpscontrolaction = this.getPSControlHandlerMust().getPSControlHandlerAction(value, false);
		return this.createpscontrolaction;
	}

	public net.ibizsys.model.control.IPSControlAction getCreatePSControlActionMust(){
		net.ibizsys.model.control.IPSControlAction value = this.getCreatePSControlAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定建立数据行为");}
		return value;
	}


	public java.lang.String getDataType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDATATYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.control.IPSControlAction getdraftfrompscontrolaction;

	public net.ibizsys.model.control.IPSControlAction getGetDraftFromPSControlAction(){
		if(this.getdraftfrompscontrolaction != null) return this.getdraftfrompscontrolaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGETDRAFTFROMPSCONTROLACTION);
		if(value == null){
			return null;
		}
		this.getdraftfrompscontrolaction = this.getPSControlHandlerMust().getPSControlHandlerAction(value, false);
		return this.getdraftfrompscontrolaction;
	}

	public net.ibizsys.model.control.IPSControlAction getGetDraftFromPSControlActionMust(){
		net.ibizsys.model.control.IPSControlAction value = this.getGetDraftFromPSControlAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定获取草稿数据行为（拷贝）");}
		return value;
	}

	private net.ibizsys.model.control.IPSControlAction getdraftpscontrolaction;

	public net.ibizsys.model.control.IPSControlAction getGetDraftPSControlAction(){
		if(this.getdraftpscontrolaction != null) return this.getdraftpscontrolaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGETDRAFTPSCONTROLACTION);
		if(value == null){
			return null;
		}
		this.getdraftpscontrolaction = this.getPSControlHandlerMust().getPSControlHandlerAction(value, false);
		return this.getdraftpscontrolaction;
	}

	public net.ibizsys.model.control.IPSControlAction getGetDraftPSControlActionMust(){
		net.ibizsys.model.control.IPSControlAction value = this.getGetDraftPSControlAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定获取草稿数据行为");}
		return value;
	}

	private net.ibizsys.model.control.IPSControlAction getpscontrolaction;

	public net.ibizsys.model.control.IPSControlAction getGetPSControlAction(){
		if(this.getpscontrolaction != null) return this.getpscontrolaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGETPSCONTROLACTION);
		if(value == null){
			return null;
		}
		this.getpscontrolaction = this.getPSControlHandlerMust().getPSControlHandlerAction(value, false);
		return this.getpscontrolaction;
	}

	public net.ibizsys.model.control.IPSControlAction getGetPSControlActionMust(){
		net.ibizsys.model.control.IPSControlAction value = this.getGetPSControlAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定获取数据行为");}
		return value;
	}

	private net.ibizsys.model.control.IPSControlAction gobackpscontrolaction;

	public net.ibizsys.model.control.IPSControlAction getGoBackPSControlAction(){
		if(this.gobackpscontrolaction != null) return this.gobackpscontrolaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGOBACKPSCONTROLACTION);
		if(value == null){
			return null;
		}
		this.gobackpscontrolaction = this.getPSControlHandlerMust().getPSControlHandlerAction(value, false);
		return this.gobackpscontrolaction;
	}

	public net.ibizsys.model.control.IPSControlAction getGoBackPSControlActionMust(){
		net.ibizsys.model.control.IPSControlAction value = this.getGoBackPSControlAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定回退数据行为");}
		return value;
	}

	private net.ibizsys.model.res.IPSSysCss navbarpssyscss;

	public net.ibizsys.model.res.IPSSysCss getNavBarPSSysCss(){
		if(this.navbarpssyscss != null) return this.navbarpssyscss;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAVBARPSSYSCSS);
		if(value == null){
			return null;
		}
		this.navbarpssyscss = getPSModelObject(net.ibizsys.model.res.IPSSysCss.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETNAVBARPSSYSCSS);
		return this.navbarpssyscss;
	}

	public net.ibizsys.model.res.IPSSysCss getNavBarPSSysCssMust(){
		net.ibizsys.model.res.IPSSysCss value = this.getNavBarPSSysCss();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定导航栏样式表");}
		return value;
	}


	public java.lang.String getNavBarPos(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAVBARPOS);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getNavBarStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAVBARSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public double getNavBarWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAVBARWIDTH);
		if(value == null){
			return 0.0;
		}
		return value.asDouble();
	}

	public double getNavbarHeight(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAVBARHEIGHT);
		if(value == null){
			return 0.0;
		}
		return value.asDouble();
	}
	private net.ibizsys.model.app.control.IPSAppCounterRef psappcounterref;

	public net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRef(){
		if(this.psappcounterref != null) return this.psappcounterref;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPCOUNTERREF);
		if(value == null){
			return null;
		}
		this.psappcounterref = this.getPSAppCounterRef(value, false);
		return this.psappcounterref;
	}

	public net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRefMust(){
		net.ibizsys.model.app.control.IPSAppCounterRef value = this.getPSAppCounterRef();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用计数器引用");}
		return value;
	}


	private java.util.List<net.ibizsys.model.control.IPSControlNavContext> pscontrolnavcontexts = null;
	public java.util.List<net.ibizsys.model.control.IPSControlNavContext> getPSControlNavContexts(){
		if(this.pscontrolnavcontexts == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCONTROLNAVCONTEXTS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.IPSControlNavContext> list = new java.util.ArrayList<net.ibizsys.model.control.IPSControlNavContext>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.IPSControlNavContext obj = this.getPSModelObject(net.ibizsys.model.control.IPSControlNavContext.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCONTROLNAVCONTEXTS);
				if(obj!=null)list.add(obj);
			}
			this.pscontrolnavcontexts = list;
		}
		return (this.pscontrolnavcontexts.size() == 0)? null : this.pscontrolnavcontexts;
	}

	public net.ibizsys.model.control.IPSControlNavContext getPSControlNavContext(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.IPSControlNavContext.class, this.getPSControlNavContexts(), objKey, bTryMode);
	}
	public void setPSControlNavContexts(java.util.List<net.ibizsys.model.control.IPSControlNavContext> list){
		this.pscontrolnavcontexts = list;
	}

	private java.util.List<net.ibizsys.model.control.IPSControlNavParam> pscontrolnavparams = null;
	public java.util.List<net.ibizsys.model.control.IPSControlNavParam> getPSControlNavParams(){
		if(this.pscontrolnavparams == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCONTROLNAVPARAMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.IPSControlNavParam> list = new java.util.ArrayList<net.ibizsys.model.control.IPSControlNavParam>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.IPSControlNavParam obj = this.getPSModelObject(net.ibizsys.model.control.IPSControlNavParam.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCONTROLNAVPARAMS);
				if(obj!=null)list.add(obj);
			}
			this.pscontrolnavparams = list;
		}
		return (this.pscontrolnavparams.size() == 0)? null : this.pscontrolnavparams;
	}

	public net.ibizsys.model.control.IPSControlNavParam getPSControlNavParam(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.IPSControlNavParam.class, this.getPSControlNavParams(), objKey, bTryMode);
	}
	public void setPSControlNavParams(java.util.List<net.ibizsys.model.control.IPSControlNavParam> list){
		this.pscontrolnavparams = list;
	}
	private net.ibizsys.model.dataentity.wizard.IPSDEWizardForm psdewizardform;

	public net.ibizsys.model.dataentity.wizard.IPSDEWizardForm getPSDEWizardForm(){
		if(this.psdewizardform != null) return this.psdewizardform;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEWIZARDFORM);
		if(value == null){
			return null;
		}
		this.psdewizardform = getPSModelObject(net.ibizsys.model.dataentity.wizard.IPSDEWizardForm.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDEWIZARDFORM);
		return this.psdewizardform;
	}

	public net.ibizsys.model.dataentity.wizard.IPSDEWizardForm getPSDEWizardFormMust(){
		net.ibizsys.model.dataentity.wizard.IPSDEWizardForm value = this.getPSDEWizardForm();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体向导表单对象");}
		return value;
	}

	private net.ibizsys.model.control.IPSControlAction removepscontrolaction;

	public net.ibizsys.model.control.IPSControlAction getRemovePSControlAction(){
		if(this.removepscontrolaction != null) return this.removepscontrolaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETREMOVEPSCONTROLACTION);
		if(value == null){
			return null;
		}
		this.removepscontrolaction = this.getPSControlHandlerMust().getPSControlHandlerAction(value, false);
		return this.removepscontrolaction;
	}

	public net.ibizsys.model.control.IPSControlAction getRemovePSControlActionMust(){
		net.ibizsys.model.control.IPSControlAction value = this.getRemovePSControlAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定删除数据行为");}
		return value;
	}

	private net.ibizsys.model.control.IPSControlAction updatepscontrolaction;

	public net.ibizsys.model.control.IPSControlAction getUpdatePSControlAction(){
		if(this.updatepscontrolaction != null) return this.updatepscontrolaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUPDATEPSCONTROLACTION);
		if(value == null){
			return null;
		}
		this.updatepscontrolaction = this.getPSControlHandlerMust().getPSControlHandlerAction(value, false);
		return this.updatepscontrolaction;
	}

	public net.ibizsys.model.control.IPSControlAction getUpdatePSControlActionMust(){
		net.ibizsys.model.control.IPSControlAction value = this.getUpdatePSControlAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定更新数据行为");}
		return value;
	}

	private net.ibizsys.model.control.IPSControlAction wfstartpscontrolaction;

	public net.ibizsys.model.control.IPSControlAction getWFStartPSControlAction(){
		if(this.wfstartpscontrolaction != null) return this.wfstartpscontrolaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFSTARTPSCONTROLACTION);
		if(value == null){
			return null;
		}
		this.wfstartpscontrolaction = this.getPSControlHandlerMust().getPSControlHandlerAction(value, false);
		return this.wfstartpscontrolaction;
	}

	public net.ibizsys.model.control.IPSControlAction getWFStartPSControlActionMust(){
		net.ibizsys.model.control.IPSControlAction value = this.getWFStartPSControlAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定流程启动行为");}
		return value;
	}

	private net.ibizsys.model.control.IPSControlAction wfsubmitpscontrolaction;

	public net.ibizsys.model.control.IPSControlAction getWFSubmitPSControlAction(){
		if(this.wfsubmitpscontrolaction != null) return this.wfsubmitpscontrolaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWFSUBMITPSCONTROLACTION);
		if(value == null){
			return null;
		}
		this.wfsubmitpscontrolaction = this.getPSControlHandlerMust().getPSControlHandlerAction(value, false);
		return this.wfsubmitpscontrolaction;
	}

	public net.ibizsys.model.control.IPSControlAction getWFSubmitPSControlActionMust(){
		net.ibizsys.model.control.IPSControlAction value = this.getWFSubmitPSControlAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定流程提交行为");}
		return value;
	}


	public boolean isActiveDataMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISACTIVEDATAMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableAutoSave(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEAUTOSAVE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableCustomized(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLECUSTOMIZED);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isInfoFormMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISINFOFORMMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isReadOnly(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISREADONLY);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isShowFormNavBar(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSHOWFORMNAVBAR);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
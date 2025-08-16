package net.ibizsys.model.dataentity.wizard;



public class PSDEWizardImpl extends net.ibizsys.model.dataentity.PSDataEntityObjectImpl implements net.ibizsys.model.dataentity.wizard.IPSDEWizard
		,net.ibizsys.model.IPSModelSortable{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETFINISHCAPLANRESTAG = "finishCapLanResTag";
	public final static String ATTR_GETFINISHCAPPSLANGUAGERES = "getFinishCapPSLanguageRes";
	public final static String ATTR_GETFINISHCAPTION = "finishCaption";
	public final static String ATTR_GETFIRSTPSDEWIZARDFORM = "getFirstPSDEWizardForm";
	public final static String ATTR_GETNEXTCAPLANRESTAG = "nextCapLanResTag";
	public final static String ATTR_GETNEXTCAPPSLANGUAGERES = "getNextCapPSLanguageRes";
	public final static String ATTR_GETNEXTCAPTION = "nextCaption";
	public final static String ATTR_GETORDERVALUE = "orderValue";
	public final static String ATTR_GETPSDEWIZARDFORMS = "getPSDEWizardForms";
	public final static String ATTR_GETPSDEWIZARDSTEPS = "getPSDEWizardSteps";
	public final static String ATTR_GETPREVCAPLANRESTAG = "prevCapLanResTag";
	public final static String ATTR_GETPREVCAPPSLANGUAGERES = "getPrevCapPSLanguageRes";
	public final static String ATTR_GETPREVCAPTION = "prevCaption";
	public final static String ATTR_GETWIZARDSTYLE = "wizardStyle";
	public final static String ATTR_ISENABLEMAINSTATELOGIC = "enableMainStateLogic";
	public final static String ATTR_ISSTATEWIZARD = "stateWizard";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getFinishCapLanResTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFINISHCAPLANRESTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes finishcappslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getFinishCapPSLanguageRes(){
		if(this.finishcappslanguageres != null) return this.finishcappslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFINISHCAPPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.finishcappslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETFINISHCAPPSLANGUAGERES);
		return this.finishcappslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getFinishCapPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getFinishCapPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定完成标题语言资源");}
		return value;
	}

	public void setFinishCapPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes finishcappslanguageres){
		this.finishcappslanguageres = finishcappslanguageres;
	}


	public java.lang.String getFinishCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFINISHCAPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.wizard.IPSDEWizardForm firstpsdewizardform;

	public net.ibizsys.model.dataentity.wizard.IPSDEWizardForm getFirstPSDEWizardForm(){
		if(this.firstpsdewizardform != null) return this.firstpsdewizardform;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFIRSTPSDEWIZARDFORM);
		if(value == null){
			return null;
		}
		this.firstpsdewizardform = this.getPSDEWizardForm(value, false);
		return this.firstpsdewizardform;
	}

	public net.ibizsys.model.dataentity.wizard.IPSDEWizardForm getFirstPSDEWizardFormMust(){
		net.ibizsys.model.dataentity.wizard.IPSDEWizardForm value = this.getFirstPSDEWizardForm();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定首向导表单");}
		return value;
	}

	public void setFirstPSDEWizardForm(net.ibizsys.model.dataentity.wizard.IPSDEWizardForm firstpsdewizardform){
		this.firstpsdewizardform = firstpsdewizardform;
	}


	public java.lang.String getNextCapLanResTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNEXTCAPLANRESTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes nextcappslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getNextCapPSLanguageRes(){
		if(this.nextcappslanguageres != null) return this.nextcappslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNEXTCAPPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.nextcappslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETNEXTCAPPSLANGUAGERES);
		return this.nextcappslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getNextCapPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getNextCapPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定下一步标题语言资源");}
		return value;
	}

	public void setNextCapPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes nextcappslanguageres){
		this.nextcappslanguageres = nextcappslanguageres;
	}


	public java.lang.String getNextCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNEXTCAPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public int getOrderValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETORDERVALUE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	private java.util.List<net.ibizsys.model.dataentity.wizard.IPSDEWizardForm> psdewizardforms = null;
	public java.util.List<net.ibizsys.model.dataentity.wizard.IPSDEWizardForm> getPSDEWizardForms(){
		if(this.psdewizardforms == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEWIZARDFORMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.wizard.IPSDEWizardForm> list = new java.util.ArrayList<net.ibizsys.model.dataentity.wizard.IPSDEWizardForm>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.wizard.IPSDEWizardForm obj = this.getPSModelObject(net.ibizsys.model.dataentity.wizard.IPSDEWizardForm.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEWIZARDFORMS);
				if(obj!=null)list.add(obj);
			}
			this.psdewizardforms = list;
		}
		return (this.psdewizardforms.size() == 0)? null : this.psdewizardforms;
	}

	public net.ibizsys.model.dataentity.wizard.IPSDEWizardForm getPSDEWizardForm(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.wizard.IPSDEWizardForm.class, this.getPSDEWizardForms(), objKey, bTryMode);
	}
	public void setPSDEWizardForms(java.util.List<net.ibizsys.model.dataentity.wizard.IPSDEWizardForm> list){
		this.psdewizardforms = list;
	}

	private java.util.List<net.ibizsys.model.dataentity.wizard.IPSDEWizardStep> psdewizardsteps = null;
	public java.util.List<net.ibizsys.model.dataentity.wizard.IPSDEWizardStep> getPSDEWizardSteps(){
		if(this.psdewizardsteps == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEWIZARDSTEPS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.dataentity.wizard.IPSDEWizardStep> list = new java.util.ArrayList<net.ibizsys.model.dataentity.wizard.IPSDEWizardStep>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.dataentity.wizard.IPSDEWizardStep obj = this.getPSModelObject(net.ibizsys.model.dataentity.wizard.IPSDEWizardStep.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSDEWIZARDSTEPS);
				if(obj!=null)list.add(obj);
			}
			this.psdewizardsteps = list;
		}
		return (this.psdewizardsteps.size() == 0)? null : this.psdewizardsteps;
	}

	public net.ibizsys.model.dataentity.wizard.IPSDEWizardStep getPSDEWizardStep(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.dataentity.wizard.IPSDEWizardStep.class, this.getPSDEWizardSteps(), objKey, bTryMode);
	}
	public void setPSDEWizardSteps(java.util.List<net.ibizsys.model.dataentity.wizard.IPSDEWizardStep> list){
		this.psdewizardsteps = list;
	}

	public java.lang.String getPrevCapLanResTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPREVCAPLANRESTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes prevcappslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getPrevCapPSLanguageRes(){
		if(this.prevcappslanguageres != null) return this.prevcappslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPREVCAPPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.prevcappslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPREVCAPPSLANGUAGERES);
		return this.prevcappslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getPrevCapPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getPrevCapPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定上一步标题语言资源");}
		return value;
	}

	public void setPrevCapPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes prevcappslanguageres){
		this.prevcappslanguageres = prevcappslanguageres;
	}


	public java.lang.String getPrevCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPREVCAPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getWizardStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWIZARDSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isEnableMainStateLogic(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEMAINSTATELOGIC);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isStateWizard(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSTATEWIZARD);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
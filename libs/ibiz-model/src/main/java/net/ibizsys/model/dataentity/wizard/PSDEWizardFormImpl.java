package net.ibizsys.model.dataentity.wizard;



public class PSDEWizardFormImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.wizard.IPSDEWizardForm{

	public final static String ATTR_GETCM2PSLANGUAGERES = "getCM2PSLanguageRes";
	public final static String ATTR_GETCMPSLANGUAGERES = "getCMPSLanguageRes";
	public final static String ATTR_GETCONFIRMMSG = "confirmMsg";
	public final static String ATTR_GETCONFIRMMSG2 = "confirmMsg2";
	public final static String ATTR_GETFORMTAG = "formTag";
	public final static String ATTR_GETGOFINISHENABLESCRIPTCODE = "goFinishEnableScriptCode";
	public final static String ATTR_GETGONEXTENABLESCRIPTCODE = "goNextEnableScriptCode";
	public final static String ATTR_GETGOPREVENABLESCRIPTCODE = "goPrevEnableScriptCode";
	public final static String ATTR_GETPSDEFORMNAME = "getPSDEFormName";
	public final static String ATTR_GETPSDEWIZARDSTEP = "getPSDEWizardStep";
	public final static String ATTR_GETSTEPACTIONS = "stepActions";
	public final static String ATTR_GETSTEPTAG = "stepTag";
	public final static String ATTR_ISFIRSTFORM = "firstForm";
	private net.ibizsys.model.res.IPSLanguageRes cm2pslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getCM2PSLanguageRes(){
		if(this.cm2pslanguageres != null) return this.cm2pslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCM2PSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.cm2pslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETCM2PSLANGUAGERES);
		return this.cm2pslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getCM2PSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getCM2PSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定下一步确认信息2语言资源");}
		return value;
	}

	public void setCM2PSLanguageRes(net.ibizsys.model.res.IPSLanguageRes cm2pslanguageres){
		this.cm2pslanguageres = cm2pslanguageres;
	}

	private net.ibizsys.model.res.IPSLanguageRes cmpslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getCMPSLanguageRes(){
		if(this.cmpslanguageres != null) return this.cmpslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCMPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.cmpslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETCMPSLANGUAGERES);
		return this.cmpslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getCMPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getCMPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定下一步确认信息语言资源");}
		return value;
	}

	public void setCMPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes cmpslanguageres){
		this.cmpslanguageres = cmpslanguageres;
	}


	public java.lang.String getConfirmMsg(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONFIRMMSG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getConfirmMsg2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONFIRMMSG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getFormTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETFORMTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getGoFinishEnableScriptCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGOFINISHENABLESCRIPTCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getGoNextEnableScriptCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGONEXTENABLESCRIPTCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getGoPrevEnableScriptCode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGOPREVENABLESCRIPTCODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPSDEFormName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEFORMNAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.wizard.IPSDEWizardStep psdewizardstep;

	public net.ibizsys.model.dataentity.wizard.IPSDEWizardStep getPSDEWizardStep(){
		if(this.psdewizardstep != null) return this.psdewizardstep;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEWIZARDSTEP);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.wizard.IPSDEWizard ipsdewizard = getParentPSModelObject(net.ibizsys.model.dataentity.wizard.IPSDEWizard.class);
		this.psdewizardstep = ipsdewizard.getPSDEWizardStep(value, false);
		return this.psdewizardstep;
	}

	public net.ibizsys.model.dataentity.wizard.IPSDEWizardStep getPSDEWizardStepMust(){
		net.ibizsys.model.dataentity.wizard.IPSDEWizardStep value = this.getPSDEWizardStep();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定向导步骤对象");}
		return value;
	}

	public void setPSDEWizardStep(net.ibizsys.model.dataentity.wizard.IPSDEWizardStep psdewizardstep){
		this.psdewizardstep = psdewizardstep;
	}

	private java.lang.String[] stepactions = null;
	public java.lang.String[] getStepActions(){
		if(this.stepactions == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTEPACTIONS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.lang.String[] array = new java.lang.String[arrayNode.size()];
			for(int i = 0;i<arrayNode.size();i++) {
				array[i] = arrayNode.get(i).asText();
			}
			this.stepactions = array;
		}
		return this.stepactions;
	}

	public java.lang.String getStepTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTEPTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isFirstForm(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISFIRSTFORM);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
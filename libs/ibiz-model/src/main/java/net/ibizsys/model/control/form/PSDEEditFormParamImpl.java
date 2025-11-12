package net.ibizsys.model.control.form;



public class PSDEEditFormParamImpl extends net.ibizsys.model.control.form.PSDEFormParamImpl implements net.ibizsys.model.control.form.IPSDEEditFormParam
		,net.ibizsys.model.control.form.IPSDEWizardEditFormParam{

	public final static String ATTR_GETPSDEWIZARDFORM = "getPSDEWizardForm";
	public final static String ATTR_ISENABLEAUTOSAVE = "enableAutoSave";
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
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定向导表单");}
		return value;
	}

	public void setPSDEWizardForm(net.ibizsys.model.dataentity.wizard.IPSDEWizardForm psdewizardform){
		this.psdewizardform = psdewizardform;
	}


	public java.lang.Boolean isEnableAutoSave(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEAUTOSAVE);
		if(value == null){
			return null;
		}
		return value.asBoolean();
	}
}
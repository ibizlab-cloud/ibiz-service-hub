package net.ibizsys.model.control.wizardpanel;



public class PSDEStateWizardPanelImpl extends net.ibizsys.model.control.wizardpanel.PSDEWizardPanelImpl implements net.ibizsys.model.control.wizardpanel.IPSDEStateWizardPanel{

	public final static String ATTR_ISSHOWACTIONBAR = "showActionBar";

	@Deprecated
	public boolean isShowActionBar(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSHOWACTIONBAR);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}
package net.ibizsys.model.util.transpiler.control.wizardpanel;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.wizardpanel.PSDEWizardPanelImpl.*;



public class PSDEWizardPanelTranspiler extends net.ibizsys.model.util.transpiler.control.PSAjaxControlContainerTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.wizardpanel.PSDEWizardPanelImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.wizardpanel.PSDEWizardPanelImpl realPSModelObject = (net.ibizsys.model.control.wizardpanel.PSDEWizardPanelImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "psdewizardid", realPSModelObject.getPSDEWizard(), realPSModelObject, "getPSDEWizard");
		this.setDomainValue(iPSModelTranspileContext, domain, "statepsdefid", realPSModelObject.getStatePSAppDEField(), realPSModelObject, "getStatePSAppDEField");
		this.setDomainValue(iPSModelTranspileContext, domain, "wizardstyle", realPSModelObject.getWizardStyle(), realPSModelObject, "getWizardStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "ctrlparam5", realPSModelObject.isShowActionBar(), realPSModelObject, "isShowActionBar");
		this.setDomainValue(iPSModelTranspileContext, domain, "ctrlparam6", realPSModelObject.isShowStepBar(), realPSModelObject, "isShowStepBar");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDEWIZARD, domain, "psdewizardid", net.ibizsys.model.dataentity.wizard.IPSDEWizard.class, true);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSTATEPSAPPDEFIELD, domain, "statepsdefid", net.ibizsys.model.app.dataentity.IPSAppDEField.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETWIZARDSTYLE, domain, "wizardstyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSHOWACTIONBAR, domain, "ctrlparam5", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISSHOWSTEPBAR, domain, "ctrlparam6", boolean.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}
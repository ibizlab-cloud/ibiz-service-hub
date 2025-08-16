package net.ibizsys.model.util.transpiler.control.wizardpanel;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.wizardpanel.PSDEStateWizardPanelParamImpl.*;



public class PSDEStateWizardPanelParamTranspiler extends net.ibizsys.model.util.transpiler.control.wizardpanel.PSDEWizardPanelParamTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.wizardpanel.PSDEStateWizardPanelParamImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.wizardpanel.PSDEStateWizardPanelParamImpl realPSModelObject = (net.ibizsys.model.control.wizardpanel.PSDEStateWizardPanelParamImpl)iPSModelObject;
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}
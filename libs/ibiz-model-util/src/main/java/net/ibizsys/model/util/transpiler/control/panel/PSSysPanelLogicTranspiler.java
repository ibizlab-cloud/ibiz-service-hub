package net.ibizsys.model.util.transpiler.control.panel;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.panel.PSSysPanelLogicImpl.*;



public class PSSysPanelLogicTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.panel.PSSysPanelLogicImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.panel.PSSysPanelLogicImpl realPSModelObject = (net.ibizsys.model.control.panel.PSSysPanelLogicImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeuiactionid", realPSModelObject.getPSAppDEUIAction(), realPSModelObject, "getPSAppDEUIAction");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyspfpluginid", realPSModelObject.getPSSysPFPlugin(), realPSModelObject, "getPSSysPFPlugin");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPDEUIACTION, domain, "psdeuiactionid", net.ibizsys.model.app.dataentity.IPSAppDEUIAction.class, true);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSPFPLUGIN, domain, "pssyspfpluginid", net.ibizsys.model.res.IPSSysPFPlugin.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}
package net.ibizsys.model.util.transpiler.control.grid;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.grid.PSDEMultiEditViewPanelImpl.*;



public class PSDEMultiEditViewPanelTranspiler extends net.ibizsys.model.util.transpiler.control.grid.PSDEGridTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.grid.PSDEMultiEditViewPanelImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.grid.PSDEMultiEditViewPanelImpl realPSModelObject = (net.ibizsys.model.control.grid.PSDEMultiEditViewPanelImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeviewid", realPSModelObject.getEmbeddedPSAppView(), realPSModelObject, "getEmbeddedPSAppView");
		this.setDomainValue(iPSModelTranspileContext, domain, "ctrlparam", realPSModelObject.getPanelStyle(), realPSModelObject, "getPanelStyle");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETEMBEDDEDPSAPPVIEW, domain, "psdeviewid", net.ibizsys.model.app.view.IPSAppView.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPANELSTYLE, domain, "ctrlparam", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}
package net.ibizsys.model.util.transpiler.control.panel;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.panel.PSSysPanelImpl.*;



public class PSSysPanelTranspiler extends net.ibizsys.model.util.transpiler.control.PSControlContainerTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.panel.PSSysPanelImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.panel.PSSysPanelImpl realPSModelObject = (net.ibizsys.model.control.panel.PSSysPanelImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "layoutmode", realPSModelObject.getLayoutMode(), realPSModelObject, "getLayoutMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "panelstyle", realPSModelObject.getPanelStyle(), realPSModelObject, "getPanelStyle");
		this.setDomainValue(iPSModelTranspileContext, domain, "panelwidth", realPSModelObject.getPanelWidth(), realPSModelObject, "getPanelWidth");
		this.setDomainValue(iPSModelTranspileContext, domain, "viewlayoutflag", realPSModelObject.isLayoutPanel(), realPSModelObject, "isLayoutPanel");
		this.setDomainValue(iPSModelTranspileContext, domain, "mobflag", realPSModelObject.isMobilePanel(), realPSModelObject, "isMobilePanel");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLAYOUTMODE, domain, "layoutmode", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPANELSTYLE, domain, "panelstyle", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPANELWIDTH, domain, "panelwidth", double.class, new String[]{"0.0"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISLAYOUTPANEL, domain, "viewlayoutflag", boolean.class, new String[]{"false"});
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISMOBILEPANEL, domain, "mobflag", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}
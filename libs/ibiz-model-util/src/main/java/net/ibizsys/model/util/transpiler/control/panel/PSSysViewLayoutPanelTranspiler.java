package net.ibizsys.model.util.transpiler.control.panel;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.panel.PSSysViewLayoutPanelImpl.*;



public class PSSysViewLayoutPanelTranspiler extends net.ibizsys.model.util.transpiler.control.panel.PSSysPanelTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.panel.PSSysViewLayoutPanelImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.panel.PSSysViewLayoutPanelImpl realPSModelObject = (net.ibizsys.model.control.panel.PSSysViewLayoutPanelImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "bodyonlyflag", realPSModelObject.isLayoutBodyOnly(), realPSModelObject, "isLayoutBodyOnly");
		this.setDomainValue(iPSModelTranspileContext, domain, "viewlayoutflag", realPSModelObject.isViewProxyMode(), realPSModelObject, "isViewProxyMode");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISLAYOUTBODYONLY, domain, "bodyonlyflag", boolean.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_ISVIEWPROXYMODE, domain, "viewlayoutflag", boolean.class, new String[]{"false"});
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}
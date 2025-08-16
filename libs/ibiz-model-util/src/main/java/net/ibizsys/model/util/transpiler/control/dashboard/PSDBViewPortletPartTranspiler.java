package net.ibizsys.model.util.transpiler.control.dashboard;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.dashboard.PSDBViewPortletPartImpl.*;



public class PSDBViewPortletPartTranspiler extends net.ibizsys.model.util.transpiler.control.dashboard.PSDBSysPortletPartTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.dashboard.PSDBViewPortletPartImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.dashboard.PSDBViewPortletPartImpl realPSModelObject = (net.ibizsys.model.control.dashboard.PSDBViewPortletPartImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "psappviewid", realPSModelObject.getPortletPSAppView(), realPSModelObject, "getPortletPSAppView");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPORTLETPSAPPVIEW, domain, "psappviewid", net.ibizsys.model.app.view.IPSAppView.class, true);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}
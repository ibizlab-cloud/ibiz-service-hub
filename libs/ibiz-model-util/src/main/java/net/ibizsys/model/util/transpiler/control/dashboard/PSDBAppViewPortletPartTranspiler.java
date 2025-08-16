package net.ibizsys.model.util.transpiler.control.dashboard;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.dashboard.PSDBAppViewPortletPartImpl.*;



public class PSDBAppViewPortletPartTranspiler extends net.ibizsys.model.util.transpiler.control.dashboard.PSDBPortletPartTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.dashboard.PSDBAppViewPortletPartImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.dashboard.PSDBAppViewPortletPartImpl realPSModelObject = (net.ibizsys.model.control.dashboard.PSDBAppViewPortletPartImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "psappviewid", realPSModelObject.getPortletPSAppView(), realPSModelObject, "getPortletPSAppView");
		this.setDomainValue(iPSModelTranspileContext, domain, "pvparttype", realPSModelObject.getPortletType(), realPSModelObject, "getPortletType");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPORTLETPSAPPVIEW, domain, "psappviewid", net.ibizsys.model.app.view.IPSAppView.class, true);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPORTLETTYPE, domain, "pvparttype", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}
package net.ibizsys.model.util.transpiler.control.dashboard;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.control.dashboard.PSDBAppMenuPortletPartImpl.*;



public class PSDBAppMenuPortletPartTranspiler extends net.ibizsys.model.util.transpiler.control.dashboard.PSDBPortletPartTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.control.dashboard.PSDBAppMenuPortletPartImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.control.dashboard.PSDBAppMenuPortletPartImpl realPSModelObject = (net.ibizsys.model.control.dashboard.PSDBAppMenuPortletPartImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "psappmenuid", realPSModelObject.getContentPSControl(), realPSModelObject, "getContentPSControl");
		this.setDomainValue(iPSModelTranspileContext, domain, "pvparttype", realPSModelObject.getPortletType(), realPSModelObject, "getPortletType");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETCONTENTPSCONTROL, domain, "psappmenuid", net.ibizsys.model.control.IPSControl.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPORTLETTYPE, domain, "pvparttype", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}
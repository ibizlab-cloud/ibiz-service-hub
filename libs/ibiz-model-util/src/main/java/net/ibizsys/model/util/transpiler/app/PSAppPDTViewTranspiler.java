package net.ibizsys.model.util.transpiler.app;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.app.PSAppPDTViewImpl.*;



public class PSAppPDTViewTranspiler extends net.ibizsys.model.util.transpiler.app.PSApplicationObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.app.PSAppPDTViewImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.app.PSAppPDTViewImpl realPSModelObject = (net.ibizsys.model.app.PSAppPDTViewImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "psappviewid", realPSModelObject.getPSAppView(), realPSModelObject, "getPSAppView");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssyspdtviewid", realPSModelObject.getPSSysPDTView(), realPSModelObject, "getPSSysPDTView");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPVIEW, domain, "psappviewid", net.ibizsys.model.app.view.IPSAppView.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSPDTVIEW, domain, "pssyspdtviewid", net.ibizsys.model.res.IPSSysPDTView.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}
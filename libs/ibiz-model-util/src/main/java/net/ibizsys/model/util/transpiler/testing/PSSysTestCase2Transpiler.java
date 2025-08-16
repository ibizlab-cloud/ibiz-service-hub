package net.ibizsys.model.util.transpiler.testing;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.testing.PSSysTestCase2Impl.*;



public class PSSysTestCase2Transpiler extends net.ibizsys.model.util.transpiler.testing.PSSysTestCaseTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.testing.PSSysTestCase2Impl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.testing.PSSysTestCase2Impl realPSModelObject = (net.ibizsys.model.testing.PSSysTestCase2Impl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "psappviewid", realPSModelObject.getPSAppView(), realPSModelObject, "getPSAppView");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdeserviceapiid", realPSModelObject.getPSDEServiceAPI(), realPSModelObject, "getPSDEServiceAPI");
		this.setDomainValue(iPSModelTranspileContext, domain, "psdesadetailid", realPSModelObject.getPSDEServiceAPIMethod(), realPSModelObject, "getPSDEServiceAPIMethod");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssystestmoduleid", realPSModelObject.getPSSysTestModule(), realPSModelObject, "getPSSysTestModule");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssystestprjid", realPSModelObject.getPSSysTestPrj(), realPSModelObject, "getPSSysTestPrj");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPVIEW, domain, "psappviewid", net.ibizsys.model.app.view.IPSAppView.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDESERVICEAPI, domain, "psdeserviceapiid", net.ibizsys.model.dataentity.service.IPSDEServiceAPI.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSDESERVICEAPIMETHOD, domain, "psdesadetailid", net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSTESTMODULE, domain, "pssystestmoduleid", net.ibizsys.model.testing.IPSSysTestModule.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSTESTPRJ, domain, "pssystestprjid", net.ibizsys.model.testing.IPSSysTestPrj.class, false);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}
package net.ibizsys.model.util.transpiler.testing;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.testing.PSSysTestPrjImpl.*;



public class PSSysTestPrjTranspiler extends net.ibizsys.model.util.transpiler.PSModelTranspilerBase{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.testing.PSSysTestPrjImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.testing.PSSysTestPrjImpl realPSModelObject = (net.ibizsys.model.testing.PSSysTestPrjImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysappid", realPSModelObject.getPSApplication(), realPSModelObject, "getPSApplication");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysserviceapiid", realPSModelObject.getPSSysServiceAPI(), realPSModelObject, "getPSSysServiceAPI");
		this.setDomainValue(iPSModelTranspileContext, domain, "prjtag", realPSModelObject.getPrjTag(), realPSModelObject, "getPrjTag");
		this.setDomainValue(iPSModelTranspileContext, domain, "prjtag2", realPSModelObject.getPrjTag2(), realPSModelObject, "getPrjTag2");
		this.setDomainValue(iPSModelTranspileContext, domain, "prjtype", realPSModelObject.getPrjType(), realPSModelObject, "getPrjType");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSAPPLICATION, domain, "pssysappid", net.ibizsys.model.app.IPSApplication.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSSERVICEAPI, domain, "pssysserviceapiid", net.ibizsys.model.service.IPSSysServiceAPI.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPRJTAG, domain, "prjtag", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPRJTAG2, domain, "prjtag2", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPRJTYPE, domain, "prjtype", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}
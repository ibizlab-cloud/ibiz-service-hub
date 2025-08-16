package net.ibizsys.model.util.transpiler.dataentity.service;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.util.transpiler.IPSModelListTranspiler;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.util.IPSModel;
import static net.ibizsys.model.dataentity.service.PSDEServiceAPIImpl.*;



public class PSDEServiceAPITranspiler extends net.ibizsys.model.util.transpiler.dataentity.PSDataEntityObjectTranspiler{

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(!(iPSModelObject instanceof net.ibizsys.model.dataentity.service.PSDEServiceAPIImpl)){
			super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			return;
			
		}
		net.ibizsys.model.dataentity.service.PSDEServiceAPIImpl realPSModelObject = (net.ibizsys.model.dataentity.service.PSDEServiceAPIImpl)iPSModelObject;
		this.setDomainValue(iPSModelTranspileContext, domain, "majorflag", realPSModelObject.getAPIMode(), realPSModelObject, "getAPIMode");
		this.setDomainValue(iPSModelTranspileContext, domain, "logicname", realPSModelObject.getLogicName(), realPSModelObject, "getLogicName");
		this.setDomainValue(iPSModelTranspileContext, domain, "outpssystranslatorid", realPSModelObject.getOutPSSysTranslator(), realPSModelObject, "getOutPSSysTranslator");
		this.setDomainValue(iPSModelTranspileContext, domain, "pssysuniresid", realPSModelObject.getPSSysUniRes(), realPSModelObject, "getPSSysUniRes");
		this.setDomainValue(iPSModelTranspileContext, domain, "serviceparam", realPSModelObject.getServiceParam(), realPSModelObject, "getServiceParam");
		this.setDomainValue(iPSModelTranspileContext, domain, "serviceparam2", realPSModelObject.getServiceParam2(), realPSModelObject, "getServiceParam2");
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETAPIMODE, domain, "majorflag", int.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETLOGICNAME, domain, "logicname", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETOUTPSSYSTRANSLATOR, domain, "outpssystranslatorid", net.ibizsys.model.res.IPSSysTranslator.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETPSSYSUNIRES, domain, "pssysuniresid", net.ibizsys.model.security.IPSSysUniRes.class, false);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICEPARAM, domain, "serviceparam", java.lang.String.class);
		this.setModelValue(iPSModelTranspileContext, objectNode, ATTR_GETSERVICEPARAM2, domain, "serviceparam2", java.lang.String.class);
		super.onCompile(iPSModelTranspileContext, domain, objectNode);
	}
}